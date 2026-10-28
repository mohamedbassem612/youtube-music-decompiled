package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wti extends wnl {
    private final hed a;

    public wti(wlp wlpVar, tgg tggVar, hed hedVar) {
        super(wlpVar, tggVar, alsv.a, new wsj(5), new wtk(1));
        this.a = hedVar;
    }

    @Override // defpackage.wnl
    public final /* bridge */ /* synthetic */ Object h(MessageLite messageLite) {
        alsv alsvVar = (alsv) messageLite;
        if ((alsvVar.b & 8) != 0) {
            wvl wvlVarB = this.a.B();
            wvlVarB.b = new vdm(alsvVar, 16);
            taf.j(wvlVarB.a(), new tsq(13));
        }
        return alsvVar;
    }
}
