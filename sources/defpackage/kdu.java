package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kdu implements kdk {
    final /* synthetic */ kdv a;

    public kdu(kdv kdvVar) {
        this.a = kdvVar;
    }

    @Override // defpackage.kdk
    public final void a() {
        khn.e();
        kdv kdvVar = this.a;
        kdvVar.c.clear();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            kdvVar.J();
        } else {
            new afkg(Looper.getMainLooper(), (byte[]) null).post(new kcx(kdvVar, 3));
        }
    }

    @Override // defpackage.kdk
    public final void b() {
        this.a.H();
    }
}
