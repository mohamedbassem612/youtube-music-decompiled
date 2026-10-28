package defpackage;

import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iei {
    public String a;
    public String b;
    public agke c;
    public aigj d;
    public agke e;
    public ajwo f;
    public anvl g;
    public Optional h = Optional.empty();
    public Optional i = Optional.empty();
    public Optional j = Optional.empty();
    public Optional k = Optional.empty();
    public Optional l = Optional.empty();
    public Optional m = Optional.empty();
    public Optional n = Optional.empty();
    private agke o;
    private int p;
    private int q;
    private boolean r;
    private agke s;
    private aimm t;
    private byte u;

    public final iej a() {
        agke agkeVar;
        agke agkeVar2;
        agke agkeVar3;
        agke agkeVar4;
        aimm aimmVar;
        if (this.u == 7 && (agkeVar = this.o) != null && (agkeVar2 = this.s) != null && (agkeVar3 = this.c) != null && (agkeVar4 = this.e) != null && (aimmVar = this.t) != null) {
            return new iej(agkeVar, this.p, this.q, this.r, this.a, this.b, agkeVar2, agkeVar3, this.d, agkeVar4, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, aimmVar, this.n);
        }
        StringBuilder sb = new StringBuilder();
        if (this.o == null) {
            sb.append(" videos");
        }
        if ((this.u & 1) == 0) {
            sb.append(" playbackPosition");
        }
        if ((this.u & 2) == 0) {
            sb.append(" autonavIndex");
        }
        if ((this.u & 4) == 0) {
            sb.append(" isInfinite");
        }
        if (this.s == null) {
            sb.append(" watchNextTrackingParams");
        }
        if (this.c == null) {
            sb.append(" watchNextResponsesWithPlaylistPanel");
        }
        if (this.e == null) {
            sb.append(" musicQueueResponses");
        }
        if (this.t == null) {
            sb.append(" syncStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.q = i;
        this.u = (byte) (this.u | 2);
    }

    public final void c(boolean z) {
        this.r = z;
        this.u = (byte) (this.u | 4);
    }

    public final void d(int i) {
        this.p = i;
        this.u = (byte) (this.u | 1);
    }

    public final void e(aimm aimmVar) {
        if (aimmVar == null) {
            throw new NullPointerException("Null syncStatus");
        }
        this.t = aimmVar;
    }

    public final void f(List list) {
        this.o = agke.n(list);
    }

    public final void g(List list) {
        this.s = agke.n(list);
    }
}
