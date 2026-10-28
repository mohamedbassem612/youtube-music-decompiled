package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opf {
    public opg a;
    public Object b;
    public agfr c;
    public byte d = 15;
    public int e;
    private int f;
    private boolean g;
    private agfr h;

    public opf(oph ophVar) {
        this.a = ophVar.b;
        this.b = ophVar.c;
        this.c = ophVar.e;
        this.f = ophVar.f;
        this.e = ophVar.i;
        this.g = ophVar.g;
        this.h = ophVar.h;
    }

    public final oph a() {
        if (this.d == 15 && this.e != 0) {
            return new oph(this.a, this.b, this.c, this.f, this.e, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" heightEstimateFactor");
        }
        if ((this.d & 2) == 0) {
            sb.append(" visibilityMode");
        }
        if (this.e == 0) {
            sb.append(" layoutDirectionMode");
        }
        if ((this.d & 4) == 0) {
            sb.append(" enableLayoutRootMaxDimensionsUpdate");
        }
        if ((this.d & 8) == 0) {
            sb.append(" enableFoldingInfoFoldBounds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.g = z;
        this.d = (byte) (this.d | 4);
    }

    public final void c(int i) {
        this.f = i;
        this.d = (byte) (this.d | 2);
    }

    public final void d(agfr agfrVar) {
        if (agfrVar != null) {
            this.h = aguu.al(new ope(agfrVar, 0));
        }
    }
}
