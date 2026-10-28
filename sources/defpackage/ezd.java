package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ezd implements eyv {
    private final /* synthetic */ int $cid;
    private final Object a;

    public ezd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.eyv
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
        } else if (i == 1) {
        } else if (i != 2) {
            ((qto) obj).a();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [eyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [exv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [eyv, java.lang.Object] */
    @Override // defpackage.eyv
    public final /* synthetic */ hed b(Object obj, int i, int i2, ety etyVar) {
        Uri uriC;
        int i3 = this.$cid;
        if (i3 != 0) {
            if (i3 == 1) {
                byte[] bArr = (byte[]) obj;
                return new hed(new ffd(bArr), new exw(bArr, this.a));
            }
            if (i3 != 2) {
                return ((oae) this.a).b(((qto) obj).a(), i, i2, etyVar);
            }
            return this.a.b(new eyl((URL) obj), i, i2, etyVar);
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uriC = null;
        } else if (str.charAt(0) == '/') {
            uriC = c(str);
        } else {
            Uri uri = Uri.parse(str);
            uriC = uri.getScheme() == null ? c(str) : uri;
        }
        if (uriC != null) {
            ?? r3 = this.a;
            if (r3.a(uriC)) {
                return r3.b(uriC, i, i2, etyVar);
            }
        }
        return null;
    }
}
