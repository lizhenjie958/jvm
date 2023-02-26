package com.jie.chapter05;

public class LocalVariableTest {
    // 测试槽的重复利用
    public void testSlotRepeat(){
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        // 变量c使用之前变量b销毁的位置
        int c = a + 1;
    }

    /**
     * 静态的方法的局部变量表中不存在this，所以不能使用this
     */

    /**
     * 变量赋值
     * 类变量：liking的prepare阶段设置默认值，在初始化阶段复制
     * 实例变量：随着对象的创建，会在堆空间分配实例变量的空间，并进行赋值
     * 局部变量：使用前，必须要进行显示赋值
     */

    
}
