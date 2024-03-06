package com.wlw.community.util;


import com.mysql.jdbc.Connection;
import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;


/**
 * @ClassName: EntCoordSyncJob
 * @Description: TODO(这里用一句话描述这个类的作用)
 *
 */
public class EntCoordSyncJob {

    static String AK = "jCI4vQA63obfNb1vluWZM0cNKEF3tVen"; // 百度地图密钥

    private static Connection Conn; // 数据库连接对象

    // 数据库连接地址
    private static String URL = "jdbc:mysql://localhost:3306/community?characterEncoding=utf8&useSSL=false";

    // 数据库的用户名
    private static String UserName = "root";
    // 数据库的密码
    private static String Password = "root";

    /**
     * * @Description: TODO 获取访问数据库的Connection对象
     * @param @return
     * @return Connection 连接数据的对象
     * @author 情绪i
     */
    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            // 加载驱动

            System.out.println("加载驱动成功!!!");
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        try {

            //通过DriverManager类的getConenction方法指定三个参数,连接数据库
            Conn = (Connection) DriverManager.getConnection(URL, UserName, Password);
            System.out.println("连接数据库成功!!!");

            //返回连接对象
            return Conn;

        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        Statement stt;
        ResultSet set = null;
        try {
            // 获取连接
            conn = getConnection();
            if (conn == null) {
                return;
            }
            // 定义sql语句
            String Sql = "select id,addr from hospital1 where id > '13014'";
            // 执行sql语句
            stt = conn.createStatement();
            // 返回结果集
            set = stt.executeQuery(Sql);
            // 获取数据
            while (set.next()) {

                Integer id = set.getInt(1);
                String dom=set.getString(2);
                System.out.println(id);
                System.out.println(dom);
                Connection conn1 = null;
                Statement stt1;
                boolean set1 = false;
                try {
                    // 获取连接
                    conn1 = getConnection();
                    if (conn1 == null) {
                        return;
                    }
                    String coordinate = getCoordinate(dom);
                    // 定义sql语句
                    String Sql1 = "update hospital1 set ip='"+coordinate+"' where id="+String.valueOf(id);
                    // 执行sql语句
                    stt1 = conn1.createStatement();
                    // 返回结果集
                    set1 = stt1.execute(Sql1);
                    // 获取数据
                    System.out.println(set1);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                    // 释放资源
                    try {
                        // set1.close();
                        conn1.close();
                    } catch (Exception e2) {
                        // TODO: handle exception
                    }

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // 释放资源
            try {
                set.close();
                conn.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }

        }

        // String dom = "北京市东城区帅府园1号(东院)/西城区大木仓胡同41号(西院)";
        // String coordinate = getCoordinate(dom);
        // System.out.println("'" + dom + "'的经纬度为：" + coordinate);
        // System.err.println("######同步坐标已达到日配额6000限制，请明天再试！#####");
    }

    // 调用百度地图API根据地址，获取坐标
    public static String getCoordinate(String address) {
        if (address != null && !"".equals(address)) {
            address = address.replaceAll("\\s*", "").replace("#", "栋");
            String url = "http://api.map.baidu.com/geocoding/v3/?address=" + address + "&output=json&ak=" + AK;
            String json = loadJSON(url);
            if (json != null && !"".equals(json)) {
                // JSONObject obj = JSONObject.fromObject(json);
                JSONObject obj= JSONObject.fromObject(json);
                if ("0".equals(obj.getString("status"))) {
                    double lng = obj.getJSONObject("result").getJSONObject("location").getDouble("lng"); // 经度
                    double lat = obj.getJSONObject("result").getJSONObject("location").getDouble("lat"); // 纬度
                    DecimalFormat df = new DecimalFormat("#.######");
                    return df.format(lng) + "," + df.format(lat);
                }
            }
        }
        return null;
    }

    public static String loadJSON(String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream(), "UTF-8"));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {} catch (IOException e) {}
        return json.toString();
    }

    // 来自stackoverflow的MD5计算方法，调用了MessageDigest库函数，并把byte数组结果转换成16进制
    /*
     * public String MD5(String md5) { try { java.security.MessageDigest md = java.security.MessageDigest .getInstance("MD5"); byte[] array = md.digest(md5.getBytes()); StringBuffer sb = new StringBuffer(); for (int i = 0; i < array.length; ++i) { sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100) .substring(1, 3)); } return sb.toString(); } catch (java.security.NoSuchAlgorithmException e) {
     * } return null; }
     */
}