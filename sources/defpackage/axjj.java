package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axjj implements Iterable {
    List a;
    public int b;
    public int c;
    public boolean d;

    public final Object a(int i) {
        return this.a.get(i);
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final boolean c(Object obj) {
        List list;
        int iIndexOf;
        if (obj == null || (list = this.a) == null || (iIndexOf = list.indexOf(obj)) == -1) {
            return false;
        }
        if (this.b == 0) {
            this.a.remove(iIndexOf);
        } else {
            this.d = true;
            this.a.set(iIndexOf, null);
        }
        int i = this.c - 1;
        this.c = i;
        if (i == 0 && this.b == 0) {
            this.a = null;
        }
        return true;
    }

    public final void d(Object obj) {
        if (obj != null) {
            List list = this.a;
            if (list == null) {
                this.a = new ArrayList(4);
            } else if (list.contains(obj)) {
                return;
            }
            this.a.add(obj);
            this.c++;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new axji(this);
    }
}
