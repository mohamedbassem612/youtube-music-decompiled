package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aapm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(0);
    public final String a;

    public aapm(Parcel parcel) {
        this.a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aapm) {
            return TextUtils.equals(this.a, ((aapm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 527;
    }

    public final String toString() {
        return "OfflinePlaybackTrackingReporterState{videoId=" + this.a + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public aapm(String str) {
        this.a = str;
    }
}
