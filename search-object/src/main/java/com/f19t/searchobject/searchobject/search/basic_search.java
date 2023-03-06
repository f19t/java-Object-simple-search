package com.f19t.searchobject.searchobject.search;

import com.f19t.searchobject.searchobject.rule.*;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.RequestFacade;
import org.apache.catalina.connector.Response;
import org.apache.catalina.core.StandardContext;
import org.apache.tomcat.util.threads.TaskThread;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

//import static com.f19t.searchobject.searchobject.search.search.queue;
//import static com.f19t.searchobject.searchobject.search.search.set;

/**
 * author: f19t
 * Date: 2023/3/2 20:29
 */
public class basic_search {
    public basic_search() {
    }

//    public static void basic_search(location lcat) throws ClassNotFoundException {
//
//        Object obj = lcat.obj;
//        String path = lcat.path;
//        Class clazz = Class.forName(lcat.clazz);
//
//
//        try {
////            Class clazz = Class.forName("org.apache.tomcat.util.threads.TaskThread");
//            for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
//
//                Field fields[] = clazz.getDeclaredFields();
//
//                for (int i = 0; i < fields.length; i++) {
//                    fields[i].setAccessible(true);
//                    if (fields[i].get(obj) == null){continue;}
//
//
//                    if (!Black.isblack(fields[i].getType().getName()) && fields[i].get(obj) != null && set.add(fields[i].get(obj))) {
//                        if (judge_map.is_map(fields[i].getType().getSimpleName())) {
//                            Map map = (Map) fields[i].get(obj);
//                            if (map.size() > 0) {
//                                for (int map_num = 0; map_num < map.size(); map_num++) {
//                                    Object map_obj = map.get(map_num);
//                                    if (map_obj != null && set.add(map_obj) && !Black.isblack(map_obj.getClass().getName())) {
//                                        location l = new location(map_obj, map_obj.getClass().getName(), path + "-->" + fields[i].getName() + "[" + map_num + "]"+map_obj.getClass().getName());
////                                        System.out.println(path + "-->" + fields[i].getName() + "[" + map_num + "]");
//                                        queue.offer(l);
//                                    }
//
//                                }
//                            }
//                            continue;
//                        } else if (judge_list.is_list(fields[i].getType().getSimpleName())) {
//                            List list = (List) fields[i].get(obj);
//                            if (list.size() > 0) {
//                                for (int list_num = 0; list_num < list.size(); list_num++) {
//                                    Object list_obj = list.get(list_num);
//                                    if (list_obj != null && set.add(list_obj) && !Black.isblack(list_obj.getClass().getName())) {
//                                        location l = new location(list_obj, list_obj.getClass().getName(), path + "-->" + fields[i].getName() + "[" + list_num + "]"+list_obj.getClass().getName());
////                                        System.out.println(path + "-->" + fields[i].getName() + list_obj.getClass().getName()+"[" + list_num + "]");
//                                        queue.offer(l);
//                                    }
//
//                                }
//                            }
//                            continue;
//                        }
//                        else if (fields[i].getType().isArray()) {
//
////                            Object objarr1 = fields[i].get(obj);
//
//
//
//                            try {
//                                Object[] arrobj = (Object[])fields[i].get(obj);
//                                if (arrobj.length > 0) {
//                                    for (int obj_num = 0; obj_num < arrobj.length; obj_num++) {
//                                        Object arr_obj = arrobj[obj_num];
//                                        if (arr_obj != null && set.add(arr_obj) && !Black.isblack(arr_obj.getClass().getName())) {
//                                            location l = new location(arr_obj, arr_obj.getClass().getName(), path + "-->" + fields[i].getName() + "[" + obj_num + "]"+arr_obj.getClass().getName());
////                                            System.out.println(path + "-->" + fields[i].getClass().getName() + "[" + obj_num + "]");
//                                            queue.offer(l);
//                                        }
//
//                                    }
//                                }
//                            }catch (Throwable e){
////                                System.out.println(fields[i].get(obj));
//                            }
//
//
//
//                            continue;
//                        }
//                            if (target.is_target(fields[i],obj)) {
//                                System.out.println(path+"--->"+fields[i].getName()+"("+fields[i].get(obj).getClass().getName()+")");
//                                RequestFacade reqfd = (RequestFacade) fields[i].get(obj);
//                                Field f = reqfd.getClass().getDeclaredField("request");
//                                f.setAccessible(true);//因为是protected
//                                Request req = (Request) f.get(reqfd);//反射获取值
//                                Field ff = req.getClass().getDeclaredField("response");
//                                ff.setAccessible(true);
//                                Response resp = (Response) ff.get(req);
//                                PrintWriter out = resp.getWriter();
//                                out.println("wwwwww");
//
//
//
//
//
//
//                            }
//                            location l = new location(fields[i].get(obj), fields[i].get(obj).getClass().getName(), path+"--->"+fields[i].getName()+"("+fields[i].get(obj).getClass().getName()+")");
//                            search.queue.offer(l);
////                        System.out.println(path+"--->"+fields[i].getName()+"("+fields[i].get(obj).getClass().getName()+")");
//
//                        }
//                    }
//                }
//            } catch (IllegalAccessException ex) {
//            throw new RuntimeException(ex);
//        } catch (NoSuchFieldException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

}


