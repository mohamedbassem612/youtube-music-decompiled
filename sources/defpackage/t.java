package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class t extends o {
    private static final long serialVersionUID = 1405488568664762222L;

    @Override // defpackage.p
    public final boolean a(q qVar) {
        return this.a.a(qVar) || this.b.a(qVar);
    }

    public final String toString() {
        p pVar = this.b;
        return this.a.toString() + " or " + pVar.toString();
    }
}
