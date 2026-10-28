package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvb {
    public byte a = -1;
    public xwc b;
    public xwc c;
    private xvv d;
    private String e;
    private xvz f;
    private xvg g;
    private List h;
    private xvh i;

    public xvb(xve xveVar) {
        this.d = xveVar.b;
        this.e = xveVar.c;
        this.f = xveVar.d;
        this.g = xveVar.e;
        this.h = xveVar.f;
        this.b = xveVar.h;
        this.c = xveVar.g;
        this.i = xveVar.a();
    }

    public final xve a() {
        int i = ~this.a;
        if ((i & 15) == 0) {
            return new xve(this.d, this.e, this.f, this.g, this.h, this.b, this.c, this.i, i & 240);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.a & 1) == 0) {
            sb.append(" pairingInfo");
        }
        if ((this.a & 2) == 0) {
            sb.append(" name");
        }
        if ((this.a & 4) == 0) {
            sb.append(" screenId");
        }
        if ((this.a & 8) == 0) {
            sb.append(" loungeDeviceId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(xvg xvgVar) {
        if (xvgVar == null) {
            throw new NullPointerException("Null loungeDeviceId");
        }
        this.g = xvgVar;
        this.a = (byte) (this.a | 8);
    }

    public final void c(xvh xvhVar) {
        this.i = xvhVar;
        this.a = (byte) (this.a | (-128));
    }

    public final void d(List list) {
        if (list == null) {
            throw new NullPointerException("Null mdxDiscoveryIds");
        }
        this.h = list;
        this.a = (byte) (this.a | 16);
    }

    public final void e(xvv xvvVar) {
        this.d = xvvVar;
        this.a = (byte) (this.a | 1);
    }

    public final void f(xvz xvzVar) {
        if (xvzVar == null) {
            throw new NullPointerException("Null screenId");
        }
        this.f = xvzVar;
        this.a = (byte) (this.a | 4);
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.e = str;
        this.a = (byte) (this.a | 2);
    }
}
