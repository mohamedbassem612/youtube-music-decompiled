package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class plw {
    public String a;
    public String b;
    public String c;
    public String d;
    public agkz e;
    public String f;
    public String g;
    public int h;
    private long i;
    private String j;
    private int k;
    private long l;
    private long m;
    private int n;
    private long o;
    private long p;
    private byte q;

    public plw(plx plxVar) {
        this.i = plxVar.a;
        this.j = plxVar.b;
        this.h = plxVar.p;
        this.a = plxVar.c;
        this.b = plxVar.d;
        this.c = plxVar.e;
        this.k = plxVar.f;
        this.d = plxVar.g;
        this.e = plxVar.h;
        this.f = plxVar.i;
        this.l = plxVar.j;
        this.m = plxVar.k;
        this.n = plxVar.l;
        this.o = plxVar.m;
        this.g = plxVar.n;
        this.p = plxVar.o;
        this.q = (byte) 127;
    }

    public final plx a() {
        String str;
        int i;
        if (this.q == 127 && (str = this.j) != null && (i = this.h) != 0) {
            return new plx(this.i, str, i, this.a, this.b, this.c, this.k, this.d, this.e, this.f, this.l, this.m, this.n, this.o, this.g, this.p);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.q & 1) == 0) {
            sb.append(" id");
        }
        if (this.j == null) {
            sb.append(" accountSpecificId");
        }
        if (this.h == 0) {
            sb.append(" accountType");
        }
        if ((this.q & 2) == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.q & 4) == 0) {
            sb.append(" syncVersion");
        }
        if ((this.q & 8) == 0) {
            sb.append(" lastRegistrationTimeMs");
        }
        if ((this.q & 16) == 0) {
            sb.append(" lastRegistrationRequestHash");
        }
        if ((this.q & 32) == 0) {
            sb.append(" firstRegistrationVersion");
        }
        if ((this.q & 64) == 0) {
            sb.append(" fitbitDecodedId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(pxk pxkVar) {
        this.h = qnl.aw(pxkVar);
        c(pxkVar.a());
        if (pxkVar instanceof pxl) {
            this.a = ((pxl) pxkVar).a;
        } else if (pxkVar instanceof pxn) {
            e(((pxn) pxkVar).b);
        }
    }

    protected final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null accountSpecificId");
        }
        this.j = str;
    }

    public final void d(long j) {
        this.o = j;
        this.q = (byte) (this.q | 32);
    }

    public final void e(long j) {
        this.p = j;
        this.q = (byte) (this.q | 64);
    }

    public final void f(long j) {
        this.i = j;
        this.q = (byte) (this.q | 1);
    }

    public final void g(int i) {
        this.n = i;
        this.q = (byte) (this.q | 16);
    }

    public final void h(long j) {
        this.m = j;
        this.q = (byte) (this.q | 8);
    }

    public final void i(int i) {
        this.k = i;
        this.q = (byte) (this.q | 2);
    }

    public final void j(long j) {
        this.l = j;
        this.q = (byte) (this.q | 4);
    }

    public plw() {
    }
}
