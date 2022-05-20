package Members;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Member {

  private String active = "ACTIVE";
  private String email;
  private String name;
  private String notPaid = "NOT PAID";
  private String paid = "PAID";
  private String passive = "PASSIVE";

  public int age;
  private int phoneNumber;

  private char activeOrPassive;
  private char paidOrNot;


  private LocalDate dateOfBirth;

  private Integer memberID;

  private double paymentCategory;

  private ArrayList<Member> members;
  private ArrayList<Member> restance;

  //Constructors
  public Member(String name, int age, int phoneNumber, String email, Integer memberID, char activeOrPassive, char paidOrNot, double paymentCategory) {
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.memberID = memberID;
    this.activeOrPassive = activeOrPassive;
    this.paidOrNot = paidOrNot;
    this.paymentCategory = paymentCategory;

  }

  public Member() {

  }

  public int calculateAge(LocalDate newAge) {
    LocalDate curDate = LocalDate.now(); // nu bruger lokal tid og dato med now.
    if (newAge != null) {
// gem fødselsdag under member som attribut

      age = Period.between(newAge, curDate).getYears();
      return age;
    } else {
      return 0;
    }
  }

  //-----------------Setter-----------------

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNumber(Integer phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setActiveOrPassive(char activeOrPassive) {
    this.activeOrPassive = activeOrPassive;
  }

  //-----------------Getter-----------------

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public Integer getMemberID() {
    return memberID;
  }

  public char getActiveOrPassive() {
    return activeOrPassive;
  }

  public char getPaidOrNot() {
    return paidOrNot;
  }

  public double getPaymentCategory(){
    return paymentCategory;
  }

  @Override
  public String toString() {

    if (activeOrPassive == 'A' && paidOrNot == 'P') {
      return
          String.format("%04d %-30s %-35s %-10d %-16d %-8s %-7s", memberID, name, email, age, phoneNumber, active, paid);
    }
    if (activeOrPassive == 'A' && paidOrNot == 'N') {
      return
          String.format("%04d %-30s %-35s %-10d %-16d %-8s %-7s", memberID, name, email, age, phoneNumber, active, notPaid);
    }
    if (activeOrPassive == 'P' && paidOrNot == 'P') {
      return
          String.format("%04d %-30s %-35s %-10d %-16d %-8s %-7s", memberID, name, email, age, phoneNumber, passive, paid);
    }

    if (activeOrPassive == 'P' && paidOrNot == 'N') {
      return
          String.format("%04d %-30s %-35s %-10d %-16d %-8s %-7s", memberID, name, email, age, phoneNumber, passive, notPaid);
    }
    return
        String.format("%04d %-30s %-35s %-10d %-16d %-8s %-7s", memberID, name, email, age, phoneNumber, active, paid);
  }
}
