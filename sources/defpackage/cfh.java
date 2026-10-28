package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cfh extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    final /* synthetic */ cfj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfh(cfj cfjVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = cfjVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.c.d();
    }
}
