package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class djp {
    public djl c;
    public boolean d;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    public final void b() {
        djl djlVar = this.c;
        if (djlVar != null) {
            if (!this.d) {
                djlVar.d(this, null);
            }
            Object obj = djlVar.a;
            Object obj2 = djlVar.d;
            djq djqVar = (djq) obj;
            if (awrc.c(this, djqVar.f) && djqVar.e == -1) {
                djm djmVarA = djqVar.d;
                if (djmVarA == null) {
                    djmVarA = djqVar.a(-1);
                }
                djqVar.d = null;
                djqVar.e = 0;
                djqVar.f = null;
                if (djmVarA == null) {
                    ?? r0 = ((qv) ((hhb) obj2).a).a;
                    if (r0 != 0) {
                        r0.run();
                    }
                } else {
                    djmVarA.b();
                }
                djqVar.a.d(djr.a);
            }
            this.d = false;
        }
    }

    protected void a() {
    }

    protected void c(boolean z) {
    }
}
