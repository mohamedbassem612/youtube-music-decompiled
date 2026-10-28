package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awsn implements Iterator, awrp {
    private final /* synthetic */ int $cid;
    private int a;
    private final Object b;

    public awsn(awso awsoVar, int i) {
        this.$cid = i;
        this.b = new awsp((awsu) awsoVar.a);
        this.a = 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Iterator] */
    private final void a() {
        while (this.a > 0) {
            ?? r0 = this.b;
            if (!r0.hasNext()) {
                return;
            }
            r0.next();
            this.a--;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.$cid != 0) {
            return this.a < ((Object[]) this.b).length;
        }
        a();
        return this.b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.$cid == 0) {
            a();
            return this.b.next();
        }
        try {
            Object obj = this.b;
            int i = this.a;
            this.a = i + 1;
            return ((Object[]) obj)[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.$cid != 0) {
            a.aw();
        } else {
            a.aw();
        }
    }

    public awsn(Object[] objArr, int i) {
        this.$cid = i;
        this.b = objArr;
    }
}
