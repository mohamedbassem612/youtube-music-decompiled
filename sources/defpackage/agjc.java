package defpackage;

import java.util.Collection;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agjc extends agiy implements Queue {
    protected agjc() {
    }

    @Override // defpackage.agiy
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract Queue c();

    @Override // java.util.Queue
    public final Object element() {
        return c().element();
    }

    public boolean offer(Object obj) {
        return c().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return c().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return c().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return c().remove();
    }
}
