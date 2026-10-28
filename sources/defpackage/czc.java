package defpackage;

import android.util.LongSparseArray;
import android.util.SparseArray;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class czc implements cvi {
    public static final Map c;
    private final boolean A;
    private final dbl B;
    private final bwb C;
    private final bwb D;
    private final bwb E;
    private final bwb F;
    private final bwb G;
    private final bwb H;
    private final bwb I;
    private final bwb J;
    private final bwb K;
    private final bwb L;
    private ByteBuffer M;
    private long N;
    private long O;
    private boolean P;
    private boolean Q;
    private final ArrayDeque R;
    private int S;
    private final SparseArray T;
    private boolean U;
    private int V;
    private boolean W;
    private long X;
    private long Y;
    private long Z;
    private boolean aa;
    private long ab;
    private boolean ac;
    private boolean ad;
    private int ae;
    private long af;
    private int ag;
    private int ah;
    private int[] ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private int as;
    private byte at;
    private boolean au;
    private cvk av;
    private final cyx aw;
    public long d;
    public long e;
    public long f;
    public czb g;
    public boolean h;
    public long i;
    public long j;
    public int k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public boolean q;
    public long r;
    private final czd v;
    private final SparseArray w;
    private final LongSparseArray x;
    private final boolean y;
    private final boolean z;
    private static final byte[] s = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a = bwp.ah("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] t = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] u = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        c = DesugarCollections.unmodifiableMap(map);
    }

    public czc(cyx cyxVar, int i, dbl dblVar) {
        this.d = -1L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.k = -1;
        this.l = -1L;
        this.m = -1L;
        this.V = -1;
        this.X = -1L;
        this.Y = -1L;
        this.Z = -1L;
        this.ab = -1L;
        this.n = -9223372036854775807L;
        this.aw = cyxVar;
        cyxVar.g = new qcb(this);
        this.B = dblVar;
        this.T = new SparseArray();
        this.y = 1 == ((i & 1) ^ 1);
        this.A = (i & 2) == 0;
        this.z = true;
        this.v = new czd();
        this.x = new LongSparseArray();
        this.R = new ArrayDeque();
        this.w = new SparseArray();
        this.E = new bwb(4);
        this.F = new bwb(ByteBuffer.allocate(4).putInt(-1).array());
        this.G = new bwb(4);
        this.C = new bwb(bxf.a);
        this.D = new bwb(4);
        this.H = new bwb();
        this.I = new bwb();
        this.J = new bwb(8);
        this.K = new bwb();
        this.L = new bwb();
        this.ai = new int[1];
        this.Q = true;
    }

    private final void A(cvj cvjVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        bwb bwbVar = this.I;
        if (bwbVar.e() < i2) {
            bwbVar.M(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, bwbVar.b, 0, length);
        }
        ((cvb) cvjVar).o(bwbVar.b, length, i, false);
        bwbVar.P(0);
        bwbVar.O(i2);
    }

    private static byte[] B(long j, String str, long j2) {
        ahno.F(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return bwp.ah(String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    private static int[] C(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length << 1, i)];
    }

    private final int q() {
        int i = this.an;
        y();
        return i;
    }

    private final int r(cvj cvjVar, czb czbVar, int i, boolean z) throws bsz {
        int i2;
        String str = czbVar.c;
        if ("S_TEXT/UTF8".equals(str)) {
            A(cvjVar, s, i);
            return q();
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            A(cvjVar, t, i);
            return q();
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            A(cvjVar, u, i);
            return q();
        }
        if (czbVar.W) {
            bse bseVar = czbVar.ad;
            bseVar.getClass();
            czbVar.ad = cvh.d(cvjVar, i, bseVar);
            czbVar.ac.b(czbVar.ad);
            czbVar.W = false;
            v();
        }
        cwj cwjVar = czbVar.ac;
        if (!this.ap) {
            if (czbVar.j) {
                this.al &= -1073741825;
                boolean z2 = this.aq;
                int i3 = SemanticState.Focused;
                if (!z2) {
                    bwb bwbVar = this.E;
                    ((cvb) cvjVar).o(bwbVar.b, 0, 1, false);
                    this.am++;
                    byte b2 = bwbVar.b[0];
                    if ((b2 & 128) == 128) {
                        throw new bsz("Extension bit is set in signal byte", null, true, 1);
                    }
                    this.at = b2;
                    this.aq = true;
                }
                byte b3 = this.at;
                if ((b3 & 1) == 1) {
                    int i4 = b3 & 2;
                    this.al |= 1073741824;
                    if (!this.au) {
                        bwb bwbVar2 = this.J;
                        ((cvb) cvjVar).o(bwbVar2.b, 0, 8, false);
                        this.am += 8;
                        this.au = true;
                        bwb bwbVar3 = this.E;
                        if (i4 != 2) {
                            i3 = 0;
                        }
                        bwbVar3.b[0] = (byte) (i3 | 8);
                        bwbVar3.P(0);
                        cwjVar.d(bwbVar3, 1, 1);
                        this.an++;
                        bwbVar2.P(0);
                        cwjVar.d(bwbVar2, 8, 1);
                        this.an += 8;
                    }
                    if (i4 == 2) {
                        if (!this.ar) {
                            bwb bwbVar4 = this.E;
                            ((cvb) cvjVar).o(bwbVar4.b, 0, 1, false);
                            this.am++;
                            bwbVar4.P(0);
                            this.as = bwbVar4.n();
                            this.ar = true;
                        }
                        int i5 = this.as << 2;
                        bwb bwbVar5 = this.E;
                        bwbVar5.L(i5);
                        ((cvb) cvjVar).o(bwbVar5.b, 0, i5, false);
                        this.am += i5;
                        int i6 = (this.as >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.M;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.M = ByteBuffer.allocate(i7);
                        }
                        this.M.position(0);
                        this.M.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.as;
                            if (i8 >= i2) {
                                break;
                            }
                            int iQ = bwbVar5.q();
                            int i10 = iQ - i9;
                            int i11 = i8 % 2;
                            ByteBuffer byteBuffer2 = this.M;
                            if (i11 == 0) {
                                byteBuffer2.putShort((short) i10);
                            } else {
                                byteBuffer2.putInt(i10);
                            }
                            i8++;
                            i9 = iQ;
                        }
                        int i12 = (i - this.am) - i9;
                        int i13 = i2 & 1;
                        ByteBuffer byteBuffer3 = this.M;
                        if (i13 == 1) {
                            byteBuffer3.putInt(i12);
                        } else {
                            byteBuffer3.putShort((short) i12);
                            this.M.putInt(0);
                        }
                        bwb bwbVar6 = this.K;
                        bwbVar6.N(this.M.array(), i7);
                        cwjVar.d(bwbVar6, i7, 1);
                        this.an += i7;
                    }
                }
            } else {
                byte[] bArr = czbVar.k;
                if (bArr != null) {
                    this.H.N(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(czbVar.c) ? czbVar.h > 0 : z) {
                this.al |= 268435456;
                this.L.L(0);
                int i14 = (this.H.d + i) - this.am;
                bwb bwbVar7 = this.E;
                bwbVar7.L(4);
                byte[] bArr2 = bwbVar7.b;
                bArr2[0] = (byte) ((i14 >> 24) & 255);
                bArr2[1] = (byte) ((i14 >> 16) & 255);
                bArr2[2] = (byte) ((i14 >> 8) & 255);
                bArr2[3] = (byte) (i14 & 255);
                cwjVar.d(bwbVar7, 4, 2);
                this.an += 4;
            }
            this.ap = true;
        }
        bwb bwbVar8 = this.H;
        int i15 = bwbVar8.d;
        int i16 = i + i15;
        String str2 = czbVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (czbVar.af != null) {
                ahno.O(i15 == 0);
                czbVar.af.e(cvjVar);
            }
            while (true) {
                int i17 = this.am;
                if (i17 >= i16) {
                    break;
                }
                int iS = s(cvjVar, cwjVar, i16 - i17);
                this.am += iS;
                this.an += iS;
            }
        } else {
            bwb bwbVar9 = this.D;
            byte[] bArr3 = bwbVar9.b;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i18 = czbVar.ae;
            int i19 = 4 - i18;
            while (this.am < i16) {
                int i20 = this.ao;
                if (i20 == 0) {
                    int iMin = Math.min(i18, bwbVar8.d());
                    ((cvb) cvjVar).o(bArr3, i19 + iMin, i18 - iMin, false);
                    if (iMin > 0) {
                        bwbVar8.K(bArr3, i19, iMin);
                    }
                    this.am += i18;
                    bwbVar9.P(0);
                    this.ao = bwbVar9.q();
                    bwb bwbVar10 = this.C;
                    bwbVar10.P(0);
                    cwjVar.c(bwbVar10, 4);
                    this.an += 4;
                } else {
                    int iS2 = s(cvjVar, cwjVar, i20);
                    this.am += iS2;
                    this.an += iS2;
                    this.ao -= iS2;
                }
            }
        }
        if ("A_VORBIS".equals(czbVar.c)) {
            bwb bwbVar11 = this.F;
            bwbVar11.P(0);
            cwjVar.c(bwbVar11, 4);
            this.an += 4;
        }
        return q();
    }

    private final int s(cvj cvjVar, cwj cwjVar, int i) {
        bwb bwbVar = this.H;
        int iD = bwbVar.d();
        if (iD <= 0) {
            return cwjVar.a(cvjVar, i, false);
        }
        int iMin = Math.min(i, iD);
        cwjVar.c(bwbVar, iMin);
        return iMin;
    }

    private final void t() {
        this.av.getClass();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[LOOP:0: B:36:0x00a8->B:41:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        r2 = B(r11, "%01d:%02d:%02d:%02d", 10000);
        r3 = 21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(defpackage.czb r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czc.u(czb, long, int, int, int):void");
    }

    private final void v() {
        if (!this.Q) {
            return;
        }
        if (this.Z != -1 && !this.ac) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.w;
            if (i >= sparseArray.size()) {
                cvk cvkVar = this.av;
                cvkVar.getClass();
                cvkVar.t();
                this.Q = false;
                return;
            }
            if (((czb) sparseArray.valueAt(i)).W) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void w() {
        if (this.h) {
            return;
        }
        if (this.y && this.X != -1) {
            this.W = true;
            return;
        }
        cvk cvkVar = this.av;
        cvkVar.getClass();
        cvkVar.z(new cvy(this.O, 0L));
        this.h = true;
    }

    private final void x(cvj cvjVar, int i) {
        bwb bwbVar = this.E;
        if (bwbVar.d < i) {
            if (bwbVar.e() < i) {
                bwbVar.H(Math.max(bwbVar.e() << 1, i));
            }
            byte[] bArr = bwbVar.b;
            int i2 = bwbVar.d;
            ((cvb) cvjVar).o(bArr, i2, i - i2, false);
            bwbVar.O(i);
        }
    }

    private final void y() {
        this.am = 0;
        this.an = 0;
        this.ao = 0;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.as = 0;
        this.at = (byte) 0;
        this.au = false;
        this.H.L(0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    private final void z(czb czbVar) {
        long j;
        char c2;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z;
        bsx bsxVarD;
        long j8 = 0;
        int i = 0;
        if (czbVar.X) {
            j = 0;
        } else {
            LongSparseArray longSparseArray = this.x;
            if (longSparseArray.size() != 0) {
                ArrayList arrayList = new ArrayList(longSparseArray.size());
                int i2 = 0;
                while (i2 < longSparseArray.size()) {
                    cyy cyyVar = (cyy) longSparseArray.valueAt(i2);
                    long j9 = cyyVar.e;
                    if (j9 == j8 || j9 == czbVar.e) {
                        arrayList.add(new cxl(bwp.z(cyyVar.b), bwp.z(cyyVar.c), cyyVar.d, cyyVar.f != null ? new bsg(cyyVar.g, cyyVar.f) : null));
                    } else {
                        j8 = j8;
                    }
                    i2++;
                    j8 = j8;
                }
                j = j8;
                if (!arrayList.isEmpty()) {
                    bse bseVar = czbVar.ad;
                    bseVar.getClass();
                    bsd bsdVar = new bsd(bseVar);
                    bsx bsxVar = bseVar.m;
                    bsdVar.l = bsxVar != null ? bsxVar.d((bsw[]) arrayList.toArray(new cxk[0])) : new bsx(arrayList);
                    czbVar.ad = new bse(bsdVar);
                    czbVar.X = true;
                }
            } else {
                j = 0;
            }
        }
        SparseArray sparseArray = this.T;
        long j10 = this.O;
        long j11 = this.d;
        long j12 = this.N;
        if (czbVar.f == 2) {
            List list = (List) sparseArray.get(czbVar.d);
            if (czbVar.Y || list == null || list.isEmpty()) {
                return;
            }
            if (list.isEmpty()) {
                c2 = 0;
                j3 = -9223372036854775807L;
                j2 = -9223372036854775807L;
            } else {
                int iMin = Math.min(list.size(), 20);
                double d = 0.0d;
                c2 = 0;
                int i3 = -1;
                j2 = -9223372036854775807L;
                while (i < iMin) {
                    cyz cyzVar = (cyz) list.get(i);
                    long j13 = j11;
                    long j14 = cyzVar.a;
                    if (j14 > 10000000) {
                        break;
                    }
                    int i4 = i + 1;
                    if (i < list.size() - 1) {
                        cyz cyzVar2 = (cyz) list.get(i4);
                        j4 = j10;
                        j5 = cyzVar2.b + cyzVar2.c;
                        j6 = cyzVar.b + cyzVar.c;
                        j7 = cyzVar2.a - j14;
                    } else {
                        j4 = j10;
                        j5 = j13 + j12;
                        j6 = cyzVar.b + cyzVar.c;
                        j7 = j4 - j14;
                    }
                    long j15 = j5 - j6;
                    if (j7 > j) {
                        double d2 = j15 / j7;
                        if (d2 > d) {
                            d = d2;
                            i3 = i;
                        }
                    }
                    iMin = iMin;
                    i = i4;
                    j11 = j13;
                    j10 = j4;
                }
                j3 = i3 == -1 ? -9223372036854775807L : ((cyz) list.get(i3)).a;
            }
            if (j3 != j2) {
                bse bseVar2 = czbVar.ad;
                bseVar2.getClass();
                cxq cxqVar = new cxq(j3);
                bsx bsxVar2 = bseVar2.m;
                if (bsxVar2 == null) {
                    z = true;
                    bsw[] bswVarArr = new bsw[1];
                    bswVarArr[c2] = cxqVar;
                    bsxVarD = new bsx(j2, bswVarArr);
                } else {
                    z = true;
                    bsw[] bswVarArr2 = new bsw[1];
                    bswVarArr2[c2] = cxqVar;
                    bsxVarD = bsxVar2.d(bswVarArr2);
                }
                bsd bsdVar2 = new bsd(czbVar.ad);
                bsdVar2.l = bsxVarD;
                czbVar.ad = new bse(bsdVar2);
                czbVar.Y = z;
            }
        }
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        if (this.A) {
            cvkVar = new dbo(cvkVar, this.B);
        }
        this.av = cvkVar;
    }

    @Override // defpackage.cvi
    public void d(long j, long j2) {
        this.n = -9223372036854775807L;
        int i = 0;
        this.ae = 0;
        cyx cyxVar = this.aw;
        cyxVar.d = 0;
        cyxVar.b.clear();
        cyxVar.c.d();
        this.v.d();
        y();
        this.R.clear();
        this.U = false;
        this.j = -9223372036854775807L;
        this.k = -1;
        this.l = -1L;
        this.m = -1L;
        if (!this.h) {
            this.T.clear();
        }
        while (true) {
            SparseArray sparseArray = this.w;
            if (i >= sparseArray.size()) {
                return;
            }
            jtq jtqVar = ((czb) sparseArray.valueAt(i)).af;
            if (jtqVar != null) {
                jtqVar.c();
            }
            i++;
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        auzc auzcVar = new auzc((char[]) null);
        cvb cvbVar = (cvb) cvjVar;
        long j = cvbVar.a;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        bwb bwbVar = (bwb) auzcVar.b;
        cvbVar.n(bwbVar.b, 0, 4, false);
        auzcVar.a = 4;
        for (long jW = bwbVar.w(); jW != 440786851; jW = ((jW << 8) & (-256)) | ((long) (bwbVar.b[0] & 255))) {
            int i = (int) j2;
            int i2 = auzcVar.a + 1;
            auzcVar.a = i2;
            if (i2 == i) {
                return false;
            }
            cvbVar.n(bwbVar.b, 0, 1, false);
        }
        long jG = auzcVar.g(cvjVar);
        long j3 = auzcVar.a;
        if (jG == Long.MIN_VALUE) {
            return false;
        }
        long j4 = j3 + jG;
        if (j != -1 && j4 >= j) {
            return false;
        }
        while (true) {
            long j5 = auzcVar.a;
            if (j5 >= j4) {
                return j5 == j4;
            }
            if (auzcVar.g(cvjVar) == Long.MIN_VALUE) {
                return false;
            }
            long jG2 = auzcVar.g(cvjVar);
            if (jG2 < 0) {
                return false;
            }
            if (jG2 != 0) {
                int i3 = (int) jG2;
                cvbVar.m(i3, false);
                auzcVar.a += i3;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x0298  */
    /* JADX WARN: Code duplicated, block: B:125:0x029c  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:132:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:137:0x0305  */
    /* JADX WARN: Code duplicated, block: B:139:0x031b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0328 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x032a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0334  */
    /* JADX WARN: Code duplicated, block: B:148:0x0357 A[LOOP:7: B:145:0x0338->B:148:0x0357, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x036a  */
    /* JADX WARN: Code duplicated, block: B:152:0x036e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0379  */
    /* JADX WARN: Code duplicated, block: B:157:0x0388  */
    /* JADX WARN: Code duplicated, block: B:159:0x038d  */
    /* JADX WARN: Code duplicated, block: B:163:0x03ac A[LOOP:10: B:162:0x03aa->B:163:0x03ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:168:0x03d2 A[LOOP:9: B:169:0x03d9->B:168:0x03d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:186:0x0441  */
    /* JADX WARN: Code duplicated, block: B:188:0x0445  */
    /* JADX WARN: Code duplicated, block: B:190:0x044e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0450  */
    /* JADX WARN: Code duplicated, block: B:193:0x0455  */
    /* JADX WARN: Code duplicated, block: B:194:0x0458  */
    /* JADX WARN: Code duplicated, block: B:198:0x0470  */
    /* JADX WARN: Code duplicated, block: B:200:0x0473 A[LOOP:4: B:200:0x0473->B:202:0x0479, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:202:0x0479 A[LOOP:4: B:200:0x0473->B:202:0x0479, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x04ac A[LOOP:5: B:207:0x04bb->B:206:0x04ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x04bb A[LOOP:5: B:207:0x04bb->B:206:0x04ac, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:210:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:212:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:214:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:215:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:217:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:219:0x04df A[LOOP:11: B:216:0x04d7->B:219:0x04df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x0501  */
    /* JADX WARN: Code duplicated, block: B:228:0x0509  */
    /* JADX WARN: Code duplicated, block: B:230:0x0512  */
    /* JADX WARN: Code duplicated, block: B:232:0x0516  */
    /* JADX WARN: Code duplicated, block: B:234:0x051a  */
    /* JADX WARN: Code duplicated, block: B:236:0x051e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0522  */
    /* JADX WARN: Code duplicated, block: B:240:0x0526  */
    /* JADX WARN: Code duplicated, block: B:242:0x052c  */
    /* JADX WARN: Code duplicated, block: B:244:0x0530  */
    /* JADX WARN: Code duplicated, block: B:246:0x0534  */
    /* JADX WARN: Code duplicated, block: B:248:0x0538  */
    /* JADX WARN: Code duplicated, block: B:250:0x053c  */
    /* JADX WARN: Code duplicated, block: B:253:0x0543  */
    /* JADX WARN: Code duplicated, block: B:254:0x054a  */
    /* JADX WARN: Code duplicated, block: B:256:0x0554  */
    /* JADX WARN: Code duplicated, block: B:258:0x055f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0565  */
    /* JADX WARN: Code duplicated, block: B:261:0x056f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0575  */
    /* JADX WARN: Code duplicated, block: B:264:0x057c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:265:0x057e  */
    /* JADX WARN: Code duplicated, block: B:266:0x0584  */
    /* JADX WARN: Code duplicated, block: B:267:0x058a  */
    /* JADX WARN: Code duplicated, block: B:268:0x058e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0596  */
    /* JADX WARN: Code duplicated, block: B:271:0x059b  */
    /* JADX WARN: Code duplicated, block: B:273:0x059e  */
    /* JADX WARN: Code duplicated, block: B:275:0x05a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:276:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:277:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:278:0x05af  */
    /* JADX WARN: Code duplicated, block: B:279:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:280:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:281:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:282:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:283:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:284:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:285:0x05de  */
    /* JADX WARN: Code duplicated, block: B:286:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:288:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:289:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:291:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:292:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:293:0x0602  */
    /* JADX WARN: Code duplicated, block: B:294:0x0609  */
    /* JADX WARN: Code duplicated, block: B:296:0x060e  */
    /* JADX WARN: Code duplicated, block: B:298:0x0611 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:299:0x0613  */
    /* JADX WARN: Code duplicated, block: B:301:0x0617  */
    /* JADX WARN: Code duplicated, block: B:302:0x061c  */
    /* JADX WARN: Code duplicated, block: B:303:0x0621  */
    /* JADX WARN: Code duplicated, block: B:304:0x0627  */
    /* JADX WARN: Code duplicated, block: B:306:0x062e  */
    /* JADX WARN: Code duplicated, block: B:309:0x0637  */
    /* JADX WARN: Code duplicated, block: B:313:0x0649  */
    /* JADX WARN: Code duplicated, block: B:317:0x065d  */
    /* JADX WARN: Code duplicated, block: B:321:0x066f  */
    /* JADX WARN: Code duplicated, block: B:327:0x0687  */
    /* JADX WARN: Code duplicated, block: B:331:0x069b  */
    /* JADX WARN: Code duplicated, block: B:332:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:333:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:335:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:336:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:337:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:338:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:339:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:340:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:342:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:343:0x06db  */
    /* JADX WARN: Code duplicated, block: B:344:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:345:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:346:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:348:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:349:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:351:0x0702  */
    /* JADX WARN: Code duplicated, block: B:353:0x0705  */
    /* JADX WARN: Code duplicated, block: B:355:0x0708  */
    /* JADX WARN: Code duplicated, block: B:357:0x070c  */
    /* JADX WARN: Code duplicated, block: B:359:0x0710  */
    /* JADX WARN: Code duplicated, block: B:360:0x0718  */
    /* JADX WARN: Code duplicated, block: B:361:0x0721  */
    /* JADX WARN: Code duplicated, block: B:362:0x0729  */
    /* JADX WARN: Code duplicated, block: B:363:0x0732  */
    /* JADX WARN: Code duplicated, block: B:365:0x073d  */
    /* JADX WARN: Code duplicated, block: B:366:0x0746  */
    /* JADX WARN: Code duplicated, block: B:367:0x074f  */
    /* JADX WARN: Code duplicated, block: B:371:0x0763  */
    /* JADX WARN: Code duplicated, block: B:375:0x0777  */
    /* JADX WARN: Code duplicated, block: B:377:0x077d  */
    /* JADX WARN: Code duplicated, block: B:379:0x0786  */
    /* JADX WARN: Code duplicated, block: B:380:0x0789  */
    /* JADX WARN: Code duplicated, block: B:382:0x078f  */
    /* JADX WARN: Code duplicated, block: B:384:0x0798  */
    /* JADX WARN: Code duplicated, block: B:385:0x079b  */
    /* JADX WARN: Code duplicated, block: B:386:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:387:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:388:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:390:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:391:0x07be  */
    /* JADX WARN: Code duplicated, block: B:396:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:425:0x086d A[LOOP:1: B:6:0x0014->B:425:0x086d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:430:0x0466 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x040d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0403 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x07cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x063b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x0651 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0663 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:441:0x068f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x0755 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x076b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:464:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x04bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:60:0x0109  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0110  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:66:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0126  */
    /* JADX WARN: Code duplicated, block: B:68:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146  */
    /* JADX WARN: Code duplicated, block: B:72:0x014e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0156  */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:76:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0176  */
    /* JADX WARN: Code duplicated, block: B:78:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0182  */
    /* JADX WARN: Code duplicated, block: B:81:0x018e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v180 */
    /* JADX WARN: Type inference failed for: r3v181 */
    /* JADX WARN: Type inference failed for: r3v182 */
    /* JADX WARN: Type inference failed for: r3v183 */
    /* JADX WARN: Type inference failed for: r3v200 */
    /* JADX WARN: Type inference failed for: r3v201 */
    /* JADX WARN: Type inference failed for: r3v204 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        int i;
        int i2;
        long j;
        int i3;
        czc czcVar;
        int iH;
        boolean z;
        boolean z2;
        long j2;
        long jA;
        boolean z3;
        ?? r3;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int iB;
        int iA;
        ?? r4;
        int i5;
        long j3;
        int i6;
        byte[] bArr;
        String str;
        int i7;
        boolean z8;
        int i8;
        czb czbVar;
        int i9;
        int i10;
        boolean z9;
        int i11;
        bwb bwbVar;
        int i12;
        byte b2;
        int[] iArrC;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        long j4;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z10;
        int i28;
        boolean z11;
        int i29;
        int i30;
        boolean z12;
        int i31;
        int i32;
        long j5;
        int i33;
        long jA2;
        double dLongBitsToDouble;
        cvb cvbVar;
        int iA2;
        int iB2;
        ?? r5;
        boolean z13 = false;
        this.ad = false;
        while (!this.ad) {
            cyx cyxVar = this.aw;
            cyxVar.g.getClass();
            boolean z14 = z13;
            while (true) {
                ArrayDeque arrayDeque = cyxVar.b;
                yvt yvtVar = (yvt) arrayDeque.peek();
                i = -1;
                i2 = 1;
                if (yvtVar == null || ((cvb) cvjVar).b < yvtVar.a) {
                    int i34 = cyxVar.d;
                    int i35 = 2;
                    if (i34 == 0) {
                        long jC = cyxVar.c.c(cvjVar, true, z14, 4);
                        if (jC == -2) {
                            cvjVar.k();
                            while (true) {
                                byte[] bArr2 = cyxVar.a;
                                cvbVar = (cvb) cvjVar;
                                cvbVar.n(bArr2, z14 ? 1 : 0, 4, z14);
                                iA2 = czd.a(bArr2[z14 ? 1 : 0]);
                                if (iA2 != -1 && iA2 <= 4) {
                                    j = -1;
                                    iB2 = (int) czd.b(bArr2, iA2, z14);
                                    Object obj = cyxVar.g.a;
                                    if (iB2 != 357149030 && iB2 != 272869232 && iB2 != 524531317 && iB2 != 475249515) {
                                        if (iB2 == 374648427) {
                                            iB2 = 374648427;
                                        }
                                    }
                                }
                                cvbVar.p(1, z14);
                            }
                            cvbVar.p(iA2, z14);
                            jC = iB2;
                        } else {
                            j = -1;
                        }
                        if (jC == j) {
                            z2 = z14 ? 1 : 0;
                            i = -1;
                            r5 = z14;
                        } else {
                            cyxVar.e = (int) jC;
                            cyxVar.d = 1;
                        }
                    } else {
                        j = -1;
                        if (i34 == 1) {
                        }
                        qcb qcbVar = cyxVar.g;
                        i3 = cyxVar.e;
                        czcVar = (czc) qcbVar.a;
                        iH = czcVar.h(i3);
                        if (iH != 0) {
                            if (iH != 1) {
                                if (iH != 2) {
                                    if (iH != 3) {
                                        i5 = -1;
                                        j3 = cyxVar.f;
                                        if (j3 <= 2147483647L) {
                                            throw new bsz(a.bS(j3, "String element size: "), null, true, 1);
                                        }
                                        i6 = (int) j3;
                                        if (i6 == 0) {
                                            str = "";
                                        } else {
                                            bArr = new byte[i6];
                                            ((cvb) cvjVar).o(bArr, z14 ? 1 : 0, i6, z14);
                                            while (i6 > 0) {
                                                i7 = i6 - 1;
                                                if (bArr[i7] == 0) {
                                                    i6 = i7;
                                                } else {
                                                    str = new String(bArr, z14 ? 1 : 0, i6);
                                                }
                                            }
                                            str = new String(bArr, z14 ? 1 : 0, i6);
                                        }
                                        czcVar.p(i3, str);
                                        cyxVar.d = z14 ? 1 : 0;
                                        z8 = z14;
                                    } else if (iH != 4) {
                                        j5 = cyxVar.f;
                                        if (j5 == 4 && j5 != 8) {
                                            throw new bsz(a.bS(j5, "Invalid float size: "), null, true, 1);
                                        }
                                        i33 = (int) j5;
                                        jA2 = cyxVar.a(cvjVar, i33);
                                        if (i33 == 4) {
                                            dLongBitsToDouble = Float.intBitsToFloat((int) jA2);
                                        } else {
                                            dLongBitsToDouble = Double.longBitsToDouble(jA2);
                                        }
                                        if (i3 != 181) {
                                            czcVar.k(i3).T = (int) dLongBitsToDouble;
                                        } else if (i3 != 17545) {
                                            switch (i3) {
                                                case 21969:
                                                    czcVar.k(i3).F = (float) dLongBitsToDouble;
                                                    break;
                                                case 21970:
                                                    czcVar.k(i3).G = (float) dLongBitsToDouble;
                                                    break;
                                                case 21971:
                                                    czcVar.k(i3).H = (float) dLongBitsToDouble;
                                                    break;
                                                case 21972:
                                                    czcVar.k(i3).I = (float) dLongBitsToDouble;
                                                    break;
                                                case 21973:
                                                    czcVar.k(i3).J = (float) dLongBitsToDouble;
                                                    break;
                                                case 21974:
                                                    czcVar.k(i3).K = (float) dLongBitsToDouble;
                                                    break;
                                                case 21975:
                                                    czcVar.k(i3).L = (float) dLongBitsToDouble;
                                                    break;
                                                case 21976:
                                                    czcVar.k(i3).M = (float) dLongBitsToDouble;
                                                    break;
                                                case 21977:
                                                    czcVar.k(i3).N = (float) dLongBitsToDouble;
                                                    break;
                                                case 21978:
                                                    czcVar.k(i3).O = (float) dLongBitsToDouble;
                                                    break;
                                                default:
                                                    switch (i3) {
                                                        case 30323:
                                                            czcVar.k(i3).v = (float) dLongBitsToDouble;
                                                            break;
                                                        case 30324:
                                                            czcVar.k(i3).w = (float) dLongBitsToDouble;
                                                            break;
                                                        case 30325:
                                                            czcVar.k(i3).x = (float) dLongBitsToDouble;
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            czcVar.f = (long) dLongBitsToDouble;
                                        }
                                        cyxVar.d = z14 ? 1 : 0;
                                        z = z14;
                                    } else {
                                        i8 = (int) cyxVar.f;
                                        i5 = -1;
                                        if (i3 != 161 || i3 == 163) {
                                            if (czcVar.ae == 0) {
                                                czd czdVar = czcVar.v;
                                                czcVar.aj = (int) czdVar.c(cvjVar, z14, true, 8);
                                                czcVar.ak = czdVar.a;
                                                czcVar.o = -9223372036854775807L;
                                                czcVar.ae = 1;
                                                czcVar.E.L(z14 ? 1 : 0);
                                            }
                                            czbVar = (czb) czcVar.w.get(czcVar.aj);
                                            if (czbVar == null) {
                                                ((cvb) cvjVar).p(i8 - czcVar.ak, z14);
                                                czcVar.ae = z14 ? 1 : 0;
                                                z9 = z14;
                                            } else {
                                                czbVar.c();
                                                if (czcVar.ae == 1) {
                                                    czcVar.x(cvjVar, 3);
                                                    bwbVar = czcVar.E;
                                                    i12 = (bwbVar.b[2] & 6) >> 1;
                                                    b2 = 255;
                                                    if (i12 == 0) {
                                                        czcVar.ah = 1;
                                                        int[] iArrC2 = C(czcVar.ai, 1);
                                                        czcVar.ai = iArrC2;
                                                        iArrC2[z14 ? 1 : 0] = (i8 - czcVar.ak) - 3;
                                                    } else {
                                                        czcVar.x(cvjVar, 4);
                                                        int i36 = (bwbVar.b[3] & 255) + 1;
                                                        czcVar.ah = i36;
                                                        iArrC = C(czcVar.ai, i36);
                                                        czcVar.ai = iArrC;
                                                        if (i12 == 2) {
                                                            int i37 = (i8 - czcVar.ak) - 4;
                                                            int i38 = czcVar.ah;
                                                            Arrays.fill(iArrC, z14 ? 1 : 0, i38, i37 / i38);
                                                        } else if (i12 == 1) {
                                                            i25 = z14 ? 1 : 0;
                                                            i26 = i25;
                                                            i27 = 4;
                                                            z10 = z14;
                                                            while (true) {
                                                                i28 = czcVar.ah - 1;
                                                                if (i25 < i28) {
                                                                    czcVar.ai[i25] = z10 ? 1 : 0;
                                                                    z11 = z10;
                                                                    while (true) {
                                                                        i29 = i27 + 1;
                                                                        czcVar.x(cvjVar, i29);
                                                                        i30 = bwbVar.b[i27] & 255;
                                                                        z12 = z11;
                                                                        int[] iArr = czcVar.ai;
                                                                        i31 = iArr[i25] + i30;
                                                                        iArr[i25] = i31;
                                                                        if (i30 != 255) {
                                                                            break;
                                                                        }
                                                                        i27 = i29;
                                                                        z11 = z12 ? 1 : 0;
                                                                    }
                                                                    i26 += i31;
                                                                    i25++;
                                                                    i27 = i29;
                                                                    z10 = z12 ? 1 : 0;
                                                                } else {
                                                                    i13 = z10 ? 1 : 0;
                                                                    czcVar.ai[i28] = ((i8 - czcVar.ak) - i27) - i26;
                                                                    i18 = 2;
                                                                }
                                                            }
                                                        } else {
                                                            i13 = z14 ? 1 : 0;
                                                            if (i12 != 3) {
                                                                throw new bsz("Unexpected lacing value: 2", null, true, 1);
                                                            }
                                                            i14 = i13 == true ? 1 : 0;
                                                            i15 = i14;
                                                            i16 = 4;
                                                            while (true) {
                                                                i17 = czcVar.ah - 1;
                                                                if (i14 < i17) {
                                                                    czcVar.ai[i14] = i13 == true ? 1 : 0;
                                                                    i19 = i16 + 1;
                                                                    czcVar.x(cvjVar, i19);
                                                                    if (bwbVar.b[i16] == 0) {
                                                                        ?? r6 = i2;
                                                                        throw new bsz("No valid varint length mask found", null, r6, r6 == true ? 1 : 0);
                                                                    }
                                                                    i20 = i13 == true ? 1 : 0;
                                                                    while (true) {
                                                                        if (i20 < 8) {
                                                                            i22 = i2 << (7 - i20);
                                                                            i21 = i35;
                                                                            if ((bwbVar.b[i16] & i22) != 0) {
                                                                                i23 = i19 + i20;
                                                                                czcVar.x(cvjVar, i23);
                                                                                j4 = bwbVar.b[i16] & b2 & (~i22);
                                                                                i24 = i16 + 1;
                                                                                while (i24 < i23) {
                                                                                    j4 = (j4 << 8) | ((long) (bwbVar.b[i24] & 255));
                                                                                    i24++;
                                                                                    i23 = i23;
                                                                                }
                                                                                int i39 = i23;
                                                                                if (i14 > 0) {
                                                                                    j4 -= (1 << ((i20 * 7) + 6)) + j;
                                                                                }
                                                                                i16 = i39;
                                                                            } else {
                                                                                i20++;
                                                                                i35 = i21;
                                                                                i2 = 1;
                                                                                b2 = 255;
                                                                            }
                                                                        } else {
                                                                            i21 = i35;
                                                                            i16 = i19;
                                                                            j4 = 0;
                                                                        }
                                                                    }
                                                                    if (j4 >= -2147483648L || j4 > 2147483647L) {
                                                                        throw new bsz("EBML lacing sample size out of range.", null, true, 1);
                                                                    }
                                                                    int[] iArr2 = czcVar.ai;
                                                                    int i40 = (int) j4;
                                                                    if (i14 != 0) {
                                                                        i40 += iArr2[i14 - 1];
                                                                    }
                                                                    iArr2[i14] = i40;
                                                                    i15 += i40;
                                                                    i14++;
                                                                    i35 = i21;
                                                                    i2 = 1;
                                                                    b2 = 255;
                                                                } else {
                                                                    i18 = i35;
                                                                    czcVar.ai[i17] = ((i8 - czcVar.ak) - i16) - i15;
                                                                }
                                                            }
                                                        }
                                                        byte[] bArr3 = bwbVar.b;
                                                        czcVar.af = czcVar.n + czcVar.i((bArr3[i13] << 8) | (bArr3[1] & 255));
                                                        if (czbVar.f != 1) {
                                                            i32 = 1;
                                                        } else if (i3 == 163) {
                                                            if ((bwbVar.b[i18] & 128) == 128) {
                                                                i32 = 1;
                                                            } else {
                                                                i32 = i13;
                                                            }
                                                            i3 = 163;
                                                        } else {
                                                            i32 = i13;
                                                        }
                                                        czcVar.al = i32;
                                                        czcVar.ae = i18;
                                                        czcVar.ag = i13 == true ? 1 : 0;
                                                        i9 = 163;
                                                    }
                                                    i13 = z14 ? 1 : 0;
                                                    i18 = 2;
                                                    byte[] bArr4 = bwbVar.b;
                                                    czcVar.af = czcVar.n + czcVar.i((bArr4[i13] << 8) | (bArr4[1] & 255));
                                                    if (czbVar.f != 1) {
                                                        i32 = 1;
                                                    } else if (i3 == 163) {
                                                        if ((bwbVar.b[i18] & 128) == 128) {
                                                            i32 = 1;
                                                        } else {
                                                            i32 = i13;
                                                        }
                                                        i3 = 163;
                                                    } else {
                                                        i32 = i13;
                                                    }
                                                    czcVar.al = i32;
                                                    czcVar.ae = i18;
                                                    czcVar.ag = i13 == true ? 1 : 0;
                                                    i9 = 163;
                                                } else {
                                                    i9 = 163;
                                                }
                                                if (i3 == i9) {
                                                    while (true) {
                                                        i11 = czcVar.ag;
                                                        if (i11 < czcVar.ah) {
                                                            czcVar.u(czbVar, czcVar.af + ((long) ((czcVar.ag * czbVar.g) / 1000)), czcVar.al, czcVar.r(cvjVar, czbVar, czcVar.ai[i11], false), 0);
                                                            czcVar.ag++;
                                                        } else {
                                                            z9 = false;
                                                            czcVar.ae = 0;
                                                        }
                                                    }
                                                } else {
                                                    while (true) {
                                                        i10 = czcVar.ag;
                                                        if (i10 < czcVar.ah) {
                                                            int[] iArr3 = czcVar.ai;
                                                            iArr3[i10] = czcVar.r(cvjVar, czbVar, iArr3[i10], true);
                                                            czcVar.ag++;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (i3 != 165) {
                                            if (i3 == 16877) {
                                                czb czbVarK = czcVar.k(i3);
                                                int i41 = czbVarK.i;
                                                if (i41 == 1685485123 || i41 == 1685480259) {
                                                    czbVarK.P = new byte[i8];
                                                    ((cvb) cvjVar).o(czbVarK.P, z14 ? 1 : 0, i8, z14);
                                                    z9 = z14;
                                                } else {
                                                    ((cvb) cvjVar).p(i8, z14);
                                                    z9 = z14;
                                                }
                                            } else if (i3 == 16981) {
                                                czcVar.m(i3);
                                                czb czbVar2 = czcVar.g;
                                                czbVar2.k = new byte[i8];
                                                ((cvb) cvjVar).o(czbVar2.k, z14 ? 1 : 0, i8, z14);
                                                z9 = z14;
                                            } else if (i3 == 18402) {
                                                byte[] bArr5 = new byte[i8];
                                                ((cvb) cvjVar).o(bArr5, z14 ? 1 : 0, i8, z14);
                                                czcVar.k(i3).l = new cwi(1, bArr5, z14 ? 1 : 0, z14 ? 1 : 0);
                                                z9 = z14;
                                            } else if (i3 == 21419) {
                                                bwb bwbVar2 = czcVar.G;
                                                Arrays.fill(bwbVar2.b, z14 ? (byte) 1 : (byte) 0);
                                                ((cvb) cvjVar).o(bwbVar2.b, 4 - i8, i8, z14);
                                                bwbVar2.P(z14 ? 1 : 0);
                                                czcVar.S = (int) bwbVar2.w();
                                                z9 = z14;
                                            } else if (i3 == 25506) {
                                                czcVar.m(i3);
                                                czb czbVar3 = czcVar.g;
                                                czbVar3.m = new byte[i8];
                                                ((cvb) cvjVar).o(czbVar3.m, z14 ? 1 : 0, i8, z14);
                                                z9 = z14;
                                            } else {
                                                if (i3 != 30322) {
                                                    throw new bsz(a.bR(i3, "Unexpected id: "), null, true, 1);
                                                }
                                                czcVar.m(i3);
                                                czb czbVar4 = czcVar.g;
                                                czbVar4.y = new byte[i8];
                                                ((cvb) cvjVar).o(czbVar4.y, z14 ? 1 : 0, i8, z14);
                                                z9 = z14;
                                            }
                                        } else if (czcVar.ae == 2) {
                                            czb czbVar5 = (czb) czcVar.w.get(czcVar.aj);
                                            if (czcVar.p == 4 && "V_VP9".equals(czbVar5.c)) {
                                                bwb bwbVar3 = czcVar.L;
                                                bwbVar3.L(i8);
                                                ((cvb) cvjVar).o(bwbVar3.b, z14 ? 1 : 0, i8, z14);
                                                if (!czcVar.z && bvf.i(bwbVar3.b, i8)) {
                                                    z9 = z14;
                                                    z9 = z14;
                                                    z9 = z14;
                                                    bwbVar3.L(z14 ? 1 : 0);
                                                    z9 = z14;
                                                }
                                            } else {
                                                z9 = z14;
                                                z9 = z14;
                                                ((cvb) cvjVar).p(i8, z14);
                                                z9 = z14;
                                            }
                                        }
                                        z9 = z14;
                                        z9 = z14;
                                        z9 = z14;
                                        z9 = z14;
                                        z9 = z14;
                                        z9 = z14;
                                        cyxVar.d = z9 ? 1 : 0;
                                        z8 = z9;
                                    }
                                    i = i5;
                                    r4 = z8;
                                } else {
                                    j2 = cyxVar.f;
                                    if (j2 <= 8) {
                                        throw new bsz(a.bS(j2, "Invalid integer size: "), null, true, 1);
                                    }
                                    jA = cyxVar.a(cvjVar, (int) j2);
                                    if (i3 != 136) {
                                        i = -1;
                                        if (jA == 1) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        czcVar.k(i3).aa = z3;
                                    } else if (i3 != 137) {
                                        i = -1;
                                        czcVar.j(i3).e = jA;
                                    } else if (i3 != 145) {
                                        i = -1;
                                        czcVar.j(i3).b = jA;
                                    } else if (i3 != 146) {
                                        i = -1;
                                        czcVar.j(i3).c = jA;
                                    } else if (i3 != 240) {
                                        i = -1;
                                        if (!czcVar.h) {
                                            czcVar.l(i3);
                                            if (czcVar.m == j) {
                                                czcVar.m = jA;
                                            }
                                        }
                                    } else if (i3 != 241) {
                                        i = -1;
                                        if (!czcVar.h) {
                                            czcVar.l(i3);
                                            if (czcVar.l == j) {
                                                czcVar.l = jA;
                                            }
                                        }
                                    } else if (i3 != 20529) {
                                        i = -1;
                                        if (jA != 0) {
                                            throw new bsz(a.cf(jA, "ContentEncodingOrder ", " not supported"), null, true, 1);
                                        }
                                    } else if (i3 != 20530) {
                                        i = -1;
                                        if (jA != 1) {
                                            throw new bsz(a.cf(jA, "ContentEncodingScope ", " not supported"), null, true, 1);
                                        }
                                    } else if (i3 != 29636) {
                                        i = -1;
                                        czcVar.j(i3).a = jA;
                                    } else if (i3 != 29637) {
                                        i4 = (int) jA;
                                        switch (i3) {
                                            case 131:
                                                if (i4 != 1) {
                                                    i = -1;
                                                    czcVar.k(i3).f = 2;
                                                } else if (i4 != 2) {
                                                    i = -1;
                                                    czcVar.k(i3).f = 1;
                                                } else if (i4 != 17) {
                                                    i = -1;
                                                    czcVar.k(i3).f = 3;
                                                } else if (i4 != 33) {
                                                    i = -1;
                                                    czcVar.k(i3).f = 5;
                                                } else {
                                                    i = -1;
                                                    czcVar.k(i3).f = -1;
                                                }
                                                break;
                                            case 152:
                                                if (jA == 1) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                czcVar.j(i3).d = z4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 155:
                                                czcVar.o = czcVar.i(jA);
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 159:
                                                czcVar.k(i3).Q = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 176:
                                                czcVar.k(i3).o = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 179:
                                                if (!czcVar.h) {
                                                    czcVar.l(i3);
                                                    czcVar.j = czcVar.i(jA);
                                                }
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 186:
                                                czcVar.k(i3).p = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 215:
                                                czcVar.k(i3).d = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 231:
                                                czcVar.n = czcVar.i(jA);
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 238:
                                                czcVar.p = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 247:
                                                if (!czcVar.h) {
                                                    czcVar.l(i3);
                                                    czcVar.k = (int) jA;
                                                }
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 251:
                                                czcVar.q = true;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 16871:
                                                czcVar.k(i3).i = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 16980:
                                                if (jA != 3) {
                                                    throw new bsz(a.cf(jA, "ContentCompAlgo ", " not supported"), null, true, 1);
                                                }
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 17029:
                                                if (jA >= 1 || jA > 2) {
                                                    throw new bsz(a.cf(jA, "DocTypeReadVersion ", " not supported"), null, true, 1);
                                                }
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 17143:
                                                if (jA != 1) {
                                                    throw new bsz(a.cf(jA, "EBMLReadVersion ", " not supported"), null, true, 1);
                                                }
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 18401:
                                                if (jA != 5) {
                                                    throw new bsz(a.cf(jA, "ContentEncAlgo ", " not supported"), null, true, 1);
                                                }
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 18408:
                                                if (jA != 1) {
                                                    throw new bsz(a.cf(jA, "AESSettingsCipherMode ", " not supported"), null, true, 1);
                                                }
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 21420:
                                                czcVar.i = jA + czcVar.d;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 21432:
                                                czcVar.m(i3);
                                                if (i4 != 0) {
                                                    z5 = false;
                                                    czcVar.g.z = 0;
                                                    z7 = z5;
                                                    i = -1;
                                                    r3 = z7;
                                                    cyxVar.d = r3;
                                                    r4 = r3;
                                                } else {
                                                    if (i4 != 1) {
                                                        czcVar.g.z = 2;
                                                    } else if (i4 != 3) {
                                                        czcVar.g.z = 1;
                                                    } else if (i4 == 15) {
                                                        czcVar.g.z = 3;
                                                    }
                                                    z7 = false;
                                                    i = -1;
                                                    r3 = z7;
                                                    cyxVar.d = r3;
                                                    r4 = r3;
                                                }
                                                break;
                                            case 21680:
                                                czcVar.k(i3).r = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 21682:
                                                czcVar.k(i3).t = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 21690:
                                                czcVar.k(i3).s = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 21930:
                                                if (jA == 1) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                czcVar.k(i3).Z = z6;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 21938:
                                                czcVar.m(i3);
                                                czcVar.g.q = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 21998:
                                                czcVar.k(i3).h = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 22186:
                                                czcVar.k(i3).U = jA;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 22203:
                                                czcVar.k(i3).V = jA;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 25188:
                                                czcVar.k(i3).R = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 30114:
                                                czcVar.r = jA;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 30321:
                                                czcVar.m(i3);
                                                if (i4 != 0) {
                                                    z5 = false;
                                                    czcVar.g.u = 0;
                                                    z7 = z5;
                                                    i = -1;
                                                    r3 = z7;
                                                    cyxVar.d = r3;
                                                    r4 = r3;
                                                } else {
                                                    if (i4 != 1) {
                                                        czcVar.g.u = 1;
                                                    } else if (i4 != 2) {
                                                        czcVar.g.u = 2;
                                                    } else if (i4 == 3) {
                                                        czcVar.g.u = 3;
                                                    }
                                                    z7 = false;
                                                    i = -1;
                                                    r3 = z7;
                                                    cyxVar.d = r3;
                                                    r4 = r3;
                                                }
                                                break;
                                            case 2352003:
                                                czcVar.k(i3).g = i4;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            case 2807729:
                                                czcVar.e = jA;
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                            default:
                                                i = -1;
                                                switch (i3) {
                                                    case 21945:
                                                        czcVar.m(i3);
                                                        if (i4 != 1) {
                                                            czcVar.g.C = 2;
                                                        } else if (i4 == 2) {
                                                            czcVar.g.C = 1;
                                                        }
                                                        z7 = false;
                                                        i = -1;
                                                        r3 = z7;
                                                        break;
                                                    case 21946:
                                                        czcVar.m(i3);
                                                        iB = bru.b((int) jA);
                                                        if (iB != -1) {
                                                            czcVar.g.B = iB;
                                                        }
                                                        z7 = false;
                                                        i = -1;
                                                        r3 = z7;
                                                        break;
                                                    case 21947:
                                                        czcVar.m(i3);
                                                        iA = bru.a(i4);
                                                        i = -1;
                                                        if (iA != -1) {
                                                            czcVar.g.A = iA;
                                                        }
                                                        break;
                                                    case 21948:
                                                        czcVar.k(i3).D = i4;
                                                        i = -1;
                                                        break;
                                                    case 21949:
                                                        czcVar.k(i3).E = i4;
                                                        i = -1;
                                                        break;
                                                }
                                                cyxVar.d = r3;
                                                r4 = r3;
                                                break;
                                        }
                                    } else {
                                        i = -1;
                                        czcVar.k(i3).e = jA;
                                    }
                                    r3 = 0;
                                    cyxVar.d = r3;
                                    r4 = r3;
                                }
                                i2 = 1;
                                z2 = true;
                                r5 = r4;
                            } else {
                                long j6 = ((cvb) cvjVar).b;
                                arrayDeque.push(new yvt(i3, cyxVar.f + j6));
                                ((czc) cyxVar.g.a).o(cyxVar.e, j6, cyxVar.f);
                                z = false;
                                cyxVar.d = 0;
                            }
                            z2 = true;
                            r5 = z;
                        } else {
                            ((cvb) cvjVar).p((int) cyxVar.f, false);
                            cyxVar.d = 0;
                            z14 = false;
                        }
                    }
                    cyxVar.f = cyxVar.c.c(cvjVar, z14, true, 8);
                    cyxVar.d = 2;
                    qcb qcbVar2 = cyxVar.g;
                    i3 = cyxVar.e;
                    czcVar = (czc) qcbVar2.a;
                    iH = czcVar.h(i3);
                    if (iH != 0) {
                        if (iH != 1) {
                            if (iH != 2) {
                                if (iH != 3) {
                                    i5 = -1;
                                    j3 = cyxVar.f;
                                    if (j3 <= 2147483647L) {
                                        throw new bsz(a.bS(j3, "String element size: "), null, true, 1);
                                    }
                                    i6 = (int) j3;
                                    if (i6 == 0) {
                                        str = "";
                                    } else {
                                        bArr = new byte[i6];
                                        ((cvb) cvjVar).o(bArr, z14 ? 1 : 0, i6, z14);
                                        while (i6 > 0) {
                                            i7 = i6 - 1;
                                            if (bArr[i7] == 0) {
                                                i6 = i7;
                                            } else {
                                                str = new String(bArr, z14 ? 1 : 0, i6);
                                            }
                                        }
                                        str = new String(bArr, z14 ? 1 : 0, i6);
                                    }
                                    czcVar.p(i3, str);
                                    cyxVar.d = z14 ? 1 : 0;
                                    z8 = z14;
                                } else if (iH != 4) {
                                    j5 = cyxVar.f;
                                    if (j5 == 4) {
                                    }
                                    i33 = (int) j5;
                                    jA2 = cyxVar.a(cvjVar, i33);
                                    if (i33 == 4) {
                                        dLongBitsToDouble = Float.intBitsToFloat((int) jA2);
                                    } else {
                                        dLongBitsToDouble = Double.longBitsToDouble(jA2);
                                    }
                                    if (i3 != 181) {
                                        czcVar.k(i3).T = (int) dLongBitsToDouble;
                                    } else if (i3 != 17545) {
                                        switch (i3) {
                                            case 21969:
                                                czcVar.k(i3).F = (float) dLongBitsToDouble;
                                                break;
                                            case 21970:
                                                czcVar.k(i3).G = (float) dLongBitsToDouble;
                                                break;
                                            case 21971:
                                                czcVar.k(i3).H = (float) dLongBitsToDouble;
                                                break;
                                            case 21972:
                                                czcVar.k(i3).I = (float) dLongBitsToDouble;
                                                break;
                                            case 21973:
                                                czcVar.k(i3).J = (float) dLongBitsToDouble;
                                                break;
                                            case 21974:
                                                czcVar.k(i3).K = (float) dLongBitsToDouble;
                                                break;
                                            case 21975:
                                                czcVar.k(i3).L = (float) dLongBitsToDouble;
                                                break;
                                            case 21976:
                                                czcVar.k(i3).M = (float) dLongBitsToDouble;
                                                break;
                                            case 21977:
                                                czcVar.k(i3).N = (float) dLongBitsToDouble;
                                                break;
                                            case 21978:
                                                czcVar.k(i3).O = (float) dLongBitsToDouble;
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 30323:
                                                        czcVar.k(i3).v = (float) dLongBitsToDouble;
                                                        break;
                                                    case 30324:
                                                        czcVar.k(i3).w = (float) dLongBitsToDouble;
                                                        break;
                                                    case 30325:
                                                        czcVar.k(i3).x = (float) dLongBitsToDouble;
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        czcVar.f = (long) dLongBitsToDouble;
                                    }
                                    cyxVar.d = z14 ? 1 : 0;
                                    z = z14;
                                } else {
                                    i8 = (int) cyxVar.f;
                                    i5 = -1;
                                    if (i3 != 161) {
                                        if (czcVar.ae == 0) {
                                            czd czdVar2 = czcVar.v;
                                            czcVar.aj = (int) czdVar2.c(cvjVar, z14, true, 8);
                                            czcVar.ak = czdVar2.a;
                                            czcVar.o = -9223372036854775807L;
                                            czcVar.ae = 1;
                                            czcVar.E.L(z14 ? 1 : 0);
                                        }
                                        czbVar = (czb) czcVar.w.get(czcVar.aj);
                                        if (czbVar == null) {
                                            ((cvb) cvjVar).p(i8 - czcVar.ak, z14);
                                            czcVar.ae = z14 ? 1 : 0;
                                            z9 = z14;
                                        } else {
                                            czbVar.c();
                                            if (czcVar.ae == 1) {
                                                czcVar.x(cvjVar, 3);
                                                bwbVar = czcVar.E;
                                                i12 = (bwbVar.b[2] & 6) >> 1;
                                                b2 = 255;
                                                if (i12 == 0) {
                                                    czcVar.ah = 1;
                                                    int[] iArrC3 = C(czcVar.ai, 1);
                                                    czcVar.ai = iArrC3;
                                                    iArrC3[z14 ? 1 : 0] = (i8 - czcVar.ak) - 3;
                                                } else {
                                                    czcVar.x(cvjVar, 4);
                                                    int i310 = (bwbVar.b[3] & 255) + 1;
                                                    czcVar.ah = i310;
                                                    iArrC = C(czcVar.ai, i310);
                                                    czcVar.ai = iArrC;
                                                    if (i12 == 2) {
                                                        int i311 = (i8 - czcVar.ak) - 4;
                                                        int i312 = czcVar.ah;
                                                        Arrays.fill(iArrC, z14 ? 1 : 0, i312, i311 / i312);
                                                    } else if (i12 == 1) {
                                                        i25 = z14 ? 1 : 0;
                                                        i26 = i25;
                                                        i27 = 4;
                                                        z10 = z14;
                                                        while (true) {
                                                            i28 = czcVar.ah - 1;
                                                            if (i25 < i28) {
                                                                czcVar.ai[i25] = z10 ? 1 : 0;
                                                                z11 = z10;
                                                                while (true) {
                                                                    i29 = i27 + 1;
                                                                    czcVar.x(cvjVar, i29);
                                                                    i30 = bwbVar.b[i27] & 255;
                                                                    z12 = z11;
                                                                    int[] iArr4 = czcVar.ai;
                                                                    i31 = iArr4[i25] + i30;
                                                                    iArr4[i25] = i31;
                                                                    if (i30 != 255) {
                                                                        break;
                                                                    }
                                                                    i27 = i29;
                                                                    z11 = z12 ? 1 : 0;
                                                                }
                                                                i26 += i31;
                                                                i25++;
                                                                i27 = i29;
                                                                z10 = z12 ? 1 : 0;
                                                            } else {
                                                                i13 = z10 ? 1 : 0;
                                                                czcVar.ai[i28] = ((i8 - czcVar.ak) - i27) - i26;
                                                                i18 = 2;
                                                            }
                                                        }
                                                    } else {
                                                        i13 = z14 ? 1 : 0;
                                                        if (i12 != 3) {
                                                            throw new bsz("Unexpected lacing value: 2", null, true, 1);
                                                        }
                                                        i14 = i13 == true ? 1 : 0;
                                                        i15 = i14;
                                                        i16 = 4;
                                                        while (true) {
                                                            i17 = czcVar.ah - 1;
                                                            if (i14 < i17) {
                                                                czcVar.ai[i14] = i13 == true ? 1 : 0;
                                                                i19 = i16 + 1;
                                                                czcVar.x(cvjVar, i19);
                                                                if (bwbVar.b[i16] == 0) {
                                                                    ?? r7 = i2;
                                                                    throw new bsz("No valid varint length mask found", null, r7, r7 == true ? 1 : 0);
                                                                }
                                                                i20 = i13 == true ? 1 : 0;
                                                                while (true) {
                                                                    if (i20 < 8) {
                                                                        i22 = i2 << (7 - i20);
                                                                        i21 = i35;
                                                                        if ((bwbVar.b[i16] & i22) != 0) {
                                                                            i23 = i19 + i20;
                                                                            czcVar.x(cvjVar, i23);
                                                                            j4 = bwbVar.b[i16] & b2 & (~i22);
                                                                            i24 = i16 + 1;
                                                                            while (i24 < i23) {
                                                                                j4 = (j4 << 8) | ((long) (bwbVar.b[i24] & 255));
                                                                                i24++;
                                                                                i23 = i23;
                                                                            }
                                                                            int i313 = i23;
                                                                            if (i14 > 0) {
                                                                                j4 -= (1 << ((i20 * 7) + 6)) + j;
                                                                            }
                                                                            i16 = i313;
                                                                        } else {
                                                                            i20++;
                                                                            i35 = i21;
                                                                            i2 = 1;
                                                                            b2 = 255;
                                                                        }
                                                                    } else {
                                                                        i21 = i35;
                                                                        i16 = i19;
                                                                        j4 = 0;
                                                                    }
                                                                }
                                                                if (j4 >= -2147483648L) {
                                                                }
                                                                throw new bsz("EBML lacing sample size out of range.", null, true, 1);
                                                            }
                                                            i18 = i35;
                                                            czcVar.ai[i17] = ((i8 - czcVar.ak) - i16) - i15;
                                                            iArr2[i14] = i40;
                                                            i15 += i40;
                                                            i14++;
                                                            i35 = i21;
                                                            i2 = 1;
                                                            b2 = 255;
                                                        }
                                                    }
                                                    byte[] bArr6 = bwbVar.b;
                                                    czcVar.af = czcVar.n + czcVar.i((bArr6[i13] << 8) | (bArr6[1] & 255));
                                                    if (czbVar.f != 1) {
                                                        i32 = 1;
                                                    } else if (i3 == 163) {
                                                        if ((bwbVar.b[i18] & 128) == 128) {
                                                            i32 = 1;
                                                        } else {
                                                            i32 = i13;
                                                        }
                                                        i3 = 163;
                                                    } else {
                                                        i32 = i13;
                                                    }
                                                    czcVar.al = i32;
                                                    czcVar.ae = i18;
                                                    czcVar.ag = i13 == true ? 1 : 0;
                                                    i9 = 163;
                                                }
                                                i13 = z14 ? 1 : 0;
                                                i18 = 2;
                                                byte[] bArr7 = bwbVar.b;
                                                czcVar.af = czcVar.n + czcVar.i((bArr7[i13] << 8) | (bArr7[1] & 255));
                                                if (czbVar.f != 1) {
                                                    i32 = 1;
                                                } else if (i3 == 163) {
                                                    if ((bwbVar.b[i18] & 128) == 128) {
                                                        i32 = 1;
                                                    } else {
                                                        i32 = i13;
                                                    }
                                                    i3 = 163;
                                                } else {
                                                    i32 = i13;
                                                }
                                                czcVar.al = i32;
                                                czcVar.ae = i18;
                                                czcVar.ag = i13 == true ? 1 : 0;
                                                i9 = 163;
                                            } else {
                                                i9 = 163;
                                            }
                                            if (i3 == i9) {
                                                while (true) {
                                                    i11 = czcVar.ag;
                                                    if (i11 < czcVar.ah) {
                                                        czcVar.u(czbVar, czcVar.af + ((long) ((czcVar.ag * czbVar.g) / 1000)), czcVar.al, czcVar.r(cvjVar, czbVar, czcVar.ai[i11], false), 0);
                                                        czcVar.ag++;
                                                    } else {
                                                        z9 = false;
                                                        czcVar.ae = 0;
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    i10 = czcVar.ag;
                                                    if (i10 < czcVar.ah) {
                                                        int[] iArr5 = czcVar.ai;
                                                        iArr5[i10] = czcVar.r(cvjVar, czbVar, iArr5[i10], true);
                                                        czcVar.ag++;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (czcVar.ae == 0) {
                                            czd czdVar3 = czcVar.v;
                                            czcVar.aj = (int) czdVar3.c(cvjVar, z14, true, 8);
                                            czcVar.ak = czdVar3.a;
                                            czcVar.o = -9223372036854775807L;
                                            czcVar.ae = 1;
                                            czcVar.E.L(z14 ? 1 : 0);
                                        }
                                        czbVar = (czb) czcVar.w.get(czcVar.aj);
                                        if (czbVar == null) {
                                            ((cvb) cvjVar).p(i8 - czcVar.ak, z14);
                                            czcVar.ae = z14 ? 1 : 0;
                                            z9 = z14;
                                        } else {
                                            czbVar.c();
                                            if (czcVar.ae == 1) {
                                                czcVar.x(cvjVar, 3);
                                                bwbVar = czcVar.E;
                                                i12 = (bwbVar.b[2] & 6) >> 1;
                                                b2 = 255;
                                                if (i12 == 0) {
                                                    czcVar.ah = 1;
                                                    int[] iArrC4 = C(czcVar.ai, 1);
                                                    czcVar.ai = iArrC4;
                                                    iArrC4[z14 ? 1 : 0] = (i8 - czcVar.ak) - 3;
                                                } else {
                                                    czcVar.x(cvjVar, 4);
                                                    int i314 = (bwbVar.b[3] & 255) + 1;
                                                    czcVar.ah = i314;
                                                    iArrC = C(czcVar.ai, i314);
                                                    czcVar.ai = iArrC;
                                                    if (i12 == 2) {
                                                        int i315 = (i8 - czcVar.ak) - 4;
                                                        int i316 = czcVar.ah;
                                                        Arrays.fill(iArrC, z14 ? 1 : 0, i316, i315 / i316);
                                                    } else if (i12 == 1) {
                                                        i25 = z14 ? 1 : 0;
                                                        i26 = i25;
                                                        i27 = 4;
                                                        z10 = z14;
                                                        while (true) {
                                                            i28 = czcVar.ah - 1;
                                                            if (i25 < i28) {
                                                                czcVar.ai[i25] = z10 ? 1 : 0;
                                                                z11 = z10;
                                                                while (true) {
                                                                    i29 = i27 + 1;
                                                                    czcVar.x(cvjVar, i29);
                                                                    i30 = bwbVar.b[i27] & 255;
                                                                    z12 = z11;
                                                                    int[] iArr6 = czcVar.ai;
                                                                    i31 = iArr6[i25] + i30;
                                                                    iArr6[i25] = i31;
                                                                    if (i30 != 255) {
                                                                        break;
                                                                    }
                                                                    i27 = i29;
                                                                    z11 = z12 ? 1 : 0;
                                                                }
                                                                i26 += i31;
                                                                i25++;
                                                                i27 = i29;
                                                                z10 = z12 ? 1 : 0;
                                                            } else {
                                                                i13 = z10 ? 1 : 0;
                                                                czcVar.ai[i28] = ((i8 - czcVar.ak) - i27) - i26;
                                                                i18 = 2;
                                                            }
                                                        }
                                                    } else {
                                                        i13 = z14 ? 1 : 0;
                                                        if (i12 != 3) {
                                                            throw new bsz("Unexpected lacing value: 2", null, true, 1);
                                                        }
                                                        i14 = i13 == true ? 1 : 0;
                                                        i15 = i14;
                                                        i16 = 4;
                                                        while (true) {
                                                            i17 = czcVar.ah - 1;
                                                            if (i14 < i17) {
                                                                czcVar.ai[i14] = i13 == true ? 1 : 0;
                                                                i19 = i16 + 1;
                                                                czcVar.x(cvjVar, i19);
                                                                if (bwbVar.b[i16] == 0) {
                                                                    ?? r8 = i2;
                                                                    throw new bsz("No valid varint length mask found", null, r8, r8 == true ? 1 : 0);
                                                                }
                                                                i20 = i13 == true ? 1 : 0;
                                                                while (true) {
                                                                    if (i20 < 8) {
                                                                        i22 = i2 << (7 - i20);
                                                                        i21 = i35;
                                                                        if ((bwbVar.b[i16] & i22) != 0) {
                                                                            i23 = i19 + i20;
                                                                            czcVar.x(cvjVar, i23);
                                                                            j4 = bwbVar.b[i16] & b2 & (~i22);
                                                                            i24 = i16 + 1;
                                                                            while (i24 < i23) {
                                                                                j4 = (j4 << 8) | ((long) (bwbVar.b[i24] & 255));
                                                                                i24++;
                                                                                i23 = i23;
                                                                            }
                                                                            int i317 = i23;
                                                                            if (i14 > 0) {
                                                                                j4 -= (1 << ((i20 * 7) + 6)) + j;
                                                                            }
                                                                            i16 = i317;
                                                                        } else {
                                                                            i20++;
                                                                            i35 = i21;
                                                                            i2 = 1;
                                                                            b2 = 255;
                                                                        }
                                                                    } else {
                                                                        i21 = i35;
                                                                        i16 = i19;
                                                                        j4 = 0;
                                                                    }
                                                                }
                                                                if (j4 >= -2147483648L) {
                                                                }
                                                                throw new bsz("EBML lacing sample size out of range.", null, true, 1);
                                                            }
                                                            i18 = i35;
                                                            czcVar.ai[i17] = ((i8 - czcVar.ak) - i16) - i15;
                                                            iArr2[i14] = i40;
                                                            i15 += i40;
                                                            i14++;
                                                            i35 = i21;
                                                            i2 = 1;
                                                            b2 = 255;
                                                        }
                                                    }
                                                    byte[] bArr8 = bwbVar.b;
                                                    czcVar.af = czcVar.n + czcVar.i((bArr8[i13] << 8) | (bArr8[1] & 255));
                                                    if (czbVar.f != 1) {
                                                        i32 = 1;
                                                    } else if (i3 == 163) {
                                                        if ((bwbVar.b[i18] & 128) == 128) {
                                                            i32 = 1;
                                                        } else {
                                                            i32 = i13;
                                                        }
                                                        i3 = 163;
                                                    } else {
                                                        i32 = i13;
                                                    }
                                                    czcVar.al = i32;
                                                    czcVar.ae = i18;
                                                    czcVar.ag = i13 == true ? 1 : 0;
                                                    i9 = 163;
                                                }
                                                i13 = z14 ? 1 : 0;
                                                i18 = 2;
                                                byte[] bArr9 = bwbVar.b;
                                                czcVar.af = czcVar.n + czcVar.i((bArr9[i13] << 8) | (bArr9[1] & 255));
                                                if (czbVar.f != 1) {
                                                    i32 = 1;
                                                } else if (i3 == 163) {
                                                    if ((bwbVar.b[i18] & 128) == 128) {
                                                        i32 = 1;
                                                    } else {
                                                        i32 = i13;
                                                    }
                                                    i3 = 163;
                                                } else {
                                                    i32 = i13;
                                                }
                                                czcVar.al = i32;
                                                czcVar.ae = i18;
                                                czcVar.ag = i13 == true ? 1 : 0;
                                                i9 = 163;
                                            } else {
                                                i9 = 163;
                                            }
                                            if (i3 == i9) {
                                                while (true) {
                                                    i11 = czcVar.ag;
                                                    if (i11 < czcVar.ah) {
                                                        czcVar.u(czbVar, czcVar.af + ((long) ((czcVar.ag * czbVar.g) / 1000)), czcVar.al, czcVar.r(cvjVar, czbVar, czcVar.ai[i11], false), 0);
                                                        czcVar.ag++;
                                                    } else {
                                                        z9 = false;
                                                        czcVar.ae = 0;
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    i10 = czcVar.ag;
                                                    if (i10 < czcVar.ah) {
                                                        int[] iArr7 = czcVar.ai;
                                                        iArr7[i10] = czcVar.r(cvjVar, czbVar, iArr7[i10], true);
                                                        czcVar.ag++;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z9 = z14;
                                    z9 = z14;
                                    z9 = z14;
                                    z9 = z14;
                                    z9 = z14;
                                    z9 = z14;
                                    cyxVar.d = z9 ? 1 : 0;
                                    z8 = z9;
                                }
                                i = i5;
                                r4 = z8;
                            } else {
                                j2 = cyxVar.f;
                                if (j2 <= 8) {
                                    throw new bsz(a.bS(j2, "Invalid integer size: "), null, true, 1);
                                }
                                jA = cyxVar.a(cvjVar, (int) j2);
                                if (i3 != 136) {
                                    i = -1;
                                    if (jA == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    czcVar.k(i3).aa = z3;
                                } else if (i3 != 137) {
                                    i = -1;
                                    czcVar.j(i3).e = jA;
                                } else if (i3 != 145) {
                                    i = -1;
                                    czcVar.j(i3).b = jA;
                                } else if (i3 != 146) {
                                    i = -1;
                                    czcVar.j(i3).c = jA;
                                } else if (i3 != 240) {
                                    i = -1;
                                    if (!czcVar.h) {
                                        czcVar.l(i3);
                                        if (czcVar.m == j) {
                                            czcVar.m = jA;
                                        }
                                    }
                                } else if (i3 != 241) {
                                    i = -1;
                                    if (!czcVar.h) {
                                        czcVar.l(i3);
                                        if (czcVar.l == j) {
                                            czcVar.l = jA;
                                        }
                                    }
                                } else if (i3 != 20529) {
                                    i = -1;
                                    if (jA != 0) {
                                        throw new bsz(a.cf(jA, "ContentEncodingOrder ", " not supported"), null, true, 1);
                                    }
                                } else if (i3 != 20530) {
                                    i = -1;
                                    if (jA != 1) {
                                        throw new bsz(a.cf(jA, "ContentEncodingScope ", " not supported"), null, true, 1);
                                    }
                                } else if (i3 != 29636) {
                                    i = -1;
                                    czcVar.j(i3).a = jA;
                                } else if (i3 != 29637) {
                                    i4 = (int) jA;
                                    switch (i3) {
                                        case 131:
                                            if (i4 != 1) {
                                                i = -1;
                                                czcVar.k(i3).f = 2;
                                            } else if (i4 != 2) {
                                                i = -1;
                                                czcVar.k(i3).f = 1;
                                            } else if (i4 != 17) {
                                                i = -1;
                                                czcVar.k(i3).f = 3;
                                            } else if (i4 != 33) {
                                                i = -1;
                                                czcVar.k(i3).f = 5;
                                            } else {
                                                i = -1;
                                                czcVar.k(i3).f = -1;
                                            }
                                            break;
                                        case 152:
                                            if (jA == 1) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            czcVar.j(i3).d = z4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 155:
                                            czcVar.o = czcVar.i(jA);
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 159:
                                            czcVar.k(i3).Q = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 176:
                                            czcVar.k(i3).o = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 179:
                                            if (!czcVar.h) {
                                                czcVar.l(i3);
                                                czcVar.j = czcVar.i(jA);
                                            }
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 186:
                                            czcVar.k(i3).p = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 215:
                                            czcVar.k(i3).d = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 231:
                                            czcVar.n = czcVar.i(jA);
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 238:
                                            czcVar.p = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 247:
                                            if (!czcVar.h) {
                                                czcVar.l(i3);
                                                czcVar.k = (int) jA;
                                            }
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 251:
                                            czcVar.q = true;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 16871:
                                            czcVar.k(i3).i = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 16980:
                                            if (jA != 3) {
                                                throw new bsz(a.cf(jA, "ContentCompAlgo ", " not supported"), null, true, 1);
                                            }
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 17029:
                                            if (jA >= 1) {
                                            }
                                            throw new bsz(a.cf(jA, "DocTypeReadVersion ", " not supported"), null, true, 1);
                                        case 17143:
                                            if (jA != 1) {
                                                throw new bsz(a.cf(jA, "EBMLReadVersion ", " not supported"), null, true, 1);
                                            }
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 18401:
                                            if (jA != 5) {
                                                throw new bsz(a.cf(jA, "ContentEncAlgo ", " not supported"), null, true, 1);
                                            }
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 18408:
                                            if (jA != 1) {
                                                throw new bsz(a.cf(jA, "AESSettingsCipherMode ", " not supported"), null, true, 1);
                                            }
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 21420:
                                            czcVar.i = jA + czcVar.d;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 21432:
                                            czcVar.m(i3);
                                            if (i4 != 0) {
                                                z5 = false;
                                                czcVar.g.z = 0;
                                                z7 = z5;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                            } else {
                                                if (i4 != 1) {
                                                    czcVar.g.z = 2;
                                                } else if (i4 != 3) {
                                                    czcVar.g.z = 1;
                                                } else if (i4 == 15) {
                                                    czcVar.g.z = 3;
                                                }
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                            }
                                            break;
                                        case 21680:
                                            czcVar.k(i3).r = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 21682:
                                            czcVar.k(i3).t = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 21690:
                                            czcVar.k(i3).s = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 21930:
                                            if (jA == 1) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            czcVar.k(i3).Z = z6;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 21938:
                                            czcVar.m(i3);
                                            czcVar.g.q = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 21998:
                                            czcVar.k(i3).h = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 22186:
                                            czcVar.k(i3).U = jA;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 22203:
                                            czcVar.k(i3).V = jA;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 25188:
                                            czcVar.k(i3).R = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 30114:
                                            czcVar.r = jA;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 30321:
                                            czcVar.m(i3);
                                            if (i4 != 0) {
                                                z5 = false;
                                                czcVar.g.u = 0;
                                                z7 = z5;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                            } else {
                                                if (i4 != 1) {
                                                    czcVar.g.u = 1;
                                                } else if (i4 != 2) {
                                                    czcVar.g.u = 2;
                                                } else if (i4 == 3) {
                                                    czcVar.g.u = 3;
                                                }
                                                z7 = false;
                                                i = -1;
                                                r3 = z7;
                                                cyxVar.d = r3;
                                                r4 = r3;
                                            }
                                            break;
                                        case 2352003:
                                            czcVar.k(i3).g = i4;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        case 2807729:
                                            czcVar.e = jA;
                                            z7 = false;
                                            i = -1;
                                            r3 = z7;
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                        default:
                                            i = -1;
                                            switch (i3) {
                                                case 21945:
                                                    czcVar.m(i3);
                                                    if (i4 != 1) {
                                                        czcVar.g.C = 2;
                                                    } else if (i4 == 2) {
                                                        czcVar.g.C = 1;
                                                    }
                                                    z7 = false;
                                                    i = -1;
                                                    r3 = z7;
                                                    break;
                                                case 21946:
                                                    czcVar.m(i3);
                                                    iB = bru.b((int) jA);
                                                    if (iB != -1) {
                                                        czcVar.g.B = iB;
                                                    }
                                                    z7 = false;
                                                    i = -1;
                                                    r3 = z7;
                                                    break;
                                                case 21947:
                                                    czcVar.m(i3);
                                                    iA = bru.a(i4);
                                                    i = -1;
                                                    if (iA != -1) {
                                                        czcVar.g.A = iA;
                                                    }
                                                    break;
                                                case 21948:
                                                    czcVar.k(i3).D = i4;
                                                    i = -1;
                                                    break;
                                                case 21949:
                                                    czcVar.k(i3).E = i4;
                                                    i = -1;
                                                    break;
                                            }
                                            cyxVar.d = r3;
                                            r4 = r3;
                                            break;
                                    }
                                } else {
                                    i = -1;
                                    czcVar.k(i3).e = jA;
                                }
                                r3 = 0;
                                cyxVar.d = r3;
                                r4 = r3;
                            }
                            i2 = 1;
                            z2 = true;
                            r5 = r4;
                        } else {
                            long j7 = ((cvb) cvjVar).b;
                            arrayDeque.push(new yvt(i3, cyxVar.f + j7));
                            ((czc) cyxVar.g.a).o(cyxVar.e, j7, cyxVar.f);
                            z = false;
                            cyxVar.d = 0;
                        }
                        z2 = true;
                        r5 = z;
                    } else {
                        ((cvb) cvjVar).p((int) cyxVar.f, false);
                        cyxVar.d = 0;
                        z14 = false;
                    }
                } else {
                    ((czc) cyxVar.g.a).n(((yvt) arrayDeque.pop()).b);
                    i = -1;
                    z2 = true;
                    j = -1;
                    r5 = z14;
                }
            }
            if (z2) {
                long j8 = ((cvb) cvjVar).b;
                if (this.aa) {
                    this.ab = j8;
                    qhaVar.a = this.Z;
                    this.aa = r5;
                } else {
                    if (this.ac) {
                        long j9 = this.ab;
                        if (j9 != j) {
                            qhaVar.a = j9;
                            this.ab = j;
                        }
                    }
                    if (this.W) {
                        this.Y = j8;
                        qhaVar.a = this.X;
                        this.W = false;
                    } else if (this.h) {
                        long j10 = this.Y;
                        if (j10 != -1) {
                            qhaVar.a = j10;
                            this.Y = -1L;
                        }
                    }
                }
                return i2;
            }
            z13 = false;
            int i42 = 0;
            if (!z2) {
                while (true) {
                    SparseArray sparseArray = this.w;
                    if (i42 >= sparseArray.size()) {
                        return i;
                    }
                    czb czbVar6 = (czb) sparseArray.valueAt(i42);
                    czbVar6.c();
                    jtq jtqVar = czbVar6.af;
                    if (jtqVar != null) {
                        jtqVar.b(czbVar6.ac, czbVar6.l);
                    }
                    i42++;
                }
            }
        }
        return z13 ? 1 : 0;
    }

    protected int h(int i) {
        switch (i) {
            case SemanticState.Focused /* 128 */:
            case 143:
            case 160:
            case 166:
            case 174:
            case 182:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 17849:
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
            case 272869232:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 131:
            case 136:
            case 137:
            case 145:
            case 146:
            case 152:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 240:
            case 241:
            case 247:
            case 251:
            case 16871:
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
            case 29636:
            case 29637:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 133:
            case 134:
            case 17026:
            case 17276:
            case 21358:
            case 2274716:
                return 3;
            case 161:
            case 163:
            case 165:
            case 16877:
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

    public final long i(long j) throws bsz {
        long j2 = this.e;
        if (j2 != -9223372036854775807L) {
            return bwp.C(j, j2, 1000L);
        }
        throw new bsz("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    protected final cyy j(int i) throws bsz {
        cyy cyyVar = (cyy) this.R.peek();
        if (cyyVar != null) {
            return cyyVar;
        }
        throw new bsz(a.bP(i, "Element ", " must be in a ChapterAtom"), null, true, 1);
    }

    protected final czb k(int i) throws bsz {
        m(i);
        return this.g;
    }

    public final void l(int i) throws bsz {
        if (!this.U) {
            throw new bsz(a.bP(i, "Element ", " must be in a Cues"), null, true, 1);
        }
    }

    public final void m(int i) throws bsz {
        if (this.g == null) {
            throw new bsz(a.bP(i, "Element ", " must be in a TrackEntry"), null, true, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:262:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:265:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:267:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:268:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:270:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:271:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:273:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:274:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:276:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:277:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:279:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:280:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:282:0x0404  */
    /* JADX WARN: Code duplicated, block: B:283:0x0408  */
    /* JADX WARN: Code duplicated, block: B:285:0x0410  */
    /* JADX WARN: Code duplicated, block: B:286:0x0414  */
    /* JADX WARN: Code duplicated, block: B:288:0x041c  */
    /* JADX WARN: Code duplicated, block: B:289:0x041f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0427  */
    /* JADX WARN: Code duplicated, block: B:292:0x042b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0433  */
    /* JADX WARN: Code duplicated, block: B:295:0x0437  */
    /* JADX WARN: Code duplicated, block: B:297:0x043f  */
    /* JADX WARN: Code duplicated, block: B:298:0x0443  */
    /* JADX WARN: Code duplicated, block: B:300:0x044b  */
    /* JADX WARN: Code duplicated, block: B:301:0x044f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0457  */
    /* JADX WARN: Code duplicated, block: B:304:0x045b  */
    /* JADX WARN: Code duplicated, block: B:306:0x0463  */
    /* JADX WARN: Code duplicated, block: B:307:0x0467  */
    /* JADX WARN: Code duplicated, block: B:309:0x046f  */
    /* JADX WARN: Code duplicated, block: B:310:0x0473  */
    /* JADX WARN: Code duplicated, block: B:312:0x047b  */
    /* JADX WARN: Code duplicated, block: B:313:0x047f  */
    /* JADX WARN: Code duplicated, block: B:315:0x0487  */
    /* JADX WARN: Code duplicated, block: B:316:0x048a  */
    /* JADX WARN: Code duplicated, block: B:318:0x0492  */
    /* JADX WARN: Code duplicated, block: B:319:0x0495  */
    /* JADX WARN: Code duplicated, block: B:321:0x049d  */
    /* JADX WARN: Code duplicated, block: B:322:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:324:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:325:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:327:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:328:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:330:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:331:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:333:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:334:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:336:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:337:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:339:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:340:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:342:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:343:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:345:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:346:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:348:0x0505  */
    /* JADX WARN: Code duplicated, block: B:349:0x0508  */
    /* JADX WARN: Code duplicated, block: B:351:0x0510  */
    /* JADX WARN: Code duplicated, block: B:352:0x0513  */
    /* JADX WARN: Code duplicated, block: B:354:0x051b  */
    /* JADX WARN: Code duplicated, block: B:355:0x051e  */
    /* JADX WARN: Code duplicated, block: B:357:0x0526  */
    /* JADX WARN: Code duplicated, block: B:358:0x0529  */
    /* JADX WARN: Code duplicated, block: B:360:0x0531  */
    /* JADX WARN: Code duplicated, block: B:361:0x0534  */
    /* JADX WARN: Code duplicated, block: B:363:0x053c  */
    /* JADX WARN: Code duplicated, block: B:364:0x053f  */
    /* JADX WARN: Code duplicated, block: B:366:0x0545  */
    /* JADX WARN: Code duplicated, block: B:367:0x0547  */
    /* JADX WARN: Code duplicated, block: B:369:0x054d  */
    /* JADX WARN: Code duplicated, block: B:370:0x054f  */
    /* JADX WARN: Code duplicated, block: B:373:0x055b  */
    /* JADX WARN: Code duplicated, block: B:375:0x0565  */
    /* JADX WARN: Code duplicated, block: B:376:0x0576  */
    /* JADX WARN: Code duplicated, block: B:377:0x057a  */
    /* JADX WARN: Code duplicated, block: B:378:0x0586  */
    /* JADX WARN: Code duplicated, block: B:379:0x058a  */
    /* JADX WARN: Code duplicated, block: B:380:0x0598  */
    /* JADX WARN: Code duplicated, block: B:381:0x059c  */
    /* JADX WARN: Code duplicated, block: B:383:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:384:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:386:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:387:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:389:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:391:0x0609  */
    /* JADX WARN: Code duplicated, block: B:393:0x061a  */
    /* JADX WARN: Code duplicated, block: B:395:0x0622  */
    /* JADX WARN: Code duplicated, block: B:397:0x0640  */
    /* JADX WARN: Code duplicated, block: B:398:0x0646  */
    /* JADX WARN: Code duplicated, block: B:401:0x065a  */
    /* JADX WARN: Code duplicated, block: B:405:0x0677  */
    /* JADX WARN: Code duplicated, block: B:406:0x067a  */
    /* JADX WARN: Code duplicated, block: B:407:0x067d  */
    /* JADX WARN: Code duplicated, block: B:408:0x0682  */
    /* JADX WARN: Code duplicated, block: B:409:0x068b A[PHI: r5
      0x068b: PHI (r5v61 java.lang.String) = 
      (r5v11 java.lang.String)
      (r5v13 java.lang.String)
      (r5v15 java.lang.String)
      (r5v25 java.lang.String)
      (r5v42 java.lang.String)
      (r5v43 java.lang.String)
      (r5v44 java.lang.String)
      (r5v45 java.lang.String)
      (r5v46 java.lang.String)
      (r5v47 java.lang.String)
      (r5v57 java.lang.String)
      (r5v59 java.lang.String)
      (r5v62 java.lang.String)
     binds: [B:446:0x07fa, B:436:0x07c5, B:434:0x07bd, B:421:0x0733, B:411:0x0696, B:410:0x0693, B:408:0x0682, B:407:0x067d, B:406:0x067a, B:405:0x0677, B:380:0x0598, B:378:0x0586, B:376:0x0576] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:410:0x0693  */
    /* JADX WARN: Code duplicated, block: B:411:0x0696  */
    /* JADX WARN: Code duplicated, block: B:412:0x0699  */
    /* JADX WARN: Code duplicated, block: B:413:0x069e  */
    /* JADX WARN: Code duplicated, block: B:415:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:416:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:420:0x0726  */
    /* JADX WARN: Code duplicated, block: B:421:0x0733  */
    /* JADX WARN: Code duplicated, block: B:422:0x0737  */
    /* JADX WARN: Code duplicated, block: B:423:0x074f A[PHI: r2 r5
      0x074f: PHI (r2v153 java.util.List) = 
      (r2v20 java.util.List)
      (r2v23 java.util.List)
      (r2v27 java.util.List)
      (r2v40 java.util.List)
      (r2v54 java.util.List)
      (r2v58 java.util.List)
      (r2v82 java.util.List)
      (r2v84 java.util.List)
      (r2v155 java.util.List)
     binds: [B:445:0x07f6, B:438:0x07d1, B:433:0x07ba, B:422:0x0737, B:402:0x066a, B:399:0x0656, B:379:0x058a, B:377:0x057a, B:375:0x0565] A[DONT_GENERATE, DONT_INLINE]
      0x074f: PHI (r5v66 java.lang.String) = 
      (r5v12 java.lang.String)
      (r5v13 java.lang.String)
      (r5v16 java.lang.String)
      (r5v24 java.lang.String)
      (r5v48 java.lang.String)
      (r5v50 java.lang.String)
      (r5v58 java.lang.String)
      (r5v60 java.lang.String)
      (r5v67 java.lang.String)
     binds: [B:445:0x07f6, B:438:0x07d1, B:433:0x07ba, B:422:0x0737, B:402:0x066a, B:399:0x0656, B:379:0x058a, B:377:0x057a, B:375:0x0565] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:426:0x075e  */
    /* JADX WARN: Code duplicated, block: B:427:0x0782  */
    /* JADX WARN: Code duplicated, block: B:429:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:431:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:432:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:434:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:435:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:437:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:440:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:441:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:443:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:444:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:446:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:449:0x0802  */
    /* JADX WARN: Code duplicated, block: B:452:0x0819  */
    /* JADX WARN: Code duplicated, block: B:453:0x081c  */
    /* JADX WARN: Code duplicated, block: B:456:0x082b  */
    /* JADX WARN: Code duplicated, block: B:457:0x083b  */
    /* JADX WARN: Code duplicated, block: B:459:0x0841  */
    /* JADX WARN: Code duplicated, block: B:461:0x0845  */
    /* JADX WARN: Code duplicated, block: B:463:0x084a  */
    /* JADX WARN: Code duplicated, block: B:466:0x0852  */
    /* JADX WARN: Code duplicated, block: B:468:0x0857  */
    /* JADX WARN: Code duplicated, block: B:471:0x085e  */
    /* JADX WARN: Code duplicated, block: B:474:0x0873  */
    /* JADX WARN: Code duplicated, block: B:476:0x0878 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:477:0x087a  */
    /* JADX WARN: Code duplicated, block: B:478:0x087f  */
    /* JADX WARN: Code duplicated, block: B:479:0x0881  */
    /* JADX WARN: Code duplicated, block: B:482:0x088a  */
    /* JADX WARN: Code duplicated, block: B:483:0x0890 A[PHI: r7 r13 r14
      0x0890: PHI (r7v19 int) = (r7v18 int), (r7v82 int), (r7v18 int) binds: [B:475:0x0876, B:482:0x088a, B:481:0x0885] A[DONT_GENERATE, DONT_INLINE]
      0x0890: PHI (r13v15 int) = (r13v14 int), (r13v18 int), (r13v20 int) binds: [B:475:0x0876, B:482:0x088a, B:481:0x0885] A[DONT_GENERATE, DONT_INLINE]
      0x0890: PHI (r14v14 int) = (r14v13 int), (r14v17 int), (r14v18 int) binds: [B:475:0x0876, B:482:0x088a, B:481:0x0885] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:486:0x0898  */
    /* JADX WARN: Code duplicated, block: B:489:0x089f A[PHI: r6
      0x089f: PHI (r6v16 int) = (r6v15 int), (r6v47 int) binds: [B:485:0x0896, B:487:0x089a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:491:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:493:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:494:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:495:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:498:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:517:0x0969  */
    /* JADX WARN: Code duplicated, block: B:520:0x0976  */
    /* JADX WARN: Code duplicated, block: B:521:0x098b  */
    /* JADX WARN: Code duplicated, block: B:524:0x0991  */
    /* JADX WARN: Code duplicated, block: B:542:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:544:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:546:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:565:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:566:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:618:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:? A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0656, code lost:
    
        if (r3 == 0) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x066a, code lost:
    
        if (r3 != 0) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x066c, code lost:
    
        r6 = r3;
        r3 = r2;
        r2 = r6;
        r16 = r5;
        r12 = null;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:383:0x05a4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:386:0x05c5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:389:0x05e4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:395:0x0622, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void n(int r31) throws defpackage.bsz {
        /*
            Method dump skipped, instruction units count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czc.n(int):void");
    }

    protected void o(int i, long j, long j2) throws bsz {
        t();
        if (i == 128) {
            j(i).h = null;
            j(i).i = null;
            return;
        }
        if (i == 160) {
            this.q = false;
            this.r = 0L;
            return;
        }
        if (i == 174) {
            czb czbVar = new czb();
            this.g = czbVar;
            czbVar.a = this.P;
            return;
        }
        if (i == 187) {
            if (this.h) {
                return;
            }
            l(i);
            this.j = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            this.S = -1;
            this.i = -1L;
            return;
        }
        if (i == 20533) {
            k(i).j = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.d;
            if (j3 != -1 && j3 != j) {
                throw new bsz("Multiple Segment elements not supported", null, true, 1);
            }
            this.d = j;
            this.N = j2;
            return;
        }
        if (i == 475249515) {
            if (this.h) {
                return;
            }
            this.U = true;
            return;
        }
        if (i == 524531317) {
            if (this.Z == -1 || this.ac) {
                w();
                return;
            } else {
                this.aa = true;
                return;
            }
        }
        if (i == 182) {
            this.R.push(new cyy());
            return;
        }
        if (i != 183 || this.h) {
            return;
        }
        l(i);
        this.k = -1;
        this.l = -1L;
        this.m = -1L;
    }

    protected void p(int i, String str) throws bsz {
        if (i == 133) {
            j(i).h = str;
            return;
        }
        if (i == 134) {
            k(i).c = str;
            return;
        }
        if (i == 17026) {
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw new bsz(a.bT(str, "DocType ", " not supported"), null, true, 1);
            }
            this.P = Objects.equals(str, "webm");
            return;
        }
        if (i == 17276) {
            j(i).i = str;
        } else if (i == 21358) {
            k(i).b = str;
        } else if (i == 2274716) {
            k(i).ab = str;
        }
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }

    @Deprecated
    public czc(byte[] bArr) {
        this(new cyx(), 3, dbl.a);
    }

    @Deprecated
    public czc() {
        this(new cyx(), 2, dbl.a);
    }

    public czc(dbl dblVar, int i) {
        this(new cyx(), i, dblVar);
    }
}
