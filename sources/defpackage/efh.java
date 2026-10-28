package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efh implements eff {
    public final dmq a;
    public final dma b = new efg();

    public efh(dmq dmqVar) {
        this.a = dmqVar;
    }

    @Override // defpackage.eff
    public final List a(String str) {
        return (List) apb.f(this.a, true, false, new eck(str, 19, (float[][]) null));
    }

    @Override // defpackage.eff
    public final void b(String str) {
        apb.f(this.a, false, true, new eck(str, 18, (boolean[][]) null));
    }

    @Override // defpackage.eff
    public final /* synthetic */ void c(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            apb.f(this.a, false, true, new eck(this, new qv((String) it.next(), str), 20));
        }
    }
}
