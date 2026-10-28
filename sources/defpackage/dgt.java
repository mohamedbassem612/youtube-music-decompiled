package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dgt extends Handler {
    final /* synthetic */ dgu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgt(dgu dguVar) {
        super(Looper.getMainLooper());
        this.a = dguVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        int i2 = message.arg1;
        int i3 = message.arg2;
        SparseArray sparseArray = this.a.e;
        Object obj = message.obj;
        Bundle bundlePeekData = message.peekData();
        vy vyVar = (vy) sparseArray.get(i2);
        if (vyVar == null) {
            Log.w("MR2Provider", "Pending callback not found for control request.");
            return;
        }
        sparseArray.remove(i2);
        if (i == 3) {
            vyVar.m((Bundle) obj);
        } else if (i == 4) {
            vyVar.l(bundlePeekData == null ? null : bundlePeekData.getString("error"), (Bundle) obj);
        }
    }
}
