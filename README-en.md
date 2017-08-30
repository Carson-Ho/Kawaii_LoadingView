# Kawaii_LoadingView
>[点击查看中文文档](https://github.com/Carson-Ho/Kawaii_LoadingView/blob/master/README.md)
- Author：Carson_Ho
- Summary

![示意图](http://upload-images.jianshu.io/upload_images/944365-464f679e6cd66645.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


## 1. Introduction
a cut & elegance  Android DIY View 
>Github：[Kawaii_LoadingView](https://github.com/Carson-Ho/Kawaii_LoadingView)

![示意图](http://upload-images.jianshu.io/upload_images/944365-a9cc736b37b1ed2f.gif?imageMogr2/auto-orient/strip)


## 2. Application Scenarios
Prompting the loading progress & easing the mood when the user is waiting for the App loading progress.



## 3. Feature
- Fresh & concise style
- Adjusting the color could make sense with different App positioning & main color

![示意图](http://upload-images.jianshu.io/upload_images/944365-4bebae5ec5e79c39.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- Easy to use
- Secondary Programming costs are low

## 4. Usage

##### Step 1：Import Library
There are two ways to  import Library：

- 1. For Gradle
*build.Gradle*

```
dependencies {
    compile 'com.carson_ho:Kawaii_LoadingView:1.0.0'
}
```

- 2. For Maven
*pom.xml*
```
<dependency>
  <groupId>com.carson_ho</groupId>
  <artifactId>Kawaii_LoadingView</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```


##### Step 2：Set Animation Attributes
- Attributes Description：

![示意图](http://upload-images.jianshu.io/upload_images/944365-f740123d4f9ad03d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- Specific settings

![示意图](http://upload-images.jianshu.io/upload_images/944365-3bb5cc87eed80e61.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- Use examples

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

##### Step 3：API Usage

```
    // 1. Defines the view variable
    private Kawaii_LoadingView Kawaii_LoadingView;

    // 2. Bind the view  variable
    Kawaii_LoadingView = (Kawaii_LoadingView) findViewById(R.id.Kawaii_LoadingView);
        
    // 3. Use animation（API description）
       // 3.1 start animation
       Kawaii_LoadingView.startMoving();
       // 3.2  stop animation
       Kawaii_LoadingView.stopMoving();
```



## 5. Complete Demo
[Carson_Ho - Github：Kawaii_LoadingView_TestDemo](https://github.com/Carson-Ho/Kawaii_LoadingView)


![最终示意图.gif](http://upload-images.jianshu.io/upload_images/944365-ab7e77a0628d62b3.gif?imageMogr2/auto-orient/strip)



## 6.  Source code analysis
[click here to see](http://www.jianshu.com/p/67b69fc8b63b)



## 7.  LICENSE
Kawaii_LoadingView is available under the Apache 2.0 license.



## 8. Contribute
Before you open an issue or create a pull request, please read [Contributing Guide](https://github.com/Carson-Ho/Kawaii_LoadingView/blob/master/CONTRIBUTING.md) first.



## 9. Release
2017-07-07 v1.0.0 ：add start & stop animation



# About the author
- ID：Carson_Ho
- 简介：CSDN签约作者、简书推荐作者、稀土掘金专栏作者
- E - mail：[carson.ho@foxmail.com](mailto:carson.ho@foxmail.com)
- Github：[https://github.com/Carson-Ho](https://github.com/Carson-Ho)
- CSDN：[http://blog.csdn.net/carson_ho](http://blog.csdn.net/carson_ho)
- 简书：[http://www.jianshu.com/u/383970bef0a0](http://www.jianshu.com/u/383970bef0a0)
- 稀土掘金：[https://juejin.im/user/58d4d9781b69e6006ba65edc](https://juejin.im/user/58d4d9781b69e6006ba65edc)
