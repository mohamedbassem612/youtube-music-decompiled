package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kap extends kry {
    public static final Parcelable.Creator CREATOR = new fh(6);
    public boolean a;
    public String b;
    public boolean c;
    public kac d;

    public kap() {
        Locale locale = Locale.getDefault();
        Pattern pattern = khe.a;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        this(false, sb.toString(), false, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kap) {
            kap kapVar = (kap) obj;
            if (this.a == kapVar.a && khe.g(this.b, kapVar.b) && this.c == kapVar.c && khe.g(this.d, kapVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d);
    }

    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        boolean z = this.a;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        String str = this.b;
        if (str != null) {
            int iG2 = ksy.g(parcel, 3);
            parcel.writeString(str);
            ksy.h(parcel, iG2);
        }
        boolean z2 = this.c;
        parcel.writeInt(262148);
        parcel.writeInt(z2 ? 1 : 0);
        ksy.A(parcel, 5, this.d, i);
        ksy.h(parcel, iG);
    }

    public kap(boolean z, String str, boolean z2, kac kacVar) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = kacVar;
    }
}
