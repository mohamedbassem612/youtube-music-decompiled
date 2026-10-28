package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class acds implements acdr {
    private boolean A;
    private int b;
    private boolean f;
    private boolean g;
    private boolean i;
    private amlg j;
    private long k;
    private long l;
    private int m;
    private int n;
    private Bitmap s;
    private Bitmap t;
    private boolean v;
    private int x;
    private boolean y;
    private boolean z;
    private final AtomicBoolean a = new AtomicBoolean();
    private final Set c = new CopyOnWriteArraySet();
    private int d = 0;
    private int e = 0;
    private boolean h = true;
    private CharSequence p = "";
    private CharSequence q = "";
    private CharSequence r = "";
    private CharSequence w = "";
    private float o = 1.0f;
    private abuz B = new abuz();
    private jrj u = jrj.AUDIO_ROUTE_UNSPECIFIED;

    private final void aa(int i) {
        this.b |= i;
        if (this.a.get()) {
            return;
        }
        if (this.b != 0) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((acdp) it.next()).gU(this.b);
            }
        }
        this.b = 0;
    }

    @Override // defpackage.acdr
    public final Bitmap A() {
        return this.t;
    }

    @Override // defpackage.acdr
    public final jrj B() {
        return this.u;
    }

    @Override // defpackage.acdr
    public final amlg C() {
        return this.j;
    }

    @Override // defpackage.acdr
    public final CharSequence D() {
        return this.r;
    }

    @Override // defpackage.acdr
    public final CharSequence E() {
        return this.q;
    }

    @Override // defpackage.acdr
    public final CharSequence F() {
        return this.w;
    }

    @Override // defpackage.acdr
    public final CharSequence G() {
        return this.p;
    }

    @Override // defpackage.acdr
    public final void H() {
        if (!this.a.compareAndSet(true, false)) {
            throw new IllegalStateException();
        }
        aa(0);
    }

    @Override // defpackage.acdr
    public final void I(acdp acdpVar) {
        this.c.add(acdpVar);
    }

    @Override // defpackage.acdr
    public final void J() {
        if (!this.a.compareAndSet(false, true)) {
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.acdr
    public final void K(acdp acdpVar) {
        this.c.remove(acdpVar);
    }

    @Override // defpackage.acdr
    public final boolean L() {
        return this.h;
    }

    @Override // defpackage.acdr
    public final boolean M() {
        return this.i;
    }

    @Override // defpackage.acdr
    public final boolean N() {
        return this.v;
    }

    @Override // defpackage.acdr
    public final boolean O() {
        return this.g && !this.A;
    }

    @Override // defpackage.acdr
    public final boolean P() {
        return this.f && !this.z;
    }

    @Override // defpackage.acdr
    public final boolean Q() {
        return this.y;
    }

    @Override // defpackage.acdr
    public final boolean R(jrj jrjVar) {
        if (this.u == jrjVar) {
            return false;
        }
        this.u = jrjVar;
        aa(SemanticState.Obscured);
        return true;
    }

    @Override // defpackage.acdr
    public final void S() {
        this.e = 4;
    }

    @Override // defpackage.acdr
    public final void T(aboe aboeVar) {
        int i = aboeVar.j;
        boolean zB = aawb.B(i);
        int i2 = acdq.a.get(i - 1, 0);
        String str = aboeVar.c;
        J();
        if (zB) {
            m(8);
        }
        CharSequence charSequenceB = typ.b(str);
        if (!this.v || this.x != i2 || !TextUtils.equals(this.w, charSequenceB)) {
            this.v = true;
            this.x = i2;
            this.w = charSequenceB;
            aa(65536);
        }
        H();
    }

    @Override // defpackage.acdr
    public final void U(boolean z) {
        if (this.h != z) {
            this.h = z;
            aa(SemanticState.LiveRegion);
        }
    }

    @Override // defpackage.acdr
    public final void V(CharSequence charSequence, CharSequence charSequence2) {
        int i;
        int i2 = typ.a;
        if (charSequence == null) {
            charSequence = "";
        }
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        if (TextUtils.equals(this.p, charSequence)) {
            i = 0;
        } else {
            this.p = charSequence;
            i = 32;
        }
        if (!TextUtils.equals(this.q, charSequence2)) {
            this.q = charSequence2;
            i |= 64;
        }
        if (i != 0) {
            aa(i);
        }
    }

    @Override // defpackage.acdr
    public final void W(amlg amlgVar) {
        if (this.j != amlgVar) {
            this.j = amlgVar;
            aa(SemanticState.Multiline);
        }
    }

    @Override // defpackage.acdr
    public final int X(abuz abuzVar) {
        if (Objects.equals(this.B.l(), abuzVar.l())) {
            return 0;
        }
        this.B = abuzVar;
        aa(SemanticState.Focused);
        return 0;
    }

    @Override // defpackage.acdr
    public final /* synthetic */ int Y(abuz abuzVar) {
        return 0;
    }

    @Override // defpackage.acdr
    public final abuz Z() {
        return this.B;
    }

    @Override // defpackage.acdr
    public final float a() {
        return this.o;
    }

    @Override // defpackage.acdr
    public final int b() {
        return this.x;
    }

    @Override // defpackage.acdr
    public final /* synthetic */ int c() {
        return 0;
    }

    @Override // defpackage.acdr
    public final int d() {
        return this.d;
    }

    @Override // defpackage.acdr
    public final int e() {
        J();
        m(this.e);
        j(false, false);
        o(false, false);
        h(false);
        i(0L);
        n(0L);
        V(null, null);
        f(null);
        if (this.v) {
            this.v = false;
            this.x = 0;
            this.w = "";
            aa(65536);
        }
        X(new abuz());
        p(null, null);
        k(false);
        H();
        return 0;
    }

    @Override // defpackage.acdr
    public final int f(CharSequence charSequence) {
        int i = typ.a;
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.r, charSequence)) {
            return 0;
        }
        this.r = charSequence;
        aa(SemanticState.ReadOnly);
        return 0;
    }

    @Override // defpackage.acdr
    public final int g(CharSequence charSequence) {
        CharSequence charSequenceB = typ.b(charSequence);
        if (TextUtils.equals(this.q, charSequenceB)) {
            return 0;
        }
        this.q = charSequenceB;
        aa(64);
        return 0;
    }

    @Override // defpackage.acdr
    public final int h(boolean z) {
        if (this.i == z) {
            return 0;
        }
        this.i = z;
        aa(4);
        return 0;
    }

    @Override // defpackage.acdr
    public final int i(long j) {
        if (this.k == j) {
            return 0;
        }
        this.k = j;
        aa(8);
        return 0;
    }

    @Override // defpackage.acdr
    public final int j(boolean z, boolean z2) {
        if (this.f == z && this.g == z2) {
            return 0;
        }
        this.f = z;
        this.g = z2;
        aa(2);
        return 0;
    }

    @Override // defpackage.acdr
    public final int k(boolean z) {
        if (this.y == z) {
            return 0;
        }
        this.y = z;
        aa(262144);
        return 0;
    }

    @Override // defpackage.acdr
    public final int l(float f) {
        if (this.o == f) {
            return 0;
        }
        this.o = f;
        aa(32768);
        return 0;
    }

    @Override // defpackage.acdr
    public final int m(int i) {
        if (this.d == i) {
            return 0;
        }
        this.d = i;
        aa(1);
        return 0;
    }

    @Override // defpackage.acdr
    public final int n(long j) {
        if (this.l == j) {
            return 0;
        }
        this.l = j;
        aa(16);
        return 0;
    }

    @Override // defpackage.acdr
    public final int o(boolean z, boolean z2) {
        if (this.z == z && this.A == z2) {
            return 0;
        }
        this.z = z;
        this.A = z2;
        aa(2);
        return 0;
    }

    @Override // defpackage.acdr
    public final int p(Bitmap bitmap, Bitmap bitmap2) {
        this.s = bitmap;
        this.t = bitmap2;
        aa(SemanticState.Hidden);
        return 0;
    }

    @Override // defpackage.acdr
    public final int q(CharSequence charSequence) {
        CharSequence charSequenceB = typ.b(charSequence);
        if (TextUtils.equals(this.p, charSequenceB)) {
            return 0;
        }
        this.p = charSequenceB;
        aa(32);
        return 0;
    }

    @Override // defpackage.acdr
    public final /* synthetic */ int r(CharSequence charSequence) {
        return 0;
    }

    @Override // defpackage.acdr
    public final /* synthetic */ int s(Bitmap bitmap, Bitmap bitmap2) {
        return 0;
    }

    @Override // defpackage.acdr
    public final /* synthetic */ int t(CharSequence charSequence) {
        return 0;
    }

    @Override // defpackage.acdr
    public final int u(int i, int i2) {
        this.m = i;
        this.n = i2;
        aa(131072);
        return 0;
    }

    @Override // defpackage.acdr
    public final int v() {
        return this.m;
    }

    @Override // defpackage.acdr
    public final int w() {
        return this.n;
    }

    @Override // defpackage.acdr
    public final long x() {
        return this.k;
    }

    @Override // defpackage.acdr
    public final long y() {
        return this.l;
    }

    @Override // defpackage.acdr
    public final Bitmap z() {
        return this.s;
    }
}
