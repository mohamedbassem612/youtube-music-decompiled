package defpackage;

import android.util.LongSparseArray;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cnz implements coo {
    public final coo a;
    public final coo b;
    private final ccu c = new ccu();
    private final DecoderInputBuffer d = new DecoderInputBuffer(1);
    private final LongSparseArray e = new LongSparseArray();
    private final int f;
    private byte[] g;
    private long h;
    private boolean i;
    private boolean j;

    public cnz(coo cooVar, coo cooVar2, bse bseVar) {
        this.a = cooVar;
        this.b = cooVar2;
        int i = bseVar.s;
        this.f = i != -1 ? i + 2 : 18;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.coo
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.coo
    public final int b(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, int i) {
        int length;
        int i2;
        int iB = this.a.b(ccuVar, decoderInputBuffer, i);
        if (iB != -4) {
            return iB;
        }
        if (!decoderInputBuffer.isEndOfStream() && (i & 4) == 0) {
            boolean z = true;
            if ((i & 1) == 0 && !this.i) {
                long j = decoderInputBuffer.timeUs;
                byte[] bArr = null;
                if (!this.j) {
                    long j2 = this.h;
                    if (j2 == -9223372036854775807L || j2 <= j) {
                        while (true) {
                            DecoderInputBuffer decoderInputBuffer2 = this.d;
                            decoderInputBuffer2.clear();
                            coo cooVar = this.b;
                            ccu ccuVar2 = this.c;
                            int iB2 = cooVar.b(ccuVar2, decoderInputBuffer2, 0);
                            if (iB2 != -3) {
                                if (iB2 != -5) {
                                    if (!decoderInputBuffer2.isEndOfStream()) {
                                        long j3 = decoderInputBuffer2.timeUs;
                                        long j4 = j;
                                        long j5 = this.h;
                                        if (j5 != -9223372036854775807L && j3 < j5) {
                                            this.i = z;
                                            this.e.clear();
                                            this.g = null;
                                        }
                                        this.h = j3;
                                        ByteBuffer byteBuffer = decoderInputBuffer2.data;
                                        if (!this.i && byteBuffer != null) {
                                            decoderInputBuffer2.flip();
                                            Object obj = ccuVar2.b;
                                            if (obj != null) {
                                                int i3 = 0;
                                                length = 0;
                                                while (true) {
                                                    List list = ((bse) obj).t;
                                                    if (i3 >= list.size()) {
                                                        break;
                                                    }
                                                    length += ((byte[]) list.get(i3)).length;
                                                    i3++;
                                                }
                                            } else {
                                                length = 0;
                                            }
                                            byte[] bArr2 = new byte[length + byteBuffer.remaining()];
                                            if (obj != null) {
                                                int i4 = 0;
                                                i2 = 0;
                                                while (true) {
                                                    List list2 = ((bse) obj).t;
                                                    if (i4 >= list2.size()) {
                                                        break;
                                                    }
                                                    byte[] bArr3 = (byte[]) list2.get(i4);
                                                    int length2 = bArr3.length;
                                                    System.arraycopy(bArr3, 0, bArr2, i2, length2);
                                                    i2 += length2;
                                                    i4++;
                                                }
                                            } else {
                                                i2 = 0;
                                            }
                                            byteBuffer.get(bArr2, i2, byteBuffer.remaining());
                                            LongSparseArray longSparseArray = this.e;
                                            longSparseArray.put(j3, bArr2);
                                            while (longSparseArray.size() > this.f) {
                                                longSparseArray.removeAt(0);
                                            }
                                        }
                                        if (j3 > j4) {
                                            break;
                                        }
                                        j = j4;
                                        z = true;
                                    } else {
                                        this.j = z;
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                long j6 = decoderInputBuffer.timeUs;
                LongSparseArray longSparseArray2 = this.e;
                int size = longSparseArray2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    if (longSparseArray2.keyAt(size) <= j6) {
                        bArr = (byte[]) longSparseArray2.valueAt(size);
                        break;
                    }
                }
                if (bArr != null) {
                    this.g = bArr;
                }
                byte[] bArr4 = this.g;
                if (bArr4 != null) {
                    decoderInputBuffer.resetSupplementalData(bArr4.length);
                    decoderInputBuffer.supplementalData.put(bArr4);
                    decoderInputBuffer.addFlag(268435456);
                }
            }
        }
        return -4;
    }

    @Override // defpackage.coo
    public final int c(long j) {
        return this.a.c(j);
    }

    final void e() {
        this.e.clear();
        this.g = null;
        this.h = -9223372036854775807L;
        this.i = false;
        this.j = false;
        this.d.clear();
    }

    @Override // defpackage.coo
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.coo
    public final void gu() {
        this.a.gu();
        if (this.i) {
            return;
        }
        this.b.gu();
    }
}
