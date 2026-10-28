package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cob extends cvq {
    public final con a;
    public final AtomicBoolean b;
    private final cvf c;

    public cob(con conVar) {
        super(conVar);
        this.a = conVar;
        this.c = new cvf();
        this.b = new AtomicBoolean(false);
    }

    private final cwj i() {
        return this.b.get() ? this.c : this.a;
    }

    @Override // defpackage.cvq, defpackage.cwj
    public final int a(brv brvVar, int i, boolean z) {
        return i().a(brvVar, i, z);
    }

    @Override // defpackage.cvq, defpackage.cwj
    public final void c(bwb bwbVar, int i) {
        i().c(bwbVar, i);
    }

    @Override // defpackage.cvq, defpackage.cwj
    public final void d(bwb bwbVar, int i, int i2) {
        i().d(bwbVar, i, i2);
    }

    @Override // defpackage.cvq, defpackage.cwj
    public final void e(long j, int i, int i2, int i3, cwi cwiVar) {
        i().e(j, i, i2, i3, cwiVar);
    }

    @Override // defpackage.cvq, defpackage.cwj
    public final int g(brv brvVar, int i, boolean z) {
        return i().g(brvVar, i, z);
    }

    final boolean h() {
        return !this.b.get();
    }
}
