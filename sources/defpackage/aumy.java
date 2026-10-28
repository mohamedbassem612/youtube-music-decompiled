package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aumy implements Iterator {
    final /* synthetic */ aumz a;
    private final Iterator b;
    private aumx c;

    public aumy(aumz aumzVar) {
        this.a = aumzVar;
        this.b = aumzVar.a.iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aumx next() {
        if (this.c == null && !hasNext()) {
            return null;
        }
        aumx aumxVar = this.c;
        this.c = null;
        return aumxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c != null) {
            return true;
        }
        while (true) {
            Iterator it = this.b;
            if (!it.hasNext()) {
                return false;
            }
            aumx aumxVar = (aumx) ((WeakReference) it.next()).get();
            this.c = aumxVar;
            if (aumxVar != null) {
                return true;
            }
            it.remove();
        }
    }
}
