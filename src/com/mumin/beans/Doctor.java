package com.mumin.beans;

public class Doctor {

  private int docId;
  private String docName;
  private Designation designation;

  public int getDocId() {
    return docId;
  }

  public void setDocId(int docId) {
    this.docId = docId;
  }

  public String getDocName() {
    return docName;
  }

  public void setDocName(String docName) {
    this.docName = docName;
  }

  public Designation getDesignation() {
    return designation;
  }

  public void setDesignation(Designation designation) {
    this.designation = designation;
  }

  public void displayInfo() {
    System.out.println("Id : " + docId);
    System.out.println("Name : " + docName);
    System.out.println("Designation : " + designation);
  }
}
