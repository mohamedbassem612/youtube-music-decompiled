package defpackage;

import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class cae extends UrlRequest.StatusListener {
    final /* synthetic */ int[] a;
    final /* synthetic */ zhk b;

    public cae(int[] iArr, zhk zhkVar) {
        this.a = iArr;
        this.b = zhkVar;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.a[0] = i;
        this.b.h();
    }
}
