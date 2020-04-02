package com.zzj.catkg.controller.cat;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzj.catkg.facade.entity.Cat;
import com.zzj.catkg.facade.req.CatQueryReq;
import com.zzj.catkg.facade.rst.Result;
import com.zzj.catkg.facade.service.CatService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class CatControllerImpl implements CatController {

  @Reference(version = "1.0.0")
  private CatService catService;

  @Override
  public Result manageProduct(Cat cat) {
    return catService.manageProduct(cat);
  }

  @Override
  public Result uploadImage(MultipartFile file) {
    return catService.uploadImage(file);
  }

  @Override
  public Result<List<Cat>> query(CatQueryReq catQueryReq) {
    return catService.query(catQueryReq);
  }
}
