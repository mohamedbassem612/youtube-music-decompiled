package defpackage;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afmp implements qsq {
    final /* synthetic */ Uri a;
    final /* synthetic */ String[] b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ jij d;

    public afmp(jij jijVar, Uri uri, String[] strArr, Bundle bundle) {
        this.a = uri;
        this.b = strArr;
        this.c = bundle;
        this.d = jijVar;
    }

    @Override // defpackage.qsq
    public final Cursor a(final CancellationSignal cancellationSignal) {
        final String[] strArr = this.b;
        final Uri uri = this.a;
        final Bundle bundle = this.c;
        return ((abhh) this.d.a).j(uri, new afkv() { // from class: afkr
            @Override // defpackage.afkv
            public final Cursor a(ContentProviderClient contentProviderClient) {
                return contentProviderClient.query(uri, strArr, bundle, cancellationSignal);
            }
        }, new ovf((Object) strArr, (Object) uri, (Object) bundle, 14, (byte[]) null));
    }

    @Override // defpackage.qsq
    public final String b() {
        return abhh.h(this.b, this.a, this.c);
    }
}
