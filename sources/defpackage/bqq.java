package defpackage;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bqq extends bra {
    final /* synthetic */ zf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqq(Object obj, zf zfVar) {
        super(obj);
        this.a = zfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bra
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ArrayList arrayList;
        if (obj == 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(obj.size());
            Iterator it = obj.iterator();
            while (it.hasNext()) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) it.next();
                Parcel parcelObtain = Parcel.obtain();
                mediaBrowserCompat$MediaItem.writeToParcel(parcelObtain, 0);
                arrayList2.add(parcelObtain);
            }
            arrayList = arrayList2;
        }
        this.a.o(arrayList);
    }

    @Override // defpackage.bra
    public final void b() {
        this.a.n();
    }
}
