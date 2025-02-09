package br.com.deresende.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/salvarAvaliacao")
public class AvaliacaoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recebe os parâmetros do formulário
        String curso = request.getParameter("curso");
        String faculdade = request.getParameter("faculdade");
        String notaProfessores = request.getParameter("notaProfessores");
        String polo = request.getParameter("polo");
        String qualidadeEnsino = request.getParameter("qualidadeEnsino");
        String custoMensalidade = request.getParameter("custoMensalidade");

        // Aqui você pode implementar a lógica para salvar os dados,
        // por exemplo, em um banco de dados ou em uma lista em memória.

        // Redireciona para a página inicial (ou exibe uma mensagem de sucesso)
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }
}
