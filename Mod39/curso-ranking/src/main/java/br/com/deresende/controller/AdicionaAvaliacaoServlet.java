<<<<<<< HEAD
package br.com.deresende.controller;

import br.com.deresende.dao.CursoDAO;
import br.com.deresende.model.Avaliacao;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AdicionaAvaliacaoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setCurso(request.getParameter("curso"));
        avaliacao.setFaculdade(request.getParameter("faculdade"));
        avaliacao.setQualidadeProfessores(Double.parseDouble(request.getParameter("qualidadeProfessores")));
        avaliacao.setPolo(request.getParameter("polo"));
        avaliacao.setQualidadeEnsino(Double.parseDouble(request.getParameter("qualidadeEnsino")));
        avaliacao.setCustoMensalidade(Double.parseDouble(request.getParameter("custoMensalidade")));

        CursoDAO dao = new CursoDAO();
        dao.adicionarAvaliacao(avaliacao);

        response.sendRedirect("ranking");
    }
=======
package br.com.deresende.controller;

import br.com.deresende.dao.CursoDAO;
import br.com.deresende.model.Avaliacao;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AdicionaAvaliacaoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setCurso(request.getParameter("curso"));
        avaliacao.setFaculdade(request.getParameter("faculdade"));
        avaliacao.setQualidadeProfessores(Double.parseDouble(request.getParameter("qualidadeProfessores")));
        avaliacao.setPolo(request.getParameter("polo"));
        avaliacao.setQualidadeEnsino(Double.parseDouble(request.getParameter("qualidadeEnsino")));
        avaliacao.setCustoMensalidade(Double.parseDouble(request.getParameter("custoMensalidade")));

        CursoDAO dao = new CursoDAO();
        dao.adicionarAvaliacao(avaliacao);

        response.sendRedirect("ranking");
    }
>>>>>>> 25ecb72d8c1ae08f09e42e694df6eed168d670c4
}