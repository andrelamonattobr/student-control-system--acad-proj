package com.scs.app.component.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class AssignShell {

    @ShellMethod
    public String vircular_turma_aluno(@ShellOption(help = "Identificador da turma") Long classId,
                                       @ShellOption(help = "Identificador do aluno") Long studentId){
        return "";
    }

    @ShellMethod
    public String assinalar_presenca_aluno_turma(@ShellOption(help = "Identificador do aluno") Long studentId,
                                                 @ShellOption(help = "Identificador da turma") Long classId){
        return "";
    }

    @ShellMethod
    public String assinalar_presenca_turma(@ShellOption(help = "Identificador da turma") Long classId){
        return "";
    }

}
