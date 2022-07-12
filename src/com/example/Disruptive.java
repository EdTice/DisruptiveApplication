package com.example;

public class Disruptive
{
  java.net.PasswordAuthentication pa;

  public void beDisruptive(String str)
  {
    System.out.println("Be Disruptive");
    System.out.println("Be-E Disruptive");
    System.out.println("B-E D-I-S-R-U-P-T-I-V-E");
    str=str; // TODO: Fix
    
    String pw = new String(pa.getPassword());
    System.out.println("Your access token is: "+pw);
  }
}
