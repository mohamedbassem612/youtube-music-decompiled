package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qel {
    public static volatile ActivityManager a;
    static volatile boolean b;
    private static volatile String c;

    private qel() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (c == null) {
            int iMyPid = Process.myPid();
            String strTrim = null;
            strTrim = null;
            strTrim = null;
            BufferedReader bufferedReader2 = null;
            if (iMyPid > 0) {
                try {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(a.bP(iMyPid, "/proc/", "/cmdline")));
                        try {
                            String line = bufferedReader.readLine();
                            line.getClass();
                            strTrim = line.trim();
                        } catch (IOException unused) {
                            if (bufferedReader != null) {
                            }
                            if (strTrim != null) {
                                c = strTrim;
                            }
                            return c;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    bufferedReader.close();
                } catch (IOException unused4) {
                }
            }
            if (strTrim != null) {
                c = strTrim;
            }
        }
        return c;
    }

    public static String b(Context context) {
        return c(context.getPackageName(), a());
    }

    public static String c(String str, String str2) {
        if (str2 == null || str == null || !str2.startsWith(str)) {
            return str2;
        }
        int length = str.length();
        if (str2.length() == length) {
            return null;
        }
        return str2.substring(length + 1);
    }

    public static boolean d(Context context) {
        qem qemVarF = f(context);
        if (qemVarF.a) {
            return g(context, qemVarF.a());
        }
        return false;
    }

    public static boolean e(Context context, qem qemVar) {
        if (!qemVar.a) {
            return false;
        }
        boolean z = b;
        return g(context, qemVar.a());
    }

    public static qem f(Context context) {
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        return runningAppProcesses == null ? new qem(false, agpi.a) : new qem(true, agke.n(runningAppProcesses));
    }

    private static boolean g(Context context, List list) {
        String packageName = context.getPackageName();
        String strValueOf = String.valueOf(packageName);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            if (runningAppProcessInfo.importance == 100) {
                if (!runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.processName.startsWith(strValueOf.concat(":"))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
