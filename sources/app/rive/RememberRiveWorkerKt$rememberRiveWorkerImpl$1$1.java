package app.rive;

import app.rive.core.CommandQueue;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RememberRiveWorkerKt$rememberRiveWorkerImpl$1$1 extends awpk implements awqk {
    final /* synthetic */ boolean $tracingEnabled;
    final /* synthetic */ CommandQueue $worker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberRiveWorkerKt$rememberRiveWorkerImpl$1$1(CommandQueue commandQueue, boolean z, awoq awoqVar) {
        super(2, awoqVar);
        this.$worker = commandQueue;
        this.$tracingEnabled = z;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RememberRiveWorkerKt$rememberRiveWorkerImpl$1$1(this.$worker, this.$tracingEnabled, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RememberRiveWorkerKt$rememberRiveWorkerImpl$1$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(obj);
        CommandQueue commandQueue = this.$worker;
        if (commandQueue == null) {
            return awmy.a;
        }
        commandQueue.setTracingEnabled(this.$tracingEnabled);
        return awmy.a;
    }
}
