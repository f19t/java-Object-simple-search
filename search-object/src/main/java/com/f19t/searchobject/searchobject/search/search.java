//package com.f19t.searchobject.searchobject.search;
//
//import com.f19t.searchobject.searchobject.rule.location;
//import org.apache.tomcat.util.threads.TaskThread;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Modifier;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Set;
//
///**
// * author: f19t
// * Date: 2023/3/2 16:11
// */
//public class search {
//    static Queue<location> queue = new LinkedList<location>();//队列保证广度优先搜索
//    static Set<Object> set = new HashSet<Object>();//set记录哪些对象被搜索过
//
//
//
//    public static void search() throws ClassNotFoundException {
//        location laco = new location(Thread.currentThread(), "org.apache.tomcat.util.threads.TaskThread","TaskThread");
//        queue.offer(laco);
//        set.add(Thread.currentThread());
//        int i=0;
//        while (queue.size()>0) {
//            i++;
//            basic_search.basic_search(queue.poll());
//        }
//    }
//}
