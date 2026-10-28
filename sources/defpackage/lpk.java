package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lpk extends kry {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    static {
        new lpk(null, false, false);
        CREATOR = new lof(6);
    }

    public lpk(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lpk) {
            lpk lpkVar = (lpk) obj;
            if (Objects.equals(this.c, lpkVar.c) && Objects.equals(Boolean.valueOf(this.a), Boolean.valueOf(lpkVar.a))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.c, Boolean.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.F(parcel, 1, new ArrayList(this.c));
        ksy.i(parcel, 2, this.a);
        ksy.i(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }
}
