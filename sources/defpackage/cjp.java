package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cjp extends Handler {
    final /* synthetic */ cjs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjp(cjs cjsVar, Looper looper) {
        super(looper);
        this.a = cjsVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr != null) {
            for (cjo cjoVar : this.a.b) {
                cjoVar.j();
                if (Arrays.equals(cjoVar.i, bArr)) {
                    if (message.what == 2 && cjoVar.h == 4) {
                        int i = bwp.a;
                        cjoVar.f(false);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
