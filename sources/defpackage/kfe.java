package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kfe implements lov {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kfe(Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.lov
    public final void d(Exception exc) {
        int iA;
        int i = this.$cid;
        if (i == 0) {
            iA = exc instanceof kmu ? ((kmu) exc).a() : 13;
            Iterator it = ((kff) this.b).b.c.e.iterator();
            while (it.hasNext()) {
                ((kht) it.next()).e(this.a, iA, null);
            }
            return;
        }
        if (i == 1) {
            ((AtomicLong) ((jij) this.b).b).set(this.a);
            return;
        }
        iA = exc instanceof kmu ? ((kmu) exc).a() : 13;
        Object obj = this.b;
        khn khnVar = kgj.a;
        khn.e();
        Iterator it2 = ((kgg) obj).a.b.e.iterator();
        while (it2.hasNext()) {
            ((kht) it2.next()).e(this.a, iA, null);
        }
    }
}
