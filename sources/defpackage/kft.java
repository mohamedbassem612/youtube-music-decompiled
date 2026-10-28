package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kft implements kfn {
    final /* synthetic */ kfv a;
    final /* synthetic */ mgk b;

    public kft(kfv kfvVar, mgk mgkVar) {
        this.b = mgkVar;
        this.a = kfvVar;
    }

    @Override // defpackage.kfn
    public final void a(Bitmap bitmap) {
        mgk mgkVar = this.b;
        mgkVar.b = bitmap;
        kfv kfvVar = this.a;
        kfvVar.g = mgkVar;
        kfvVar.a();
    }
}
