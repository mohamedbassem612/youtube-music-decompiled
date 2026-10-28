package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efs {
    static {
        dzf.a("ProcessUtils");
    }

    public static final boolean a(Context context, dyl dylVar) {
        String processName;
        Object next;
        context.getClass();
        dylVar.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            processName.getClass();
        } else {
            processName = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, dzt.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
                if (objInvoke instanceof String) {
                    processName = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            processName = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable unused) {
                dzf.b();
            }
        }
        String str = dylVar.g;
        return (str == null || str.length() == 0) ? awrc.c(processName, context.getApplicationInfo().processName) : awrc.c(processName, str);
    }
}
