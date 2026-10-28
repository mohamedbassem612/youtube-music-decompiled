package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cqj implements Comparable {
    private final boolean a;
    private final boolean b;

    public cqj(bse bseVar, int i) {
        this.a = 1 == (bseVar.e & 1);
        this.b = aub.e(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cqj cqjVar) {
        return agil.b.e(this.b, cqjVar.b).e(this.a, cqjVar.a).a();
    }
}
