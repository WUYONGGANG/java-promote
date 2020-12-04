package com.wyg.java8.interf;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-03 10:34
 **/
interface IC {
    default void doMethod01() {};

    default void doMethod02() {};
}
@Deprecated
class AbstractICAdapter implements IC { //适配器

    @Override
    public void doMethod01() { //钩子方法

    }

    @Override
    public void doMethod02() {

    }
}

//class  classC implements IC {

//}

/*class  classC extends AbstractICAdapter {
    @Override
    public void doMethod01() {
        System.out.println("classC.doMethod01");
    }
}*/

class  classC implements IC {
    @Override
    public void doMethod01() {
        System.out.println("classC.doMethod01");
    }
}

public class TestInterfaceDefaultMethod02 {
}
