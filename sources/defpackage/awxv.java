package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awxv {
    public static final awwo a;

    static {
        Handler handlerC = aao.c(Looper.getMainLooper());
        int i = awxu.a;
        a = new awxs(handlerC, "main", false);
    }
}
