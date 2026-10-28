package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cbn implements cdx {
    private final cdx a;

    public cbn() {
        this.a = Build.VERSION.SDK_INT >= 35 ? new cbj() : new cbm();
    }

    @Override // defpackage.cdx
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.cdx
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.cdx
    public final void d(qcb qcbVar, Context context, Looper looper, Looper looper2, bvd bvdVar) {
        this.a.d(qcbVar, context, looper, looper2, bvdVar);
    }
}
