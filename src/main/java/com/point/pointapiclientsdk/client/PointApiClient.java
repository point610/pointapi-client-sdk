package com.point.pointapiclientsdk.client;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.json.JSONUtil;
import com.point.pointapiclientsdk.utils.HeaderUtils;

/**
 * @ClassName PointApiClient
 * @Description 发送网络请求的java类
 * @Author point
 * @Date 2023/7/26 13:03
 * @Version 1.0
 */
public class PointApiClient {
    public final static String GATEWAY_PATH = "http://43.138.196.192:8080/api";

    private String accessKey;

    private String secretKey;

    public PointApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    /**
     * 一个用于获取朋友圈文案的接口。通过该接口，用户可以获得随机生成的朋友圈文案，包括情感、生活、旅行等主题，用于分享朋友圈内容、表达心情或与朋友互动。
     *
     * @return java.lang.String
     * @Author point
     * @Date 14:12 2023/8/22
     **/
    public String getRandomPyqPost() {
        // 将用于请求的对象装换为json
        String json = JSONUtil.toJsonStr("");

        HttpResponse response = HttpRequest.post(GATEWAY_PATH + "/pyqpost/getrandom")
                .addHeaders(HeaderUtils.getHeaderMap(json, accessKey, secretKey))
                .body(json)
                .execute();

        // 得到请求的返回结果
        String result = response.body();

        // 将结果返回
        return result;
    }

    /**
     * 一个用于获取随机心灵鸡汤的接口。通过该接口，用户可以获得随机的励志、激励和积极向上的名言和格言，以提升情绪、鼓舞士气和增加正能量。
     *
     * @return java.lang.String
     * @Author point
     * @Date 14:19 2023/8/22
     **/
    public String getRandomChickenSoup() {
        // 将用于请求的对象装换为json
        String json = JSONUtil.toJsonStr("");

        HttpResponse response = HttpRequest.post(GATEWAY_PATH + "/chickensoup/getrandom")
                .addHeaders(HeaderUtils.getHeaderMap(json, accessKey, secretKey))
                .body(json)
                .execute();

        // 得到请求的返回结果
        String result = response.body();

        // 将结果返回
        return result;
    }

    /**
     * 一个用于获取随机中文名的接口。通过该接口，用户可以获得随机生成的中文姓名，用于测试、模拟数据或其他需要随机中文名的场景。
     *
     * @return java.lang.String
     * @Author point
     * @Date 14:19 2023/8/22
     **/
    public String getRandomChineseName() {
        // 将用于请求的对象装换为json
        String json = JSONUtil.toJsonStr("");

        HttpResponse response = HttpRequest.post(GATEWAY_PATH + "/cnname/getrandom")
                .addHeaders(HeaderUtils.getHeaderMap(json, accessKey, secretKey))
                .body(json)
                .execute();

        // 得到请求的返回结果
        String result = response.body();

        // 将结果返回
        return result;
    }

    /**
     * 一个用于获取随机表情包的接口。该接口提供了一种简单的方法来获取随机的表情包图像或表情代码，以增加应用程序、网站或聊天平台的趣味性和交互性。
     *
     * @return java.lang.String
     * @Author point
     * @Date 14:20 2023/8/22
     **/
    public String getRandomEmoticonUrl() {
        // 将用于请求的对象装换为json
        String json = JSONUtil.toJsonStr("");

        HttpResponse response = HttpRequest.post(GATEWAY_PATH + "/emoticon/getrandom")
                .addHeaders(HeaderUtils.getHeaderMap(json, accessKey, secretKey))
                .body(json)
                .execute();

        // 得到请求的返回结果
        String result = response.body();

        // 将结果返回
        return result;
    }

    /**
     * 一个用于获取随机图片的接口。通过该接口，用户可以获得随机选择的图片，用于美化界面、填充内容或其他需要随机图片的应用场景。
     *
     * @return java.lang.String
     * @Author point
     * @Date 14:20 2023/8/22
     **/
    public String getRandomImageUrl() {
        // 将用于请求的对象装换为json
        String json = JSONUtil.toJsonStr("");

        HttpResponse response = HttpRequest.post(GATEWAY_PATH + "/image/getrandom")
                .addHeaders(HeaderUtils.getHeaderMap(json, accessKey, secretKey))
                .body(json)
                .execute();

        // 得到请求的返回结果
        String result = response.body();

        // 将结果返回
        return result;
    }

    /**
     * 一个用于获取随机搞笑段子的接口。通过该接口，用户可以获得随机选择的搞笑段子，用于增加娱乐性、轻松氛围和幽默感。
     *
     * @return java.lang.String
     * @Author point
     * @Date 14:20 2023/8/22
     **/
    public String getRandomInterestPost() {
        // 将用于请求的对象装换为json
        String json = JSONUtil.toJsonStr("");

        HttpResponse response = HttpRequest.post(GATEWAY_PATH + "/interestpost/getrandom")
                .addHeaders(HeaderUtils.getHeaderMap(json, accessKey, secretKey))
                .body(json)
                .execute();

        // 得到请求的返回结果
        String result = response.body();

        // 将结果返回
        return result;
    }

    /**
     * 一个用于获取随机简介的接口。通过该接口，用户可以获得随机生成的个人或事物简介，用于填充测试数据、展示示例信息或其他需要随机简介的应用场景。
     *
     * @return java.lang.String
     * @Author point
     * @Date 14:20 2023/8/22
     **/
    public String getRandomProfile() {
        // 将用于请求的对象装换为json
        String json = JSONUtil.toJsonStr("");

        HttpResponse response = HttpRequest.post(GATEWAY_PATH + "/profile/getrandom")
                .addHeaders(HeaderUtils.getHeaderMap(json, accessKey, secretKey))
                .body(json)
                .execute();

        // 得到请求的返回结果
        String result = response.body();

        // 将结果返回
        return result;
    }

    /**
     * 一个用于获取 KFC 文案的接口。通过该接口，用户可以获得随机生成的 KFC 相关文案，包括广告口号、促销标语等，用于营销、创意设计或其他与 KFC 相关的应用场景。
     *
     * @return java.lang.String
     * @Author point
     * @Date 14:20 2023/8/22
     **/
    public String getRandomKFCCopywriting() {
        // 将用于请求的对象装换为json
        String json = JSONUtil.toJsonStr("");

        HttpResponse response = HttpRequest.post(GATEWAY_PATH + "/kfccw/getrandom")
                .addHeaders(HeaderUtils.getHeaderMap(json, accessKey, secretKey))
                .body(json)
                .execute();

        // 得到请求的返回结果
        String result = response.body();

        // 将结果返回
        return result;
    }

}
