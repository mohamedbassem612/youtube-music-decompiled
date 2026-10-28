package app.rive.core;

import defpackage.atqp;
import defpackage.awmy;
import defpackage.awqg;
import defpackage.awuc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1 implements awqg {
    final /* synthetic */ awuc $cont;
    final /* synthetic */ long $requestID;
    final /* synthetic */ CommandQueue this$0;

    public CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(CommandQueue commandQueue, long j, awuc awucVar) {
        this.this$0 = commandQueue;
        this.$requestID = j;
        this.$cont = awucVar;
    }

    public final void invoke(Throwable th) {
        th.getClass();
        this.this$0.pendingContinuations.remove(Long.valueOf(this.$requestID));
        this.this$0.pendingResourceCleanups.remove(Long.valueOf(this.$requestID));
        this.$cont.resumeWith(atqp.i(th));
    }

    @Override // defpackage.awqg
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return awmy.a;
    }
}
