package com.f19t.searchobject.searchobject.rule;

/**
 * author: f19t
 * Date: 2023/3/3 15:51
 */
public class judge_list {

    public static boolean is_list(String s) {
        boolean b = false;
        if ("List".equals(s) || "ArrayList".equals(s)){
            b = true;
            return b;
        }


        return b;


    }
}
