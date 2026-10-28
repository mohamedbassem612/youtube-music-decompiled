package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.accessibility.CaptioningManager;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cqr extends cqw {
    public static final Comparator a = new awv(7);
    public final Context b;
    public cql c;
    public brq d;
    public Boolean e;
    public eqf f;
    private cql h;
    private volatile Thread i;
    private final zs j;

    public cqr(Context context) {
        zs zsVar = new zs((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        cql cqlVar = cql.K;
        this.b = context != null ? context.getApplicationContext() : null;
        this.j = zsVar;
        if (!(cqlVar instanceof cql)) {
            cqk cqkVar = new cqk(cqlVar);
            cqkVar.d(cqlVar);
            cqlVar = new cql(cqkVar);
        }
        this.h = cqlVar;
        this.c = cqlVar;
        this.d = brq.a;
        if (cqlVar.V && context == null) {
            bvx.e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int a(bse bseVar, agke agkeVar) {
        for (int i = 0; i < ((agpi) agkeVar).d; i++) {
            int i2 = 0;
            while (true) {
                List list = bseVar.c;
                if (i2 < list.size()) {
                    if (((bsg) list.get(i2)).b.equals(agkeVar.get(i))) {
                        return i;
                    }
                    i2++;
                }
            }
        }
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    protected static int b(bse bseVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(bseVar.d)) {
            return 4;
        }
        String strE = e(str);
        String strE2 = e(bseVar.d);
        if (strE2 == null || strE == null) {
            if (z && strE2 == null) {
                return 1;
            }
        } else {
            if (strE2.startsWith(strE) || strE.startsWith(strE2)) {
                return 3;
            }
            int i = bwp.a;
            if (strE2.split("-", 2)[0].equals(strE.split("-", 2)[0])) {
                return 2;
            }
        }
        return 0;
    }

    public static int c(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : Alert.DURATION_SHOW_INDEFINITELY;
    }

    protected static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static final eol o(coy coyVar, int[][] iArr, cql cqlVar) {
        int i = cqlVar.x.b;
        int i2 = 0;
        bto btoVar = null;
        cqj cqjVar = null;
        for (int i3 = 0; i3 < coyVar.b; i3++) {
            bto btoVarB = coyVar.b(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < btoVarB.a; i4++) {
                if (aub.e(iArr2[i4], cqlVar.W)) {
                    cqj cqjVar2 = new cqj(btoVarB.b(i4), iArr2[i4]);
                    if (cqjVar == null || cqjVar2.compareTo(cqjVar) > 0) {
                        btoVar = btoVarB;
                        i2 = i4;
                        cqjVar = cqjVar2;
                    }
                }
            }
        }
        if (btoVar != null) {
            return new eol(btoVar, new int[]{i2});
        }
        return null;
    }

    private final void s(cql cqlVar) {
        boolean zEquals = this.h.equals(cqlVar);
        this.h = cqlVar;
        if (zEquals) {
            return;
        }
        if (cqlVar.V && this.b == null) {
            bvx.e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        r(cqlVar);
    }

    private static final Pair t(int i, cqv cqvVar, int[][][] iArr, cqo cqoVar, Comparator comparator) {
        RandomAccess randomAccessQ;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < cqvVar.a; i2++) {
            if (i == cqvVar.a(i2)) {
                coy coyVarC = cqvVar.c(i2);
                for (int i3 = 0; i3 < coyVarC.b; i3++) {
                    bto btoVarB = coyVarC.b(i3);
                    List listA = cqoVar.a(i2, btoVarB, iArr[i2][i3]);
                    int i4 = btoVarB.a;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        cqp cqpVar = (cqp) listA.get(i5);
                        int iB = cqpVar.b();
                        if (!zArr[i5] && iB != 0) {
                            boolean z = true;
                            if (iB == 1) {
                                randomAccessQ = agke.q(cqpVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(cqpVar);
                                int i7 = i6;
                                while (i7 < i4) {
                                    boolean z2 = z;
                                    cqp cqpVar2 = (cqp) listA.get(i7);
                                    if (cqpVar2.b() == 2 && cqpVar.c(cqpVar2)) {
                                        arrayList2.add(cqpVar2);
                                        zArr[i7] = z2;
                                    }
                                    i7++;
                                    z = z2;
                                }
                                randomAccessQ = arrayList2;
                            }
                            arrayList.add(randomAccessQ);
                        }
                        i5 = i6;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((cqp) list.get(i8)).c;
        }
        cqp cqpVar3 = (cqp) list.get(0);
        return Pair.create(new eol(cqpVar3.b, iArr2), Integer.valueOf(cqpVar3.a));
    }

    private static void u(cqv cqvVar, bts btsVar) {
        int i;
        HashMap map = new HashMap();
        int i2 = 0;
        while (true) {
            i = cqvVar.a;
            if (i2 >= i) {
                break;
            }
            v(cqvVar.c(i2), btsVar);
            i2++;
        }
        v(cqvVar.e, btsVar);
        for (int i3 = 0; i3 < i; i3++) {
            if (((btp) map.get(Integer.valueOf(cqvVar.a(i3)))) != null) {
                throw null;
            }
        }
    }

    private static void v(coy coyVar, bts btsVar) {
        for (int i = 0; i < coyVar.b; i++) {
            if (((btp) btsVar.I.get(coyVar.b(i))) != null) {
                throw null;
            }
        }
    }

    private static Pair w(eol[] eolVarArr, int i) {
        for (int i2 = 0; i2 < eolVarArr.length; i2++) {
            eol eolVar = eolVarArr[i2];
            if (eolVar != null && ((bto) eolVar.a).c == i) {
                return Pair.create(eolVar, Integer.valueOf(i2));
            }
        }
        return null;
    }

    private static void x(cqv cqvVar, cql cqlVar, eol[] eolVarArr) {
        for (int i = 0; i < cqvVar.a; i++) {
            coy coyVarC = cqvVar.c(i);
            SparseArray sparseArray = cqlVar.aa;
            Map map = (Map) sparseArray.get(i);
            if (map != null && map.containsKey(coyVarC)) {
                Map map2 = (Map) sparseArray.get(i);
                if ((map2 != null ? (cqm) map2.get(coyVarC) : null) != null) {
                    throw null;
                }
                eolVarArr[i] = null;
            }
        }
    }

    private static void y(cqv cqvVar, cql cqlVar, eol[] eolVarArr) {
        for (int i = 0; i < cqvVar.a; i++) {
            int iA = cqvVar.a(i);
            if (cqlVar.b(i) || cqlVar.J.contains(Integer.valueOf(iA))) {
                eolVarArr[i] = null;
            }
        }
    }

    @Override // defpackage.cqz
    public final /* synthetic */ bts d() {
        return this.h;
    }

    @Override // defpackage.cqz
    public final void f(cqy cqyVar, crd crdVar) {
        super.f(cqyVar, crdVar);
        this.c = this.h;
    }

    public final void g() {
        eqf eqfVar;
        if (!this.c.V || Build.VERSION.SDK_INT < 32 || (eqfVar = this.f) == null || !eqfVar.a) {
            return;
        }
        r(null);
    }

    @Override // defpackage.cqz
    public final void h(bts btsVar) {
        if (btsVar != null) {
            if (btsVar instanceof cql) {
                this.c = (cql) btsVar;
                return;
            }
            cqk cqkVar = new cqk(this.c);
            cqkVar.d(btsVar);
            this.c = new cql(cqkVar);
        }
    }

    @Override // defpackage.cqz
    public final void i() {
        eqf eqfVar;
        if (this.i != null) {
            ahno.P(Thread.currentThread().equals(this.i), "DefaultTrackSelector is accessed on the wrong thread.");
        }
        if (Build.VERSION.SDK_INT >= 32 && (eqfVar = this.f) != null) {
            eqfVar.a();
            this.f = null;
        }
        super.i();
    }

    @Override // defpackage.cqz
    public final void j(brq brqVar) {
        if (this.d.equals(brqVar)) {
            return;
        }
        this.d = brqVar;
        g();
    }

    @Override // defpackage.cqz
    public final void k(bts btsVar) {
        if (btsVar instanceof cql) {
            s((cql) btsVar);
        }
        cqk cqkVar = new cqk(this.h);
        cqkVar.d(btsVar);
        s(new cql(cqkVar));
    }

    @Override // defpackage.cqz
    public final boolean l() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.util.Comparator] */
    @Override // defpackage.cqw
    protected final Pair n(cqv cqvVar, int[][][] iArr, final int[] iArr2) {
        long j;
        int[] iArr3;
        int length;
        long j2;
        long[][] jArr;
        eol[] eolVarArr;
        int i;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        final boolean z;
        Context context3;
        this.i = Thread.currentThread();
        if (this.e == null && (context3 = this.b) != null) {
            this.e = Boolean.valueOf(bwp.ae(context3));
        }
        int i2 = 0;
        if (this.c.V && Build.VERSION.SDK_INT >= 32 && this.f == null) {
            this.f = new eqf(this.b, new cqc(this, i2), this.e);
        }
        int i3 = cqvVar.a;
        eol[] eolVarArr2 = new eol[i3];
        u(cqvVar, this.c);
        x(cqvVar, this.c, eolVarArr2);
        y(cqvVar, this.c, eolVarArr2);
        final cql cqlVar = this.c;
        Pair pairW = w(eolVarArr2, 1);
        if (pairW == null) {
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z = false;
                    break;
                }
                if (cqvVar.a(i4) == 2 && cqvVar.c(i4).b > 0) {
                    z = true;
                    break;
                }
                i4++;
            }
            pairW = t(1, cqvVar, iArr, new cqo() { // from class: cqf
                @Override // defpackage.cqo
                public final List a(int i5, bto btoVar, int[] iArr4) {
                    cqr cqrVar = this.a;
                    cql cqlVar2 = cqlVar;
                    iab iabVar = new iab(cqrVar, cqlVar2, 1, null);
                    int i6 = iArr2[i5];
                    agjz agjzVar = new agjz(4);
                    for (int i7 = 0; i7 < btoVar.a; i7++) {
                        agjzVar.h(new cqh(i5, btoVar, i7, cqlVar2, iArr4[i7], z, iabVar));
                    }
                    return agjzVar.g();
                }
            }, new awv(11));
            if (pairW != null) {
                eolVarArr2[((Integer) pairW.second).intValue()] = (eol) pairW.first;
            }
        }
        final String str = pairW == null ? null : ((bto) ((eol) pairW.first).a).b(((int[]) ((eol) pairW.first).b)[0]).d;
        Pair pairW2 = w(eolVarArr2, 2);
        Pair pairW3 = w(eolVarArr2, 4);
        if (pairW2 == null && pairW3 == null) {
            int i5 = cqlVar.x.b;
            final Point pointG = (!cqlVar.l || (context2 = this.b) == null) ? null : bwp.G(context2);
            Pair pairT = t(2, cqvVar, iArr, new cqo() { // from class: cqe
                /* JADX WARN: Code duplicated, block: B:25:0x0044  */
                @Override // defpackage.cqo
                public final List a(int i6, bto btoVar, int[] iArr4) {
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    Point point;
                    bto btoVar2 = btoVar;
                    int i13 = iArr2[i6];
                    cql cqlVar2 = cqlVar;
                    Point point2 = pointG;
                    if (point2 != null) {
                        i7 = point2.x;
                        i8 = point2.y;
                    } else {
                        i7 = cqlVar2.j;
                        i8 = cqlVar2.k;
                    }
                    boolean z2 = cqlVar2.m;
                    if (i7 == Integer.MAX_VALUE || i8 == Integer.MAX_VALUE) {
                        i9 = Integer.MAX_VALUE;
                    } else {
                        int i14 = Integer.MAX_VALUE;
                        for (int i15 = 0; i15 < btoVar2.a; i15++) {
                            bse bseVarB = btoVar2.b(i15);
                            int i16 = bseVarB.w;
                            if (i16 > 0 && (i10 = bseVarB.x) > 0) {
                                if (!z2) {
                                    i11 = i8;
                                    i12 = i7;
                                } else if ((i16 > i10) != (i7 > i8)) {
                                    i12 = i8;
                                    i11 = i7;
                                } else {
                                    i11 = i8;
                                    i12 = i7;
                                }
                                int i17 = i16 * i11;
                                int i18 = i10 * i12;
                                if (i17 >= i18) {
                                    int i19 = bwp.a;
                                    point = new Point(i12, ((i18 + i16) - 1) / i16);
                                } else {
                                    int i20 = bwp.a;
                                    point = new Point(((i17 + i10) - 1) / i10, i11);
                                }
                                int i21 = i16 * i10;
                                if (i16 >= ((int) (point.x * 0.98f)) && i10 >= ((int) (point.y * 0.98f)) && i21 < i14) {
                                    i14 = i21;
                                }
                            }
                        }
                        i9 = i14;
                    }
                    agjz agjzVar = new agjz(4);
                    int i22 = 0;
                    while (i22 < btoVar2.a) {
                        int iA = btoVar2.b(i22).a();
                        agjzVar.h(new cqq(i6, btoVar2, i22, cqlVar2, iArr4[i22], str, i9 == Integer.MAX_VALUE || (iA != -1 && iA <= i9)));
                        i22++;
                        btoVar2 = btoVar;
                    }
                    return agjzVar.g();
                }
            }, new awv(10));
            boolean z2 = cqlVar.F;
            Pair pairT2 = pairT == null ? t(4, cqvVar, iArr, new cqo() { // from class: cqd
                @Override // defpackage.cqo
                public final List a(int i6, bto btoVar, int[] iArr4) {
                    agjz agjzVar = new agjz(4);
                    for (int i7 = 0; i7 < btoVar.a; i7++) {
                        agjzVar.h(new cqi(i6, btoVar, i7, cqlVar, iArr4[i7]));
                    }
                    return agjzVar.g();
                }
            }, new awv(9)) : null;
            if (pairT2 != null) {
                eolVarArr2[((Integer) pairT2.second).intValue()] = (eol) pairT2.first;
            } else if (pairT != null) {
                eolVarArr2[((Integer) pairT.second).intValue()] = (eol) pairT.first;
            }
        }
        if (w(eolVarArr2, 3) == null) {
            int i6 = cqlVar.x.b;
            final String languageTag = (!cqlVar.C || (context = this.b) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) ? null : locale.toLanguageTag();
            Pair pairT3 = t(3, cqvVar, iArr, new cqo() { // from class: cqg
                @Override // defpackage.cqo
                public final List a(int i7, bto btoVar, int[] iArr4) {
                    agjz agjzVar = new agjz(4);
                    for (int i8 = 0; i8 < btoVar.a; i8++) {
                        agjzVar.h(new cqn(i7, btoVar, i8, cqlVar, iArr4[i8], str, languageTag));
                    }
                    return agjzVar.g();
                }
            }, new awv(8));
            if (pairT3 != null) {
                eolVarArr2[((Integer) pairT3.second).intValue()] = (eol) pairT3.first;
            }
        }
        int i7 = cqlVar.x.b;
        agkx agkxVar = new agkx();
        for (int i8 = 0; i8 < i3; i8++) {
            eol eolVar = eolVarArr2[i8];
            if (eolVar != null && !cqlVar.b(i8)) {
                agkz agkzVar = cqlVar.J;
                bto btoVar = (bto) eolVar.a;
                if (!agkzVar.contains(Integer.valueOf(btoVar.c))) {
                    agkxVar.c(btoVar.b);
                    int i9 = 0;
                    while (true) {
                        int[] iArr4 = (int[]) eolVar.b;
                        if (i9 < iArr4.length) {
                            String str2 = btoVar.b(iArr4[i9]).o;
                            if (str2 != null) {
                                agkxVar.c(str2);
                            }
                            i9++;
                        }
                    }
                }
            }
        }
        agkz agkzVarG = agkxVar.g();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < i3; i10++) {
            if (cqvVar.a(i10) == 5) {
                coy coyVarC = cqvVar.c(i10);
                for (int i11 = 0; i11 < coyVarC.b; i11++) {
                    bto btoVarB = coyVarC.b(i11);
                    arrayList.add(btoVarB);
                    int[] iArr5 = (int[]) iArr[i10][i11].clone();
                    for (int i12 = 0; i12 < iArr5.length; i12++) {
                        String str3 = btoVarB.b(i12).o;
                        if (str3 != null && !agkzVarG.contains(str3)) {
                            iArr5[i12] = 128;
                        }
                    }
                    arrayList2.add(iArr5);
                }
            }
        }
        int i13 = SemanticState.Focused;
        bto[] btoVarArr = new bto[arrayList.size()];
        bwp.U(arrayList, btoVarArr);
        coy coyVar = new coy(btoVarArr);
        int[][] iArr6 = new int[arrayList2.size()][];
        bwp.U(arrayList2, iArr6);
        int i14 = 0;
        while (i14 < i3) {
            if (cqvVar.a(i14) == 5) {
                eol eolVarO = o(coyVar, iArr6, cqlVar);
                eolVarArr2[i14] = eolVarO;
                if (eolVarO == null) {
                    break;
                }
                i = i13;
                Arrays.fill(iArr6[coyVar.a((bto) eolVarO.a)], i);
            } else {
                i = i13;
            }
            i14++;
            i13 = i;
        }
        for (int i15 = 0; i15 < i3; i15++) {
            int iA = cqvVar.a(i15);
            if (iA != 2 && iA != 1 && iA != 3 && iA != 4 && iA != 5 && eolVarArr2[i15] == null) {
                eolVarArr2[i15] = o(cqvVar.c(i15), iArr[i15], cqlVar);
            }
        }
        u(cqvVar, this.c);
        x(cqvVar, this.c, eolVarArr2);
        y(cqvVar, this.c, eolVarArr2);
        zs zsVar = this.j;
        crd crdVar = this.g;
        crdVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (int i16 = 0; i16 < i3; i16++) {
            eol eolVar2 = eolVarArr2[i16];
            if (eolVar2 == null || ((int[]) eolVar2.b).length <= 1) {
                arrayList3.add(null);
            } else {
                agjz agjzVar = new agjz(4);
                agjzVar.h(new cpz(0L, 0L));
                arrayList3.add(agjzVar);
            }
        }
        long[][] jArr2 = new long[i3][];
        int i17 = 0;
        while (true) {
            j = -1;
            if (i17 >= i3) {
                break;
            }
            eol eolVar3 = eolVarArr2[i17];
            if (eolVar3 == null) {
                jArr2[i17] = new long[0];
            } else {
                int[] iArr7 = (int[]) eolVar3.b;
                jArr2[i17] = new long[iArr7.length];
                for (int i18 = 0; i18 < iArr7.length; i18++) {
                    long j3 = ((bto) eolVar3.a).b(iArr7[i18]).k;
                    long[] jArr3 = jArr2[i17];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr3[i18] = j3;
                }
                Arrays.sort(jArr2[i17]);
            }
            i17++;
        }
        int[] iArr8 = new int[i3];
        long[] jArr4 = new long[i3];
        for (int i19 = 0; i19 < i3; i19++) {
            long[] jArr5 = jArr2[i19];
            jArr4[i19] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        cqa.i(arrayList3, jArr4);
        agom agomVarK = agvp.k(new agoo(agpb.a));
        int i20 = 0;
        while (i20 < i3) {
            int length2 = jArr2[i20].length;
            if (length2 <= 1) {
                jArr = jArr2;
                eolVarArr = eolVarArr2;
                j2 = j;
            } else {
                double[] dArr = new double[length2];
                j2 = j;
                int i21 = 0;
                while (true) {
                    long[] jArr6 = jArr2[i20];
                    jArr = jArr2;
                    double dLog = 0.0d;
                    eolVarArr = eolVarArr2;
                    if (i21 >= jArr6.length) {
                        break;
                    }
                    long j4 = jArr6[i21];
                    if (j4 != j2) {
                        dLog = Math.log(j4);
                    }
                    dArr[i21] = dLog;
                    i21++;
                    jArr2 = jArr;
                    eolVarArr2 = eolVarArr;
                }
                int i22 = length2 - 1;
                double d = dArr[i22] - dArr[0];
                int i23 = 0;
                while (i23 < i22) {
                    double d2 = dArr[i23];
                    i23++;
                    agomVarK.u(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i23]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i20));
                    d = d;
                }
            }
            i20++;
            j = j2;
            jArr2 = jArr;
            eolVarArr2 = eolVarArr;
        }
        long[][] jArr7 = jArr2;
        eol[] eolVarArr3 = eolVarArr2;
        agke agkeVarN = agke.n(new aghg((aghh) agomVarK));
        for (int i24 = 0; i24 < agkeVarN.size(); i24++) {
            int iIntValue = ((Integer) agkeVarN.get(i24)).intValue();
            int i25 = iArr8[iIntValue] + 1;
            iArr8[iIntValue] = i25;
            jArr4[iIntValue] = jArr7[iIntValue][i25];
            cqa.i(arrayList3, jArr4);
        }
        for (int i26 = 0; i26 < i3; i26++) {
            if (arrayList3.get(i26) != null) {
                jArr4[i26] = jArr4[i26] << 1;
            }
        }
        cqa.i(arrayList3, jArr4);
        agjz agjzVar2 = new agjz(4);
        for (int i27 = 0; i27 < arrayList3.size(); i27++) {
            agjz agjzVar3 = (agjz) arrayList3.get(i27);
            agjzVar2.h(agjzVar3 == null ? agpi.a : agjzVar3.g());
        }
        agke agkeVarG = agjzVar2.g();
        cqs[] cqsVarArr = new cqs[i3];
        for (int i28 = 0; i28 < i3; i28++) {
            eol eolVar4 = eolVarArr3[i28];
            if (eolVar4 != null && (length = (iArr3 = (int[]) eolVar4.b).length) != 0) {
                cqsVarArr[i28] = length == 1 ? new cqt((bto) eolVar4.a, iArr3[0], 0, null) : new cqa((bto) eolVar4.a, iArr3, crdVar, (agke) agkeVarG.get(i28), zsVar.a);
            }
        }
        cdr[] cdrVarArr = new cdr[i3];
        for (int i29 = 0; i29 < i3; i29++) {
            cdrVarArr[i29] = (this.c.b(i29) || this.c.J.contains(Integer.valueOf(cqvVar.a(i29))) || (cqvVar.a(i29) != -2 && cqsVarArr[i29] == null)) ? null : cdr.a;
        }
        cql cqlVar2 = this.c;
        boolean z3 = cqlVar2.X;
        int i30 = cqlVar2.x.b;
        return Pair.create(cdrVarArr, cqsVarArr);
    }

    @Override // defpackage.cqz
    public final cqr m() {
        return this;
    }
}
