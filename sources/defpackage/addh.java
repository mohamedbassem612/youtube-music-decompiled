package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class addh extends Handler {
    final /* synthetic */ aknp a;
    final /* synthetic */ nrv b;
    final /* synthetic */ addi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addh(addi addiVar, Looper looper, aknp aknpVar, nrv nrvVar) {
        super(looper);
        this.a = aknpVar;
        this.b = nrvVar;
        this.c = addiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            addi.f(this.a, this.b, this.c.a).D();
        }
    }
}
