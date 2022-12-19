package com.example.PdfDoc.PdfDoc;

import jakarta.persistence.*;

@Entity
@Table(name = "PdfDoc")
public class PdfDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PdfId;

    @Column (nullable = false, length = 250)
    private String UserName;

    @Column (nullable = false, length = 100)
    private String Mail;
    @Column (nullable = false, length = 250)
    private String Address;
    @Column (nullable = false, length = 14)
    private String PhoneNum;
    @Column (nullable = false)
    private String BirthDate;
    @Column (nullable = false, length = 65000)
    private String Base64;

    public Integer getPdfId() {
        return PdfId;
    }

    public void setPdfId(Integer pdfId) {
        PdfId = pdfId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getBase64() {
        return Base64;
    }

    public void setBase64(String base64) {
        Base64 = base64;
    }
}
