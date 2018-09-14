/**
 * @Project Name:Dynamic_Proxy
 * @Package Name:com.zx.proxy
 */
package com.zx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/9/14 16:38
 */
public class ImageInvocationHandler implements InvocationHandler {
    private Object object;

    public ImageInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        result = method.invoke(this.object, args);
        return result;
    }
}
