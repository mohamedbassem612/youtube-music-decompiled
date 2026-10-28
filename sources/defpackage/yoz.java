package defpackage;

import android.content.Context;
import android.os.Handler;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yoz {
    public final mbc a;
    public final zjr b;
    public final Handler c;
    public long d = 0;
    public boolean e = false;
    public final tfq f;
    private final Context g;

    public yoz(Context context, mbc mbcVar, zjr zjrVar, Handler handler, tfq tfqVar) {
        this.g = context;
        this.a = mbcVar;
        this.b = zjrVar;
        this.c = handler;
        this.f = tfqVar;
    }

    public final void a(twi twiVar) {
        boolean z;
        TelephonyManager telephonyManager = (TelephonyManager) this.g.getSystemService("phone");
        if (telephonyManager != null) {
            synchronized (this) {
                if (this.e) {
                    z = false;
                } else {
                    this.e = true;
                    z = true;
                }
            }
            if (z) {
                telephonyManager.listen(new yoy(this, telephonyManager, twiVar), 1);
            }
        }
    }
}
