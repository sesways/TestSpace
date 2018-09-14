/**
 * @Project Name:Dynamic_Proxy
 * @Package Name:com.zx
 */
package com.zx;

import com.zx.domain.Image;
import com.zx.inter.ImageInterface;
import com.zx.proxy.ImageInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/9/14 16:37
 */
public class DynamicProxyMain {
    public static void main(String[] args) {
        //创建被代理的接口对象；
        ImageInterface image = new Image("张三");
        //创建代理对象
        InvocationHandler handler = new ImageInvocationHandler(image);
        //获取接口对象的类加载器和类型
        ClassLoader loader = image.getClass().getClassLoader();
        Class<?>[] cls = new Class[]{ImageInterface.class};
        //动态生成代理类
        ImageInterface o =(ImageInterface) Proxy.newProxyInstance(loader, cls, handler);
        //接口对象可以像对象一样执行；
        System.out.println(o.draw());
    }
}
