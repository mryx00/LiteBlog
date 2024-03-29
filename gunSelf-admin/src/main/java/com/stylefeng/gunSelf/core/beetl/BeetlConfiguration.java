package com.stylefeng.gunSelf.core.beetl;

import com.stylefeng.gunSelf.core.util.DateUtil;
import com.stylefeng.gunSelf.core.util.DictUtil;
import com.stylefeng.gunSelf.core.util.KaptchaUtil;
import com.stylefeng.gunSelf.core.util.ToolUtil;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

/**
 * beetl拓展配置,绑定一些工具类,方便在模板中直接调用
 *
 * @author stylefeng
 * @Date 2018/2/22 21:03
 */
public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

    @Override
    public void initOther() {
        groupTemplate.registerFunctionPackage("shiro", new ShiroExt());
        groupTemplate.registerFunctionPackage("tool", new ToolUtil());
        groupTemplate.registerFunctionPackage("dictUtil",new DictUtil());
        groupTemplate.registerFunctionPackage("kaptcha", new KaptchaUtil());
        groupTemplate.registerFunctionPackage("date", new DateUtil());
    }
}
