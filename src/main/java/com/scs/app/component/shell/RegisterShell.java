package com.scs.app.component.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class RegisterShell {

    @ShellMethod
    public String registrar_turma(@ShellOption(help = "Nome da turma") String className){
        return "";
    }

    @ShellMethod
    public String registrar_aluno(@ShellOption(help = "Nome do aluno") Long studentName){
        return "";
    }

}
