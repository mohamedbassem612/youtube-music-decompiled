package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wez {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/innertube/entities/store/EditUtil");
    public static final aijp a = wey.a;

    /* JADX WARN: Type inference failed for: r10v13, types: [awmd, java.lang.Object] */
    public static byte[] a(wjr wjrVar, akvd akvdVar, String str, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            if ((akvdVar.b & 2) == 0) {
                return bArr2;
            }
            try {
                hed hedVar = (hed) wjrVar.a.io();
                weq weqVarE = hedVar.E(((wfr) hedVar.b).a(str));
                int iB = weqVarE == null ? Integer.MIN_VALUE : weqVarE.b();
                if (iB == Integer.MIN_VALUE) {
                    bArr = null;
                } else {
                    bArr = new byte[aigs.L(iB, str)];
                    aigs aigsVarO = aigs.O(bArr);
                    aigsVarO.u(iB, str);
                    aigsVarO.d();
                }
            } catch (IOException e) {
                ((agrc) ((agrc) ((agrc) b.b()).j(e)).k("com/google/android/libraries/youtube/innertube/entities/store/EditUtil", "applyUpdates", 'G', "EditUtil.java")).w("applyUpdates couldn't mergeSerialized for entity %s", str);
                return null;
            }
        }
        affc affcVar = akvdVar.d;
        if (affcVar == null) {
            affcVar = affc.a;
        }
        aikh aikhVarB = aikh.b(affcVar);
        akvc akvcVar = akvdVar.c;
        if (akvcVar == null) {
            akvcVar = akvc.a;
        }
        int iAS = a.aS(akvcVar.c);
        char c = (iAS == 0 || iAS != 3) ? (char) 1 : (char) 2;
        aikf aikfVarA = aikf.a(aigm.M(bArr2), aikhVarB);
        if (bArr == null) {
            byte[] bArr3 = new byte[aikfVarA.b];
            aikfVarA.b(aigs.O(bArr3));
            return bArr3;
        }
        aikf aikfVarA2 = aikf.a(aigm.M(bArr), c == 1 ? aikhVarB.d() : aikh.b);
        byte[] bArr4 = new byte[aikfVarA2.b + aikfVarA.b];
        aigs aigsVarO2 = aigs.O(bArr4);
        aikfVarA2.b(aigsVarO2);
        aikfVarA.b(aigsVarO2);
        return bArr4;
    }
}
