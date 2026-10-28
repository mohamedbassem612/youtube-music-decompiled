package com.google.android.libraries.youtube.common.util;

import defpackage.ahno;
import defpackage.aigi;
import defpackage.aigj;
import defpackage.twh;
import defpackage.txb;
import defpackage.txd;
import defpackage.txe;
import defpackage.tym;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MemoryMappedBuffer {
    public static final /* synthetic */ int i = 0;
    public File a;
    public int b;
    public twh c;
    public boolean e;
    public long f;
    public txe g;
    public txd d = txd.a;
    public int h = 1;

    static {
        System.loadLibrary("memorymappedbufferjni");
    }

    public MemoryMappedBuffer(File file, int i2) {
        this.a = file;
        this.b = i2;
    }

    private void A(byte b) {
        Memory.pokeByte(this.f, b);
    }

    public static aigj e(aigj aigjVar) {
        try {
            InputStream inputStreamH = aigjVar.h();
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStreamH);
                try {
                    aigi aigiVar = new aigi(16384);
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int i2 = gZIPInputStream.read(bArr, 0, 16384);
                            if (i2 == -1) {
                                aigj aigjVarB = aigiVar.b();
                                aigiVar.close();
                                gZIPInputStream.close();
                                inputStreamH.close();
                                return aigjVarB;
                            }
                            aigiVar.write(bArr, 0, i2);
                            try {
                                gZIPInputStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            aigiVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    gZIPInputStream.close();
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    inputStreamH.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (IOException | IllegalArgumentException unused) {
            return null;
        }
    }

    public static native void nativeClose(int i2);

    static native long nativeMap(int i2, long j);

    public static native int nativeOpen(String str, boolean z);

    static native void nativeProtect(long j, long j2, int i2);

    static native long nativeSize(int i2);

    static native void nativeTruncate(int i2, long j, long j2);

    static native void nativeUnMap(long j, long j2);

    public static final long s(aigj aigjVar) {
        int iD = aigjVar.d() - 7;
        long j = 0;
        for (int i2 = 0; i2 < iD; i2 += 8) {
            long jA = 0;
            for (int i3 = 0; i3 < 8; i3++) {
                jA = (jA << 8) | ((long) (aigjVar.a(i2 + i3) & 255));
            }
            j += jA;
        }
        return j;
    }

    public static int u(byte[] bArr, int i2, int[] iArr, int i3) {
        int i4 = i2 + 1;
        int i5 = i4;
        long j = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = iArr[i8];
            j |= (((long) i9) & ((1 << i5) - 1)) << i6;
            i6 += i5;
            i5 = ((i9 & (1 << i2)) == 0 || i5 == 7) ? i4 : 7;
            while (i6 > 7) {
                if (bArr != null) {
                    bArr[i7] = (byte) j;
                }
                i7++;
                j >>>= 8;
                i6 -= 8;
            }
        }
        if (i6 <= 0) {
            return i7;
        }
        if (bArr != null) {
            bArr[i7] = (byte) j;
        }
        return i7 + 1;
    }

    private byte y() {
        return Memory.peekByte(this.f);
    }

    private void z(long j, int i2) {
        nativeProtect(j, i2, 3);
    }

    public final long a(int i2, int i3) {
        long j = this.f;
        long j2 = j + ((long) i3);
        long jPeekLong = 0;
        for (long j3 = ((long) i2) + j; j3 <= j2; j3 += 8) {
            jPeekLong += Memory.peekLong(j3, false);
        }
        return jPeekLong;
    }

    public final long b(int i2, int i3) {
        int i4 = (i2 << 3) + ((char) i3);
        int i5 = ((i3 >>> 16) - 1) / 2;
        return c(i4 + 1 + ((((Memory.peekByte(this.f + ((long) (i4 >> 3))) & 255) >>> (i4 & 7)) & 1) * i5), i5);
    }

    public final long c(int i2, int i3) {
        int i4 = i2 >> 3;
        int i5 = i4 & (-8);
        int i6 = (i2 & 7) + ((i4 - i5) << 3);
        int iMin = Math.min(64 - i6, i3);
        long j = iMin == 64 ? -1L : (1 << iMin) - 1;
        long j2 = this.f + ((long) i5);
        long jPeekLong = (Memory.peekLong(j2, false) >>> i6) & j;
        if (i3 <= iMin) {
            return jPeekLong;
        }
        int i7 = i3 - iMin;
        return jPeekLong | ((Memory.peekLong(j2 + 8, false) & (i7 != 64 ? (-1) + (1 << i7) : -1L)) << iMin);
    }

    public txb d() throws Throwable {
        Long lValueOf;
        Throwable th;
        txb txbVar;
        MemoryMappedBuffer memoryMappedBuffer;
        int i2 = this.h;
        if (i2 == 3) {
            throw new IllegalStateException();
        }
        if (i2 != 2) {
            File file = this.a;
            int i3 = -1;
            try {
                try {
                    int i4 = this.b;
                    if (file != null) {
                        int iNativeOpen = nativeOpen(file.getPath(), this.e);
                        try {
                            long jNativeSize = nativeSize(iNativeOpen);
                            try {
                                if (jNativeSize > 2147483647L) {
                                    throw new IOException("File too large");
                                }
                                i4 = this.b;
                                if (jNativeSize >= i4) {
                                    i4 = (int) jNativeSize;
                                } else {
                                    this.d.a(txb.w);
                                }
                                this.b = i4;
                                memoryMappedBuffer = this;
                                memoryMappedBuffer.h(iNativeOpen, jNativeSize, i4);
                                i3 = iNativeOpen;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        th = th;
                        i3 = iNativeOpen;
                        nativeClose(i3);
                        throw th;
                    }
                    memoryMappedBuffer = this;
                    try {
                        long jNativeMap = nativeMap(i3, i4);
                        lValueOf = Long.valueOf(jNativeMap);
                        nativeClose(i3);
                        try {
                            if (memoryMappedBuffer.e) {
                                lValueOf.getClass();
                                memoryMappedBuffer.z(jNativeMap, memoryMappedBuffer.b);
                            }
                        } catch (Exception e) {
                            e = e;
                            memoryMappedBuffer.g("mmap", e);
                            memoryMappedBuffer.d.a(txb.b);
                            if (e instanceof FileNotFoundException) {
                                memoryMappedBuffer.d.a(txb.e);
                            } else {
                                String message = e.getMessage();
                                if (message != null && message.startsWith("@")) {
                                    txb txbVar2 = txb.a;
                                    if (message.startsWith("@ope")) {
                                        txbVar = txb.e;
                                    } else if (message.startsWith("@fst")) {
                                        txbVar = txb.f;
                                    } else if (message.startsWith("@ftr")) {
                                        txbVar = txb.g;
                                    } else if (message.startsWith("@wri") || message.startsWith("@lse")) {
                                        txbVar = txb.h;
                                    } else if (message.startsWith("@mma")) {
                                        txbVar = txb.i;
                                    } else if (message.startsWith("@mpr")) {
                                        txbVar = txb.j;
                                    } else {
                                        if (!message.startsWith("@mun")) {
                                            message.startsWith("@clo");
                                        }
                                        txbVar = txbVar2;
                                    }
                                    if (txbVar != txbVar2) {
                                        memoryMappedBuffer.d.a(txbVar);
                                    }
                                }
                            }
                            memoryMappedBuffer.m(lValueOf != null ? lValueOf.longValue() : 0L, memoryMappedBuffer.b);
                            lValueOf = null;
                        }
                        if (lValueOf == null) {
                            memoryMappedBuffer.r();
                            txd txdVar = memoryMappedBuffer.d;
                            txb txbVar3 = txb.o;
                            txdVar.a(txbVar3);
                            return txbVar3;
                        }
                        if (file == null) {
                            memoryMappedBuffer.d.a(txb.y);
                        }
                        memoryMappedBuffer.f = lValueOf.longValue();
                        if (memoryMappedBuffer.e) {
                            memoryMappedBuffer.A(memoryMappedBuffer.y());
                        }
                        memoryMappedBuffer.h = 2;
                        txe txeVar = memoryMappedBuffer.g;
                        if (txeVar != null) {
                            MemoryMappedBuffer memoryMappedBuffer2 = txeVar.e;
                            memoryMappedBuffer2.g = null;
                            int i5 = txeVar.d;
                            int i6 = memoryMappedBuffer2.b;
                            long j = memoryMappedBuffer2.f;
                            long jMin = Math.min(i5, i6);
                            for (long j2 = 0; j2 < jMin; j2 += 8) {
                                Memory.pokeLong(j + j2, Memory.peekLong(txeVar.c + j2, false), false);
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        nativeClose(i3);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    lValueOf = null;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return txb.a;
    }

    public final String f(int i2, int i3, Charset charset) {
        int iPeekByte = Memory.peekByte(this.f + ((long) i2)) & 255;
        int i4 = i2 + 1;
        int i5 = (iPeekByte << 1) + i4;
        for (int i6 = 0; i6 < iPeekByte; i6++) {
            int iC = (int) c(i4 << 3, 16);
            if (i6 == i3) {
                byte[] bArr = new byte[iC];
                t(i5, bArr, iC);
                return new String(bArr, charset);
            }
            i4 += 2;
            i5 += iC;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void g(String str, Throwable th) {
        twh twhVar = this.c;
        if (twhVar != null) {
            twhVar.a(str, th);
        }
    }

    public final void h(int i2, long j, long j2) {
        if (j2 != j) {
            if (true != this.e) {
                j = -1;
            }
            nativeTruncate(i2, j2, j);
        }
    }

    public void j(File file) {
        if (this.h != 1) {
            throw new IllegalStateException();
        }
        this.a = file;
    }

    public final void k(int i2, int i3, long j) {
        int i4 = (i2 << 3) + ((char) i3);
        long j2 = i4 >> 3;
        int i5 = i4 & 7;
        int iPeekByte = ((Memory.peekByte(this.f + j2) & 255) >>> i5) & 1;
        int i6 = ((i3 >>> 16) - 1) / 2;
        w(i4 + (iPeekByte == 0 ? i6 + 1 : 1), i6, j);
        int i7 = 1 - iPeekByte;
        long j3 = this.f + j2;
        int i8 = 1 << i5;
        byte bPeekByte = Memory.peekByte(j3);
        Memory.pokeByte(j3, (byte) (i7 == 0 ? bPeekByte & (~i8) : bPeekByte | i8));
    }

    public final void l(txd txdVar) {
        if (this.h != 1) {
            throw new IllegalStateException();
        }
        this.d = txdVar;
    }

    public final void m(long j, long j2) {
        if (j > 0) {
            try {
                nativeUnMap(j, j2);
            } catch (Exception e) {
                g("unmap", e);
                this.d.a(txb.c);
            }
        }
    }

    public final void n(int i2, int i3) {
        long j = this.f + ((long) i2);
        for (long j2 = j; j2 < ((long) i3) + j; j2++) {
            Memory.pokeByte(j2, (byte) 0);
        }
    }

    public final boolean o() {
        ahno.O(this.h == 1);
        return p(this.a);
    }

    final boolean p(File file) {
        boolean zN = file != null ? tym.n(file, null) : true;
        if (!zN) {
            this.d.a(txb.t);
        }
        i(file);
        return zN;
    }

    public boolean q() {
        int i2 = this.h;
        if (i2 == 3) {
            return false;
        }
        if (i2 == 2) {
            r();
        }
        p(this.a);
        this.h = 3;
        return true;
    }

    public boolean r() {
        int i2 = this.h;
        txe txeVar = this.g;
        if (txeVar != null) {
            txeVar.e.f = 0L;
        }
        boolean z = i2 == 2;
        m(this.f, this.b);
        this.f = 0L;
        this.h = 1;
        return z;
    }

    public final void t(int i2, byte[] bArr, int i3) {
        long j = this.f + ((long) i2);
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = Memory.peekByte(((long) i4) + j);
        }
    }

    public final void v() {
        if (this.h != 1) {
            throw new IllegalStateException();
        }
        this.e = true;
    }

    public final void w(int i2, int i3, long j) {
        long jMin;
        int i4 = i3;
        if (i4 == 64) {
            jMin = j;
            i4 = 64;
        } else {
            jMin = Math.min(j, (1 << i4) - 1);
        }
        int i5 = i2 >> 3;
        int i6 = i5 & (-8);
        int i7 = (i2 & 7) + ((i5 - i6) << 3);
        int iMin = Math.min(64 - i7, i4);
        long j2 = iMin == 64 ? -1L : (1 << iMin) - 1;
        long j3 = this.f + ((long) i6);
        Memory.pokeLong(j3, (Memory.peekLong(j3, false) & (~(j2 << i7))) | ((j2 & jMin) << i7), false);
        if (i4 > iMin) {
            long j4 = j3 + 8;
            long j5 = (1 << (i4 - iMin)) - 1;
            Memory.pokeLong(j4, (Memory.peekLong(j4, false) & (~j5)) | ((jMin >>> iMin) & j5), false);
        }
    }

    public final int x(int i2, int i3) {
        if ((Memory.peekByte(this.f + ((long) i2)) & 255) != 2) {
            return 2;
        }
        int i4 = i2 + 1;
        int i5 = i2 + 5;
        if (i5 > i3) {
            return 3;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            int iC = (int) c(i4 << 3, 16);
            i4 += 2;
            i5 += iC;
        }
        return i5 <= i3 ? 1 : 4;
    }

    protected void i(File file) {
    }
}
