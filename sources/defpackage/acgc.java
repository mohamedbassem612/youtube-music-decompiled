package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acgc {
    public final acgd a;
    public long b;
    final /* synthetic */ acge c;

    public acgc(acge acgeVar, acgd acgdVar, long j) {
        this.c = acgeVar;
        this.a = acgdVar;
        this.b = j;
    }

    final int a() {
        return this.c.j;
    }

    final String b() {
        return this.c.i;
    }

    public final String toString() {
        return this.a.name() + '@' + this.b;
    }
}
