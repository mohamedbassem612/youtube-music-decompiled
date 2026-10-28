package com.google.android.gms.wallet.firstparty.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kry;
import defpackage.ksy;
import defpackage.lry;
import defpackage.lsf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SecurePaymentsPayload extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lry(5);
    public final byte[] a;
    final lsf[] b;

    public SecurePaymentsPayload(byte[] bArr, lsf[] lsfVarArr) {
        this.a = bArr;
        this.b = lsfVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.q(parcel, 2, this.a);
        ksy.E(parcel, 3, this.b, i);
        ksy.h(parcel, iG);
    }
}
