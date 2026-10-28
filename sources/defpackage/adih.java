package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class adih implements euh {
    private final ContentResolver a;
    private final Uri b;
    private final Size c;
    private final CancellationSignal d = new CancellationSignal();

    public adih(ContentResolver contentResolver, Uri uri, Size size) {
        this.a = contentResolver;
        this.b = uri;
        this.c = size;
    }

    @Override // defpackage.euh
    public final Class a() {
        return adif.class;
    }

    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) {
        try {
            ContentResolver contentResolver = this.a;
            Uri uri = this.b;
            Bitmap bitmapLoadThumbnail = contentResolver.loadThumbnail(uri, this.c, this.d);
            if (bitmapLoadThumbnail != null) {
                eugVar.b(new adif(bitmapLoadThumbnail));
            } else {
                eugVar.e(new FileNotFoundException(a.cp(uri, "ContentResolver.loadThumbnail returned null for ")));
            }
        } catch (Exception e) {
            eugVar.e(e);
        }
    }

    @Override // defpackage.euh
    public final int g() {
        return 1;
    }

    @Override // defpackage.euh
    public final void gI() {
        this.d.cancel();
    }

    @Override // defpackage.euh
    public final void d() {
    }
}
