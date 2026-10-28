package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dcy implements dbn {
    public static final abnx a = new abnx(agpi.a, -9223372036854775807L, -9223372036854775807L);
    private final bwb b = new bwb();
    private final bwb c = new bwb();
    private final dcx d;
    private Inflater e;

    public dcy(List list) {
        int i;
        dcx dcxVar = new dcx();
        this.d = dcxVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        int i2 = bwp.a;
        for (String str : strTrim.split("\\r?\\n", -1)) {
            if (str.startsWith("palette: ")) {
                String[] strArrSplit = str.substring(9).split(",", -1);
                dcxVar.f = new int[strArrSplit.length];
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    int[] iArr = dcxVar.f;
                    try {
                        i = Integer.parseInt(strArrSplit[i3].trim(), 16);
                    } catch (RuntimeException e) {
                        bvx.f("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i3] = i;
                }
            } else if (str.startsWith("size: ")) {
                String[] strArrSplit2 = str.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    bvx.e("VobsubParser", a.bU((byte) 39, str, "Ignoring malformed IDX size line: '"));
                } else {
                    try {
                        dcxVar.g = Integer.parseInt(strArrSplit2[0]);
                        dcxVar.h = Integer.parseInt(strArrSplit2[1]);
                        dcxVar.d = true;
                    } catch (RuntimeException e2) {
                        bvx.f("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    @Override // defpackage.dbn
    public final int a() {
        return 2;
    }

    @Override // defpackage.dbn
    public final /* synthetic */ dbd b(byte[] bArr, int i, int i2) {
        return dco.a(this, bArr, i2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0293  */
    /* JADX WARN: Code duplicated, block: B:89:0x0274  */
    /* JADX WARN: Code duplicated, block: B:92:0x027b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0288  */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00b5. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Switch 'out' block B:33:0x00a3 for B:39:0x00b5 already processed. Defaulting to fallback option. */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.dbn
    public final void c(byte[] bArr, int i, int i2, dbm dbmVar, bvh bvhVar) {
        abnx abnxVar;
        char c;
        long j;
        char c2;
        bus busVarA;
        long j2;
        long j3;
        agke agkeVarQ;
        long j4;
        Rect rect;
        bwb bwbVar = this.b;
        bwbVar.N(bArr, i + i2);
        bwbVar.P(i);
        Inflater inflater = this.e;
        if (inflater == null) {
            inflater = new Inflater();
            this.e = inflater;
        }
        bwb bwbVar2 = this.c;
        if (bwp.ag(bwbVar, bwbVar2, inflater)) {
            bwbVar.N(bwbVar2.b, bwbVar2.d);
        }
        dcx dcxVar = this.d;
        long j5 = -9223372036854775807L;
        dcxVar.b = -9223372036854775807L;
        dcxVar.c = -9223372036854775807L;
        char c3 = 0;
        dcxVar.e = false;
        dcxVar.i = null;
        dcxVar.j = -1;
        dcxVar.k = -1;
        int iD = bwbVar.d();
        if (iD < 2 || bwbVar.s() != iD) {
            abnxVar = a;
        } else {
            if (dcxVar.f == null) {
                bvx.e("VobsubParser", "Skipping SPU (no palette)");
            } else {
                if (dcxVar.d) {
                    int i3 = bwbVar.c - 2;
                    bwbVar.P(bwbVar.s() + i3);
                    while (true) {
                        int i4 = 4;
                        if (bwbVar.d() < 4) {
                            j = j5;
                            c2 = c3;
                            c = c2;
                        } else {
                            int i5 = bwbVar.c;
                            int iS = bwbVar.s() * 10000;
                            int iS2 = bwbVar.s() + i3;
                            c = (iS2 == i5 || iS2 >= bwbVar.d) ? c3 : (char) 1;
                            int i6 = c != 0 ? iS2 : bwbVar.d;
                            j = j5;
                            while (true) {
                                char c4 = 1;
                                while (true) {
                                    if (bwbVar.c >= i6 && c4 != 0) {
                                        long j6 = iS;
                                        char c5 = c3;
                                        int iN = bwbVar.n();
                                        if (iN != 255) {
                                            switch (iN) {
                                                case 0:
                                                    c3 = c5;
                                                    break;
                                                case 1:
                                                    dcxVar.b = j6;
                                                    c3 = c5;
                                                    c4 = 1;
                                                    i4 = 4;
                                                    break;
                                                case 2:
                                                    dcxVar.c = j6;
                                                    c3 = c5;
                                                    c4 = 1;
                                                    i4 = 4;
                                                    break;
                                                case 3:
                                                    if (bwbVar.d() >= 2) {
                                                        int iN2 = bwbVar.n();
                                                        int iN3 = bwbVar.n();
                                                        int[] iArr = dcxVar.a;
                                                        iArr[3] = dcx.a(dcxVar.f, iN2 >> 4);
                                                        iArr[2] = dcx.a(dcxVar.f, iN2 & 15);
                                                        iArr[1] = dcx.a(dcxVar.f, iN3 >> 4);
                                                        iArr[c5] = dcx.a(dcxVar.f, iN3 & 15);
                                                        dcxVar.e = true;
                                                        c3 = c5;
                                                        c4 = 1;
                                                        i4 = 4;
                                                    } else {
                                                        bvx.e("VobsubParser", "Incomplete color command");
                                                        c3 = c5;
                                                        c4 = c3;
                                                        i4 = 4;
                                                    }
                                                    break;
                                                case 4:
                                                    if (bwbVar.d() < 2) {
                                                        bvx.e("VobsubParser", "Incomplete alpha command");
                                                    } else if (dcxVar.e) {
                                                        int iN4 = bwbVar.n();
                                                        int iN5 = bwbVar.n();
                                                        int[] iArr2 = dcxVar.a;
                                                        iArr2[3] = (iArr2[3] & 16777215) | (((iN4 >> 4) * 17) << 24);
                                                        iArr2[2] = (iArr2[2] & 16777215) | (((iN4 & 15) * 17) << 24);
                                                        iArr2[1] = (iArr2[1] & 16777215) | (((iN5 >> 4) * 17) << 24);
                                                        iArr2[c5] = (iArr2[c5] & 16777215) | (((iN5 & 15) * 17) << 24);
                                                        c3 = c5;
                                                        c4 = 1;
                                                        i4 = 4;
                                                    } else {
                                                        bvx.e("VobsubParser", "Ignoring alpha command before color command");
                                                    }
                                                    c3 = c5;
                                                    c4 = c3;
                                                    i4 = 4;
                                                    break;
                                                case 5:
                                                    if (bwbVar.d() >= 6) {
                                                        int iN6 = bwbVar.n();
                                                        int iN7 = bwbVar.n();
                                                        int i7 = iN7 >> 4;
                                                        int iN8 = ((iN7 & 15) << 8) | bwbVar.n();
                                                        int iN9 = bwbVar.n();
                                                        int iN10 = bwbVar.n();
                                                        dcxVar.i = new Rect((iN6 << i4) | i7, (iN9 << i4) | (iN10 >> 4), iN8 + 1, (((iN10 & 15) << 8) | bwbVar.n()) + 1);
                                                        c3 = c5;
                                                        c4 = 1;
                                                        i4 = 4;
                                                    } else {
                                                        bvx.e("VobsubParser", "Incomplete area command");
                                                    }
                                                    break;
                                                case 6:
                                                    if (bwbVar.d() >= i4) {
                                                        dcxVar.j = bwbVar.s();
                                                        dcxVar.k = bwbVar.s();
                                                        c3 = c5;
                                                    } else {
                                                        bvx.e("VobsubParser", "Incomplete offsets command");
                                                    }
                                                    break;
                                                default:
                                                    bvx.e("VobsubParser", a.bR(iN, "Unrecognized command: "));
                                                    break;
                                            }
                                            if (bwbVar.c >= i6) {
                                            }
                                        }
                                        c3 = c5;
                                        c4 = c3;
                                    }
                                }
                            }
                            c2 = c3;
                            if (c != 0) {
                                bwbVar.P(iS2);
                            }
                        }
                        if (c != 0) {
                            j5 = j;
                            c3 = c2;
                        }
                    }
                } else {
                    bvx.e("VobsubParser", "Skipping SPU (no plane)");
                }
                if (dcxVar.f != null || !dcxVar.d || !dcxVar.e || (rect = dcxVar.i) == null || dcxVar.j == -1 || dcxVar.k == -1 || rect.width() < 2 || dcxVar.i.height() < 2) {
                    busVarA = null;
                } else {
                    Rect rect2 = dcxVar.i;
                    int[] iArr3 = new int[rect2.width() * rect2.height()];
                    dqp dqpVar = new dqp((byte[]) null);
                    bwbVar.P(dcxVar.j);
                    dqpVar.n(bwbVar);
                    dcxVar.b(dqpVar, true, rect2, iArr3);
                    bwbVar.P(dcxVar.k);
                    dqpVar.n(bwbVar);
                    dcxVar.b(dqpVar, c2, rect2, iArr3);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
                    bur burVar = new bur();
                    burVar.b(bitmapCreateBitmap);
                    burVar.e = rect2.left / dcxVar.g;
                    burVar.f = 0;
                    burVar.c(rect2.top / dcxVar.h, 0);
                    burVar.d = 0;
                    burVar.g = rect2.width() / dcxVar.g;
                    burVar.h = rect2.height() / dcxVar.h;
                    busVarA = burVar.a();
                }
                j2 = dcxVar.c;
                if (j2 != j) {
                    j4 = dcxVar.b;
                    if (j4 != j && j2 > j4) {
                        j2 -= j4;
                    }
                    j3 = j2;
                } else {
                    j3 = j;
                }
                if (busVarA != null) {
                    agkeVarQ = agke.q(busVarA);
                } else {
                    agkeVarQ = agpi.a;
                }
                abnxVar = new abnx(agkeVarQ, dcxVar.b, j3);
            }
            j = -9223372036854775807L;
            c2 = 0;
            if (dcxVar.f != null) {
                busVarA = null;
            } else {
                busVarA = null;
            }
            j2 = dcxVar.c;
            if (j2 != j) {
                j4 = dcxVar.b;
                if (j4 != j) {
                    j2 -= j4;
                }
                j3 = j2;
            } else {
                j3 = j;
            }
            if (busVarA != null) {
                agkeVarQ = agke.q(busVarA);
            } else {
                agkeVarQ = agpi.a;
            }
            abnxVar = new abnx(agkeVarQ, dcxVar.b, j3);
        }
        bvhVar.a(abnxVar);
    }

    @Override // defpackage.dbn
    public final /* synthetic */ void d() {
    }
}
