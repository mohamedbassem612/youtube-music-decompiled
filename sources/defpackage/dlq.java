package defpackage;

import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dlq extends dlr {
    public final dls a;

    public dlq(dls dlsVar) {
        this.a = dlsVar;
    }

    @Override // defpackage.dlr
    public ListenableFuture a() {
        return we.m(awro.r(awrc.K(awvi.a), awov.a, 1, new dnz(this, (awoq) null, 1)));
    }

    @Override // defpackage.dlr
    public ListenableFuture b(Uri uri, InputEvent inputEvent) {
        uri.getClass();
        return we.m(awro.r(awrc.K(awvi.a), awov.a, 1, new gmc(this, uri, (awoq) null, 1)));
    }
}
