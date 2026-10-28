package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mdc {
    public static final mda a = new mda();
    public static final Thread b;
    public static mcz c;

    static {
        Thread thread = Looper.getMainLooper().getThread();
        thread.getClass();
        b = thread;
    }
}
