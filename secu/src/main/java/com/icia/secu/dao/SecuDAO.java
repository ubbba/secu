package com.icia.secu.dao;

import com.icia.secu.dto.SecuDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SecuDAO {

    // void는 return값이 없음
    void secuJoin(SecuDTO secu);

    SecuDTO secuLogin(SecuDTO secu);


}
