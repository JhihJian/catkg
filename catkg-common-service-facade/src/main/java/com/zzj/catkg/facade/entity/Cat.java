package com.zzj.catkg.facade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cat {

  @Id
  Long catId;
  /**
   * 猫名
   */
  String catName;
  /**
   * 所在经度
   */
  long catLac;
  /**
   * 所在纬度
   */
  long catLon;
}
