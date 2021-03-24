package ge.edu.btu.sandro.shanshiashvili.regform;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        String gender = req.getParameter("gender");
        String age = req.getParameter("age");

        System.out.println(
                "name: " + name + "\n" +
                        "breed: " + breed + "\n" +
                        "gender: " + gender + "\n" +
                        "age: " + age + "\n");
    }
}