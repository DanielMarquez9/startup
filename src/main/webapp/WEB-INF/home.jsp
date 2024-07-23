<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1>Listado de Proveedores</h1>
    <form action="ListarProveedoresServlet" method="post">
        <input type="submit" value="Mostrar Proveedores">
    </form>
    <div>
        <!-- Aquí se mostrará la tabla de proveedores -->
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Vehículo</th>
            </tr>
            <c:forEach var="proveedor" items="${proveedores}">
                <tr>
                    <td>${proveedor.id}</td>
                    <td>${proveedor.nombre}</td>
                    <td>${proveedor.vehiculo}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
