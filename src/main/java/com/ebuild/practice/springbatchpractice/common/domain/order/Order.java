package com.ebuild.practice.springbatchpractice.common.domain.order;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
@Table(name = "orders")
@Entity
public class Order {

  @Id
  private Long id;

}
