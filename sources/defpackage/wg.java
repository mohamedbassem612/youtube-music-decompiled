package defpackage;

import android.graphics.Path;
import android.hardware.biometrics.BiometricPrompt;
import android.system.Os;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class wg {
    static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }

    public static void b(aow aowVar, String str) {
        Collections.singletonList(str).getClass();
        aowVar.a();
    }

    public static Path c(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static void d(drd drdVar, Throwable th) throws Throwable {
        dqx dqxVar = ((dqw) drdVar).c;
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        dra draVarA = dqxVar.a;
        dra draVar = dqxVar.b;
        if (draVarA == null || draVarA.a != id) {
            if (draVar == null || draVar.a != id) {
                Os.gettid();
                threadCurrentThread.getName();
                draVarA = dqxVar.a(id);
                dqxVar.b = dqxVar.a;
                dqxVar.a = draVarA;
            } else {
                draVarA = draVar;
            }
        }
        boolean z = draVarA.c.e;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
            stackTraceElement.getFileName();
            stackTraceElement.getLineNumber();
        }
        throw th;
    }
}
