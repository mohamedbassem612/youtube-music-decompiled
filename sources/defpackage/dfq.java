package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dfq extends Handler {
    final /* synthetic */ dfu a;

    public dfq(dfu dfuVar) {
        this.a = dfuVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.a.jq((List) message.obj);
            return;
        }
        if (i == 2) {
            dfu dfuVar = this.a;
            if (dfuVar.d.isEmpty()) {
                dfuVar.k(2);
                Handler handler = dfuVar.e;
                handler.removeMessages(2);
                handler.removeMessages(3);
                handler.sendMessageDelayed(handler.obtainMessage(3), 15000L);
                return;
            }
            return;
        }
        if (i == 3) {
            dfu dfuVar2 = this.a;
            if (dfuVar2.d.isEmpty()) {
                dfuVar2.k(3);
                Handler handler2 = dfuVar2.e;
                handler2.removeMessages(2);
                handler2.removeMessages(3);
                handler2.removeMessages(1);
                dfuVar2.b.q(dfuVar2.c);
            }
        }
    }
}
