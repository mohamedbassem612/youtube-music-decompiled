package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kba extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(1);
    public final String a;
    public final String b;

    public kba(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static kba a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new kba(khe.c(jSONObject, "adTagUrl"), khe.c(jSONObject, "adsResponse"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kba) {
            kba kbaVar = (kba) obj;
            if (khe.g(this.a, kbaVar.a) && khe.g(this.b, kbaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, str);
        ksy.B(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }
}
