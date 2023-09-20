package com.example.community.util;

/**
 * 获取key的工具
 */
public class RedisKeyUtil {

    private static final String SPLIT = ":";
    private static final String PREFIX_ENTITY_LIKE = "like:entity";
    private static final String PREFIX_USER_LIKE = "like:user";
    private static final String PREFIX_FOLLOWEE = "followee";
    private static final String PREFIX_FOLLOWER = "follower";
    private static final String PREFIX_KAPTCHA = "kaptcha";
    private static final String PREFIX_TICKET =  "ticket";
    private static final String PREFIX_USER = "user";

    private static final String PREFIX_UV = "uv";

    private static final String PREFIX_DAU = "dau";

    // like:entity:entityType:entityId
    public static String getEntityLikeKey(int entityType, int entityId){
        return PREFIX_ENTITY_LIKE + SPLIT + entityType + SPLIT + entityId;
    }

    // like:user:userId
    public static String getUserLikeKey(int userId){
        return PREFIX_USER_LIKE + SPLIT + userId;
    }

    // followee:userId:entityType
    public static String getFolloweeKey(int userId, int entityType){
        return PREFIX_FOLLOWEE + SPLIT + userId + SPLIT + entityType;
    }

    // follower:entityType:entityId
    public static String getFollowerKey(int entityType, int entityId){
        return PREFIX_FOLLOWER + SPLIT + entityType + SPLIT + entityId;
    }

    // 登录验证码
    public static String getKaptchaKey(String owner){
        return PREFIX_KAPTCHA + SPLIT + owner;
    }

    public static String getTicketKey(String ticket){
        return PREFIX_TICKET + SPLIT + ticket;
    }

    public static String getUserKey(int userId){

        return PREFIX_USER + SPLIT + userId;
    }

    //单日UV
    public static String getUVKey(String date){
        return PREFIX_UV + SPLIT + date;
    }

    //区间UV
    public static String getUVKey(String startDate, String endDate){
        return PREFIX_UV + SPLIT + startDate + SPLIT + endDate;
    }

    //单日活跃用户
    public static String getDAUKey(String date){
        return PREFIX_DAU + SPLIT + date;
    }

    //区间活跃用户
    public static String getDAUKey(String startDate, String endDate){
        return PREFIX_DAU + SPLIT + startDate + SPLIT + endDate;
    }

}
