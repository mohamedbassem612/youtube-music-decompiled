package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cla extends Handler {
    final /* synthetic */ clc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cla(clc clcVar, Looper looper) {
        super(looper);
        this.a = clcVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        clb clbVar;
        clc clcVar = this.a;
        int i = message.what;
        if (i == 1) {
            clbVar = (clb) message.obj;
            int i2 = clbVar.a;
            int i3 = clbVar.b;
            try {
                clcVar.c.queueInputBuffer(i2, 0, clbVar.c, clbVar.e, clbVar.f);
            } catch (RuntimeException e) {
                a.ap(clcVar.d, e);
            }
        } else if (i != 2) {
            clbVar = null;
            if (i == 3) {
                clcVar.e.h();
            } else if (i != 4) {
                a.ap(clcVar.d, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    clcVar.c.setParameters((Bundle) message.obj);
                } catch (RuntimeException e2) {
                    a.ap(clcVar.d, e2);
                }
            }
        } else {
            clbVar = (clb) message.obj;
            int i4 = clbVar.a;
            int i5 = clbVar.b;
            MediaCodec.CryptoInfo cryptoInfo = clbVar.d;
            long j = clbVar.e;
            int i6 = clbVar.f;
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    clcVar.c.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                } else {
                    synchronized (clc.b) {
                        clcVar.c.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                    }
                }
            } catch (RuntimeException e3) {
                a.ap(clcVar.d, e3);
            }
        }
        if (clbVar != null) {
            ArrayDeque arrayDeque = clc.a;
            synchronized (arrayDeque) {
                arrayDeque.add(clbVar);
            }
        }
    }
}
