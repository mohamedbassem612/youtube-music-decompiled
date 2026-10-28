package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dde implements Comparable {
    public final int a;
    public final ddb b;

    public dde(int i, ddb ddbVar) {
        this.a = i;
        this.b = ddbVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.a, ((dde) obj).a);
    }
}
