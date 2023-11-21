package br.com.fiap.consultorias.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.consultorias.dao.Conexao;
import br.com.fiap.consultorias.dao.UsuarioDao;
import br.com.fiap.consultorias.model.PagamentoModel;
import br.com.fiap.consultorias.model.ProdutoModel;
import br.com.fiap.consultorias.model.UsuarioModel;
import br.com.fiap.consultorias.utils.*;
/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/Usuario")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var conexao = Conexao.abrirConexao();
		UsuarioDao usuarioDao = new UsuarioDao(conexao);
		TrocaParser trocarParser = new TrocaParser();
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		if (!nome.isEmpty() && !email.isEmpty() && !senha.isEmpty()) {
			UsuarioModel usuario = new UsuarioModel(0, nome, senha, email);
			
			if (TrocaParser.stringToInt(request.getParameter("id")) != 0) {
				usuarioDao.updateUsuario(usuario);
			}
			try {
				usuarioDao.createUsuario(usuario);
				request.getSession().setAttribute(email, senha);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
