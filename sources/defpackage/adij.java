package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Size;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adij implements eyv {
    private final ContentResolver a;

    public adij(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return Objects.equals(((Uri) obj).getScheme(), "content");
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ hed b(Object obj, int i, int i2, ety etyVar) {
        Uri uri = (Uri) obj;
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        int iMax = Math.max(i, i2);
        return new hed(new ffd(uri), new adih(this.a, uri, new Size(iMax, iMax)));
    }
}
