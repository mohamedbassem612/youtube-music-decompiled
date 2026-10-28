package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class egg extends awpg {
    public /* synthetic */ Object a;
    final /* synthetic */ ConstraintTrackingWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egg(ConstraintTrackingWorker constraintTrackingWorker, awoq awoqVar) {
        super(awoqVar);
        this.b = constraintTrackingWorker;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(null, null, null, this);
    }
}
