package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agit extends agjc implements Serializable {
    private static final long serialVersionUID = 0;
    public final int a;
    private final Queue b;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public agit(int i) {
        ahno.I((i ^ (-1)) >>> 31, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    @Override // defpackage.agiy, defpackage.agjb
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.b;
    }

    @Override // defpackage.agiy, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        int i = this.a;
        if (i != 0) {
            if (size() == i) {
                this.b.remove();
            }
            this.b.add(obj);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // defpackage.agiy, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        int i = this.a;
        if (size < i) {
            return aguu.F(this, collection.iterator());
        }
        clear();
        collection.getClass();
        int i2 = size - i;
        ahno.G((i2 ^ (-1)) >>> 31, "number to skip cannot be negative");
        return aguu.P(this, new aglq(collection, i2));
    }

    @Override // defpackage.agjc, defpackage.agiy
    protected final /* synthetic */ Collection b() {
        return this.b;
    }

    @Override // defpackage.agjc
    protected final Queue c() {
        return this.b;
    }

    @Override // defpackage.agjc, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
