package com.greenfox.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String title;
  boolean isUrgent = false;
  boolean isDone = false;

  public Todo() {
  }

  public Todo(long id, String title, boolean isUrgent, boolean isDone) {
    this.id = id;
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }
}
