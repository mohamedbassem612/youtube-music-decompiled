package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class acfx extends acge {
    public volatile boolean d;
    public boolean e;
    public volatile int f;

    public acfx(long j, long j2, boolean z, String str) {
        super(j, j2, 0, str);
        this.e = z;
        this.d = true;
        this.f = 1;
    }

    public boolean b() {
        return false;
    }

    protected void d(boolean z, boolean z2, boolean z3, long j) {
        a(z, z2, z3);
    }

    public final synchronized void g(acgb acgbVar) {
        this.g.b = acgbVar.a;
        this.h.b = acgbVar.b;
    }

    public final synchronized void h(boolean z, boolean z2, boolean z3, long j) {
        if (this.d) {
            d(z, z2, z3, j);
        }
    }

    public final synchronized void i(long j) {
        if (k() < j) {
            this.h.b = j;
        }
    }

    public final synchronized void j(long j) {
        if (this.d) {
            c(j);
        }
    }

    public acfx(long j, long j2, int i, int i2, String str) {
        super(j, j2, i - 1, str);
        this.d = true;
        this.f = i2;
    }

    protected void c(long j) {
    }

    protected void e(long j) {
    }

    protected void a(boolean z, boolean z2, boolean z3) {
    }

    protected void f(long j, acgb acgbVar, acgb acgbVar2) {
    }
}
