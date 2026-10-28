package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afgz implements Function0 {
    final /* synthetic */ cc a;
    final /* synthetic */ awmi b;

    public afgz(cc ccVar, awmi awmiVar) {
        this.a = ccVar;
        this.b = awmiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        bpl defaultViewModelProviderFactory;
        bpp bppVarD = bbl.d(this.b);
        bny bnyVar = bppVarD instanceof bny ? (bny) bppVarD : null;
        if (bnyVar != null && (defaultViewModelProviderFactory = bnyVar.getDefaultViewModelProviderFactory()) != null) {
            return defaultViewModelProviderFactory;
        }
        bpl defaultViewModelProviderFactory2 = this.a.getDefaultViewModelProviderFactory();
        defaultViewModelProviderFactory2.getClass();
        return defaultViewModelProviderFactory2;
    }
}
