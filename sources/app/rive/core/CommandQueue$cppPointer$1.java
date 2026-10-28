package app.rive.core;

import defpackage.awmy;
import defpackage.awqg;
import defpackage.awrb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class CommandQueue$cppPointer$1 extends awrb implements awqg {
    public CommandQueue$cppPointer$1(Object obj) {
        super(1, obj, CommandQueue.class, "dispose", "dispose(J)V", 0);
    }

    @Override // defpackage.awqg
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return awmy.a;
    }

    public final void invoke(long j) {
        ((CommandQueue) this.receiver).dispose(j);
    }
}
