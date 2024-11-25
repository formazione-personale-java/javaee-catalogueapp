package it.cws.catalogueweb.servlets.user;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "user",value = "/users")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  super.doGet(req, resp);
        req.setAttribute("pageTitle","user");
        String action=req.getServletPath();
        req.setAttribute("path",action);
        RequestDispatcher dispatcher=req.getRequestDispatcher("views/user/index.jsp");
        dispatcher.forward(req,resp);
       // String action=req.getServletPath();
        try {
            switch (action){
                case "/new":
                  showNewForm(req,resp);
                  break;
                case "/edit":
                  showEditForm(req,resp);
                  break;
                case "/delete":
                    deleteUser(req, resp);
                    break;
                case "/update" :
                    updateUser(req, resp);
                    break;
                default:
                   listUser(req, resp);
                   break;
            }
        }catch (Exception exception){

        }
    }
    private void showNewForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher= request.getRequestDispatcher("views/user/userForm.jsp");
        dispatcher.forward(request,response);

    }
    private void showEditForm(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Form edition </h1>");
        out.println("</body></html>");
    }
    private void updateUser(HttpServletRequest request,HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Form update </h1>");
        out.println("</body></html>");
    }
    private void deleteUser(HttpServletRequest request,HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Form delete </h1>");
        out.println("</body></html>");
    }
    private void listUser(HttpServletRequest request,HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Form list </h1>");
        out.println("</body></html>");
    }
}
