package app.rive.core;

import defpackage.awmy;
import defpackage.awqg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class CommandQueue$suspendNativeRequest$2$1$1 implements awqg {
    final /* synthetic */ long $requestID;
    final /* synthetic */ CommandQueue this$0;

    public CommandQueue$suspendNativeRequest$2$1$1(CommandQueue commandQueue, long j) {
        this.this$0 = commandQueue;
        this.$requestID = j;
    }

    public final void invoke(Throwable th) {
        this.this$0.pendingContinuations.remove(Long.valueOf(this.$requestID));
    }

    @Override // defpackage.awqg
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return awmy.a;
    }
}
