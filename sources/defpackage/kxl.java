package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kxl extends kxq {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long b;
    final /* synthetic */ GoogleHelp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxl(knc kncVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(kncVar);
        this.a = bundle;
        this.b = j;
        this.c = googleHelp;
    }

    @Override // defpackage.kxp
    protected final void n(kxv kxvVar) {
        try {
            Bundle bundle = this.a;
            long j = this.b;
            GoogleHelp googleHelp = this.c;
            kxk kxkVar = new kxk(this);
            Parcel parcelC = kxvVar.c();
            gdc.c(parcelC, bundle);
            parcelC.writeLong(j);
            gdc.c(parcelC, googleHelp);
            gdc.e(parcelC, kxkVar);
            kxvVar.f(9, parcelC);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            j(kxr.a);
        }
    }
}
