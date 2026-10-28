package defpackage;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afmq implements qsq {
    final /* synthetic */ Uri a;
    final /* synthetic */ String[] b;
    final /* synthetic */ String c;
    final /* synthetic */ String[] d;
    final /* synthetic */ String e;
    final /* synthetic */ jij f;

    public afmq(jij jijVar, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.a = uri;
        this.b = strArr;
        this.c = str;
        this.d = strArr2;
        this.e = str2;
        this.f = jijVar;
    }

    @Override // defpackage.qsq
    public final Cursor a(final CancellationSignal cancellationSignal) {
        final String[] strArr = this.b;
        final Uri uri = this.a;
        final String str = this.c;
        final String[] strArr2 = this.d;
        final String str2 = this.e;
        return ((abhh) this.f.a).j(uri, new afkv() { // from class: afkt
            @Override // defpackage.afkv
            public final Cursor a(ContentProviderClient contentProviderClient) {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            }
        }, new rrw(strArr, uri, str, str2, 5));
    }

    @Override // defpackage.qsq
    public final String b() {
        return abhh.i(this.b, this.a, this.c, this.e);
    }
}
