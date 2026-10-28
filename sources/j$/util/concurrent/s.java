package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class s implements Spliterator {
    public ConcurrentLinkedQueue.Node a;
    public int b;
    public boolean c;
    public final /* synthetic */ ConcurrentLinkedQueue d;

    public s(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.d = concurrentLinkedQueue;
    }

    public final ConcurrentLinkedQueue.Node a() {
        ConcurrentLinkedQueue.Node nodeB = this.a;
        if (nodeB == null && !this.c) {
            nodeB = this.d.b();
            this.a = nodeB;
            if (nodeB == null) {
                this.c = true;
            }
        }
        return nodeB;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4368;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA != null) {
            this.a = null;
            this.c = true;
            this.d.d(consumer, nodeA);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        E e;
        consumer.getClass();
        ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA != null) {
            do {
                e = nodeA.item;
                ConcurrentLinkedQueue.Node node = nodeA.next;
                nodeA = nodeA == node ? this.d.b() : node;
                if (e != 0) {
                    break;
                }
            } while (nodeA != null);
            this.a = nodeA;
            if (nodeA == null) {
                this.c = true;
            }
            if (e != 0) {
                consumer.accept(e);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        ConcurrentLinkedQueue.Node node;
        ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA == null || (node = nodeA.next) == null) {
            return null;
        }
        int iMin = Math.min(this.b + 1, 33554432);
        this.b = iMin;
        Object[] objArr = null;
        int i = 0;
        do {
            Object obj = nodeA.item;
            if (obj != null) {
                if (objArr == null) {
                    objArr = new Object[iMin];
                }
                objArr[i] = obj;
                i++;
            }
            nodeA = nodeA == node ? this.d.b() : node;
            if (nodeA == null || (node = nodeA.next) == null) {
                break;
            }
        } while (i < iMin);
        this.a = nodeA;
        if (nodeA == null) {
            this.c = true;
        }
        if (i != 0) {
            return Spliterators.b(objArr, 0, i, 4368);
        }
        return null;
    }
}
