JJLog
=========================

[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[ ![Download](https://api.bintray.com/packages/tp6gl4cj86/maven/jjlog/images/download.svg) ](https://bintray.com/tp6gl4cj86/maven/jjlog/_latestVersion)

改善 Log 太長，印出訊息會被截斷的問題。

# Usage

https://jitpack.io/#tp6gl4cj86/JJLog

set is print Log or not

```java
JJLog.setIsLog(BuildConfig.DEBUG); // true or false
```

print Log by default tag (JJLog)

```java
JJLog.e("...");
```

print Log by custom tag

```java
JJLog.e("tag", "...");
```
