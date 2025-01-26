package org.example;

public class Converter {
  //ounces converted to pounds
  double toPounds(double x){
    double P_info = x/16;
    return P_info;
  }

  //ounces converted to pounds and ounces
  double toPoundsAndOunces(double y){
    double O_info = y % 16;
    return O_info;
  }
}
