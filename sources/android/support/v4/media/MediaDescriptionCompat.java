package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ax;
import defpackage.fg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ax(6);
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final Bitmap d;
    public final Uri e;
    public final Bundle f;
    private final CharSequence g;
    private final Uri h;
    private MediaDescription i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.g = charSequence3;
        this.d = bitmap;
        this.e = uri;
        this.f = bundle;
        this.h = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String mediaId = mediaDescription.getMediaId();
        CharSequence title = mediaDescription.getTitle();
        CharSequence subtitle = mediaDescription.getSubtitle();
        CharSequence description = mediaDescription.getDescription();
        Bitmap iconBitmap = mediaDescription.getIconBitmap();
        Uri iconUri = mediaDescription.getIconUri();
        Bundle bundleB = fg.b(mediaDescription.getExtras());
        if (bundleB != null) {
            bundleB = new Bundle(bundleB);
        }
        Uri mediaUri = bundleB != null ? (Uri) bundleB.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (mediaUri == null) {
            bundle = bundleB;
        } else if (bundleB.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleB.size() == 2) {
            bundle = null;
        } else {
            bundleB.remove("android.support.v4.media.description.MEDIA_URI");
            bundleB.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleB;
        }
        if (mediaUri == null) {
            mediaUri = mediaDescription.getMediaUri();
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
        mediaDescriptionCompat.i = mediaDescription;
        return mediaDescriptionCompat;
    }

    public final Object b() {
        MediaDescription mediaDescription = this.i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.a);
        builder.setTitle(this.b);
        builder.setSubtitle(this.c);
        builder.setDescription(this.g);
        builder.setIconBitmap(this.d);
        builder.setIconUri(this.e);
        builder.setExtras(this.f);
        builder.setMediaUri(this.h);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.i = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) b()).writeToParcel(parcel, i);
    }
}
