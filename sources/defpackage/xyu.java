package defpackage;

import app.rive.semantics.SemanticState;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xyu {
    public xzv a;
    public String b;
    public List c;
    public int d = 524287;
    private String e;
    private List f;
    private long g;
    private acca h;
    private String i;
    private Integer j;
    private String k;
    private String l;
    private String m;
    private boolean n;
    private aigj o;
    private String p;
    private boolean q;

    public xyu(xyv xyvVar) {
        this.e = xyvVar.b;
        this.a = xyvVar.c;
        this.f = xyvVar.d;
        this.g = xyvVar.e;
        this.h = xyvVar.f;
        this.i = xyvVar.g;
        this.j = xyvVar.h;
        this.k = xyvVar.i;
        this.l = xyvVar.j;
        this.m = xyvVar.k;
        this.n = xyvVar.m;
        this.o = xyvVar.n;
        this.b = xyvVar.p;
        this.p = xyvVar.r;
        this.c = xyvVar.s;
        this.q = xyvVar.t;
    }

    public final xyv a() {
        return new xyv(this.e, this.a, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.b, this.p, this.c, this.q, (~this.d) & 524287);
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null activeSourceVideoId");
        }
        this.k = str;
        this.d |= SemanticState.Focused;
    }

    public final void c(long j) {
        this.g = j;
        this.d |= 8;
    }

    public final void d(boolean z) {
        this.n = z;
        this.d |= SemanticState.Modal;
    }

    public final void e(String str) {
        this.m = str;
        this.d |= SemanticState.LiveRegion;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null playlistId");
        }
        this.i = str;
        this.d |= 32;
    }

    public final void g(boolean z) {
        this.q = z;
        this.d |= 262144;
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null remotePlayabilityStatusParams");
        }
        this.p = str;
        this.d |= 65536;
    }

    public final void i(List list) {
        this.f = list;
        this.d |= 4;
    }

    public final void j(String str) {
        this.l = str;
        this.d |= SemanticState.Hidden;
    }

    public final void k(byte[] bArr) {
        aigj aigjVarV;
        if (bArr != null) {
            aigjVarV = aigj.v(bArr);
            aigjVarV.getClass();
        } else {
            aigjVarV = null;
        }
        this.o = aigjVarV;
        this.d |= SemanticState.Obscured;
    }

    public final void l(Integer num) {
        if (num.intValue() < 0) {
            num = null;
        }
        this.j = num;
        this.d |= 64;
    }

    public final void m(acca accaVar) {
        this.h = accaVar;
        this.d |= 16;
    }

    public final void n(String str) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.e = str;
        this.d |= 1;
    }
}
