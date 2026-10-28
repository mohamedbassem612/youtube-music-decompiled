package defpackage;

import android.util.Pair;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class czv {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = bwp.ah("OpusHead");
    private static final Pattern c = Pattern.compile("([+-][0-9.]+)([+-][0-9.]+)(?:([+-][0-9.]+))?(?:CRS[^/]*)?/.*");

    static bsx a(bwb bwbVar) {
        try {
            bwbVar.Q(5);
            int i = bwbVar.i();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                long jV = bwbVar.v() / 10000;
                if (jV < 0) {
                    jV = -9223372036854775807L;
                }
                arrayList.add(new cxl(jV, -9223372036854775807L, false, new bsg(null, bwbVar.C(bwbVar.n()))));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new bsx(arrayList);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static bsx b(bww bwwVar) {
        bwu bwuVar;
        bwx bwxVarB = bwwVar.b(1751411826);
        bwx bwxVarB2 = bwwVar.b(1801812339);
        bwx bwxVarB3 = bwwVar.b(1768715124);
        if (bwxVarB == null || bwxVarB2 == null || bwxVarB3 == null || m(bwxVarB.a) != 1835299937) {
            return null;
        }
        bwb bwbVar = bwxVarB2.a;
        bwbVar.P(12);
        int i = bwbVar.i();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bwbVar.i();
            bwbVar.Q(4);
            strArr[i2] = bwbVar.C(i3 - 8);
        }
        bwb bwbVar2 = bwxVarB3.a;
        bwbVar2.P(8);
        ArrayList arrayList = new ArrayList();
        while (bwbVar2.d() > 8) {
            int i4 = bwbVar2.c + bwbVar2.i();
            int i5 = bwbVar2.i() - 1;
            if (i5 < 0 || i5 >= i) {
                bvx.e("BoxParsers", a.bR(i5, "Skipped metadata with unknown key index: "));
            } else {
                String str = strArr[i5];
                while (true) {
                    int i6 = bwbVar2.c;
                    if (i6 < i4) {
                        int i7 = bwbVar2.i();
                        if (bwbVar2.i() == 1684108385) {
                            int i8 = bwbVar2.i();
                            int i9 = bwbVar2.i();
                            int i10 = i7 - 16;
                            byte[] bArr = new byte[i10];
                            bwbVar2.K(bArr, 0, i10);
                            try {
                                bwuVar = new bwu(str, bArr, i9, i8);
                                break;
                            } catch (Exception unused) {
                                bvx.e("MetadataUtil", "Failed to parse metadata entry with key: ".concat(String.valueOf(str)));
                                bwuVar = null;
                                break;
                            }
                        }
                        bwbVar2.P(i6 + i7);
                    }
                    bwuVar = null;
                    break;
                }
                if (bwuVar != null) {
                    arrayList.add(bwuVar);
                }
            }
            bwbVar2.P(i4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new bsx(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x02f1 A[Catch: all -> 0x0320, TRY_LEAVE, TryCatch #0 {all -> 0x0320, blocks: (B:20:0x0073, B:22:0x0079, B:30:0x00a1, B:32:0x00ad, B:33:0x00b8, B:36:0x00c4, B:39:0x00d1, B:42:0x00de, B:45:0x00eb, B:48:0x00f8, B:50:0x0102, B:58:0x0119, B:59:0x0124, B:60:0x0138, B:63:0x0144, B:66:0x0154, B:69:0x0164, B:72:0x0174, B:75:0x0184, B:78:0x0194, B:81:0x01a4, B:84:0x01b4, B:87:0x01c4, B:90:0x01d4, B:94:0x01e9, B:96:0x01ed, B:98:0x01fe, B:99:0x0205, B:101:0x020c, B:106:0x0218, B:111:0x0224, B:155:0x02f1, B:112:0x023a, B:114:0x0241, B:116:0x024b, B:118:0x0260, B:130:0x0289, B:133:0x0296, B:136:0x02a3, B:139:0x02af, B:142:0x02bb, B:145:0x02c7, B:148:0x02d1, B:151:0x02dd, B:154:0x02e9, B:157:0x0303, B:158:0x030a), top: B:241:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0315  */
    /* JADX WARN: Code duplicated, block: B:210:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:212:0x03c7 A[EDGE_INSN: B:212:0x03c7->B:216:0x03e7 BREAK  A[LOOP:4: B:176:0x0357->B:213:0x03de]] */
    /* JADX WARN: Code duplicated, block: B:255:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static bsx c(bwx bwxVar, boolean z) {
        int i;
        boolean z2;
        bsx bsxVarE;
        bsx bsxVar;
        bsx bsxVar2;
        int iO;
        bsx bsxVar3;
        Object obj;
        Object cyjVar;
        Object cydVar;
        String str;
        String str2;
        String str3;
        bwb bwbVar = bwxVar.a;
        int i2 = 8;
        bwbVar.P(8);
        boolean z3 = false;
        bsx bsxVar4 = new bsx(-9223372036854775807L, new bsw[0]);
        while (bwbVar.d() >= i2) {
            int i3 = bwbVar.c;
            int i4 = bwbVar.i() + i3;
            int i5 = bwbVar.i();
            int i6 = 13;
            String str4 = null;
            if (i5 == 1835365473) {
                bwbVar.P(i3);
                bwbVar.Q(i2);
                f(bwbVar);
                boolean z4 = z3;
                while (true) {
                    int i7 = bwbVar.c;
                    if (i7 < i4) {
                        int i8 = bwbVar.i() + i7;
                        if (bwbVar.i() == 1768715124) {
                            bwbVar.P(i7);
                            bwbVar.Q(i2);
                            ArrayList arrayList = new ArrayList();
                            ?? r3 = z4;
                            String str5 = str4;
                            while (true) {
                                int i9 = bwbVar.c;
                                if (i9 >= i8) {
                                    break;
                                }
                                int i10 = bwbVar.i();
                                if (i10 < i2) {
                                    bvx.e("MetadataUtil", "Skipped empty metadata entry");
                                } else {
                                    int i11 = i9 + i10;
                                    int i12 = bwbVar.i();
                                    int i13 = i12 >> 24;
                                    try {
                                        if (i11 - bwbVar.c < i2) {
                                            bvx.e("MetadataUtil", a.ce(rpi.H(i12), "Skipped empty metadata entry: "));
                                            bwbVar.P(i11);
                                        } else {
                                            int i14 = i13 & 255;
                                            if (i14 == 169 || i14 == 253) {
                                                int i15 = i12 & 16777215;
                                                if (i15 == 6516084) {
                                                    int i16 = bwbVar.i();
                                                    if (bwbVar.i() == 1684108385) {
                                                        bwbVar.Q(8);
                                                        String strB = bwbVar.B(i16 - 16);
                                                        cydVar = new cyd("und", strB, strB);
                                                        cyjVar = cydVar;
                                                    } else {
                                                        bvx.e("MetadataUtil", "Failed to parse comment attribute: ".concat(rpi.H(i12)));
                                                        cyjVar = null;
                                                    }
                                                } else if (i15 == 7233901 || i15 == 7631467) {
                                                    cyjVar = nj.h(i12, "TIT2", bwbVar);
                                                } else if (i15 == 6516589 || i15 == 7828084) {
                                                    cyjVar = nj.h(i12, "TCOM", bwbVar);
                                                } else if (i15 == 6578553) {
                                                    cyjVar = nj.h(i12, "TDRC", bwbVar);
                                                } else if (i15 == 4280916) {
                                                    cyjVar = nj.h(i12, "TPE1", bwbVar);
                                                } else if (i15 == 7630703) {
                                                    cyjVar = nj.h(i12, "TSSE", bwbVar);
                                                } else if (i15 == 6384738) {
                                                    cyjVar = nj.h(i12, "TALB", bwbVar);
                                                } else if (i15 == 7108978) {
                                                    cyjVar = nj.h(i12, "USLT", bwbVar);
                                                } else if (i15 == 6776174) {
                                                    cyjVar = nj.h(i12, "TCON", bwbVar);
                                                } else if (i15 == 6779504) {
                                                    cyjVar = nj.h(i12, "TIT1", bwbVar);
                                                } else if (i15 == 7173742) {
                                                    cyjVar = nj.h(i12, "MVNM", bwbVar);
                                                } else if (i15 == 7173737) {
                                                    cyjVar = nj.f(i12, "MVIN", bwbVar, true, false);
                                                } else {
                                                    bvx.g(a.ce(rpi.H(i12), "Skipped unknown metadata entry: "));
                                                    bwbVar.P(i11);
                                                    obj = null;
                                                }
                                                bwbVar.P(i11);
                                                obj = cyjVar;
                                            } else {
                                                if (i12 == 1735291493) {
                                                    String strA = cyi.a(nj.e(bwbVar) - 1);
                                                    if (strA != null) {
                                                        cyjVar = new cym("TCON", str5, agke.q(strA));
                                                    } else {
                                                        bvx.e("MetadataUtil", "Failed to parse standard genre code");
                                                        cydVar = str5;
                                                        cyjVar = cydVar;
                                                    }
                                                } else if (i12 == 1684632427) {
                                                    cyjVar = nj.g(1684632427, "TPOS", bwbVar);
                                                } else if (i12 == 1953655662) {
                                                    cyjVar = nj.g(1953655662, "TRCK", bwbVar);
                                                } else if (i12 == 1953329263) {
                                                    cyjVar = nj.f(1953329263, "TBPM", bwbVar, true, r3);
                                                } else if (i12 == 1668311404) {
                                                    cyjVar = nj.f(1668311404, "TCMP", bwbVar, true, true);
                                                } else if (i12 == 1668249202) {
                                                    int i17 = bwbVar.i();
                                                    if (bwbVar.i() == 1684108385) {
                                                        int i18 = bwbVar.i() & 16777215;
                                                        if (i18 == i6) {
                                                            str3 = "image/jpeg";
                                                        } else if (i18 == 14) {
                                                            str2 = "image/png";
                                                            i18 = 14;
                                                        } else {
                                                            str = str5;
                                                        }
                                                        if (str == null) {
                                                            str = str2;
                                                            str = str3;
                                                            bvx.e("MetadataUtil", a.bR(i18, "Unrecognized cover art flags: "));
                                                            cydVar = str5;
                                                        } else {
                                                            str = str2;
                                                            str = str3;
                                                            bwbVar.Q(4);
                                                            int i19 = i17 - 16;
                                                            byte[] bArr = new byte[i19];
                                                            bwbVar.K(bArr, r3, i19);
                                                            cyjVar = new cxz(str, str5, 3, bArr);
                                                        }
                                                    } else {
                                                        bvx.e("MetadataUtil", "Failed to parse cover art attribute");
                                                        cydVar = str5;
                                                    }
                                                    cyjVar = cydVar;
                                                } else if (i12 == 1631670868) {
                                                    cyjVar = nj.h(1631670868, "TPE2", bwbVar);
                                                } else if (i12 == 1936682605) {
                                                    cyjVar = nj.h(1936682605, "TSOT", bwbVar);
                                                } else if (i12 == 1936679276) {
                                                    cyjVar = nj.h(1936679276, "TSOA", bwbVar);
                                                } else if (i12 == 1936679282) {
                                                    cyjVar = nj.h(1936679282, "TSOP", bwbVar);
                                                } else if (i12 == 1936679265) {
                                                    cyjVar = nj.h(1936679265, "TSO2", bwbVar);
                                                } else if (i12 == 1936679791) {
                                                    cyjVar = nj.h(1936679791, "TSOC", bwbVar);
                                                } else if (i12 == 1920233063) {
                                                    cyjVar = nj.f(1920233063, "ITUNESADVISORY", bwbVar, r3, r3);
                                                } else if (i12 == 1885823344) {
                                                    cyjVar = nj.f(1885823344, "ITUNESGAPLESS", bwbVar, r3, true);
                                                } else if (i12 == 1936683886) {
                                                    cyjVar = nj.h(1936683886, "TVSHOWSORT", bwbVar);
                                                } else if (i12 == 1953919848) {
                                                    cyjVar = nj.h(1953919848, "TVSHOW", bwbVar);
                                                } else if (i12 == 757935405) {
                                                    String strB2 = str5;
                                                    String strB3 = strB2;
                                                    int i20 = -1;
                                                    int i21 = -1;
                                                    while (true) {
                                                        int i22 = bwbVar.c;
                                                        if (i22 >= i11) {
                                                            break;
                                                        }
                                                        int i23 = bwbVar.i();
                                                        int i24 = bwbVar.i();
                                                        bwbVar.Q(4);
                                                        if (i24 == 1835360622) {
                                                            strB2 = bwbVar.B(i23 - 12);
                                                        } else {
                                                            int i25 = i23 - 12;
                                                            if (i24 == 1851878757) {
                                                                strB3 = bwbVar.B(i25);
                                                            } else {
                                                                if (i24 == 1684108385) {
                                                                    i21 = i23;
                                                                }
                                                                if (i24 == 1684108385) {
                                                                    i20 = i22;
                                                                }
                                                                bwbVar.Q(i25);
                                                            }
                                                        }
                                                    }
                                                    if (strB2 == null || strB3 == null || i20 == -1) {
                                                        cyjVar = null;
                                                    } else {
                                                        bwbVar.P(i20);
                                                        bwbVar.Q(16);
                                                        cyjVar = new cyj(strB2, strB3, bwbVar.B(i21 - 16));
                                                    }
                                                } else {
                                                    bvx.g(a.ce(rpi.H(i12), "Skipped unknown metadata entry: "));
                                                    bwbVar.P(i11);
                                                    obj = null;
                                                }
                                                bwbVar.P(i11);
                                                obj = cyjVar;
                                            }
                                        }
                                        if (obj != null) {
                                            arrayList.add(obj);
                                        }
                                        i2 = 8;
                                        r3 = 0;
                                        str5 = null;
                                        i6 = 13;
                                    } catch (Throwable th) {
                                        bwbVar.P(i11);
                                        throw th;
                                    }
                                }
                                obj = str5;
                                if (obj != null) {
                                    arrayList.add(obj);
                                }
                                i2 = 8;
                                r3 = 0;
                                str5 = null;
                                i6 = 13;
                            }
                            if (!arrayList.isEmpty()) {
                                bsxVar3 = new bsx(arrayList);
                                break;
                            }
                        } else {
                            bwbVar.P(i8);
                            i2 = 8;
                            z4 = false;
                            str4 = null;
                            i6 = 13;
                        }
                    }
                    bsxVar3 = null;
                    break;
                }
                bsxVar4 = bsxVar4.e(bsxVar3);
                i = 8;
            } else {
                if (i5 == 1936553057) {
                    bwbVar.P(i3);
                    bwbVar.Q(12);
                    while (true) {
                        int i26 = bwbVar.c;
                        if (i26 < i4) {
                            int i27 = bwbVar.i();
                            if (bwbVar.i() == 1935766900) {
                                if (i27 < 16) {
                                    bsxVar2 = null;
                                    i = 8;
                                    break;
                                }
                                bwbVar.Q(4);
                                int i28 = -1;
                                int i29 = 0;
                                for (int i30 = 0; i30 < 2; i30++) {
                                    int iN = bwbVar.n();
                                    int iN2 = bwbVar.n();
                                    if (iN == 0) {
                                        i28 = iN2;
                                    } else if (iN == 1) {
                                        i29 = iN2;
                                    }
                                }
                                if (i28 == 12) {
                                    iO = 240;
                                } else if (i28 != 13) {
                                    if (i28 != 21) {
                                        iO = -2147483647;
                                    } else {
                                        i = 8;
                                        if (bwbVar.d() < 8 || bwbVar.c + 8 > i4) {
                                            iO = -2147483647;
                                        } else {
                                            int i31 = bwbVar.i();
                                            int i32 = bwbVar.i();
                                            if (i31 < 12 || i32 != 1936877170) {
                                                iO = -2147483647;
                                            } else {
                                                iO = bwbVar.o();
                                            }
                                        }
                                    }
                                    if (iO != -2147483647) {
                                        bsxVar2 = new bsx(-9223372036854775807L, new cyq(iO, i29));
                                        break;
                                    }
                                } else {
                                    iO = 120;
                                }
                                i = 8;
                                if (iO != -2147483647) {
                                    bsxVar2 = new bsx(-9223372036854775807L, new cyq(iO, i29));
                                    break;
                                }
                            } else {
                                bwbVar.P(i26 + i27);
                            }
                        } else {
                            i = 8;
                        }
                        bsxVar2 = null;
                        break;
                    }
                    bsxVar4 = bsxVar4.e(bsxVar2);
                } else {
                    i = 8;
                    if (i5 == -1451722374) {
                        short sG = bwbVar.G();
                        bwbVar.Q(2);
                        Matcher matcher = c.matcher(bwbVar.C(sG));
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            int i33 = bwp.a;
                            String strGroup2 = matcher.group(2);
                            try {
                                float f = Float.parseFloat(strGroup);
                                float f2 = Float.parseFloat(strGroup2);
                                String strGroup3 = matcher.group(3);
                                if (strGroup3 != null) {
                                    bsxVar = new bsx(-9223372036854775807L, new bwz(f, f2, Float.parseFloat(strGroup3)));
                                } else {
                                    bsw[] bswVarArr = new bsw[1];
                                    z2 = false;
                                    try {
                                        bswVarArr[0] = new bwz(f, f2, -3.4028235E38f);
                                        bsxVar = new bsx(-9223372036854775807L, bswVarArr);
                                    } catch (IllegalArgumentException unused) {
                                        bsxVar = null;
                                    }
                                }
                            } catch (IllegalArgumentException unused2) {
                                z2 = false;
                            }
                            bsxVarE = bsxVar4.e(bsxVar);
                        } else {
                            bsxVar = null;
                        }
                        z2 = false;
                        bsxVarE = bsxVar4.e(bsxVar);
                    } else {
                        z2 = false;
                        if (i5 == 1667788908) {
                            bsxVarE = bsxVar4.e(a(bwbVar));
                        }
                    }
                    bsxVar4 = bsxVarE;
                }
                bwbVar.P(i4);
                i2 = i;
                z3 = z2;
            }
            z2 = false;
            bwbVar.P(i4);
            i2 = i;
            z3 = z2;
        }
        return bsxVar4;
    }

    public static bxa d(bwb bwbVar) {
        long jV;
        long jV2;
        bwbVar.P(8);
        if (((bwbVar.i() >> 24) & 255) == 0) {
            jV = bwbVar.w();
            jV2 = bwbVar.w();
        } else {
            jV = bwbVar.v();
            jV2 = bwbVar.v();
        }
        return new bxa(jV, jV2, bwbVar.w());
    }

    public static daj e(daj dajVar) {
        int iN;
        bse bseVar = dajVar.g;
        if (!Objects.equals(bseVar.q, "application/x-mp4-mebx")) {
            return dajVar;
        }
        List list = bseVar.t;
        if (!list.isEmpty()) {
            bwb bwbVar = new bwb((byte[]) list.get(0));
            int i = -1;
            byte[] bArr = null;
            while (bwbVar.d() >= 8) {
                int i2 = bwbVar.c;
                int i3 = bwbVar.i();
                int i4 = bwbVar.i();
                if (i3 < 8 || i3 - 8 > bwbVar.d()) {
                    break;
                }
                int i5 = i2 + i3;
                byte[] bArr2 = null;
                boolean z = false;
                while (true) {
                    int i6 = bwbVar.c;
                    if (i6 + 8 > i5) {
                        break;
                    }
                    int i7 = bwbVar.i();
                    int i8 = bwbVar.i();
                    if (i7 < 8 || i7 > i5 - i6) {
                        break;
                    }
                    if (i8 == 1801812324) {
                        if (i7 >= 12 && bwbVar.i() == 1835349091 && i7 == 16) {
                            if (bwbVar.i() == 1769222965) {
                                z = true;
                            }
                            i7 = 16;
                        }
                    } else if (i8 == 1936028789 && i7 >= 9 && i7 - 9 >= (iN = bwbVar.n())) {
                        bArr2 = new byte[iN];
                        bwbVar.K(bArr2, 0, iN);
                    }
                    bwbVar.P(i6 + i7);
                }
                if (z && bArr2 != null) {
                    boolean zI = bvf.i(bArr2, bArr2.length);
                    if (bArr != null) {
                        if (zI) {
                            i = i4;
                            bArr = bArr2;
                            break;
                        }
                    } else {
                        if (zI) {
                            i = i4;
                            bArr = bArr2;
                            break;
                        }
                        i = i4;
                        bArr = bArr2;
                    }
                }
                bwbVar.P(i5);
            }
            if (bArr != null) {
                bsd bsdVar = new bsd(bseVar);
                bsdVar.e("application/x-itut-t35");
                bsdVar.r = agke.q(bArr);
                bse bseVar2 = new bse(bsdVar);
                dai daiVar = new dai(dajVar);
                daiVar.g = bseVar2;
                daiVar.h = 2;
                daiVar.n = i;
                return daiVar.a();
            }
        }
        return null;
    }

    public static void f(bwb bwbVar) {
        int i = bwbVar.c;
        bwbVar.Q(4);
        if (bwbVar.i() != 1751411826) {
            i += 4;
        }
        bwbVar.P(i);
    }

    static boolean g(bwb bwbVar, int i) {
        while (bwbVar.d() >= 8) {
            int i2 = bwbVar.c;
            int i3 = bwbVar.i();
            int i4 = bwbVar.i();
            int i5 = i3 - 8;
            if (i5 < 0 || i5 > bwbVar.d()) {
                break;
            }
            if (i4 == i) {
                bwbVar.O(i2 + i3);
                return true;
            }
            bwbVar.Q(i5);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [int[]] */
    /* JADX WARN: Type inference failed for: r29v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r46v2 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static dal h(daj dajVar, bww bwwVar, cvr cvrVar) throws bsz {
        czr czuVar;
        boolean z;
        int iQ;
        int iQ2;
        int iQ3;
        boolean z2;
        int i;
        int[] iArr;
        long[] jArr;
        ?? CopyOf;
        long[] jArr2;
        boolean z3;
        int i2;
        long j;
        int i3;
        int i4;
        long[] jArr3;
        long j2;
        ?? r29;
        long j3;
        int i5;
        long j4;
        int i6;
        int i7;
        long j5;
        long[] jArr4;
        int[] iArr2;
        ArrayList arrayList;
        ?? r5;
        dal dalVar;
        int[] iArr3;
        int[] iArr4;
        int i8;
        int i9;
        int length;
        long j6;
        daj dajVarA = dajVar;
        bwx bwxVarB = bwwVar.b(1937011578);
        if (bwxVarB != null) {
            czuVar = new czt(bwxVarB, dajVarA.g);
        } else {
            bwx bwxVarB2 = bwwVar.b(1937013298);
            if (bwxVarB2 == null) {
                throw new bsz("Track has no sample table size information", null, true, 1);
            }
            czuVar = new czu(bwxVarB2);
        }
        int iB = czuVar.b();
        if (iB == 0) {
            return new dal(dajVarA, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (dajVarA.b == 2) {
            long j7 = dajVarA.f;
            if (j7 > 0) {
                bsd bsdVar = new bsd(dajVarA.g);
                bsdVar.b(iB / (j7 / 1000000.0f));
                bse bseVar = new bse(bsdVar);
                dai daiVar = new dai(dajVarA);
                daiVar.g = bseVar;
                dajVarA = daiVar.a();
            }
        }
        bwx bwxVarB3 = bwwVar.b(1937007471);
        if (bwxVarB3 == null) {
            bwxVarB3 = bwwVar.b(1668232756);
            bwxVarB3.getClass();
            z = true;
        } else {
            z = false;
        }
        bwx bwxVarB4 = bwwVar.b(1937011555);
        bwxVarB4.getClass();
        bwx bwxVarB5 = bwwVar.b(1937011827);
        bwxVarB5.getClass();
        bwx bwxVarB6 = bwwVar.b(1937011571);
        bwb bwbVar = bwxVarB6 != null ? bwxVarB6.a : null;
        bwx bwxVarB7 = bwwVar.b(1668576371);
        bwb bwbVar2 = bwxVarB7 != null ? bwxVarB7.a : null;
        bwb bwbVar3 = bwxVarB5.a;
        czp czpVar = new czp(bwxVarB4.a, bwxVarB3.a, z);
        bwbVar3.P(12);
        int iQ4 = bwbVar3.q() - 1;
        int iQ5 = bwbVar3.q();
        int iQ6 = bwbVar3.q();
        if (bwbVar2 != null) {
            bwbVar2.P(12);
            iQ = bwbVar2.q();
        } else {
            iQ = 0;
        }
        if (bwbVar != null) {
            bwbVar.P(12);
            iQ2 = bwbVar.q();
            if (iQ2 > 0) {
                iQ3 = bwbVar.q() - 1;
            } else {
                iQ3 = -1;
                bwbVar = null;
            }
        } else {
            iQ2 = 0;
            iQ3 = -1;
        }
        int iA = czuVar.a();
        bse bseVar2 = dajVarA.g;
        if (iA != -1) {
            String str = bseVar2.q;
            if (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iQ4 == 0) {
                z2 = iQ == 0 && iQ2 == 0;
                iQ4 = 0;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        ?? r31 = bwbVar == null ? 1 : 0;
        if (z2) {
            int i10 = czpVar.a;
            long[] jArr5 = new long[i10];
            int[] iArr5 = new int[i10];
            while (czpVar.a()) {
                int i11 = czpVar.b;
                jArr5[i11] = czpVar.d;
                iArr5[i11] = czpVar.c;
            }
            long j8 = iQ6;
            int iMax = Math.max(1, SemanticState.Multiline / iA);
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = iArr5[i13];
                int i15 = bwp.a;
                i12 += ((i14 + iMax) - 1) / iMax;
            }
            jArr3 = new long[i12];
            iArr = new int[i12];
            jArr2 = new long[i12];
            int[] iArr6 = new int[i12];
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i16 < i10) {
                int i21 = iArr5[i16];
                long j9 = jArr5[i16];
                int i22 = i20;
                int i23 = i10;
                int iMax2 = i19;
                int i24 = i22;
                int i25 = i16;
                int i26 = i21;
                while (i26 > 0) {
                    int iMin = Math.min(iMax, i26);
                    jArr3[i24] = j9;
                    int i27 = i26;
                    int i28 = iA * iMin;
                    iArr[i24] = i28;
                    int i29 = i18 + i28;
                    iMax2 = Math.max(iMax2, i28);
                    jArr2[i24] = ((long) i17) * j8;
                    iArr6[i24] = 1;
                    j9 += (long) iArr[i24];
                    i17 += iMin;
                    i24++;
                    iMax = iMax;
                    i26 = i27 - iMin;
                    i18 = i29;
                }
                int i30 = i24;
                i19 = iMax2;
                i10 = i23;
                i20 = i30;
                iMax = iMax;
                i16 = i25 + 1;
            }
            j2 = i18;
            i4 = i12;
            r29 = iArr6;
            i = i19;
            j3 = j8 * ((long) i17);
        } else {
            long[] jArr6 = new long[iB];
            int[] iArr7 = new int[iB];
            bwb bwbVar4 = bwbVar2;
            long[] jArrCopyOf = new long[iB];
            czr czrVar = czuVar;
            int i31 = iQ2;
            int i32 = iQ;
            int i33 = iQ4;
            bwb bwbVar5 = bwbVar;
            int iQ7 = iQ3;
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            int i34 = 0;
            int i35 = 0;
            i = 0;
            int i36 = 0;
            int iQ8 = 0;
            ?? r4 = new int[iB];
            while (true) {
                if (i34 >= iB) {
                    iArr = iArr7;
                    jArr = jArr6;
                    CopyOf = r4;
                    break;
                }
                long j13 = j10;
                boolean zA = true;
                while (true) {
                    if (i36 != 0) {
                        i5 = i36;
                        break;
                    }
                    zA = czpVar.a();
                    if (!zA) {
                        i5 = 0;
                        break;
                    }
                    j13 = czpVar.d;
                    i36 = czpVar.c;
                    iB = iB;
                }
                int i37 = iB;
                if (!zA) {
                    bvx.e("BoxParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr6, i34);
                    int[] iArrCopyOf = Arrays.copyOf(iArr7, i34);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i34);
                    jArr = jArrCopyOf2;
                    iArr = iArrCopyOf;
                    iB = i34;
                    CopyOf = Arrays.copyOf((int[]) r4, i34);
                    break;
                }
                if (bwbVar4 != null) {
                    while (iQ8 == 0) {
                        if (i32 <= 0) {
                            iQ8 = 0;
                            break;
                        }
                        i32--;
                        iQ8 = bwbVar4.q();
                        i35 = bwbVar4.i();
                    }
                    iQ8--;
                }
                int iC = czrVar.c();
                ?? r39 = r4;
                long[] jArr7 = jArr6;
                long j14 = iC;
                j12 += j14;
                if (iC > i) {
                    i = iC;
                }
                jArr7[i34] = j13;
                iArr7[i34] = iC;
                int i38 = i5;
                jArrCopyOf[i34] = j11 + ((long) i35);
                r39[i34] = r31;
                if (i34 == iQ7) {
                    r39[i34] = 1;
                    arrayList2.add(Integer.valueOf(i34));
                }
                if (bwbVar5 != null && i34 == iQ7 && (i31 = i31 - 1) > 0) {
                    iQ7 = bwbVar5.q() - 1;
                }
                j11 += (long) iQ6;
                iQ5--;
                if (iQ5 == 0) {
                    if (i33 > 0) {
                        i33--;
                        iQ5 = bwbVar3.q();
                        iQ6 = bwbVar3.i();
                    } else {
                        iQ5 = 0;
                    }
                }
                long j15 = j13 + j14;
                i36 = i38 - 1;
                i34++;
                jArr6 = jArr7;
                r4 = r39;
                iB = i37;
                j10 = j15;
            }
            jArr2 = jArrCopyOf;
            long j16 = j11 + ((long) i35);
            if (bwbVar4 == null) {
                z3 = true;
                break;
            }
            while (true) {
                if (i32 <= 0) {
                    z3 = true;
                    break;
                }
                if (bwbVar4.q() != 0) {
                    z3 = false;
                    break;
                }
                bwbVar4.i();
                i32--;
            }
            int i39 = iB;
            ?? r46 = CopyOf;
            if (i31 == 0) {
                if (iQ5 == 0) {
                    if (i36 == 0) {
                        j = j16;
                        if (i33 != 0) {
                            i33 = i33;
                            i2 = 0;
                            i36 = 0;
                        } else if (iQ8 != 0) {
                            i2 = 0;
                            i36 = 0;
                            i33 = 0;
                        } else if (!z3) {
                            i3 = 0;
                            i2 = 0;
                            iQ8 = 0;
                            z3 = false;
                            i36 = 0;
                            i33 = 0;
                        }
                        i3 = 0;
                    } else {
                        i2 = 0;
                    }
                    i4 = i39;
                    jArr3 = jArr;
                    j2 = j12;
                    r29 = r46;
                    j3 = j;
                } else {
                    i2 = iQ5;
                }
                j = j16;
                i3 = 0;
            } else {
                i36 = i36;
                i2 = iQ5;
                i33 = i33;
                iQ8 = iQ8;
                z3 = z3;
                j = j16;
                i3 = i31;
            }
            int i40 = dajVarA.a;
            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
            sb.append(i40);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i3);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i2);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i36);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i33);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(iQ8);
            sb.append(true != z3 ? ", ctts invalid" : "");
            bvx.e("BoxParsers", sb.toString());
            i4 = i39;
            jArr3 = jArr;
            j2 = j12;
            r29 = r46;
            j3 = j;
        }
        long j17 = dajVarA.f;
        if (j17 > 0) {
            long jD = bwp.D(j2 << 3, 1000000L, j17, RoundingMode.HALF_DOWN);
            if (jD > 0 && jD < 2147483647L) {
                bsd bsdVar2 = new bsd(bseVar2);
                bsdVar2.i = (int) jD;
                bse bseVar3 = new bse(bsdVar2);
                dai daiVar2 = new dai(dajVarA);
                daiVar2.g = bseVar3;
                dajVarA = daiVar2.a();
            }
        }
        long j18 = dajVarA.c;
        long jC = bwp.C(j3, 1000000L, j18);
        int[] iArrS = ahng.S(arrayList2);
        ahbp ahbpVar = dajVarA.i;
        if (ahbpVar == null) {
            bwp.ar(jArr2, j18);
            dalVar = new dal(dajVarA, jArr3, iArr, i, jArr2, r29, iArrS, r31, jC, i4);
        } else {
            long[] jArr8 = jArr3;
            int i41 = i;
            int[] iArr8 = iArr;
            int i42 = ahbpVar.b;
            if (i42 == 1) {
                if (dajVarA.b != 1 || (length = jArr2.length) < 2) {
                    j4 = j18;
                } else {
                    ahbp ahbpVar2 = dajVarA.j;
                    ahbpVar2.getClass();
                    long jA = ahbpVar2.a(0);
                    long jA2 = ahbpVar.a(0);
                    long j19 = dajVarA.d;
                    long jC2 = bwp.C(jA2, j18, j19) + jA;
                    int i43 = length - 1;
                    int iC2 = bwp.c(4, 0, i43);
                    int iC3 = bwp.c(length - 4, 0, i43);
                    if (jArr2[0] > jA || jA >= jArr2[iC2] || jArr2[iC3] >= jC2 || jC2 > j3 + 2) {
                        j4 = j18;
                    } else {
                        long jMax = Math.max(0L, j3 - jC2);
                        long j20 = jA - jArr2[0];
                        long j21 = dajVarA.g.K;
                        long jC3 = bwp.C(j20, j21, j18);
                        long jC4 = bwp.C(jMax, j21, j18);
                        j4 = j18;
                        if (jC3 != 0) {
                            j6 = jC3;
                        } else if (jC4 != 0) {
                            j6 = 0;
                        }
                        if (j6 <= 2147483647L && jC4 <= 2147483647L) {
                            cvrVar.a = (int) j6;
                            cvrVar.b = (int) jC4;
                            bwp.ar(jArr2, j4);
                            dalVar = new dal(dajVarA, jArr8, iArr8, i41, jArr2, r29, iArrS, r31, bwp.C(ahbpVar.a(0), 1000000L, j19), i4);
                        }
                    }
                }
                i6 = 1;
                i7 = 1;
            } else {
                j4 = j18;
                i6 = 1;
                i7 = i42;
            }
            if (i7 == i6) {
                j5 = 0;
                if (ahbpVar.a(0) == 0) {
                    ahbp ahbpVar3 = dajVarA.j;
                    ahbpVar3.getClass();
                    long jA3 = ahbpVar3.a(0);
                    for (int i44 = 0; i44 < jArr2.length; i44++) {
                        jArr2[i44] = bwp.C(jArr2[i44] - jA3, 1000000L, j4);
                    }
                    dalVar = new dal(dajVarA, jArr8, iArr8, i41, jArr2, r29, iArrS, r31, bwp.C(j3 - jA3, 1000000L, j4), i4);
                }
            } else {
                j5 = 0;
            }
            daj dajVar2 = dajVarA;
            long j22 = j4;
            long[] jArr9 = jArr8;
            int[] iArr9 = iArr8;
            ?? r15 = r29;
            int i45 = i4;
            boolean z4 = dajVar2.b == 1;
            ahbp ahbpVar4 = dajVar2.j;
            int[] iArr10 = new int[i7];
            int[] iArr11 = new int[i7];
            ahbpVar4.getClass();
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            boolean z5 = false;
            while (i47 < i7) {
                int[] iArr12 = iArr9;
                ArrayList arrayList3 = arrayList2;
                long jA4 = ahbpVar4.a(i47);
                if (jA4 != -1) {
                    iArr4 = iArr11;
                    i8 = i47;
                    long j23 = j22;
                    j22 = j23;
                    long jC5 = bwp.C(ahbpVar.a(i47), j23, dajVar2.d) + jA4;
                    boolean z6 = z5;
                    iArr10[i8] = bwp.an(jArr2, jA4, true);
                    int iAl = bwp.al(jArr2, jC5, z4);
                    int i49 = iAl - 1;
                    int i50 = 0;
                    for (int i51 = iAl; i51 < jArr2.length; i51++) {
                        if (jArr2[i51] >= jC5) {
                            i50++;
                            if (i50 > dajVar2.g.s) {
                                break;
                            }
                        } else {
                            i49 = i51;
                        }
                    }
                    iArr4[i8] = i49 + 1;
                    int i52 = iArr10[i8];
                    while (true) {
                        i9 = iArr10[i8];
                        if (i9 <= 0 || (r15[i9] & 1) != 0) {
                            break;
                            break;
                        }
                        iArr10[i8] = i9 - 1;
                    }
                    if (i9 == 0 && (r15[0] & 1) == 0) {
                        iArr10[i8] = i52;
                        while (true) {
                            i9 = iArr10[i8];
                            if (i9 >= iArr4[i8] || (r15[i9] & 1) != 0) {
                                break;
                            }
                            iArr10[i8] = i9 + 1;
                        }
                    }
                    int i53 = iArr4[i8];
                    i48 += i53 - i9;
                    z5 = z6 | (i46 != i9);
                    i46 = i53;
                } else {
                    iArr4 = iArr11;
                    i8 = i47;
                }
                i47 = i8 + 1;
                arrayList2 = arrayList3;
                iArr11 = iArr4;
                z4 = z4;
                iArr9 = iArr12;
            }
            int[] iArr13 = iArr11;
            int[] iArr14 = iArr9;
            ArrayList arrayList4 = arrayList2;
            boolean z7 = z5 | (i48 != i45);
            if (z7) {
                jArr4 = new long[i48];
                iArr2 = new int[i48];
            } else {
                jArr4 = jArr9;
                iArr2 = iArr14;
            }
            int i54 = true == z7 ? 0 : i41;
            if (z7) {
                arrayList = new ArrayList();
                r5 = new int[i48];
            } else {
                arrayList = arrayList4;
                r5 = r15;
            }
            long[] jArr10 = new long[i48];
            int i55 = i54;
            long jA5 = j5;
            int i56 = 0;
            int i57 = 0;
            ?? r6 = r5;
            while (i56 < i7) {
                long jA6 = ahbpVar4.a(i56);
                int i58 = iArr10[i56];
                ahbp ahbpVar5 = ahbpVar4;
                int i59 = iArr13[i56];
                if (z7) {
                    int i60 = i59 - i58;
                    System.arraycopy(jArr9, i58, jArr4, i57, i60);
                    iArr3 = iArr14;
                    System.arraycopy(iArr3, i58, iArr2, i57, i60);
                    System.arraycopy(r15, i58, r6, i57, i60);
                } else {
                    iArr3 = iArr14;
                }
                int i61 = i55;
                ?? r7 = r6;
                while (i58 < i59) {
                    int i62 = i59;
                    ?? r210 = r7;
                    jArr10[i57] = bwp.C(jA5, 1000000L, dajVar2.d) + bwp.C(jArr2[i58] - jA6, 1000000L, j22);
                    if (z7 && iArr2[i57] > i61) {
                        i61 = iArr3[i58];
                    }
                    if (z7 && r31 == 0 && (r210[i57] & 1) != 0) {
                        arrayList.add(Integer.valueOf(i57));
                    }
                    i57++;
                    i58++;
                    i59 = i62;
                    r7 = r210;
                }
                jA5 += ahbpVar.a(i56);
                i56++;
                iArr14 = iArr3;
                i55 = i61;
                ahbpVar4 = ahbpVar5;
                jArr9 = jArr9;
                jArr10 = jArr10;
                r6 = r7;
            }
            dalVar = new dal(dajVar2, jArr4, iArr2, i55, jArr10, r6, ahng.S(arrayList), r31, bwp.C(jA5, 1000000L, dajVar2.d), jArr4.length);
        }
        return dalVar;
    }

    /* JADX WARN: Code duplicated, block: B:247:0x043f  */
    /* JADX WARN: Code duplicated, block: B:277:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:581:0x0c99  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:601:0x0d4e  */
    /* JADX WARN: Code duplicated, block: B:602:0x0d78  */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121 A[PHI: r6 r31
      0x0121: PHI (r6v8 int) = (r6v9 int), (r6v4 int) binds: [B:68:0x0133, B:61:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r31v5 int) = (r31v6 int), (r31v7 int) binds: [B:68:0x0133, B:61:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x012d  */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:70:0x013b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0141  */
    /* JADX WARN: Code duplicated, block: B:73:0x014d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0151  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158 A[DONT_INVERT, PHI: r0
      0x0158: PHI (r0v5 int) = (r0v4 int), (r0v10 int) binds: [B:72:0x014b, B:75:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x015a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r3v125, types: [agjz] */
    /* JADX WARN: Type inference failed for: r3v157 */
    /* JADX WARN: Type inference failed for: r3v159 */
    /* JADX WARN: Type inference failed for: r3v160 */
    /* JADX WARN: Type inference failed for: r3v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v109 */
    /* JADX WARN: Type inference failed for: r7v110 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v60 */
    public static List i(bww bwwVar, cvr cvrVar, long j, bsa bsaVar, boolean z, boolean z2, Function function) throws bsz {
        long j2;
        long jW;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        long jC;
        long j3;
        ?? r0;
        bww bwwVar2;
        int i11;
        ahbp ahbpVar;
        ahbp ahbpVar2;
        daj dajVarA;
        bww bwwVarA;
        Pair pairN;
        bwx bwxVarB;
        boolean z4;
        aawx aawxVar;
        long j4;
        long j5;
        bsa bsaVarB;
        String str;
        String str2;
        int i12;
        ?? r3;
        byte[] bArrArray;
        czs czsVar;
        int i13;
        int i14;
        String str3;
        int i15;
        dep depVar;
        int i16;
        boolean z5;
        int i17;
        int i18;
        boolean z6;
        float f;
        boolean z7;
        boolean z8;
        String str4;
        agke agkeVarQ;
        String str5;
        agke agkeVar;
        boolean z9;
        daj dajVar;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        int i19 = 0;
        while (true) {
            List list = bwwVar.c;
            if (i19 >= list.size()) {
                return arrayList2;
            }
            bww bwwVar3 = (bww) list.get(i19);
            if (bwwVar3.d != 1953653099) {
                arrayList = arrayList2;
                i10 = i19;
            } else {
                bwx bwxVarB2 = bwwVar.b(1836476516);
                bwxVarB2.getClass();
                bww bwwVarA2 = bwwVar3.a(1835297121);
                bwwVarA2.getClass();
                bwx bwxVarB3 = bwwVarA2.b(1751411826);
                bwxVarB3.getClass();
                int iK = k(m(bwxVarB3.a));
                if (iK == -1) {
                    i10 = i19;
                    bwwVar2 = bwwVar3;
                } else {
                    bwx bwxVarB4 = bwwVar3.b(1953196132);
                    bwxVarB4.getClass();
                    bwb bwbVar = bwxVarB4.a;
                    bwbVar.P(8);
                    int i20 = (bwbVar.i() >> 24) & 255;
                    bwbVar.Q(i20 != 0 ? 16 : 8);
                    int i21 = bwbVar.i();
                    int i22 = 4;
                    bwbVar.Q(4);
                    int i23 = bwbVar.c;
                    int i24 = 0;
                    while (true) {
                        int i25 = i20 == 0 ? i22 : 8;
                        if (i24 < i25) {
                            j2 = -9223372036854775807L;
                            if (bwbVar.b[i23 + i24] != -1) {
                                jW = i20 == 0 ? bwbVar.w() : bwbVar.x();
                                if (jW != 0) {
                                    break;
                                }
                                break;
                            }
                            i24++;
                            i22 = 4;
                        } else {
                            j2 = -9223372036854775807L;
                            bwbVar.Q(i25);
                        }
                        jW = j2;
                        break;
                    }
                    bwbVar.Q(10);
                    int iS = bwbVar.s();
                    bwbVar.Q(4);
                    int i26 = bwbVar.i();
                    int i27 = bwbVar.i();
                    bwbVar.Q(4);
                    int i28 = bwbVar.i();
                    int i29 = bwbVar.i();
                    if (i26 != 0) {
                        if (i26 == 0) {
                            i = iK;
                            if (i27 == -65536) {
                                if (i28 != 65536) {
                                    if (i28 == -65536) {
                                        if (i29 == 0) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        i28 = -65536;
                                        i2 = -65536;
                                    } else {
                                        i2 = i28;
                                    }
                                    i3 = 0;
                                    i6 = -65536;
                                    i5 = -65536;
                                    i27 = -65536;
                                } else {
                                    if (i29 == 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    i2 = i28;
                                }
                                if (true != z3) {
                                    i29 = i29;
                                    i7 = 270;
                                    i8 = i27;
                                } else {
                                    i3 = 0;
                                    i6 = -65536;
                                    i5 = -65536;
                                    i27 = -65536;
                                }
                                i9 = 16;
                            } else {
                                i6 = -65536;
                                i2 = i28;
                                i5 = i27;
                                i3 = 0;
                            }
                            i4 = 0;
                        } else {
                            i = iK;
                            i2 = i28;
                            i3 = i26;
                            i4 = i3;
                            i5 = i27;
                            i6 = -65536;
                        }
                        if (i3 == i6) {
                            if (i27 == 0 && i2 == 0) {
                                i29 = -65536;
                                if (i29 == -65536) {
                                    int i30 = i5;
                                    i26 = i3;
                                    i8 = i30;
                                    i7 = 180;
                                    i9 = 16;
                                }
                            }
                            int i31 = i5;
                            i26 = i3;
                            i8 = i31;
                        } else if (i3 == 65536) {
                            i3 = 65536;
                            if (i27 == 0) {
                                i29 = -65536;
                                if (i29 == -65536) {
                                    int i32 = i5;
                                    i26 = i3;
                                    i8 = i32;
                                    i7 = 180;
                                    i9 = 16;
                                }
                            }
                            int i33 = i5;
                            i26 = i3;
                            i8 = i33;
                        } else {
                            i8 = i5;
                            i26 = i4;
                        }
                        i9 = 16;
                        i7 = 0;
                    } else {
                        if (i27 == 65536) {
                            if (i28 != -65536) {
                                if (i28 == 65536) {
                                    z9 = i29 != 0;
                                    i28 = 65536;
                                }
                                i26 = 0;
                                i27 = 65536;
                            } else {
                                z9 = i29 != 0;
                            }
                            if (true != z9) {
                                i = iK;
                                i29 = i29;
                                i26 = 0;
                                i9 = 16;
                                i7 = 90;
                                i8 = 65536;
                            } else {
                                i26 = 0;
                                i27 = 65536;
                            }
                        } else {
                            i26 = 0;
                        }
                        if (i26 == 0) {
                            i = iK;
                            if (i27 == -65536) {
                                if (i28 != 65536) {
                                    if (i28 == -65536) {
                                        if (i29 == 0) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        i28 = -65536;
                                        i2 = -65536;
                                    } else {
                                        i2 = i28;
                                    }
                                    i3 = 0;
                                    i6 = -65536;
                                    i5 = -65536;
                                    i27 = -65536;
                                } else {
                                    if (i29 == 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    i2 = i28;
                                }
                                if (true != z3) {
                                    i29 = i29;
                                    i7 = 270;
                                    i8 = i27;
                                } else {
                                    i3 = 0;
                                    i6 = -65536;
                                    i5 = -65536;
                                    i27 = -65536;
                                }
                                i9 = 16;
                            } else {
                                i6 = -65536;
                                i2 = i28;
                                i5 = i27;
                                i3 = 0;
                            }
                            i4 = 0;
                        } else {
                            i = iK;
                            i2 = i28;
                            i3 = i26;
                            i4 = i3;
                            i5 = i27;
                            i6 = -65536;
                        }
                        if (i3 == i6) {
                            if (i27 == 0) {
                                i29 = -65536;
                                if (i29 == -65536) {
                                    int i34 = i5;
                                    i26 = i3;
                                    i8 = i34;
                                    i7 = 180;
                                    i9 = 16;
                                }
                            }
                            int i35 = i5;
                            i26 = i3;
                            i8 = i35;
                        } else if (i3 == 65536) {
                            i3 = 65536;
                            if (i27 == 0) {
                                i29 = -65536;
                                if (i29 == -65536) {
                                    int i36 = i5;
                                    i26 = i3;
                                    i8 = i36;
                                    i7 = 180;
                                    i9 = 16;
                                }
                            }
                            int i37 = i5;
                            i26 = i3;
                            i8 = i37;
                        } else {
                            i8 = i5;
                            i26 = i4;
                        }
                        i9 = 16;
                        i7 = 0;
                    }
                    bwbVar.Q(i9);
                    short sG = bwbVar.G();
                    i10 = i19;
                    bwbVar.Q(2);
                    short sG2 = bwbVar.G();
                    long j6 = jW;
                    int i38 = (((((long) i26) * ((long) i29)) - (((long) i8) * ((long) i28))) > 0L ? 1 : (((((long) i26) * ((long) i29)) - (((long) i8) * ((long) i28))) == 0L ? 0 : -1)) >>> 31;
                    if (j != j2) {
                        j6 = j;
                    }
                    long j7 = d(bwxVarB2.a).c;
                    if (j6 == j2) {
                        j3 = j7;
                        jC = j2;
                    } else {
                        jC = bwp.C(j6, 1000000L, j7);
                        j3 = j7;
                    }
                    bww bwwVarA3 = bwwVarA2.a(1835626086);
                    bwwVarA3.getClass();
                    bww bwwVarA4 = bwwVarA3.a(1937007212);
                    bwwVarA4.getClass();
                    bwx bwxVarB5 = bwwVarA2.b(1835296868);
                    bwxVarB5.getClass();
                    aawx aawxVarV = v(bwxVarB5.a);
                    bwx bwxVarB6 = bwwVarA4.b(1937011556);
                    if (bwxVarB6 == null) {
                        bvx.e("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        bwwVar2 = bwwVar3;
                    } else {
                        Object obj = aawxVarV.c;
                        bwb bwbVar2 = bwxVarB6.a;
                        bwbVar2.P(12);
                        int i39 = bwbVar2.i();
                        czs czsVar2 = new czs(i39);
                        aawx aawxVar2 = aawxVarV;
                        int i40 = 0;
                        while (i40 < i39) {
                            long j8 = jC;
                            int i41 = bwbVar2.c;
                            int i42 = bwbVar2.i();
                            int i43 = i39;
                            if (i42 > 0) {
                                r0 = i38;
                                z4 = true;
                            } else {
                                r0 = i38;
                                z4 = false;
                            }
                            int i44 = i40;
                            azz.g(z4, "childAtomSize must be positive");
                            String str6 = "childAtomSize must be positive";
                            int i45 = bwbVar2.i();
                            Object obj2 = obj;
                            ArrayList arrayList3 = arrayList2;
                            if (i45 == 1635148593 || i45 == 1635148595 || i45 == 1701733238 || i45 == 1831958048 || i45 == 1836070006 || i45 == 1752589105 || i45 == 1751479857 || i45 == 1987470129 || i45 == 1987471665 || i45 == 1932670515 || i45 == 1211250227 || i45 == 1748121139 || i45 == 1987063864 || i45 == 1987063865 || i45 == 1635135537 || i45 == 1685479798 || i45 == 1685479729 || i45 == 1685481573 || i45 == 1685481521 || i45 == 1634760241 || i45 == 1684108849) {
                                bwbVar2 = bwbVar2;
                                int i46 = i21;
                                czs czsVar3 = czsVar2;
                                sG2 = sG2;
                                sG = sG;
                                iS = iS;
                                int i47 = i;
                                aawxVar = aawxVar2;
                                j4 = j8;
                                bwbVar2.P(i41 + 16);
                                bwbVar2.Q(16);
                                int iS2 = bwbVar2.s();
                                int iS3 = bwbVar2.s();
                                i44 = i44;
                                bwbVar2.Q(50);
                                int i48 = bwbVar2.c;
                                j5 = j3;
                                int iIntValue = 1701733238;
                                if (i45 == 1701733238) {
                                    Pair pairO = o(bwbVar2, i41, i42);
                                    if (pairO != null) {
                                        iIntValue = ((Integer) pairO.first).intValue();
                                        bsaVarB = bsaVar == null ? null : bsaVar.b((String) ((yhk) pairO.second).d);
                                        ((yhk[]) czsVar3.d)[i44] = (yhk) pairO.second;
                                    } else {
                                        bsaVarB = bsaVar;
                                    }
                                    bwbVar2.P(i48);
                                } else {
                                    i41 = i41;
                                    iIntValue = i45;
                                    bsaVarB = bsaVar;
                                }
                                if (iIntValue == 1831958048) {
                                    str = "video/mpeg";
                                } else if (iIntValue == 1211250227) {
                                    iIntValue = 1211250227;
                                    str = "video/3gpp";
                                } else {
                                    str = null;
                                }
                                ?? r39 = r0;
                                float fQ = 1.0f;
                                i = i47;
                                int i49 = i48;
                                bsa bsaVar2 = bsaVarB;
                                int i50 = i7;
                                int i51 = -1;
                                int i52 = -1;
                                ?? Q = 0;
                                dep depVar2 = null;
                                int i53 = -1;
                                int i54 = 8;
                                int i55 = 8;
                                int iB = -1;
                                int i56 = -1;
                                int i57 = -1;
                                ByteBuffer byteBufferT = null;
                                int i58 = -1;
                                Object obj3 = null;
                                int i59 = -1;
                                byte[] bArrG = null;
                                czo czoVarQ = null;
                                czq czqVar = null;
                                boolean z10 = false;
                                zf zfVarG = null;
                                while (i49 - i41 < i42) {
                                    bwbVar2.P(i49);
                                    int i60 = bwbVar2.c;
                                    int i61 = bwbVar2.i();
                                    int i62 = i49;
                                    if (i61 != 0) {
                                        i13 = i61;
                                    } else {
                                        if (bwbVar2.c - i41 == i42) {
                                            break;
                                        }
                                        i13 = 0;
                                    }
                                    int i63 = i42;
                                    azz.g(i13 > 0, str6);
                                    int i64 = bwbVar2.i();
                                    if (i64 == 1635148611) {
                                        int i65 = i60 + 8;
                                        azz.g(str == null, null);
                                        bwbVar2.P(i65);
                                        cur curVarA = cur.a(bwbVar2);
                                        List list2 = curVarA.a;
                                        czsVar3.a = curVarA.b;
                                        if (z10) {
                                            f = fQ;
                                            z8 = true;
                                        } else {
                                            f = curVarA.k;
                                            z8 = false;
                                        }
                                        String str7 = curVarA.l;
                                        int i66 = curVarA.j;
                                        int i67 = curVarA.g;
                                        int i68 = curVarA.h;
                                        iB = curVarA.i;
                                        int i69 = curVarA.e;
                                        i57 = i66;
                                        Q = list2;
                                        i16 = curVarA.f;
                                        z10 = z8;
                                        obj3 = str7;
                                        i52 = i67;
                                        i51 = i68;
                                        i54 = i69;
                                        str = "video/avc";
                                    } else {
                                        if (i64 == 1752589123) {
                                            int i70 = i60 + 8;
                                            azz.g(str == null, null);
                                            bwbVar2.P(i70);
                                            cvs cvsVarA = cvs.a(bwbVar2, false, null);
                                            List list3 = cvsVarA.a;
                                            czsVar3.a = cvsVarA.b;
                                            if (z10) {
                                                f = fQ;
                                                z7 = true;
                                            } else {
                                                f = cvsVarA.l;
                                                z7 = false;
                                            }
                                            int i71 = cvsVarA.m;
                                            int i72 = cvsVarA.c;
                                            String str8 = cvsVarA.n;
                                            int i73 = cvsVarA.k;
                                            if (i73 != -1) {
                                                i53 = i73;
                                            }
                                            int i74 = cvsVarA.d;
                                            int i75 = cvsVarA.e;
                                            int i76 = cvsVarA.h;
                                            int i77 = cvsVarA.i;
                                            int i78 = cvsVarA.j;
                                            int i79 = cvsVarA.f;
                                            i56 = i72;
                                            Q = list3;
                                            i16 = cvsVarA.g;
                                            z10 = z7;
                                            i59 = i74;
                                            i54 = i79;
                                            str = "video/hevc";
                                            obj3 = str8;
                                            i58 = i75;
                                            depVar2 = cvsVarA.o;
                                            i51 = i77;
                                            i57 = i71;
                                            i52 = i76;
                                            iB = i78;
                                        } else if (i64 == 1818785347) {
                                            int i80 = i60 + 8;
                                            azz.g("video/hevc".equals(str), "lhvC must follow hvcC atom");
                                            if (depVar2 != null) {
                                                z6 = ((agke) depVar2.a).size() >= 2;
                                            } else {
                                                z6 = false;
                                                depVar2 = null;
                                            }
                                            azz.g(z6, "must have at least two layers");
                                            bwbVar2.P(i80);
                                            depVar2.getClass();
                                            cvs cvsVarA2 = cvs.a(bwbVar2, true, depVar2);
                                            azz.g(czsVar3.a == cvsVarA2.b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                            int i81 = cvsVarA2.h;
                                            if (i81 != -1) {
                                                azz.g(i52 == i81, "colorSpace must be the same for both views");
                                            }
                                            int i82 = cvsVarA2.i;
                                            if (i82 != -1) {
                                                azz.g(i51 == i82, "colorRange must be the same for both views");
                                            }
                                            int i83 = cvsVarA2.j;
                                            if (i83 != -1) {
                                                azz.g(iB == i83, "colorTransfer must be the same for both views");
                                            }
                                            azz.g(i54 == cvsVarA2.f, "bitdepthLuma must be the same for both views");
                                            azz.g(i55 == cvsVarA2.g, "bitdepthChroma must be the same for both views");
                                            if (Q != 0) {
                                                ?? agjzVar = new agjz(4);
                                                agjzVar.j(Q);
                                                agjzVar.j(cvsVarA2.a);
                                                Q = agjzVar.g();
                                            } else {
                                                azz.g(false, "initializationData must be already set from hvcC atom");
                                                Q = Q;
                                            }
                                            str6 = str6;
                                            obj3 = cvsVarA2.n;
                                            str = "video/mv-hevc";
                                            czsVar3 = czsVar3;
                                            i16 = i55;
                                            iIntValue = iIntValue;
                                        } else if (i64 == 1987470147) {
                                            int i84 = i60 + 8;
                                            azz.g(str == null, null);
                                            bwbVar2.P(i84);
                                            erb erbVarB = erb.b(bwbVar2);
                                            Object obj4 = erbVarB.d;
                                            czsVar3.a = erbVarB.a;
                                            Object obj5 = erbVarB.c;
                                            str6 = str6;
                                            i16 = erbVarB.b;
                                            obj3 = obj5;
                                            czsVar3 = czsVar3;
                                            iIntValue = iIntValue;
                                            i57 = 16;
                                            Q = obj4;
                                            str = "video/vvc";
                                            i54 = i16;
                                        } else if (i64 == 1986361461) {
                                            bwbVar2.P(i60 + 8);
                                            int i85 = bwbVar2.c;
                                            i14 = i51;
                                            zs zsVar = null;
                                            while (i85 - i60 < i13) {
                                                bwbVar2.P(i85);
                                                int i86 = bwbVar2.i();
                                                String str9 = str;
                                                azz.g(i86 > 0, str6);
                                                int i87 = i85;
                                                if (bwbVar2.i() == 1702454643) {
                                                    bwbVar2.P(i87 + 8);
                                                    int i88 = bwbVar2.c;
                                                    while (true) {
                                                        if (i88 - i87 >= i86) {
                                                            i17 = i86;
                                                            i18 = i54;
                                                            zsVar = null;
                                                            break;
                                                        }
                                                        bwbVar2.P(i88);
                                                        int i89 = bwbVar2.i();
                                                        azz.g(i89 > 0, str6);
                                                        i17 = i86;
                                                        if (bwbVar2.i() == 1937011305) {
                                                            bwbVar2.Q(4);
                                                            int iN = bwbVar2.n();
                                                            i18 = i54;
                                                            zsVar = new zs(new abyu(1 == (iN & 1), (iN & 2) == 2, (iN & 8) == 8, null), (byte[]) null);
                                                            break;
                                                        }
                                                        i88 += i89;
                                                        i86 = i17;
                                                        i54 = i54;
                                                    }
                                                } else {
                                                    i17 = i86;
                                                    i18 = i54;
                                                }
                                                i85 = i87 + i17;
                                                str = str9;
                                                str6 = str6;
                                                i54 = i18;
                                            }
                                            str6 = str6;
                                            str3 = str;
                                            i15 = i54;
                                            zs zsVar2 = zsVar != null ? new zs(zsVar, (byte[]) null) : null;
                                            if (zsVar2 != null) {
                                                if (depVar2 == null) {
                                                    depVar2 = null;
                                                } else if (((agke) depVar2.a).size() >= 2) {
                                                    azz.g(zsVar2.i(), "both eye views must be marked as available");
                                                    azz.g(!((abyu) ((zs) zsVar2.a).a).b, "for MV-HEVC, eye_views_reversed must be set to false");
                                                }
                                                if (i53 == -1) {
                                                    if (true != ((abyu) ((zs) zsVar2.a).a).b) {
                                                        czsVar3 = czsVar3;
                                                        i16 = i55;
                                                        iIntValue = iIntValue;
                                                        i51 = i14;
                                                        str = str3;
                                                        i54 = i15;
                                                        i53 = 4;
                                                    } else {
                                                        i53 = 5;
                                                    }
                                                }
                                                czsVar3 = czsVar3;
                                                i16 = i55;
                                                iIntValue = iIntValue;
                                                i51 = i14;
                                                str = str3;
                                                i54 = i15;
                                            }
                                            depVar = depVar2;
                                            czsVar3 = czsVar3;
                                            i16 = i55;
                                            iIntValue = iIntValue;
                                            i51 = i14;
                                            str = str3;
                                            depVar2 = depVar;
                                            i54 = i15;
                                        } else {
                                            i14 = i51;
                                            str6 = str6;
                                            str3 = str;
                                            i15 = i54;
                                            if (i64 == 1685480259 || i64 == 1685485123 || i64 == 1685485379) {
                                                depVar = depVar2;
                                                czsVar3 = czsVar3;
                                                i16 = i55;
                                                iIntValue = iIntValue;
                                                zfVarG = zf.G(bwbVar2);
                                            } else if (i64 == 1987076931) {
                                                int i90 = i60 + 12;
                                                azz.g(str3 == null, null);
                                                bwbVar2.P(i90);
                                                byte bA = bwbVar2.a();
                                                byte bA2 = bwbVar2.a();
                                                int iN2 = bwbVar2.n();
                                                int i91 = iN2 >> 4;
                                                int i92 = iN2 >> 1;
                                                String str10 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                Q = Q;
                                                if (str10.equals("video/x-vnd.on2.vp9")) {
                                                    Q = bvf.d(bA, bA2, (byte) i91, (byte) (i92 & 7));
                                                }
                                                int i93 = iN2 & 1;
                                                int iN3 = bwbVar2.n();
                                                int iN4 = bwbVar2.n();
                                                int iA = bru.a(iN3);
                                                int i94 = 1 != i93 ? 2 : 1;
                                                iB = bru.b(iN4);
                                                i51 = i94;
                                                i54 = i91;
                                                i16 = i54;
                                                czsVar3 = czsVar3;
                                                str = str10;
                                                iIntValue = iIntValue;
                                                i52 = iA;
                                            } else if (i64 == 1635135811) {
                                                int i95 = i13 - 8;
                                                byte[] bArr = new byte[i95];
                                                bwbVar2.K(bArr, 0, i95);
                                                agke agkeVarQ2 = agke.q(bArr);
                                                jhf jhfVarA = jhf.a(bArr);
                                                if (jhfVarA != null) {
                                                    i54 = jhfVarA.a;
                                                    i52 = jhfVarA.c;
                                                    int i96 = jhfVarA.b;
                                                    iB = jhfVarA.d;
                                                    obj3 = jhfVarA.e;
                                                    i14 = i96;
                                                    i55 = i54;
                                                } else {
                                                    i54 = i15;
                                                }
                                                str = "video/av01";
                                                Q = agkeVarQ2;
                                                czsVar3 = czsVar3;
                                                i16 = i55;
                                                iIntValue = iIntValue;
                                                i51 = i14;
                                            } else if (i64 == 1668050025) {
                                                if (byteBufferT == null) {
                                                    byteBufferT = t();
                                                }
                                                ByteBuffer byteBuffer = byteBufferT;
                                                byteBuffer.position(21);
                                                byteBuffer.putShort(bwbVar2.G());
                                                byteBuffer.putShort(bwbVar2.G());
                                                byteBufferT = byteBuffer;
                                                czsVar3 = czsVar3;
                                                i16 = i55;
                                                iIntValue = iIntValue;
                                                i51 = i14;
                                                str = str3;
                                                i54 = i15;
                                            } else if (i64 == 1835295606) {
                                                if (byteBufferT == null) {
                                                    byteBufferT = t();
                                                }
                                                ByteBuffer byteBuffer2 = byteBufferT;
                                                short sG3 = bwbVar2.G();
                                                short sG4 = bwbVar2.G();
                                                short sG5 = bwbVar2.G();
                                                short sG6 = bwbVar2.G();
                                                short sG7 = bwbVar2.G();
                                                depVar = depVar2;
                                                short sG8 = bwbVar2.G();
                                                i16 = i55;
                                                short sG9 = bwbVar2.G();
                                                iIntValue = iIntValue;
                                                short sG10 = bwbVar2.G();
                                                long jW2 = bwbVar2.w();
                                                long jW3 = bwbVar2.w();
                                                czsVar3 = czsVar3;
                                                byteBuffer2.position(1);
                                                byteBuffer2.putShort(sG7);
                                                byteBuffer2.putShort(sG8);
                                                byteBuffer2.putShort(sG3);
                                                byteBuffer2.putShort(sG4);
                                                byteBuffer2.putShort(sG5);
                                                byteBuffer2.putShort(sG6);
                                                byteBuffer2.putShort(sG9);
                                                byteBuffer2.putShort(sG10);
                                                byteBuffer2.putShort((short) (jW2 / 10000));
                                                byteBuffer2.putShort((short) (jW3 / 10000));
                                                byteBufferT = byteBuffer2;
                                            } else {
                                                depVar = depVar2;
                                                czsVar3 = czsVar3;
                                                i16 = i55;
                                                iIntValue = iIntValue;
                                                if (i64 == 1681012275) {
                                                    azz.g(str3 == null, null);
                                                    str = "video/3gpp";
                                                } else if (i64 == 1702061171) {
                                                    azz.g(str3 == null, null);
                                                    czq czqVarR = r(bwbVar2, i60);
                                                    String str11 = czqVarR.a;
                                                    byte[] bArr2 = czqVarR.b;
                                                    if (bArr2 != null) {
                                                        czqVar = czqVarR;
                                                        Q = agke.q(bArr2);
                                                        i51 = i14;
                                                        depVar2 = depVar;
                                                        i54 = i15;
                                                        str = str11;
                                                    } else {
                                                        czqVar = czqVarR;
                                                        str = str11;
                                                    }
                                                } else if (i64 == 1651798644) {
                                                    czoVarQ = q(bwbVar2, i60);
                                                } else if (i64 == 1885434736) {
                                                    bwbVar2.P(i60 + 8);
                                                    fQ = bwbVar2.q() / bwbVar2.q();
                                                    i51 = i14;
                                                    str = str3;
                                                    depVar2 = depVar;
                                                    i54 = i15;
                                                    z10 = true;
                                                } else if (i64 == 1937126244) {
                                                    bArrG = rpi.G(bwbVar2, i60, i13);
                                                } else if (i64 == 1936995172) {
                                                    int iN5 = bwbVar2.n();
                                                    bwbVar2.Q(3);
                                                    if (iN5 == 0) {
                                                        int iN6 = bwbVar2.n();
                                                        if (iN6 == 0) {
                                                            i51 = i14;
                                                            str = str3;
                                                            depVar2 = depVar;
                                                            i54 = i15;
                                                            i53 = 0;
                                                        } else if (iN6 == 1) {
                                                            i51 = i14;
                                                            str = str3;
                                                            depVar2 = depVar;
                                                            i54 = i15;
                                                            i53 = 1;
                                                        } else if (iN6 == 2) {
                                                            i51 = i14;
                                                            str = str3;
                                                            depVar2 = depVar;
                                                            i54 = i15;
                                                            i53 = 2;
                                                        } else if (iN6 == 3) {
                                                            i53 = 3;
                                                        }
                                                    }
                                                } else if (i64 == 1634760259) {
                                                    int i97 = i13 - 12;
                                                    byte[] bArr3 = new byte[i97];
                                                    bwbVar2.P(i60 + 12);
                                                    bwbVar2.K(bArr3, 0, i97);
                                                    String strE = bvf.e(bArr3);
                                                    agke agkeVarQ3 = agke.q(bArr3);
                                                    bru bruVarP = p(new bwb(bArr3));
                                                    int i98 = bruVarP.f;
                                                    int i99 = bruVarP.g;
                                                    int i100 = bruVarP.b;
                                                    int i101 = bruVarP.c;
                                                    obj3 = strE;
                                                    iB = bruVarP.d;
                                                    i54 = i98;
                                                    i16 = i99;
                                                    i52 = i100;
                                                    i51 = i101;
                                                    depVar2 = depVar;
                                                    Q = agkeVarQ3;
                                                    str = "video/apv";
                                                } else {
                                                    if (i64 == 1668246642 && i52 == -1) {
                                                        if (iB == -1) {
                                                            int i102 = bwbVar2.i();
                                                            if (i102 == 1852009592 || i102 == 1852009571) {
                                                                int iS4 = bwbVar2.s();
                                                                int iS5 = bwbVar2.s();
                                                                bwbVar2.Q(2);
                                                                if (i13 != 19) {
                                                                    z5 = false;
                                                                } else if ((bwbVar2.n() & SemanticState.Focused) != 0) {
                                                                    i13 = 19;
                                                                    z5 = true;
                                                                } else {
                                                                    i13 = 19;
                                                                    z5 = false;
                                                                }
                                                                int iA2 = bru.a(iS4);
                                                                int i103 = true != z5 ? 2 : 1;
                                                                i52 = iA2;
                                                                iB = bru.b(iS5);
                                                                i51 = i103;
                                                            } else {
                                                                bvx.e("BoxParsers", "Unsupported color type: ".concat(rpi.H(i102)));
                                                                i52 = -1;
                                                                iB = -1;
                                                            }
                                                        } else {
                                                            i52 = -1;
                                                        }
                                                    }
                                                    str = str3;
                                                    depVar2 = depVar;
                                                    i54 = i15;
                                                }
                                                i51 = i14;
                                                depVar2 = depVar;
                                                i54 = i15;
                                            }
                                            i51 = i14;
                                            str = str3;
                                            depVar2 = depVar;
                                            i54 = i15;
                                        }
                                        i49 = i62 + i13;
                                        i42 = i63;
                                        i55 = i16;
                                        str6 = str6;
                                        iIntValue = iIntValue;
                                        czsVar3 = czsVar3;
                                        Q = Q;
                                    }
                                    fQ = f;
                                    i49 = i62 + i13;
                                    i42 = i63;
                                    i55 = i16;
                                    str6 = str6;
                                    iIntValue = iIntValue;
                                    czsVar3 = czsVar3;
                                    Q = Q;
                                }
                                int i104 = i51;
                                String str12 = str;
                                i42 = i42;
                                czs czsVar4 = czsVar3;
                                int i105 = i54;
                                int i106 = i55;
                                if (zfVarG != null) {
                                    str2 = "video/dolby-vision";
                                    obj3 = zfVarG.a;
                                } else {
                                    str2 = str12;
                                }
                                if (str2 == null) {
                                    r3 = r39 == true ? 1 : 0;
                                    i12 = i50;
                                    i21 = i46;
                                    czsVar = czsVar4;
                                } else {
                                    bsd bsdVar = new bsd();
                                    bsdVar.c(i21);
                                    bsdVar.e(str2);
                                    bsdVar.k = (String) obj3;
                                    bsdVar.u = iS2;
                                    bsdVar.v = iS3;
                                    bsdVar.w = i59;
                                    bsdVar.x = i58;
                                    bsdVar.B = fQ;
                                    i12 = i50;
                                    bsdVar.z = i12;
                                    r3 = r39 == true ? 1 : 0;
                                    bsdVar.A = r3;
                                    bsdVar.C = bArrG;
                                    bsdVar.D = i53;
                                    bsdVar.r = Q;
                                    bsdVar.q = i57;
                                    bsdVar.F = i56;
                                    bsdVar.s = bsaVar2;
                                    bsdVar.d = (String) obj2;
                                    if (byteBufferT != null) {
                                        i21 = i46;
                                        bArrArray = byteBufferT.array();
                                    } else {
                                        i21 = i46;
                                        bArrArray = null;
                                    }
                                    bsdVar.E = new bru(i52, i104, iB, bArrArray, i105, i106);
                                    czo czoVar = czoVarQ;
                                    if (czoVar != null) {
                                        bsdVar.i = ahng.P(czoVar.a);
                                        bsdVar.j = ahng.P(czoVar.b);
                                    } else {
                                        czq czqVar2 = czqVar;
                                        if (czqVar2 != null) {
                                            bsdVar.i = ahng.P(czqVar2.c);
                                            bsdVar.j = ahng.P(czqVar2.d);
                                        }
                                    }
                                    czsVar = czsVar4;
                                    czsVar.c = new bse(bsdVar);
                                }
                            } else if (i45 == 1836069985 || i45 == 1701733217 || i45 == 1633889587 || i45 == 1700998451 || i45 == 1633889588 || i45 == 1835823201 || i45 == 1685353315 || i45 == 1685353317 || i45 == 1685353320 || i45 == 1685353324 || i45 == 1685353336 || i45 == 1935764850 || i45 == 1935767394 || i45 == 1819304813 || i45 == 1936684916 || i45 == 1953984371 || i45 == 778924082 || i45 == 778924083 || i45 == 1835557169 || i45 == 1835560241 || i45 == 1634492771 || i45 == 1634492791 || i45 == 1970037111 || i45 == 1332770163 || i45 == 1716281667 || i45 == 1767992678 || i45 == 1768973165 || i45 == 1718641517) {
                                iS = iS;
                                bwb bwbVar3 = bwbVar2;
                                sG2 = sG2;
                                i21 = i21;
                                sG = sG;
                                j4 = j8;
                                czsVar = czsVar2;
                                u(bwbVar3, i45, i41, i42, i21, (String) obj2, z2, bsaVar, czsVar, i44);
                                bwbVar2 = bwbVar3;
                                i41 = i41;
                                i42 = i42;
                                j5 = j3;
                                i12 = i7;
                                aawxVar = aawxVar2;
                                r3 = r0;
                            } else {
                                if (i45 == 1414810956 || i45 == 1954034535 || i45 == 2004251764 || i45 == 1937010800 || i45 == 1664495672 || i45 == 1836070003 || i45 == 1952807028) {
                                    iS = iS;
                                    bwbVar2.P(i41 + 16);
                                    long j9 = Long.MAX_VALUE;
                                    if (i45 == 1414810956) {
                                        str4 = "application/ttml+xml";
                                    } else {
                                        if (i45 == 1954034535) {
                                            int i107 = i42 - 16;
                                            byte[] bArr4 = new byte[i107];
                                            bwbVar2.K(bArr4, 0, i107);
                                            agkeVarQ = agke.q(bArr4);
                                            str5 = "application/x-quicktime-tx3g";
                                        } else if (i45 == 2004251764) {
                                            str4 = "application/x-mp4-vtt";
                                        } else if (i45 == 1937010800) {
                                            str4 = "application/ttml+xml";
                                            j9 = 0;
                                        } else if (i45 == 1664495672) {
                                            czsVar2.b = 1;
                                            str4 = "application/x-mp4-cea-608";
                                        } else if (i45 == 1836070003) {
                                            int i108 = bwbVar2.c;
                                            bwbVar2.Q(4);
                                            if (bwbVar2.i() == 1702061171) {
                                                byte[] bArr5 = r(bwbVar2, i108).b;
                                                if (bArr5 != null && bArr5.length == 64) {
                                                    agkeVarQ = agke.q(bwp.ah(s(bArr5, sG, sG2)));
                                                    str5 = "application/vobsub";
                                                }
                                            } else {
                                                str4 = null;
                                            }
                                        } else {
                                            str4 = "text/x-unknown";
                                        }
                                        String str13 = str5;
                                        agkeVar = agkeVarQ;
                                        str4 = str13;
                                        if (str4 != null) {
                                            bsd bsdVar2 = new bsd();
                                            bsdVar2.c(i21);
                                            bsdVar2.e(str4);
                                            bsdVar2.d = (String) obj2;
                                            bsdVar2.t = j9;
                                            bsdVar2.r = agkeVar;
                                            czsVar2.c = new bse(bsdVar2);
                                        }
                                    }
                                    agkeVar = null;
                                    if (str4 != null) {
                                        bsd bsdVar3 = new bsd();
                                        bsdVar3.c(i21);
                                        bsdVar3.e(str4);
                                        bsdVar3.d = (String) obj2;
                                        bsdVar3.t = j9;
                                        bsdVar3.r = agkeVar;
                                        czsVar2.c = new bse(bsdVar3);
                                    }
                                } else {
                                    if (i45 == 1835365492 || i45 == 1769222965 || i45 == 1835360888) {
                                        bwbVar2.P(i41 + 16);
                                        if (i45 == 1835365492) {
                                            bwbVar2.S();
                                            String strS = bwbVar2.S();
                                            if (strS != null) {
                                                bsd bsdVar4 = new bsd();
                                                bsdVar4.c(i21);
                                                bsdVar4.e(strS);
                                                czsVar2.c = new bse(bsdVar4);
                                            }
                                        } else if (i45 == 1769222965) {
                                            int iN7 = bwbVar2.n();
                                            byte[] bArr6 = new byte[iN7];
                                            bwbVar2.K(bArr6, 0, iN7);
                                            bsd bsdVar5 = new bsd();
                                            bsdVar5.c(i21);
                                            bsdVar5.e("application/x-itut-t35");
                                            bsdVar5.r = agke.q(bArr6);
                                            czsVar2.c = new bse(bsdVar5);
                                        } else {
                                            int i109 = bwbVar2.c;
                                            int iJ = j(bwbVar2, 1801812339, i41, i42);
                                            if (iJ != -1) {
                                                bwbVar2.P(iJ);
                                                int i110 = bwbVar2.i();
                                                int i111 = i110 - 8;
                                                azz.g(i111 >= 0 && iJ + i110 <= i41 + i42, null);
                                                bwbVar2.Q(4);
                                                if (i111 > 0) {
                                                    byte[] bArr7 = new byte[i111];
                                                    bwbVar2.K(bArr7, 0, i111);
                                                    bsd bsdVar6 = new bsd();
                                                    bsdVar6.c(i21);
                                                    bsdVar6.e("application/x-mp4-mebx");
                                                    bsdVar6.r = agke.q(bArr7);
                                                    bwbVar2.P(i109);
                                                    int iJ2 = j(bwbVar2, 1651798644, i41, i42);
                                                    if (iJ2 != -1) {
                                                        czo czoVarQ2 = q(bwbVar2, iJ2);
                                                        bsdVar6.i = ahng.P(czoVarQ2.a);
                                                        bsdVar6.j = ahng.P(czoVarQ2.b);
                                                    }
                                                    czsVar2.c = new bse(bsdVar6);
                                                } else {
                                                    iS = iS;
                                                }
                                            } else {
                                                iS = iS;
                                            }
                                        }
                                    } else if (i45 == 1667329389) {
                                        bsd bsdVar7 = new bsd();
                                        bsdVar7.c(i21);
                                        bsdVar7.e("application/x-camera-motion");
                                        czsVar2.c = new bse(bsdVar7);
                                    }
                                    iS = iS;
                                    j5 = j3;
                                    i12 = i7;
                                    aawxVar = aawxVar2;
                                    j4 = j8;
                                    r3 = r0;
                                    czsVar = czsVar2;
                                }
                                j5 = j3;
                                i12 = i7;
                                aawxVar = aawxVar2;
                                j4 = j8;
                                r3 = r0;
                                czsVar = czsVar2;
                            }
                            bwbVar2.P(i41 + i42);
                            i7 = i12;
                            czsVar2 = czsVar;
                            sG = sG;
                            sG2 = sG2;
                            iS = iS;
                            j3 = j5;
                            i39 = i43;
                            obj = obj2;
                            arrayList2 = arrayList3;
                            aawxVar2 = aawxVar;
                            i21 = i21;
                            bwbVar2 = bwbVar2;
                            i40 = i44 + 1;
                            r0 = r3;
                            jC = j4;
                        }
                        r0 = i38;
                        long j10 = jC;
                        int i112 = i21;
                        arrayList2 = arrayList2;
                        int i113 = iS;
                        long j11 = j3;
                        aawx aawxVar3 = aawxVar2;
                        czs czsVar5 = czsVar2;
                        bwwVar2 = bwwVar3;
                        bww bwwVarA5 = bwwVar2.a(1953654118);
                        if (bwwVarA5 == null || (bwxVarB = bwwVarA5.b(1667785072)) == null) {
                            i11 = -1;
                        } else {
                            bwb bwbVar4 = bwxVarB.a;
                            bwbVar4.P(8);
                            if (bwbVar4.d() >= 4) {
                                i11 = bwbVar4.i();
                            } else {
                                i11 = -1;
                            }
                        }
                        if (z || (bwwVarA = bwwVar2.a(1701082227)) == null || (pairN = n(bwwVarA)) == null) {
                            ahbpVar = null;
                            ahbpVar2 = null;
                        } else {
                            ahbpVar2 = (ahbp) pairN.first;
                            ahbpVar = (ahbp) pairN.second;
                        }
                        Object obj6 = czsVar5.c;
                        Object bseVar = obj6;
                        if (obj6 == null) {
                            function = function;
                            dajVarA = null;
                        } else {
                            if (i113 != 0) {
                                bwv bwvVar = new bwv(i113);
                                bse bseVar2 = (bse) obj6;
                                bsd bsdVar8 = new bsd(bseVar2);
                                bsx bsxVar = bseVar2.m;
                                bsdVar8.l = bsxVar != null ? bsxVar.d(bwvVar) : new bsx(-9223372036854775807L, bwvVar);
                                bseVar = new bse(bsdVar8);
                            }
                            bse bseVar3 = (bse) bseVar;
                            boolean z11 = !Objects.equals(bseVar3.q, "text/x-unknown");
                            dai daiVar = new dai();
                            daiVar.a = i112;
                            daiVar.b = i;
                            daiVar.c = aawxVar3.a;
                            daiVar.d = j11;
                            daiVar.e = j10;
                            daiVar.f = aawxVar3.b;
                            daiVar.g = bseVar3;
                            daiVar.h = czsVar5.b;
                            daiVar.o = (yhk[]) ((yhk[]) czsVar5.d).clone();
                            daiVar.i = czsVar5.a;
                            daiVar.j = ahbpVar2;
                            daiVar.k = ahbpVar;
                            daiVar.l = z11;
                            daiVar.m = i11;
                            dajVarA = daiVar.a();
                            function = function;
                        }
                    }
                    dajVar = (daj) function.apply(dajVarA);
                    if (dajVar != null) {
                        bww bwwVarA6 = bwwVar2.a(1835297121);
                        bwwVarA6.getClass();
                        bww bwwVarA7 = bwwVarA6.a(1835626086);
                        bwwVarA7.getClass();
                        bww bwwVarA8 = bwwVarA7.a(1937007212);
                        bwwVarA8.getClass();
                        dal dalVarH = h(dajVar, bwwVarA8, cvrVar);
                        arrayList = arrayList2;
                        arrayList.add(dalVarH);
                    } else {
                        arrayList = arrayList2;
                    }
                }
                dajVarA = null;
                dajVar = (daj) function.apply(dajVarA);
                if (dajVar != null) {
                    bww bwwVarA9 = bwwVar2.a(1835297121);
                    bwwVarA9.getClass();
                    bww bwwVarA10 = bwwVarA9.a(1835626086);
                    bwwVarA10.getClass();
                    bww bwwVarA11 = bwwVarA10.a(1937007212);
                    bwwVarA11.getClass();
                    dal dalVarH2 = h(dajVar, bwwVarA11, cvrVar);
                    arrayList = arrayList2;
                    arrayList.add(dalVarH2);
                } else {
                    arrayList = arrayList2;
                }
            }
            i19 = i10 + 1;
            arrayList2 = arrayList;
        }
    }

    private static int j(bwb bwbVar, int i, int i2, int i3) throws bsz {
        int i4 = bwbVar.c;
        azz.g(i4 >= i2, null);
        while (i4 - i2 < i3) {
            bwbVar.P(i4);
            int i5 = bwbVar.i();
            azz.g(i5 > 0, "childAtomSize must be positive");
            if (bwbVar.i() == i) {
                return i4;
            }
            i4 += i5;
        }
        return -1;
    }

    private static int k(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728 || i == 1937072752) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static int l(bwb bwbVar) {
        int iN = bwbVar.n();
        int i = iN & 127;
        while ((iN & SemanticState.Focused) == 128) {
            iN = bwbVar.n();
            i = (i << 7) | (iN & 127);
        }
        return i;
    }

    private static int m(bwb bwbVar) {
        bwbVar.P(16);
        return bwbVar.i();
    }

    private static Pair n(bww bwwVar) {
        bwx bwxVarB = bwwVar.b(1701606260);
        if (bwxVarB == null) {
            return null;
        }
        bwb bwbVar = bwxVarB.a;
        bwbVar.P(8);
        int i = bwbVar.i() >> 24;
        int iQ = bwbVar.q();
        zh zhVarC = ahbp.c(iQ);
        zh zhVarC2 = ahbp.c(iQ);
        for (int i2 = 0; i2 < iQ; i2++) {
            int i3 = i & 255;
            zhVarC.k(i3 == 1 ? bwbVar.x() : bwbVar.w());
            zhVarC2.k(i3 == 1 ? bwbVar.v() : bwbVar.i());
            if (bwbVar.G() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            bwbVar.Q(2);
        }
        return Pair.create(zhVarC.j(), zhVarC2.j());
    }

    private static Pair o(bwb bwbVar, int i, int i2) throws bsz {
        yhk yhkVar;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = bwbVar.c;
        while (i5 - i < i2) {
            bwbVar.P(i5);
            int i6 = bwbVar.i();
            azz.g(i6 > 0, "childAtomSize must be positive");
            if (bwbVar.i() == 1936289382) {
                int i7 = i5 + 8;
                int i8 = 0;
                int i9 = -1;
                Integer numValueOf = null;
                String strC = null;
                while (i7 - i5 < i6) {
                    bwbVar.P(i7);
                    int i10 = bwbVar.i();
                    int i11 = bwbVar.i();
                    if (i11 == 1718775137) {
                        numValueOf = Integer.valueOf(bwbVar.i());
                    } else if (i11 == 1935894637) {
                        bwbVar.Q(4);
                        strC = bwbVar.C(4);
                    } else if (i11 == 1935894633) {
                        i9 = i7;
                        i8 = i10;
                    }
                    i7 += i10;
                }
                if ("cenc".equals(strC) || "cbc1".equals(strC) || "cens".equals(strC) || "cbcs".equals(strC)) {
                    azz.g(numValueOf != null, "frma atom is mandatory");
                    azz.g(i9 != -1, "schi atom is mandatory");
                    int i12 = i9 + 8;
                    while (true) {
                        if (i12 - i9 >= i8) {
                            yhkVar = null;
                            break;
                        }
                        bwbVar.P(i12);
                        int i13 = bwbVar.i();
                        if (bwbVar.i() == 1952804451) {
                            int i14 = bwbVar.i() >> 24;
                            bwbVar.Q(1);
                            if ((i14 & 255) == 0) {
                                bwbVar.Q(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iN = bwbVar.n();
                                i3 = iN & 15;
                                i4 = (iN & 240) >> 4;
                            }
                            boolean z = bwbVar.n() == 1;
                            int iN2 = bwbVar.n();
                            byte[] bArr2 = new byte[16];
                            bwbVar.K(bArr2, 0, 16);
                            if (z && iN2 == 0) {
                                int iN3 = bwbVar.n();
                                byte[] bArr3 = new byte[iN3];
                                bwbVar.K(bArr3, 0, iN3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            yhkVar = new yhk(z, strC, iN2, bArr2, i4, i3, bArr, null);
                            break;
                        }
                        i12 += i13;
                    }
                    azz.g(yhkVar != null, "tenc atom is mandatory");
                    int i15 = bwp.a;
                    pairCreate = Pair.create(numValueOf, yhkVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += i6;
        }
        return null;
    }

    private static bru p(bwb bwbVar) {
        dqp dqpVar = new dqp(bwbVar.b, (byte[]) null);
        dqpVar.q(bwbVar.c << 3);
        dqpVar.t(1);
        int i = dqpVar.i(8);
        int iA = -1;
        int i2 = -1;
        int iB = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < i; i5++) {
            dqpVar.t(1);
            int i6 = dqpVar.i(8);
            int i7 = 0;
            while (i7 < i6) {
                dqpVar.s(6);
                boolean zU = dqpVar.u();
                dqpVar.r();
                dqpVar.t(11);
                dqpVar.s(4);
                i4 = dqpVar.i(4) + 8;
                dqpVar.t(1);
                if (zU) {
                    int i8 = dqpVar.i(8);
                    int i9 = dqpVar.i(8);
                    dqpVar.t(1);
                    boolean zU2 = dqpVar.u();
                    iA = bru.a(i8);
                    int i10 = true != zU2 ? 2 : 1;
                    iB = bru.b(i9);
                    i2 = i10;
                }
                i7++;
                i3 = i4;
            }
        }
        return new bru(iA, i2, iB, null, i3, i4);
    }

    private static czo q(bwb bwbVar, int i) {
        bwbVar.P(i + 8);
        bwbVar.Q(4);
        return new czo(bwbVar.w(), bwbVar.w());
    }

    private static czq r(bwb bwbVar, int i) {
        bwbVar.P(i + 12);
        bwbVar.Q(1);
        l(bwbVar);
        bwbVar.Q(2);
        int iN = bwbVar.n();
        if ((iN & SemanticState.Focused) != 0) {
            bwbVar.Q(2);
        }
        if ((iN & 64) != 0) {
            bwbVar.Q(bwbVar.n());
        }
        if ((iN & 32) != 0) {
            bwbVar.Q(2);
        }
        bwbVar.Q(1);
        l(bwbVar);
        String strE = bsy.e(bwbVar.n());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new czq(strE, null, -1L, -1L);
        }
        bwbVar.Q(4);
        long jW = bwbVar.w();
        long jW2 = bwbVar.w();
        bwbVar.Q(1);
        int iL = l(bwbVar);
        byte[] bArr = new byte[iL];
        bwbVar.K(bArr, 0, iL);
        return new czq(strE, bArr, jW2 <= 0 ? -1L : jW2, jW > 0 ? jW : -1L);
    }

    private static String s(byte[] bArr, int i, int i2) {
        ahno.O(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int i4 = (bArr[i3] << 24) | ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3 + 2] & 255) << 8) | (bArr[i3 + 3] & 255);
            int i5 = ((i4 >> 8) & 255) - 128;
            int i6 = (i4 >> 16) & 255;
            int i7 = (i4 & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf((bwp.c(((i5 * 14075) / 10000) + i6, 0, 255) << 16) | (bwp.c((i6 - ((i7 * 3455) / 10000)) - ((i5 * 7169) / 10000), 0, 255) << 8) | bwp.c(i6 + ((i7 * 17790) / 10000), 0, 255))));
        }
        return "size: " + i + 'x' + i2 + "\npalette: " + new ager(", ").b(arrayList) + '\n';
    }

    private static ByteBuffer t() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0154  */
    /* JADX WARN: Multi-variable type inference failed */
    private static void u(bwb bwbVar, int i, int i2, int i3, int i4, String str, boolean z, bsa bsaVar, czs czsVar, int i5) throws bsz {
        int iS;
        int i6;
        int iQ;
        int iRound;
        int iQ2;
        String str2;
        String str3;
        int iJ;
        int i7;
        Object obj;
        int i8;
        int i9;
        int i10;
        String str4;
        int i11;
        int iN;
        int i12 = i;
        i3 = i3;
        bsa bsaVarB = bsaVar;
        bwbVar.P(i2 + 16);
        if (z) {
            iS = bwbVar.s();
            bwbVar.Q(6);
        } else {
            bwbVar.Q(8);
            iS = 0;
        }
        int i13 = 2;
        int i14 = 0;
        if (iS == 0 || iS == 1) {
            int iS2 = bwbVar.s();
            bwbVar.Q(6);
            int iO = bwbVar.o();
            bwbVar.P(bwbVar.c - 4);
            i6 = bwbVar.i();
            if (iS == 1) {
                bwbVar.Q(16);
            }
            iQ = iS2;
            iRound = iO;
            iQ2 = -1;
        } else {
            if (iS != 2) {
                return;
            }
            bwbVar.Q(16);
            iRound = (int) Math.round(Double.longBitsToDouble(bwbVar.v()));
            iQ = bwbVar.q();
            bwbVar.Q(4);
            int iQ3 = bwbVar.q();
            int iQ4 = bwbVar.q();
            int i15 = iQ4 & 1;
            int i16 = iQ4 & 2;
            if (i15 != 0) {
                iQ2 = bwp.n(iQ3, i16 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            } else {
                iQ2 = bwp.q(iQ3, i16 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            }
            if (iQ2 == 0) {
                iQ2 = -1;
            }
            bwbVar.Q(8);
            i6 = 0;
        }
        if (i12 == 1767992678) {
            iRound = -1;
            iQ = -1;
        } else {
            if (i12 == 1935764850) {
                iRound = 8000;
            } else if (i12 == 1935767394) {
                iRound = 16000;
                i12 = 1935767394;
            }
            iQ = 1;
        }
        int i17 = bwbVar.c;
        int iIntValue = 1701733217;
        if (i12 == 1701733217) {
            Pair pairO = o(bwbVar, i2, i3);
            if (pairO != null) {
                iIntValue = ((Integer) pairO.first).intValue();
                bsaVarB = bsaVarB == null ? null : bsaVarB.b((String) ((yhk) pairO.second).d);
                ((yhk[]) czsVar.d)[i5] = (yhk) pairO.second;
            }
            i12 = iIntValue;
            bwbVar.P(i17);
        }
        String str5 = "audio/mhm1";
        if (i12 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i12 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i12 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i12 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i12 == 1685353320 || i12 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i12 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i12 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i12 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i12 == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (i12 == 1936684916) {
            iQ2 = i13;
            str2 = "audio/raw";
        } else {
            if (i12 == 1953984371) {
                iQ2 = 268435456;
            } else if (i12 == 1819304813) {
                if (iQ2 == -1) {
                    iQ2 = i13;
                }
            } else if (i12 == 778924082 || i12 == 778924083) {
                str2 = "audio/mpeg";
            } else if (i12 == 1835557169) {
                str2 = "audio/mha1";
            } else if (i12 == 1835560241) {
                str2 = "audio/mhm1";
            } else if (i12 == 1634492771) {
                str2 = "audio/alac";
            } else if (i12 == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (i12 == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (i12 == 1332770163) {
                str2 = "audio/opus";
            } else if (i12 == 1716281667) {
                str2 = "audio/flac";
            } else if (i12 == 1835823201) {
                str2 = "audio/true-hd";
            } else if (i12 == 1767992678) {
                str2 = "audio/iamf";
                i12 = 1767992678;
            } else {
                str2 = null;
            }
            str2 = "audio/raw";
        }
        Object obj2 = null;
        List listQ = null;
        czq czqVarR = null;
        czo czoVarQ = null;
        while (i17 - i2 < i3) {
            bwbVar.P(i17);
            int i18 = bwbVar.i();
            iQ2 = iQ2;
            azz.g(i18 > 0 ? 1 : i14, "childAtomSize must be positive");
            int i19 = bwbVar.i();
            if (i19 == 1835557187) {
                int i20 = i17 + i18;
                bwbVar.P(i17 + 8);
                bwbVar.Q(1);
                int iN2 = bwbVar.n();
                bwbVar.Q(1);
                if (Objects.equals(str2, str5)) {
                    Object[] objArr = new Object[1];
                    objArr[i14] = Integer.valueOf(iN2);
                    str3 = String.format("mhm1.%02X", objArr);
                } else {
                    Object[] objArr2 = new Object[1];
                    objArr2[i14] = Integer.valueOf(iN2);
                    str3 = String.format("mha1.%02X", objArr2);
                }
                int iS3 = bwbVar.s();
                byte[] bArr = new byte[iS3];
                int i21 = i14;
                bwbVar.K(bArr, i21, iS3);
                listQ = listQ == null ? agke.q(bArr) : agke.r(bArr, (byte[]) listQ.get(i21));
                i3 = i3;
                i17 = i20;
                obj2 = str3;
            } else {
                if (i19 == 1835557200) {
                    int i22 = i17 + i18;
                    bwbVar.P(i17 + 8);
                    int iN3 = bwbVar.n();
                    if (iN3 > 0) {
                        byte[] bArr2 = new byte[iN3];
                        bwbVar.K(bArr2, 0, iN3);
                        listQ = listQ == null ? agke.q(bArr2) : agke.r((byte[]) listQ.get(0), bArr2);
                    }
                    i17 = i22;
                } else {
                    str5 = str5;
                    if (i19 == 1702061171) {
                        iJ = i17;
                    } else if (z && i19 == 2002876005) {
                        iJ = j(bwbVar, 1702061171, i17, i18);
                    } else {
                        if (i19 == 1651798644) {
                            i8 = i17 + i18;
                            czoVarQ = q(bwbVar, i17);
                        } else if (i19 == 1684103987) {
                            i8 = i17 + i18;
                            bwbVar.P(i17 + 8);
                            czsVar.c = cuo.c(bwbVar, Integer.toString(i4), str, bsaVarB);
                        } else {
                            if (i19 == 1684366131) {
                                int i23 = i18 - 8;
                                int i24 = i18 + i17;
                                int i25 = i17 + 8;
                                byte[] bArr3 = new byte[i23];
                                bwbVar.P(i25);
                                bwbVar.K(bArr3, 0, i23);
                                bwbVar.P(i25);
                                bsd bsdVar = new bsd(cuo.d(bwbVar, Integer.toString(i4), str, bsaVarB));
                                bsdVar.r = agke.q(bArr3);
                                czsVar.c = new bse(bsdVar);
                                i17 = i24;
                            } else {
                                if (i19 == 1684103988) {
                                    i8 = i17 + i18;
                                    bwbVar.P(i17 + 8);
                                    czsVar.c = cuq.a(bwbVar, Integer.toString(i4), str, bsaVarB);
                                } else if (i19 != 1684892784) {
                                    int i26 = i17 + i18;
                                    if (i19 == 1684305011 || i19 == 1969517683) {
                                        i9 = i26;
                                        i7 = i13;
                                        i14 = 0;
                                        i10 = i6;
                                        bsd bsdVar2 = new bsd();
                                        bsdVar2.c(i4);
                                        bsdVar2.e(str2);
                                        bsdVar2.G = iQ;
                                        bsdVar2.I = iRound;
                                        bsdVar2.s = bsaVarB;
                                        bsdVar2.d = str;
                                        czsVar.c = new bse(bsdVar2);
                                        i6 = i10;
                                        iQ2 = iQ2;
                                    } else {
                                        if (i19 == 1682927731) {
                                            int i27 = i17 + 9;
                                            int i28 = i18 - 8;
                                            azz.g(i28 >= 11, a.bR(i28, "dOps box body is too short: "));
                                            byte[] bArr4 = b;
                                            ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArr4.length + i28).order(ByteOrder.LITTLE_ENDIAN);
                                            byteBufferOrder.put(bArr4);
                                            byteBufferOrder.put((byte) 1);
                                            bwbVar.P(i27);
                                            byteBufferOrder.put(bwbVar.a());
                                            byteBufferOrder.putShort(bwbVar.G());
                                            byteBufferOrder.putInt(bwbVar.i());
                                            byteBufferOrder.putShort(bwbVar.G());
                                            bwbVar.J(byteBufferOrder, i26 - bwbVar.c);
                                            listQ = atz.d(byteBufferOrder.array());
                                        } else if (i19 == 1684425825) {
                                            byte[] bArr5 = new byte[i18 - 8];
                                            bArr5[0] = 102;
                                            bArr5[1] = 76;
                                            bArr5[i13] = 97;
                                            bArr5[3] = 67;
                                            bwbVar.P(i17 + 12);
                                            bwbVar.K(bArr5, 4, i18 - 12);
                                            listQ = agke.q(bArr5);
                                        } else if (i19 == 1634492771) {
                                            int i29 = i18 - 12;
                                            byte[] bArr6 = new byte[i29];
                                            bwbVar.P(i17 + 12);
                                            bwbVar.K(bArr6, 0, i29);
                                            int[] iArrK = bvf.k(bArr6);
                                            iRound = iArrK[0];
                                            iQ = iArrK[1];
                                            int iP = bwp.p(iArrK[i13]);
                                            if (iP == 0) {
                                                iP = -1;
                                            }
                                            listQ = agke.q(bArr6);
                                            i17 = i26;
                                            str5 = str5;
                                            i14 = 0;
                                            iQ2 = iP;
                                        } else if (i19 == 1767990114) {
                                            bwbVar.P(i17 + 9);
                                            int iR = bwbVar.r();
                                            byte[] bArr7 = new byte[iR];
                                            bwbVar.K(bArr7, 0, iR);
                                            byte[] bArr8 = bvf.a;
                                            bwb bwbVar2 = new bwb(bArr7);
                                            String strK = null;
                                            String str6 = null;
                                            while (bwbVar2.d() > 0 && (strK == null || str6 == null)) {
                                                int iN4 = bwbVar2.n();
                                                int i30 = iN4 >> 3;
                                                int i31 = iN4 & 2;
                                                int i32 = iN4 & 1;
                                                int iR2 = bwbVar2.r();
                                                byte[] bArr9 = bArr7;
                                                if (i30 > 4 && i30 < 24 && i31 != 0) {
                                                    bwbVar2.R();
                                                    bwbVar2.R();
                                                }
                                                if (i32 != 0) {
                                                    bwbVar2.Q(bwbVar2.r());
                                                }
                                                int i33 = bwbVar2.c + iR2;
                                                int i34 = i26;
                                                if (i30 == 31) {
                                                    bwbVar2.Q(4);
                                                    int iN5 = bwbVar2.n();
                                                    int iN6 = bwbVar2.n();
                                                    Integer numValueOf = Integer.valueOf(iN5);
                                                    Integer numValueOf2 = Integer.valueOf(iN6);
                                                    Object[] objArr3 = new Object[i13];
                                                    objArr3[0] = numValueOf;
                                                    objArr3[1] = numValueOf2;
                                                    strK = bwp.K("iamf.%03X.%03X", objArr3);
                                                } else {
                                                    if (i30 == 0) {
                                                        bwbVar2.R();
                                                        String strC = bwbVar2.C(4);
                                                        if (strC.equals("mp4a")) {
                                                            bwbVar2.R();
                                                            bwbVar2.Q(2);
                                                            i6 = i6;
                                                            dqp dqpVar = new dqp((byte[]) null);
                                                            dqpVar.n(bwbVar2);
                                                            int i35 = dqpVar.i(5);
                                                            if (i35 == 31) {
                                                                i35 = dqpVar.i(6) + 32;
                                                            }
                                                            i11 = 2;
                                                            str6 = strC + ".40." + i35;
                                                        } else {
                                                            str6 = strC;
                                                        }
                                                        bwbVar2.P(i33);
                                                        bArr7 = bArr9;
                                                        i6 = i6;
                                                        i26 = i34;
                                                        i13 = i11;
                                                    }
                                                    i11 = 2;
                                                    bwbVar2.P(i33);
                                                    bArr7 = bArr9;
                                                    i6 = i6;
                                                    i26 = i34;
                                                    i13 = i11;
                                                }
                                                i11 = 2;
                                                bwbVar2.P(i33);
                                                bArr7 = bArr9;
                                                i6 = i6;
                                                i26 = i34;
                                                i13 = i11;
                                            }
                                            byte[] bArr10 = bArr7;
                                            int i36 = i26;
                                            i7 = i13;
                                            i14 = 0;
                                            int i37 = i6;
                                            if (strK == null || str6 == null) {
                                                str4 = null;
                                            } else {
                                                str4 = strK + '.' + str6;
                                            }
                                            agke agkeVarQ = agke.q(bArr10);
                                            obj2 = str4;
                                            listQ = agkeVarQ;
                                            i6 = i37;
                                            i17 = i36;
                                            i13 = i7;
                                        } else {
                                            i9 = i26;
                                            i7 = i13;
                                            i14 = 0;
                                            i10 = i6;
                                            if (i19 == 1885564227) {
                                                bwbVar.P(i17 + 12);
                                                ByteOrder byteOrder = (bwbVar.n() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                int iN7 = bwbVar.n();
                                                if (i12 == 1768973165) {
                                                    iN = bwp.q(iN7, byteOrder);
                                                } else {
                                                    iN = i12 == 1718641517 ? bwp.n(iN7, byteOrder) : iQ2;
                                                }
                                                iQ2 = iN == 0 ? -1 : iN;
                                                if (iQ2 != -1) {
                                                    i6 = i10;
                                                    str2 = "audio/raw";
                                                } else {
                                                    i6 = i10;
                                                }
                                            } else {
                                                i6 = i10;
                                                iQ2 = iQ2;
                                            }
                                        }
                                        i17 = i26;
                                    }
                                    i17 = i9;
                                    i13 = i7;
                                } else {
                                    if (i6 <= 0) {
                                        throw new bsz(a.bR(i6, "Invalid sample rate for Dolby TrueHD MLP stream: "), null, true, 1);
                                    }
                                    i17 += i18;
                                    iRound = i6;
                                    iQ = i13;
                                }
                                i3 = i3;
                            }
                            str5 = str5;
                        }
                        i17 = i8;
                        str5 = str5;
                    }
                    i7 = i13;
                    i14 = 0;
                    int i38 = i6;
                    i17 += i18;
                    if (iJ != -1) {
                        czqVarR = r(bwbVar, iJ);
                        str2 = czqVarR.a;
                        byte[] bArr11 = czqVarR.b;
                        if (bArr11 != null) {
                            if ("audio/vorbis".equals(str2)) {
                                listQ = cwk.b(bArr11);
                            } else {
                                if ("audio/mp4a-latm".equals(str2)) {
                                    aerm aermVarA = cun.a(bArr11);
                                    iRound = aermVarA.b;
                                    iQ = aermVarA.a;
                                    obj = aermVarA.c;
                                } else {
                                    obj = obj2;
                                }
                                obj2 = obj;
                                listQ = agke.q(bArr11);
                            }
                        }
                        i6 = i38;
                        i13 = i7;
                        i3 = i3;
                    } else {
                        i3 = i3;
                        i6 = i38;
                        iQ2 = iQ2;
                        i13 = i7;
                    }
                }
                i14 = 0;
                i3 = i3;
            }
            i14 = 0;
        }
        int i39 = iQ2;
        if (czsVar.c != null || str2 == null) {
            return;
        }
        bsd bsdVar3 = new bsd();
        bsdVar3.c(i4);
        bsdVar3.e(str2);
        bsdVar3.k = (String) obj2;
        bsdVar3.G = iQ;
        bsdVar3.I = iRound;
        bsdVar3.J = i39;
        bsdVar3.r = listQ;
        bsdVar3.s = bsaVarB;
        bsdVar3.d = str;
        if (czqVarR != null) {
            czq czqVar = czqVarR;
            bsdVar3.i = ahng.P(czqVar.c);
            bsdVar3.j = ahng.P(czqVar.d);
        } else {
            czo czoVar = czoVarQ;
            if (czoVar != null) {
                bsdVar3.i = ahng.P(czoVar.a);
                bsdVar3.j = ahng.P(czoVar.b);
            }
        }
        czsVar.c = new bse(bsdVar3);
    }

    private static aawx v(bwb bwbVar) {
        long jC;
        String str;
        bwbVar.P(8);
        int i = (bwbVar.i() >> 24) & 255;
        bwbVar.Q(i == 0 ? 8 : 16);
        long jW = bwbVar.w();
        int i2 = bwbVar.c;
        int i3 = 0;
        while (true) {
            int i4 = i == 0 ? 4 : 8;
            jC = -9223372036854775807L;
            if (i3 >= i4) {
                bwbVar.Q(i4);
                break;
            }
            if (bwbVar.b[i2 + i3] != -1) {
                long jW2 = i == 0 ? bwbVar.w() : bwbVar.x();
                if (jW2 == 0) {
                    break;
                }
                jC = bwp.C(jW2, 1000000L, jW);
                jW = jW;
                break;
            }
            i3++;
        }
        long j = jC;
        int iS = bwbVar.s();
        char[] cArr = {(char) (((iS >> 10) & 31) + 96), (char) (((iS >> 5) & 31) + 96), (char) ((iS & 31) + 96)};
        for (int i5 = 0; i5 < 3; i5++) {
            char c2 = cArr[i5];
            str = null;
            if (c2 < 'a' || c2 > 'z') {
                return new aawx(jW, j, str);
            }
        }
        str = new String(cArr);
        return new aawx(jW, j, str);
    }
}
