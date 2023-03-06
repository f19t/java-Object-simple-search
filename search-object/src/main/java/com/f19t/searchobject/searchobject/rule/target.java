package com.f19t.searchobject.searchobject.rule;

import java.lang.reflect.Field;

import org.apache.catalina.connector.Request;

/**
 * author: f19t
 * Date: 2023/3/3 18:40
 */
public class target {
    public static boolean is_target(Field f,Object o) throws IllegalAccessException, ClassNotFoundException {
        boolean b = false;
        if (
//                f.getName() == "request"
//                || f.get(o).getClass().getName() == "org.apache.catalina.connector.RequestFacade"
//                || f.get(o).getClass().getName() == "org.apache.catalina.connector.Request"
//                || f.get(o).getClass().isAssignableFrom(Class.forName("org.apache.catalina.connector.Request"))
//                || f.get(o).getClass().isAssignableFrom(Class.forName("org.apache.catalina.core.ApplicationHttpRequest"))
                f.get(o).getClass().isAssignableFrom(Class.forName("org.apache.catalina.connector.RequestFacade"))
//                || f.get(o).getClass().isAssignableFrom(Class.forName("org.apache.catalina.connector.RequestFacade"))
//                || f.get(o).getClass().getName() == "org.apache.catalina.core.ApplicationHttpRequest"
//                || f.get(o).getClass().getName() == "org.apache.coyote.Request"
//                || f.get(o).getClass().getSimpleName() == "Request"
//                || f.get(o).getClass().getSimpleName() == "HttpServletRequest"
//                || f.getName() == "req"
                && f.get(o).getClass().getName() !="java.lang.Object"
//                || f.get(o).getClass().getName() == "org.apache.coyote.RequestGroupInfo")

        ){
            return true;
        }

        return b;

    }
}
