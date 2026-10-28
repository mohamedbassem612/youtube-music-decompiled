package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afks implements aflc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ afks(Uri uri, ContentValues contentValues, int i) {
        this.$cid = i;
        this.a = uri;
        this.b = contentValues;
    }

    @Override // defpackage.aflc
    public final Object a(ContentProviderClient contentProviderClient) {
        if (this.$cid != 0) {
            return Integer.valueOf(contentProviderClient.bulkInsert((Uri) this.b, (ContentValues[]) this.a));
        }
        return contentProviderClient.insert((Uri) this.a, (ContentValues) this.b);
    }

    public /* synthetic */ afks(Uri uri, ContentValues[] contentValuesArr, int i) {
        this.$cid = i;
        this.b = uri;
        this.a = contentValuesArr;
    }
}
