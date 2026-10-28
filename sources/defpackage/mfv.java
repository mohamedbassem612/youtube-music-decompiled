package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mfv {
    public String a;
    public String b;
    public String c;
    public String d;
    public CommandOuterClass$Command e;
    public CommandOuterClass$Command f;
    public nrv g;
    public qr h;
    public mfw i;
    public Object j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public aigj n;
    public int o;
    private int p;
    private byte q;

    public final mfx a() {
        int i;
        if (this.q == 1 && (i = this.o) != 0) {
            return new mfx(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, i, this.p, this.i, this.j, this.k, this.l, this.m, this.n);
        }
        StringBuilder sb = new StringBuilder();
        if (this.o == 0) {
            sb.append(" dialogType");
        }
        if (this.q == 0) {
            sb.append(" requestedOrientation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.p = i;
        this.q = (byte) 1;
    }
}
