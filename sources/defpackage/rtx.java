package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rtx implements rsu {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ rsu c;
    final /* synthetic */ abzo d;

    public rtx(abzo abzoVar, List list, int i, rsu rsuVar) {
        this.a = list;
        this.b = i;
        this.c = rsuVar;
        this.d = abzoVar;
    }

    @Override // defpackage.rsu
    public final void c() {
        try {
            this.d.u(this.a, this.b, this.c);
        } catch (rso unused) {
            this.c.s();
        }
    }

    @Override // defpackage.rsu
    public final void s() {
        this.c.s();
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void Q() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void R() {
    }
}
