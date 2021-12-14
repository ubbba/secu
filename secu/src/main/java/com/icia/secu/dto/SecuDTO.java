package com.icia.secu.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("secu")
public class SecuDTO {
    String secuId;
    String secuPw;
    String secuEmail;
}
