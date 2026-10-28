package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.ErrorReport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kvl implements kpe {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kvl(Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.kpe
    public final void a(Object obj, Object obj2) {
        if (this.$cid != 0) {
            kvw kvwVar = (kvw) obj;
            long j = this.a;
            ?? r10 = this.b;
            try {
                ixt.ad((Bundle) r10);
                kvy kvyVar = (kvy) kvwVar.C();
                Parcel parcelC = kvyVar.c();
                gdc.c(parcelC, r10);
                parcelC.writeLong(j);
                kvyVar.e(4, parcelC);
                ((kjc) obj2).x(null);
                return;
            } catch (Exception e) {
                Log.e("gF_FeedbackClient", "Requesting to save the async feedback psd failed!", e);
                ((kjc) obj2).w(new RemoteException("Internall Error: Failed to start feedback"));
                return;
            }
        }
        kvw kvwVar2 = (kvw) obj;
        Object obj3 = this.b;
        try {
            ixt ixtVar = ((kvn) obj3).u;
            long j2 = this.a;
            if (ixtVar != null) {
                Context context = kvwVar2.p;
                ixt.af(new kvx(context, ixtVar, j2, 1));
                ixt.af(new kvx(context, ixtVar, j2, 0));
            }
            ixt.ae((kvn) obj3);
            ErrorReport errorReport = new ErrorReport((kvn) obj3, kvwVar2.a.getCacheDir());
            kvy kvyVar2 = (kvy) kvwVar2.C();
            Parcel parcelC2 = kvyVar2.c();
            gdc.c(parcelC2, errorReport);
            parcelC2.writeLong(j2);
            kvyVar2.f(6, parcelC2);
            ((kjc) obj2).x(null);
        } catch (RemoteException e2) {
            Log.e("gF_FeedbackClient", "Failed to start feedback", e2);
            ((kjc) obj2).w(new RemoteException("Internall Error: Failed to start feedback"));
        }
    }
}
