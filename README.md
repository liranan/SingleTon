# SingleTon
保证一个类仅有一个实例，并提供一个访问它的全局访问点。

单态模式
 
 概述
   
    保证一个类仅有一个实例，并提供一个访问它的全局访问点。

 适用性
   
   1.当类只能有一个实例而且客户可以从一个众所周知的访问点访问它时。

    2.当这个唯一实例应该是通过子类化可扩展的，并且客户应该无需更改代码就能使用一个扩展的实例时。

			 参与者
   
    Singleton
      定义一个Instance操作，允许客户访问它的唯一实例。Instance是一个类操作。
      可能负责创建它自己的唯一实例。
 类图
 
 例子
Singleton 
public class Singleton {
    
    private static Singleton sing;

    private Singleton() {
        
    }
    
    public static Singleton getInstance() {
        if (sing == null) {
            sing = new Singleton();
        }
        return sing;
    }
}
Test 
public class Test {
    
    public static void main(String[] args) {
        Singleton sing = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        
        System.out.println(sing);
        System.out.println(sing2);
    }
}
result 
singleton.Singleton@1c78e57
singleton.Singleton@1c78e57
