package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xpd {
    public Object a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private byte f;

    public final xpe a() {
        Object obj;
        if (this.f == 15 && (obj = this.a) != null) {
            return new xpe(this.b, this.c, this.d, this.e, (algp) obj);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" isEnabled");
        }
        if ((this.f & 2) == 0) {
            sb.append(" shouldDisplayPrompt");
        }
        if ((this.f & 4) == 0) {
            sb.append(" shouldLogCounterfactualVes");
        }
        if ((this.f & 8) == 0) {
            sb.append(" shouldUseProximityConnection");
        }
        if (this.a == null) {
            sb.append(" featureType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.b = z;
        this.f = (byte) (this.f | 1);
    }

    public final void c(boolean z) {
        this.c = z;
        this.f = (byte) (this.f | 2);
    }

    public final void d(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 4);
    }

    public final void e(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 8);
    }

    public final sop f() {
        Object obj;
        if (this.f == 15 && (obj = this.a) != null) {
            return new sop((ajnf) obj, this.d, this.e, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" renderer");
        }
        if ((this.f & 1) == 0) {
            sb.append(" enabled");
        }
        if ((this.f & 2) == 0) {
            sb.append(" fullscreen");
        }
        if ((this.f & 4) == 0) {
            sb.append(" annotationEnabled");
        }
        if ((this.f & 8) == 0) {
            sb.append(" appPromoEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(boolean z) {
        this.b = z;
        this.f = (byte) (this.f | 4);
    }

    public final void h(boolean z) {
        this.c = z;
        this.f = (byte) (this.f | 8);
    }

    public final void i(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 1);
    }

    public final void j(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 2);
    }

    public final void k(ajnf ajnfVar) {
        if (ajnfVar == null) {
            throw new NullPointerException("Null renderer");
        }
        this.a = ajnfVar;
    }
}
