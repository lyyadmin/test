package com.example.test;

import java.lang.reflect.Field;


/**
 * Created by mingwei on 12/2/16.
 */
public class CustomUtils {
 
    public static void getInfo(Class<?> clazz) {
        String name = "";
        String gender = "";
        String profile = "";
        String love = "";
        Field fields[] = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Name.class)) {
                Name arg0 = field.getAnnotation(Name.class);
                name = name + arg0.value();
                System.out.println("name=" + name);
            }else if (field.isAnnotationPresent(Gender.class)) {
                Gender arg0 = field.getAnnotation(Gender.class);
                gender = gender + arg0.gender().toString();
                System.out.println("gender=" + gender);
            }else if (field.isAnnotationPresent(Profile.class)) {
                Profile arg0 = field.getAnnotation(Profile.class);
                profile = "[id=" + arg0.id() + ",height=" + arg0.height() + ",nativePlace=" + arg0.nativePlace() + "]";
                System.out.println("profile=" + profile);
            }else if(field.isAnnotationPresent(Love.class)){
            	Love lv = field.getAnnotation(Love.class);
            	love = love + lv.value();
            	System.out.println("love=" + love);
            }
        }
    }
}
