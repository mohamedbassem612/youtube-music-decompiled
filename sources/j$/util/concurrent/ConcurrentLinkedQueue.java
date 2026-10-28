package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class ConcurrentLinkedQueue<E> extends AbstractQueue<E> implements Queue<E>, Serializable, Collection<E> {
    public static final j$.com.android.tools.r8.a a;
    public static final j$.com.android.tools.r8.a b;
    public static final j$.com.android.tools.r8.a c;
    public static final j$.com.android.tools.r8.a d;
    private static final long serialVersionUID = 196745693267521676L;
    volatile transient Node<E> head;
    private volatile transient Node<E> tail;

    static {
        try {
            a = new j$.com.android.tools.r8.a(ConcurrentLinkedQueue.class, "head", Node.class);
            b = new j$.com.android.tools.r8.a(ConcurrentLinkedQueue.class, "tail", Node.class);
            c = new j$.com.android.tools.r8.a(Node.class, "item", Object.class);
            d = new j$.com.android.tools.r8.a(Node.class, "next", Node.class);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public ConcurrentLinkedQueue() {
        Node<E> node = new Node<>();
        this.tail = node;
        this.head = node;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Node<E> node = null;
        Node<E> node2 = null;
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                break;
            }
            Node<E> node3 = new Node<>(object);
            if (node == null) {
                node = node3;
            } else {
                node2.getClass();
                d.b(node2, node3);
            }
            node2 = node3;
        }
        if (node == null) {
            node = new Node<>();
            node2 = node;
        }
        this.head = node;
        this.tail = node2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Node<E> nodeB = b();
        while (nodeB != null) {
            E e = nodeB.item;
            if (e != null) {
                objectOutputStream.writeObject(e);
            }
            Node<E> node = nodeB.next;
            nodeB = nodeB == node ? this.head : node;
        }
        objectOutputStream.writeObject(null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0050  */
    /* JADX WARN: Code duplicated, block: B:40:0x0053 A[SYNTHETIC] */
    public final boolean a(Predicate predicate) {
        boolean z = false;
        while (true) {
            Node<E> node = this.head;
            Node<E> node2 = node;
            Node<E> node3 = null;
            int i = 8;
            while (node != null) {
                Node<E> node4 = node.next;
                E e = node.item;
                boolean zA = true;
                boolean z2 = e != null;
                if (z2 && predicate.test(e)) {
                    if (c.a(node, e, null)) {
                        z = true;
                    }
                    z2 = false;
                }
                if (z2 || node4 == null || (i = i - 1) == 0) {
                    if (node2 != node) {
                        j$.com.android.tools.r8.a aVar = d;
                        if (node3 != null) {
                            zA = aVar.a(node3, node2, node);
                        } else if (a.a(this, node2, node)) {
                            aVar.c(node2, node2);
                        } else {
                            zA = false;
                        }
                        if (zA) {
                            node2 = node;
                            if (z2) {
                                node3 = node;
                                i = 8;
                                node2 = node4;
                            }
                        } else {
                            node3 = node;
                            i = 8;
                            node2 = node4;
                        }
                    } else if (z2) {
                        node3 = node;
                        i = 8;
                        node2 = node4;
                    }
                } else if (node == node4) {
                }
                node = node4;
            }
            return z;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        return offer(e);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        Node<E> node;
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        Node node2 = null;
        Node node3 = null;
        for (E e : collection) {
            e.getClass();
            Node node4 = new Node(e);
            if (node2 == null) {
                node2 = node4;
            } else {
                node3.getClass();
                d.b(node3, node4);
            }
            node3 = node4;
        }
        if (node2 == null) {
            return false;
        }
        Node<E> node5 = this.tail;
        Node<E> node6 = node5;
        while (true) {
            Node<E> node7 = node5.next;
            if (node7 == null) {
                if (d.a(node5, null, node2)) {
                    break;
                }
            } else if (node5 == node7) {
                Node<E> node8 = this.tail;
                Node<E> node9 = node6 != node8 ? node8 : this.head;
                node6 = node8;
                node5 = node9;
            } else {
                if (node5 == node6) {
                    node = node6;
                } else {
                    node = this.tail;
                    if (node6 != node) {
                        node7 = node;
                    } else {
                        node6 = node;
                        node = node6;
                    }
                }
                node6 = node;
                node5 = node7;
            }
        }
        j$.com.android.tools.r8.a aVar = b;
        if (!aVar.f(this, node6, node3)) {
            Node<E> node10 = this.tail;
            if (node3.next == null) {
                aVar.f(this, node10, node3);
            }
        }
        return true;
    }

    public final Node b() {
        Node<E> node;
        Node<E> node2;
        boolean z;
        Node<E> node3;
        loop0: while (true) {
            node = this.head;
            node2 = node;
            while (true) {
                z = node2.item != null;
                if (z || (node3 = node2.next) == null) {
                    break loop0;
                }
                if (node2 != node3) {
                    node2 = node3;
                }
            }
        }
        h(node, node2);
        if (z) {
            return node2;
        }
        return null;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        a(new j$.desugar.sun.nio.fs.o((byte) 11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        while (true) {
            Node<E> node = this.head;
            Node<E> nodeE = null;
            while (node != null) {
                Node<E> node2 = node.next;
                E e = node.item;
                if (e == null) {
                    Node<E> node3 = node;
                    while (true) {
                        if (node2 == null || node2.item != null) {
                            nodeE = e(nodeE, node, node3, node2);
                        } else if (node3 != node2) {
                            node3 = node2;
                            node2 = node2.next;
                        }
                    }
                } else {
                    if (obj.equals(e)) {
                        return true;
                    }
                    nodeE = node;
                }
                node = node2;
            }
            return false;
        }
    }

    public final void d(Consumer consumer, Node node) {
        while (true) {
            Node node2 = null;
            while (node != null) {
                Node<E> node3 = node.next;
                E e = node.item;
                if (e != null) {
                    consumer.accept(e);
                } else {
                    Node node4 = node;
                    while (true) {
                        if (node3 == null || node3.item != null) {
                            node = e(node2, node, node4, node3);
                        } else if (node4 == node3) {
                            node = this.head;
                        } else {
                            node4 = node3;
                            node3 = node3.next;
                        }
                    }
                }
                node2 = node;
                node = node3;
            }
            return;
        }
    }

    public final Node e(Node node, Node node2, Node node3, Node node4) {
        boolean zA;
        Object objValueOf;
        if (node4 == null) {
            if (node2 == node3) {
                return node;
            }
            node4 = node3;
        }
        j$.com.android.tools.r8.a aVar = d;
        if (node != null) {
            zA = aVar.a(node, node2, node4);
        } else if (a.a(this, node2, node4)) {
            aVar.c(node2, node2);
            zA = true;
        } else {
            zA = false;
        }
        if (zA) {
            if (node == null) {
                return node;
            }
            Unsafe unsafe = j$.com.android.tools.r8.a.c;
            j$.com.android.tools.r8.a aVar2 = c;
            long j = aVar2.b;
            Class cls = aVar2.a;
            if (cls == Integer.TYPE) {
                objValueOf = Integer.valueOf(unsafe.getInt(node, j));
            } else {
                objValueOf = cls == Long.TYPE ? Long.valueOf(unsafe.getLong(node, j)) : unsafe.getObject(node, j);
            }
            if (objValueOf != null) {
                return node;
            }
        }
        return node3;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        d(consumer, this.head);
    }

    public final Object[] g(Object[] objArr) {
        int i;
        Object[] objArrCopyOf = objArr;
        loop0: while (true) {
            Node<E> nodeB = b();
            i = 0;
            while (true) {
                if (nodeB == null) {
                    break loop0;
                }
                E e = nodeB.item;
                if (e != null) {
                    if (objArrCopyOf == null) {
                        objArrCopyOf = new Object[4];
                    } else if (i == objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, (i + 4) << 1);
                    }
                    objArrCopyOf[i] = e;
                    i++;
                }
                Node<E> node = nodeB.next;
                if (nodeB != node) {
                    nodeB = node;
                }
            }
        }
        if (objArrCopyOf == null) {
            return new Object[0];
        }
        if (objArr == null || i > objArr.length) {
            return i == objArrCopyOf.length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i);
        }
        if (objArr != objArrCopyOf) {
            System.arraycopy(objArrCopyOf, 0, objArr, 0, i);
        }
        if (i < objArr.length) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final void h(Node node, Node node2) {
        if (node == node2 || !a.a(this, node, node2)) {
            return;
        }
        d.c(node, node);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return b() == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new t(this);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        Node<E> node;
        e.getClass();
        Node node2 = new Node(e);
        Node<E> node3 = this.tail;
        Node<E> node4 = node3;
        while (true) {
            Node<E> node5 = node3.next;
            if (node5 == null) {
                if (d.a(node3, null, node2)) {
                    break;
                }
            } else if (node3 == node5) {
                Node<E> node6 = this.tail;
                Node<E> node7 = node4 != node6 ? node6 : this.head;
                node4 = node6;
                node3 = node7;
            } else {
                if (node3 == node4) {
                    node = node4;
                } else {
                    node = this.tail;
                    if (node4 != node) {
                        node5 = node;
                    } else {
                        node4 = node;
                        node = node4;
                    }
                }
                node4 = node;
                node3 = node5;
            }
        }
        if (node3 == node4) {
            return true;
        }
        b.f(this, node4, node2);
        return true;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Queue
    public E peek() {
        Node<E> node;
        Node<E> node2;
        E e;
        Node<E> node3;
        loop0: while (true) {
            node = this.head;
            node2 = node;
            while (true) {
                e = node2.item;
                if (e != null || (node3 = node2.next) == null) {
                    break loop0;
                }
                if (node2 != node3) {
                    node2 = node3;
                }
            }
        }
        h(node, node2);
        return e;
    }

    @Override // java.util.Queue
    public E poll() {
        while (true) {
            Node<E> node = this.head;
            Node<E> node2 = node;
            while (true) {
                E e = node2.item;
                if (e != null && c.a(node2, e, null)) {
                    if (node2 == node) {
                        return e;
                    }
                    Node<E> node3 = node2.next;
                    if (node3 != null) {
                        node2 = node3;
                    }
                    h(node, node2);
                    return e;
                }
                Node<E> node4 = node2.next;
                if (node4 == null) {
                    h(node, node2);
                    return null;
                }
                if (node2 != node4) {
                    node2 = node4;
                }
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        while (true) {
            Node<E> node = this.head;
            Node<E> nodeE = null;
            while (node != null) {
                Node<E> node2 = node.next;
                E e = node.item;
                if (e == null) {
                    Node<E> node3 = node;
                    while (true) {
                        if (node2 == null || node2.item != null) {
                            nodeE = e(nodeE, node, node3, node2);
                        } else if (node3 != node2) {
                            node3 = node2;
                            node2 = node2.next;
                        }
                    }
                } else {
                    if (obj.equals(e) && c.a(node, e, null)) {
                        e(nodeE, node, node, node2);
                        return true;
                    }
                    nodeE = node;
                }
                node = node2;
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        return a(new r(collection, (byte) 1));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        predicate.getClass();
        return a(predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        return a(new r(collection, (byte) 0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i;
        loop0: while (true) {
            Node<E> nodeB = b();
            i = 0;
            while (nodeB != null && (nodeB.item == null || (i = i + 1) != Integer.MAX_VALUE)) {
                Node<E> node = nodeB.next;
                if (nodeB != node) {
                    nodeB = node;
                }
            }
            break loop0;
        }
        return i;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final Spliterator spliterator() {
        return new s(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return g(objArr);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i;
        int length;
        String[] strArr = null;
        loop0: while (true) {
            Node<E> nodeB = b();
            i = 0;
            length = 0;
            while (true) {
                if (nodeB == null) {
                    break loop0;
                }
                E e = nodeB.item;
                if (e != null) {
                    if (strArr == null) {
                        strArr = new String[4];
                    } else if (i == strArr.length) {
                        strArr = (String[]) Arrays.copyOf(strArr, i << 1);
                    }
                    String string = e.toString();
                    strArr[i] = string;
                    length += string.length();
                    i++;
                }
                Node<E> node = nodeB.next;
                if (nodeB != node) {
                    nodeB = node;
                }
            }
        }
        if (i == 0) {
            return "[]";
        }
        char[] cArr = new char[length + (i << 1)];
        cArr[0] = '[';
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                int i4 = i2 + 1;
                cArr[i2] = ',';
                i2 += 2;
                cArr[i4] = ' ';
            }
            String str = strArr[i3];
            int length2 = str.length();
            str.getChars(0, length2, cArr, i2);
            i2 += length2;
        }
        cArr[i2] = ']';
        return new String(cArr);
    }

    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    static final class Node<E> {
        volatile E item;
        volatile Node<E> next;

        public Node(Object obj) {
            ConcurrentLinkedQueue.c.b(this, obj);
        }

        public Node() {
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return g(null);
    }
}
