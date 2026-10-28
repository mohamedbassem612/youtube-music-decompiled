package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gpk implements gno {
    final /* synthetic */ Optional a;
    final /* synthetic */ gpl b;

    public gpk(gpl gplVar, Optional optional) {
        this.a = optional;
        this.b = gplVar;
    }

    @Override // defpackage.gno
    public final void a() {
        isi isiVar = this.b.P;
        if (isiVar != null) {
            isiVar.p();
        }
    }

    @Override // defpackage.gno
    public final void b() {
        this.b.aa(this.a);
    }
}
