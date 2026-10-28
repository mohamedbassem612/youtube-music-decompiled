package defpackage;

import internal.org.jni_zero.CommonApis;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class fgg extends auma {
    public long a;
    private Date i;
    private Date j;
    private long k;
    private double l;
    private float m;
    private aumj n;
    private long o;

    public fgg() {
        super("mvhd");
        this.l = 1.0d;
        this.m = 1.0f;
        this.n = aumj.a;
    }

    @Override // defpackage.auly
    protected final long e() {
        return (h() == 1 ? 32L : 20L) + 80;
    }

    @Override // defpackage.auly
    public final void f(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (h() == 1) {
            this.i = CommonApis.o(fhz.f(byteBuffer));
            this.j = CommonApis.o(fhz.f(byteBuffer));
            this.a = fhz.e(byteBuffer);
            this.k = fhz.f(byteBuffer);
        } else {
            this.i = CommonApis.o(fhz.e(byteBuffer));
            this.j = CommonApis.o(fhz.e(byteBuffer));
            this.a = fhz.e(byteBuffer);
            this.k = fhz.e(byteBuffer);
        }
        this.l = fhz.d(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.m = ((short) (((short) ((bArr[0] << 8) & 65280)) | (bArr[1] & 255))) / 256.0f;
        fhz.g(byteBuffer);
        fhz.e(byteBuffer);
        fhz.e(byteBuffer);
        this.n = new aumj(fhz.d(byteBuffer), fhz.d(byteBuffer), fhz.d(byteBuffer), fhz.d(byteBuffer), fhz.c(byteBuffer), fhz.c(byteBuffer), fhz.c(byteBuffer), fhz.d(byteBuffer), fhz.d(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.o = fhz.e(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.i + ";modificationTime=" + this.j + ";timescale=" + this.a + ";duration=" + this.k + ";rate=" + this.l + ";volume=" + this.m + ";matrix=" + this.n + ";nextTrackId=" + this.o + ']';
    }
}
