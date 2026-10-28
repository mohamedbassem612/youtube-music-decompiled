package defpackage;

import j$.lang.Iterable$EL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ujg implements urr, usc {
    protected final Set a = new CopyOnWriteArraySet();

    protected void d(Consumer consumer) {
        Set set = this.a;
        if (set.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(set, consumer);
    }

    @Override // defpackage.urr
    public final void e(auhs auhsVar, List list) {
        auhsVar.getClass();
        d(new rew(auhsVar, list, 14, null));
    }

    @Override // defpackage.urr
    public final void f(auhs auhsVar, List list) {
        auhsVar.getClass();
        d(new rew(auhsVar, list, 13, null));
    }

    @Override // defpackage.usc
    public final void g(auhs auhsVar) {
        d(new usf(auhsVar, 1));
    }

    public final void h(Object obj) {
        this.a.add(obj);
    }

    public final void i(Object obj) {
        this.a.remove(obj);
    }
}
