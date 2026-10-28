package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dks extends Handler {
    final /* synthetic */ dky a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dks(dky dkyVar, Looper looper) {
        super(looper);
        this.a = dkyVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.bindPreferences();
        }
    }
}
