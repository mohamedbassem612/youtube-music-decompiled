package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.DownloadListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehb implements DownloadListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Context a;

    public aehb(Context context, int i) {
        this.$cid = i;
        this.a = context;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        if (this.$cid != 0) {
            aeho.g(Uri.parse(str), this.a);
        } else {
            aeho.g(Uri.parse(str), this.a);
        }
    }
}
