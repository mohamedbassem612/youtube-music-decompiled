package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wkm extends PhoneStateListener {
    final /* synthetic */ wkn a;

    public wkm(wkn wknVar) {
        this.a = wknVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        wkn wknVar = this.a;
        wknVar.b.set(wknVar.b());
    }
}
