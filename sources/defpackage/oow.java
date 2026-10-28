package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oow {
    public qnl A;
    public qnl B;
    public qnl C;
    public qnl D;
    private aga E;
    private aga F;
    private ComponentConfig G;
    private oui H;
    private final Optional I = Optional.empty();
    public ExecutorService a;
    public Context b;
    public float c;
    public agfr d;
    public agfr e;
    public DisplayMetrics f;
    public Resources g;
    public int h;
    public osd i;
    public orq j;
    public ool k;
    public agfr l;
    public nrr m;
    public agfr n;
    public agfr o;
    public agfr p;
    public agfr q;
    public agfr r;
    public agfr s;
    public oos t;
    public agfr u;
    public byte v;
    public adgf w;
    public qpu x;
    public aber y;
    public kjc z;

    public final ElementsServices a() {
        if (this.v == 3 && this.a != null && this.b != null && this.A != null && this.D != null && this.C != null && this.B != null && this.d != null && this.e != null && this.f != null && this.g != null && this.x != null && this.E != null && this.F != null && this.G != null && this.H != null && this.i != null && this.j != null && this.k != null && this.l != null && this.m != null) {
            return new oom(this.a, this.b, this.A, this.D, this.C, this.B, this.c, this.d, this.e, this.f, this.g, this.x, this.E, this.F, this.G, this.H, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.z, this.w, this.q, this.r, this.s, this.t, this.I, this.u, this.y);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" backgroundExecutorService");
        }
        if (this.b == null) {
            sb.append(" context");
        }
        if (this.A == null) {
            sb.append(" viewProcessorContextFactory");
        }
        if (this.D == null) {
            sb.append(" measureFunctionFactory");
        }
        if (this.C == null) {
            sb.append(" elementsRuntimeFactory");
        }
        if (this.B == null) {
            sb.append(" uiBuilderCallbackFactory");
        }
        if ((this.v & 1) == 0) {
            sb.append(" displayDensity");
        }
        if (this.d == null) {
            sb.append(" byteStore");
        }
        if (this.e == null) {
            sb.append(" componentSharedResources");
        }
        if (this.f == null) {
            sb.append(" displayMetrics");
        }
        if (this.g == null) {
            sb.append(" resources");
        }
        if (this.x == null) {
            sb.append(" typeExtensionHandlers");
        }
        if (this.E == null) {
            sb.append(" propertiesExtensionHandlers");
        }
        if (this.F == null) {
            sb.append(" imageProcessorHandlers");
        }
        if (this.G == null) {
            sb.append(" componentConfig");
        }
        if (this.H == null) {
            sb.append(" logger");
        }
        if ((this.v & 2) == 0) {
            sb.append(" layoutDirection");
        }
        if (this.i == null) {
            sb.append(" environmentDataProvider");
        }
        if (this.j == null) {
            sb.append(" commandResolver");
        }
        if (this.k == null) {
            sb.append(" clock");
        }
        if (this.l == null) {
            sb.append(" textPaint");
        }
        if (this.m == null) {
            sb.append(" collectionScrollerRegistry");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final void b(Map map) {
        qpu qpuVarH = h();
        if (qpuVarH.a == null) {
            qpuVarH.a = new HashMap();
        }
        qpuVarH.a.putAll(map);
    }

    public final void c(ComponentConfig componentConfig) {
        if (componentConfig == null) {
            throw new NullPointerException("Null componentConfig");
        }
        this.G = componentConfig;
    }

    public final void d(aga agaVar) {
        if (agaVar == null) {
            throw new NullPointerException("Null imageProcessorHandlers");
        }
        this.F = agaVar;
    }

    public final void e(oui ouiVar) {
        if (ouiVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.H = ouiVar;
    }

    public final void f(aga agaVar) {
        if (agaVar == null) {
            throw new NullPointerException("Null propertiesExtensionHandlers");
        }
        this.E = agaVar;
    }

    public final void g(aga agaVar) {
        h().b = agaVar;
    }

    public final qpu h() {
        qpu qpuVar = this.x;
        if (qpuVar != null) {
            return qpuVar;
        }
        throw new IllegalStateException("Property \"typeExtensionHandlers\" has not been set");
    }
}
