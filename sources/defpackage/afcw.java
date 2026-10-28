package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afcw implements Handler.Callback {
    final /* synthetic */ afcy a;

    public afcw(afcy afcyVar) {
        this.a = afcyVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        afcy afcyVar = this.a;
        afcx afcxVar = (afcx) message.obj;
        synchronized (afcyVar.a) {
            if (afcyVar.c == afcxVar || afcyVar.d == afcxVar) {
                afcyVar.d(afcxVar, 2);
            }
        }
        return true;
    }
}
