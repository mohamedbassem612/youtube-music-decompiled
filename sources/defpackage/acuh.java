package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acuh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(18);
    private alqc a;

    public acuh(Parcel parcel) {
        try {
            if (parcel.readInt() != 0) {
                this.a = (alqc) ahng.ay(parcel, alqc.a, ExtensionRegistryLite.getGeneratedRegistry());
            } else {
                this.a = null;
            }
        } catch (aiik e) {
            ((agrc) ((agrc) ((agrc) acui.a.b()).j(e)).k("com/google/android/libraries/youtube/reel/internal/player/ReelSequenceNavigator$ReelSequenceNavigatorState", "<init>", (char) 223, "ReelSequenceNavigator.java")).t("Invalid ReelItemWatchResponse");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a != null ? 1 : 0);
        alqc alqcVar = this.a;
        if (alqcVar != null) {
            ahng.aE(parcel, alqcVar);
        }
    }

    public acuh(alqc alqcVar) {
        this.a = alqcVar;
    }
}
