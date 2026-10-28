package defpackage;

import android.content.ContentProviderClient;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aao {
    public static final akq a(ahk ahkVar, akq akqVar) {
        ahkVar.A();
        int i = 0;
        if (!akqVar.all(new akl(i))) {
            ahkVar.B();
            akqVar = (akq) akqVar.foldIn(akq.c, new akm(i));
            ahkVar.i();
        }
        ahkVar.h();
        return akqVar;
    }

    public static final void b(ContentProviderClient contentProviderClient) throws Exception {
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }

    public static Handler c(Looper looper) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            handler = new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            handler = new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            handler = new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
        return handler;
    }
}
