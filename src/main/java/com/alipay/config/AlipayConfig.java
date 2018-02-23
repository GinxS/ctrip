package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016091200495717";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCOFMGfPW9vcq"
    										  + "IEWWMt3m/s8ASPFYQ05akrSFexxHfTJKN+jzq5F9yDhv0MGjrAYjvFbv0j9V5W"
    										  + "eOV4PCcqFSRl+b72/3Fye5sVQoTSj+ey2Wc7HkcKRtVAai8jwMiQh8lFT2lkHS"
    										  + "OD5WOSyDBISkWP2IMMb6IoiTwe+TG1sUNxoe0KStcKsS4mgqpidwNCkvJxKng5"
    										  + "aD+Kfy5y9IZNA1O1ETmDiiGA9exl838bCbXAbtVozgn+2zrgjHmVrKI0Phedel"
    										  + "WYScUJEE57IXvAKxfwpDllsbVGHKKPIcUJdQj9cYbJdZbGkAvu028hUZ2xxzSo"
    										  + "N97iE5Ib4RwwY+PAwJ+TAgMBAAECggEAcBXVzX7Uy1HemJm/0S66k2uh3RL3Uh"
    										  + "efhkKy082PTeWIiU4K4Hv/fU9fj02d7alRR+bQEq7+Ni93r4ucxekZ5szIJujL"
    										  + "oan7ZSEt0UKvYXt6obu4BVZt4zwhZg4u6z4DvQbxuIX4P5QWInSFCnJ1QA5pC8"
    										  + "WBYoMpB7JE0fY+o4QPA4fS+fdJljeF+OYcRjuRjxL+tK9j0Gdi+BAbTfw7bWlk"
    										  + "E79FRR/Dm6DOsf7LALyzGQO92XJv6Ru1YkUDhN33V6BkyYJ7IxFU9MkFWBEyQ7"
    										  + "bczEek3FBGjwfMtX2ivoCvj3e/xNxRsX2Qoj3l1Mh89kn14NVH5er2CNNnl28u"
    										  + "sQKBgQDeyTHITAWiPnM+pp55elxYdWZz84TpTcIbe613Gdmd3DLfiTDeBBsYVh"
    										  + "fC08R5ktSeSkqSpnO5IuUeqVxem6vnERbrZ9cyhsJw1ZSfDsL0JxYdvdn2Z7ZP"
    										  + "FswcFIyq4Tz3onWFbEWWNshLwQ+sfknfjP5FrfQpSMrHNwy6/u+cmQKBgQCjQ2"
    										  + "VtgjIOupWtGh4zYDi92WtEJ43rkSvff0+jenzBc0xgngU4jYBxso8ofZJYdXDh"
    										  + "bx7fB6IcjuXs6icWiFPbx6ecRQoqa3cd9jYJOg6UWe/KJcIpPPVw+Ekp362+vS"
    										  + "xN/TzEhDmfMGeLGhx/i3ymgEG7pw1jHUv6LG2pdB4tCwKBgQDH9KJm2LyxuwVq"
    										  + "tNdFxqn9hxl2dpnTYEQYsK+nVx83jTxn31Vp3xuGgzb+WV1dlIiaraky6IyzHP"
    										  + "uxwmYyT9xBHtiIXoIKSmNYLIohHHmj8zTpas2nV7yMTbTSeysp79DtnfWG0/+8"
    										  + "69xoCZaMxih9qalKVu/u4fOGTAV0DH54+QKBgQCDXSszXdrhNwhP6//43qdJOr"
    										  + "OwdxMeRATFJC70Hw5aqWb/JqaUxmZfFYlSzxb9ziExgrOYSRALYn9mjVE+NBsl"
    										  + "cBRRDMwNLcL+fKkl62znuSXTxWXgwIfMijp0UuH940DOz8AhbzLd/5iQuEXN6n"
    										  + "I1lmVNlDCVW3FSroTeH+xX2QKBgQCnwe3MTM7VGyDxJb08bFYtQ3LSD9El1MNN"
    										  + "4fZI+2wU49Vi8RHQES3hIQSdydNvXylQXJotq6oCSKaBXzoSIM0MZ7+e9eCjgk"
    										  + "cwSzBXtQ975O6nWYOV/OfW3vD1XTtu92v+OYvn1z4H1ctcziwOvwDoCcAlPzud"
    										  + "ZBnLz6Qq3EGnDQ==";
    
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7HotZGs3cCBZu+w+CT9n9"
    									   + "bZVdMsxoB7cG0kLqprM0riV7PXhsKVqOT3Abnl/0w/xMv8ipA1Ku5oBVvDbKnsIqk"
    									   + "IuKnmuvC5m9koF7XWLd1ROq5eIjGaT7f/+8diaO4cNOb/17zN7N3tNt9F+J19Sv7F"
    									   + "YLWnOhNIZeNTg15pAlI5K7M/pOpN45Xk1RrD7TAIlgWxeL9GPYEFZQ9SUMGnjoyT5"
    									   + "SgPcEGNiqK1gokpuwguICh8Gi+8AFwcopij9mhGmxZy9NQzbEbKzYlIUaA1+/E/zv"
    									   + "s0DEMDdRVwC79mGCtguwrde3Zf+vVqHyvtHCCnFUIm2KXg0yiMyUvGE9LzEDwIDAQ"
    									   + "AB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 日志记录目录
	public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

