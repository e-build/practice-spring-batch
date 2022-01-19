package com.ebuild.practice.springbatchpractice.common.domain.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
@Entity
public class Product {

  @Id
  private Long id;

}
