package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahqb extends kpk {
    private final String a;
    private final ahrs e;

    public ahqb(ahrs ahrsVar, String str) {
        super(null, false, 13201);
        this.a = str;
        this.e = ahrsVar;
    }

    @Override // defpackage.kpk
    protected final /* bridge */ /* synthetic */ void a(kmp kmpVar, kjc kjcVar) {
        ahpz ahpzVar = (ahpz) kmpVar;
        ahqa ahqaVar = new ahqa(this.e, kjcVar);
        String str = this.a;
        try {
            ahqd ahqdVar = (ahqd) ahpzVar.C();
            Parcel parcelC = ahqdVar.c();
            gdc.e(parcelC, ahqaVar);
            parcelC.writeString(str);
            ahqdVar.e(1, parcelC);
        } catch (RemoteException unused) {
        }
    }
}
