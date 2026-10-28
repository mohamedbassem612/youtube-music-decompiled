package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wum extends wnm {
    public wum(wlp wlpVar, agev agevVar, awmd awmdVar, awmd awmdVar2, wjz wjzVar, tqj tqjVar) {
        wkw wkwVar;
        int i = tqr.a;
        if (tqjVar.k(1073828824)) {
            awmdVar2.getClass();
            wkwVar = new wkw(awmdVar2, 6);
        } else {
            awmdVar.getClass();
            wkwVar = new wkw(awmdVar, 6);
        }
        super(wlpVar, (tgg) agevVar.d(wkwVar), amae.a, wjzVar, new wql(6), new wre(4));
    }

    @Override // defpackage.wnl
    public final /* synthetic */ Object h(MessageLite messageLite) {
        return new wgi((amae) messageLite);
    }
}
