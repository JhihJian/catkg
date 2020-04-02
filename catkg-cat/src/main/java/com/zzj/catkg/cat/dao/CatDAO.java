package com.zzj.catkg.cat.dao;

import com.zzj.catkg.facade.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

/** Book 数据持久层操作接口 */
public interface CatDAO extends JpaRepository<Cat, Long> {}
