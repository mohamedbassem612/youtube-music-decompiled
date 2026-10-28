package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cbc implements cra {
    final /* synthetic */ cbd a;
    private final HashMap b = new HashMap();
    private final cfd c;

    public cbc(cbd cbdVar, cfd cfdVar) {
        this.a = cbdVar;
        this.c = cfdVar;
    }

    private final void f(aami aamiVar) {
        cfd cfdVar = (cfd) this.b.remove(aamiVar);
        cfdVar.getClass();
        oga ogaVar = (oga) this.a.c.get(cfdVar);
        if (ogaVar != null) {
            ogaVar.c();
        }
    }

    @Override // defpackage.cra
    public final synchronized int a() {
        return this.a.b.a;
    }

    @Override // defpackage.cra
    public final synchronized void b() {
        this.a.b.b();
    }

    @Override // defpackage.cra
    public final synchronized void c(cok cokVar) {
        this.a.b.c(cokVar);
        while (cokVar != null) {
            f(cokVar.e());
            cokVar = cokVar.d();
        }
    }

    @Override // defpackage.cra
    public final synchronized aami d() {
        aami aamiVarD;
        cbd cbdVar = this.a;
        crf crfVar = cbdVar.b;
        HashMap map = this.b;
        aamiVarD = crfVar.d();
        cfd cfdVar = this.c;
        map.put(aamiVarD, cfdVar);
        oga ogaVar = (oga) cbdVar.c.get(cfdVar);
        if (ogaVar != null) {
            ogaVar.d();
        }
        return aamiVarD;
    }

    @Override // defpackage.cra
    public final synchronized void e(aami aamiVar) {
        this.a.b.e(aamiVar);
        f(aamiVar);
    }
}
