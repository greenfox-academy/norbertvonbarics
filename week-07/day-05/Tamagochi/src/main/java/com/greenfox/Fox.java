package com.greenfox;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@AllArgsConstructor
@Component
public class Fox {
  String name;
  List<String> tricks;
  String food;
  String drink;

  public Fox() {
this.name = "fox";
this.tricks = new ArrayList<>();
this.food = "hunger";
this.drink =  "thirst";
  }

  public void addTrick(String trick) {
    tricks.add(trick);
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    return tricks;
  }
}