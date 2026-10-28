package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acdu {
    public final int a;
    public final int b;
    public final long c;
    public int d;
    public int e;

    public acdu(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    final void a(int i) {
        this.d |= i;
        this.e |= i;
    }

    final boolean b() {
        int i = this.e;
        int i2 = this.a;
        return (i & i2) == i2;
    }
}
