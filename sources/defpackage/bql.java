package defpackage;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.os.ResultReceiver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bql extends bra {
    final /* synthetic */ ResultReceiver a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bql(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.a = resultReceiver;
    }

    @Override // defpackage.bra
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) obj;
        if ((this.h & 2) != 0) {
            this.a.b(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaBrowserCompat$MediaItem);
        this.a.b(0, bundle);
    }
}
