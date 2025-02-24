<<<<<<< HEAD
package br.com.deresende.controller;

import br.com.deresende.dao.CursoDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ListaCursosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        CursoDAO dao = new CursoDAO();
        request.setAttribute("cursos", dao.listarTodos());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/ranking.jsp");
        dispatcher.forward(request, response);
    }
=======
package br.com.deresende.controller;

import br.com.deresende.dao.CursoDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ListaCursosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        CursoDAO dao = new CursoDAO();
        request.setAttribute("cursos", dao.listarTodos());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/ranking.jsp");
        dispatcher.forward(request, response);
    }
>>>>>>> 25ecb72d8c1ae08f09e42e694df6eed168d670c4
}