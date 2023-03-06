package com.f19t.searchobject.searchobject.rule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;

/**
 * author: f19t
 * Date: 2023/3/2 18:14
 */
public class Black {
    public Black() {
    }
    public static boolean isblack(String s) {
        Boolean aBoolean = false;
        List<String> black = new ArrayList<String>(Arrays.asList("java.lang.Byte",
                "java.lang.Short",
                "java.lang.Integer",
                "java.lang.Long",
                "java.lang.Float",
                "java.lang.Boolean",
                "java.lang.String",
                "java.lang.Class",
                "java.lang.Character",

                "java.io.File",
                "byte",
                "short",
                "int",
                "long",
                "double",
                "float",
                "boolean"
        ));

        for (int i = 0; i < black.size(); i++) {
            if (s == black.get(i)) {
                aBoolean = true;
                return aBoolean;
            }
        }
        return aBoolean;
    }
}
