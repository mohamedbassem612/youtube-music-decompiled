package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class faz implements fbb {
    private final eus a;
    private final List b;
    private final ewv c;

    public faz(InputStream inputStream, List list, ewv ewvVar) {
        this.c = ewvVar;
        this.b = list;
        this.a = new eus(inputStream, ewvVar);
    }

    @Override // defpackage.fbb
    public final int a() {
        return ept.e(this.b, this.a.a(), this.c);
    }

    @Override // defpackage.fbb
    public final Bitmap b(BitmapFactory.Options options) {
        return ept.k(this.a.a(), options, this);
    }

    @Override // defpackage.fbb
    public final ImageHeaderParser$ImageType c() {
        return ept.g(this.b, this.a.a(), this.c);
    }

    @Override // defpackage.fbb
    public final void d() {
        this.a.a.a();
    }

    @Override // defpackage.fbb
    public final boolean e() {
        InputStream inputStreamA = this.a.a();
        inputStreamA.mark(5242880);
        return ept.d(this.b, new etp(inputStreamA, this.c, 0));
    }
}
