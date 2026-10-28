package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gjr extends gjs {
    static {
        qih qihVar = qih.a;
        if (qihVar.b == null) {
            qihVar.b = new qfk(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
        }
        System.loadLibrary("elements");
    }

    protected abstract void c();

    @Override // defpackage.gjs
    protected final void d() {
        c();
        f();
    }

    @Override // defpackage.gjs
    protected final void e() {
    }
}
