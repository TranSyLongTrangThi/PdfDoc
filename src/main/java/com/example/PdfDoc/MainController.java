package com.example.PdfDoc;
import com.example.PdfDoc.PdfDoc.PdfDoc;
import com.example.PdfDoc.PdfDoc.PdfDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired private PdfDocService service;
@GetMapping("")
    public String showHomePage(Model model){
    List<PdfDoc> pdfDocs = service.listAll();
    return "index";
}

}
