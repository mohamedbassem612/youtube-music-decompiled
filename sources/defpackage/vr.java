package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vr extends dl {
    public final Object a;
    public final ExecutorService b;
    public volatile Handler c;

    public vr() {
        super(null, null);
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(4, new kyp(1, (byte[]) null));
    }

    public static Handler q(Looper looper) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            handler = new Handler(looper);
        } catch (InvocationTargetException unused2) {
            handler = new Handler(looper);
        }
        return handler;
    }
}
