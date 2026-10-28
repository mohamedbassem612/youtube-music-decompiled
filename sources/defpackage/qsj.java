package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qsj implements Closeable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public qsj(afff afffVar, int i) {
        this.$cid = i;
        this.a = afffVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        if (i != 0) {
            Object obj = this.a;
            if (i != 1) {
                ahno.P(((afff) obj).a.compareAndSet(true, false), "AccountOperationContext is already in the immutable state. This may be caused by concurrent access to the object, which is forbidden.");
                return;
            } else {
                ((qsi) obj).c = true;
                return;
            }
        }
        Object obj2 = this.a;
        synchronized (((qso) obj2).h) {
            int i2 = ((qso) obj2).k;
            ahno.Q(i2 > 0, "Refcount went negative!", i2);
            ((qso) obj2).k--;
            ((qso) obj2).c();
        }
    }

    public /* synthetic */ qsj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
