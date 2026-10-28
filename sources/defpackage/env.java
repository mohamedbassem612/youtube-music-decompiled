package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class env implements eny {
    final /* synthetic */ epg a;
    public final /* synthetic */ enu b;

    public env(enu enuVar, epg epgVar) {
        this.a = epgVar;
        this.b = enuVar;
    }

    @Override // defpackage.eny
    public final void a() {
        int i = eov.a;
        try {
            this.a.a(eoi.g);
        } catch (Throwable th) {
            eov.f("BillingClient", "Exception setting completer.", th);
        }
        enu enuVar = this.b;
        if (enuVar.h != null) {
            enuVar.k(new dxk(this, 3));
        }
    }

    @Override // defpackage.eny
    public final void b(eoh eohVar) {
        int i = eov.a;
        try {
            this.a.a(eohVar);
        } catch (Throwable th) {
            eov.f("BillingClient", "Exception setting completer.", th);
        }
        enu enuVar = this.b;
        if (enuVar.h != null) {
            enuVar.k(new dhr(this, eohVar, 14));
        }
    }
}
