package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import j$.util.Optional;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aclc {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aclc(aunn aunnVar, Optional optional, awut awutVar, awou awouVar, mbc mbcVar) {
        this.a = aunnVar;
        this.b = optional;
        this.c = awutVar;
        this.d = awouVar;
        this.e = mbcVar;
    }

    public final void a(GoogleHelp googleHelp) {
        try {
            kxv kxvVar = (kxv) ((kpz) this.a).C();
            Object obj = this.c;
            Object obj2 = this.e;
            Intent intent = (Intent) obj2;
            WeakReference weakReference = (WeakReference) obj;
            kxo kxoVar = new kxo(intent, weakReference, (qcb) this.d, (ixt) this.b);
            Parcel parcelC = kxvVar.c();
            gdc.c(parcelC, googleHelp);
            gdc.c(parcelC, null);
            gdc.e(parcelC, kxoVar);
            kxvVar.e(2, parcelC);
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
        }
    }

    public aclc(kxt kxtVar, WeakReference weakReference, Intent intent, qcb qcbVar, ixt ixtVar) {
        this.a = kxtVar;
        this.c = weakReference;
        this.e = intent;
        this.d = qcbVar;
        this.b = ixtVar;
    }

    public aclc(mpo mpoVar, omj omjVar, ntq ntqVar, nru nruVar, nsl nslVar) {
        this.c = omjVar;
        this.a = ntqVar;
        this.b = nruVar;
        this.d = nslVar;
        this.e = mpoVar;
    }

    public aclc(mpo mpoVar, omj omjVar, ntq ntqVar, nru nruVar, nsl nslVar, short[] sArr) {
        this.c = omjVar;
        this.b = ntqVar;
        this.d = nruVar;
        this.a = nslVar;
        this.e = mpoVar;
    }

    public aclc(mpo mpoVar, omj omjVar, ntq ntqVar, nru nruVar, nsl nslVar, short[] sArr, byte[] bArr) {
        this.c = omjVar;
        this.d = ntqVar;
        this.a = nruVar;
        this.b = nslVar;
        this.e = mpoVar;
    }
}
