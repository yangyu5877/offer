# 笔记
## String StringBuilder StringBuffer区别
1. String 是字符串常量，创建以后不可以进行修改，如果操作字符串，会频繁创建和销毁对象
频繁的创建和销毁对象对速度影响很大，所以是三个当中最慢的
2. StringBuffer是线程安全的，但代价就是相对于StringBuilder速度会慢

## ==与equals的区别
1. ==比较对象的地址值
2. equals是Object对象的基类方法，但大部分方法都重写了equals，在String类中，equals比对的是对象的值而非地址值    
3. ==是操作符，equals是方法，==一般比较原生的类型，比如int,double，boolean等等
```java
    
```
    


![markdown简要语法速成](https://pic2.zhimg.com/eb9df32382de305f904e4805d03a3fec_r.jpg)
