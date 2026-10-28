package app.rive;

import defpackage.awoq;
import defpackage.awpg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveFile$Companion$fromSource$1 extends awpg {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RiveFile.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFile$Companion$fromSource$1(RiveFile.Companion companion, awoq awoqVar) {
        super(awoqVar);
        this.this$0 = companion;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fromSource(null, null, this);
    }
}
