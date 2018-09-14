/**
 * @Project Name:Dynamic_Proxy
 * @Package Name:com.zx.domain
 */
package com.zx.domain;

import com.zx.inter.ImageInterface;
import lombok.Data;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/9/14 16:32
 */
@Data
public class Image implements ImageInterface {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String draw() {
        return name + ": This a simple image !";
    }
}
