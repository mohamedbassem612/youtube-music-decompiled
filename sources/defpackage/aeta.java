package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeta implements Thread.UncaughtExceptionHandler {
    public String a = null;
    Thread.UncaughtExceptionHandler b;
    final tqj c;

    public aeta(tqj tqjVar) {
        this.c = tqjVar;
    }

    public final void a() {
        this.b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String strReplace;
        String message;
        String message2;
        try {
            tqj tqjVar = this.c;
            int i = tqr.a;
            if (tqjVar.k(1073814399) && (message2 = th.getMessage()) != null && message2.contains("Cannot obtain size for recycled Bitmap")) {
                strReplace = Log.getStackTraceString(th);
            } else {
                strReplace = (tqjVar.k(1073816108) && (message = th.getMessage()) != null && message.contains("<N0_P!!>")) ? Log.getStackTraceString(th).replace("<N0_P!!>", "") : Log.getStackTraceString(th).replace(String.valueOf(th.getMessage()).concat("\n"), "\n");
            }
            this.a = strReplace;
        } catch (Throwable unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
