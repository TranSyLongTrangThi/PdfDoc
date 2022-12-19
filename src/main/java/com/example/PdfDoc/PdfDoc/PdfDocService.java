package com.example.PdfDoc.PdfDoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PdfDocService {
    @Autowired private PdfDocRepository repo;

    public List<PdfDoc> listAll(){
        return (List<PdfDoc>) repo.findAll();
    }


}
