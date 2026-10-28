package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awxu {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objI;
        Handler handler;
        try {
            Looper mainLooper = Looper.getMainLooper();
            if (Build.VERSION.SDK_INT >= 28) {
                Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, mainLooper);
                objInvoke.getClass();
                handler = (Handler) objInvoke;
            } else {
                try {
                    handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                    handler = new Handler(mainLooper);
                }
            }
            objI = new awxs(handler, null, false);
        } catch (Throwable th) {
            objI = atqp.i(th);
        }
    }
}
