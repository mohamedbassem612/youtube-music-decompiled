package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$VideoRegion;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class aavv {
    public aavv(byte[] bArr, byte[] bArr2) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    private static void b(List list, List list2, int i) {
        int i2 = i << 1;
        list.add(list2.get(i2));
        list.add(list2.get(i2 + 1));
    }

    private static boolean c(StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion) {
        int i = stitchedSegmentsMetadataOuterClass$VideoRegion.f;
        return i > 0 && ((float) (Math.floor(((double) (((float) stitchedSegmentsMetadataOuterClass$VideoRegion.e) / ((float) i))) * 100.0d) / 100.0d)) < 1.77f;
    }

    public static avbs e(boolean z, boolean z2, acer acerVar, int i) {
        return new avbs(z, true == z2 ? 3 : 1, acerVar, i);
    }

    public static boolean f(wjf wjfVar) {
        if (wjfVar == null || wjfVar.u() == null) {
            return false;
        }
        aoqd aoqdVar = wjfVar.u().e;
        if (aoqdVar == null) {
            aoqdVar = aoqd.a;
        }
        akcu akcuVar = aoqdVar.I;
        if (akcuVar == null) {
            akcuVar = akcu.a;
        }
        return akcuVar.b.size() > 1;
    }

    public static agke g(StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion, StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion2, float f) {
        int i = stitchedSegmentsMetadataOuterClass$VideoRegion2.e;
        boolean z = false;
        if (i > 0 && i >= stitchedSegmentsMetadataOuterClass$VideoRegion.e) {
            z = true;
        }
        ahno.F(z);
        int i2 = stitchedSegmentsMetadataOuterClass$VideoRegion2.e;
        float f2 = (i2 - stitchedSegmentsMetadataOuterClass$VideoRegion.e) / i2;
        Float fValueOf = Float.valueOf(f2 - 1.0f);
        Float fValueOf2 = Float.valueOf(f);
        Float fValueOf3 = Float.valueOf(1.0f - f2);
        Float fValueOf4 = Float.valueOf(-1.0f);
        return agke.x(fValueOf, fValueOf2, fValueOf3, fValueOf2, fValueOf3, fValueOf4, fValueOf, fValueOf4);
    }

    public static agke h(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        if (i5 > 0 && i6 > 0) {
            z = true;
        }
        ahno.F(z);
        float f = i;
        int i7 = i + i3;
        float f2 = i2;
        int i8 = i2 + i4;
        float f3 = i6;
        float f4 = i5;
        Float fValueOf = Float.valueOf(f / f4);
        Float fValueOf2 = Float.valueOf(i8 / f3);
        Float fValueOf3 = Float.valueOf(i7 / f4);
        Float fValueOf4 = Float.valueOf(f2 / f3);
        return agke.x(fValueOf, fValueOf2, fValueOf3, fValueOf2, fValueOf3, fValueOf4, fValueOf, fValueOf4);
    }

    public static int i(int i, abfd abfdVar, StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion, StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion2) {
        int iOrdinal = abfdVar.ordinal();
        if (iOrdinal == 1) {
            stitchedSegmentsMetadataOuterClass$VideoRegion.getClass();
            stitchedSegmentsMetadataOuterClass$VideoRegion2.getClass();
            return stitchedSegmentsMetadataOuterClass$VideoRegion2.f + stitchedSegmentsMetadataOuterClass$VideoRegion.f;
        }
        if (iOrdinal != 2) {
            return i;
        }
        stitchedSegmentsMetadataOuterClass$VideoRegion.getClass();
        return stitchedSegmentsMetadataOuterClass$VideoRegion.f;
    }

    public static yxd j(int i, int i2, abfd abfdVar, StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion, StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion2) {
        int iOrdinal = abfdVar.ordinal();
        int i3 = 0;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int[] iArr = abfe.a;
                while (i3 < 4) {
                    int i4 = iArr[i3];
                    b(arrayList, abfe.c, i4);
                    b(arrayList2, abfe.b, i4);
                    i3++;
                }
                yxc yxcVar = new yxc();
                yxcVar.e(aguu.T(arrayList));
                yxcVar.c(aguu.T(arrayList2));
                yxcVar.f();
                yxcVar.d();
                yxcVar.b(5);
                yxcVar.a = yxf.PASSTHROUGH;
                return yxcVar.a();
            }
            stitchedSegmentsMetadataOuterClass$VideoRegion.getClass();
            stitchedSegmentsMetadataOuterClass$VideoRegion2.getClass();
            agke agkeVarH = h(stitchedSegmentsMetadataOuterClass$VideoRegion.c, stitchedSegmentsMetadataOuterClass$VideoRegion.d, stitchedSegmentsMetadataOuterClass$VideoRegion.e, stitchedSegmentsMetadataOuterClass$VideoRegion.f, i, i2);
            agke agkeVarG = c(stitchedSegmentsMetadataOuterClass$VideoRegion) ? g(stitchedSegmentsMetadataOuterClass$VideoRegion, stitchedSegmentsMetadataOuterClass$VideoRegion2, 1.0f) : aguu.T(abfe.c);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int[] iArr2 = abfe.a;
            while (i3 < 4) {
                int i5 = iArr2[i3];
                b(arrayList3, agkeVarG, i5);
                b(arrayList4, agkeVarH, i5);
                i3++;
            }
            yxc yxcVar2 = new yxc();
            yxcVar2.e(aguu.T(arrayList3));
            yxcVar2.c(aguu.T(arrayList4));
            yxcVar2.f();
            yxcVar2.d();
            yxcVar2.b(5);
            yxcVar2.a = yxf.RECOMPOSITION;
            return yxcVar2.a();
        }
        stitchedSegmentsMetadataOuterClass$VideoRegion.getClass();
        stitchedSegmentsMetadataOuterClass$VideoRegion2.getClass();
        int i6 = stitchedSegmentsMetadataOuterClass$VideoRegion2.f;
        int i7 = stitchedSegmentsMetadataOuterClass$VideoRegion.f;
        int i8 = i6 + i7;
        float f = i8 > 0 ? (i7 - i6) / i8 : 0.0f;
        agke agkeVarH2 = h(stitchedSegmentsMetadataOuterClass$VideoRegion2.c, stitchedSegmentsMetadataOuterClass$VideoRegion2.d, stitchedSegmentsMetadataOuterClass$VideoRegion2.e, i6, i, i2);
        agke agkeVarH3 = h(stitchedSegmentsMetadataOuterClass$VideoRegion.c, stitchedSegmentsMetadataOuterClass$VideoRegion.d, stitchedSegmentsMetadataOuterClass$VideoRegion.e, stitchedSegmentsMetadataOuterClass$VideoRegion.f, i, i2);
        Float fValueOf = Float.valueOf(-1.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Float fValueOf3 = Float.valueOf(f);
        agke agkeVarX = agke.x(fValueOf, fValueOf2, fValueOf2, fValueOf2, fValueOf2, fValueOf3, fValueOf, fValueOf3);
        agke agkeVarG2 = c(stitchedSegmentsMetadataOuterClass$VideoRegion) ? g(stitchedSegmentsMetadataOuterClass$VideoRegion, stitchedSegmentsMetadataOuterClass$VideoRegion2, f) : agke.x(fValueOf, fValueOf3, fValueOf2, fValueOf3, fValueOf2, fValueOf, fValueOf, fValueOf);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int[] iArr3 = abfe.a;
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = iArr3[i9];
            b(arrayList5, agkeVarX, i10);
            b(arrayList6, agkeVarH2, i10);
        }
        int i11 = iArr3[3];
        int i12 = iArr3[0];
        b(arrayList5, agkeVarX, i11);
        b(arrayList5, agkeVarG2, i12);
        b(arrayList6, agkeVarH2, i11);
        b(arrayList6, agkeVarH3, i12);
        while (i3 < 4) {
            int i13 = iArr3[i3];
            b(arrayList5, agkeVarG2, i13);
            b(arrayList6, agkeVarH3, i13);
            i3++;
        }
        yxc yxcVar3 = new yxc();
        yxcVar3.e(aguu.T(arrayList5));
        yxcVar3.c(aguu.T(arrayList6));
        yxcVar3.f();
        yxcVar3.d();
        yxcVar3.b(5);
        yxcVar3.a = yxf.RECOMPOSITION;
        return yxcVar3.a();
    }

    public static int k(int i, abfd abfdVar, StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion, StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion2) {
        int iOrdinal = abfdVar.ordinal();
        if (iOrdinal == 1) {
            stitchedSegmentsMetadataOuterClass$VideoRegion2.getClass();
            return stitchedSegmentsMetadataOuterClass$VideoRegion2.e;
        }
        if (iOrdinal != 2) {
            return i;
        }
        stitchedSegmentsMetadataOuterClass$VideoRegion.getClass();
        if (!c(stitchedSegmentsMetadataOuterClass$VideoRegion)) {
            return stitchedSegmentsMetadataOuterClass$VideoRegion.e;
        }
        stitchedSegmentsMetadataOuterClass$VideoRegion2.getClass();
        return stitchedSegmentsMetadataOuterClass$VideoRegion2.e;
    }

    public static boolean l(alvf alvfVar) {
        if (alvfVar != null) {
            String str = alvfVar.c;
            str.getClass();
            if (str.length() != 0 && alvfVar.d > 0 && alvfVar.e != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? false : true;
    }

    public static boolean n(abmt abmtVar, alvf alvfVar, boolean z) {
        abmtVar.getClass();
        return abmtVar.g.l(74, 45416623L, false) || !z || (alvfVar != null && alvfVar.h);
    }

    public static Set o(abyd abydVar, Set set) {
        set.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            awsd awsdVar = (awsd) it.next();
            abyc abycVar = (abyc) abydVar.c.get(awsdVar);
            if (abycVar == null) {
                abycVar = (abyc) abyd.b.get(awsdVar);
            }
            abxp abxpVarA = abycVar != null ? abycVar.a() : null;
            if (abxpVarA != null) {
                arrayList.add(abxpVarA);
            }
        }
        return atqq.aw(arrayList);
    }

    public static abyb p(abxp abxpVar) {
        abxpVar.getClass();
        return new abyb(abxpVar);
    }

    public static askp q(String str) {
        aihf aihfVarCreateBuilder = askp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        askp askpVar = (askp) aihfVarCreateBuilder.instance;
        str.getClass();
        askpVar.b |= 1;
        askpVar.c = str;
        return (askp) aihfVarCreateBuilder.build();
    }

    public static MessageLite r(apji apjiVar) {
        if (apjiVar != null && !apjiVar.equals(apjiVar.getDefaultInstanceForType())) {
            try {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ExtensionRegistryLite.getGeneratedRegistry().a(apji.a, aext.A(apjiVar)));
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                return (MessageLite) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Object s(apji apjiVar, aigw aigwVar) {
        if (apjiVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aigwVar);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                return objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
            }
        }
        return null;
    }

    public static long t(int i, int i2, Typeface typeface) {
        long jIdentityHashCode = (typeface != null ? ((long) System.identityHashCode(typeface)) << 32 : 0L) | (((long) ((char) i)) << 16) | ((long) i2);
        long j = (jIdentityHashCode ^ (jIdentityHashCode >>> 30)) * (-4658895280553007687L);
        long j2 = (j ^ (j >>> 27)) * (-7723592293110705685L);
        return j2 ^ (j2 >>> 31);
    }

    public static String u(acko ackoVar) {
        String strA = ackn.a(ackoVar.a());
        return strA == null ? "" : strA;
    }

    public Uri a(Uri uri) {
        throw null;
    }

    public aavv(char[] cArr) {
    }

    public aavv(Context context) {
        context.getClass();
    }

    public aavv() {
    }

    public aavv(byte[] bArr) {
        Optional.empty();
        Optional.empty();
    }
}
