package app.rive;

import app.rive.core.CommandQueue;
import app.rive.core.FrameTicker;
import app.rive.core.FrameTickerKt;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;
import defpackage.boc;
import defpackage.bog;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RememberRiveWorkerKt$rememberRiveWorkerImpl$2$1 extends awpk implements awqk {
    final /* synthetic */ boolean $autoPoll;
    final /* synthetic */ bog $lifecycleOwner;
    final /* synthetic */ CommandQueue $worker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberRiveWorkerKt$rememberRiveWorkerImpl$2$1(CommandQueue commandQueue, boolean z, bog bogVar, awoq awoqVar) {
        super(2, awoqVar);
        this.$worker = commandQueue;
        this.$autoPoll = z;
        this.$lifecycleOwner = bogVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RememberRiveWorkerKt$rememberRiveWorkerImpl$2$1(this.$worker, this.$autoPoll, this.$lifecycleOwner, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RememberRiveWorkerKt$rememberRiveWorkerImpl$2$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i == 0) {
            atqp.j(obj);
            CommandQueue commandQueue = this.$worker;
            if (commandQueue != null && this.$autoPoll) {
                boc lifecycle = this.$lifecycleOwner.getLifecycle();
                FrameTicker composeFrameTicker = FrameTickerKt.getComposeFrameTicker();
                this.label = 1;
                if (commandQueue.beginPolling(lifecycle, composeFrameTicker, this) == awoxVar) {
                    return awoxVar;
                }
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
