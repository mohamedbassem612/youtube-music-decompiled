package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class aen implements AutoCloseable {
    public final ArrayDeque a;

    private aen(Object obj, String str, ArrayDeque arrayDeque) {
        this.a = arrayDeque;
        if (obj != null) {
            arrayDeque.addFirst(new aem(obj, str));
        }
    }

    static aen a() {
        return new aen(null, "", new ArrayDeque());
    }

    static aen b(Object obj, String str, aen aenVar) {
        return new aen(obj, str, aenVar.a);
    }

    final String c() {
        StringBuilder sb = new StringBuilder();
        ArrayDeque arrayDeque = this.a;
        int iMin = Math.min(arrayDeque.size(), 8);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            int i = iMin - 1;
            if (iMin <= 0) {
                break;
            }
            sb.append(((aem) itDescendingIterator.next()).a());
            iMin = i;
        }
        if (itDescendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.removeFirst();
    }
}
