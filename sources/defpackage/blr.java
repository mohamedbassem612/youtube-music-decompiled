package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class blr extends ContentObserver {
    final /* synthetic */ bls a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blr(bls blsVar, Handler handler) {
        super(handler);
        this.a = blsVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.a();
    }
}
