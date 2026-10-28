package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class adar implements nru {
    public final /* synthetic */ Map a;
    public final /* synthetic */ adaq b;

    public /* synthetic */ adar(Map map, adaq adaqVar) {
        this.a = map;
        this.b = adaqVar;
    }

    @Override // defpackage.nru
    public final nrt a(nrt nrtVar) {
        Map map = this.a;
        if (map != null) {
            nrtVar.a.i(map);
        }
        nrtVar.d = this.b;
        return nrtVar;
    }
}
