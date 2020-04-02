package com.zzj.catkg.facade.req;

import com.zzj.catkg.facade.entity.Cat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CatQueryReq extends  QueryReq {
    private Cat cat;
}
