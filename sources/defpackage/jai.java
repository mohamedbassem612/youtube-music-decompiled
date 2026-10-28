package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jai implements tbj {
    final /* synthetic */ jak a;

    public jai(jak jakVar) {
        this.a = jakVar;
    }

    @Override // defpackage.tbj
    public final void d(int i, int i2) {
        jak jakVar = this.a;
        tbk tbkVar = jakVar.b;
        if (tbkVar != null && i2 == 1 && i == tbkVar.size() - 1) {
            jakVar.g(jakVar.b.get(i));
        }
    }

    @Override // defpackage.tbj
    public final void jU(int i, int i2) {
        int i3;
        Object obj;
        jak jakVar = this.a;
        tbk tbkVar = jakVar.b;
        if (tbkVar == null || i2 != 1 || i != tbkVar.size() || (i3 = jakVar.c) == -1 || (obj = jakVar.d) == null) {
            return;
        }
        jakVar.add(i3, obj);
        Iterator it = jakVar.a.iterator();
        while (it.hasNext()) {
            ((jaj) it.next()).b();
        }
        jakVar.c = -1;
        jakVar.d = null;
    }

    @Override // defpackage.tbj
    public final void jT(int i, int i2) {
    }

    @Override // defpackage.tbj
    public final void k(int i, int i2) {
    }
}
