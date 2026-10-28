package defpackage;

import android.view.View;
import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import com.google.android.libraries.elements.interfaces.ClientDataObservable;
import com.google.android.libraries.elements.interfaces.ContextSubscriptionInput;
import com.google.android.libraries.elements.interfaces.MaterializationResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nsk {
    private int A;
    private int B;
    private float C;
    private boolean D;
    private WeakReference E;
    private agke F;
    private boolean G;
    private ntx H;
    private boolean I;
    private int J;
    private boolean K;
    private ClientDataObservable L;
    private adfx M;
    public Integer a;
    public Integer b;
    public nwy c;
    public avnq d;
    public nt e;
    public StringBuilder f;
    public String g;
    public String h;
    public WeakReference i;
    public agke j;
    public ntg k;
    public String l;
    public String m;
    public AtomicReference n;
    public MaterializationResult o;
    public String p;
    public String q;
    public String r;
    public BlockRegistryProvider s;
    public nrv t;
    public agfr u;
    public ContextSubscriptionInput v;
    public short w = 1023;
    public mhc x;
    private WeakReference y;
    private int z;

    public nsk(nsl nslVar) {
        this.y = nslVar.b;
        this.a = nslVar.c;
        this.b = nslVar.d;
        this.z = nslVar.e;
        this.A = nslVar.f;
        this.B = nslVar.g;
        this.c = nslVar.h;
        this.d = nslVar.i;
        this.C = nslVar.j;
        this.x = nslVar.L;
        this.e = nslVar.k;
        this.D = nslVar.l;
        this.f = nslVar.m;
        this.g = nslVar.n;
        this.h = nslVar.o;
        this.E = nslVar.p;
        this.i = nslVar.q;
        this.M = nslVar.M;
        this.F = nslVar.r;
        this.j = nslVar.s;
        this.k = nslVar.t;
        this.l = nslVar.u;
        this.m = nslVar.v;
        this.G = nslVar.w;
        this.H = nslVar.x;
        this.I = nslVar.y;
        this.J = nslVar.z;
        this.n = nslVar.A;
        this.o = nslVar.B;
        this.p = nslVar.C;
        this.q = nslVar.D;
        this.K = nslVar.E;
        this.L = nslVar.F;
        this.r = nslVar.G;
        this.s = nslVar.H;
        this.t = nslVar.I;
        this.u = nslVar.J;
        this.v = nslVar.K;
    }

    public final nsl a() {
        if (this.w == 1023 && this.g != null && this.h != null && this.u != null) {
            nsl nslVar = new nsl(this.y, this.a, this.b, this.z, this.A, this.B, this.c, this.d, this.C, this.x, this.e, this.D, this.f, this.g, this.h, this.E, this.i, this.M, this.F, this.j, this.k, this.l, this.m, this.G, this.H, this.I, this.J, this.n, this.o, this.p, this.q, this.K, this.L, this.r, this.s, this.t, this.u, this.v);
            ahno.P(nslVar.x == null || !nslVar.y, "Setting an ElementsConfig overrides other values set on the ConversionContext, like useIncrementalMountOnChildren, useLegacyVisible, and elementsInteractionLogger. Configure them through the ElementsConfig instead of directly on the ConversionContext.");
            return nslVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.w & 1) == 0) {
            sb.append(" gridRowIndex");
        }
        if ((this.w & 2) == 0) {
            sb.append(" gridColumnCount");
        }
        if ((this.w & 4) == 0) {
            sb.append(" gridColumnIndex");
        }
        if ((this.w & 8) == 0) {
            sb.append(" imagePrefetchRangeRatio");
        }
        if ((this.w & 16) == 0) {
            sb.append(" useIncrementalMountOnChildrenInternal");
        }
        if ((this.w & 32) == 0) {
            sb.append(" useLegacyVisibleInternal");
        }
        if (this.g == null) {
            sb.append(" elementId");
        }
        if (this.h == null) {
            sb.append(" identifierProperty");
        }
        if ((this.w & 64) == 0) {
            sb.append(" shouldAddDebuggerViewTags");
        }
        if ((this.w & 128) == 0) {
            sb.append(" couldOverlapWithElementsConfig");
        }
        if ((this.w & 256) == 0) {
            sb.append(" elementDepthInTree");
        }
        if ((this.w & 512) == 0) {
            sb.append(" enableDroppedFrameLogging");
        }
        if (this.u == null) {
            sb.append(" internalComposableRepositorySupplier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(View view) {
        this.y = new WeakReference(view);
    }

    public final void c(boolean z) {
        this.I = z;
        this.w = (short) (this.w | 128);
    }

    public final void d(int i) {
        this.J = i;
        this.w = (short) (this.w | 256);
    }

    public final void e(boolean z) {
        this.K = z;
        this.w = (short) (this.w | 512);
    }

    public final void f(int i) {
        this.A = i;
        this.w = (short) (this.w | 2);
    }

    public final void g(int i) {
        this.B = i;
        this.w = (short) (this.w | 4);
    }

    public final void h(int i) {
        this.z = i;
        this.w = (short) (this.w | 1);
    }

    public final void i(float f) {
        this.C = f;
        this.w = (short) (this.w | 8);
    }

    public final void j(asnu asnuVar) {
        this.E = asnuVar == null ? null : new WeakReference(asnuVar);
    }

    public final void k(boolean z) {
        this.G = z;
        this.w = (short) (this.w | 64);
    }

    public final void l(avlr avlrVar) {
        this.L = avlrVar == null ? null : new nxt(avlrVar);
    }

    public final void m(ntx ntxVar) {
        this.H = ntxVar;
    }

    public final void n(adfx adfxVar) {
        if (adfxVar != null) {
            c(true);
            this.M = adfxVar;
        }
    }

    public final void o(agke agkeVar) {
        c(true);
        this.F = agkeVar;
    }

    public final void p(boolean z) {
        c(true);
        this.D = z;
        this.w = (short) (this.w | 16);
    }
}
