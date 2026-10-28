package defpackage;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aumv extends AsyncTask {
    private final auna a;
    private final String b;
    private final Messenger c;
    private final axoz d;

    public aumv(auna aunaVar, String str, axoz axozVar, Messenger messenger) {
        this.a = aunaVar;
        this.b = str;
        this.d = axozVar;
        this.c = messenger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            aumo aumoVar = ((aumo[]) objArr)[0];
            String str = this.b;
            axoz axozVar = this.d;
            Bundle bundle = new Bundle();
            ?? r3 = axozVar.a;
            if (r3 != 0) {
                bundle.putParcelable("openMeIntent", r3);
            }
            Object obj = axozVar.b;
            if (obj != null) {
                bundle.putInt("themeColor", ((Integer) obj).intValue());
            }
            Messenger messenger = this.c;
            Parcel parcelC = aumoVar.c();
            parcelC.writeString(str);
            gdc.c(parcelC, bundle);
            gdc.c(parcelC, messenger);
            Parcel parcelD = aumoVar.d(1, parcelC);
            Messenger messenger2 = (Messenger) gdc.a(parcelD, Messenger.CREATOR);
            parcelD.recycle();
            return messenger2;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Messenger messenger = (Messenger) obj;
        auna aunaVar = this.a;
        if (messenger == null) {
            aunaVar.c();
            return;
        }
        aunaVar.e = messenger;
        aunaVar.g = true;
        aunaVar.h = false;
        aunaVar.a();
        aumy aumyVar = new aumy(auna.c);
        while (aumyVar.hasNext()) {
            aumyVar.next().a();
        }
        aunb aunbVar = aunaVar.i;
        if (aunbVar != null) {
            aunbVar.a();
        }
    }
}
