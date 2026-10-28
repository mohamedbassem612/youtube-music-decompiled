package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ayb implements aya {
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public ayb(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.aya
    public final ayf a() {
        return new ayf(new aye(this));
    }

    @Override // defpackage.aya
    public final void b(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.aya
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.aya
    public final void d(Uri uri) {
        this.d = uri;
    }
}
