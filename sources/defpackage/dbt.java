package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.cardboard.sdk.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dbt extends dcb {
    private boolean A;
    private long B;
    private final int l;
    private final int m;
    private final int n;
    private List r;
    private List s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private byte x;
    private byte y;
    private static final int[] d = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] e = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] a = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] f = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] g = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] h = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] i = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, R.styleable.AppCompatTheme_windowMinWidthMinor, 92, 94, 95, R.styleable.AppCompatTheme_windowMinWidthMajor, R.styleable.AppCompatTheme_windowNoTitle, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, ModuleDescriptor.MODULE_VERSION, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] j = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final bwb k = new bwb();
    private final ArrayList p = new ArrayList();
    private dbs q = new dbs(0, 4);
    private int z = 0;
    private final long o = 16000000;

    public dbt(String str, int i2) {
        this.l = true != "application/x-mp4-cea-608".equals(str) ? 3 : 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.n = 0;
                } else if (i2 != 4) {
                    bvx.e("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                    this.n = 0;
                    this.m = 0;
                } else {
                    this.n = 1;
                }
                this.m = 1;
            } else {
                this.n = 1;
            }
            h(0);
            g();
            this.A = true;
            this.B = -9223372036854775807L;
        }
        this.n = 0;
        this.m = 0;
        h(0);
        g();
        this.A = true;
        this.B = -9223372036854775807L;
    }

    private static char e(byte b) {
        return (char) f[b - 32];
    }

    private final List f() {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i2 = 0; i2 < size; i2++) {
            bus busVarB = ((dbs) arrayList.get(i2)).b(Integer.MIN_VALUE);
            arrayList2.add(busVarB);
            if (busVarB != null) {
                iMin = Math.min(iMin, busVarB.C);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            bus busVarB2 = (bus) arrayList2.get(i3);
            if (busVarB2 != null) {
                if (busVarB2.C != iMin) {
                    busVarB2 = ((dbs) arrayList.get(i3)).b(iMin);
                    busVarB2.getClass();
                }
                arrayList3.add(busVarB2);
            }
        }
        return arrayList3;
    }

    private final void g() {
        this.q.e(this.t);
        ArrayList arrayList = this.p;
        arrayList.clear();
        arrayList.add(this.q);
    }

    private final void h(int i2) {
        int i3 = this.t;
        if (i3 == i2) {
            return;
        }
        this.t = i2;
        if (i2 != 3) {
            g();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.r = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.p;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((dbs) arrayList.get(i4)).g = 3;
            i4++;
        }
    }

    private final void i(int i2) {
        this.u = i2;
        this.q.h = i2;
    }

    private static boolean j(byte b) {
        return (b & 224) == 0;
    }

    @Override // defpackage.dcb
    protected final dbd a() {
        List list = this.r;
        this.s = list;
        list.getClass();
        return new dcc(list);
    }

    @Override // defpackage.dcb
    /* JADX INFO: renamed from: b */
    public final dbj dequeueOutputBuffer() {
        dbj dbjVar;
        dbj dbjVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (dbjVarDequeueOutputBuffer != null) {
            return dbjVarDequeueOutputBuffer;
        }
        long j2 = this.o;
        long j3 = this.B;
        if (j3 == -9223372036854775807L || this.c - j3 < j2 || (dbjVar = (dbj) this.b.pollFirst()) == null) {
            return null;
        }
        this.r = Collections.EMPTY_LIST;
        this.B = -9223372036854775807L;
        dbjVar.d(this.c, a(), Long.MAX_VALUE);
        return dbjVar;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x017d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0193  */
    /* JADX WARN: Code duplicated, block: B:124:0x0199  */
    /* JADX WARN: Code duplicated, block: B:126:0x019d  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e8 A[LOOP:1: B:138:0x01e2->B:140:0x01e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:146:0x0202  */
    /* JADX WARN: Code duplicated, block: B:147:0x020b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0213  */
    /* JADX WARN: Code duplicated, block: B:149:0x021c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0221  */
    /* JADX WARN: Code duplicated, block: B:151:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0234  */
    /* JADX WARN: Code duplicated, block: B:171:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00de  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df A[PHI: r2
      0x00df: PHI (r2v9 int) = (r2v8 int), (r2v37 int) binds: [B:65:0x00c7, B:70:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x0105 A[DONT_INVERT, PHI: r13
      0x0105: PHI (r13v7 int) = (r13v6 int), (r13v9 int) binds: [B:72:0x00e3, B:80:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x0121  */
    /* JADX WARN: Code duplicated, block: B:91:0x0125  */
    @Override // defpackage.dcb
    protected final void c(dbi dbiVar) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List list;
        int iMin;
        int i7;
        int i8;
        ByteBuffer byteBuffer = dbiVar.data;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        bwb bwbVar = this.k;
        bwbVar.N(bArrArray, iLimit);
        boolean z2 = false;
        while (true) {
            int iD = bwbVar.d();
            int i9 = this.l;
            if (iD < i9) {
                if (z2) {
                    int i10 = this.t;
                    if (i10 == 1 || i10 == 3) {
                        this.r = f();
                        this.B = this.c;
                        return;
                    }
                    return;
                }
                return;
            }
            int iN = i9 == 2 ? -4 : bwbVar.n();
            int iN2 = bwbVar.n();
            int iN3 = bwbVar.n();
            if ((iN & 2) == 0 && (iN & 1) == this.m) {
                int i11 = iN2 & 127;
                int i12 = iN3 & 127;
                if (i11 != 0 || i12 != 0) {
                    boolean z3 = this.v;
                    if ((iN & 4) == 4) {
                        boolean[] zArr = j;
                        if (zArr[iN2] && zArr[iN3]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    byte b = (byte) i11;
                    byte b2 = (byte) i12;
                    this.v = z;
                    if (!z || (iN2 & 112) != 16) {
                        this.w = false;
                        if (!z) {
                            if (i11 <= 0 && i11 <= 15) {
                                this.A = false;
                            } else if ((iN2 & 118) == 20) {
                                if (i12 == 32 && i12 != 47) {
                                    switch (i12) {
                                        default:
                                            switch (i12) {
                                                case 42:
                                                case 43:
                                                    this.A = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.A = true;
                                            break;
                                    }
                                } else {
                                    this.A = true;
                                }
                            }
                            if (!this.A) {
                                if (j(b)) {
                                    this.z = (i11 >> 3) & 1;
                                }
                                if (this.z != this.n) {
                                    if (j(b)) {
                                        i3 = iN2 & 119;
                                        if (i3 != 17) {
                                            i4 = iN2 & 118;
                                            if (i4 != 18) {
                                                if (i3 != 17 && (iN3 & 112) == 32) {
                                                    int i13 = i12 >> 1;
                                                    boolean z4 = 1 == (iN3 & 1);
                                                    this.q.c(' ');
                                                    this.q.f(i13 & 7, z4);
                                                } else if ((iN2 & 112) != 16 && (iN3 & 64) == 64) {
                                                    int i14 = i12 >> 1;
                                                    int i15 = iN3 & 1;
                                                    int i16 = d[iN2 & 7];
                                                    if ((iN3 & 32) != 0) {
                                                        i16++;
                                                    }
                                                    dbs dbsVar = this.q;
                                                    if (i16 != dbsVar.d) {
                                                        if (this.t != 1 && !dbsVar.g()) {
                                                            dbs dbsVar2 = new dbs(this.t, this.u);
                                                            this.q = dbsVar2;
                                                            this.p.add(dbsVar2);
                                                        }
                                                        dbsVar = this.q;
                                                        dbsVar.d = i16;
                                                    }
                                                    int i17 = i14 & 7;
                                                    int i18 = iN3 & 16;
                                                    dbsVar.f(i18 == 16 ? 8 : i17, 1 == i15);
                                                    if (i18 == 16) {
                                                        this.q.e = e[i17];
                                                    }
                                                } else if (i3 != 23 && i12 >= 33 && i12 <= 35) {
                                                    this.q.f = i12 - 32;
                                                } else if (i4 == 20 && (iN3 & 112) == 32) {
                                                    if (i12 == 32) {
                                                        h(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case 37:
                                                                h(1);
                                                                i(2);
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                i(3);
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                i(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case 44:
                                                                                this.r = Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1 || i6 == 3) {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1 && !this.q.g()) {
                                                                                    dbs dbsVar3 = this.q;
                                                                                    list = dbsVar3.b;
                                                                                    list.add(dbsVar3.a());
                                                                                    dbsVar3.c.setLength(0);
                                                                                    dbsVar3.a.clear();
                                                                                    iMin = Math.min(dbsVar3.h, dbsVar3.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.r = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if ((iN3 & 96) == 32) {
                                                i7 = iN3 & 31;
                                                this.q.d();
                                                dbs dbsVar4 = this.q;
                                                if ((iN2 & 1) == 0) {
                                                    i8 = h[i7];
                                                } else {
                                                    i8 = i[i7];
                                                }
                                                dbsVar4.c((char) i8);
                                            } else {
                                                i4 = 18;
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    h(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case 37:
                                                                            h(1);
                                                                            i(2);
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            i(3);
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            i(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case 44:
                                                                                            this.r = Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i5 == 1) {
                                                                                                dbs dbsVar5 = this.q;
                                                                                                list = dbsVar5.b;
                                                                                                list.add(dbsVar5.a());
                                                                                                dbsVar5.c.setLength(0);
                                                                                                dbsVar5.a.clear();
                                                                                                iMin = Math.min(dbsVar5.h, dbsVar5.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.r = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar6 = this.q;
                                                                                            list = dbsVar6.b;
                                                                                            list.add(dbsVar6.a());
                                                                                            dbsVar6.c.setLength(0);
                                                                                            dbsVar6.a.clear();
                                                                                            iMin = Math.min(dbsVar6.h, dbsVar6.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar7 = this.q;
                                                                                            list = dbsVar7.b;
                                                                                            list.add(dbsVar7.a());
                                                                                            dbsVar7.c.setLength(0);
                                                                                            dbsVar7.a.clear();
                                                                                            iMin = Math.min(dbsVar7.h, dbsVar7.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar8 = this.q;
                                                                                        list = dbsVar8.b;
                                                                                        list.add(dbsVar8.a());
                                                                                        dbsVar8.c.setLength(0);
                                                                                        dbsVar8.a.clear();
                                                                                        iMin = Math.min(dbsVar8.h, dbsVar8.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar9 = this.q;
                                                                                            list = dbsVar9.b;
                                                                                            list.add(dbsVar9.a());
                                                                                            dbsVar9.c.setLength(0);
                                                                                            dbsVar9.a.clear();
                                                                                            iMin = Math.min(dbsVar9.h, dbsVar9.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar10 = this.q;
                                                                                        list = dbsVar10.b;
                                                                                        list.add(dbsVar10.a());
                                                                                        dbsVar10.c.setLength(0);
                                                                                        dbsVar10.a.clear();
                                                                                        iMin = Math.min(dbsVar10.h, dbsVar10.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar11 = this.q;
                                                                                        list = dbsVar11.b;
                                                                                        list.add(dbsVar11.a());
                                                                                        dbsVar11.c.setLength(0);
                                                                                        dbsVar11.a.clear();
                                                                                        iMin = Math.min(dbsVar11.h, dbsVar11.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        h(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case 37:
                                                                h(1);
                                                                i(2);
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                i(3);
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                i(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case 44:
                                                                                this.r = Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    dbs dbsVar12 = this.q;
                                                                                    list = dbsVar12.b;
                                                                                    list.add(dbsVar12.a());
                                                                                    dbsVar12.c.setLength(0);
                                                                                    dbsVar12.a.clear();
                                                                                    iMin = Math.min(dbsVar12.h, dbsVar12.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.r = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            }
                                        } else if ((iN3 & 112) == 48) {
                                            this.q.c((char) g[iN3 & 15]);
                                        } else {
                                            i3 = 17;
                                            i4 = iN2 & 118;
                                            if (i4 != 18) {
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    h(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case 37:
                                                                            h(1);
                                                                            i(2);
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            i(3);
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            i(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case 44:
                                                                                            this.r = Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i5 == 1) {
                                                                                                dbs dbsVar13 = this.q;
                                                                                                list = dbsVar13.b;
                                                                                                list.add(dbsVar13.a());
                                                                                                dbsVar13.c.setLength(0);
                                                                                                dbsVar13.a.clear();
                                                                                                iMin = Math.min(dbsVar13.h, dbsVar13.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.r = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar14 = this.q;
                                                                                            list = dbsVar14.b;
                                                                                            list.add(dbsVar14.a());
                                                                                            dbsVar14.c.setLength(0);
                                                                                            dbsVar14.a.clear();
                                                                                            iMin = Math.min(dbsVar14.h, dbsVar14.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar15 = this.q;
                                                                                            list = dbsVar15.b;
                                                                                            list.add(dbsVar15.a());
                                                                                            dbsVar15.c.setLength(0);
                                                                                            dbsVar15.a.clear();
                                                                                            iMin = Math.min(dbsVar15.h, dbsVar15.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar16 = this.q;
                                                                                        list = dbsVar16.b;
                                                                                        list.add(dbsVar16.a());
                                                                                        dbsVar16.c.setLength(0);
                                                                                        dbsVar16.a.clear();
                                                                                        iMin = Math.min(dbsVar16.h, dbsVar16.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar17 = this.q;
                                                                                            list = dbsVar17.b;
                                                                                            list.add(dbsVar17.a());
                                                                                            dbsVar17.c.setLength(0);
                                                                                            dbsVar17.a.clear();
                                                                                            iMin = Math.min(dbsVar17.h, dbsVar17.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar18 = this.q;
                                                                                        list = dbsVar18.b;
                                                                                        list.add(dbsVar18.a());
                                                                                        dbsVar18.c.setLength(0);
                                                                                        dbsVar18.a.clear();
                                                                                        iMin = Math.min(dbsVar18.h, dbsVar18.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar19 = this.q;
                                                                                        list = dbsVar19.b;
                                                                                        list.add(dbsVar19.a());
                                                                                        dbsVar19.c.setLength(0);
                                                                                        dbsVar19.a.clear();
                                                                                        iMin = Math.min(dbsVar19.h, dbsVar19.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        h(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case 37:
                                                                h(1);
                                                                i(2);
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                i(3);
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                i(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case 44:
                                                                                this.r = Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    dbs dbsVar110 = this.q;
                                                                                    list = dbsVar110.b;
                                                                                    list.add(dbsVar110.a());
                                                                                    dbsVar110.c.setLength(0);
                                                                                    dbsVar110.a.clear();
                                                                                    iMin = Math.min(dbsVar110.h, dbsVar110.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.r = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if ((iN3 & 96) == 32) {
                                                i7 = iN3 & 31;
                                                this.q.d();
                                                dbs dbsVar20 = this.q;
                                                if ((iN2 & 1) == 0) {
                                                    i8 = h[i7];
                                                } else {
                                                    i8 = i[i7];
                                                }
                                                dbsVar20.c((char) i8);
                                            } else {
                                                i4 = 18;
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    h(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case 37:
                                                                            h(1);
                                                                            i(2);
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            i(3);
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            i(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case 44:
                                                                                            this.r = Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i5 == 1) {
                                                                                                dbs dbsVar111 = this.q;
                                                                                                list = dbsVar111.b;
                                                                                                list.add(dbsVar111.a());
                                                                                                dbsVar111.c.setLength(0);
                                                                                                dbsVar111.a.clear();
                                                                                                iMin = Math.min(dbsVar111.h, dbsVar111.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.r = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar112 = this.q;
                                                                                            list = dbsVar112.b;
                                                                                            list.add(dbsVar112.a());
                                                                                            dbsVar112.c.setLength(0);
                                                                                            dbsVar112.a.clear();
                                                                                            iMin = Math.min(dbsVar112.h, dbsVar112.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar113 = this.q;
                                                                                            list = dbsVar113.b;
                                                                                            list.add(dbsVar113.a());
                                                                                            dbsVar113.c.setLength(0);
                                                                                            dbsVar113.a.clear();
                                                                                            iMin = Math.min(dbsVar113.h, dbsVar113.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar114 = this.q;
                                                                                        list = dbsVar114.b;
                                                                                        list.add(dbsVar114.a());
                                                                                        dbsVar114.c.setLength(0);
                                                                                        dbsVar114.a.clear();
                                                                                        iMin = Math.min(dbsVar114.h, dbsVar114.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar115 = this.q;
                                                                                            list = dbsVar115.b;
                                                                                            list.add(dbsVar115.a());
                                                                                            dbsVar115.c.setLength(0);
                                                                                            dbsVar115.a.clear();
                                                                                            iMin = Math.min(dbsVar115.h, dbsVar115.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar116 = this.q;
                                                                                        list = dbsVar116.b;
                                                                                        list.add(dbsVar116.a());
                                                                                        dbsVar116.c.setLength(0);
                                                                                        dbsVar116.a.clear();
                                                                                        iMin = Math.min(dbsVar116.h, dbsVar116.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar117 = this.q;
                                                                                        list = dbsVar117.b;
                                                                                        list.add(dbsVar117.a());
                                                                                        dbsVar117.c.setLength(0);
                                                                                        dbsVar117.a.clear();
                                                                                        iMin = Math.min(dbsVar117.h, dbsVar117.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        h(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case 37:
                                                                h(1);
                                                                i(2);
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                i(3);
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                i(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case 44:
                                                                                this.r = Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    dbs dbsVar118 = this.q;
                                                                                    list = dbsVar118.b;
                                                                                    list.add(dbsVar118.a());
                                                                                    dbsVar118.c.setLength(0);
                                                                                    dbsVar118.a.clear();
                                                                                    iMin = Math.min(dbsVar118.h, dbsVar118.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.r = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = iN3 & 96;
                                        this.q.c(e(b));
                                        if (i2 != 0) {
                                            this.q.c(e(b2));
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            g();
                            z2 = true;
                        }
                    } else if (this.w && this.x == i11 && this.y == i12) {
                        this.w = false;
                    } else {
                        this.w = true;
                        this.x = b;
                        this.y = b2;
                        if (!z) {
                            if (i11 <= 0) {
                                if ((iN2 & 118) == 20) {
                                    if (i12 == 32) {
                                        this.A = true;
                                    } else {
                                        this.A = true;
                                    }
                                }
                            } else if ((iN2 & 118) == 20) {
                                if (i12 == 32) {
                                    this.A = true;
                                } else {
                                    this.A = true;
                                }
                            }
                            if (!this.A) {
                                if (j(b)) {
                                    this.z = (i11 >> 3) & 1;
                                }
                                if (this.z != this.n) {
                                    if (j(b)) {
                                        i3 = iN2 & 119;
                                        if (i3 != 17) {
                                            i4 = iN2 & 118;
                                            if (i4 != 18) {
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    h(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case 37:
                                                                            h(1);
                                                                            i(2);
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            i(3);
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            i(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case 44:
                                                                                            this.r = Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i5 == 1) {
                                                                                                dbs dbsVar119 = this.q;
                                                                                                list = dbsVar119.b;
                                                                                                list.add(dbsVar119.a());
                                                                                                dbsVar119.c.setLength(0);
                                                                                                dbsVar119.a.clear();
                                                                                                iMin = Math.min(dbsVar119.h, dbsVar119.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.r = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar1110 = this.q;
                                                                                            list = dbsVar1110.b;
                                                                                            list.add(dbsVar1110.a());
                                                                                            dbsVar1110.c.setLength(0);
                                                                                            dbsVar1110.a.clear();
                                                                                            iMin = Math.min(dbsVar1110.h, dbsVar1110.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar1111 = this.q;
                                                                                            list = dbsVar1111.b;
                                                                                            list.add(dbsVar1111.a());
                                                                                            dbsVar1111.c.setLength(0);
                                                                                            dbsVar1111.a.clear();
                                                                                            iMin = Math.min(dbsVar1111.h, dbsVar1111.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar1112 = this.q;
                                                                                        list = dbsVar1112.b;
                                                                                        list.add(dbsVar1112.a());
                                                                                        dbsVar1112.c.setLength(0);
                                                                                        dbsVar1112.a.clear();
                                                                                        iMin = Math.min(dbsVar1112.h, dbsVar1112.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar1113 = this.q;
                                                                                            list = dbsVar1113.b;
                                                                                            list.add(dbsVar1113.a());
                                                                                            dbsVar1113.c.setLength(0);
                                                                                            dbsVar1113.a.clear();
                                                                                            iMin = Math.min(dbsVar1113.h, dbsVar1113.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar1114 = this.q;
                                                                                        list = dbsVar1114.b;
                                                                                        list.add(dbsVar1114.a());
                                                                                        dbsVar1114.c.setLength(0);
                                                                                        dbsVar1114.a.clear();
                                                                                        iMin = Math.min(dbsVar1114.h, dbsVar1114.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar1115 = this.q;
                                                                                        list = dbsVar1115.b;
                                                                                        list.add(dbsVar1115.a());
                                                                                        dbsVar1115.c.setLength(0);
                                                                                        dbsVar1115.a.clear();
                                                                                        iMin = Math.min(dbsVar1115.h, dbsVar1115.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        h(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case 37:
                                                                h(1);
                                                                i(2);
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                i(3);
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                i(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case 44:
                                                                                this.r = Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    dbs dbsVar1116 = this.q;
                                                                                    list = dbsVar1116.b;
                                                                                    list.add(dbsVar1116.a());
                                                                                    dbsVar1116.c.setLength(0);
                                                                                    dbsVar1116.a.clear();
                                                                                    iMin = Math.min(dbsVar1116.h, dbsVar1116.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.r = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if ((iN3 & 96) == 32) {
                                                i7 = iN3 & 31;
                                                this.q.d();
                                                dbs dbsVar21 = this.q;
                                                if ((iN2 & 1) == 0) {
                                                    i8 = h[i7];
                                                } else {
                                                    i8 = i[i7];
                                                }
                                                dbsVar21.c((char) i8);
                                            } else {
                                                i4 = 18;
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    h(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case 37:
                                                                            h(1);
                                                                            i(2);
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            i(3);
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            i(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case 44:
                                                                                            this.r = Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i5 == 1) {
                                                                                                dbs dbsVar1117 = this.q;
                                                                                                list = dbsVar1117.b;
                                                                                                list.add(dbsVar1117.a());
                                                                                                dbsVar1117.c.setLength(0);
                                                                                                dbsVar1117.a.clear();
                                                                                                iMin = Math.min(dbsVar1117.h, dbsVar1117.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.r = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar1118 = this.q;
                                                                                            list = dbsVar1118.b;
                                                                                            list.add(dbsVar1118.a());
                                                                                            dbsVar1118.c.setLength(0);
                                                                                            dbsVar1118.a.clear();
                                                                                            iMin = Math.min(dbsVar1118.h, dbsVar1118.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar1119 = this.q;
                                                                                            list = dbsVar1119.b;
                                                                                            list.add(dbsVar1119.a());
                                                                                            dbsVar1119.c.setLength(0);
                                                                                            dbsVar1119.a.clear();
                                                                                            iMin = Math.min(dbsVar1119.h, dbsVar1119.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar11110 = this.q;
                                                                                        list = dbsVar11110.b;
                                                                                        list.add(dbsVar11110.a());
                                                                                        dbsVar11110.c.setLength(0);
                                                                                        dbsVar11110.a.clear();
                                                                                        iMin = Math.min(dbsVar11110.h, dbsVar11110.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar11111 = this.q;
                                                                                            list = dbsVar11111.b;
                                                                                            list.add(dbsVar11111.a());
                                                                                            dbsVar11111.c.setLength(0);
                                                                                            dbsVar11111.a.clear();
                                                                                            iMin = Math.min(dbsVar11111.h, dbsVar11111.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar11112 = this.q;
                                                                                        list = dbsVar11112.b;
                                                                                        list.add(dbsVar11112.a());
                                                                                        dbsVar11112.c.setLength(0);
                                                                                        dbsVar11112.a.clear();
                                                                                        iMin = Math.min(dbsVar11112.h, dbsVar11112.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar11113 = this.q;
                                                                                        list = dbsVar11113.b;
                                                                                        list.add(dbsVar11113.a());
                                                                                        dbsVar11113.c.setLength(0);
                                                                                        dbsVar11113.a.clear();
                                                                                        iMin = Math.min(dbsVar11113.h, dbsVar11113.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        h(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case 37:
                                                                h(1);
                                                                i(2);
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                i(3);
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                i(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case 44:
                                                                                this.r = Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    dbs dbsVar11114 = this.q;
                                                                                    list = dbsVar11114.b;
                                                                                    list.add(dbsVar11114.a());
                                                                                    dbsVar11114.c.setLength(0);
                                                                                    dbsVar11114.a.clear();
                                                                                    iMin = Math.min(dbsVar11114.h, dbsVar11114.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.r = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            }
                                        } else if ((iN3 & 112) == 48) {
                                            this.q.c((char) g[iN3 & 15]);
                                        } else {
                                            i3 = 17;
                                            i4 = iN2 & 118;
                                            if (i4 != 18) {
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    h(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case 37:
                                                                            h(1);
                                                                            i(2);
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            i(3);
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            i(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case 44:
                                                                                            this.r = Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i5 == 1) {
                                                                                                dbs dbsVar11115 = this.q;
                                                                                                list = dbsVar11115.b;
                                                                                                list.add(dbsVar11115.a());
                                                                                                dbsVar11115.c.setLength(0);
                                                                                                dbsVar11115.a.clear();
                                                                                                iMin = Math.min(dbsVar11115.h, dbsVar11115.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.r = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar11116 = this.q;
                                                                                            list = dbsVar11116.b;
                                                                                            list.add(dbsVar11116.a());
                                                                                            dbsVar11116.c.setLength(0);
                                                                                            dbsVar11116.a.clear();
                                                                                            iMin = Math.min(dbsVar11116.h, dbsVar11116.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar11117 = this.q;
                                                                                            list = dbsVar11117.b;
                                                                                            list.add(dbsVar11117.a());
                                                                                            dbsVar11117.c.setLength(0);
                                                                                            dbsVar11117.a.clear();
                                                                                            iMin = Math.min(dbsVar11117.h, dbsVar11117.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar11118 = this.q;
                                                                                        list = dbsVar11118.b;
                                                                                        list.add(dbsVar11118.a());
                                                                                        dbsVar11118.c.setLength(0);
                                                                                        dbsVar11118.a.clear();
                                                                                        iMin = Math.min(dbsVar11118.h, dbsVar11118.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar11119 = this.q;
                                                                                            list = dbsVar11119.b;
                                                                                            list.add(dbsVar11119.a());
                                                                                            dbsVar11119.c.setLength(0);
                                                                                            dbsVar11119.a.clear();
                                                                                            iMin = Math.min(dbsVar11119.h, dbsVar11119.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar111110 = this.q;
                                                                                        list = dbsVar111110.b;
                                                                                        list.add(dbsVar111110.a());
                                                                                        dbsVar111110.c.setLength(0);
                                                                                        dbsVar111110.a.clear();
                                                                                        iMin = Math.min(dbsVar111110.h, dbsVar111110.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar111111 = this.q;
                                                                                        list = dbsVar111111.b;
                                                                                        list.add(dbsVar111111.a());
                                                                                        dbsVar111111.c.setLength(0);
                                                                                        dbsVar111111.a.clear();
                                                                                        iMin = Math.min(dbsVar111111.h, dbsVar111111.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        h(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case 37:
                                                                h(1);
                                                                i(2);
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                i(3);
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                i(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case 44:
                                                                                this.r = Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    dbs dbsVar111112 = this.q;
                                                                                    list = dbsVar111112.b;
                                                                                    list.add(dbsVar111112.a());
                                                                                    dbsVar111112.c.setLength(0);
                                                                                    dbsVar111112.a.clear();
                                                                                    iMin = Math.min(dbsVar111112.h, dbsVar111112.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.r = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if ((iN3 & 96) == 32) {
                                                i7 = iN3 & 31;
                                                this.q.d();
                                                dbs dbsVar22 = this.q;
                                                if ((iN2 & 1) == 0) {
                                                    i8 = h[i7];
                                                } else {
                                                    i8 = i[i7];
                                                }
                                                dbsVar22.c((char) i8);
                                            } else {
                                                i4 = 18;
                                                if (i3 != 17) {
                                                    if ((iN2 & 112) != 16) {
                                                        if (i3 != 23) {
                                                            if (i4 == 20) {
                                                                if (i12 == 32) {
                                                                    h(2);
                                                                } else if (i12 != 41) {
                                                                    switch (i12) {
                                                                        case 37:
                                                                            h(1);
                                                                            i(2);
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            i(3);
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            i(4);
                                                                            break;
                                                                        default:
                                                                            i5 = this.t;
                                                                            if (i5 != 0) {
                                                                                if (i12 != 33) {
                                                                                    switch (i12) {
                                                                                        case 44:
                                                                                            this.r = Collections.EMPTY_LIST;
                                                                                            i6 = this.t;
                                                                                            if (i6 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i5 == 1) {
                                                                                                dbs dbsVar111113 = this.q;
                                                                                                list = dbsVar111113.b;
                                                                                                list.add(dbsVar111113.a());
                                                                                                dbsVar111113.c.setLength(0);
                                                                                                dbsVar111113.a.clear();
                                                                                                iMin = Math.min(dbsVar111113.h, dbsVar111113.d);
                                                                                                while (list.size() >= iMin) {
                                                                                                    list.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.r = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.q.d();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar111114 = this.q;
                                                                                            list = dbsVar111114.b;
                                                                                            list.add(dbsVar111114.a());
                                                                                            dbsVar111114.c.setLength(0);
                                                                                            dbsVar111114.a.clear();
                                                                                            iMin = Math.min(dbsVar111114.h, dbsVar111114.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar111115 = this.q;
                                                                                            list = dbsVar111115.b;
                                                                                            list.add(dbsVar111115.a());
                                                                                            dbsVar111115.c.setLength(0);
                                                                                            dbsVar111115.a.clear();
                                                                                            iMin = Math.min(dbsVar111115.h, dbsVar111115.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar111116 = this.q;
                                                                                        list = dbsVar111116.b;
                                                                                        list.add(dbsVar111116.a());
                                                                                        dbsVar111116.c.setLength(0);
                                                                                        dbsVar111116.a.clear();
                                                                                        iMin = Math.min(dbsVar111116.h, dbsVar111116.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((iN2 & 112) != 16) {
                                                    if (i3 != 23) {
                                                        if (i4 == 20) {
                                                            if (i12 == 32) {
                                                                h(2);
                                                            } else if (i12 != 41) {
                                                                switch (i12) {
                                                                    case 37:
                                                                        h(1);
                                                                        i(2);
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        i(3);
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        i(4);
                                                                        break;
                                                                    default:
                                                                        i5 = this.t;
                                                                        if (i5 != 0) {
                                                                            if (i12 != 33) {
                                                                                switch (i12) {
                                                                                    case 44:
                                                                                        this.r = Collections.EMPTY_LIST;
                                                                                        i6 = this.t;
                                                                                        if (i6 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i5 == 1) {
                                                                                            dbs dbsVar111117 = this.q;
                                                                                            list = dbsVar111117.b;
                                                                                            list.add(dbsVar111117.a());
                                                                                            dbsVar111117.c.setLength(0);
                                                                                            dbsVar111117.a.clear();
                                                                                            iMin = Math.min(dbsVar111117.h, dbsVar111117.d);
                                                                                            while (list.size() >= iMin) {
                                                                                                list.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.r = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.q.d();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar111118 = this.q;
                                                                                        list = dbsVar111118.b;
                                                                                        list.add(dbsVar111118.a());
                                                                                        dbsVar111118.c.setLength(0);
                                                                                        dbsVar111118.a.clear();
                                                                                        iMin = Math.min(dbsVar111118.h, dbsVar111118.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 != 23) {
                                                    if (i4 == 20) {
                                                        if (i12 == 32) {
                                                            h(2);
                                                        } else if (i12 != 41) {
                                                            switch (i12) {
                                                                case 37:
                                                                    h(1);
                                                                    i(2);
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    i(3);
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    i(4);
                                                                    break;
                                                                default:
                                                                    i5 = this.t;
                                                                    if (i5 != 0) {
                                                                        if (i12 != 33) {
                                                                            switch (i12) {
                                                                                case 44:
                                                                                    this.r = Collections.EMPTY_LIST;
                                                                                    i6 = this.t;
                                                                                    if (i6 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i5 == 1) {
                                                                                        dbs dbsVar111119 = this.q;
                                                                                        list = dbsVar111119.b;
                                                                                        list.add(dbsVar111119.a());
                                                                                        dbsVar111119.c.setLength(0);
                                                                                        dbsVar111119.a.clear();
                                                                                        iMin = Math.min(dbsVar111119.h, dbsVar111119.d);
                                                                                        while (list.size() >= iMin) {
                                                                                            list.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.r = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.q.d();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i4 == 20) {
                                                    if (i12 == 32) {
                                                        h(2);
                                                    } else if (i12 != 41) {
                                                        switch (i12) {
                                                            case 37:
                                                                h(1);
                                                                i(2);
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                i(3);
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                i(4);
                                                                break;
                                                            default:
                                                                i5 = this.t;
                                                                if (i5 != 0) {
                                                                    if (i12 != 33) {
                                                                        switch (i12) {
                                                                            case 44:
                                                                                this.r = Collections.EMPTY_LIST;
                                                                                i6 = this.t;
                                                                                if (i6 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i5 == 1) {
                                                                                    dbs dbsVar1111110 = this.q;
                                                                                    list = dbsVar1111110.b;
                                                                                    list.add(dbsVar1111110.a());
                                                                                    dbsVar1111110.c.setLength(0);
                                                                                    dbsVar1111110.a.clear();
                                                                                    iMin = Math.min(dbsVar1111110.h, dbsVar1111110.d);
                                                                                    while (list.size() >= iMin) {
                                                                                        list.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.r = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.q.d();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = iN3 & 96;
                                        this.q.c(e(b));
                                        if (i2 != 0) {
                                            this.q.c(e(b2));
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            g();
                            z2 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.dcb
    protected final boolean d() {
        return this.r != this.s;
    }

    @Override // defpackage.dcb, defpackage.cam
    public final /* bridge */ /* synthetic */ Object dequeueOutputBuffer() {
        return dequeueOutputBuffer();
    }

    @Override // defpackage.dcb, defpackage.cam
    public final void flush() {
        super.flush();
        this.r = null;
        this.s = null;
        h(0);
        i(4);
        g();
        this.v = false;
        this.w = false;
        this.x = (byte) 0;
        this.y = (byte) 0;
        this.z = 0;
        this.A = true;
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.cam
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // defpackage.dcb, defpackage.cam
    public final void release() {
    }
}
