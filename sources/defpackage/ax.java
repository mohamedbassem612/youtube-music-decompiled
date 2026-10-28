package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ax implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public ax(int i) {
        this.$cid = i;
    }

    public static void a(uz uzVar, Parcel parcel) {
        Bundle bundle = new Bundle();
        bundle.putString("namespace", uzVar.a);
        bundle.putString("id", uzVar.b);
        bundle.putString("schemaType", uzVar.c);
        bundle.putStringArrayList("parentTypes", (ArrayList) uzVar.h);
        bundle.putInt("score", uzVar.f);
        bundle.putLong("creationTimestampMillis", uzVar.d);
        bundle.putLong("ttlMillis", uzVar.e);
        Bundle bundle2 = new Bundle();
        int i = 0;
        while (true) {
            List list = uzVar.g;
            if (i >= list.size()) {
                bundle.putBundle("properties", bundle2);
                parcel.writeBundle(bundle);
                return;
            } else {
                vi viVar = (vi) list.get(i);
                bundle2.putParcelable(viVar.a, viVar);
                i++;
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.$cid) {
            case 0:
                return new ay(parcel);
            case 1:
                return new aw(parcel);
            case 2:
                return new cv(parcel);
            case 3:
                return new de(parcel);
            case 4:
                return new dj(parcel);
            case 5:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 6:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 7:
                return new MediaMetadataCompat(parcel);
            case 8:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 9:
                return new MediaSessionCompat$QueueItem(parcel);
            case 10:
                return new MediaSessionCompat$ResultReceiverWrapper(parcel);
            case 11:
                return new ParcelableVolumeInfo(parcel);
            case 12:
                return new PlaybackStateCompat.CustomAction(parcel);
            case 13:
                return new ResultReceiver(parcel);
            case 14:
                return new kx(parcel);
            case 15:
                return new mt(parcel);
            case 16:
                return new ot(parcel);
            case 17:
                return new ou(parcel);
            case 18:
                parcel.getClass();
                return new ra(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 19:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new ri((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            default:
                Bundle bundle = parcel.readBundle(getClass().getClassLoader());
                String string = bundle.getString("namespace");
                String string2 = bundle.getString("id");
                String string3 = bundle.getString("schemaType");
                if (string == null || string2 == null || string3 == null) {
                    throw new IllegalArgumentException("GenericDocumentParcel bundle doesn't have namespace, id, or schemaType.");
                }
                uy uyVar = new uy(string, string2, string3);
                ArrayList<String> stringArrayList = bundle.getStringArrayList("parentTypes");
                if (stringArrayList != null) {
                    uyVar.c = new ArrayList(stringArrayList);
                }
                uyVar.b = bundle.getInt("score");
                uyVar.a = bundle.getLong("creationTimestampMillis");
                uyVar.c(bundle.getLong("ttlMillis"));
                Bundle bundle2 = bundle.getBundle("properties");
                if (bundle2 != null) {
                    for (String str : bundle2.keySet()) {
                        uyVar.b(str, (vi) bundle2.getParcelable(str));
                    }
                }
                return uyVar.a();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new ay[i];
            case 1:
                return new aw[i];
            case 2:
                return new cv[i];
            case 3:
                return new de[i];
            case 4:
                return new dj[i];
            case 5:
                return new MediaBrowserCompat$MediaItem[i];
            case 6:
                return new MediaDescriptionCompat[i];
            case 7:
                return new MediaMetadataCompat[i];
            case 8:
                return new RatingCompat[i];
            case 9:
                return new MediaSessionCompat$QueueItem[i];
            case 10:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 11:
                return new ParcelableVolumeInfo[i];
            case 12:
                return new PlaybackStateCompat.CustomAction[i];
            case 13:
                return new ResultReceiver[i];
            case 14:
                return new kx[i];
            case 15:
                return new mt[i];
            case 16:
                return new ot[i];
            case 17:
                return new ou[i];
            case 18:
                return new ra[i];
            case 19:
                return new ri[i];
            default:
                return new uz[i];
        }
    }
}
