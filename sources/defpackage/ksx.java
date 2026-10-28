package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksx {
    private static String a;
    private static int b;
    private static Boolean c;

    public static String a() {
        BufferedReader bufferedReader;
        String strTrim;
        String str = a;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            a = processName;
            return processName;
        }
        int iMyPid = b;
        if (iMyPid == 0) {
            iMyPid = Process.myPid();
            b = iMyPid;
        }
        BufferedReader bufferedReader2 = null;
        if (iMyPid > 0) {
            try {
                String strBP = a.bP(iMyPid, "/proc/", "/cmdline");
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    bufferedReader = new BufferedReader(new FileReader(strBP));
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            throw new NullPointerException("null reference");
                        }
                        strTrim = line.trim();
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException unused2) {
                        yno.I(bufferedReader);
                        strTrim = null;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        yno.I(bufferedReader2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th2;
                }
            } catch (IOException unused3) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            strTrim = null;
        }
        a = strTrim;
        return strTrim;
    }

    public static boolean b() {
        Boolean boolValueOf = c;
        if (boolValueOf == null) {
            if (a.aK()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objF = lqd.f(Process.class, "isIsolated", new kyr[0]);
                    aguu.ak(objF);
                    boolValueOf = (Boolean) objF;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
