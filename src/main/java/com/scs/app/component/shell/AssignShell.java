package com.scs.app.component.shell;

import com.scs.app.repository.StudentClassRepository;
import com.scs.app.service.StudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class AssignShell {

    @Autowired
    StudentClassService classService;

    @ShellMethod(value = "Vincular um aluno a uma turma")
    public String vincular_turma_aluno(@ShellOption(help = "Identificador da turma") Long classId,
                                       @ShellOption(help = "Identificador do aluno") Long studentId){

        if (classService.assignStudentToClass(classId, studentId))
            return "Aluno vinculado com sucesso";
        return "Erro durante a vinculacao de turma e aluna";

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
