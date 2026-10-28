package defpackage;

import android.content.Context;
import android.service.media.MediaBrowserService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class bqu extends bqr {
    final /* synthetic */ bqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqu(bqv bqvVar, Context context) {
        super(bqvVar, context);
        this.b = bqvVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        bqt bqtVar = new bqt(str, new zf(result));
        bre breVar = this.b.e;
        breVar.d = breVar.a;
        breVar.d(str, bqtVar);
        breVar.d = null;
    }
}
