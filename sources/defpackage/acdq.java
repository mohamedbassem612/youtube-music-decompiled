package defpackage;

import android.graphics.Bitmap;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acdq {
    static final SparseIntArray a;
    public final acdr b;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 1);
        sparseIntArray.put(3, 1);
        sparseIntArray.put(4, 6);
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 1);
        sparseIntArray.put(7, 1);
        sparseIntArray.put(8, 5);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        sparseIntArray.put(11, 1);
        sparseIntArray.put(12, 4);
        sparseIntArray.put(13, 4);
        sparseIntArray.put(14, 1);
    }

    public acdq(abmt abmtVar) {
        if (abmtVar.K()) {
            this.b = new acdt();
        } else {
            this.b = new acds();
        }
    }

    public final boolean A() {
        return this.b.M();
    }

    public final boolean B() {
        return this.b.O();
    }

    public final boolean C() {
        return this.b.P();
    }

    public final boolean D() {
        return this.b.Q();
    }

    public final boolean E(jrj jrjVar) {
        return this.b.R(jrjVar);
    }

    public final void F(CharSequence charSequence) {
        this.b.f(charSequence);
    }

    public final void G(boolean z) {
        this.b.U(z);
    }

    public final void H(boolean z) {
        this.b.k(z);
    }

    public final void I(CharSequence charSequence, CharSequence charSequence2) {
        this.b.V(charSequence, charSequence2);
    }

    public final void J(amlg amlgVar) {
        this.b.W(amlgVar);
    }

    public final int K(abuz abuzVar) {
        return this.b.X(abuzVar);
    }

    public final abuz L() {
        return this.b.Z();
    }

    public final float a() {
        return this.b.a();
    }

    public final int b() {
        return this.b.d();
    }

    public final int c() {
        return this.b.e();
    }

    public final int d(boolean z) {
        return this.b.h(z);
    }

    public final int e(long j) {
        return this.b.i(j);
    }

    public final int f(boolean z, boolean z2) {
        return this.b.j(z, z2);
    }

    public final int g(float f) {
        return this.b.l(f);
    }

    public final int h(int i) {
        return this.b.m(i);
    }

    public final int i(long j) {
        return this.b.n(j);
    }

    public final int j(boolean z, boolean z2) {
        return this.b.o(z, z2);
    }

    public final int k(Bitmap bitmap, Bitmap bitmap2) {
        return this.b.p(bitmap, bitmap2);
    }

    public final int l(CharSequence charSequence) {
        return this.b.q(charSequence);
    }

    public final int m(int i, int i2) {
        return this.b.u(i, i2);
    }

    public final long n() {
        return this.b.x();
    }

    public final long o() {
        return this.b.y();
    }

    public final Bitmap p() {
        return this.b.z();
    }

    public final Bitmap q() {
        return this.b.A();
    }

    public final amlg r() {
        return this.b.C();
    }

    public final CharSequence s() {
        return this.b.D();
    }

    public final CharSequence t() {
        return this.b.E();
    }

    public final CharSequence u() {
        return this.b.G();
    }

    final void v() {
        this.b.H();
    }

    public final void w(acdp acdpVar) {
        this.b.I(acdpVar);
    }

    final void x() {
        this.b.J();
    }

    public final void y(acdp acdpVar) {
        this.b.K(acdpVar);
    }

    public final boolean z() {
        return this.b.L();
    }

    public acdq() {
        this.b = new acds();
    }
}
