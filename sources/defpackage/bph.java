package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bph implements boe {
    private final /* synthetic */ int $cid;
    private final Object a;

    public bph(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bnx, java.lang.Object] */
    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) {
        bnx[] bnxVarArr;
        if (this.$cid == 0) {
            ?? r2 = this.a;
            r2.a();
            r2.a();
            return;
        }
        new HashMap();
        int i = 0;
        while (true) {
            bnxVarArr = (bnx[]) this.a;
            if (i >= bnxVarArr.length) {
                break;
            }
            bnxVarArr[i].a();
            i++;
        }
        for (bnx bnxVar : bnxVarArr) {
            bnxVar.a();
        }
    }
}
