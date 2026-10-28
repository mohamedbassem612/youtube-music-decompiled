package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dia extends Handler {
    final /* synthetic */ dic a;

    public dia(dic dicVar) {
        this.a = dicVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            dic dicVar = this.a;
            Messenger messenger = (Messenger) message.obj;
            dhz dhzVar = dicVar.d;
            int iF = dhzVar.f(messenger);
            if (iF >= 0) {
                dhzVar.h(iF).b();
            }
        }
    }
}
