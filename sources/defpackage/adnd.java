package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnd {
    final /* synthetic */ adne a;
    private final oh b;
    private final oh c;
    private boolean d = false;
    private boolean e = false;
    private final adnn f;
    private final afvq g;

    public adnd(adne adneVar, oh ohVar, oh ohVar2, adnn adnnVar, afvq afvqVar) {
        this.a = adneVar;
        this.b = ohVar;
        this.c = ohVar2;
        this.f = adnnVar;
        this.g = afvqVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    private final void b(boolean z) {
        if (this.d && this.e) {
            afvq afvqVar = this.g;
            adnn adnnVar = this.f;
            afvqVar.c.remove(adnnVar);
            afvqVar.d.remove(adnnVar);
            if (z) {
                adne adneVar = this.a;
                if (!adneVar.b) {
                    this.a.a();
                } else {
                    try {
                        adneVar.a();
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
    public final void a(oh ohVar) {
        oh ohVar2 = this.b;
        if (ohVar == ohVar2) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.g.b.remove(ohVar2);
            adne adneVar = this.a;
            boolean zV = adneVar.v(ohVar2);
            if (zV) {
                if (adneVar.b) {
                    try {
                        adneVar.k(ohVar2);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    this.a.k(this.b);
                }
            }
            b(zV);
            return;
        }
        oh ohVar3 = this.c;
        if (ohVar != ohVar3 || this.e) {
            return;
        }
        this.e = true;
        this.g.b.remove(ohVar3);
        adne adneVar2 = this.a;
        boolean zV2 = adneVar2.v(ohVar3);
        if (zV2) {
            if (adneVar2.b) {
                try {
                    adneVar2.k(ohVar3);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.a.k(this.c);
            }
        }
        b(zV2);
    }
}
