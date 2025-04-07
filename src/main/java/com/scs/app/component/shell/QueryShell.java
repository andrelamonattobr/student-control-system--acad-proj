package com.scs.app.component.shell;

import com.scs.app.model.ClassModel;
import com.scs.app.model.StudentClassModel;
import com.scs.app.model.StudentModel;
import com.scs.app.service.ClassService;
import com.scs.app.service.StudentClassService;
import com.scs.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.BeanListTableModel;
import org.springframework.shell.table.BorderStyle;
import org.springframework.shell.table.Table;
import org.springframework.shell.table.TableBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ShellComponent
public class QueryShell {

    @Autowired
    StudentService studentService;

    @Autowired
    ClassService classService;

    @Autowired
    StudentClassService studentClassService;

    @ShellMethod(value = "Relatorio de frequencia de um aluno")
    public String relatorio_frequencia_aluno(@ShellOption(help = "Identificador do aluno") Long studentId){
        return "";
    }

    @ShellMethod(value = "Relatorio de frequencia dos alunos de uma turma em um periodo expecifico")
    public String consultar_frequencia_turma(@ShellOption(help = "Identificador da turma") Long classId,
                                             @ShellOption(help = "Data inicial (yyyy-MM-dd)") LocalDate startDate,
                                             @ShellOption(help = "Data final (yyyy-MM-dd)") LocalDate endDate){
        return "";
    }

    @ShellMethod(value = "Listagem dos alunos")
    public Table listar_alunos(){

        BeanListTableModel<StudentModel> studentModelBeanListTableModel = new BeanListTableModel<>(
                studentService.listStudents(),
                "id",
                "name"
        );

        TableBuilder tableBuilder = new TableBuilder(studentModelBeanListTableModel);

        tableBuilder.addInnerBorder(BorderStyle.fancy_light)
                .addHeaderBorder(BorderStyle.fancy_double)
                .addFullBorder(BorderStyle.fancy_light);

        return tableBuilder.build();
    }

    @ShellMethod(value = "Listagem das turmas")
    public Table listar_turmas(){
        BeanListTableModel<ClassModel> classModelBeanListTableModel = new BeanListTableModel<>(
                classService.listClasses(),
                "id",
                "name"
        );

        TableBuilder tableBuilder = new TableBuilder(classModelBeanListTableModel);

        tableBuilder.addInnerBorder(BorderStyle.fancy_light)
                .addHeaderBorder(BorderStyle.fancy_double)
                .addFullBorder(BorderStyle.fancy_light);

        return tableBuilder.build();
    }

    @ShellMethod(value = "Listagem das tumas vinculadas aos alunos")
    public Table listar_turmas_alunos(){

        class studentClassDTO{
            final Long classId;
            final Long studentId;
            public studentClassDTO(Long classId, Long studentId) {
                this.classId = classId;
                this.studentId = studentId;
            }
        }

        List<studentClassDTO> studentClassDTOList = new ArrayList<>();

        studentClassService.listAll().forEach(studentClass -> {
            System.out.println(studentClass.toString());
            studentClassDTOList.add(new studentClassDTO(studentClass.getFk_class().getId(), studentClass.getFk_student().getId()));
        });

        BeanListTableModel<studentClassDTO> classModelBeanListTableModel = new BeanListTableModel<>(
                studentClassDTOList,
                "classId",
                "studentId"
        );

        TableBuilder tableBuilder = new TableBuilder(classModelBeanListTableModel);

        tableBuilder.addInnerBorder(BorderStyle.fancy_light)
                .addHeaderBorder(BorderStyle.fancy_double)
                .addFullBorder(BorderStyle.fancy_light);

        return tableBuilder.build();
    }


}
