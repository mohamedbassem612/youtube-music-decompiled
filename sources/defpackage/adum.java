package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adum {
    public agev a;
    public agev b;
    public agev c;
    public int d;
    public int e;
    private agev f;
    private agev g;
    private final agev h;
    private final agev i;
    private boolean j;
    private byte k;

    public adum() {
        agdf agdfVar = agdf.a;
        this.f = agdfVar;
        this.a = agdfVar;
        this.g = agdfVar;
        this.b = agdfVar;
        this.c = agdfVar;
        this.h = agdfVar;
        this.i = agdfVar;
    }

    public final adun a() {
        int i;
        int i2;
        if (this.k == 1 && (i = this.d) != 0 && (i2 = this.e) != 0) {
            return new adun(this.f, this.a, this.g, i, i2, this.b, this.c, this.h, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" layoutStyle");
        }
        if (this.e == 0) {
            sb.append(" backgroundColor");
        }
        if (this.k == 0) {
            sb.append(" canCollapse");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.j = z;
        this.k = (byte) 1;
    }

    public final void c(CharSequence charSequence) {
        this.f = agev.h(charSequence);
    }

    public final void d(ajwo ajwoVar) {
        this.g = agev.h(ajwoVar);
    }
}
