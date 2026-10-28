package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zjf {
    final double a;
    final boolean b;

    public zjf(double d, boolean z) {
        zkf.a(d > 0.0d);
        this.a = 1.0d - Math.exp((-0.6931471805599453d) / d);
        this.b = z;
    }
}
