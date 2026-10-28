package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jtr implements jtn {
    public int A;
    public int B;
    public boolean C;
    public MediaParser.MediaParsersImplementation D;
    public zh E;
    public zh F;
    private jtl I;
    private final bwb J;
    private final bwb K;
    private final bwb L;
    private final bwb M;
    private final bwb N;
    private final bwb O;
    private final bwb P;
    private ByteBuffer Q;
    private long R;
    private long S;
    private boolean T;
    private long U;
    private boolean V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    private byte ae;
    private boolean af;
    private cvk ag;
    private final jto ah;
    public final jts c;
    public final SparseArray d;
    public final bwb e;
    public final bwb f;
    public final bwb g;
    public byte[] h;
    public long i;
    public long j;
    public long k;
    protected jtp l;
    public int m;
    public long n;
    public long o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int[] x;
    public int y;
    public int z;
    private static final byte[] G = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a = bwp.ah("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] H = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);

    public jtr() {
        jto jtoVar = new jto();
        this.i = -1L;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.S = -9223372036854775807L;
        this.U = -1L;
        this.o = -9223372036854775807L;
        this.ah = jtoVar;
        jtoVar.g = new qcb(this);
        this.c = new jts();
        this.d = new SparseArray();
        this.e = new bwb(4);
        this.L = new bwb(ByteBuffer.allocate(4).putInt(-1).array());
        this.f = new bwb(4);
        this.J = new bwb(bxf.a);
        this.K = new bwb(4);
        this.M = new bwb();
        this.N = new bwb();
        this.O = new bwb(8);
        this.P = new bwb();
        this.g = new bwb();
        this.x = new int[1];
        this.h = bwp.e;
    }

    public static int[] r(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length << 1, i)];
    }

    private final int s() {
        int i = this.Y;
        u();
        return i;
    }

    private final int t(jtm jtmVar, cwj cwjVar, int i) {
        bwb bwbVar = this.M;
        int iD = bwbVar.d();
        if (iD <= 0) {
            return cwjVar.a(jtmVar, i, false);
        }
        int iMin = Math.min(i, iD);
        cwjVar.c(bwbVar, iMin);
        return iMin;
    }

    private final void u() {
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = false;
        this.ac = false;
        this.ad = 0;
        this.ae = (byte) 0;
        this.af = false;
        this.M.L(0);
        byte[] bArr = this.K.b;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
    }

    private final boolean v(jtm jtmVar, byte[] bArr, int i) {
        int length = bArr.length;
        bwb bwbVar = this.N;
        int i2 = i + 32;
        if (bwbVar.e() < i2) {
            bwbVar.M(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, bwbVar.b, 0, 32);
        }
        if (!jtmVar.j(bwbVar.b, 32, i)) {
            return false;
        }
        bwbVar.P(0);
        bwbVar.O(i2);
        return true;
    }

    private static byte[] w(long j, String str, long j2) {
        ahno.F(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return bwp.ah(String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.ag = cvkVar;
    }

    @Override // defpackage.cvi
    public void d(long j, long j2) {
        this.o = -9223372036854775807L;
        this.s = 0;
        this.q = 0;
        this.r = 0;
        this.W = 0;
        jto jtoVar = this.ah;
        jtoVar.c = 0;
        jtoVar.a.clear();
        jtoVar.b.d();
        this.c.d();
        u();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            jtq jtqVar = ((jtp) sparseArray.valueAt(i)).S;
            if (jtqVar != null) {
                jtqVar.b = false;
                jtqVar.c = 0;
            }
            i++;
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        rik rikVar = new rik((byte[]) null);
        cvb cvbVar = (cvb) cvjVar;
        long j = cvbVar.a;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        bwb bwbVar = (bwb) rikVar.a;
        cvbVar.n(bwbVar.b, 0, 4, false);
        rikVar.b = 4;
        for (long jW = bwbVar.w(); jW != 440786851; jW = ((jW << 8) & (-256)) | ((long) (bwbVar.b[0] & 255))) {
            int i = (int) j2;
            int i2 = rikVar.b + 1;
            rikVar.b = i2;
            if (i2 == i) {
                return false;
            }
            cvbVar.n(bwbVar.b, 0, 1, false);
        }
        long jB = rikVar.b(cvjVar);
        long j3 = rikVar.b;
        if (jB == Long.MIN_VALUE) {
            return false;
        }
        long j4 = j3 + jB;
        if (j != -1 && j4 >= j) {
            return false;
        }
        while (true) {
            long j5 = rikVar.b;
            if (j5 >= j4) {
                return j5 == j4;
            }
            if (rikVar.b(cvjVar) == Long.MIN_VALUE) {
                return false;
            }
            long jB2 = rikVar.b(cvjVar);
            if (jB2 < 0) {
                return false;
            }
            if (jB2 != 0) {
                int i3 = (int) jB2;
                cvbVar.m(i3, false);
                rikVar.b += i3;
            }
        }
    }

    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) {
        jtl jtlVar = this.I;
        if (jtlVar == null) {
            jtlVar = new jtl();
            this.I = jtlVar;
        }
        jtlVar.a = cvjVar;
        int i = 0;
        this.V = false;
        while (!this.V) {
            boolean zA = this.ah.a(this.I);
            if (zA) {
                this.I.d();
                if (this.T && this.U != -1) {
                    qhaVar.a = 0L;
                    this.U = -1L;
                    return 1;
                }
            }
            if (!zA) {
                while (true) {
                    SparseArray sparseArray = this.d;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    ((jtp) sparseArray.valueAt(i)).c();
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // defpackage.jtn
    public final void h(jtk jtkVar) throws bsz {
        while (jtkVar.i()) {
            long j = jtkVar.b;
            long jC = jtkVar.c();
            int i = 0;
            this.V = false;
            while (!this.V) {
                try {
                    if (!this.ah.a(jtkVar)) {
                        while (true) {
                            SparseArray sparseArray = this.d;
                            if (i >= sparseArray.size()) {
                                break;
                            }
                            ((jtp) sparseArray.valueAt(i)).c();
                            i++;
                        }
                    }
                } catch (IOException e) {
                    throw new bsz(null, e, true, 1);
                }
            }
            if (j == jtkVar.b && jC == jtkVar.c()) {
                throw new bsz("Extractor failed to make progress.", null, true, 1);
            }
        }
    }

    protected int i(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x023d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0259  */
    /* JADX WARN: Code duplicated, block: B:110:0x012e A[EDGE_INSN: B:110:0x012e->B:58:0x012e BREAK  A[LOOP:0: B:51:0x0112->B:57:0x012a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x024f A[EDGE_INSN: B:113:0x024f->B:105:0x024f BREAK  A[LOOP:1: B:86:0x01dd->B:90:0x01e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e9 A[LOOP:1: B:86:0x01dd->B:90:0x01e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0200  */
    /* JADX WARN: Code duplicated, block: B:98:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0218  */
    public final int j(jtm jtmVar, jtp jtpVar, int i) throws bsz {
        bwb bwbVar;
        int i2;
        String str;
        bwb bwbVar2;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int iMin;
        int iT;
        int i6;
        int iT2;
        byte b2;
        int i7;
        int i8;
        bwb bwbVar3;
        int i9;
        ByteBuffer byteBuffer;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ByteBuffer byteBuffer2;
        int i15;
        int i16;
        ByteBuffer byteBuffer3;
        bwb bwbVar4;
        bwb bwbVar5;
        String str2 = jtpVar.b;
        if ("S_TEXT/UTF8".equals(str2)) {
            if (v(jtmVar, G, i)) {
                return s();
            }
        } else if (!"S_TEXT/ASS".equals(str2)) {
            cwj cwjVar = jtpVar.W;
            if (!this.aa) {
                if (jtpVar.g) {
                    this.A &= -1073741825;
                    boolean z = this.ab;
                    int i17 = SemanticState.Focused;
                    if (z) {
                        b2 = this.ae;
                        if ((b2 & 1) == 1) {
                            i7 = b2 & 2;
                            this.A |= 1073741824;
                            if (!this.af) {
                                bwbVar5 = this.O;
                                if (jtmVar.j(bwbVar5.b, 0, 8)) {
                                    this.X += 8;
                                    this.af = true;
                                    bwb bwbVar6 = this.e;
                                    if (i7 != 2) {
                                        i17 = 0;
                                    }
                                    bwbVar6.b[0] = (byte) (i17 | 8);
                                    bwbVar6.P(0);
                                    cwjVar.c(bwbVar6, 1);
                                    this.Y++;
                                    bwbVar5.P(0);
                                    cwjVar.c(bwbVar5, 8);
                                    this.Y += 8;
                                    if (i7 == 2) {
                                        if (this.ac) {
                                            i8 = this.ad << 2;
                                            bwbVar3 = this.e;
                                            bwbVar3.H(i8);
                                            if (jtmVar.j(bwbVar3.b, 0, i8)) {
                                                bwbVar3.P(0);
                                                bwbVar3.O(i8);
                                                this.X += i8;
                                                int i18 = (this.ad >> 1) + 1;
                                                i9 = (i18 * 6) + 2;
                                                byteBuffer = this.Q;
                                                if (byteBuffer != null) {
                                                    this.Q = ByteBuffer.allocate(i9);
                                                } else {
                                                    this.Q = ByteBuffer.allocate(i9);
                                                }
                                                this.Q.position(0);
                                                this.Q.putShort((short) i18);
                                                i10 = 0;
                                                i11 = 0;
                                                while (true) {
                                                    i12 = this.ad;
                                                    if (i10 < i12) {
                                                        break;
                                                        break;
                                                    }
                                                    int iQ = bwbVar3.q();
                                                    i15 = iQ - i11;
                                                    i16 = i10 % 2;
                                                    byteBuffer3 = this.Q;
                                                    if (i16 == 0) {
                                                        byteBuffer3.putShort((short) i15);
                                                    } else {
                                                        byteBuffer3.putInt(i15);
                                                    }
                                                    i10++;
                                                    i11 = iQ;
                                                }
                                                i13 = (i - this.X) - i11;
                                                i14 = i12 & 1;
                                                byteBuffer2 = this.Q;
                                                if (i14 == 1) {
                                                    byteBuffer2.putInt(i13);
                                                } else {
                                                    byteBuffer2.putShort((short) i13);
                                                    this.Q.putInt(0);
                                                }
                                                bwb bwbVar7 = this.P;
                                                bwbVar7.N(this.Q.array(), i9);
                                                cwjVar.c(bwbVar7, i9);
                                                this.Y += i9;
                                            }
                                        } else {
                                            bwbVar4 = this.e;
                                            if (jtmVar.j(bwbVar4.b, 0, 1)) {
                                                this.X++;
                                                bwbVar4.P(0);
                                                this.ad = bwbVar4.n();
                                                this.ac = true;
                                                i8 = this.ad << 2;
                                                bwbVar3 = this.e;
                                                bwbVar3.H(i8);
                                                if (jtmVar.j(bwbVar3.b, 0, i8)) {
                                                    bwbVar3.P(0);
                                                    bwbVar3.O(i8);
                                                    this.X += i8;
                                                    int i19 = (this.ad >> 1) + 1;
                                                    i9 = (i19 * 6) + 2;
                                                    byteBuffer = this.Q;
                                                    if (byteBuffer != null) {
                                                        this.Q = ByteBuffer.allocate(i9);
                                                    } else {
                                                        this.Q = ByteBuffer.allocate(i9);
                                                    }
                                                    this.Q.position(0);
                                                    this.Q.putShort((short) i19);
                                                    i10 = 0;
                                                    i11 = 0;
                                                    while (true) {
                                                        i12 = this.ad;
                                                        if (i10 < i12) {
                                                            break;
                                                            break;
                                                        }
                                                        int iQ2 = bwbVar3.q();
                                                        i15 = iQ2 - i11;
                                                        i16 = i10 % 2;
                                                        byteBuffer3 = this.Q;
                                                        if (i16 == 0) {
                                                            byteBuffer3.putShort((short) i15);
                                                        } else {
                                                            byteBuffer3.putInt(i15);
                                                        }
                                                        i10++;
                                                        i11 = iQ2;
                                                    }
                                                    i13 = (i - this.X) - i11;
                                                    i14 = i12 & 1;
                                                    byteBuffer2 = this.Q;
                                                    if (i14 == 1) {
                                                        byteBuffer2.putInt(i13);
                                                    } else {
                                                        byteBuffer2.putShort((short) i13);
                                                        this.Q.putInt(0);
                                                    }
                                                    bwb bwbVar8 = this.P;
                                                    bwbVar8.N(this.Q.array(), i9);
                                                    cwjVar.c(bwbVar8, i9);
                                                    this.Y += i9;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i7 == 2) {
                                if (this.ac) {
                                    bwbVar4 = this.e;
                                    if (jtmVar.j(bwbVar4.b, 0, 1)) {
                                        this.X++;
                                        bwbVar4.P(0);
                                        this.ad = bwbVar4.n();
                                        this.ac = true;
                                        i8 = this.ad << 2;
                                        bwbVar3 = this.e;
                                        bwbVar3.H(i8);
                                        if (jtmVar.j(bwbVar3.b, 0, i8)) {
                                            bwbVar3.P(0);
                                            bwbVar3.O(i8);
                                            this.X += i8;
                                            int i110 = (this.ad >> 1) + 1;
                                            i9 = (i110 * 6) + 2;
                                            byteBuffer = this.Q;
                                            if (byteBuffer != null) {
                                                this.Q = ByteBuffer.allocate(i9);
                                            } else {
                                                this.Q = ByteBuffer.allocate(i9);
                                            }
                                            this.Q.position(0);
                                            this.Q.putShort((short) i110);
                                            i10 = 0;
                                            i11 = 0;
                                            while (true) {
                                                i12 = this.ad;
                                                if (i10 < i12) {
                                                    break;
                                                    break;
                                                }
                                                int iQ3 = bwbVar3.q();
                                                i15 = iQ3 - i11;
                                                i16 = i10 % 2;
                                                byteBuffer3 = this.Q;
                                                if (i16 == 0) {
                                                    byteBuffer3.putShort((short) i15);
                                                } else {
                                                    byteBuffer3.putInt(i15);
                                                }
                                                i10++;
                                                i11 = iQ3;
                                            }
                                            i13 = (i - this.X) - i11;
                                            i14 = i12 & 1;
                                            byteBuffer2 = this.Q;
                                            if (i14 == 1) {
                                                byteBuffer2.putInt(i13);
                                            } else {
                                                byteBuffer2.putShort((short) i13);
                                                this.Q.putInt(0);
                                            }
                                            bwb bwbVar9 = this.P;
                                            bwbVar9.N(this.Q.array(), i9);
                                            cwjVar.c(bwbVar9, i9);
                                            this.Y += i9;
                                        }
                                    }
                                } else {
                                    i8 = this.ad << 2;
                                    bwbVar3 = this.e;
                                    bwbVar3.H(i8);
                                    if (jtmVar.j(bwbVar3.b, 0, i8)) {
                                        bwbVar3.P(0);
                                        bwbVar3.O(i8);
                                        this.X += i8;
                                        int i111 = (this.ad >> 1) + 1;
                                        i9 = (i111 * 6) + 2;
                                        byteBuffer = this.Q;
                                        if (byteBuffer != null) {
                                            this.Q = ByteBuffer.allocate(i9);
                                        } else {
                                            this.Q = ByteBuffer.allocate(i9);
                                        }
                                        this.Q.position(0);
                                        this.Q.putShort((short) i111);
                                        i10 = 0;
                                        i11 = 0;
                                        while (true) {
                                            i12 = this.ad;
                                            if (i10 < i12) {
                                                break;
                                                break;
                                            }
                                            int iQ4 = bwbVar3.q();
                                            i15 = iQ4 - i11;
                                            i16 = i10 % 2;
                                            byteBuffer3 = this.Q;
                                            if (i16 == 0) {
                                                byteBuffer3.putShort((short) i15);
                                            } else {
                                                byteBuffer3.putInt(i15);
                                            }
                                            i10++;
                                            i11 = iQ4;
                                        }
                                        i13 = (i - this.X) - i11;
                                        i14 = i12 & 1;
                                        byteBuffer2 = this.Q;
                                        if (i14 == 1) {
                                            byteBuffer2.putInt(i13);
                                        } else {
                                            byteBuffer2.putShort((short) i13);
                                            this.Q.putInt(0);
                                        }
                                        bwb bwbVar10 = this.P;
                                        bwbVar10.N(this.Q.array(), i9);
                                        cwjVar.c(bwbVar10, i9);
                                        this.Y += i9;
                                    }
                                }
                            }
                        }
                    } else {
                        bwb bwbVar11 = this.e;
                        if (jtmVar.j(bwbVar11.b, 0, 1)) {
                            this.X++;
                            byte b3 = bwbVar11.b[0];
                            if ((b3 & 128) == 128) {
                                throw new bsz("Extension bit is set in signal byte", null, true, 1);
                            }
                            this.ae = b3;
                            this.ab = true;
                            b2 = this.ae;
                            if ((b2 & 1) == 1) {
                                i7 = b2 & 2;
                                this.A |= 1073741824;
                                if (!this.af) {
                                    bwbVar5 = this.O;
                                    if (jtmVar.j(bwbVar5.b, 0, 8)) {
                                        this.X += 8;
                                        this.af = true;
                                        bwb bwbVar12 = this.e;
                                        if (i7 != 2) {
                                            i17 = 0;
                                        }
                                        bwbVar12.b[0] = (byte) (i17 | 8);
                                        bwbVar12.P(0);
                                        cwjVar.c(bwbVar12, 1);
                                        this.Y++;
                                        bwbVar5.P(0);
                                        cwjVar.c(bwbVar5, 8);
                                        this.Y += 8;
                                        if (i7 == 2) {
                                            if (this.ac) {
                                                bwbVar4 = this.e;
                                                if (jtmVar.j(bwbVar4.b, 0, 1)) {
                                                    this.X++;
                                                    bwbVar4.P(0);
                                                    this.ad = bwbVar4.n();
                                                    this.ac = true;
                                                    i8 = this.ad << 2;
                                                    bwbVar3 = this.e;
                                                    bwbVar3.H(i8);
                                                    if (jtmVar.j(bwbVar3.b, 0, i8)) {
                                                        bwbVar3.P(0);
                                                        bwbVar3.O(i8);
                                                        this.X += i8;
                                                        int i112 = (this.ad >> 1) + 1;
                                                        i9 = (i112 * 6) + 2;
                                                        byteBuffer = this.Q;
                                                        if (byteBuffer != null || byteBuffer.capacity() < i9) {
                                                            this.Q = ByteBuffer.allocate(i9);
                                                        }
                                                        this.Q.position(0);
                                                        this.Q.putShort((short) i112);
                                                        i10 = 0;
                                                        i11 = 0;
                                                        while (true) {
                                                            i12 = this.ad;
                                                            if (i10 < i12) {
                                                                break;
                                                            }
                                                            int iQ5 = bwbVar3.q();
                                                            i15 = iQ5 - i11;
                                                            i16 = i10 % 2;
                                                            byteBuffer3 = this.Q;
                                                            if (i16 == 0) {
                                                                byteBuffer3.putShort((short) i15);
                                                            } else {
                                                                byteBuffer3.putInt(i15);
                                                            }
                                                            i10++;
                                                            i11 = iQ5;
                                                        }
                                                        i13 = (i - this.X) - i11;
                                                        i14 = i12 & 1;
                                                        byteBuffer2 = this.Q;
                                                        if (i14 == 1) {
                                                            byteBuffer2.putInt(i13);
                                                        } else {
                                                            byteBuffer2.putShort((short) i13);
                                                            this.Q.putInt(0);
                                                        }
                                                        bwb bwbVar13 = this.P;
                                                        bwbVar13.N(this.Q.array(), i9);
                                                        cwjVar.c(bwbVar13, i9);
                                                        this.Y += i9;
                                                    }
                                                }
                                            } else {
                                                i8 = this.ad << 2;
                                                bwbVar3 = this.e;
                                                bwbVar3.H(i8);
                                                if (jtmVar.j(bwbVar3.b, 0, i8)) {
                                                    bwbVar3.P(0);
                                                    bwbVar3.O(i8);
                                                    this.X += i8;
                                                    int i113 = (this.ad >> 1) + 1;
                                                    i9 = (i113 * 6) + 2;
                                                    byteBuffer = this.Q;
                                                    if (byteBuffer != null) {
                                                        this.Q = ByteBuffer.allocate(i9);
                                                    } else {
                                                        this.Q = ByteBuffer.allocate(i9);
                                                    }
                                                    this.Q.position(0);
                                                    this.Q.putShort((short) i113);
                                                    i10 = 0;
                                                    i11 = 0;
                                                    while (true) {
                                                        i12 = this.ad;
                                                        if (i10 < i12) {
                                                            break;
                                                            break;
                                                        }
                                                        int iQ6 = bwbVar3.q();
                                                        i15 = iQ6 - i11;
                                                        i16 = i10 % 2;
                                                        byteBuffer3 = this.Q;
                                                        if (i16 == 0) {
                                                            byteBuffer3.putShort((short) i15);
                                                        } else {
                                                            byteBuffer3.putInt(i15);
                                                        }
                                                        i10++;
                                                        i11 = iQ6;
                                                    }
                                                    i13 = (i - this.X) - i11;
                                                    i14 = i12 & 1;
                                                    byteBuffer2 = this.Q;
                                                    if (i14 == 1) {
                                                        byteBuffer2.putInt(i13);
                                                    } else {
                                                        byteBuffer2.putShort((short) i13);
                                                        this.Q.putInt(0);
                                                    }
                                                    bwb bwbVar14 = this.P;
                                                    bwbVar14.N(this.Q.array(), i9);
                                                    cwjVar.c(bwbVar14, i9);
                                                    this.Y += i9;
                                                }
                                            }
                                        }
                                    }
                                } else if (i7 == 2) {
                                    if (this.ac) {
                                        bwbVar4 = this.e;
                                        if (jtmVar.j(bwbVar4.b, 0, 1)) {
                                            this.X++;
                                            bwbVar4.P(0);
                                            this.ad = bwbVar4.n();
                                            this.ac = true;
                                            i8 = this.ad << 2;
                                            bwbVar3 = this.e;
                                            bwbVar3.H(i8);
                                            if (jtmVar.j(bwbVar3.b, 0, i8)) {
                                                bwbVar3.P(0);
                                                bwbVar3.O(i8);
                                                this.X += i8;
                                                int i114 = (this.ad >> 1) + 1;
                                                i9 = (i114 * 6) + 2;
                                                byteBuffer = this.Q;
                                                if (byteBuffer != null) {
                                                    this.Q = ByteBuffer.allocate(i9);
                                                } else {
                                                    this.Q = ByteBuffer.allocate(i9);
                                                }
                                                this.Q.position(0);
                                                this.Q.putShort((short) i114);
                                                i10 = 0;
                                                i11 = 0;
                                                while (true) {
                                                    i12 = this.ad;
                                                    if (i10 < i12) {
                                                        break;
                                                        break;
                                                    }
                                                    int iQ7 = bwbVar3.q();
                                                    i15 = iQ7 - i11;
                                                    i16 = i10 % 2;
                                                    byteBuffer3 = this.Q;
                                                    if (i16 == 0) {
                                                        byteBuffer3.putShort((short) i15);
                                                    } else {
                                                        byteBuffer3.putInt(i15);
                                                    }
                                                    i10++;
                                                    i11 = iQ7;
                                                }
                                                i13 = (i - this.X) - i11;
                                                i14 = i12 & 1;
                                                byteBuffer2 = this.Q;
                                                if (i14 == 1) {
                                                    byteBuffer2.putInt(i13);
                                                } else {
                                                    byteBuffer2.putShort((short) i13);
                                                    this.Q.putInt(0);
                                                }
                                                bwb bwbVar15 = this.P;
                                                bwbVar15.N(this.Q.array(), i9);
                                                cwjVar.c(bwbVar15, i9);
                                                this.Y += i9;
                                            }
                                        }
                                    } else {
                                        i8 = this.ad << 2;
                                        bwbVar3 = this.e;
                                        bwbVar3.H(i8);
                                        if (jtmVar.j(bwbVar3.b, 0, i8)) {
                                            bwbVar3.P(0);
                                            bwbVar3.O(i8);
                                            this.X += i8;
                                            int i115 = (this.ad >> 1) + 1;
                                            i9 = (i115 * 6) + 2;
                                            byteBuffer = this.Q;
                                            if (byteBuffer != null) {
                                                this.Q = ByteBuffer.allocate(i9);
                                            } else {
                                                this.Q = ByteBuffer.allocate(i9);
                                            }
                                            this.Q.position(0);
                                            this.Q.putShort((short) i115);
                                            i10 = 0;
                                            i11 = 0;
                                            while (true) {
                                                i12 = this.ad;
                                                if (i10 < i12) {
                                                    break;
                                                    break;
                                                }
                                                int iQ8 = bwbVar3.q();
                                                i15 = iQ8 - i11;
                                                i16 = i10 % 2;
                                                byteBuffer3 = this.Q;
                                                if (i16 == 0) {
                                                    byteBuffer3.putShort((short) i15);
                                                } else {
                                                    byteBuffer3.putInt(i15);
                                                }
                                                i10++;
                                                i11 = iQ8;
                                            }
                                            i13 = (i - this.X) - i11;
                                            i14 = i12 & 1;
                                            byteBuffer2 = this.Q;
                                            if (i14 == 1) {
                                                byteBuffer2.putInt(i13);
                                            } else {
                                                byteBuffer2.putShort((short) i13);
                                                this.Q.putInt(0);
                                            }
                                            bwb bwbVar16 = this.P;
                                            bwbVar16.N(this.Q.array(), i9);
                                            cwjVar.c(bwbVar16, i9);
                                            this.Y += i9;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    byte[] bArr2 = jtpVar.h;
                    if (bArr2 != null) {
                        this.M.N(bArr2, bArr2.length);
                    }
                }
                if (jtpVar.f > 0) {
                    this.A |= 268435456;
                    this.g.L(0);
                    bwb bwbVar17 = this.e;
                    bwbVar17.L(4);
                    byte[] bArr3 = bwbVar17.b;
                    bArr3[0] = (byte) ((i >> 24) & 255);
                    bArr3[1] = (byte) ((i >> 16) & 255);
                    bArr3[2] = (byte) ((i >> 8) & 255);
                    bArr3[3] = (byte) (i & 255);
                    cwjVar.c(bwbVar17, 4);
                    this.Y += 4;
                }
                this.aa = true;
                bwbVar = this.M;
                int i20 = bwbVar.d;
                i2 = i + i20;
                str = jtpVar.b;
                if ("V_MPEG4/ISO/AVC".equals(str)) {
                }
                bwbVar2 = this.K;
                bArr = bwbVar2.b;
                i3 = jtpVar.X;
                i4 = 4 - i3;
                while (this.X < i2) {
                    i5 = this.Z;
                    if (i5 == 0) {
                        iMin = Math.min(i3, bwbVar.d());
                        if (jtmVar.j(bArr, i4 + iMin, i3 - iMin)) {
                            if (iMin > 0) {
                                bwbVar.K(bArr, i4, iMin);
                            }
                            this.X += i3;
                            bwbVar2.P(0);
                            this.Z = bwbVar2.q();
                            bwb bwbVar18 = this.J;
                            bwbVar18.P(0);
                            cwjVar.c(bwbVar18, 4);
                            this.Y += 4;
                        }
                    } else {
                        iT = t(jtmVar, cwjVar, i5);
                        if (iT != 0) {
                            this.X += iT;
                            this.Y += iT;
                            this.Z -= iT;
                        }
                    }
                }
                if ("A_VORBIS".equals(jtpVar.b)) {
                    bwb bwbVar19 = this.L;
                    bwbVar19.P(0);
                    cwjVar.c(bwbVar19, 4);
                    this.Y += 4;
                }
                return s();
            }
            bwbVar = this.M;
            int i21 = bwbVar.d;
            i2 = i + i21;
            str = jtpVar.b;
            if (!"V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str)) {
                bwbVar2 = this.K;
                bArr = bwbVar2.b;
                i3 = jtpVar.X;
                i4 = 4 - i3;
                while (this.X < i2) {
                    i5 = this.Z;
                    if (i5 == 0) {
                        iMin = Math.min(i3, bwbVar.d());
                        if (jtmVar.j(bArr, i4 + iMin, i3 - iMin)) {
                            if (iMin > 0) {
                                bwbVar.K(bArr, i4, iMin);
                            }
                            this.X += i3;
                            bwbVar2.P(0);
                            this.Z = bwbVar2.q();
                            bwb bwbVar110 = this.J;
                            bwbVar110.P(0);
                            cwjVar.c(bwbVar110, 4);
                            this.Y += 4;
                        }
                    } else {
                        iT = t(jtmVar, cwjVar, i5);
                        if (iT != 0) {
                            this.X += iT;
                            this.Y += iT;
                            this.Z -= iT;
                        }
                    }
                }
                if ("A_VORBIS".equals(jtpVar.b)) {
                    bwb bwbVar111 = this.L;
                    bwbVar111.P(0);
                    cwjVar.c(bwbVar111, 4);
                    this.Y += 4;
                }
                return s();
            }
            if (jtpVar.S == null) {
                while (true) {
                    i6 = this.X;
                    if (i6 >= i2) {
                        break;
                    }
                    iT2 = t(jtmVar, cwjVar, i2 - i6);
                    if (iT2 != 0) {
                        this.X += iT2;
                        this.Y += iT2;
                    }
                }
                if ("A_VORBIS".equals(jtpVar.b)) {
                    bwb bwbVar112 = this.L;
                    bwbVar112.P(0);
                    cwjVar.c(bwbVar112, 4);
                    this.Y += 4;
                }
                return s();
            }
            ahno.O(i21 == 0);
            jtq jtqVar = jtpVar.S;
            if (jtqVar.b) {
                while (true) {
                    i6 = this.X;
                    if (i6 >= i2) {
                        break;
                        break;
                    }
                    iT2 = t(jtmVar, cwjVar, i2 - i6);
                    if (iT2 != 0) {
                        this.X += iT2;
                        this.Y += iT2;
                    }
                }
                if ("A_VORBIS".equals(jtpVar.b)) {
                    bwb bwbVar113 = this.L;
                    bwbVar113.P(0);
                    cwjVar.c(bwbVar113, 4);
                    this.Y += 4;
                }
                return s();
            }
            byte[] bArr4 = jtqVar.a;
            if (jtmVar.l(bArr4, 10)) {
                jtmVar.h();
                if (cuo.b(bArr4) != 0) {
                    jtqVar.b = true;
                }
                while (true) {
                    i6 = this.X;
                    if (i6 >= i2) {
                        break;
                        break;
                    }
                    iT2 = t(jtmVar, cwjVar, i2 - i6);
                    if (iT2 != 0) {
                        this.X += iT2;
                        this.Y += iT2;
                    }
                }
                if ("A_VORBIS".equals(jtpVar.b)) {
                    bwb bwbVar114 = this.L;
                    bwbVar114.P(0);
                    cwjVar.c(bwbVar114, 4);
                    this.Y += 4;
                }
                return s();
            }
        } else if (v(jtmVar, H, i)) {
            return s();
        }
        return -6;
    }

    public final long k(long j) throws bsz {
        long j2 = this.j;
        if (j2 != -9223372036854775807L) {
            return bwp.C(j, j2, 1000L);
        }
        throw new bsz("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    public final void l(jtp jtpVar, long j, int i, int i2, int i3) {
        byte[] bArrW;
        int i4;
        int i5;
        boolean z;
        int i6 = i;
        jtq jtqVar = jtpVar.S;
        if (jtqVar != null) {
            if (jtqVar.b) {
                int i7 = jtqVar.c;
                int i8 = i7 + 1;
                jtqVar.c = i8;
                if (i7 == 0) {
                    jtqVar.d = j;
                    jtqVar.e = i6;
                    jtqVar.f = 0;
                }
                jtqVar.f += i2;
                jtqVar.g = i3;
                if (i8 >= 16) {
                    jtqVar.a(jtpVar);
                }
            }
            MediaParser.MediaParsersImplementation mediaParsersImplementation = this.D;
            if (mediaParsersImplementation != null) {
                mediaParsersImplementation.r(j, jtpVar.e / 1000);
            }
            z = true;
        } else {
            String str = jtpVar.b;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str)) {
                if (this.w > 1) {
                    bvx.e("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.u;
                    if (j2 != -9223372036854775807L) {
                        bwb bwbVar = this.N;
                        byte[] bArr = bwbVar.b;
                        int iHashCode = str.hashCode();
                        if (iHashCode == 738597099) {
                            if (str.equals("S_TEXT/ASS")) {
                                bArrW = w(j2, "%01d:%02d:%02d:%02d", 10000L);
                                i4 = 21;
                                System.arraycopy(bArrW, 0, bArr, i4, bArrW.length);
                                jtpVar.W.c(bwbVar, bwbVar.d);
                                i5 = i2 + bwbVar.d;
                            }
                            throw new IllegalArgumentException();
                        }
                        if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                            bArrW = w(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                            System.arraycopy(bArrW, 0, bArr, i4, bArrW.length);
                            jtpVar.W.c(bwbVar, bwbVar.d);
                            i5 = i2 + bwbVar.d;
                        }
                        throw new IllegalArgumentException();
                    }
                    bvx.e("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((268435456 & i6) != 0) {
                if (this.w > 1) {
                    i6 &= -268435457;
                } else {
                    bwb bwbVar2 = this.g;
                    int i9 = bwbVar2.d;
                    jtpVar.W.c(bwbVar2, i9);
                    i5 += i9;
                }
            }
            jtpVar.W.e(j, i6, i5, i3, jtpVar.i);
            MediaParser.MediaParsersImplementation mediaParsersImplementation2 = this.D;
            if (mediaParsersImplementation2 != null) {
                mediaParsersImplementation2.r(j, jtpVar.e / 1000);
            }
            z = true;
        }
        this.V = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:231:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:286:0x0534  */
    /* JADX WARN: Code duplicated, block: B:287:0x0536  */
    /* JADX WARN: Code duplicated, block: B:290:0x0544  */
    /* JADX WARN: Code duplicated, block: B:291:0x0551  */
    /* JADX WARN: Code duplicated, block: B:293:0x0557  */
    /* JADX WARN: Code duplicated, block: B:295:0x055b  */
    /* JADX WARN: Code duplicated, block: B:297:0x0560  */
    /* JADX WARN: Code duplicated, block: B:300:0x0568  */
    /* JADX WARN: Code duplicated, block: B:302:0x056d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0574  */
    /* JADX WARN: Code duplicated, block: B:308:0x0582  */
    /* JADX WARN: Code duplicated, block: B:311:0x0587  */
    /* JADX WARN: Code duplicated, block: B:313:0x058d  */
    /* JADX WARN: Code duplicated, block: B:332:0x0652  */
    /* JADX WARN: Code duplicated, block: B:334:0x066e  */
    /* JADX WARN: Code duplicated, block: B:337:0x0679  */
    /* JADX WARN: Code duplicated, block: B:338:0x067b  */
    /* JADX WARN: Code duplicated, block: B:340:0x0683  */
    /* JADX WARN: Code duplicated, block: B:341:0x0686  */
    /* JADX WARN: Code duplicated, block: B:343:0x068e  */
    /* JADX WARN: Code duplicated, block: B:344:0x0691  */
    /* JADX WARN: Code duplicated, block: B:346:0x0699  */
    /* JADX WARN: Code duplicated, block: B:347:0x069c  */
    /* JADX WARN: Code duplicated, block: B:350:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:367:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:369:0x0705  */
    /* JADX WARN: Code duplicated, block: B:371:0x070d  */
    /* JADX WARN: Code duplicated, block: B:373:0x0715  */
    /* JADX WARN: Code duplicated, block: B:374:0x0727  */
    /* JADX WARN: Code duplicated, block: B:376:0x072f  */
    protected void m(int i) {
        int i2;
        byte b2;
        List listSingletonList;
        List arrayList;
        List listB;
        int i3;
        String str;
        String str2;
        int i4;
        int i5;
        String str3;
        int iP;
        String str4;
        int i6;
        bsd bsdVar;
        int i7;
        int i8;
        float f;
        bru bruVar;
        String str5;
        int i9;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        cvz cvyVar;
        zh zhVar;
        int i13;
        zh zhVar2;
        int i14;
        int i15 = 0;
        if (i == 160) {
            if (this.s == 2) {
                int i16 = 0;
                for (int i17 = 0; i17 < this.w; i17++) {
                    i16 += this.x[i17];
                }
                jtp jtpVar = (jtp) this.d.get(this.y);
                int i18 = 0;
                while (i18 < this.w) {
                    long j = this.t + ((long) ((jtpVar.e * i18) / 1000));
                    int i19 = this.A;
                    if (i18 == 0) {
                        if (!this.C) {
                            i19 |= 1;
                        }
                        i2 = 0;
                    } else {
                        i2 = i18;
                    }
                    int i20 = this.x[i2];
                    int i21 = i16 - i20;
                    l(jtpVar, j, i19, i20, i21);
                    i18 = i2 + 1;
                    i16 = i21;
                }
                this.s = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                if (this.m == -1 || this.n == -1) {
                    throw new bsz("Mandatory element SeekID or SeekPosition not found", null, true, 1);
                }
                return;
            }
            if (i == 25152) {
                jtp jtpVar2 = this.l;
                if (jtpVar2.g) {
                    if (jtpVar2.i == null) {
                        throw new bsz("Encrypted Track found but ContentEncKeyID was not found", null, true, 1);
                    }
                    jtpVar2.k = new bsa(null, true, new brz(brt.a, null, "video/webm", this.l.i.b));
                    return;
                }
                return;
            }
            if (i == 28032) {
                jtp jtpVar3 = this.l;
                if (jtpVar3.g && jtpVar3.h != null) {
                    throw new bsz("Combining encryption and compression is not supported", null, true, 1);
                }
                return;
            }
            if (i == 357149030) {
                if (this.j == -9223372036854775807L) {
                    this.j = 1000000L;
                }
                long j2 = this.k;
                if (j2 != -9223372036854775807L) {
                    this.S = k(j2);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.d.size() == 0) {
                    throw new bsz("No valid tracks were found", null, true, 1);
                }
                this.ag.t();
                return;
            }
            if (i != 475249515 || this.T) {
                return;
            }
            cvk cvkVar = this.ag;
            if (this.i == -1 || this.S == -9223372036854775807L || (zhVar = this.E) == null || (i13 = zhVar.a) == 0 || (zhVar2 = this.F) == null || zhVar2.a != i13) {
                this.E = null;
                this.F = null;
                cvyVar = new cvy(this.S, 0L);
            } else {
                int[] iArrCopyOf = new int[i13];
                long[] jArrCopyOf = new long[i13];
                long[] jArrCopyOf2 = new long[i13];
                long[] jArrCopyOf3 = new long[i13];
                for (int i22 = 0; i22 < i13; i22++) {
                    jArrCopyOf3[i22] = this.E.a(i22);
                    jArrCopyOf[i22] = this.i + this.F.a(i22);
                }
                while (true) {
                    i14 = i13 - 1;
                    if (i15 >= i14) {
                        break;
                    }
                    int i23 = i15 + 1;
                    iArrCopyOf[i15] = (int) (jArrCopyOf[i23] - jArrCopyOf[i15]);
                    jArrCopyOf2[i15] = jArrCopyOf3[i23] - jArrCopyOf3[i15];
                    i15 = i23;
                }
                iArrCopyOf[i14] = (int) ((this.i + this.R) - jArrCopyOf[i14]);
                long j3 = this.S - jArrCopyOf3[i14];
                jArrCopyOf2[i14] = j3;
                if (j3 <= 0) {
                    bvx.e("MatroskaExtractor", a.bS(j3, "Discarding last cue point with unexpected duration: "));
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i14);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i14);
                    jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i14);
                }
                this.E = null;
                this.F = null;
                cvyVar = new cuz(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
            }
            cvkVar.z(cvyVar);
            this.T = true;
            return;
        }
        jtp jtpVar4 = this.l;
        String str6 = jtpVar4.b;
        if ("V_VP8".equals(str6) || "V_VP9".equals(str6) || "V_AV1".equals(str6) || "V_MPEG2".equals(str6) || "V_MPEG4/ISO/SP".equals(str6) || "V_MPEG4/ISO/ASP".equals(str6) || "V_MPEG4/ISO/AP".equals(str6) || "V_MPEG4/ISO/AVC".equals(str6) || "V_MPEGH/ISO/HEVC".equals(str6) || "V_MS/VFW/FOURCC".equals(str6) || "V_THEORA".equals(str6) || "A_OPUS".equals(str6) || "A_VORBIS".equals(str6) || "A_AAC".equals(str6) || "A_MPEG/L2".equals(str6) || "A_MPEG/L3".equals(str6) || "A_AC3".equals(str6) || "A_EAC3".equals(str6) || "A_TRUEHD".equals(str6) || "A_DTS".equals(str6) || "A_DTS/EXPRESS".equals(str6) || "A_DTS/LOSSLESS".equals(str6) || "A_FLAC".equals(str6) || "A_MS/ACM".equals(str6) || "A_PCM/INT/LIT".equals(str6) || "S_TEXT/UTF8".equals(str6) || "S_TEXT/ASS".equals(str6) || "S_VOBSUB".equals(str6) || "S_HDMV/PGS".equals(str6) || "S_DVBSUB".equals(str6)) {
            cvk cvkVar2 = this.ag;
            int i24 = jtpVar4.c;
            int i25 = 3;
            switch (str6) {
                case "V_MPEG4/ISO/AP":
                    b2 = 6;
                    break;
                case "V_MPEG4/ISO/SP":
                    b2 = 4;
                    break;
                case "A_MS/ACM":
                    b2 = 23;
                    break;
                case "A_TRUEHD":
                    b2 = 18;
                    break;
                case "A_VORBIS":
                    b2 = 11;
                    break;
                case "A_MPEG/L2":
                    b2 = 14;
                    break;
                case "A_MPEG/L3":
                    b2 = 15;
                    break;
                case "V_MS/VFW/FOURCC":
                    b2 = 9;
                    break;
                case "S_DVBSUB":
                    b2 = 29;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b2 = 5;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b2 = 7;
                    break;
                case "S_VOBSUB":
                    b2 = 27;
                    break;
                case "A_DTS/LOSSLESS":
                    b2 = 21;
                    break;
                case "A_AAC":
                    b2 = 13;
                    break;
                case "A_AC3":
                    b2 = 16;
                    break;
                case "A_DTS":
                    b2 = 19;
                    break;
                case "V_AV1":
                    b2 = 2;
                    break;
                case "V_VP8":
                    b2 = 0;
                    break;
                case "V_VP9":
                    b2 = 1;
                    break;
                case "S_HDMV/PGS":
                    b2 = 28;
                    break;
                case "V_THEORA":
                    b2 = 10;
                    break;
                case "A_DTS/EXPRESS":
                    b2 = 20;
                    break;
                case "A_PCM/INT/LIT":
                    b2 = 24;
                    break;
                case "S_TEXT/ASS":
                    b2 = 26;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b2 = 8;
                    break;
                case "S_TEXT/UTF8":
                    b2 = 25;
                    break;
                case "V_MPEG2":
                    b2 = 3;
                    break;
                case "A_EAC3":
                    b2 = 17;
                    break;
                case "A_FLAC":
                    b2 = 22;
                    break;
                case "A_OPUS":
                    b2 = 12;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            String str7 = "audio/x-unknown";
            switch (b2) {
                case 0:
                    str7 = "video/x-vnd.on2.vp8";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i26 = (z ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7 || (i10 = jtpVar4.p) == i7) {
                            f = -1.0f;
                        } else {
                            f = (jtpVar4.m * i8) / (jtpVar4.l * i10);
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f || jtpVar4.E == -1.0f || jtpVar4.F == -1.0f || jtpVar4.G == -1.0f || jtpVar4.H == -1.0f || jtpVar4.I == -1.0f || jtpVar4.J == -1.0f || jtpVar4.K == -1.0f || jtpVar4.L == -1.0f || jtpVar4.M == -1.0f) {
                                bArr = null;
                            } else {
                                byte[] bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder.put((byte) 0);
                                byteBufferOrder.putShort((short) ((jtpVar4.D * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((jtpVar4.E * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((jtpVar4.F * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((jtpVar4.G * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((jtpVar4.H * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((jtpVar4.I * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((jtpVar4.J * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((jtpVar4.K * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) (jtpVar4.L + 0.5f));
                                byteBufferOrder.putShort((short) (jtpVar4.M + 0.5f));
                                byteBufferOrder.putShort((short) jtpVar4.B);
                                byteBufferOrder.putShort((short) jtpVar4.C);
                                bArr = bArr2;
                            }
                            int i27 = jtpVar4.y;
                            int i28 = jtpVar4.A;
                            int i29 = jtpVar4.z;
                            int i30 = jtpVar4.n;
                            bruVar = new bru(i27, i28, i29, bArr, i30, i30);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0 || Float.compare(jtpVar4.s, 0.0f) != 0 || Float.compare(jtpVar4.t, 0.0f) != 0) {
                            i15 = i9;
                        } else if (Float.compare(jtpVar4.u, 0.0f) != 0) {
                            if (Float.compare(jtpVar4.t, 90.0f) == 0) {
                                i15 = 90;
                            } else if (Float.compare(jtpVar4.t, -180.0f) == 0 || Float.compare(jtpVar4.t, 180.0f) == 0) {
                                i15 = 180;
                            } else if (Float.compare(jtpVar4.t, -90.0f) == 0) {
                                i15 = 270;
                            } else {
                                i15 = i9;
                            }
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2) && !"application/pgs".equals(str2) && !"application/dvbsubs".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i26;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar);
                    SparseArray sparseArray = this.d;
                    jtp jtpVar5 = this.l;
                    sparseArray.put(jtpVar5.c, jtpVar5);
                    break;
                case 1:
                    str7 = "video/x-vnd.on2.vp9";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z2 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i210 = (z2 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i211 = jtpVar4.y;
                            int i212 = jtpVar4.A;
                            int i213 = jtpVar4.z;
                            int i31 = jtpVar4.n;
                            bruVar = new bru(i211, i212, i213, bArr, i31, i31);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i210;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar2 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar2);
                    SparseArray sparseArray2 = this.d;
                    jtp jtpVar6 = this.l;
                    sparseArray2.put(jtpVar6.c, jtpVar6);
                    break;
                case 2:
                    str7 = "video/av01";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z3 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i214 = (z3 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i215 = jtpVar4.y;
                            int i216 = jtpVar4.A;
                            int i217 = jtpVar4.z;
                            int i32 = jtpVar4.n;
                            bruVar = new bru(i215, i216, i217, bArr, i32, i32);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i214;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar3 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar3);
                    SparseArray sparseArray3 = this.d;
                    jtp jtpVar7 = this.l;
                    sparseArray3.put(jtpVar7.c, jtpVar7);
                    break;
                case 3:
                    str7 = "video/mpeg2";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z4 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i218 = (z4 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i219 = jtpVar4.y;
                            int i2110 = jtpVar4.A;
                            int i2111 = jtpVar4.z;
                            int i33 = jtpVar4.n;
                            bruVar = new bru(i219, i2110, i2111, bArr, i33, i33);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i218;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar4 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar4);
                    SparseArray sparseArray4 = this.d;
                    jtp jtpVar8 = this.l;
                    sparseArray4.put(jtpVar8.c, jtpVar8);
                    break;
                case 4:
                case 5:
                case 6:
                    byte[] bArr3 = jtpVar4.j;
                    listSingletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                    str7 = "video/mp4v-es";
                    arrayList = listSingletonList;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z5 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i2112 = (z5 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i2113 = jtpVar4.y;
                            int i2114 = jtpVar4.A;
                            int i2115 = jtpVar4.z;
                            int i34 = jtpVar4.n;
                            bruVar = new bru(i2113, i2114, i2115, bArr, i34, i34);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i2112;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar5 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar5);
                    SparseArray sparseArray5 = this.d;
                    jtp jtpVar9 = this.l;
                    sparseArray5.put(jtpVar9.c, jtpVar9);
                    break;
                case 7:
                    cur curVarA = cur.a(new bwb(jtpVar4.j));
                    arrayList = curVarA.a;
                    jtpVar4.X = curVarA.b;
                    str7 = "video/avc";
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z6 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i2116 = (z6 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i2117 = jtpVar4.y;
                            int i2118 = jtpVar4.A;
                            int i2119 = jtpVar4.z;
                            int i35 = jtpVar4.n;
                            bruVar = new bru(i2117, i2118, i2119, bArr, i35, i35);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i2116;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar6 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar6);
                    SparseArray sparseArray6 = this.d;
                    jtp jtpVar10 = this.l;
                    sparseArray6.put(jtpVar10.c, jtpVar10);
                    break;
                case 8:
                    cvs cvsVarA = cvs.a(new bwb(jtpVar4.j), false, null);
                    arrayList = cvsVarA.a;
                    jtpVar4.X = cvsVarA.b;
                    str7 = "video/hevc";
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z7 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i21110 = (z7 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i21111 = jtpVar4.y;
                            int i21112 = jtpVar4.A;
                            int i21113 = jtpVar4.z;
                            int i36 = jtpVar4.n;
                            bruVar = new bru(i21111, i21112, i21113, bArr, i36, i36);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i21110;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar7 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar7);
                    SparseArray sparseArray7 = this.d;
                    jtp jtpVar11 = this.l;
                    sparseArray7.put(jtpVar11.c, jtpVar11);
                    break;
                case 9:
                    Pair pairA = jtp.a(new bwb(jtpVar4.j));
                    str7 = (String) pairA.first;
                    listSingletonList = (List) pairA.second;
                    arrayList = listSingletonList;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z8 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i21114 = (z8 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i21115 = jtpVar4.y;
                            int i21116 = jtpVar4.A;
                            int i21117 = jtpVar4.z;
                            int i37 = jtpVar4.n;
                            bruVar = new bru(i21115, i21116, i21117, bArr, i37, i37);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i21114;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar8 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar8);
                    SparseArray sparseArray8 = this.d;
                    jtp jtpVar12 = this.l;
                    sparseArray8.put(jtpVar12.c, jtpVar12);
                    break;
                case 10:
                    str7 = "video/x-unknown";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z9 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i21118 = (z9 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i21119 = jtpVar4.y;
                            int i211110 = jtpVar4.A;
                            int i211111 = jtpVar4.z;
                            int i38 = jtpVar4.n;
                            bruVar = new bru(i21119, i211110, i211111, bArr, i38, i38);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i21118;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar9 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar9);
                    SparseArray sparseArray9 = this.d;
                    jtp jtpVar13 = this.l;
                    sparseArray9.put(jtpVar13.c, jtpVar13);
                    break;
                case 11:
                    listB = jtp.b(jtpVar4.j);
                    i3 = SemanticState.Multiline;
                    str = "audio/vorbis";
                    str2 = str;
                    i4 = i3;
                    arrayList = listB;
                    iP = -1;
                    boolean z10 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i211112 = (z10 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i211113 = jtpVar4.y;
                            int i211114 = jtpVar4.A;
                            int i211115 = jtpVar4.z;
                            int i39 = jtpVar4.n;
                            bruVar = new bru(i211113, i211114, i211115, bArr, i39, i39);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i211112;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar10 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar10);
                    SparseArray sparseArray10 = this.d;
                    jtp jtpVar14 = this.l;
                    sparseArray10.put(jtpVar14.c, jtpVar14);
                    break;
                case 12:
                    listB = new ArrayList(3);
                    listB.add(jtpVar4.j);
                    listB.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(jtpVar4.Q).array());
                    listB.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(jtpVar4.R).array());
                    i3 = 5760;
                    str = "audio/opus";
                    str2 = str;
                    i4 = i3;
                    arrayList = listB;
                    iP = -1;
                    boolean z11 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i211116 = (z11 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i211117 = jtpVar4.y;
                            int i211118 = jtpVar4.A;
                            int i211119 = jtpVar4.z;
                            int i310 = jtpVar4.n;
                            bruVar = new bru(i211117, i211118, i211119, bArr, i310, i310);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i211116;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar11 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar11);
                    SparseArray sparseArray11 = this.d;
                    jtp jtpVar15 = this.l;
                    sparseArray11.put(jtpVar15.c, jtpVar15);
                    break;
                case 13:
                    listSingletonList = Collections.singletonList(jtpVar4.j);
                    str7 = "audio/mp4a-latm";
                    arrayList = listSingletonList;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z12 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i2111110 = (z12 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i2111111 = jtpVar4.y;
                            int i2111112 = jtpVar4.A;
                            int i2111113 = jtpVar4.z;
                            int i311 = jtpVar4.n;
                            bruVar = new bru(i2111111, i2111112, i2111113, bArr, i311, i311);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i2111110;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar12 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar12);
                    SparseArray sparseArray12 = this.d;
                    jtp jtpVar16 = this.l;
                    sparseArray12.put(jtpVar16.c, jtpVar16);
                    break;
                case 14:
                    i5 = SemanticState.Obscured;
                    str3 = "audio/mpeg-L2";
                    arrayList = null;
                    str2 = str3;
                    i4 = i5;
                    iP = -1;
                    boolean z13 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i2111114 = (z13 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i2111115 = jtpVar4.y;
                            int i2111116 = jtpVar4.A;
                            int i2111117 = jtpVar4.z;
                            int i312 = jtpVar4.n;
                            bruVar = new bru(i2111115, i2111116, i2111117, bArr, i312, i312);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i2111114;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar13 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar13);
                    SparseArray sparseArray13 = this.d;
                    jtp jtpVar17 = this.l;
                    sparseArray13.put(jtpVar17.c, jtpVar17);
                    break;
                case 15:
                    i5 = SemanticState.Obscured;
                    str3 = "audio/mpeg";
                    arrayList = null;
                    str2 = str3;
                    i4 = i5;
                    iP = -1;
                    boolean z14 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i2111118 = (z14 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i2111119 = jtpVar4.y;
                            int i21111110 = jtpVar4.A;
                            int i21111111 = jtpVar4.z;
                            int i313 = jtpVar4.n;
                            bruVar = new bru(i2111119, i21111110, i21111111, bArr, i313, i313);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i2111118;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar14 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar14);
                    SparseArray sparseArray14 = this.d;
                    jtp jtpVar18 = this.l;
                    sparseArray14.put(jtpVar18.c, jtpVar18);
                    break;
                case 16:
                    str7 = "audio/ac3";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z15 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i21111112 = (z15 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i21111113 = jtpVar4.y;
                            int i21111114 = jtpVar4.A;
                            int i21111115 = jtpVar4.z;
                            int i314 = jtpVar4.n;
                            bruVar = new bru(i21111113, i21111114, i21111115, bArr, i314, i314);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i21111112;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar15 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar15);
                    SparseArray sparseArray15 = this.d;
                    jtp jtpVar19 = this.l;
                    sparseArray15.put(jtpVar19.c, jtpVar19);
                    break;
                case 17:
                    str7 = "audio/eac3";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z16 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i21111116 = (z16 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i21111117 = jtpVar4.y;
                            int i21111118 = jtpVar4.A;
                            int i21111119 = jtpVar4.z;
                            int i315 = jtpVar4.n;
                            bruVar = new bru(i21111117, i21111118, i21111119, bArr, i315, i315);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i21111116;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar16 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar16);
                    SparseArray sparseArray16 = this.d;
                    jtp jtpVar110 = this.l;
                    sparseArray16.put(jtpVar110.c, jtpVar110);
                    break;
                case 18:
                    jtpVar4.S = new jtq();
                    str7 = "audio/true-hd";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z17 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i211111110 = (z17 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i211111111 = jtpVar4.y;
                            int i211111112 = jtpVar4.A;
                            int i211111113 = jtpVar4.z;
                            int i316 = jtpVar4.n;
                            bruVar = new bru(i211111111, i211111112, i211111113, bArr, i316, i316);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i211111110;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar17 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar17);
                    SparseArray sparseArray17 = this.d;
                    jtp jtpVar111 = this.l;
                    sparseArray17.put(jtpVar111.c, jtpVar111);
                    break;
                case 19:
                case 20:
                    str7 = "audio/vnd.dts";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z18 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i211111114 = (z18 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i211111115 = jtpVar4.y;
                            int i211111116 = jtpVar4.A;
                            int i211111117 = jtpVar4.z;
                            int i317 = jtpVar4.n;
                            bruVar = new bru(i211111115, i211111116, i211111117, bArr, i317, i317);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i211111114;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar18 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar18);
                    SparseArray sparseArray18 = this.d;
                    jtp jtpVar112 = this.l;
                    sparseArray18.put(jtpVar112.c, jtpVar112);
                    break;
                case 21:
                    str7 = "audio/vnd.dts.hd";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z19 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i211111118 = (z19 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i211111119 = jtpVar4.y;
                            int i2111111110 = jtpVar4.A;
                            int i2111111111 = jtpVar4.z;
                            int i318 = jtpVar4.n;
                            bruVar = new bru(i211111119, i2111111110, i2111111111, bArr, i318, i318);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i211111118;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar19 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar19);
                    SparseArray sparseArray19 = this.d;
                    jtp jtpVar113 = this.l;
                    sparseArray19.put(jtpVar113.c, jtpVar113);
                    break;
                case 22:
                    listSingletonList = Collections.singletonList(jtpVar4.j);
                    str7 = "audio/flac";
                    arrayList = listSingletonList;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z110 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i2111111112 = (z110 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i2111111113 = jtpVar4.y;
                            int i2111111114 = jtpVar4.A;
                            int i2111111115 = jtpVar4.z;
                            int i319 = jtpVar4.n;
                            bruVar = new bru(i2111111113, i2111111114, i2111111115, bArr, i319, i319);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i2111111112;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar110 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar110);
                    SparseArray sparseArray110 = this.d;
                    jtp jtpVar114 = this.l;
                    sparseArray110.put(jtpVar114.c, jtpVar114);
                    break;
                case 23:
                    if (jtp.d(new bwb(jtpVar4.j))) {
                        iP = bwp.p(jtpVar4.O);
                        if (iP != 0) {
                            str4 = "audio/raw";
                            arrayList = null;
                            str2 = str4;
                            i4 = -1;
                            boolean z111 = jtpVar4.U;
                            if (true != jtpVar4.T) {
                                i6 = 0;
                            } else {
                                i6 = 2;
                            }
                            int i2111111116 = (z111 ? 1 : 0) | i6;
                            bsdVar = new bsd();
                            if (bsy.i(str2)) {
                                bsdVar.G = jtpVar4.N;
                                bsdVar.I = jtpVar4.P;
                                bsdVar.J = iP;
                                i25 = 1;
                            } else if (bsy.n(str2)) {
                                if (jtpVar4.q == 0) {
                                    i11 = jtpVar4.o;
                                    i7 = -1;
                                    if (i11 == -1) {
                                        i11 = jtpVar4.l;
                                    }
                                    jtpVar4.o = i11;
                                    i12 = jtpVar4.p;
                                    if (i12 == -1) {
                                        i12 = jtpVar4.m;
                                    }
                                    jtpVar4.p = i12;
                                } else {
                                    i7 = -1;
                                }
                                i8 = jtpVar4.o;
                                if (i8 != i7) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (jtpVar4.x) {
                                    if (jtpVar4.D != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    int i2111111117 = jtpVar4.y;
                                    int i2111111118 = jtpVar4.A;
                                    int i2111111119 = jtpVar4.z;
                                    int i3110 = jtpVar4.n;
                                    bruVar = new bru(i2111111117, i2111111118, i2111111119, bArr, i3110, i3110);
                                } else {
                                    bruVar = null;
                                }
                                str5 = jtpVar4.a;
                                if ("htc_video_rotA-000".equals(str5)) {
                                    i9 = 0;
                                } else if ("htc_video_rotA-090".equals(str5)) {
                                    i9 = 90;
                                } else if ("htc_video_rotA-180".equals(str5)) {
                                    i9 = 180;
                                } else if ("htc_video_rotA-270".equals(str5)) {
                                    i9 = 270;
                                } else {
                                    i9 = -1;
                                }
                                if (jtpVar4.r == 0) {
                                    i15 = i9;
                                } else {
                                    i15 = i9;
                                }
                                bsdVar.u = jtpVar4.l;
                                bsdVar.v = jtpVar4.m;
                                bsdVar.B = f;
                                bsdVar.z = i15;
                                bsdVar.C = jtpVar4.v;
                                bsdVar.D = jtpVar4.w;
                                bsdVar.E = bruVar;
                                i25 = 2;
                            } else if (!"application/x-subrip".equals(str2)) {
                                if ("text/x-ssa".equals(str2)) {
                                    arrayList = new ArrayList(2);
                                    arrayList.add(a);
                                    arrayList.add(jtpVar4.j);
                                } else if (!"application/vobsub".equals(str2)) {
                                    throw new bsz("Unexpected MIME type.", null, true, 1);
                                }
                            }
                            bsdVar.c(i24);
                            bsdVar.e(str2);
                            bsdVar.p = i4;
                            bsdVar.d = jtpVar4.V;
                            bsdVar.e = i2111111116;
                            bsdVar.r = arrayList;
                            bsdVar.s = jtpVar4.k;
                            bse bseVar111 = new bse(bsdVar);
                            jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                            jtpVar4.W.b(bseVar111);
                            SparseArray sparseArray111 = this.d;
                            jtp jtpVar115 = this.l;
                            sparseArray111.put(jtpVar115.c, jtpVar115);
                        } else {
                            bvx.e("MatroskaExtractor", "Unsupported PCM bit depth: " + jtpVar4.O + ". Setting mimeType to audio/x-unknown");
                        }
                    } else {
                        bvx.e("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    }
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z112 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i21111111110 = (z112 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i21111111111 = jtpVar4.y;
                            int i21111111112 = jtpVar4.A;
                            int i21111111113 = jtpVar4.z;
                            int i3111 = jtpVar4.n;
                            bruVar = new bru(i21111111111, i21111111112, i21111111113, bArr, i3111, i3111);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i21111111110;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar112 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar112);
                    SparseArray sparseArray112 = this.d;
                    jtp jtpVar116 = this.l;
                    sparseArray112.put(jtpVar116.c, jtpVar116);
                    break;
                case 24:
                    iP = bwp.p(jtpVar4.O);
                    if (iP == 0) {
                        bvx.e("MatroskaExtractor", "Unsupported PCM bit depth: " + jtpVar4.O + ". Setting mimeType to audio/x-unknown");
                        arrayList = null;
                        str2 = str7;
                        iP = -1;
                        i4 = -1;
                        boolean z113 = jtpVar4.U;
                        if (true != jtpVar4.T) {
                            i6 = 0;
                        } else {
                            i6 = 2;
                        }
                        int i21111111114 = (z113 ? 1 : 0) | i6;
                        bsdVar = new bsd();
                        if (bsy.i(str2)) {
                            bsdVar.G = jtpVar4.N;
                            bsdVar.I = jtpVar4.P;
                            bsdVar.J = iP;
                            i25 = 1;
                        } else if (bsy.n(str2)) {
                            if (jtpVar4.q == 0) {
                                i11 = jtpVar4.o;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = jtpVar4.l;
                                }
                                jtpVar4.o = i11;
                                i12 = jtpVar4.p;
                                if (i12 == -1) {
                                    i12 = jtpVar4.m;
                                }
                                jtpVar4.p = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = jtpVar4.o;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (jtpVar4.x) {
                                if (jtpVar4.D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                int i21111111115 = jtpVar4.y;
                                int i21111111116 = jtpVar4.A;
                                int i21111111117 = jtpVar4.z;
                                int i3112 = jtpVar4.n;
                                bruVar = new bru(i21111111115, i21111111116, i21111111117, bArr, i3112, i3112);
                            } else {
                                bruVar = null;
                            }
                            str5 = jtpVar4.a;
                            if ("htc_video_rotA-000".equals(str5)) {
                                i9 = 0;
                            } else if ("htc_video_rotA-090".equals(str5)) {
                                i9 = 90;
                            } else if ("htc_video_rotA-180".equals(str5)) {
                                i9 = 180;
                            } else if ("htc_video_rotA-270".equals(str5)) {
                                i9 = 270;
                            } else {
                                i9 = -1;
                            }
                            if (jtpVar4.r == 0) {
                                i15 = i9;
                            } else {
                                i15 = i9;
                            }
                            bsdVar.u = jtpVar4.l;
                            bsdVar.v = jtpVar4.m;
                            bsdVar.B = f;
                            bsdVar.z = i15;
                            bsdVar.C = jtpVar4.v;
                            bsdVar.D = jtpVar4.w;
                            bsdVar.E = bruVar;
                            i25 = 2;
                        } else if (!"application/x-subrip".equals(str2)) {
                            if ("text/x-ssa".equals(str2)) {
                                arrayList = new ArrayList(2);
                                arrayList.add(a);
                                arrayList.add(jtpVar4.j);
                            } else if (!"application/vobsub".equals(str2)) {
                                throw new bsz("Unexpected MIME type.", null, true, 1);
                            }
                        }
                        bsdVar.c(i24);
                        bsdVar.e(str2);
                        bsdVar.p = i4;
                        bsdVar.d = jtpVar4.V;
                        bsdVar.e = i21111111114;
                        bsdVar.r = arrayList;
                        bsdVar.s = jtpVar4.k;
                        bse bseVar113 = new bse(bsdVar);
                        jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                        jtpVar4.W.b(bseVar113);
                        SparseArray sparseArray113 = this.d;
                        jtp jtpVar117 = this.l;
                        sparseArray113.put(jtpVar117.c, jtpVar117);
                    } else {
                        str4 = "audio/raw";
                        arrayList = null;
                        str2 = str4;
                        i4 = -1;
                        boolean z114 = jtpVar4.U;
                        if (true != jtpVar4.T) {
                            i6 = 0;
                        } else {
                            i6 = 2;
                        }
                        int i21111111118 = (z114 ? 1 : 0) | i6;
                        bsdVar = new bsd();
                        if (bsy.i(str2)) {
                            bsdVar.G = jtpVar4.N;
                            bsdVar.I = jtpVar4.P;
                            bsdVar.J = iP;
                            i25 = 1;
                        } else if (bsy.n(str2)) {
                            if (jtpVar4.q == 0) {
                                i11 = jtpVar4.o;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = jtpVar4.l;
                                }
                                jtpVar4.o = i11;
                                i12 = jtpVar4.p;
                                if (i12 == -1) {
                                    i12 = jtpVar4.m;
                                }
                                jtpVar4.p = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = jtpVar4.o;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (jtpVar4.x) {
                                if (jtpVar4.D != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                int i21111111119 = jtpVar4.y;
                                int i211111111110 = jtpVar4.A;
                                int i211111111111 = jtpVar4.z;
                                int i3113 = jtpVar4.n;
                                bruVar = new bru(i21111111119, i211111111110, i211111111111, bArr, i3113, i3113);
                            } else {
                                bruVar = null;
                            }
                            str5 = jtpVar4.a;
                            if ("htc_video_rotA-000".equals(str5)) {
                                i9 = 0;
                            } else if ("htc_video_rotA-090".equals(str5)) {
                                i9 = 90;
                            } else if ("htc_video_rotA-180".equals(str5)) {
                                i9 = 180;
                            } else if ("htc_video_rotA-270".equals(str5)) {
                                i9 = 270;
                            } else {
                                i9 = -1;
                            }
                            if (jtpVar4.r == 0) {
                                i15 = i9;
                            } else {
                                i15 = i9;
                            }
                            bsdVar.u = jtpVar4.l;
                            bsdVar.v = jtpVar4.m;
                            bsdVar.B = f;
                            bsdVar.z = i15;
                            bsdVar.C = jtpVar4.v;
                            bsdVar.D = jtpVar4.w;
                            bsdVar.E = bruVar;
                            i25 = 2;
                        } else if (!"application/x-subrip".equals(str2)) {
                            if ("text/x-ssa".equals(str2)) {
                                arrayList = new ArrayList(2);
                                arrayList.add(a);
                                arrayList.add(jtpVar4.j);
                            } else if (!"application/vobsub".equals(str2)) {
                                throw new bsz("Unexpected MIME type.", null, true, 1);
                            }
                        }
                        bsdVar.c(i24);
                        bsdVar.e(str2);
                        bsdVar.p = i4;
                        bsdVar.d = jtpVar4.V;
                        bsdVar.e = i21111111118;
                        bsdVar.r = arrayList;
                        bsdVar.s = jtpVar4.k;
                        bse bseVar114 = new bse(bsdVar);
                        jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                        jtpVar4.W.b(bseVar114);
                        SparseArray sparseArray114 = this.d;
                        jtp jtpVar118 = this.l;
                        sparseArray114.put(jtpVar118.c, jtpVar118);
                    }
                    break;
                case 25:
                    str7 = "application/x-subrip";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z115 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i211111111112 = (z115 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i211111111113 = jtpVar4.y;
                            int i211111111114 = jtpVar4.A;
                            int i211111111115 = jtpVar4.z;
                            int i3114 = jtpVar4.n;
                            bruVar = new bru(i211111111113, i211111111114, i211111111115, bArr, i3114, i3114);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i211111111112;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar115 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar115);
                    SparseArray sparseArray115 = this.d;
                    jtp jtpVar119 = this.l;
                    sparseArray115.put(jtpVar119.c, jtpVar119);
                    break;
                case 26:
                    str7 = "text/x-ssa";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z116 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i211111111116 = (z116 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i211111111117 = jtpVar4.y;
                            int i211111111118 = jtpVar4.A;
                            int i211111111119 = jtpVar4.z;
                            int i3115 = jtpVar4.n;
                            bruVar = new bru(i211111111117, i211111111118, i211111111119, bArr, i3115, i3115);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i211111111116;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar116 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar116);
                    SparseArray sparseArray116 = this.d;
                    jtp jtpVar1110 = this.l;
                    sparseArray116.put(jtpVar1110.c, jtpVar1110);
                    break;
                case 27:
                    listSingletonList = Collections.singletonList(jtpVar4.j);
                    str7 = "application/vobsub";
                    arrayList = listSingletonList;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z117 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i2111111111110 = (z117 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i2111111111111 = jtpVar4.y;
                            int i2111111111112 = jtpVar4.A;
                            int i2111111111113 = jtpVar4.z;
                            int i3116 = jtpVar4.n;
                            bruVar = new bru(i2111111111111, i2111111111112, i2111111111113, bArr, i3116, i3116);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i2111111111110;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar117 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar117);
                    SparseArray sparseArray117 = this.d;
                    jtp jtpVar1111 = this.l;
                    sparseArray117.put(jtpVar1111.c, jtpVar1111);
                    break;
                case 28:
                    str7 = "application/pgs";
                    arrayList = null;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z118 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i2111111111114 = (z118 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i2111111111115 = jtpVar4.y;
                            int i2111111111116 = jtpVar4.A;
                            int i2111111111117 = jtpVar4.z;
                            int i3117 = jtpVar4.n;
                            bruVar = new bru(i2111111111115, i2111111111116, i2111111111117, bArr, i3117, i3117);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i2111111111114;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar118 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar118);
                    SparseArray sparseArray118 = this.d;
                    jtp jtpVar1112 = this.l;
                    sparseArray118.put(jtpVar1112.c, jtpVar1112);
                    break;
                case 29:
                    byte[] bArr4 = jtpVar4.j;
                    listSingletonList = Collections.singletonList(new byte[]{bArr4[0], bArr4[1], bArr4[2], bArr4[3]});
                    str7 = "application/dvbsubs";
                    arrayList = listSingletonList;
                    str2 = str7;
                    iP = -1;
                    i4 = -1;
                    boolean z119 = jtpVar4.U;
                    if (true != jtpVar4.T) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    int i2111111111118 = (z119 ? 1 : 0) | i6;
                    bsdVar = new bsd();
                    if (bsy.i(str2)) {
                        bsdVar.G = jtpVar4.N;
                        bsdVar.I = jtpVar4.P;
                        bsdVar.J = iP;
                        i25 = 1;
                    } else if (bsy.n(str2)) {
                        if (jtpVar4.q == 0) {
                            i11 = jtpVar4.o;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = jtpVar4.l;
                            }
                            jtpVar4.o = i11;
                            i12 = jtpVar4.p;
                            if (i12 == -1) {
                                i12 = jtpVar4.m;
                            }
                            jtpVar4.p = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = jtpVar4.o;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (jtpVar4.x) {
                            if (jtpVar4.D != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            int i2111111111119 = jtpVar4.y;
                            int i21111111111110 = jtpVar4.A;
                            int i21111111111111 = jtpVar4.z;
                            int i3118 = jtpVar4.n;
                            bruVar = new bru(i2111111111119, i21111111111110, i21111111111111, bArr, i3118, i3118);
                        } else {
                            bruVar = null;
                        }
                        str5 = jtpVar4.a;
                        if ("htc_video_rotA-000".equals(str5)) {
                            i9 = 0;
                        } else if ("htc_video_rotA-090".equals(str5)) {
                            i9 = 90;
                        } else if ("htc_video_rotA-180".equals(str5)) {
                            i9 = 180;
                        } else if ("htc_video_rotA-270".equals(str5)) {
                            i9 = 270;
                        } else {
                            i9 = -1;
                        }
                        if (jtpVar4.r == 0) {
                            i15 = i9;
                        } else {
                            i15 = i9;
                        }
                        bsdVar.u = jtpVar4.l;
                        bsdVar.v = jtpVar4.m;
                        bsdVar.B = f;
                        bsdVar.z = i15;
                        bsdVar.C = jtpVar4.v;
                        bsdVar.D = jtpVar4.w;
                        bsdVar.E = bruVar;
                        i25 = 2;
                    } else if (!"application/x-subrip".equals(str2)) {
                        if ("text/x-ssa".equals(str2)) {
                            arrayList = new ArrayList(2);
                            arrayList.add(a);
                            arrayList.add(jtpVar4.j);
                        } else if (!"application/vobsub".equals(str2)) {
                            throw new bsz("Unexpected MIME type.", null, true, 1);
                        }
                    }
                    bsdVar.c(i24);
                    bsdVar.e(str2);
                    bsdVar.p = i4;
                    bsdVar.d = jtpVar4.V;
                    bsdVar.e = i2111111111118;
                    bsdVar.r = arrayList;
                    bsdVar.s = jtpVar4.k;
                    bse bseVar119 = new bse(bsdVar);
                    jtpVar4.W = cvkVar2.s(jtpVar4.c, i25);
                    jtpVar4.W.b(bseVar119);
                    SparseArray sparseArray119 = this.d;
                    jtp jtpVar1113 = this.l;
                    sparseArray119.put(jtpVar1113.c, jtpVar1113);
                    break;
                default:
                    throw new bsz("Unrecognized codec identifier.", null, false, 1);
            }
        }
        this.l = null;
    }

    protected void n(int i, long j, long j2) {
        if (i == 160) {
            this.C = false;
            return;
        }
        if (i == 174) {
            this.l = new jtp();
            return;
        }
        if (i == 187) {
            this.p = false;
            return;
        }
        if (i == 19899) {
            this.m = -1;
            this.n = -1L;
            return;
        }
        if (i == 20533) {
            this.l.g = true;
            return;
        }
        if (i == 21968) {
            this.l.x = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.i;
            if (j3 != -1 && j3 != j) {
                throw new bsz("Multiple Segment elements not supported", null, false, 1);
            }
            this.i = j;
            this.R = j2;
            return;
        }
        if (i == 475249515) {
            this.E = new zh(32);
            this.F = new zh(32);
        } else {
            if (i != 524531317 || this.T) {
                return;
            }
            this.ag.z(new cvy(this.S, 0L));
            this.T = true;
        }
    }

    protected void o(int i, String str) {
        if (i == 134) {
            this.l.b = str;
            return;
        }
        if (i == 17026) {
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw new bsz(a.bT(str, "DocType ", " not supported"), null, false, 1);
            }
        } else if (i == 21358) {
            this.l.a = str;
        } else if (i == 2274716) {
            this.l.V = str;
        }
    }

    public final boolean p(jtm jtmVar, int i) {
        if (this.W == 0) {
            this.h = new byte[i];
            this.W = 1;
        }
        if (!jtmVar.j(this.h, 0, i)) {
            return false;
        }
        this.W = 0;
        return true;
    }

    public final boolean q(jtm jtmVar, int i) {
        bwb bwbVar = this.e;
        if (bwbVar.d >= i) {
            return true;
        }
        if (bwbVar.e() < i) {
            byte[] bArr = bwbVar.b;
            bwbVar.N(Arrays.copyOf(bArr, Math.max(bArr.length << 1, i)), bwbVar.d);
        }
        byte[] bArr2 = bwbVar.b;
        int i2 = bwbVar.d;
        if (!jtmVar.j(bArr2, i2, i - i2)) {
            return false;
        }
        bwbVar.O(i);
        return true;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
