package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kox {
    public final Executor a;
    public volatile kow b;

    public kox(Looper looper, Object obj, String str) {
        this.a = new lpc(looper, 1);
        kro.i(str);
        this.b = new kow(obj, str);
    }
}
