package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fae implements etj {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    static final byte[] b = "MPF".getBytes(Charset.forName("UTF-8"));
    private static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static boolean g(int i) {
        return i == 1751476579 || i == 1751476600 || i == 1751479907 || i == 1751479928 || i == 1835623985 || i == 1836279345;
    }

    private static final ImageHeaderParser$ImageType h(fac facVar) {
        try {
            int iA = facVar.a();
            if (iA == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iD = (iA << 8) | facVar.d();
            if (iD == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iD2 = (iD << 8) | facVar.d();
            if (iD2 == -1991225785) {
                facVar.c(21L);
                try {
                    return facVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (fab unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iD2 == 1380533830) {
                facVar.c(4L);
                if (((facVar.a() << 16) | facVar.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iA2 = (facVar.a() << 16) | facVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iA2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    facVar.c(4L);
                    return (facVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                facVar.c(4L);
                short sD = facVar.d();
                if ((sD & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sD & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((facVar.a() << 16) | facVar.a()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iA3 = (facVar.a() << 16) | facVar.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            boolean z = iA3 == 1635150182;
            boolean zG = g(iA3);
            facVar.c(4L);
            int i2 = iD2 - 16;
            if (i2 % 4 == 0) {
                for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                    int iA4 = (facVar.a() << 16) | facVar.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iA4 == 1635150182) {
                        z = true;
                    } else if (g(iA4)) {
                        zG = true;
                    }
                    i2 -= 4;
                }
            }
            if (z) {
                return ImageHeaderParser$ImageType.AVIF;
            }
            return zG ? ImageHeaderParser$ImageType.HEIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (fab unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    private static final boolean i(byte[] bArr, int i, byte[] bArr2) {
        boolean z = bArr2 != null && i > bArr2.length;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    private static final int j(fac facVar, int i) {
        short sD;
        while (facVar.d() == 255 && (sD = facVar.d()) != 218 && sD != 217) {
            int iA = facVar.a() - 2;
            if (sD == i) {
                return iA;
            }
            long j = iA;
            if (facVar.c(j) != j) {
                return -1;
            }
        }
        return -1;
    }

    private static final int k(fac facVar, ewv ewvVar) {
        int iJ;
        short sJ;
        short sJ2;
        int i;
        int i2;
        int i3;
        try {
            int iA = facVar.a();
            if (((iA & 65496) != 65496 && iA != 19789 && iA != 18761) || (iJ = j(facVar, 225)) == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) ewvVar.a(iJ, byte[].class);
            try {
                if (facVar.b(bArr, iJ) == iJ && i(bArr, iJ, a)) {
                    ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(iJ);
                    short sJ3 = fhz.j(6, byteBuffer);
                    byteBuffer.order(sJ3 != 18761 ? sJ3 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                    int i4 = fhz.i(10, byteBuffer);
                    short sJ4 = fhz.j(i4 + 6, byteBuffer);
                    for (int i5 = 0; i5 < sJ4; i5++) {
                        int i6 = i4 + 8 + (i5 * 12);
                        if (fhz.j(i6, byteBuffer) == 274 && (sJ2 = fhz.j(i6 + 2, byteBuffer)) > 0 && sJ2 <= 12 && (i = fhz.i(i6 + 4, byteBuffer)) >= 0 && (i2 = i + c[sJ2]) <= 4 && (i3 = i6 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                            sJ = fhz.j(i3, byteBuffer);
                        }
                    }
                    sJ = -1;
                } else {
                    sJ = -1;
                }
                return sJ;
            } finally {
                ewvVar.c(bArr);
            }
        } catch (fab unused) {
            return -1;
        }
    }

    private static final boolean l(fac facVar, ewv ewvVar) {
        if (h(facVar) == ImageHeaderParser$ImageType.JPEG) {
            int iJ = j(facVar, 226);
            while (iJ > 0) {
                byte[] bArr = (byte[]) ewvVar.a(iJ, byte[].class);
                try {
                    if (facVar.b(bArr, iJ) == iJ && i(bArr, iJ, b)) {
                        ewvVar.c(bArr);
                        return true;
                    }
                    ewvVar.c(bArr);
                    iJ = j(facVar, 226);
                } catch (Throwable th) {
                    ewvVar.c(bArr);
                    throw th;
                }
            }
        }
        return false;
    }

    @Override // defpackage.etj
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return h(new fad(inputStream));
    }

    @Override // defpackage.etj
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return h(new faa(byteBuffer));
    }

    @Override // defpackage.etj
    public final int c(InputStream inputStream, ewv ewvVar) {
        fad fadVar = new fad(inputStream);
        if (ewvVar != null) {
            return k(fadVar, ewvVar);
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // defpackage.etj
    public final int d(ByteBuffer byteBuffer, ewv ewvVar) {
        return k(new faa(byteBuffer), ewvVar);
    }

    @Override // defpackage.etj
    public final boolean e(InputStream inputStream, ewv ewvVar) {
        return l(new fad(inputStream), ewvVar);
    }

    @Override // defpackage.etj
    public final boolean f(ByteBuffer byteBuffer, ewv ewvVar) {
        return l(new faa(byteBuffer), ewvVar);
    }
}
