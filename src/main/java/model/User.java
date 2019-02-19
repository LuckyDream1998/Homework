package model;

public class User {
  private String name;
  private String surName;
  private String number;
  private int age;
  private GENDER gender;
  private TYPE_OF_NUMBER typeOfNumber;

  enum GENDER {
    Male,
    Female
  }

  enum TYPE_OF_NUMBER {
    FAX,
    MOBILE,
    LAND
  }

  public User( String name, String surName, int age, String gender, String typeOfNumber, String number) {
    this.name = name;
    this.age = age;
    this.surName = surName;
    this.number = number;
    setTypeOfNumber(typeOfNumber);
    setGender(gender);
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender.name();
  }

  public String getSurName() {
    return surName;
  }

  public String getTypeOfNumber() {
    return  typeOfNumber.name();
  }

  public String getNumber() {
    return number;
  }

  public void setTypeOfNumber (String typeOfNumber) {
    if (typeOfNumber.equals("Mobile")) {
      this.typeOfNumber = TYPE_OF_NUMBER.MOBILE;
    } else if (typeOfNumber.equals("Land")) {
      this.typeOfNumber = TYPE_OF_NUMBER.LAND;
    } else if (typeOfNumber.equals("Fax")) {
      this.typeOfNumber = TYPE_OF_NUMBER.FAX;
    }
  }

  public void setGender (String gender) {
    if (gender.equals("Male")){
      this.gender = GENDER.Male;
    } else {
      this.gender = GENDER.Female;
    }
  }
}
