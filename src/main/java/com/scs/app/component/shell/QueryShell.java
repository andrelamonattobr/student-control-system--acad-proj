package com.scs.app.component.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.time.LocalDate;

@ShellComponent
public class QueryShell {

    @ShellMethod
    public String relatorio_frequencia_aluno(@ShellOption(help = "Identificador do aluno") Long studentId){
        return "";
    }

    @ShellMethod
    public String consultar_frequencia_turma(@ShellOption(help = "Identificador da turma") Long classId,
                                             @ShellOption(help = "Data inicial (yyyy-MM-dd)") LocalDate startDate,
                                             @ShellOption(help = "Data final (yyyy-MM-dd)") LocalDate endDate){
        return "";
    }


}
