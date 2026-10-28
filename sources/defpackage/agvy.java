package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agvy extends aggd {
    final /* synthetic */ Iterator a;

    public agvy(Iterator it) {
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
        } while (!(agwfVar instanceof agwd));
        return agwfVar.a;
    }
}
