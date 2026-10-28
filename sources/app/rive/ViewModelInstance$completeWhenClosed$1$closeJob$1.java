package app.rive;

import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awqx;
import defpackage.awut;
import defpackage.awwd;
import defpackage.axae;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ViewModelInstance$completeWhenClosed$1$closeJob$1 extends awpk implements awqk {
    final /* synthetic */ awwd $updatesJob;
    int label;
    final /* synthetic */ ViewModelInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstance$completeWhenClosed$1$closeJob$1(ViewModelInstance viewModelInstance, awwd awwdVar, awoq awoqVar) {
        super(2, awoqVar);
        this.this$0 = viewModelInstance;
        this.$updatesJob = awwdVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new ViewModelInstance$completeWhenClosed$1$closeJob$1(this.this$0, this.$updatesJob, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((ViewModelInstance$completeWhenClosed$1$closeJob$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i == 0) {
            atqp.j(obj);
            axae axaeVar = this.this$0.closeFlow;
            this.label = 1;
            if (awqx.o(axaeVar, this) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        this.$updatesJob.p(null);
        return awmy.a;
    }
}
