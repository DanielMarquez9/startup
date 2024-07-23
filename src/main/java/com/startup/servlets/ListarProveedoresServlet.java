package com.startup.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ListarProveedoresServlet")
public class ListarProveedoresServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Verificación del rol del usuario
        String rolUsuario = (String) request.getSession().getAttribute("rol");
        if (!"administrador".equals(rolUsuario)) {
            request.setAttribute("mensajeError", "Error de permisos");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        // Simulación de datos de proveedores desde la base de datos
        List<Proveedor> proveedores = new ArrayList<>();
        proveedores.add(new Proveedor(1, "Proveedor 1", "Vehículo 1"));
        proveedores.add(new Proveedor(2, "Proveedor 2", "Vehículo 2"));
        
        request.setAttribute("proveedores", proveedores);
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
