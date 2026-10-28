package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axji implements Iterator {
    final /* synthetic */ axjj a;
    private final int b;
    private int c;
    private boolean d;

    public axji(axjj axjjVar) {
        this.a = axjjVar;
        axjjVar.b++;
        List list = axjjVar.a;
        this.b = list == null ? 0 : list.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        axjj axjjVar;
        int i;
        int i2 = this.c;
        while (true) {
            axjjVar = this.a;
            i = this.b;
            if (i2 >= i || axjjVar.a(i2) != null) {
                break;
            }
            i2++;
        }
        this.c = i2;
        if (i2 < i) {
            return true;
        }
        if (!this.d) {
            this.d = true;
            int i3 = axjjVar.b - 1;
            axjjVar.b = i3;
            if (i3 <= 0 && axjjVar.d) {
                axjjVar.d = false;
                List list = axjjVar.a;
                if (list != null) {
                    if (axjjVar.c == 0) {
                        axjjVar.a = null;
                    } else {
                        list.removeAll(Collections.singleton(null));
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        axjj axjjVar = this.a;
        int i = this.c;
        this.c = i + 1;
        return axjjVar.a(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
