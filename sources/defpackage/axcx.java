package defpackage;

import java.util.Collection;
import java.util.Collections;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axcx {
    public static final Collection a;

    static {
        CoroutineExceptionHandler.class.getClassLoader();
        a = awqx.g(awqx.d(Collections.singletonList(AndroidExceptionPreHandler.class.getDeclaredConstructor(null).newInstance(null)).iterator()));
    }

    public static final void a(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        try {
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        } catch (Throwable unused) {
        }
    }
}
