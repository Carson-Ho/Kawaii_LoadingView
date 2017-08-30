# Kawaii_LoadingView
>[English Document](https://github.com/Carson-Ho/Kawaii_LoadingView/blob/master/README-en.md)
- 作者：Carson_Ho
- 概述


![示意图](http://upload-images.jianshu.io/upload_images/944365-aa402d1b3dc8f60d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


**注：关于该开源项目的意见 & 建议可在Issue上提出。欢迎 Star ！**


## 1. 简介
一款 可爱 & 小资风格的 `Android`自定义`View`控件

![示意图](http://upload-images.jianshu.io/upload_images/944365-a9cc736b37b1ed2f.gif?imageMogr2/auto-orient/strip)


## 2. 应用场景
`App` 长时间加载等待时，**用于提示用户进度 & 缓解用户情绪**



## 3. 特点
对比市面上的加载等待自定义控件，该控件`Kawaii_LoadingView` 的特点是：

##### 3.1 样式清新
- 对比市面上 各种酷炫、眼花缭乱的加载等待自定义控件，该款 `Kawaii_LoadingView` 的 **清新 & 小资风格** 简直是一股清流
- 同时，可根据您的`App`定位 & 主色进行颜色调整，使得控件更加符合`App`的形象。具体如下：

![示意图](http://upload-images.jianshu.io/upload_images/944365-4bebae5ec5e79c39.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


![示意图](http://upload-images.jianshu.io/upload_images/944365-32a92693dd83eee3.gif?imageMogr2/auto-orient/strip)

![示意图](http://upload-images.jianshu.io/upload_images/944365-d3c24cc2d64f3d90.gif?imageMogr2/auto-orient/strip)


![示意图](http://upload-images.jianshu.io/upload_images/944365-be2cae786f20cd41.gif?imageMogr2/auto-orient/strip)

##### 3.2 使用简单
仅需要3步骤 & 配置简单。
>下面1节会详细介绍其使用方法

##### 3.3 二次开发成本低
- 本项目已在 `Github`上开源：[Kawaii_LoadingView](https://github.com/Carson-Ho/Kawaii_LoadingView)
- 详细的源码分析文档：具体请看文章[Android：你也可以自己写一个可爱 & 小资风格的加载等待自定义View](http://www.jianshu.com/p/67b69fc8b63b)

所以，在其上做二次开发 & 定制化成本非常低。

## 4. 具体使用

##### 步骤1：导入控件库
主要有 `Gradle` & `Maven` 2种方式：

- 方式1：`Gradle`引入依赖
*build.Gradle*

```
dependencies {
    compile 'com.carson_ho:Kawaii_LoadingView:1.0.0'
}
```

- 方式2：`Maven`引入依赖
*pom.xml*
```
<dependency>
  <groupId>com.carson_ho</groupId>
  <artifactId>Kawaii_LoadingView</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```


##### 步骤2：设置动画属性
- 属性说明：

![示意图](http://upload-images.jianshu.io/upload_images/944365-f740123d4f9ad03d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 具体属性设置

![示意图](http://upload-images.jianshu.io/upload_images/944365-3bb5cc87eed80e61.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 使用示例
在`XML`文件中进行设置
*activity_main.xml*
```
<scut.carson_ho.kawaii_loadingview.Kawaii_LoadingView

            android:id="@+id/Kawaii_LoadingView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"

            android:background="#FFCCFF" 
            app:blockColor="#ffffff" 

            app:lineNumber="3"
            app:fixBlock_Angle="5"
            app:moveBlock_Angle="20"

            app:blockInterval="8dp"
            app:half_BlockWidth="15dp"
            app:initPosition="0"

            app:isClock_Wise="false"
            app:moveSpeed="500"
            app:move_Interpolator="@android:anim/bounce_interpolator"

            />
```

##### 步骤3：通过 `API` 启动自定义控件的动画

```
    // 1. 定义控件变量
    private Kawaii_LoadingView Kawaii_LoadingView;

    // 2. 绑定控件
    Kawaii_LoadingView = (Kawaii_LoadingView) findViewById(R.id.Kawaii_LoadingView);
        
    // 3. 使用动画（API说明）
       // 3.1 启动动画
       Kawaii_LoadingView.startMoving();
       // 3.2 停止动画
       Kawaii_LoadingView.stopMoving();
```



## 5. 完整Demo地址
[Carson_Ho的Github地址：Kawaii_LoadingView_TestDemo](https://github.com/Carson-Ho/Kawaii_LoadingView)


![最终示意图.gif](http://upload-images.jianshu.io/upload_images/944365-ab7e77a0628d62b3.gif?imageMogr2/auto-orient/strip)



## 6.  源码解析

具体请看文章[Android：你也可以自己写一个可爱 & 小资风格的加载等待自定义View](http://www.jianshu.com/p/67b69fc8b63b)



## 7.  开源协议

`Kawaii_LoadingView` 遵循 `Apache 2.0` 开源协议



## 8. 贡献代码
- 具体请看：[贡献说明](https://github.com/Carson-Ho/Kawaii_LoadingView/blob/master/CONTRIBUTING.md)
- 关于该开源项目的意见 & 建议可在`Issue`上提出。欢迎 Star ！



## 9. 版本说明
2017-07-07 v1.0.0 ：新增 启动 & 停止动画



# 关于作者
- ID：Carson_Ho
- 简介：CSDN签约作者、简书推荐作者、稀土掘金专栏作者
- E - mail：[carson.ho@foxmail.com](mailto:carson.ho@foxmail.com)
- Github：[https://github.com/Carson-Ho](https://github.com/Carson-Ho)
- CSDN：[http://blog.csdn.net/carson_ho](http://blog.csdn.net/carson_ho)
- 简书：[http://www.jianshu.com/u/383970bef0a0](http://www.jianshu.com/u/383970bef0a0)
- 稀土掘金：[https://juejin.im/user/58d4d9781b69e6006ba65edc](https://juejin.im/user/58d4d9781b69e6006ba65edc)
