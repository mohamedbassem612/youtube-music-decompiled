package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yuq implements crc {
    public final ci a = new ci((char[]) null);
    private Handler b;
    private crd c;

    @Override // defpackage.crc
    public final void G(int i, long j, long j2) {
        this.a.A(i, j, j2);
    }

    public final void a(crd crdVar) {
        crd crdVar2 = this.c;
        if (crdVar != crdVar2) {
            if (crdVar2 != null) {
                crdVar2.h(this);
            }
            if (crdVar != null) {
                Handler handlerAp = this.b;
                if (handlerAp == null) {
                    handlerAp = bwp.ap();
                    this.b = handlerAp;
                }
                crdVar.g(handlerAp, this);
            }
            this.c = crdVar;
        }
    }
}
