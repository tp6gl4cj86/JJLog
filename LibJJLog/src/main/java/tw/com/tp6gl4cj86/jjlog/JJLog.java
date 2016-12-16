package tw.com.tp6gl4cj86.jjlog;

import android.util.Log;

/**
 * Created by tp6gl4cj86 on 2016/12/16.
 */

public class JJLog
{

    private static       boolean isLog      = true;
    private static final int     MaxLogSize = 1000;

    public static void setIsLog(boolean isLog)
    {
        JJLog.isLog = isLog;
    }

    public static void e(String log)
    {
        e("JJLog", log);
    }

    public static void e(String tag, String log)
    {
        if (isLog)
        {
            for (int i = 0; i <= log.length() / MaxLogSize; i++)
            {
                final int start = i * MaxLogSize;
                final int end = Math.min(log.length(), (i + 1) * MaxLogSize);
                Log.e(tag, log.substring(start, end));
            }
        }
    }

}
