package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghv implements adjj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ gjc a;

    public ghv(gjc gjcVar, int i) {
        this.$cid = i;
        this.a = gjcVar;
    }

    @Override // defpackage.adjj
    public final adjl a(adic adicVar, awmd awmdVar, awmd awmdVar2, Map map) {
        int i = this.$cid;
        gjc gjcVar = this.a;
        return i != 0 ? new adjl(adicVar, awmdVar, awmdVar2, map, (adjf) gjcVar.a.a.fW.io()) : new adjl(adicVar, awmdVar, awmdVar2, map, (adjf) gjcVar.a.a.fZ.io());
    }
}
