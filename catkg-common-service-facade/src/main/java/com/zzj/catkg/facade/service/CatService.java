package com.zzj.catkg.facade.service;


import com.zzj.catkg.facade.entity.Cat;
import com.zzj.catkg.facade.req.CatQueryReq;
import com.zzj.catkg.facade.rst.Result;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;


public interface CatService {

  public Result manageProduct(Cat cat);

  /**
   * 上传图片 PS：需要定时清除没被引用的图片
   *
   * @param file 待上传的文件
   * @return 图片详情
   */
  public Result uploadImage(MultipartFile file);

  /**
   * 查询
   *
   * @param catQueryReq 查询请求
   * @return 查询结果
   */
  public Result<List<Cat>> query(CatQueryReq catQueryReq);
  /**
   * 查询
   *
   * @param id 查询请求
   * @return 查询结果
   */
  public Result<Cat> queryById(Long id);

}
