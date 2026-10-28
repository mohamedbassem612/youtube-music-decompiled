package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iod implements jll {
    private final /* synthetic */ int $cid;
    final /* synthetic */ cc a;

    public iod(cc ccVar, int i) {
        this.$cid = i;
        this.a = ccVar;
    }

    @Override // defpackage.jll
    public final void a() {
        int i = this.$cid;
        cc ccVar = this.a;
        if (i == 0) {
            iog iogVar = (iog) ccVar;
            iogVar.h.o(iogVar.l(), iogVar.e.i(), iogVar.e.a() != null ? iogVar.e.a().f : 4724);
            return;
        }
        ioc iocVar = (ioc) ccVar;
        inp inpVar = iocVar.z;
        inpVar.h = 16;
        inpVar.a(alxs.SPEECH);
        if (iocVar.d.a() != null) {
            gfp gfpVar = iocVar.c;
            byte[] bArrN = iocVar.n(-1);
            bArrN.getClass();
            gfpVar.o(bArrN, iocVar.d.i(), iocVar.d.a().f);
        }
    }

    @Override // defpackage.jll
    public final void b(Intent intent) {
        int i = this.$cid;
        cc ccVar = this.a;
        if (i != 0) {
            ((ioc) ccVar).startActivityForResult(intent, 1000);
        } else {
            ((iog) ccVar).startActivityForResult(intent, 1000);
        }
    }
}
