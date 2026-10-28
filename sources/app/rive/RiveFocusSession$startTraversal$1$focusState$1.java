package app.rive;

import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveFocusSession$startTraversal$1$focusState$1 extends awpk implements awqk {
    final /* synthetic */ RiveFocusDirection $direction;
    int label;
    final /* synthetic */ RiveFocusSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFocusSession$startTraversal$1$focusState$1(RiveFocusSession riveFocusSession, RiveFocusDirection riveFocusDirection, awoq awoqVar) {
        super(2, awoqVar);
        this.this$0 = riveFocusSession;
        this.$direction = riveFocusDirection;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveFocusSession$startTraversal$1$focusState$1(this.this$0, this.$direction, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveFocusSession$startTraversal$1$focusState$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
            return obj;
        }
        atqp.j(obj);
        RiveFocusSession riveFocusSession = this.this$0;
        RiveFocusDirection riveFocusDirection = this.$direction;
        awqk awqkVar = riveFocusSession.traverse;
        this.label = 1;
        Object objInvoke = awqkVar.invoke(riveFocusDirection, this);
        return objInvoke == awoxVar ? awoxVar : objInvoke;
    }
}
