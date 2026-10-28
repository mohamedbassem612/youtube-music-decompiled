package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class acdt implements acdr {
    private boolean c;
    private boolean d;
    private boolean f;
    private amlg g;
    private long h;
    private int i;
    private int j;
    private long o;
    private Bitmap p;
    private Bitmap q;
    private boolean s;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int a = 0;
    private int b = 0;
    private boolean e = true;
    private CharSequence m = "";
    private CharSequence n = "";
    private CharSequence l = "";
    private CharSequence t = "";
    private float k = 1.0f;
    private abuz z = new abuz();
    private jrj r = jrj.AUDIO_ROUTE_UNSPECIFIED;
    private final aak y = new aak();

    @Override // defpackage.acdr
    public final Bitmap A() {
        aak aakVar = this.y;
        Bitmap bitmap = this.q;
        Object obj = aakVar.c;
        return (!aakVar.a || obj == null) ? bitmap : (Bitmap) obj;
    }

    @Override // defpackage.acdr
    public final jrj B() {
        return this.r;
    }

    @Override // defpackage.acdr
    public final amlg C() {
        return this.g;
    }

    @Override // defpackage.acdr
    public final CharSequence D() {
        return this.l;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.acdr
    public final CharSequence E() {
        CharSequence charSequenceB = typ.b(this.n);
        aak aakVar = this.y;
        ?? r1 = aakVar.d;
        return (!aakVar.a || r1 == 0) ? charSequenceB : r1;
    }

    @Override // defpackage.acdr
    public final CharSequence F() {
        return this.t;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.acdr
    public final CharSequence G() {
        CharSequence charSequenceB = typ.b(this.m);
        aak aakVar = this.y;
        ?? r1 = aakVar.b;
        return (!aakVar.a || r1 == 0) ? charSequenceB : r1;
    }

    @Override // defpackage.acdr
    public final boolean L() {
        return this.e;
    }

    @Override // defpackage.acdr
    public final boolean M() {
        aak aakVar = this.y;
        boolean z = this.f;
        if (aakVar.a) {
            return false;
        }
        return z;
    }

    @Override // defpackage.acdr
    public final boolean N() {
        return this.s;
    }

    @Override // defpackage.acdr
    public final boolean O() {
        return this.d && !this.x;
    }

    @Override // defpackage.acdr
    public final boolean P() {
        return this.c && !this.w;
    }

    @Override // defpackage.acdr
    public final boolean Q() {
        return this.v;
    }

    @Override // defpackage.acdr
    public final boolean R(jrj jrjVar) {
        if (this.r == jrjVar) {
            return false;
        }
        this.r = jrjVar;
        return true;
    }

    @Override // defpackage.acdr
    public final void S() {
        this.b = 4;
    }

    @Override // defpackage.acdr
    public final void T(aboe aboeVar) {
        int i = aboeVar.j;
        boolean zB = aawb.B(i);
        int i2 = acdq.a.get(i - 1, 0);
        String str = aboeVar.c;
        if (zB) {
            m(8);
        }
        CharSequence charSequenceB = typ.b(str);
        if (this.s && this.u == i2 && TextUtils.equals(this.t, charSequenceB)) {
            return;
        }
        this.s = true;
        this.u = i2;
        this.t = charSequenceB;
    }

    @Override // defpackage.acdr
    public final void U(boolean z) {
        if (this.e != z) {
            this.e = z;
        }
    }

    @Override // defpackage.acdr
    public final void V(CharSequence charSequence, CharSequence charSequence2) {
        q(charSequence);
        g(charSequence2);
    }

    @Override // defpackage.acdr
    public final void W(amlg amlgVar) {
        if (this.g != amlgVar) {
            this.g = amlgVar;
        }
    }

    @Override // defpackage.acdr
    public final int X(abuz abuzVar) {
        if (Objects.equals(this.z.l(), abuzVar.l())) {
            return 0;
        }
        this.z = abuzVar;
        return SemanticState.Focused;
    }

    @Override // defpackage.acdr
    public final int Y(abuz abuzVar) {
        return this.y.i(abuzVar);
    }

    @Override // defpackage.acdr
    public final abuz Z() {
        aak aakVar = this.y;
        abuz abuzVar = this.z;
        Object obj = aakVar.f;
        return (!aakVar.a || obj == null) ? abuzVar : (abuz) obj;
    }

    @Override // defpackage.acdr
    public final float a() {
        return this.k;
    }

    @Override // defpackage.acdr
    public final int b() {
        return this.u;
    }

    @Override // defpackage.acdr
    public final int c() {
        aak aakVar = this.y;
        aakVar.e(null);
        aakVar.c(null);
        aakVar.d(null, null);
        aakVar.i(null);
        aakVar.f(false);
        return 524288;
    }

    @Override // defpackage.acdr
    public final int d() {
        return this.a;
    }

    @Override // defpackage.acdr
    public final int e() {
        int i;
        int iM = m(this.b) | j(false, false) | o(false, false) | h(false) | i(0L) | n(0L) | q("") | g("") | f("");
        if (this.s) {
            this.s = false;
            this.u = 0;
            this.t = "";
            i = 65536;
        } else {
            i = 0;
        }
        int iX = iM | i | X(new abuz()) | p(null, null) | k(false);
        c();
        return iX | 524288;
    }

    @Override // defpackage.acdr
    public final int f(CharSequence charSequence) {
        CharSequence charSequenceB = typ.b(charSequence);
        if (TextUtils.equals(this.l, charSequenceB)) {
            return 0;
        }
        this.l = charSequenceB;
        return SemanticState.ReadOnly;
    }

    @Override // defpackage.acdr
    public final int g(CharSequence charSequence) {
        CharSequence charSequenceB = typ.b(charSequence);
        if (TextUtils.equals(this.n, charSequenceB)) {
            return 0;
        }
        this.n = charSequenceB;
        return 64;
    }

    @Override // defpackage.acdr
    public final int h(boolean z) {
        if (this.f == z) {
            return 0;
        }
        this.f = z;
        return 4;
    }

    @Override // defpackage.acdr
    public final int i(long j) {
        if (this.o == j) {
            return 0;
        }
        this.o = j;
        return 8;
    }

    @Override // defpackage.acdr
    public final int j(boolean z, boolean z2) {
        if (this.c == z && this.d == z2) {
            return 0;
        }
        this.c = z;
        this.d = z2;
        return 2;
    }

    @Override // defpackage.acdr
    public final int k(boolean z) {
        if (this.v == z) {
            return 0;
        }
        this.v = z;
        return 262144;
    }

    @Override // defpackage.acdr
    public final int l(float f) {
        if (this.k == f) {
            return 0;
        }
        this.k = f;
        return 32768;
    }

    @Override // defpackage.acdr
    public final int m(int i) {
        if (this.a == i) {
            return 0;
        }
        this.a = i;
        return 1;
    }

    @Override // defpackage.acdr
    public final int n(long j) {
        if (this.h == j) {
            return 0;
        }
        this.h = j;
        return 16;
    }

    @Override // defpackage.acdr
    public final int o(boolean z, boolean z2) {
        if (this.w == z && this.x == z2) {
            return 0;
        }
        this.w = z;
        this.x = z2;
        return 2;
    }

    @Override // defpackage.acdr
    public final int p(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null && bitmap2 == null && this.p == null && this.q == null) {
            return 0;
        }
        this.p = bitmap;
        this.q = bitmap2;
        return SemanticState.Hidden;
    }

    @Override // defpackage.acdr
    public final int q(CharSequence charSequence) {
        CharSequence charSequenceB = typ.b(charSequence);
        if (TextUtils.equals(this.m, charSequenceB)) {
            return 0;
        }
        this.m = charSequenceB;
        return 32;
    }

    @Override // defpackage.acdr
    public final int r(CharSequence charSequence) {
        return this.y.c(charSequence);
    }

    @Override // defpackage.acdr
    public final int s(Bitmap bitmap, Bitmap bitmap2) {
        return this.y.d(bitmap, bitmap2);
    }

    @Override // defpackage.acdr
    public final int t(CharSequence charSequence) {
        return this.y.e(charSequence);
    }

    @Override // defpackage.acdr
    public final int u(int i, int i2) {
        this.i = i;
        this.j = i2;
        return 131072;
    }

    @Override // defpackage.acdr
    public final int v() {
        return this.i;
    }

    @Override // defpackage.acdr
    public final int w() {
        return this.j;
    }

    @Override // defpackage.acdr
    public final long x() {
        return this.o;
    }

    @Override // defpackage.acdr
    public final long y() {
        return this.h;
    }

    @Override // defpackage.acdr
    public final Bitmap z() {
        aak aakVar = this.y;
        Bitmap bitmap = this.p;
        Object obj = aakVar.e;
        return (!aakVar.a || obj == null) ? bitmap : (Bitmap) obj;
    }

    @Override // defpackage.acdr
    public final void H() {
    }

    @Override // defpackage.acdr
    public final void J() {
    }

    @Override // defpackage.acdr
    public final void I(acdp acdpVar) {
    }

    @Override // defpackage.acdr
    public final void K(acdp acdpVar) {
    }
}
