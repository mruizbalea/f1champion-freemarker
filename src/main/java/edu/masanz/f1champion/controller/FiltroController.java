package edu.masanz.f1champion.controller;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

public class FiltroController {
    public static void filtroBefore(@NotNull Context context) {
        if (!context.path().equals("/login") && !UsersController.AUTENTICADO){
            context.redirect("/login");
        }
    }
    public static void filtroAfter(@NotNull Context context) {


        System.out.println(context.path());
        System.out.println("Entrando en el after");
    }
}
