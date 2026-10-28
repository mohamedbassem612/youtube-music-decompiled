package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axin implements axih {
    public final axir a;
    public final axig b = new axig();
    public boolean c;

    public axin(axir axirVar) {
        this.a = axirVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.axir
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.j();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    @Override // defpackage.axih
    public final long d(axii axiiVar) {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        axiiVar.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long j4 = 0;
        long jMax = 0;
        while (true) {
            axig axigVar = this.b;
            if (jMax < j4) {
                throw new IllegalArgumentException(a.bS(jMax, "fromIndex < 0: "));
            }
            axio axioVar = axigVar.a;
            if (axioVar != null) {
                long j5 = axigVar.b;
                int i3 = 0;
                if (j5 - jMax < jMax) {
                    while (j5 > jMax) {
                        axioVar = axioVar.g;
                        axioVar.getClass();
                        j5 -= (long) (axioVar.c - axioVar.b);
                    }
                    if (axioVar == null) {
                        j = -1;
                        j2 = -1;
                    } else if (axiiVar.b() == 2) {
                        byte bA = axiiVar.a(0);
                        byte bA2 = axiiVar.a(1);
                        long j6 = jMax;
                        while (true) {
                            if (j5 < axigVar.b) {
                                byte[] bArr = axioVar.a;
                                j2 = -1;
                                long j7 = ((long) axioVar.b) + j6;
                                int i4 = axioVar.c;
                                int i5 = (int) (j7 - j5);
                                while (true) {
                                    if (i5 >= i4) {
                                        j6 = j5 + ((long) (axioVar.c - axioVar.b));
                                        axioVar = axioVar.f;
                                        axioVar.getClass();
                                        j5 = j6;
                                    } else {
                                        byte b = bArr[i5];
                                        if (b == bA || b == bA2) {
                                            j3 = i5 - axioVar.b;
                                            j = j3 + j5;
                                        } else {
                                            i5++;
                                        }
                                    }
                                }
                            } else {
                                j2 = -1;
                                j = j2;
                            }
                        }
                    } else {
                        j2 = -1;
                        byte[] bArr2 = axiiVar.b;
                        long j8 = jMax;
                        while (true) {
                            if (j5 < axigVar.b) {
                                byte[] bArr3 = axioVar.a;
                                long j9 = ((long) axioVar.b) + j8;
                                int i6 = axioVar.c;
                                int i7 = (int) (j9 - j5);
                                while (true) {
                                    if (i7 < i6) {
                                        byte b2 = bArr3[i7];
                                        int length = bArr2.length;
                                        int i8 = i3;
                                        while (true) {
                                            if (i8 >= length) {
                                                i7++;
                                                i3 = 0;
                                            } else if (b2 == bArr2[i8]) {
                                                j3 = i7 - axioVar.b;
                                                j = j3 + j5;
                                            } else {
                                                i8++;
                                            }
                                        }
                                    } else {
                                        j8 = ((long) (axioVar.c - axioVar.b)) + j5;
                                        axioVar = axioVar.f;
                                        axioVar.getClass();
                                        j5 = j8;
                                        i3 = 0;
                                    }
                                }
                            } else {
                                j = j2;
                            }
                        }
                    }
                } else {
                    j2 = -1;
                    long j10 = 0;
                    while (true) {
                        long j11 = ((long) (axioVar.c - axioVar.b)) + j10;
                        if (j11 > jMax) {
                            break;
                        }
                        axioVar = axioVar.f;
                        axioVar.getClass();
                        j10 = j11;
                    }
                    if (axioVar == null) {
                        j = j2;
                    } else if (axiiVar.b() == 2) {
                        byte bA3 = axiiVar.a(0);
                        byte bA4 = axiiVar.a(1);
                        long j12 = jMax;
                        while (true) {
                            if (j10 < axigVar.b) {
                                byte[] bArr4 = axioVar.a;
                                long j13 = ((long) axioVar.b) + j12;
                                int i9 = axioVar.c;
                                i = (int) (j13 - j10);
                                while (true) {
                                    if (i >= i9) {
                                        j12 = ((long) (axioVar.c - axioVar.b)) + j10;
                                        axioVar = axioVar.f;
                                        axioVar.getClass();
                                        j10 = j12;
                                    } else {
                                        byte b3 = bArr4[i];
                                        if (b3 == bA3 || b3 == bA4) {
                                            i2 = axioVar.b;
                                            j = j10 + ((long) (i - i2));
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            } else {
                                j = j2;
                            }
                        }
                    } else {
                        int i10 = 0;
                        byte[] bArr5 = axiiVar.b;
                        long j14 = jMax;
                        while (true) {
                            if (j10 < axigVar.b) {
                                byte[] bArr6 = axioVar.a;
                                long j15 = ((long) axioVar.b) + j14;
                                int i11 = axioVar.c;
                                i = (int) (j15 - j10);
                                while (true) {
                                    if (i < i11) {
                                        byte b4 = bArr6[i];
                                        int length2 = bArr5.length;
                                        int i12 = i10;
                                        while (true) {
                                            if (i12 >= length2) {
                                                i++;
                                                i10 = 0;
                                            } else if (b4 == bArr5[i12]) {
                                                i2 = axioVar.b;
                                                j = j10 + ((long) (i - i2));
                                            } else {
                                                i12++;
                                            }
                                        }
                                    } else {
                                        j14 = ((long) (axioVar.c - axioVar.b)) + j10;
                                        axioVar = axioVar.f;
                                        axioVar.getClass();
                                        j10 = j14;
                                        i10 = 0;
                                    }
                                }
                            } else {
                                j = j2;
                            }
                        }
                    }
                }
            } else {
                j = -1;
                j2 = -1;
            }
            if (j != j2) {
                return j;
            }
            long j16 = axigVar.b;
            if (this.a.e(axigVar, 8192L) == j2) {
                return j2;
            }
            jMax = Math.max(jMax, j16);
            j4 = 0;
        }
    }

    @Override // defpackage.axir
    public final long e(axig axigVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        axig axigVar2 = this.b;
        if (axigVar2.b == 0 && this.a.e(axigVar2, 8192L) == -1) {
            return -1L;
        }
        return axigVar2.e(axigVar, Math.min(8192L, axigVar2.b));
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.axih
    public final boolean l(long j) {
        axig axigVar;
        if (j < 0) {
            throw new IllegalArgumentException(a.bS(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            axigVar = this.b;
            if (axigVar.b >= j) {
                return true;
            }
        } while (this.a.e(axigVar, 8192L) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        axig axigVar = this.b;
        if (axigVar.b == 0 && this.a.e(axigVar, 8192L) == -1) {
            return -1;
        }
        return axigVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }
}
