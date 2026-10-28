package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class zdu implements zcj {
    final /* synthetic */ zdx a;

    public zdu(zdx zdxVar) {
        this.a = zdxVar;
    }

    private final zcj a(zcf zcfVar) {
        zdx zdxVar = this.a;
        return zdxVar.e.bD() ? zdxVar.v.a(zcfVar) : zdxVar.v.e;
    }

    @Override // defpackage.zcj
    public final ListenableFuture F(zcf zcfVar) {
        return a(zcfVar).F(zcfVar);
    }

    @Override // defpackage.zcj
    public final void ae(zcf zcfVar) {
        zdx zdxVar = this.a;
        if (zdxVar.e.bD() && zcfVar != null) {
            zdn zdnVar = zdxVar.v;
            zcj zcjVarA = zdnVar.a(zcfVar);
            if ((zcjVarA != null ? (yxj) zdnVar.d.get(zcjVarA) : null) == yxj.c) {
                return;
            }
        }
        a(zcfVar).ae(zcfVar);
    }

    @Override // defpackage.zcj
    public final void ai(zcf zcfVar, ywj ywjVar, zhz zhzVar) {
        a(zcfVar).ai(zcfVar, ywjVar, zhzVar);
    }

    @Override // defpackage.zcj
    public final void as(boolean z) {
        a(null).as(z);
    }

    @Override // defpackage.zcj
    public final long s(zcf zcfVar) {
        return a(zcfVar).s(zcfVar);
    }
}
