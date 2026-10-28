package defpackage;

import android.os.Build;
import android.util.Pair;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kto implements ktn {
    protected static final byte[] a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    protected static final byte[] b = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};
    private final byte[] c = b;
    private final byte[] d = a;

    @Override // defpackage.ktn
    public final boolean a(File file) {
        Pair pairBL;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file.getAbsolutePath(), "r");
                try {
                    boolean z = false;
                    if (randomAccessFile.length() < 22) {
                        pairBL = null;
                    } else {
                        pairBL = a.bL(randomAccessFile, 0);
                        if (pairBL == null) {
                            pairBL = a.bL(randomAccessFile, 65535);
                        }
                    }
                    if (pairBL == null) {
                        throw new epq("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) pairBL.first;
                    long jLongValue = ((Long) pairBL.second).longValue();
                    long j = (-20) + jLongValue;
                    if (j >= 0) {
                        randomAccessFile.seek(j);
                        if (randomAccessFile.readInt() == 1347094023) {
                            throw new epq("ZIP64 APK not supported");
                        }
                    }
                    hmy.d(byteBuffer);
                    long jBK = a.bK(byteBuffer, byteBuffer.position() + 16);
                    if (jBK >= jLongValue) {
                        throw new epq(a.cr(jLongValue, jBK, "ZIP Central Directory offset out of range: ", ". ZIP End of Central Directory offset: "));
                    }
                    hmy.d(byteBuffer);
                    if (a.bK(byteBuffer, byteBuffer.position() + 12) + jBK != jLongValue) {
                        throw new epq("ZIP Central Directory is not immediately followed by End of Central Directory");
                    }
                    if (jBK < 32) {
                        throw new epq(a.bS(jBK, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
                    }
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                    byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(jBK - ((long) byteBufferAllocate.capacity()));
                    randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                    if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                        throw new epq("No APK Signing Block before ZIP Central Directory");
                    }
                    long j2 = byteBufferAllocate.getLong(0);
                    if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
                        throw new epq(a.bS(j2, "APK Signing Block size out of range: "));
                    }
                    int i = (int) (8 + j2);
                    long j3 = jBK - ((long) i);
                    if (j3 < 0) {
                        throw new epq(a.bS(j3, "APK Signing Block offset out of range: "));
                    }
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
                    byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                    long j4 = byteBufferAllocate2.getLong(0);
                    if (j4 != j2) {
                        throw new epq(a.cr(j2, j4, "APK Signing Block sizes in header and footer do not match: ", " vs "));
                    }
                    Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j3));
                    ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                    long jLongValue2 = ((Long) pairCreate.second).longValue();
                    hmy.d(byteBuffer2);
                    int iCapacity = byteBuffer2.capacity() - 24;
                    if (iCapacity < 8) {
                        throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
                    }
                    int iCapacity2 = byteBuffer2.capacity();
                    if (iCapacity > byteBuffer2.capacity()) {
                        throw new IllegalArgumentException(a.bQ(iCapacity2, iCapacity, "end > capacity: ", " > "));
                    }
                    int iLimit = byteBuffer2.limit();
                    int iPosition = byteBuffer2.position();
                    try {
                        byteBuffer2.position(0);
                        byteBuffer2.limit(iCapacity);
                        byteBuffer2.position(8);
                        ByteBuffer byteBufferSlice = byteBuffer2.slice();
                        byteBufferSlice.order(byteBuffer2.order());
                        byteBuffer2.position(0);
                        byteBuffer2.limit(iLimit);
                        byteBuffer2.position(iPosition);
                        int i2 = 0;
                        while (byteBufferSlice.hasRemaining()) {
                            i2++;
                            if (byteBufferSlice.remaining() < 8) {
                                throw new epq(a.bR(i2, "Insufficient data to read size of APK Signing Block entry #"));
                            }
                            ByteBuffer byteBuffer3 = byteBuffer;
                            long j5 = byteBufferSlice.getLong();
                            boolean z2 = z;
                            if (j5 < 4 || j5 > 2147483647L) {
                                throw new epq("APK Signing Block entry #" + i2 + " size out of range: " + j5);
                            }
                            int i3 = (int) j5;
                            int iPosition2 = byteBufferSlice.position() + i3;
                            if (i3 > byteBufferSlice.remaining()) {
                                throw new epq("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                            }
                            if (byteBufferSlice.getInt() == 1896449818) {
                                X509Certificate[][] x509CertificateArrBM = a.bM(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()), new epp(hmy.e(byteBufferSlice, i3 - 4), jLongValue2, jBK, jLongValue, byteBuffer3));
                                randomAccessFile.close();
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused) {
                                }
                                if (x509CertificateArrBM.length != 1) {
                                    throw new GeneralSecurityException("APK has more than one signature.");
                                }
                                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrBM[z2 ? 1 : 0][z2 ? 1 : 0].getEncoded());
                                if (Arrays.equals(this.d, bArrDigest) || (!"user".equals(Build.TYPE) && Arrays.equals(this.c, bArrDigest))) {
                                    return true;
                                }
                                return z2;
                            }
                            byteBuffer = byteBuffer3;
                            long j6 = jLongValue;
                            long j7 = jLongValue2;
                            long j8 = jBK;
                            byteBufferSlice.position(iPosition2);
                            jBK = j8;
                            jLongValue2 = j7;
                            jLongValue = j6;
                            z = z2 ? 1 : 0;
                        }
                        throw new epq("No APK Signature Scheme v2 block in APK Signing Block");
                    } catch (Throwable th) {
                        byteBuffer2.position(0);
                        byteBuffer2.limit(iLimit);
                        byteBuffer2.position(iPosition);
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            } catch (IOException e) {
                e = e;
                throw new GeneralSecurityException("Failed to verify signatures", e);
            }
        } catch (epq e2) {
            throw new GeneralSecurityException("Package is not signed", e2);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
