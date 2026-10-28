package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afmo implements afmr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ afmo(Uri uri, ContentValues contentValues, int i) {
        this.$cid = i;
        this.b = uri;
        this.a = contentValues;
    }

    @Override // defpackage.afmr
    public final Object a(abhh abhhVar) {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.b;
            Uri uri = (Uri) this.a;
            Integer num = (Integer) abhhVar.g(uri, new afks(uri, (ContentValues[]) obj, 1));
            num.intValue();
            return num;
        }
        if (i == 1) {
            Object obj2 = this.a;
            Uri uri2 = (Uri) this.b;
            return (Uri) abhhVar.g(uri2, new afks(uri2, (ContentValues) obj2, 0));
        }
        Object obj3 = this.b;
        final Uri uri3 = (Uri) this.a;
        final String[] strArr = (String[]) obj3;
        Integer num2 = (Integer) abhhVar.g(uri3, new aflc() { // from class: afku
            public final /* synthetic */ String b = "_id=?";

            @Override // defpackage.aflc
            public final Object a(ContentProviderClient contentProviderClient) {
                return Integer.valueOf(contentProviderClient.delete(uri3, this.b, strArr));
            }
        });
        num2.intValue();
        return num2;
    }

    public /* synthetic */ afmo(Uri uri, Object[] objArr, int i) {
        this.$cid = i;
        this.a = uri;
        this.b = objArr;
    }
}
