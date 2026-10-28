package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class axz implements aya {
    private final ContentInfo.Builder a;

    public axz(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.aya
    public final ayf a() {
        return new ayf(new ayc(this.a.build()));
    }

    @Override // defpackage.aya
    public final void b(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.aya
    public final void c(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.aya
    public final void d(Uri uri) {
        this.a.setLinkUri(uri);
    }
}
