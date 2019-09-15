遇到问题：Halloworld项目无法运行
![](https://i.imgur.com/KG1jsRR.png)
解决方法：修改配置文件
1.gradle-wrapper.properties
修改distrbutionUrl至当前版本distributionUrl=https\://services.gradle.org/distributions/gradle-5.1.1-all.zip
2.build.gradle
添加google()
修改classpath至当前版本classpath 'com.android.tools.build:gradle:3.4.1'
3.Module build.gradle
修改buildToolsVersion版本buildToolsVersion "29.0.2"
4.修改Project Stucture中的Android Gradle Plugin Version版本至当前系统版本3.4.1
5.Make Project测试是否能够在当前系统运行