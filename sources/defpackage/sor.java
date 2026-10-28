package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sor {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private ajmb f;
    private byte g;
    private int h;

    public final sos a() {
        ajmb ajmbVar;
        if (this.g == 31 && this.h != 0 && (ajmbVar = this.f) != null) {
            return new sos(this.a, this.b, this.c, this.d, this.e, ajmbVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" hidden");
        }
        if ((this.g & 2) == 0) {
            sb.append(" enabled");
        }
        if ((this.g & 4) == 0) {
            sb.append(" annotationEnabled");
        }
        if ((this.g & 8) == 0) {
            sb.append(" appPromoEnabled");
        }
        if ((this.g & 16) == 0) {
            sb.append(" fullscreen");
        }
        if (this.h == 0) {
            sb.append(" activeButton");
        }
        if (this.f == null) {
            sb.append(" renderer");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        if (i == 0) {
            throw new NullPointerException("Null activeButton");
        }
        this.h = 1;
    }

    public final void c(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 4);
    }

    public final void d(boolean z) {
        this.d = z;
        this.g = (byte) (this.g | 8);
    }

    public final void e(boolean z) {
        this.b = z;
        this.g = (byte) (this.g | 2);
    }

    public final void f(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 16);
    }

    public final void g(boolean z) {
        this.a = z;
        this.g = (byte) (this.g | 1);
    }

    public final void h(ajmb ajmbVar) {
        if (ajmbVar == null) {
            throw new NullPointerException("Null renderer");
        }
        this.f = ajmbVar;
    }
}
