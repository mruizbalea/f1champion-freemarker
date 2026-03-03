package edu.masanz.f1champion.service;

import edu.masanz.f1champion.dao.UsersDao;
import edu.masanz.f1champion.model.User;

import java.util.List;

public class UserService {

        public int obtenerNumeroUsuarios() {
            return UsersDao.obtenerNumeroUsuarios();
        }

        public List<User> obtenerUsuarios(int pagina, int usuariosPorPagina) {
            return UsersDao.obtenerUsuarios(pagina, usuariosPorPagina);
        }

        public User obtenerUsuario(int idUsuario) {
            return UsersDao.obtenerUsuario(idUsuario);
        }

        public User guardarUsuario(User usuario) {
            return UsersDao.guardarUsuario(usuario);
        }

        public boolean actualizarUsuario(User usuario) {
            return UsersDao.actualizarUsuario(usuario);
        }

        public boolean eliminarUsuario(int idUsuario) {
            return UsersDao.eliminarUsuario(idUsuario);
        }

        public User autenticar(String nombreUsuario, String password) {
            return UsersDao.validarCredenciales(nombreUsuario, password);
        }
    }
