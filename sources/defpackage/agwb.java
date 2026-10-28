package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agwb extends aggd {
    final /* synthetic */ Iterator a;

    public agwb(Iterator it) {
        this.a = it;
    }

    @Override // defpackage.aggd
    protected final Object a() {
        agwf agwfVar;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            agwfVar = (agwf) it.next();
        } while (!(agwfVar instanceof agwe));
        return agwfVar.a;
    }
}
