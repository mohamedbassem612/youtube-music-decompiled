package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agds extends agdw {
    final agdw a;

    public agds(agdw agdwVar) {
        this.a = agdwVar;
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        return !this.a.b(c);
    }

    @Override // defpackage.agdw
    public final agdw e() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString().concat(".negate()");
    }
}
