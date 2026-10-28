package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aedz implements Comparable {
    public int a;
    int b;
    final long c;

    public aedz(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((aedz) obj).b;
    }
}
