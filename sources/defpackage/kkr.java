package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kkr extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(14);
    public final Intent a;

    public kkr(Intent intent) {
        this.a = intent;
    }

    public final Integer a() {
        Intent intent = this.a;
        if (intent.hasExtra("google.product_id")) {
            return Integer.valueOf(intent.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public final String b() {
        Intent intent = this.a;
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, this.a, i);
        ksy.h(parcel, iG);
    }
}
