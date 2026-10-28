package app.rive;

import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awuj;
import defpackage.awut;
import defpackage.awwd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveCanvasSession$beginPlaying$3$closeWatcher$1 extends awpk implements awqk {
    final /* synthetic */ awwd $renderLoop;
    int label;
    final /* synthetic */ RiveCanvasSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession$beginPlaying$3$closeWatcher$1(RiveCanvasSession riveCanvasSession, awwd awwdVar, awoq awoqVar) {
        super(2, awoqVar);
        this.this$0 = riveCanvasSession;
        this.$renderLoop = awwdVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveCanvasSession$beginPlaying$3$closeWatcher$1(this.this$0, this.$renderLoop, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveCanvasSession$beginPlaying$3$closeWatcher$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i == 0) {
            atqp.j(obj);
            awuj awujVar = this.this$0.closeSignal;
            this.label = 1;
            if (awujVar.c(this) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        this.$renderLoop.p(null);
        return awmy.a;
    }
}
