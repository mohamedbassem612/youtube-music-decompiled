package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bqx extends bqu {
    final /* synthetic */ bqy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqx(bqy bqyVar, Context context) {
        super(bqyVar, context);
        this.c = bqyVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        fg.d(bundle);
        bre breVar = this.c.f;
        breVar.d = breVar.a;
        breVar.c(str, new bqw(str, new zf(result), bundle), bundle);
        breVar.d = null;
    }
}
