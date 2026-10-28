package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.interfaces.ComponentConfig;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxx {
    public boolean a;
    public int b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;

    public static nxx a() {
        nxx nxxVar = new nxx();
        nxxVar.t();
        nxxVar.x(false);
        nxxVar.a = true;
        nxxVar.b |= 4;
        nxxVar.u(false);
        nxxVar.v(false);
        nxxVar.h(0);
        nxxVar.b |= 64;
        nxxVar.l(false);
        nxxVar.s(false);
        nxxVar.n(false);
        nxxVar.e(false);
        nxxVar.b |= SemanticState.Modal;
        nxxVar.o(false);
        nxxVar.r(false);
        nxxVar.g(false);
        nxxVar.f(false);
        nxxVar.p(false);
        nxxVar.w(false);
        nxxVar.m(false);
        nxxVar.b |= 524288;
        nxxVar.k(false);
        nxxVar.j(false);
        nxxVar.q(false);
        nxxVar.i(false);
        nxxVar.d(0);
        nxxVar.c(0);
        return nxxVar;
    }

    public final ComponentConfig b() {
        if (this.b == 67108863) {
            return new ComponentConfig(false, this.c, this.a, this.d, this.e, this.f, false, this.g, this.h, this.i, this.j, false, this.k, this.l, this.m, this.n, this.o, this.p, this.q, false, this.r, this.s, this.t, this.u, this.v, this.w);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" reuseSubscriptionProcessors");
        }
        if ((this.b & 2) == 0) {
            sb.append(" useSubscriptionProcessorMap");
        }
        if ((this.b & 4) == 0) {
            sb.append(" usePriorModelHash");
        }
        if ((this.b & 8) == 0) {
            sb.append(" suppressPriorModelCheck");
        }
        if ((this.b & 16) == 0) {
            sb.append(" useElementProtoPtr");
        }
        if ((this.b & 32) == 0) {
            sb.append(" elementHashMode");
        }
        if ((this.b & 64) == 0) {
            sb.append(" disableFbConversion");
        }
        if ((this.b & SemanticState.Focused) == 0) {
            sb.append(" enableEkoMathPerCharacterParsing");
        }
        if ((this.b & SemanticState.Hidden) == 0) {
            sb.append(" enableWasmPerformanceLogging");
        }
        if ((this.b & SemanticState.LiveRegion) == 0) {
            sb.append(" enableKnownFieldsModelParsing");
        }
        if ((this.b & SemanticState.ReadOnly) == 0) {
            sb.append(" componentClearStateOnSet");
        }
        if ((this.b & SemanticState.Modal) == 0) {
            sb.append(" disableSharedElementArenaAllocation");
        }
        if ((this.b & SemanticState.Obscured) == 0) {
            sb.append(" enableNativeTemplateResolution");
        }
        if ((this.b & SemanticState.Multiline) == 0) {
            sb.append(" enableWasmNoSerialization");
        }
        if ((this.b & 16384) == 0) {
            sb.append(" eagerlyDisposeComponentState");
        }
        if ((this.b & 32768) == 0) {
            sb.append(" eagerComponentCleanup");
        }
        if ((this.b & 65536) == 0) {
            sb.append(" enableOptimizedComponentChangeDetection");
        }
        if ((this.b & 131072) == 0) {
            sb.append(" usePriorModelHashForEkoNoSerialization");
        }
        if ((this.b & 262144) == 0) {
            sb.append(" enableEkoStrictModeError");
        }
        if ((this.b & 524288) == 0) {
            sb.append(" enableCssStyling");
        }
        if ((this.b & 1048576) == 0) {
            sb.append(" enableEkoBytecode");
        }
        if ((this.b & 2097152) == 0) {
            sb.append(" enableEkoBranchAndLoopOptimization");
        }
        if ((this.b & 4194304) == 0) {
            sb.append(" enablePerformanceLogging");
        }
        if ((this.b & 8388608) == 0) {
            sb.append(" enableCustomArenaConfig");
        }
        if ((this.b & 16777216) == 0) {
            sb.append(" arenaStartBlockSize");
        }
        if ((this.b & 33554432) == 0) {
            sb.append(" arenaMaxBlockSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(int i) {
        this.w = i;
        this.b |= 33554432;
    }

    public final void d(int i) {
        this.v = i;
        this.b |= 16777216;
    }

    public final void e(boolean z) {
        this.j = z;
        this.b |= SemanticState.ReadOnly;
    }

    public final void f(boolean z) {
        this.n = z;
        this.b |= 32768;
    }

    public final void g(boolean z) {
        this.m = z;
        this.b |= 16384;
    }

    public final void h(int i) {
        this.f = i;
        this.b |= 32;
    }

    public final void i(boolean z) {
        this.u = z;
        this.b |= 8388608;
    }

    public final void j(boolean z) {
        this.s = z;
        this.b |= 2097152;
    }

    public final void k(boolean z) {
        this.r = z;
        this.b |= 1048576;
    }

    public final void l(boolean z) {
        this.g = z;
        this.b |= SemanticState.Focused;
    }

    public final void m(boolean z) {
        this.q = z;
        this.b |= 262144;
    }

    public final void n(boolean z) {
        this.i = z;
        this.b |= SemanticState.LiveRegion;
    }

    public final void o(boolean z) {
        this.k = z;
        this.b |= SemanticState.Obscured;
    }

    public final void p(boolean z) {
        this.o = z;
        this.b |= 65536;
    }

    public final void q(boolean z) {
        this.t = z;
        this.b |= 4194304;
    }

    public final void r(boolean z) {
        this.l = z;
        this.b |= SemanticState.Multiline;
    }

    public final void s(boolean z) {
        this.h = z;
        this.b |= SemanticState.Hidden;
    }

    public final void t() {
        this.b |= 1;
    }

    public final void u(boolean z) {
        this.d = z;
        this.b |= 8;
    }

    public final void v(boolean z) {
        this.e = z;
        this.b |= 16;
    }

    public final void w(boolean z) {
        this.p = z;
        this.b |= 131072;
    }

    public final void x(boolean z) {
        this.c = z;
        this.b |= 2;
    }
}
