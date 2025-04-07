package com.scs.app.component.shell;

import com.scs.app.service.ClassService;
import com.scs.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class RegisterShell {

    @Autowired
    StudentService studentService;

    @Autowired
    ClassService classService;

    @ShellMethod(value = "Registrar nova turma")
    public String registrar_turma(@ShellOption(help = "Nome da turma") String className){
        if (classService.createStudent(className))
            return "Turma criada";
        else
            return "Turma NAO criada";
    }

    @ShellMethod(value = "Registrar novo aluno")
    public String registrar_aluno(@ShellOption(help = "Nome do aluno") String studentName){
        if (studentService.createStudent(studentName))
            return "Aluno criado";
        else
            return "Aluno NAO criado";
    }

}
