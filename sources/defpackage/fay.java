package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fay implements fbb {
    private final ByteBuffer a;
    private final List b;
    private final boolean c;
    private final ewv d;

    public fay(ByteBuffer byteBuffer, List list, ewv ewvVar, boolean z) {
        this.a = byteBuffer;
        this.b = list;
        this.d = ewvVar;
        this.c = z;
    }

    @Override // defpackage.fbb
    public final int a() {
        return ept.f(this.b, fff.b(this.a), this.d);
    }

    @Override // defpackage.fbb
    public final Bitmap b(BitmapFactory.Options options) {
        boolean z = this.c;
        ByteBuffer byteBuffer = this.a;
        if (!z) {
            return ept.k(new ffe(fff.b(byteBuffer)), options, this);
        }
        fff.b(byteBuffer);
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly()) {
            return ept.j(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), options, this);
        }
        byte[] bArrD = fff.d(byteBuffer);
        return ept.j(bArrD, 0, bArrD.length, options, this);
    }

    @Override // defpackage.fbb
    public final ImageHeaderParser$ImageType c() {
        return ept.b(this.b, fff.b(this.a));
    }

    @Override // defpackage.fbb
    public final boolean e() {
        ByteBuffer byteBufferB = fff.b(this.a);
        if (byteBufferB == null) {
            return false;
        }
        return ept.d(this.b, new etp(byteBufferB, this.d, 1));
    }

    @Override // defpackage.fbb
    public final void d() {
    }
}
