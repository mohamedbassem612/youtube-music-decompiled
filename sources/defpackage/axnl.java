package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axnl {
    private static final String a = "axnl";
    private static axnk b;

    private axnl() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[Catch: all -> 0x003e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:10:0x0013, B:13:0x001c, B:14:0x002d, B:16:0x0031, B:17:0x0038, B:18:0x003a), top: B:26:0x0003, inners: #0 }] */
    public static axnk a(Context context, axnh axnhVar) {
        axnk axnkVar;
        synchronized (axnl.class) {
            if (b == null && Build.VERSION.SDK_INT >= 30 && axnm.b(context, axnhVar)) {
                try {
                    b = new axrv();
                } catch (Exception e) {
                    Log.e("cn_".concat(String.valueOf(a)), "Exception creating an instance of CronetLoggerImpl", e);
                }
                if (b == null) {
                    b = new axom();
                }
                axnkVar = b;
            } else {
                if (b == null) {
                    b = new axom();
                }
                axnkVar = b;
            }
            throw th;
        }
        return axnkVar;
    }
}
