package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nzq {
    public Boolean a;
    public nzo b;
    public String c;
    public Integer d;
    public Status e;
    public String f;
    public String g;
    public Integer h;
    public Boolean i;
    public Integer j;
    public Boolean k;
    public Integer l;
    public agke m;
    public Integer n;
    private agkz o;
    private int p;
    private byte q;

    public final nzr a() {
        agkz agkzVar;
        if (this.q == 1 && (agkzVar = this.o) != null) {
            return new nzr(agkzVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.p, this.n);
        }
        StringBuilder sb = new StringBuilder();
        if (this.o == null) {
            sb.append(" templateUris");
        }
        if (this.q == 0) {
            sb.append(" materializationCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.p = i;
        this.q = (byte) 1;
    }

    public final void c(agkz agkzVar) {
        if (agkzVar == null) {
            throw new NullPointerException("Null templateUris");
        }
        this.o = agkzVar;
    }
}
