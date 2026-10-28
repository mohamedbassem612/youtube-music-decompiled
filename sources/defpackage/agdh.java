package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agdh extends agdw {
    final agdw a;
    final agdw b;

    public agdh(agdw agdwVar, agdw agdwVar2) {
        this.a = agdwVar;
        this.b = agdwVar2;
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        return this.a.b(c) && this.b.b(c);
    }

    public final String toString() {
        agdw agdwVar = this.b;
        return this.a.toString() + ".and(" + agdwVar.toString() + ')';
    }
}
