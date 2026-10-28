package app.rive.core;

import defpackage.awmy;
import defpackage.awql;
import defpackage.awrb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class CommandQueue$clearFocus$1 extends awrb implements awql {
    public CommandQueue$clearFocus$1(Object obj) {
        super(3, obj, CommandQueueBridge.class, "cppClearFocus", "cppClearFocus(JJJ)V", 0);
    }

    @Override // defpackage.awql
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), ((Number) obj3).longValue());
        return awmy.a;
    }

    public final void invoke(long j, long j2, long j3) {
        ((CommandQueueBridge) this.receiver).cppClearFocus(j, j2, j3);
    }
}
