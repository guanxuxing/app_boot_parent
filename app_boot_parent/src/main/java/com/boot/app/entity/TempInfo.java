package com.boot.app.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by gxx on 2017-08-31.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class TempInfo {

    private Integer id;
    private String mobile;
    private String credooScore;
}
