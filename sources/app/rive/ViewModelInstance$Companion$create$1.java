package app.rive;

import defpackage.awoq;
import defpackage.awpg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ViewModelInstance$Companion$create$1 extends awpg {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ViewModelInstance.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstance$Companion$create$1(ViewModelInstance.Companion companion, awoq awoqVar) {
        super(awoqVar);
        this.this$0 = companion;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, null, this);
    }
}
