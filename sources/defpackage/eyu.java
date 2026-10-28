package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eyu {
    private static final Queue a;
    private int b;
    private int c;
    private Object d;

    static {
        char[] cArr = ffs.a;
        a = new ArrayDeque(0);
    }

    private eyu() {
    }

    public static eyu a(Object obj, int i, int i2) {
        eyu eyuVar;
        Queue queue = a;
        synchronized (queue) {
            eyuVar = (eyu) queue.poll();
        }
        if (eyuVar == null) {
            eyuVar = new eyu();
        }
        eyuVar.d = obj;
        eyuVar.c = i;
        eyuVar.b = i2;
        return eyuVar;
    }

    public final void b() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eyu)) {
            return false;
        }
        eyu eyuVar = (eyu) obj;
        return this.c == eyuVar.c && this.b == eyuVar.b && this.d.equals(eyuVar.d);
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d.hashCode();
    }
}
