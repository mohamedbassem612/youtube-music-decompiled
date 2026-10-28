package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wkz {
    private agke A;
    private Optional B;
    private agke C;
    private int D;
    public String a;
    public wly b;
    public aigj c;
    private long d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private int y;
    private int z;

    public wkz(wla wlaVar) {
        this.B = Optional.empty();
        this.d = wlaVar.a;
        this.e = wlaVar.b;
        this.f = wlaVar.c;
        this.g = wlaVar.d;
        this.h = wlaVar.e;
        this.i = wlaVar.f;
        this.j = wlaVar.g;
        this.k = wlaVar.h;
        this.l = wlaVar.i;
        this.m = wlaVar.j;
        this.n = wlaVar.k;
        this.o = wlaVar.l;
        this.p = wlaVar.m;
        this.q = wlaVar.n;
        this.r = wlaVar.o;
        this.s = wlaVar.p;
        this.t = wlaVar.q;
        this.u = wlaVar.r;
        this.v = wlaVar.s;
        this.w = wlaVar.t;
        this.a = wlaVar.u;
        this.x = wlaVar.v;
        this.y = wlaVar.w;
        this.z = wlaVar.x;
        this.A = wlaVar.y;
        this.b = wlaVar.z;
        this.B = wlaVar.A;
        this.c = wlaVar.B;
        this.C = wlaVar.C;
        this.D = 8388607;
    }

    public final wla a() {
        String str;
        agke agkeVar;
        agke agkeVar2;
        if (this.D == 8388607 && (str = this.a) != null && (agkeVar = this.A) != null && (agkeVar2 = this.C) != null) {
            return new wla(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, str, this.x, this.y, this.z, agkeVar, this.b, this.B, this.c, agkeVar2);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.D & 1) == 0) {
            sb.append(" protoParsingTimeMillis");
        }
        if ((this.D & 2) == 0) {
            sb.append(" futProcessingTimeMillis");
        }
        if ((this.D & 4) == 0) {
            sb.append(" overallProcessingTimeMillis");
        }
        if ((this.D & 8) == 0) {
            sb.append(" responseContextsProcessingTimeMillis");
        }
        if ((this.D & 16) == 0) {
            sb.append(" hasNestedResponse");
        }
        if ((this.D & 32) == 0) {
            sb.append(" hasRootTrace");
        }
        if ((this.D & 64) == 0) {
            sb.append(" futParseTimeMillis");
        }
        if ((this.D & SemanticState.Focused) == 0) {
            sb.append(" futElementsProcessingMillis");
        }
        if ((this.D & SemanticState.Hidden) == 0) {
            sb.append(" futEntitiesProcessingMillis");
        }
        if ((this.D & SemanticState.LiveRegion) == 0) {
            sb.append(" futTasksProcessingMillis");
        }
        if ((this.D & SemanticState.ReadOnly) == 0) {
            sb.append(" futEntityMutationProcessingMillis");
        }
        if ((this.D & SemanticState.Modal) == 0) {
            sb.append(" futEntityMutationPersistentEditsCommitMillis");
        }
        if ((this.D & SemanticState.Obscured) == 0) {
            sb.append(" futEntityMutationInMemoryEditsCommitMillis");
        }
        if ((this.D & SemanticState.Multiline) == 0) {
            sb.append(" futSize");
        }
        if ((this.D & 16384) == 0) {
            sb.append(" futElementsSize");
        }
        if ((this.D & 32768) == 0) {
            sb.append(" futEntitiesSize");
        }
        if ((this.D & 65536) == 0) {
            sb.append(" futTasksSize");
        }
        if ((this.D & 131072) == 0) {
            sb.append(" futEntitiesCount");
        }
        if ((this.D & 262144) == 0) {
            sb.append(" futElementsCount");
        }
        if ((this.D & 524288) == 0) {
            sb.append(" futTasksCount");
        }
        if (this.a == null) {
            sb.append(" rpcName");
        }
        if ((this.D & 1048576) == 0) {
            sb.append(" hasContinuationToken");
        }
        if ((this.D & 2097152) == 0) {
            sb.append(" responseProtoByteSize");
        }
        if ((this.D & 4194304) == 0) {
            sb.append(" retryCount");
        }
        if (this.A == null) {
            sb.append(" networkHealthAnnotations");
        }
        if (this.C == null) {
            sb.append(" nestedInnerTubeRequestInfos");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.v = i;
        this.D |= 262144;
    }

    public final void c(int i) {
        this.k = i;
        this.D |= SemanticState.Focused;
    }

    public final void d(int i) {
        this.r = i;
        this.D |= 16384;
    }

    public final void e(int i) {
        this.u = i;
        this.D |= 131072;
    }

    public final void f(int i) {
        this.l = i;
        this.D |= SemanticState.Hidden;
    }

    public final void g(int i) {
        this.s = i;
        this.D |= 32768;
    }

    public final void h(int i) {
        this.p = i;
        this.D |= SemanticState.Obscured;
    }

    public final void i(int i) {
        this.o = i;
        this.D |= SemanticState.Modal;
    }

    public final void j(int i) {
        this.n = i;
        this.D |= SemanticState.ReadOnly;
    }

    public final void k(int i) {
        this.j = i;
        this.D |= 64;
    }

    public final void l(int i) {
        this.e = i;
        this.D |= 2;
    }

    public final void m(int i) {
        this.q = i;
        this.D |= SemanticState.Multiline;
    }

    public final void n(int i) {
        this.w = i;
        this.D |= 524288;
    }

    public final void o(int i) {
        this.m = i;
        this.D |= SemanticState.LiveRegion;
    }

    public final void p(int i) {
        this.t = i;
        this.D |= 65536;
    }

    public final void q(boolean z) {
        this.x = z;
        this.D |= 1048576;
    }

    public final void r(boolean z) {
        this.h = z;
        this.D |= 16;
    }

    public final void s(boolean z) {
        this.i = z;
        this.D |= 32;
    }

    public final void t(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null nestedInnerTubeRequestInfos");
        }
        this.C = agkeVar;
    }

    public final void u(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null networkHealthAnnotations");
        }
        this.A = agkeVar;
    }

    public final void v(int i) {
        this.f = i;
        this.D |= 4;
    }

    public final void w(long j) {
        this.d = j;
        this.D |= 1;
    }

    public final void x(int i) {
        this.g = i;
        this.D |= 8;
    }

    public final void y(int i) {
        this.y = i;
        this.D |= 2097152;
    }

    public final void z(int i) {
        this.z = i;
        this.D |= 4194304;
    }

    public wkz() {
        this.B = Optional.empty();
    }
}
