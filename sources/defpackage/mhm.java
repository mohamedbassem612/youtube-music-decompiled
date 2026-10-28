package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.interfaces.JSControllerInitializationMode;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhm {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public JSControllerInitializationMode a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public byte[] i;
    public boolean j;
    public int k;
    public int l;
    public String m;
    public int n;
    public boolean o;
    public final Optional p = Optional.empty();
    public boolean q;
    public long r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public final void A(boolean z) {
        this.e = z;
        this.G |= 8;
    }

    public final void B(boolean z) {
        this.o = z;
        this.G |= SemanticState.Modal;
    }

    public final void C(boolean z) {
        this.E = z;
        this.G |= 67108864;
    }

    public final void D(int i) {
        this.c = i;
        this.G |= 2;
    }

    public final void a(boolean z) {
        this.y = z;
        this.G |= 1048576;
    }

    public final void b(boolean z) {
        this.C = z;
        this.G |= 16777216;
    }

    public final void c(int i) {
        this.k = i;
        this.G |= SemanticState.Hidden;
    }

    public final void d(int i) {
        this.l = i;
        this.G |= SemanticState.LiveRegion;
    }

    public final void e(boolean z) {
        this.u = z;
        this.G |= 65536;
    }

    public final void f(boolean z) {
        this.t = z;
        this.G |= 32768;
    }

    public final void g(int i) {
        this.n = i;
        this.G |= SemanticState.ReadOnly;
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null diskCachePath");
        }
        this.m = str;
    }

    public final void i(boolean z) {
        this.s = z;
        this.G |= 16384;
    }

    public final void j(boolean z) {
        this.w = z;
        this.G |= 262144;
    }

    public final void k(boolean z) {
        this.F = z;
        this.G |= 134217728;
    }

    public final void l(boolean z) {
        this.v = z;
        this.G |= 131072;
    }

    public final void m(boolean z) {
        this.x = z;
        this.G |= 524288;
    }

    public final void n(boolean z) {
        this.D = z;
        this.G |= 33554432;
    }

    public final void o(boolean z) {
        this.b = z;
        this.G |= 1;
    }

    public final void p(boolean z) {
        this.z = z;
        this.G |= 2097152;
    }

    public final void q(boolean z) {
        this.A = z;
        this.G |= 4194304;
    }

    public final void r(boolean z) {
        this.B = z;
        this.G |= 8388608;
    }

    public final void s(String str) {
        if (str == null) {
            throw new NullPointerException("Null extraVmFlags");
        }
        this.h = str;
    }

    public final void t(long j) {
        this.r = j;
        this.G |= SemanticState.Multiline;
    }

    public final void u(boolean z) {
        this.j = z;
        this.G |= SemanticState.Focused;
    }

    public final void v(JSControllerInitializationMode jSControllerInitializationMode) {
        if (jSControllerInitializationMode == null) {
            throw new NullPointerException("Null initializationMode");
        }
        this.a = jSControllerInitializationMode;
    }

    public final void w(boolean z) {
        this.g = z;
        this.G |= 32;
    }

    public final void x(boolean z) {
        this.q = z;
        this.G |= SemanticState.Obscured;
    }

    public final void y(boolean z) {
        this.f = z;
        this.G |= 16;
    }

    public final void z(boolean z) {
        this.d = z;
        this.G |= 4;
    }
}
