package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class cqp {
    public final int a;
    public final bto b;
    public final int c;
    public final bse d;

    public cqp(int i, bto btoVar, int i2) {
        this.a = i;
        this.b = btoVar;
        this.c = i2;
        this.d = btoVar.b(i2);
    }

    public abstract int b();

    public abstract boolean c(cqp cqpVar);
}
