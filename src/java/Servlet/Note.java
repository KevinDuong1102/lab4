package Servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Note extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
//        File file = new File(path);
//        Scanner readFile = new Scanner(file);

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String title = br.readLine();
        String content = br.readLine();
        
        request.setAttribute("title", title);
        request.setAttribute("content", content);
        br.close();
        
//        getServletContext().getRequestDispatcher("/WEB-INF/ViewNote.jsp").forward(request, response);
        if(request.getParameter("edit") == null){
            getServletContext().getRequestDispatcher("/WEB-INF/ViewNote.jsp").forward(request, response);
            return;
        }else {
            getServletContext().getRequestDispatcher("/WEB-INF/EditNote.jsp").forward(request, response);
            return;

        }
        
     
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
//        File file = new File(path);
//        PrintWriter pw = new PrintWriter(file);
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        System.out.println(title);
        System.out.println(content);
        
        pw.write(title);
        pw.write(System.getProperty("line.separator"));
        pw.write (content);
        
        request.setAttribute("title", title);
        request.setAttribute("content",content);
        br.close();
        pw.close();
        getServletContext().getRequestDispatcher("/WEB-INF/ViewNote.jsp").forward(request, response);
        

        

       
        
        return;
    }

}
