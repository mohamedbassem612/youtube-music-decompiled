package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foi {
    public final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    public final /* synthetic */ foe c;
    public final /* synthetic */ foq d;
    public final /* synthetic */ gzj e;

    public foi(foq foqVar, gzj gzjVar, boolean z, boolean z2, foe foeVar) {
        this.e = gzjVar;
        this.a = z;
        this.b = z2;
        this.c = foeVar;
        this.d = foqVar;
    }

    public final void a() {
        boolean z = this.a;
        foq foqVar = this.d;
        if (z) {
            if (this.b) {
                boolean z2 = fna.a;
            }
            try {
                foe foeVar = this.c;
                gzj.aS();
                if (foeVar != null) {
                    foqVar.k = foeVar;
                    foqVar.d(foeVar);
                }
            } finally {
                if (this.b) {
                    boolean z3 = fna.a;
                }
            }
        }
    }
}
