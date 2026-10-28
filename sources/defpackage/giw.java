package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class giw implements vbj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public giw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.vbj
    public final vbk a(uju ujuVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ggt ggtVar = (ggt) obj;
            ght ghtVar = ggtVar.a;
            Executor executor = (Executor) ghtVar.u.io();
            Executor executor2 = (Executor) ghtVar.B.io();
            aend aendVar = (aend) ggtVar.c.bm.io();
            vxz vxzVarCs = ghtVar.a.cs();
            agkj agkjVar = agpn.b;
            return new vbk(executor, executor2, aendVar, ujuVar, vxzVarCs, agkjVar, agkjVar, (zvl) ghtVar.dO.io());
        }
        gix gixVar = (gix) obj;
        ght ghtVar2 = gixVar.a;
        Executor executor3 = (Executor) ghtVar2.u.io();
        Executor executor4 = (Executor) ghtVar2.B.io();
        aend aendVar2 = (aend) gixVar.b.ak.io();
        vxz vxzVarCs2 = ghtVar2.a.cs();
        agkj agkjVar2 = agpn.b;
        return new vbk(executor3, executor4, aendVar2, ujuVar, vxzVarCs2, agkjVar2, agkjVar2, (zvl) ghtVar2.dO.io());
    }
}
