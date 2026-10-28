package app.rive;

import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;
import defpackage.awyp;
import defpackage.awzc;
import defpackage.awzd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ViewModelInstance$completeWhenClosed$1$updatesJob$1 extends awpk implements awqk {
    final /* synthetic */ awyp $$this$channelFlow;
    final /* synthetic */ awzc $this_completeWhenClosed;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstance$completeWhenClosed$1$updatesJob$1(awzc awzcVar, awyp awypVar, awoq awoqVar) {
        super(2, awoqVar);
        this.$this_completeWhenClosed = awzcVar;
        this.$$this$channelFlow = awypVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new ViewModelInstance$completeWhenClosed$1$updatesJob$1(this.$this_completeWhenClosed, this.$$this$channelFlow, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((ViewModelInstance$completeWhenClosed$1$updatesJob$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i == 0) {
            atqp.j(obj);
            awzc awzcVar = this.$this_completeWhenClosed;
            final awyp awypVar = this.$$this$channelFlow;
            awzd awzdVar = new awzd() { // from class: app.rive.ViewModelInstance$completeWhenClosed$1$updatesJob$1.1
                @Override // defpackage.awzd
                public final Object emit(Object obj2, awoq awoqVar) {
                    Object objH = awypVar.h(obj2, awoqVar);
                    return objH != awox.a ? awmy.a : objH;
                }
            };
            this.label = 1;
            if (awzcVar.collect(awzdVar, this) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }
}
