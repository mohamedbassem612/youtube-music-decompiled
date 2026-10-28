package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avys implements avln {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public avys(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [awoq, java.lang.Object] */
    @Override // defpackage.avln
    public final void b(Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            ((avyt) this.a).a.b(th);
            return;
        }
        ?? r2 = this.a;
        if (i != 1) {
            r2.resumeWith(atqp.i(th));
        } else {
            ((avyq) r2).a.b(th);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [awuc, java.lang.Object] */
    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        int i = this.$cid;
        if (i == 0) {
            avnr.d((AtomicReference) this.a, avmnVar);
            return;
        }
        ?? r2 = this.a;
        if (i != 1) {
            avkz.l(r2, avmnVar);
        } else {
            avnr.d((AtomicReference) r2, avmnVar);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [awoq, java.lang.Object] */
    @Override // defpackage.avln
    public final void ki(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((avyt) this.a).a.ki(obj);
            return;
        }
        ?? r2 = this.a;
        if (i != 1) {
            r2.resumeWith(obj);
        } else {
            ((avyq) r2).a.ki(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [awoq, java.lang.Object] */
    @Override // defpackage.avln
    public final void kn() {
        int i = this.$cid;
        if (i == 0) {
            ((avyt) this.a).a.kn();
            return;
        }
        ?? r2 = this.a;
        if (i != 1) {
            r2.resumeWith(null);
        } else {
            ((avyq) r2).a.kn();
        }
    }
}
