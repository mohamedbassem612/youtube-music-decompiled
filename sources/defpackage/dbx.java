package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dbx extends dcb {
    private final int e;
    private final dbv[] f;
    private dbv g;
    private List h;
    private List i;
    private dbw j;
    private int k;
    private final bwb a = new bwb();
    private final dqp l = new dqp((byte[]) null);
    private int d = -1;

    public dbx(int i, List list) {
        this.e = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = bvf.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.f = new dbv[8];
        int i2 = 0;
        while (true) {
            dbv[] dbvVarArr = this.f;
            if (i2 >= 8) {
                this.g = dbvVarArr[0];
                return;
            } else {
                dbvVarArr[i2] = new dbv();
                i2++;
            }
        }
    }

    private final List e() {
        Layout.Alignment alignment;
        float f;
        float f2;
        float f3;
        dbu dbuVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            dbv[] dbvVarArr = this.f;
            if (!dbvVarArr[i].f()) {
                dbv dbvVar = dbvVarArr[i];
                if (dbvVar.n) {
                    if (dbvVar.f()) {
                        dbuVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        int i2 = 0;
                        while (true) {
                            List list = dbvVar.k;
                            if (i2 >= list.size()) {
                                break;
                            }
                            spannableStringBuilder.append((CharSequence) list.get(i2));
                            spannableStringBuilder.append('\n');
                            i2++;
                        }
                        spannableStringBuilder.append((CharSequence) dbvVar.b());
                        int i3 = dbvVar.u;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalArgumentException(a.bR(i3, "Unexpected justification value: "));
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        if (dbvVar.p) {
                            f = dbvVar.r;
                            f3 = 99.0f;
                            f2 = dbvVar.q / 99.0f;
                        } else {
                            f = dbvVar.r;
                            f2 = dbvVar.q / 74.0f;
                            f3 = 209.0f;
                        }
                        float f4 = f / f3;
                        int i4 = dbvVar.s;
                        int i5 = i4 / 3;
                        int i6 = i5 == 0 ? 0 : i5 == 1 ? 1 : 2;
                        int i7 = i4 % 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = dbvVar.x;
                        dbuVar = new dbu(spannableStringBuilder, alignment, (f2 * 0.9f) + 0.05f, i6, (0.9f * f4) + 0.05f, i8, i9 != dbv.b, i9, dbvVar.o);
                    }
                    if (dbuVar != null) {
                        arrayList.add(dbuVar);
                    }
                } else {
                    continue;
                }
            }
        }
        j$.util.List.EL.sort(arrayList, dbu.a);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(((dbu) arrayList.get(i10)).b);
        }
        return DesugarCollections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:218:0x0519  */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x011d. Please report as an issue. */
    private final void f() {
        int i;
        int i2;
        boolean z;
        int i3;
        dbw dbwVar = this.j;
        if (dbwVar != null) {
            int i4 = dbwVar.b;
            int i5 = dbwVar.d;
            int i6 = (i4 << 1) - 1;
            if (i5 != i6) {
                bvx.g("DtvCcPacket ended prematurely; size is " + i6 + ", but current index is " + i5 + " (sequence number " + dbwVar.a + ");");
            }
            dqp dqpVar = this.l;
            dbw dbwVar2 = this.j;
            dqpVar.p(dbwVar2.c, dbwVar2.d);
            boolean z2 = false;
            while (dqpVar.f() > 0) {
                int i7 = 3;
                int i8 = dqpVar.i(3);
                int i9 = dqpVar.i(5);
                int i10 = 2;
                if (i8 == 7) {
                    dqpVar.s(2);
                    i8 = dqpVar.i(6);
                    if (i8 < 7) {
                        bvx.e("Cea708Decoder", a.bR(i8, "Invalid extended service number: "));
                    }
                }
                if (i9 == 0) {
                    if (i8 != 0) {
                        bvx.e("Cea708Decoder", a.bP(i8, "serviceNumber is non-zero (", ") when blockSize is 0"));
                    }
                    if (z2) {
                        this.h = e();
                    }
                    this.j = null;
                }
                if (i8 != this.e) {
                    dqpVar.t(i9);
                } else {
                    int iH = dqpVar.h() + (i9 << 3);
                    while (dqpVar.h() < iH) {
                        int i11 = dqpVar.i(8);
                        if (i11 == 16) {
                            z = true;
                            int i12 = dqpVar.i(8);
                            if (i12 <= 31) {
                                if (i12 > 7) {
                                    if (i12 <= 15) {
                                        dqpVar.s(8);
                                    } else if (i12 <= 23) {
                                        dqpVar.s(16);
                                    } else {
                                        dqpVar.s(24);
                                    }
                                }
                            } else if (i12 <= 127) {
                                if (i12 == 32) {
                                    this.g.c(' ');
                                } else if (i12 == 33) {
                                    this.g.c((char) 160);
                                } else if (i12 == 37) {
                                    this.g.c((char) 8230);
                                } else if (i12 == 42) {
                                    this.g.c((char) 352);
                                } else if (i12 == 44) {
                                    this.g.c((char) 338);
                                } else if (i12 == 63) {
                                    this.g.c((char) 376);
                                } else if (i12 == 57) {
                                    this.g.c((char) 8482);
                                } else if (i12 == 58) {
                                    this.g.c((char) 353);
                                } else if (i12 == 60) {
                                    this.g.c((char) 339);
                                } else if (i12 != 61) {
                                    switch (i12) {
                                        case 48:
                                            this.g.c((char) 9608);
                                            break;
                                        case 49:
                                            this.g.c((char) 8216);
                                            break;
                                        case 50:
                                            this.g.c((char) 8217);
                                            break;
                                        case 51:
                                            this.g.c((char) 8220);
                                            break;
                                        case 52:
                                            this.g.c((char) 8221);
                                            break;
                                        case 53:
                                            this.g.c((char) 8226);
                                            break;
                                        default:
                                            switch (i12) {
                                                case 118:
                                                    this.g.c((char) 8539);
                                                    break;
                                                case 119:
                                                    this.g.c((char) 8540);
                                                    break;
                                                case 120:
                                                    this.g.c((char) 8541);
                                                    break;
                                                case 121:
                                                    this.g.c((char) 8542);
                                                    break;
                                                case 122:
                                                    this.g.c((char) 9474);
                                                    break;
                                                case 123:
                                                    this.g.c((char) 9488);
                                                    break;
                                                case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                    this.g.c((char) 9492);
                                                    break;
                                                case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                                    this.g.c((char) 9472);
                                                    break;
                                                case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                                    this.g.c((char) 9496);
                                                    break;
                                                case 127:
                                                    this.g.c((char) 9484);
                                                    break;
                                                default:
                                                    bvx.e("Cea708Decoder", a.bR(i12, "Invalid G2 character: "));
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.g.c((char) 8480);
                                }
                                z2 = z;
                                i7 = 3;
                                i10 = 2;
                            } else {
                                if (i12 > 159) {
                                    i2 = 2;
                                    i = 3;
                                    if (i12 <= 255) {
                                        if (i12 == 160) {
                                            this.g.c((char) 13252);
                                        } else {
                                            bvx.e("Cea708Decoder", a.bR(i12, "Invalid G3 character: "));
                                            this.g.c('_');
                                        }
                                        z2 = true;
                                        i7 = 3;
                                        i10 = 2;
                                    } else {
                                        bvx.e("Cea708Decoder", a.bR(i12, "Invalid extended command: "));
                                    }
                                } else if (i12 <= 135) {
                                    dqpVar.s(32);
                                } else if (i12 <= 143) {
                                    dqpVar.s(40);
                                } else {
                                    i2 = 2;
                                    dqpVar.s(2);
                                    i = 3;
                                    dqpVar.s(dqpVar.i(6) << 3);
                                }
                                i10 = i2;
                                i7 = i;
                            }
                            i2 = 2;
                            i = 3;
                            i10 = i2;
                            i7 = i;
                        } else if (i11 <= 31) {
                            if (i11 != 0) {
                                if (i11 == i7) {
                                    this.h = e();
                                } else if (i11 != 8) {
                                    switch (i11) {
                                        case 12:
                                            g();
                                            break;
                                        case 13:
                                            this.g.c('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i11 >= 17 && i11 <= 23) {
                                                bvx.e("Cea708Decoder", a.bR(i11, "Currently unsupported COMMAND_EXT1 Command: "));
                                                dqpVar.s(8);
                                            } else if (i11 >= 24) {
                                                bvx.e("Cea708Decoder", a.bR(i11, "Currently unsupported COMMAND_P16 Command: "));
                                                dqpVar.s(16);
                                            } else {
                                                bvx.e("Cea708Decoder", a.bR(i11, "Invalid C0 command: "));
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.g.l;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                            i = i7;
                            i2 = i10;
                            i10 = i2;
                            i7 = i;
                        } else {
                            if (i11 <= 127) {
                                dbv dbvVar = this.g;
                                if (i11 == 127) {
                                    dbvVar.c((char) 9835);
                                } else {
                                    dbvVar.c((char) (i11 & 255));
                                }
                            } else {
                                if (i11 <= 159) {
                                    switch (i11) {
                                        case SemanticState.Focused /* 128 */:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i13 = i11 - 128;
                                            if (this.k != i13) {
                                                this.k = i13;
                                                this.g = this.f[i13];
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (dqpVar.u()) {
                                                    this.f[8 - i14].d();
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (dqpVar.u()) {
                                                    this.f[8 - i15].n = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (dqpVar.u()) {
                                                    this.f[8 - i16].n = false;
                                                }
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i10 = 2;
                                            break;
                                        case 139:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (dqpVar.u()) {
                                                    dbv dbvVar2 = this.f[8 - i17];
                                                    dbvVar2.n = !dbvVar2.n;
                                                }
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i10 = 2;
                                            break;
                                        case 140:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (dqpVar.u()) {
                                                    this.f[8 - i18].e();
                                                }
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i10 = 2;
                                            break;
                                        case 141:
                                            dqpVar.s(8);
                                            z2 = true;
                                            i7 = 3;
                                            i10 = 2;
                                            break;
                                        case 142:
                                            break;
                                        case 143:
                                            g();
                                            z2 = true;
                                            i7 = 3;
                                            i10 = 2;
                                            break;
                                        case 144:
                                            i3 = i10;
                                            if (this.g.m) {
                                                dqpVar.i(4);
                                                dqpVar.i(i3);
                                                dqpVar.i(i3);
                                                boolean zU = dqpVar.u();
                                                boolean zU2 = dqpVar.u();
                                                dqpVar.i(3);
                                                dqpVar.i(3);
                                                this.g.g(zU, zU2);
                                                z2 = true;
                                                i7 = 3;
                                                i10 = 2;
                                            } else {
                                                dqpVar.s(16);
                                                i10 = i3;
                                                z2 = true;
                                                i7 = 3;
                                            }
                                            break;
                                        case 145:
                                            if (this.g.m) {
                                                i3 = 2;
                                                int iA = dbv.a(dqpVar.i(2), dqpVar.i(2), dqpVar.i(2), dqpVar.i(2));
                                                int iA2 = dbv.a(dqpVar.i(2), dqpVar.i(2), dqpVar.i(2), dqpVar.i(2));
                                                dqpVar.s(2);
                                                dbv.a(dqpVar.i(2), dqpVar.i(2), dqpVar.i(2), 0);
                                                this.g.h(iA, iA2);
                                                i10 = i3;
                                                z2 = true;
                                                i7 = 3;
                                            } else {
                                                dqpVar.s(24);
                                                z2 = true;
                                                i7 = 3;
                                                i10 = 2;
                                            }
                                            break;
                                        case 146:
                                            if (this.g.m) {
                                                dqpVar.s(4);
                                                int i19 = dqpVar.i(4);
                                                dqpVar.s(2);
                                                dqpVar.i(6);
                                                dbv dbvVar3 = this.g;
                                                if (dbvVar3.y != i19) {
                                                    dbvVar3.c('\n');
                                                }
                                                dbvVar3.y = i19;
                                            } else {
                                                dqpVar.s(16);
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i10 = 2;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            z = true;
                                            bvx.e("Cea708Decoder", a.bR(i11, "Invalid C1 command: "));
                                            break;
                                        case 151:
                                            if (this.g.m) {
                                                int iA3 = dbv.a(dqpVar.i(2), dqpVar.i(2), dqpVar.i(2), dqpVar.i(2));
                                                dqpVar.i(2);
                                                dbv.a(dqpVar.i(2), dqpVar.i(2), dqpVar.i(2), 0);
                                                dqpVar.u();
                                                dqpVar.u();
                                                dqpVar.i(2);
                                                dqpVar.i(2);
                                                int i20 = dqpVar.i(2);
                                                dqpVar.s(8);
                                                this.g.i(iA3, i20);
                                            } else {
                                                dqpVar.s(32);
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i10 = 2;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i21 = i11 - 152;
                                            dbv[] dbvVarArr = this.f;
                                            dbv dbvVar4 = dbvVarArr[i21];
                                            dqpVar.s(i10);
                                            boolean zU3 = dqpVar.u();
                                            dqpVar.s(i10);
                                            int i22 = dqpVar.i(i7);
                                            boolean zU4 = dqpVar.u();
                                            int i23 = dqpVar.i(7);
                                            int i24 = dqpVar.i(8);
                                            int i25 = dqpVar.i(4);
                                            int i26 = dqpVar.i(4);
                                            dqpVar.s(i10);
                                            dqpVar.s(6);
                                            dqpVar.s(i10);
                                            int i27 = dqpVar.i(3);
                                            int i28 = dqpVar.i(3);
                                            dbvVar4.m = true;
                                            dbvVar4.n = zU3;
                                            dbvVar4.o = i22;
                                            dbvVar4.p = zU4;
                                            dbvVar4.q = i23;
                                            dbvVar4.r = i24;
                                            dbvVar4.s = i25;
                                            int i29 = i26 + 1;
                                            if (dbvVar4.t != i29) {
                                                dbvVar4.t = i29;
                                                while (true) {
                                                    List list = dbvVar4.k;
                                                    if (list.size() >= dbvVar4.t || list.size() >= 15) {
                                                        list.remove(0);
                                                    }
                                                }
                                            }
                                            if (i27 != 0 && dbvVar4.v != i27) {
                                                dbvVar4.v = i27;
                                                int i30 = i27 - 1;
                                                int i31 = dbv.g[i30];
                                                boolean z3 = dbv.f[i30];
                                                int i32 = dbv.d[i30];
                                                int i33 = dbv.e[i30];
                                                dbvVar4.i(i31, dbv.c[i30]);
                                            }
                                            if (i28 != 0 && dbvVar4.w != i28) {
                                                dbvVar4.w = i28;
                                                int i34 = i28 - 1;
                                                int i35 = dbv.i[i34];
                                                int i36 = dbv.h[i34];
                                                dbvVar4.g(false, false);
                                                dbvVar4.h(dbv.a, dbv.j[i34]);
                                            }
                                            if (this.k != i21) {
                                                this.k = i21;
                                                this.g = dbvVarArr[i21];
                                            }
                                            z2 = true;
                                            i7 = 3;
                                            i10 = 2;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (i11 <= 255) {
                                        this.g.c((char) (i11 & 255));
                                    } else {
                                        bvx.e("Cea708Decoder", a.bR(i11, "Invalid base command: "));
                                        i2 = 2;
                                        i = 3;
                                        i10 = i2;
                                        i7 = i;
                                    }
                                }
                                z2 = z;
                                i7 = 3;
                                i10 = 2;
                            }
                            z2 = true;
                        }
                    }
                }
            }
            if (z2) {
                this.h = e();
            }
            this.j = null;
        }
    }

    private final void g() {
        for (int i = 0; i < 8; i++) {
            this.f[i].e();
        }
    }

    @Override // defpackage.dcb
    protected final dbd a() {
        List list = this.h;
        this.i = list;
        list.getClass();
        return new dcc(list);
    }

    @Override // defpackage.dcb
    protected final void c(dbi dbiVar) {
        dbw dbwVar;
        ByteBuffer byteBuffer = dbiVar.data;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        bwb bwbVar = this.a;
        bwbVar.N(bArrArray, iLimit);
        while (bwbVar.d() >= 3) {
            int iN = bwbVar.n();
            int i = iN & 3;
            byte bA = bwbVar.a();
            byte bA2 = bwbVar.a();
            if (i != 2) {
                if (i == 3) {
                    i = 3;
                }
            }
            if ((iN & 4) == 4) {
                if (i == 3) {
                    f();
                    int i2 = this.d;
                    int i3 = (bA & 192) >> 6;
                    if (i2 != -1 && i3 != ((i2 + 1) & 3)) {
                        g();
                        bvx.e("Cea708Decoder", "Sequence number discontinuity. previous=" + this.d + " current=" + i3);
                    }
                    this.d = i3;
                    int i4 = bA & 63;
                    if (i4 == 0) {
                        i4 = 64;
                    }
                    dbwVar = new dbw(i3, i4);
                    this.j = dbwVar;
                    byte[] bArr = dbwVar.c;
                    int i5 = dbwVar.d;
                    dbwVar.d = i5 + 1;
                    bArr[i5] = bA2;
                } else {
                    dbw dbwVar2 = this.j;
                    if (dbwVar2 == null) {
                        bvx.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        int i6 = dbwVar2.d;
                        int i7 = i6 + 1;
                        dbwVar2.d = i7;
                        byte[] bArr2 = dbwVar2.c;
                        bArr2[i6] = bA;
                        dbwVar2.d = i6 + 2;
                        bArr2[i7] = bA2;
                        dbwVar = dbwVar2;
                    }
                }
                if (dbwVar.d == (dbwVar.b << 1) - 1) {
                    f();
                }
            }
        }
    }

    @Override // defpackage.dcb
    protected final boolean d() {
        return this.h != this.i;
    }

    @Override // defpackage.dcb, defpackage.cam
    public final void flush() {
        super.flush();
        this.h = null;
        this.i = null;
        this.k = 0;
        this.g = this.f[0];
        g();
        this.j = null;
    }

    @Override // defpackage.cam
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // defpackage.dcb, defpackage.cam
    public final /* bridge */ /* synthetic */ void release() {
    }
}
