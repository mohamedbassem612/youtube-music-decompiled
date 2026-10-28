package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kuk implements kty {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ kul a;
    public final /* synthetic */ Map b;

    public /* synthetic */ kuk(kul kulVar, Map map, int i) {
        this.$cid = i;
        this.a = kulVar;
        this.b = map;
    }

    @Override // defpackage.kty
    public final Object a(kqs kqsVar) {
        int i = this.$cid;
        Map map = this.b;
        kul kulVar = this.a;
        if (i != 0) {
            return kulVar.e(kqsVar, map);
        }
        kulVar.c(map);
        return null;
    }
}
