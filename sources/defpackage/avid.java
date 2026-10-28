package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avid implements Comparable {
    public final auzm a;
    final double b;

    public avid(auzm auzmVar, double d) {
        this.a = auzmVar;
        this.b = d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Double.compare(this.b, ((avid) obj).b);
    }
}
