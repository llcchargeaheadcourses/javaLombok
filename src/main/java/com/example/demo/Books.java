package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

//@Getter
//@Setter
//@RequiredArgsConstructor
//@ToString
//@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Books {
  @NonNull
  private int id;
  @NonNull
  private String name;
  @NonNull
  private String author;
  private double price;
	
}
