package app.rive.core;

import app.rive.RiveLog;
import defpackage.awmy;
import defpackage.awou;
import defpackage.awqg;
import defpackage.awrm;
import defpackage.awuc;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class CommandQueue$suspendNativeResourceRequest$2$1 implements awqg {
    final /* synthetic */ awqg $cleanupOnce;
    final /* synthetic */ awuc $cont;
    final /* synthetic */ awrm $provisionalResource;
    final /* synthetic */ long $requestID;
    final /* synthetic */ CommandQueue this$0;

    public CommandQueue$suspendNativeResourceRequest$2$1(CommandQueue commandQueue, awuc awucVar, long j, awrm awrmVar, awqg awqgVar) {
        this.this$0 = commandQueue;
        this.$cont = awucVar;
        this.$requestID = j;
        this.$provisionalResource = awrmVar;
        this.$cleanupOnce = awqgVar;
    }

    public final void invoke(Throwable th) {
        awou context = this.$cont.getContext();
        final long j = this.$requestID;
        awqg awqgVar = new awqg() { // from class: app.rive.core.CommandQueue$suspendNativeResourceRequest$2$1.1
            public final void invoke(Throwable th2) {
                th2.getClass();
                final long j2 = j;
                RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th2, new Function0() { // from class: app.rive.core.CommandQueue.suspendNativeResourceRequest.2.1.1.1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to process cancellation for resource request " + j2;
                    }
                });
            }

            @Override // defpackage.awqg
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return awmy.a;
            }
        };
        final awrm awrmVar = this.$provisionalResource;
        final awqg awqgVar2 = this.$cleanupOnce;
        final CommandQueue commandQueue = this.this$0;
        commandQueue.runOrDispatchOnMain(context, awqgVar, new Function0() { // from class: app.rive.core.CommandQueue$suspendNativeResourceRequest$2$1.2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m517invoke() {
                commandQueue.pendingContinuations.remove(Long.valueOf(j));
                commandQueue.pendingResourceCleanups.remove(Long.valueOf(j));
                Object obj = awrmVar.a;
                if (obj != null) {
                    awqgVar2.invoke(obj);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m517invoke();
                return awmy.a;
            }
        });
    }

    @Override // defpackage.awqg
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return awmy.a;
    }
}
