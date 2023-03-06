package com.f19t.searchobject.searchobject.rule;

/**
 * author: f19t
 * Date: 2023/3/3 15:50
 */
public class judge_map {
    private String s;
    public judge_map() {

    }

    public static boolean is_map(String s) {
        boolean b = false;
        if ("Map".equals(s) || "HashMap".equals(s)){
            b = true;
            return b;
        }


        return b;


    }
}
