package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fat implements etj {
    @Override // defpackage.etj
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.etj
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.etj
    public final int c(InputStream inputStream, ewv ewvVar) {
        int iJ = new bmu(inputStream).j();
        if (iJ == 0) {
            return -1;
        }
        return iJ;
    }

    @Override // defpackage.etj
    public final int d(ByteBuffer byteBuffer, ewv ewvVar) {
        int i = fff.a;
        return c(new ffe(byteBuffer), ewvVar);
    }

    @Override // defpackage.etj
    public final boolean e(InputStream inputStream, ewv ewvVar) {
        return false;
    }

    @Override // defpackage.etj
    public final boolean f(ByteBuffer byteBuffer, ewv ewvVar) {
        return false;
    }
}
