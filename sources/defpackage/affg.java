package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class affg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new afhl(1);
    public final affd a;
    public final afhq b;
    public final afhm c;
    public final Intent d;
    public final afff e;

    public affg(Parcel parcel) {
        this.a = (affd) parcel.readParcelable(affd.class.getClassLoader());
        try {
            this.b = (afhq) ahng.ay(parcel, afhq.a, ExtensionRegistryLite.getGeneratedRegistry());
            this.c = (afhm) parcel.readParcelable(afhm.class.getClassLoader());
            this.d = (Intent) parcel.readParcelable(afhm.class.getClassLoader());
            this.e = (afff) parcel.readParcelable(afhm.class.getClassLoader());
        } catch (aiik e) {
            throw new IllegalStateException("Failed to convert AccountInfo to Parcelable!", e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        ahng.aE(parcel, this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
    }

    public affg(affd affdVar, afhq afhqVar, afhm afhmVar, Intent intent, afff afffVar) {
        this.a = affdVar;
        afhqVar.getClass();
        this.b = afhqVar;
        this.c = afhmVar;
        this.d = intent;
        this.e = afffVar;
    }
}
