<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Avaliação do Curso</title>
    <style>
        form {
            width: 50%;
            margin: auto;
        }
        label {
            display: block;
            margin-top: 10px;
        }
        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }
        .btn-submit {
            margin-top: 15px;
            padding: 10px 20px;
            background-color: #2196F3;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .btn-submit:hover {
            background-color: #1976D2;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">Avaliação do Curso</h1>
    <form action="salvarAvaliacao" method="post">
        <label for="curso">Curso:</label>
        <input type="text" id="curso" name="curso" required>

        <label for="faculdade">Faculdade:</label>
        <input type="text" id="faculdade" name="faculdade" required>

        <label for="notaProfessores">Nota para Qualidade dos Professores:</label>
        <input type="number" id="notaProfessores" name="notaProfessores" step="0.1" min="0" max="10" required>

        <label for="polo">Polo:</label>
        <input type="text" id="polo" name="polo" required>

        <label for="qualidadeEnsino">Qualidade de Ensino:</label>
        <input type="number" id="qualidadeEnsino" name="qualidadeEnsino" step="0.1" min="0" max="10" required>

        <label for="custoMensalidade">Custo da Mensalidade:</label>
        <input type="number" id="custoMensalidade" name="custoMensalidade" step="0.01" min="0" required>

        <div style="text-align: center;">
            <button type="submit" class="btn-submit">Salvar Avaliação</button>
        </div>
    </form>
</body>
</html>
