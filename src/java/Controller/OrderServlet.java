
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

public class OrderServlet extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            HttpSession session = request.getSession(false);
            if(session!= null){
                String username = (String)session.getAttribute("username");
                if(username!= null){
                    response.sendRedirect("http://localhost:8080/LanvinF/OrderPlaced.jsp");
                    try{
                        Connection con;
                        Statement st;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineShopping","root","cheshta");
                        st = con.createStatement();
                        st.executeUpdate("truncate table Cart");
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "Please Login First","INVALID", JOptionPane.ERROR_MESSAGE);
                    response.sendRedirect("http://localhost:8080//LanvinF//LoginPage.jsp");
                    session.invalidate();
                }
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Please Login First","INVALID", JOptionPane.ERROR_MESSAGE);
                response.sendRedirect("http://localhost:8080//LanvinF//LoginPage.jsp");
            }
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
