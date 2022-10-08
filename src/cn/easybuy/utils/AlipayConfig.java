package cn.easybuy.utils;
import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig{
    // ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000121673481";//例：2016082600317257
    // 商户私钥，您的PKCS8格式RSA2私钥
    // 商户私钥！！！！私钥！！！不是公钥！！！
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCDkefAeZ7kqcm9+gb55EZbKQEqs/t8xEBjLXDXWeVHRUzMswofg2gL1Z6/gzS9RmmNtzcno/IqIW7/ooDr3/deZx2MgpNoXXvET5MP0iKPpMiZharkn3tvhjnGQ87wHEnYjGeWBRHB0jFuAgwhGwAcMxtMRbRkXnbQtxO3qFXYWK4VKyuT08uYzRAcAobtnc5lIqX6kb0DHXCDElGkmsmrxb8bYnAZ14tiR984lO6ttVVt/i9b4Cih/+DfocYQBdbv2eShkwt6jLVeycJkxzV81prDhuLwjCCeEcGk3oYfoapWIEM92rmr5qfcDvgESVzqQJEkmh9YuaHAF6INy99XAgMBAAECggEAORx8nPAuKNQK3oxJuu98GtYRy5eU8vO9f0+aS+CZxfYvACw3mLZR09FGt5scqYyHBR0is/JWjDM3G4BOthTiK/hWu0dy9TqfHvfrvlJY7kF5UirTo6oWyrJZIdcNXOzqoTVRQa2xp5C2JCp/WV9/DL6ietlHFMpsiOzvgilwGhjEZ624FkKr3JGsCYJRckPaMGfW4uEvz9ZqZb93IlFM+Gyn7GSbYjXL3OP0sJROU3YlnB/pVKlxeIoZheOm1dkzw9fQMWWrig03ZL3g1HFFpNbNSk5iur1jt3Z2bcDp4RHuDoFmcr6RRfFHL3fJ1GeWUC/3wQ2aYbb5/efBK8HFAQKBgQDKAFobggWGKIcsmfOHPFT8L/wx3Co/Z7QjJ7UF2gjOhpHc9OCaIgyJnn2OR/6eCoFm/rkP8MkhAPb8pbdAUi3+XxoMVpJUaHGj49RBJq2YRjgKHL1a2P36xXGwBuPiCDJdawsknfpZ/Tu4uHMJ91gKsfs7XPzBUuDuv9CPNf2rpQKBgQCmvbA8qwy9hsGiwm7vq1VhJLfPTpDKDWOYQxYybzWx6jo3KY/gRfbwUZ08Tz8SXg0eXDb2oVihYkxmh7EaY7XHmiXkTflBcJ+EytJStyuFZr3KO/3S4Wq9/dMzjxU1ftn/vXHxhVaw2Pm31+JA390RNsZFgCbEZnI5ASA072ReSwKBgBxLiFOqFtQAAU9CEVa0IMNihVUGnfRbtmPmP/kd3XXwa6YjtwJgGpl8VeIEO6ovloiyzYFqHQI+fFpPbCfaWw7yi1eHGOAx8Rkf5K9rl41o6JiiBfQfyRPDbHVXwbv7ofJr+Bec+WB5lE//pj2TJAX7gFGEaPM7hL5sp+4nhezxAoGAEYBxojyWDsK5Sns8J74FLTgsbv8hJYQ4QwAvsUWJDk62o5miN3lAjUMTzQPIbAYhPGGTh1myMuZdfJmblliG+ReOCKPCmQLYS5j6cKI3WD5Lh5G6d8sfaCffZlcLc90Hxtc8wYwsaE2uEIUBg6u7yZXFRABKkWzral5a4hOKpncCgYBe8tb/5d78G1sMai+MdTh0AdANdbiJj3eKGGRJY8WMGyMcHiFhSw6Q+lPrUpdBBh+hPC6oE5oL6fhZUzEDc+3o4XUca6e8TptpN26bPur6A0BGdg+8fcJ0vmuvGJpUJb37Ydu2KRqx5Ejq4k8jW7B8dXwGpP/pAbYZUkBlDMM3Cw==";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
    // 对应APPID下的支付宝公钥。
    //支付宝公钥，记得是支付宝公钥!!!!!!!支付宝公钥
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmaHhF052MiYFk31LFDKBTK5i7E/poeX1uPKOh5wBhzWc6uxXbQF0Q/RCNJlj4eSqODfZmcnWmjiaDIaScrdiH20keea3o2LIs5N7tRTR88WTgpVBZfYue1Ccalr1BD7DYvSRH3YN3SuMBOnkKgFBUvN1QR87SE6LNR1TrrXsp0DcLfaEAioaIkEfe5mpuGutNQEsa9vn5rRHmPbOXCYGYqC92152tj/rxqu7Kkpo2WWI62uLSek1kq29t9fFqColhQlAWdokuYwEnWEai+neGnSp12831GkV9iKlQoVYh8stvwBcqg9Jgk5AYWX5K5XcYXA04yX8UxmRlPiE28LqbQIDAQAB";
    // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    /**
     * 返回的时候此页面不会返回到用户页面，只会执行你写到控制器里的地址
     */
    public static String notify_url = "你的服务器地址/项目名称/notify_url";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    /**
     * 此页面是同步返回用户页面，也就是用户支付后看到的页面，上面的notify_url是异步返回商家操作，谢谢
     * 要是看不懂就找度娘，或者多读几遍，或者去看支付宝第三方接口API，不看API直接拿去就用，遇坑不怪别人
     */
    public static String return_url = " 你的服务器地址/项目名称/return_url";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "gbk";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // 日志地址
    public static String log_path = "C:/Users/86152/Desktop/news/pay/log";
    // ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord
     *            要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_"
                    + System.currentTimeMillis() + ".txt");
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