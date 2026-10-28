package defpackage;

import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adgt implements adgp {
    final /* synthetic */ NodeTreeProcessor a;
    final /* synthetic */ adgu b;

    public adgt(NodeTreeProcessor nodeTreeProcessor, adgu adguVar) {
        this.a = nodeTreeProcessor;
        this.b = adguVar;
    }

    @Override // defpackage.adgp
    public final void a(adgo adgoVar) {
        orq orqVarL = this.a.k().l();
        adgu adguVar = this.b;
        orqVarL.d(adguVar.b, adguVar.f(adgoVar));
    }

    @Override // defpackage.adgp
    public final void b(adgo adgoVar) {
        orq orqVarL = this.a.k().l();
        adgu adguVar = this.b;
        orqVarL.d(adguVar.d, adguVar.f(adgoVar));
    }

    @Override // defpackage.adgp
    public final void c(adgo adgoVar) {
        orq orqVarL = this.a.k().l();
        adgu adguVar = this.b;
        orqVarL.d(adguVar.a, adguVar.f(adgoVar));
    }

    @Override // defpackage.adgp
    public final void d(adgo adgoVar) {
        orq orqVarL = this.a.k().l();
        adgu adguVar = this.b;
        orqVarL.d(adguVar.c, adguVar.f(adgoVar));
    }
}
