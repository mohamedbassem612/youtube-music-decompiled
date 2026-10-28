package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ciw extends ciy implements cia {
    final ciz a;

    public ciw(bse bseVar, List list, ciz cizVar, List list2) {
        super(bseVar, list, cizVar, list2);
        this.a = cizVar;
    }

    @Override // defpackage.cia
    public final long a(long j, long j2) {
        return this.a.a(j, j2);
    }

    @Override // defpackage.cia
    public final long b(long j, long j2) {
        return this.a.d(j, j2);
    }

    @Override // defpackage.cia
    public final long c(long j, long j2) {
        return this.a.b(j, j2);
    }

    @Override // defpackage.cia
    public final long d() {
        return this.a.a;
    }

    @Override // defpackage.cia
    public final long e(long j, long j2) {
        ciz cizVar = this.a;
        if (cizVar.c != null) {
            return -9223372036854775807L;
        }
        long jB = cizVar.b(j, j2) + cizVar.a(j, j2);
        return (cizVar.f(jB) + cizVar.d(jB, j)) - cizVar.f;
    }

    @Override // defpackage.cia
    public final long f(long j) {
        return this.a.c(j);
    }

    @Override // defpackage.cia
    public final long g(long j, long j2) {
        return this.a.e(j, j2);
    }

    @Override // defpackage.cia
    public final long h(long j) {
        return this.a.f(j);
    }

    @Override // defpackage.cia
    public final civ i(long j) {
        return this.a.g(this, j);
    }

    @Override // defpackage.cia
    public final boolean j() {
        return this.a.h();
    }

    @Override // defpackage.ciy
    public final civ l() {
        return null;
    }

    @Override // defpackage.ciy
    public final String m() {
        return null;
    }

    @Override // defpackage.ciy
    public final cia k() {
        return this;
    }
}
