package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ywb implements ywn {
    private int a;
    private ywn c;

    public ywb(int i, ywn ywnVar) {
        this.a = i;
        this.c = ywnVar;
    }

    private final synchronized void B() {
        int i = this.a;
        if (i == 0) {
            this.c = ywn.b;
        } else {
            this.a = i - 1;
        }
    }

    @Override // defpackage.ywn
    public final synchronized void A(int i) {
        B();
        this.c.A(i);
    }

    @Override // defpackage.ywn
    public final synchronized long a() {
        return this.c.a();
    }

    @Override // defpackage.ywn
    public final synchronized long b() {
        return this.c.b();
    }

    @Override // defpackage.ywn
    public final synchronized ywn c(ywj ywjVar) {
        return this.c.c(ywjVar);
    }

    @Override // defpackage.ywn
    public final synchronized String d() {
        return this.c.d();
    }

    @Override // defpackage.ywn
    public final synchronized void e(long j, long j2) {
        B();
        this.c.e(j, j2);
    }

    @Override // defpackage.ywn
    public final synchronized void f(long j) {
        this.c.f(j);
    }

    @Override // defpackage.ywn
    public final synchronized void g(long j, boolean z, boolean z2, boolean z3, String str, String str2) {
        B();
        this.c.g(j, z, z2, z3, str, str2);
    }

    @Override // defpackage.ywn
    public final synchronized void h(zhc zhcVar) {
        B();
        this.c.h(zhcVar);
    }

    @Override // defpackage.ywn
    public final synchronized void i(String str) {
        B();
        this.c.i("1");
    }

    @Override // defpackage.ywn
    public final synchronized void j(int i, boolean z) {
        B();
        this.c.j(i, z);
    }

    @Override // defpackage.ywn
    public final synchronized void k(zhz zhzVar) {
        B();
        this.c.k(zhzVar);
    }

    @Override // defpackage.ywn
    public final synchronized void l(String str, String str2) {
        B();
        this.c.l(str, str2);
    }

    @Override // defpackage.ywn
    public final synchronized void m(boolean z) {
        B();
        this.c.m(z);
    }

    @Override // defpackage.ywn
    public final synchronized void n(long j, long j2, long j3, long j4, long j5) {
        B();
        this.c.n(j, j2, j3, j4, j5);
    }

    @Override // defpackage.ywn
    public final synchronized void o(long j, long j2) {
        B();
        this.c.o(j, j2);
    }

    @Override // defpackage.ywn
    public final synchronized void p(boolean z, boolean z2) {
        B();
        this.c.p(z, z2);
    }

    @Override // defpackage.ywn
    public final synchronized void q(int i, boolean z) {
        B();
        this.c.q(i, z);
    }

    @Override // defpackage.ywn
    public final synchronized void r(appa appaVar) {
        B();
        this.c.r(appaVar);
    }

    @Override // defpackage.ywn
    public final synchronized void s(int i, boolean z) {
        B();
        this.c.s(i, z);
    }

    @Override // defpackage.ywn
    public final synchronized void t(boolean z, boolean z2) {
        B();
        this.c.t(z, z2);
    }

    @Override // defpackage.ywn
    public final synchronized void u(zgh zghVar, long j, long j2, long j3) {
        B();
        this.c.u(zghVar, j, j2, j3);
    }

    @Override // defpackage.ywn
    public final synchronized void v(int i) {
        B();
        this.c.v(i);
    }

    @Override // defpackage.ywn
    public final synchronized void w(String str, String str2) {
        B();
        this.c.w(str, str2);
    }

    @Override // defpackage.ywn
    public final synchronized void x(String str) {
        B();
        this.c.x(str);
    }

    @Override // defpackage.ywn
    public final synchronized void y(String str) {
        B();
        this.c.y(str);
    }

    @Override // defpackage.ywn
    public final synchronized void z(float f, float f2) {
        B();
        this.c.z(f, f2);
    }
}
