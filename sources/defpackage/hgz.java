package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgz {
    public amlg a;
    public final boolean b;
    public final amlh c;

    public hgz(amks amksVar) {
        amlg amlgVarA = amlg.a(amksVar.d);
        this.a = amlgVarA == null ? amlg.LIKE : amlgVarA;
        this.b = amksVar.f;
        amlh amlhVar = amksVar.c;
        this.c = amlhVar == null ? amlh.a : amlhVar;
    }

    public hgz(amlg amlgVar, boolean z, amlh amlhVar) {
        this.a = amlgVar;
        this.b = z;
        this.c = amlhVar;
    }

    public hgz() {
        this.a = amlg.INDIFFERENT;
        this.b = false;
        this.c = null;
    }
}
