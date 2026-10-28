package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class isf implements tdh {
    final /* synthetic */ aunn a;
    final /* synthetic */ aunn b;
    final /* synthetic */ vxz c;

    public isf(vxz vxzVar, aunn aunnVar, aunn aunnVar2) {
        this.c = vxzVar;
        this.a = aunnVar;
        this.b = aunnVar2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.tdh
    public final void a() {
        if (this.c.l(258, 45825817L, false)) {
            mgk mgkVar = (mgk) this.a.io();
            Object objIo = this.b.io();
            objIo.getClass();
            zqs zqsVar = (zqs) objIo;
            mgkVar.b = zqsVar;
            Iterator it = atqq.ap(mgkVar.a).iterator();
            while (it.hasNext()) {
                ((zqf) it.next()).k(zqsVar);
            }
        }
    }

    @Override // defpackage.tdh
    public final void gY() {
    }
}
