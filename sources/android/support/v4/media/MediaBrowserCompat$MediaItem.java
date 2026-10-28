package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.ax;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ax(5);
    public final MediaDescriptionCompat a;
    private final int b;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
        if (TextUtils.isEmpty(mediaDescriptionCompat.a)) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.b = i;
        this.a = mediaDescriptionCompat;
    }

    public final String a() {
        return this.a.a;
    }

    public final boolean b() {
        return (this.b & 1) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.b + ", mDescription=" + this.a + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        this.a.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.b = parcel.readInt();
        this.a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
