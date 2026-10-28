package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agls extends aggd {
    final /* synthetic */ Iterator a;
    final /* synthetic */ agex b;

    public agls(Iterator it, agex agexVar) {
        this.a = it;
        this.b = agexVar;
    }

    @Override // defpackage.aggd
    protected final Object a() {
        agex agexVar;
        Object next;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            agexVar = this.b;
            next = it.next();
        } while (!agexVar.a(next));
        return next;
    }
}
