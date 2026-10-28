package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agno extends agmw {
    public final ReferenceQueue g;

    public agno(agnw agnwVar, int i) {
        super(agnwVar, i);
        this.g = new ReferenceQueue();
    }

    @Override // defpackage.agmw
    public final void g() {
        n(this.g);
    }

    @Override // defpackage.agmw
    public final void h() {
        e(this.g);
    }
}
