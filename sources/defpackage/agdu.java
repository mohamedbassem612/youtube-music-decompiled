package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agdu extends agdw {
    final agdw a;
    final agdw b;

    public agdu(agdw agdwVar, agdw agdwVar2) {
        this.a = agdwVar;
        agdwVar2.getClass();
        this.b = agdwVar2;
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        return this.a.b(c) || this.b.b(c);
    }

    public final String toString() {
        agdw agdwVar = this.b;
        return this.a.toString() + ".or(" + agdwVar.toString() + ')';
    }
}
