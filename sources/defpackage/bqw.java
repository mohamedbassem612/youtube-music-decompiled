package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bqw extends bra {
    final /* synthetic */ Bundle a;
    final /* synthetic */ zf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqw(Object obj, zf zfVar, Bundle bundle) {
        super(obj);
        this.b = zfVar;
        this.a = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.bra
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ?? F;
        if (obj == 0) {
            this.b.o(null);
            return;
        }
        if ((this.h & 1) != 0) {
            F = obj;
            F = bre.f(obj, this.a);
        }
        F = obj;
        ArrayList arrayList = new ArrayList(F.size());
        for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : F) {
            Parcel parcelObtain = Parcel.obtain();
            mediaBrowserCompat$MediaItem.writeToParcel(parcelObtain, 0);
            arrayList.add(parcelObtain);
        }
        this.b.o(arrayList);
    }

    @Override // defpackage.bra
    public final void b() {
        this.b.n();
    }
}
