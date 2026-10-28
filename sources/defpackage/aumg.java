package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aumg implements Iterator {
    private final /* synthetic */ int $cid;
    int a = 0;
    final /* synthetic */ AbstractCollection b;

    public aumg(AbstractCollection abstractCollection, int i) {
        this.$cid = i;
        this.b = abstractCollection;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.$cid == 0) {
            aumh aumhVar = (aumh) this.b;
            if (this.a >= aumhVar.a.size() && !aumhVar.b.hasNext()) {
                return false;
            }
        } else if (this.a >= ((agux) this.b).size()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.$cid;
        AbstractCollection abstractCollection = this.b;
        if (i == 0) {
            aumh aumhVar = (aumh) abstractCollection;
            List list = aumhVar.a;
            if (this.a >= list.size()) {
                list.add(aumhVar.b.next());
                return next();
            }
            int i2 = this.a;
            this.a = i2 + 1;
            return list.get(i2);
        }
        int i3 = this.a;
        agux aguxVar = (agux) abstractCollection;
        if (i3 >= aguxVar.size()) {
            throw new NoSuchElementException();
        }
        aguy aguyVar = aguxVar.b;
        Object obj = aguyVar.b[aguxVar.b() + i3];
        this.a = i3 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.$cid == 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
}
