package studentdbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import studentdbms.entity.Aadhar;
import studentdbms.entity.Student;
import studentdbms.service.AadharService;
import studentdbms.service.StudentService;

@Controller
@RequestMapping("/aadhar")
public class AadharController
{
    @Autowired
    private StudentService studentService;

    @Autowired
    private AadharService aadharService;

    @GetMapping("/add")
    public String add(Model model, @RequestParam("id") int id)
    {
        Aadhar theAadhar = new Aadhar();
        model.addAttribute("theAadhar", theAadhar);
        model.addAttribute("id", id);
        return "aadhar-form";
    }

    @PostMapping("/save")
    public String save(@RequestParam("id") int id, @ModelAttribute("theAadhar") Aadhar theAadhar)
    {
        Student student = studentService.findById(id);
        theAadhar.setStudent(student);
        aadharService.save(theAadhar);
        student.setAadhar(theAadhar);
        studentService.save(student);
        return "redirect:/students";
    }

}