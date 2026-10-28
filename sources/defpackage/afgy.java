package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afgy implements Function0 {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public afgy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [awmi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Object invoke() {
        int i = this.$cid;
        if (i == 0) {
            this = (afgy) this.a;
        } else if (i != 1) {
            ?? r2 = this.a;
            if (i == 2) {
                return bbl.d(r2).getViewModelStore();
            }
            bpp bppVarD = bbl.d(r2);
            bny bnyVar = bppVarD instanceof bny ? (bny) bppVarD : null;
            return bnyVar != null ? bnyVar.getDefaultViewModelCreationExtras() : bpr.a;
        }
        return this.a;
    }
}
