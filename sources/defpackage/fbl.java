package defpackage;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fbl implements eua {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;

    public fbl(List list, ewv ewvVar, boolean z, int i) {
        this.$cid = i;
        this.b = z ? new kyr(list, ewvVar, (short[]) null) : null;
        this.a = new ezv(z);
    }

    @Override // defpackage.eua
    public final /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) {
        if (this.$cid == 0) {
            return ((ezv) this.b).c(ImageDecoder.createSource(((Context) this.a).getContentResolver(), (Uri) obj), i, i2, etyVar);
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        Object obj2 = this.b;
        if (obj2 != null) {
            etyVar = ((kyr) obj2).H(byteBuffer, etyVar);
        }
        return ((ezv) this.a).c(ImageDecoder.createSource(byteBuffer), i, i2, etyVar);
    }

    @Override // defpackage.eua
    public final /* synthetic */ boolean b(Object obj, ety etyVar) {
        String lastPathSegment;
        int iLastIndexOf;
        if (this.$cid != 0) {
            return true;
        }
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT >= 35) {
            String scheme = uri.getScheme();
            if ("content".equals(scheme) || "file".equals(scheme) || "android.resource".equals(scheme)) {
                String type = ((Context) this.a).getContentResolver().getType(uri);
                if (type == null && "file".equals(uri.getScheme()) && (lastPathSegment = uri.getLastPathSegment()) != null && (iLastIndexOf = lastPathSegment.lastIndexOf(46)) != -1) {
                    type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lastPathSegment.substring(iLastIndexOf + 1).toLowerCase(Locale.ROOT));
                }
                if (type == null) {
                    return "android.resource".equals(scheme);
                }
                if (type.startsWith("image/") && !type.equals("image/gif")) {
                    return true;
                }
            }
        }
        return false;
    }

    public fbl(Context context, int i) {
        this.$cid = i;
        this.b = new ezv(false);
        this.a = context.getApplicationContext();
    }
}
