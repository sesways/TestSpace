/**
 * @Project Name:auartz
 * @Package Name:com.zx.job
 */
package com.zx.job;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/10/24 22:22
 */
public class SayTime {
    public void execute() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("|====》报时："+dateFormat.format(new Date()));
    }
}
