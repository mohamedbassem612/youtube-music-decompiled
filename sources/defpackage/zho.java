package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zho implements zgx {
    public final Set a = new CopyOnWriteArraySet();

    @Override // defpackage.zgx
    public final void a(Exception exc) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zhp) it.next()).b(exc);
        }
    }

    @Override // defpackage.zgx
    public final void b(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zhp) it.next()).c(i);
        }
    }

    @Override // defpackage.zgx
    @Deprecated
    public final void c(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zhp) it.next()).f(j);
        }
    }

    public final void d(zhp zhpVar) {
        this.a.add(zhpVar);
    }

    public final void e(zhp zhpVar) {
        this.a.remove(zhpVar);
    }
}
