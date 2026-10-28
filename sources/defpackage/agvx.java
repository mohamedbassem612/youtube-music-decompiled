package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agvx extends aggd {
    final /* synthetic */ Iterator a;

    public agvx(Iterator it) {
        this.a = it;
    }

    @Override // defpackage.aggd
    protected final Object a() {
        Map.Entry entry;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            entry = (Map.Entry) it.next();
        } while (!agwh.c(entry.getValue()));
        return entry.getKey();
    }
}
