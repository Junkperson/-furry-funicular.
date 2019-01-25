package com.market.fly.core.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mason on 2019/1/25
 */
public class CamelAndlineUtils {
    public static void main(String[] args) {
//        String str = "{'user_name':'ok','user_sex':0,object_info':{'business_code':'0001','object_info2':{'object_1':'ok'}}}";
//        String strs[] = str.split(":");
//        /*for (String is : strs) {
//            System.out.println(is);
//        }*/
//        StringBuilder sb = new StringBuilder();
//        for (String o : strs) {
//            String _tmp[]  = o.split(",");
//            if(_tmp.length > 1){
//                //替换数组2的值为驼峰
//                sb.append(_tmp[0]).append(",").append(underlineToCamel2(_tmp[1]));
//            }else{
//                //替换''里的数值为驼峰
//                sb.append(underlineToCamel2(_tmp[0]));
//            }
//
//            sb.append(":");
//        }
//
//        String str2 = "{'userName':'ok','userSex':0,objectInfo':{'businessCode':'0001','objectInfo2':{'object1':'ok'}}}";
//        String strs2[] = str2.split(":");
//        /*for (String is : strs) {
//            System.out.println(is);
//        }*/
//        StringBuilder sb2 = new StringBuilder();
//        for (String o : strs) {
//            String _tmp[]  = o.split(",");
//            if(_tmp.length > 1){
//                //替换数组2的值为驼峰
//                sb2.append(_tmp[0]).append(",").append(camelToUnderline(_tmp[1]));
//            }else{
//                //替换''里的数值为驼峰
//                sb2.append(camelToUnderline(_tmp[0]));
//            }
//
//            sb2.append(":");
//        }
//        System.out.println(sb.substring(0,sb.length() - 1).toString());
//        System.out.println(sb2.substring(0,sb2.length() - 1).toString());

        Map mymap = new HashMap<>();
        mymap.put("userName", "zhangsan");
        mymap.put("USER_ID", "zhangsan");
        mymap.put("USER_AGE", "zhangsan");
        mymap.put("USER_HHHH", "zhangsan");
        mymap.put("USER_NAEE", "zhangsan");
        Map replaceKeyLow = new HashMap<>();
        replaceKeyLow = toReplaceKeyLow(mymap);
        replaceKeyLow = null;
    }


    public static final char UNDERLINE='_';
    public static String camelToUnderline(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=param.charAt(i);
            if (Character.isUpperCase(c)){
                sb.append(UNDERLINE);
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static String underlineToCamel(String param){
        param = param.toLowerCase();
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=param.charAt(i);
            if (c==UNDERLINE){
                if (++i<len){
                    sb.append(Character.toUpperCase(param.charAt(i)));
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static String underlineToCamel2(String param){
        param = param.toLowerCase();
        if (param==null||"".equals(param.trim())){
            return "";
        }
        StringBuilder sb=new StringBuilder(param);
        Matcher mc= Pattern.compile("_").matcher(param);
        int i=0;
        while (mc.find()){
            int position=mc.end()-(i++);
            //String.valueOf(Character.toUpperCase(sb.charAt(position)));
            sb.replace(position-1,position+1,sb.substring(position,position+1).toUpperCase());
        }
        return sb.toString();
    }
    public static Map<String, Object> toReplaceKeyLow(Map<String, Object> map) {
        Map re_map = new HashMap();
        if(re_map != null) {
            Iterator var2 = map.entrySet().iterator();

            while(var2.hasNext()) {
                Map.Entry<String, Object> entry = (Map.Entry)var2.next();
                re_map.put(underlineToCamel2((String)entry.getKey()), map.get(entry.getKey()));
            }

            map.clear();
        }

        return re_map;
    }
}