package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mkn implements ntq {
    private static final boolean b = Boolean.getBoolean("force_elements_view_materialization");
    private List A;
    private List B;
    private List C;
    private List D;
    private List E;
    private List F;
    private List G;
    private List H;
    private nbl I;
    private SparseArray J;
    private Map K;
    private Float L;
    private ntf M;
    private String N;
    private final adfx Q;
    private nxq R;
    private mjs S;
    public fgv a;
    private final boolean d;
    private final boolean e;
    private final Optional f;
    private final Optional g;
    private final Optional h;
    private final Optional i;
    private final Optional j;
    private Matrix k;
    private RectF l;
    private asnu m;
    private List n;
    private List o;
    private List p;
    private List q;
    private List r;
    private List s;
    private List t;
    private List u;
    private List v;
    private List w;
    private List x;
    private List y;
    private List z;
    private final Object c = new Object();
    private boolean O = false;
    private boolean P = false;

    public mkn(asnu asnuVar, adfx adfxVar, boolean z, boolean z2, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        this.m = asnuVar;
        this.Q = adfxVar;
        this.d = z;
        this.e = z2;
        this.f = optional;
        this.g = optional2;
        this.h = optional3;
        this.i = optional4;
        this.j = optional5;
    }

    private final void K(fgv fgvVar) {
        nbl nblVar = this.I;
        if (nblVar == null || !(fgvVar instanceof mie)) {
            return;
        }
        ((mie) fgvVar).a.w = nblVar;
    }

    private final void L() {
        if (this.O) {
            throw new IllegalStateException("Element already built!");
        }
    }

    private final void M(nti ntiVar, Optional optional) {
        synchronized (this.c) {
            L();
            if (this.C == null) {
                this.C = new ArrayList();
            }
            boolean zIsPresent = optional.isPresent();
            List list = this.C;
            if (zIsPresent) {
                ((Integer) optional.get()).intValue();
                list.add(0, ntiVar);
            } else {
                list.add(ntiVar);
            }
            this.P = true;
        }
    }

    private final void N(ntp ntpVar, Optional optional) {
        synchronized (this.c) {
            L();
            if (this.B == null) {
                this.B = new ArrayList();
            }
            boolean zIsPresent = optional.isPresent();
            List list = this.B;
            if (zIsPresent) {
                ((Integer) optional.get()).intValue();
                list.add(0, ntpVar);
            } else {
                list.add(ntpVar);
            }
            this.P = true;
        }
    }

    public static void c() {
        ahno.P(Looper.getMainLooper() == Looper.myLooper(), "The code must run on UI thread.");
    }

    @Override // defpackage.ntq
    public final void A(aclc aclcVar) {
        synchronized (this.c) {
            L();
            if (this.t == null) {
                this.t = new ArrayList();
            }
            this.t.add(aclcVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void B(aclc aclcVar) {
        synchronized (this.c) {
            L();
            if (this.s == null) {
                this.s = new ArrayList();
            }
            this.s.add(aclcVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void C(aclc aclcVar) {
        synchronized (this.c) {
            L();
            if (this.r == null) {
                this.r = new ArrayList();
            }
            this.r.add(aclcVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void D(aclc aclcVar) {
        synchronized (this.c) {
            L();
            if (this.q == null) {
                this.q = new ArrayList();
            }
            this.q.add(aclcVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void E(aclc aclcVar) {
        synchronized (this.c) {
            L();
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(aclcVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void F(aclc aclcVar) {
        synchronized (this.c) {
            L();
            if (this.F == null) {
                this.F = new ArrayList();
            }
            this.F.add(aclcVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void G(aclc aclcVar) {
        synchronized (this.c) {
            L();
            if (this.z == null) {
                this.z = new ArrayList();
            }
            this.z.add(aclcVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void H(aclc aclcVar) {
        synchronized (this.c) {
            L();
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(aclcVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void I(aclc aclcVar) {
        synchronized (this.c) {
            L();
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(aclcVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void J(aclc aclcVar) {
        synchronized (this.c) {
            L();
            if (this.w == null) {
                this.w = new ArrayList();
            }
            this.w.add(aclcVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final fgv a() {
        fgv fgvVar = this.a;
        fgvVar.getClass();
        return fgvVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:15:0x0048, B:17:0x004e, B:27:0x007a, B:29:0x0081, B:39:0x00ad, B:41:0x00b4, B:43:0x00b8, B:53:0x00e4, B:45:0x00be, B:47:0x00c7, B:49:0x00cf, B:51:0x00db, B:52:0x00e1, B:31:0x0087, B:33:0x0090, B:35:0x0098, B:37:0x00a4, B:38:0x00aa, B:19:0x0054, B:21:0x005d, B:23:0x0065, B:25:0x0071, B:26:0x0077), top: B:91:0x0048, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:15:0x0048, B:17:0x004e, B:27:0x007a, B:29:0x0081, B:39:0x00ad, B:41:0x00b4, B:43:0x00b8, B:53:0x00e4, B:45:0x00be, B:47:0x00c7, B:49:0x00cf, B:51:0x00db, B:52:0x00e1, B:31:0x0087, B:33:0x0090, B:35:0x0098, B:37:0x00a4, B:38:0x00aa, B:19:0x0054, B:21:0x005d, B:23:0x0065, B:25:0x0071, B:26:0x0077), top: B:91:0x0048, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1 A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:15:0x0048, B:17:0x004e, B:27:0x007a, B:29:0x0081, B:39:0x00ad, B:41:0x00b4, B:43:0x00b8, B:53:0x00e4, B:45:0x00be, B:47:0x00c7, B:49:0x00cf, B:51:0x00db, B:52:0x00e1, B:31:0x0087, B:33:0x0090, B:35:0x0098, B:37:0x00a4, B:38:0x00aa, B:19:0x0054, B:21:0x005d, B:23:0x0065, B:25:0x0071, B:26:0x0077), top: B:91:0x0048, outer: #1 }] */
    @Override // defpackage.ntq
    public final fgy b(fhd fhdVar) {
        fgv fgvVar;
        fgy fgyVarA;
        final asnu asnuVar;
        List list;
        Object obj = this.c;
        synchronized (obj) {
            L();
            final adfx adfxVar = this.Q;
            if (adfxVar != null && (asnuVar = this.m) != null) {
                mkm mkmVar = new mkm(this, adfxVar, asnuVar);
                nti ntiVar = new nti() { // from class: mki
                    @Override // defpackage.nti
                    public final void a(View view) {
                        mkn.c();
                        agke agkeVarQ = agke.q(asnuVar);
                        adfx adfxVar2 = adfxVar;
                        adfxVar2.i(agkeVarQ, 3, new ovf(this.a, view, adfxVar2, 1));
                    }
                };
                Optional optional = this.g;
                if (optional.isPresent() && ((Boolean) optional.get()).booleanValue()) {
                    N(mkmVar, Optional.of(0));
                    M(ntiVar, Optional.of(0));
                } else {
                    s(mkmVar);
                    l(ntiVar);
                }
                synchronized (obj) {
                    try {
                        if (adfxVar.j(asnuVar, 2) || g()) {
                            ntl ntlVar = new ntl() { // from class: mkj
                                @Override // defpackage.ntl
                                public final /* synthetic */ void a(View view, nxg nxgVar, MotionEvent motionEvent) {
                                    mkn.c();
                                    adfxVar.h(asnuVar, 2);
                                }
                            };
                            if (this.n != null) {
                                Optional optional2 = this.f;
                                if (optional2.isPresent() && ((Boolean) optional2.get()).booleanValue()) {
                                    this.n.add(0, ntlVar);
                                } else {
                                    o(ntlVar);
                                }
                            } else {
                                o(ntlVar);
                            }
                        }
                        if (adfxVar.j(asnuVar, 4) || f()) {
                            ntj ntjVar = new ntj() { // from class: mkk
                                @Override // defpackage.ntj
                                public final boolean a(View view, nxg nxgVar) {
                                    mkn.c();
                                    adfxVar.h(asnuVar, 4);
                                    return false;
                                }
                            };
                            if (this.p != null) {
                                Optional optional3 = this.f;
                                if (optional3.isPresent() && ((Boolean) optional3.get()).booleanValue()) {
                                    this.p.add(0, ntjVar);
                                } else {
                                    m(ntjVar);
                                }
                            } else {
                                m(ntjVar);
                            }
                        }
                        if (adfxVar.j(asnuVar, 3) || ((list = this.v) != null && !list.isEmpty())) {
                            ntk ntkVar = new ntk() { // from class: mkl
                                @Override // defpackage.ntk
                                public final void a(View view, nxg nxgVar, nxg nxgVar2, float f, float f2) {
                                    mkn.c();
                                    adfxVar.h(asnuVar, 3);
                                }
                            };
                            if (this.v != null) {
                                Optional optional4 = this.f;
                                if (optional4.isPresent() && ((Boolean) optional4.get()).booleanValue()) {
                                    this.v.add(0, ntkVar);
                                } else {
                                    n(ntkVar);
                                }
                            } else {
                                n(ntkVar);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.O = true;
            if (!this.P || this.d) {
                fgv fgvVarA = a();
                K(fgvVarA);
                fgvVar = fgvVarA;
            } else {
                fgv fgvVarA2 = a();
                K(fgvVarA2);
                if (fgvVarA2 instanceof mie) {
                    mie mieVar = (mie) fgvVarA2;
                    List list2 = this.B;
                    if (list2 != null && !list2.isEmpty()) {
                        mieVar.a.x = true;
                    }
                }
                mko mkoVar = new mko(fhdVar, new mkq());
                mkq mkqVar = mkoVar.a;
                mkqVar.b = fgvVarA2.a();
                BitSet bitSet = mkoVar.d;
                bitSet.set(0);
                mkqVar.E = this.n;
                mkqVar.y = this.p;
                mkqVar.c = this.q;
                mkqVar.v = this.r;
                mkqVar.w = this.s;
                mkqVar.s = this.A;
                mkqVar.J = this.B;
                mkqVar.x = this.e;
                mkqVar.I = this.D;
                mkqVar.G = this.E;
                mkqVar.H = this.F;
                mkqVar.F = this.G;
                mkqVar.u = this.C;
                mkqVar.t = null;
                mkqVar.d = this.H;
                mkqVar.e = this.o;
                mkqVar.g = this.t;
                mkqVar.f = this.u;
                mkqVar.K = this.R;
                bitSet.set(1);
                mkqVar.D = this.v;
                mkqVar.C = this.w;
                mkqVar.B = this.x;
                mkqVar.A = this.y;
                mkqVar.z = this.z;
                mkqVar.a = this.M;
                Optional optional5 = this.h;
                Boolean bool = Boolean.FALSE;
                mkqVar.q = ((Boolean) optional5.orElse(bool)).booleanValue();
                mkqVar.r = ((Boolean) this.j.orElse(bool)).booleanValue();
                fgvVar = mkoVar;
            }
            if (b) {
                fgvVar.Y();
            }
            SparseArray sparseArray = this.J;
            if (sparseArray != null) {
                fgvVar.b.k().F().G(sparseArray);
            }
            if (this.N != null) {
                fgvVar.Y();
                fgvVar.b.k().F().d = this.N;
            }
            mjs mjsVar = this.S;
            fgv fgvVar2 = fgvVar;
            if (mjsVar != null) {
                mjo mjoVar = new mjo(fhdVar, new mjq());
                mjq mjqVar = mjoVar.a;
                mjqVar.a = fgvVar.a();
                BitSet bitSet2 = mjoVar.d;
                bitSet2.set(0);
                mjqVar.c = mjsVar;
                bitSet2.set(1);
                mjqVar.b = ((Boolean) this.i.orElse(Boolean.FALSE)).booleanValue();
                bitSet2.set(2);
                fgvVar2 = mjoVar;
            }
            fgyVarA = fgvVar2.a();
        }
        return fgyVarA;
    }

    @Override // defpackage.ntq
    public final void d(asnu asnuVar) {
        this.m = asnuVar;
    }

    @Override // defpackage.ntq
    public final boolean e() {
        List list = this.o;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.ntq
    public final boolean f() {
        List list = this.p;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.ntq
    public final boolean g() {
        List list = this.n;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final Rect h(View view, adfx adfxVar) {
        Float fValueOf = this.L;
        if (fValueOf == null) {
            fValueOf = Float.valueOf(view.getContext().getResources().getDisplayMetrics().density);
            this.L = fValueOf;
        }
        fValueOf.getClass();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float fFloatValue = iArr[0] / this.L.floatValue();
        float fFloatValue2 = iArr[1] / this.L.floatValue();
        boolean z = adfxVar.d;
        int iP = rpi.p(fFloatValue);
        int iP2 = rpi.p(fFloatValue2);
        if (!z) {
            return new Rect(iP, iP2, rpi.p((iArr[0] + view.getWidth()) / this.L.floatValue()), rpi.p((iArr[1] + view.getHeight()) / this.L.floatValue()));
        }
        float width = view.getWidth();
        float height = view.getHeight();
        Matrix matrix = this.k;
        if (matrix == null) {
            matrix = new Matrix();
            this.k = matrix;
        }
        matrix.set(view.getMatrix());
        boolean z2 = !view.getMatrix().isIdentity();
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (!view2.getMatrix().isIdentity()) {
                matrix.postConcat(view2.getMatrix());
                z2 = true;
            }
            parent = view2.getParent();
        }
        if (z2) {
            RectF rectF = this.l;
            if (rectF == null) {
                rectF = new RectF();
                this.l = rectF;
            }
            rectF.set(0.0f, 0.0f, width, height);
            matrix.mapRect(rectF);
            width = rectF.width();
            height = rectF.height();
        }
        return new Rect(iP, iP2, Math.round(width / this.L.floatValue()) + iP, Math.round(height / this.L.floatValue()) + iP2);
    }

    @Override // defpackage.ntq
    public final void i(asmn asmnVar, Float f) {
        synchronized (this.c) {
            L();
            if (this.K == null) {
                this.K = new EnumMap(asmn.class);
            }
            this.K.put(asmnVar, f);
        }
    }

    @Override // defpackage.ntq
    public final void j(mpt mptVar) {
        synchronized (this.c) {
            L();
            if (this.H == null) {
                this.H = new ArrayList();
            }
            this.H.add(mptVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void k(ntp ntpVar) {
        synchronized (this.c) {
            L();
            if (this.A == null) {
                this.A = new ArrayList();
            }
            this.A.add(ntpVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void l(nti ntiVar) {
        M(ntiVar, Optional.empty());
    }

    @Override // defpackage.ntq
    public final void m(ntj ntjVar) {
        synchronized (this.c) {
            L();
            if (this.p == null) {
                this.p = new ArrayList();
            }
            this.p.add(ntjVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void n(ntk ntkVar) {
        synchronized (this.c) {
            L();
            if (this.v == null) {
                this.v = new ArrayList();
            }
            this.v.add(ntkVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void o(ntl ntlVar) {
        synchronized (this.c) {
            L();
            if (this.n == null) {
                this.n = new ArrayList();
            }
            this.n.add(ntlVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void p(ntm ntmVar) {
        synchronized (this.c) {
            L();
            if (this.G == null) {
                this.G = new ArrayList();
            }
            this.G.add(ntmVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void q(ntn ntnVar) {
        synchronized (this.c) {
            L();
            if (this.E == null) {
                this.E = new ArrayList();
            }
            this.E.add(ntnVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void r(nto ntoVar) {
        synchronized (this.c) {
            L();
            if (this.D == null) {
                this.D = new ArrayList();
            }
            this.D.add(ntoVar);
            this.P = true;
        }
    }

    @Override // defpackage.ntq
    public final void s(ntp ntpVar) {
        N(ntpVar, Optional.empty());
    }

    @Override // defpackage.ntq
    public final void t(int i, Object obj) {
        synchronized (this.c) {
            L();
            SparseArray sparseArray = this.J;
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                this.J = sparseArray;
            }
            sparseArray.put(i, obj);
        }
    }

    @Override // defpackage.ntq
    public final void u(ntf ntfVar) {
        this.M = ntfVar;
    }

    @Override // defpackage.ntq
    public final void v(mjs mjsVar) {
        this.S = mjsVar;
        Map map = this.K;
        if (map != null) {
            mjsVar.b(map);
        }
    }

    @Override // defpackage.ntq
    public final void w(nbl nblVar) {
        this.I = nblVar;
    }

    @Override // defpackage.ntq
    public final void x(nxq nxqVar) {
        this.R = nxqVar;
    }

    @Override // defpackage.ntq
    public final void y(String str) {
        synchronized (this.c) {
            L();
            this.N = str;
        }
    }

    @Override // defpackage.ntq
    public final void z(aclc aclcVar) {
        synchronized (this.c) {
            L();
            if (this.u == null) {
                this.u = new ArrayList();
            }
            this.u.add(aclcVar);
            this.P = true;
        }
    }
}
