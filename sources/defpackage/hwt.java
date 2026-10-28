package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwt {
    public final abvc a;
    public final aawa c;
    public boolean f;
    public int g;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final hws d = new hws(this);
    public final Runnable e = new gky(this, 18, null);

    public hwt(abvc abvcVar, aawa aawaVar) {
        abvcVar.getClass();
        this.a = abvcVar;
        this.c = aawaVar;
        this.g = 0;
    }
}
