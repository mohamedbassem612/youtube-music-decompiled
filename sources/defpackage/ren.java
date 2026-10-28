package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ren implements rep {
    public static final ren a = new ren(rel.c);
    public static final ren b = new ren(rel.e);
    public static final ren c = new ren(rel.d);
    public final rel d;
    public final rem e;
    private final rfs f;

    private ren(rel relVar) {
        ahno.F(!relVar.equals(rel.a));
        this.d = relVar;
        this.f = null;
        this.e = null;
    }

    public final rfs a() {
        rfs rfsVar = this.f;
        rfsVar.getClass();
        return rfsVar;
    }

    public final boolean b() {
        return this.d.equals(rel.a);
    }

    public final boolean c() {
        return this.d.equals(rel.c);
    }

    public ren(rfs rfsVar) {
        this.f = rfsVar;
        this.d = rel.a;
        this.e = null;
    }

    public ren(rem remVar) {
        this.d = rel.b;
        this.f = null;
        this.e = remVar;
    }
}
