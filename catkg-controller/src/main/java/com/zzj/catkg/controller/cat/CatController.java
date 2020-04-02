package com.zzj.catkg.controller.cat;


import com.zzj.catkg.facade.entity.Cat;
import com.zzj.catkg.facade.req.CatQueryReq;
import com.zzj.catkg.facade.rst.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface CatController {
    @PostMapping("create")
    public Result manageProduct(Cat cat);

    /**
     * 上传图片
     * PS：需要定时清除没被引用的图片
     *
     * @param file 待上传的文件
     * @return 图片详情
     */
    @PostMapping("image")
    public Result uploadImage(MultipartFile file);

    /**
     * 查询
     *
     * @param catQueryReq 类别查询请求
     * @return 类别查询结果
     */
    @GetMapping("query")
    public Result<List<Cat>> query(CatQueryReq catQueryReq);


}
