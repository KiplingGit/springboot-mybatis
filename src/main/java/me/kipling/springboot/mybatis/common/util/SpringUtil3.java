package me.kipling.springboot.mybatis.common.util;

import org.springframework.context.ApplicationContext;

//@Component  在不可扫描区域，且不需要注入，作为一个普通的util类

/*
 * 通过实验，这种方法不行
 */
public class SpringUtil3{

    private static ApplicationContext applicationContext = null;

    public static void setApplicationContext(ApplicationContext applicationContext){
        if(SpringUtil3.applicationContext == null){
        	SpringUtil3.applicationContext  = applicationContext;
        }

        System.out.println("---------------me.kipling.springboot.mybatis.common.util.SpringUtil3333------------------------------------------------------");

    }

    //获取applicationContext
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    //通过name获取 Bean.
    public static Object getBean(String name){
        return getApplicationContext().getBean(name);

    }

    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }

}
