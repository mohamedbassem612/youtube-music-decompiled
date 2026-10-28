package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kzk extends gda implements kzm {
    public kzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.kzm
    public final void a(Bundle bundle) {
        Parcel parcelC = c();
        gdc.c(parcelC, bundle);
        e(1, parcelC);
    }
}
