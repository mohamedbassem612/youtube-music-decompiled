package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abry implements abrx {
    private static final xhc c = xhb.a(28631);
    public final xgn a;
    public String b;
    private final abvn d;
    private final avmm e = new avmm();
    private final avlh f;
    private String g;

    public abry(xgn xgnVar, abvn abvnVar, avlh avlhVar) {
        this.a = xgnVar;
        this.d = abvnVar;
        this.f = avlhVar;
    }

    @Override // defpackage.abrx
    public final void a(abrn abrnVar) {
        if (abrnVar.c().g()) {
            this.a.l(new xgj((xhc) abrnVar.c().c()));
        }
    }

    @Override // defpackage.abrx
    public final void b(abrn abrnVar) {
        if (abrnVar.c().g()) {
            this.a.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj((xhc) abrnVar.c().c()), null);
        }
    }

    @Override // defpackage.abrx
    public final void c() {
        avmm avmmVar = this.e;
        if (avmmVar.a() == 0) {
            avmmVar.c(this.d.M(new abfb(12), new abfb(13)).ak(new abqg(this, 7)));
            avmmVar.c(this.f.ak(new abqg(this, 6)));
        }
        String str = this.b;
        if (str == null || Objects.equals(this.g, str)) {
            return;
        }
        this.a.b(c, null, null);
        this.g = this.b;
    }

    @Override // defpackage.abrx
    public final void d() {
        this.a.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(49485)), null);
    }

    @Override // defpackage.abrx
    public final void e() {
        avmm avmmVar = this.e;
        if (avmmVar.a() > 0) {
            this.a.t();
            this.g = null;
            this.b = null;
            avmmVar.b();
        }
    }
}
