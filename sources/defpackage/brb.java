package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class brb implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ zf d;
    final /* synthetic */ qcb e;

    public brb(qcb qcbVar, zf zfVar, int i, String str, int i2) {
        this.e = qcbVar;
        this.d = zfVar;
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bqp bqpVar;
        Object obj = this.e.a;
        zf zfVar = this.d;
        IBinder iBinderL = zfVar.l();
        bre breVar = (bre) obj;
        afv afvVar = breVar.c;
        afvVar.remove(iBinderL);
        Iterator it = breVar.b.iterator();
        while (true) {
            bqpVar = null;
            if (!it.hasNext()) {
                break;
            }
            bqp bqpVar2 = (bqp) it.next();
            int i = bqpVar2.c;
            if (i == this.a) {
                bqpVar = (TextUtils.isEmpty(this.b) || this.c <= 0) ? new bqp(breVar, bqpVar2.a, bqpVar2.b, i, zfVar) : null;
                it.remove();
                break;
            }
        }
        if (bqpVar == null) {
            bqpVar = new bqp(breVar, this.b, this.c, this.a, zfVar);
        }
        afvVar.put(iBinderL, bqpVar);
        try {
            iBinderL.linkToDeath(bqpVar, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
