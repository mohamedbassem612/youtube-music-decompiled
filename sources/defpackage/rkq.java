package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.CommandHandlerResolver;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rkq implements avld {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rkq(axfd axfdVar, CommandOuterClass$Command commandOuterClass$Command, nrv nrvVar, int i) {
        this.$cid = i;
        this.a = axfdVar;
        this.c = commandOuterClass$Command;
        this.b = nrvVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, xzc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.avld
    public final void a(avpr avprVar) {
        int i = this.$cid;
        int i2 = 2;
        DebuggerClient debuggerClient = null;
        if (i == 0) {
            taf.i(this.b, MoreExecutors.directExecutor(), new ijj(avprVar, 15), new rjy(this.a, avprVar, this.c, i2), null);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                taf.i(this.b, MoreExecutors.directExecutor(), new ijj(avprVar, 16), new rjy(this.a, this.c, (Object) avprVar, 3, (byte[]) null), null);
                return;
            }
            final avmm avmmVar = new avmm();
            final xoz xozVar = new xoz((xvr) this.b, this.c, avprVar, avmmVar);
            final xpc xpcVar = (xpc) this.a;
            xpcVar.i.a(xozVar);
            avprVar.c(new avnh() { // from class: xox
                @Override // defpackage.avnh
                public final void a() {
                    avmmVar.dispose();
                    xpcVar.i.d(xozVar);
                }
            });
            return;
        }
        mpc mpcVar = new mpc(avprVar);
        nrv nrvVar = (nrv) this.b;
        if (nrvVar.f == null) {
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
        }
        axfd axfdVar = (axfd) this.a;
        nsu nsuVar = (nsu) axfdVar.c.io();
        if (nsuVar != null && nsuVar.a()) {
            debuggerClient = (DebuggerClient) axfdVar.b.io();
        }
        Object obj = this.c;
        if (agev.h(((CommandHandlerResolver) axfdVar.a.io()).handleCommand((CommandOuterClass$Command) obj, new mqo((ByteStore) axfdVar.d.io(), nrvVar, debuggerClient, (mqp) axfdVar.e), mpcVar)).g()) {
            return;
        }
        avprVar.b(new IllegalArgumentException("Unsupported command: ".concat(String.valueOf(String.valueOf(obj)))));
    }

    public /* synthetic */ rkq(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
