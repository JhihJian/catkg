package com.zzj.catkg.cat.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.collect.Lists;
import com.zzj.catkg.cat.dao.CatDAO;
import com.zzj.catkg.facade.entity.Cat;
import com.zzj.catkg.facade.req.CatQueryReq;
import com.zzj.catkg.facade.rst.Result;
import com.zzj.catkg.facade.service.CatService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

@Service(version = "1.0.0")
@org.springframework.stereotype.Service

public class CatServiceImpl implements CatService {

  @Autowired
  CatDAO catDAO;

  @Override
  public Result manageProduct(Cat cat) {
    return Result.ofSuccess();
  }

  @Override
  public Result uploadImage(MultipartFile file) {
    return Result.ofSuccess();
  }

  @Override
  public Result<List<Cat>> query(CatQueryReq catQueryReq) {
    return Result.ofSuccess(Lists.newArrayList(catDAO.findOne(catQueryReq.getCat().getCatId())));
  }

  @Override
  public Result<Cat> queryById(Long id) {
    return Result.ofSuccess(catDAO.findOne(id));
  }
}
