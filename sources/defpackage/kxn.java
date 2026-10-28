package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kxn extends kxq {
    final /* synthetic */ kvn a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ long c;
    final /* synthetic */ GoogleHelp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxn(knc kncVar, kvn kvnVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(kncVar);
        this.a = kvnVar;
        this.b = bundle;
        this.c = j;
        this.d = googleHelp;
    }

    @Override // defpackage.kxp
    protected final void n(kxv kxvVar) {
        try {
            kvn kvnVar = this.a;
            Bundle bundle = this.b;
            long j = this.c;
            GoogleHelp googleHelp = this.d;
            kxm kxmVar = new kxm(this);
            Parcel parcelC = kxvVar.c();
            gdc.c(parcelC, kvnVar);
            gdc.c(parcelC, bundle);
            parcelC.writeLong(j);
            gdc.c(parcelC, googleHelp);
            gdc.e(parcelC, kxmVar);
            kxvVar.f(10, parcelC);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            j(kxr.a);
        }
    }
}
