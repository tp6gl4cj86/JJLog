JJLog
=========================

[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[ ![Download](https://api.bintray.com/packages/tp6gl4cj86/maven/jjlog/images/download.svg) ](https://bintray.com/tp6gl4cj86/maven/jjlog/_latestVersion)

改善 Log 太長，印出訊息會被截斷的問題。

# Usage

Add dependency.

```
dependencies {
    compile 'tw.com.tp6gl4cj86:jjlog:2016.12.16.1'
}
```

設定是否印出 Log

```java
JJLog.setIsLog(BuildConfig.DEBUG); // true or false
```

以預設 tag 印出。(JJLog)

```java
JJLog.e("...");
```

以自訂 tag 印出。

```java
JJLog.e("tag", "...");
```
