package defpackage;

import java.net.URL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class axmd implements axna {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ axmd(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.axna
    public final Object a() {
        if (this.$cid != 0) {
            return ((axlw) this.a).a.openConnection((URL) this.b);
        }
        axmi axmiVarB = axmi.b(ank$$ExternalSyntheticApiModelOutline0.m(this.b));
        axmf axmfVar = (axmf) this.a;
        axmfVar.a.onResponseStarted(axmfVar.b, axmiVarB);
        return null;
    }
}
