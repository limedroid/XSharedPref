# XSharedPref，适用于多进程的SharedPreferences

SharedPreferences底层是操作xml文件。在多进程中，每个进程都有一份SharedPreferences，因此SharedPreferences不能直接在多进程通信。为了解决此问题，将SharedPreferences的操作放在一个单独的进程中，其他进程使用ContentProvider对它进行操作，[XSharedPref](https://github.com/limedroid/XSharedPref)由此产生。

## 两个部分

* SharedPrefProvider 继承了ContentProvider，实现对SharedPreferences的基本操作。
* XSharedPref   SharedPreferences使用工具类，其Api类似SharedPreferences。主要实现了：
    * getString
    * getInt
    * getLong
    * getFloat
    * getBoolean
    * putString
    * putInt
    * putLong
    * putFloat
    * putBoolean
    * remove
    * clear
    * contains
等基本操作，您可以根据自己的实际情况进行扩展。
    
## 使用用法

1. gradle配置
    compile 'cn.droidlover:xsharedpref:1.0.0'

2. AndroidManifest.xml配置ContentProvider
    ```xml
     <provider
            android:name=".SharedPrefProvider"
            android:authorities="cn.droidlover.xsharedpref.sp"
            android:process=":xSharedPref" />
    ```
    process配置进程名称

3. 使用XSharedPref提供的api
    ```java
     XSharedPref.putString(this, "github_name", "https://github.com/limedroid");
     String gitName = XSharedPref.getString(this, "github_name", null);
    ```
    其他的api操作也如上所述.
    



　　
