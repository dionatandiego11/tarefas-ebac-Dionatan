<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ranking de Cursos</title>
    <style>
        table {
            width: 80%;
            margin: auto;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ccc;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
        .btn {
            padding: 8px 16px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        .btn:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">Ranking de Cursos</h1>
    <table>
        <tr>
            <th>Curso</th>
            <th>Faculdade</th>
            <th>Nota Geral</th>
        </tr>
        <!-- Exemplo de dados estáticos; substitua por dados dinâmicos conforme necessário -->
        <tr>
            <td>Engenharia de Software</td>
            <td>Universidade X</td>
            <td>8.5</td>
        </tr>
        <tr>
            <td>Sistemas de Informação</td>
            <td>Faculdade Y</td>
            <td>9.0</td>
        </tr>
    </table>
    <div style="text-align: center; margin-top: 20px;">
        <a href="avaliacao.jsp" class="btn">Inserir Avaliação</a>
    </div>
</body>
</html>
