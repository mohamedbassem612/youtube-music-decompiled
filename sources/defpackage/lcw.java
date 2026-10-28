package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lcw implements lov {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lcw(Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.lov
    public final void d(Exception exc) {
        klo kloVar;
        if (this.$cid == 0) {
            ((AtomicLong) ((oml) this.b).b).set(this.a);
            return;
        }
        exc.getMessage();
        if ((exc instanceof kmu) && (kloVar = ((kmu) exc).a.i) != null && kloVar.c == 24) {
            ((jwc) this.b).c.set(this.a);
        }
    }
}
