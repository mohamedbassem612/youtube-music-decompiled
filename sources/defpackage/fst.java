package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fst implements Iterator {
    private final boolean a;
    private final List b;
    private int c;
    private int d;

    public fst(List list, int i, int i2, boolean z) {
        this.b = new ArrayList(list);
        this.c = z ? i - 1 : i + 1;
        this.d = i2;
        this.a = z;
    }

    private final void b() {
        this.c += true == this.a ? -1 : 1;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized fqh next() {
        if (!hasNext()) {
            return null;
        }
        fqh fqhVar = (fqh) this.b.get(this.c);
        b();
        this.d--;
        return fqhVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (this.d > 0 && (i = this.c) >= 0) {
            List list = this.b;
            if (i >= list.size()) {
                break;
            }
            fqh fqhVar = (fqh) list.get(this.c);
            if (fqhVar.d().l() && !fqhVar.r()) {
                return true;
            }
            b();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
    }
}
