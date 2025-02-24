<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ranking de Cursos</title>
</head>
<body>
    <h1>Ranking de Cursos</h1>
    <table border="1">
        <tr>
            <th>Curso</th>
            <th>Faculdade</th>
            <th>Nota Geral</th>
        </tr>
        <c:forEach items="${cursos}" var="curso">
            <tr>
                <td>${curso.nome}</td>
                <td>${curso.faculdade}</td>
                <td>${curso.notaGeral}</td>
            </tr>
        </c:forEach>
    </table>

    <a href="avaliar.jsp"><button>Avaliar Curso</button></a>
</body>
=======
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ranking de Cursos</title>
</head>
<body>
    <h1>Ranking de Cursos</h1>
    <table border="1">
        <tr>
            <th>Curso</th>
            <th>Faculdade</th>
            <th>Nota Geral</th>
        </tr>
        <c:forEach items="${cursos}" var="curso">
            <tr>
                <td>${curso.nome}</td>
                <td>${curso.faculdade}</td>
                <td>${curso.notaGeral}</td>
            </tr>
        </c:forEach>
    </table>

    <a href="avaliar.jsp"><button>Avaliar Curso</button></a>
</body>
>>>>>>> 25ecb72d8c1ae08f09e42e694df6eed168d670c4
</html>