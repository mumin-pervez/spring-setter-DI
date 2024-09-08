package com.mumin.beans;

public class Designation {

  private int desId;
  private String desName;
  private String desDetails;

  public void setDesId(int desId) {
    this.desId = desId;
  }

  public void setDesName(String desName) {
    this.desName = desName;
  }

  public void setDesDetails(String desDetails) {
    this.desDetails = desDetails;
  }

  @Override
  public String toString() {
    return desName;
  }
}
