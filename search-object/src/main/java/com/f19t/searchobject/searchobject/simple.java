package com.f19t.searchobject.searchobject;




import org.apache.tomcat.util.threads.TaskThread;
import org.apache.tomcat.util.net.Acceptor;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import com.f19t.searchobject.searchobject.search_utill;



/**
 * author: f19t
 * Date: 2023/3/2 14:52
 */
@WebServlet("/simple")
public class simple extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            search_utill.search();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
