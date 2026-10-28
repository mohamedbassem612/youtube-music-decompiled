package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhl extends Handler {
    final /* synthetic */ dhp a;

    public dhl(dhp dhpVar) {
        this.a = dhpVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                dhp dhpVar = this.a;
                dhpVar.i = false;
                dhpVar.e(dhpVar.h);
                return;
            }
            return;
        }
        dhp dhpVar2 = this.a;
        dhpVar2.k = false;
        ast astVar = dhpVar2.l;
        if (astVar != null) {
            astVar.f(dhpVar2, dhpVar2.j);
        }
    }
}
