package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klo extends kry {
    public final int b;
    public final int c;
    public final String d;
    public final Integer e;
    public final Bundle f;
    private final PendingIntent g;
    public static final klo a = new klo(1, 0, null, null, null, null);
    public static final Parcelable.Creator CREATOR = new fh(11);

    public klo(int i, int i2, PendingIntent pendingIntent, String str, Integer num, Bundle bundle) {
        this.b = i;
        this.c = i2;
        this.g = pendingIntent;
        this.d = str;
        this.e = num;
        this.f = bundle;
    }

    public static String b(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    case 26:
                        return "FEATURE_MISSING_OR_NEEDS_UPDATE";
                    default:
                        return a.ci((byte) 41, i, "UNKNOWN_ERROR_CODE(");
                }
        }
    }

    public final PendingIntent a() {
        Bundle bundle = this.f;
        PendingIntent pendingIntent = bundle != null ? (PendingIntent) aie.i(bundle, "pendingIntent", PendingIntent.class) : null;
        return pendingIntent == null ? this.g : pendingIntent;
    }

    public final boolean c() {
        return (this.c == 0 || a() == null) ? false : true;
    }

    public final boolean d() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof klo) {
            klo kloVar = (klo) obj;
            if (this.c == kloVar.c && Objects.equals(this.g, kloVar.g) && Objects.equals(this.d, kloVar.d) && Objects.equals(this.e, kloVar.e) && kro.n(this.f, kloVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), this.g, this.d, this.e, Boolean.valueOf(this.f != null));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("statusCode", b(this.c), arrayList);
        kro.p("resolution", this.g, arrayList);
        kro.p("message", this.d, arrayList);
        kro.p("clientMethodKey", this.e, arrayList);
        kro.p("errorResolutionInfo", this.f, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.b);
        ksy.l(parcel, 2, this.c);
        ksy.A(parcel, 3, a(), i);
        ksy.B(parcel, 4, this.d);
        ksy.w(parcel, 5, this.e);
        ksy.p(parcel, 6, this.f);
        ksy.h(parcel, iG);
    }
}
