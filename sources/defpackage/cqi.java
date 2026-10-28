package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cqi extends cqp implements Comparable {
    private final int e;
    private final int f;

    public cqi(int i, bto btoVar, int i2, cql cqlVar, int i3) {
        super(i, btoVar, i2);
        this.e = aub.e(i3, cqlVar.W) ? 1 : 0;
        this.f = this.d.a();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cqi cqiVar) {
        return Integer.compare(this.f, cqiVar.f);
    }

    @Override // defpackage.cqp
    public final int b() {
        return this.e;
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ boolean c(cqp cqpVar) {
        return false;
    }
}
