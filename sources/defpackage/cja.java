package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cja extends ciz {
    final List g;

    public cja(civ civVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(civVar, j, j2, j3, j4, list, j5, j6, j7);
        this.g = list2;
    }

    @Override // defpackage.ciz
    public final long c(long j) {
        return this.g.size();
    }

    @Override // defpackage.ciz
    public final civ g(ciy ciyVar, long j) {
        return (civ) this.g.get((int) (j - this.a));
    }

    @Override // defpackage.ciz
    public final boolean h() {
        return true;
    }

    @Override // defpackage.cje
    public final /* bridge */ /* synthetic */ cje i() {
        return new cja(this.j, this.k, 0L, this.a, this.b, this.c, this.f, this.g, this.d, this.e);
    }
}
