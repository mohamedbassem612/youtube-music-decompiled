package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class egj extends awpg {
    public Object a;
    public /* synthetic */ Object b;
    final /* synthetic */ ConstraintTrackingWorker c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egj(ConstraintTrackingWorker constraintTrackingWorker, awoq awoqVar) {
        super(awoqVar);
        this.c = constraintTrackingWorker;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(this);
    }
}
