package defpackage;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bqt extends bra {
    final /* synthetic */ zf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqt(Object obj, zf zfVar) {
        super(obj);
        this.a = zfVar;
    }

    @Override // defpackage.bra
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) obj;
        if (mediaBrowserCompat$MediaItem == null) {
            this.a.o(null);
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        mediaBrowserCompat$MediaItem.writeToParcel(parcelObtain, 0);
        this.a.o(parcelObtain);
    }

    @Override // defpackage.bra
    public final void b() {
        this.a.n();
    }
}
