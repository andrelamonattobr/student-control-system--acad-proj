package com.scs.app.component.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class AssignShell {

    @ShellMethod(value = "Vincular um aluno a uma turma")
    public String vircular_turma_aluno(@ShellOption(help = "Identificador da turma") Long classId,
                                       @ShellOption(help = "Identificador do aluno") Long studentId){
        return "";
    }

    @ShellMethod(value = "Assinalar presenca para um aluno em uma turma")
    public String assinalar_presenca_aluno_turma(@ShellOption(help = "Identificador do aluno") Long studentId,
                                                 @ShellOption(help = "Identificador da turma") Long classId){
        return "";
    }

    @ShellMethod(value = "Assinalar presenca para toda a turma")
    public String assinalar_presenca_turma(@ShellOption(help = "Identificador da turma") Long classId){
        return "";
    }

}
