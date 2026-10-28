package defpackage;

import com.google.android.libraries.blocks.Container;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wai implements sqs {
    private final awmd a;
    private final agfr b;
    private final agfr c;
    private final vxz d;

    public wai(vxz vxzVar, axfd axfdVar, awmd awmdVar, Map map) {
        this.d = vxzVar;
        this.a = awmdVar;
        this.b = aguu.al(new tar(axfdVar, 5));
        this.c = aguu.al(new cmw(axfdVar, map, 6, null));
    }

    @Override // defpackage.sqs
    public final Container a(maz mazVar, Container container) {
        this.b.io();
        asbq asbqVar = (asbq) this.c.io();
        return container == null ? mazVar.b(asbqVar) : mazVar.c(asbqVar, container);
    }

    @Override // defpackage.sqs
    public final void b() {
        this.b.io();
        if (this.d.l(3, 45385895L, false)) {
            Iterator it = ((Set) this.a.io()).iterator();
            while (it.hasNext()) {
                ((aber) it.next()).c();
            }
        }
    }
}
