package defpackage;

import java.util.Collection;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agqn extends agql implements Queue {
    private static final long serialVersionUID = 0;

    public agqn(Queue queue) {
        super(queue);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.agql
    public final /* synthetic */ Collection a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Queue] */
    @Override // java.util.Queue
    public final Object element() {
        Object objElement;
        synchronized (this.b) {
            objElement = this.a.element();
        }
        return objElement;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        synchronized (this.b) {
            ((agiy) this.a).add(obj);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Queue] */
    @Override // java.util.Queue
    public final Object peek() {
        Object objPeek;
        synchronized (this.b) {
            objPeek = this.a.peek();
        }
        return objPeek;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Queue] */
    @Override // java.util.Queue
    public final Object poll() {
        Object objPoll;
        synchronized (this.b) {
            objPoll = this.a.poll();
        }
        return objPoll;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Queue] */
    @Override // java.util.Queue
    public final Object remove() {
        Object objRemove;
        synchronized (this.b) {
            objRemove = this.a.remove();
        }
        return objRemove;
    }
}
