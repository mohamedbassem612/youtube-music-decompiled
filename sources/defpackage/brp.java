package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brp {
    public static final brp a = new brp(new brn[0]);
    private static final brn e;
    private final brn[] f;
    public final long c = 0;
    public final int b = 0;
    public final int d = 0;

    static {
        brn brnVar = new brn(-1, new int[0], new bss[0], new long[0], new String[0], new bro[0]);
        int[] iArr = brnVar.e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = brnVar.f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        bss[] bssVarArr = (bss[]) Arrays.copyOf(brnVar.d, 0);
        String[] strArr = (String[]) Arrays.copyOf(brnVar.g, 0);
        bro[] broVarArr = brnVar.h;
        e = new brn(0, iArrCopyOf, bssVarArr, jArrCopyOf, strArr, (bro[]) Arrays.copyOf(broVarArr, Math.max(0, broVarArr.length)));
        int i = bwp.a;
    }

    private brp(brn[] brnVarArr) {
        this.f = brnVarArr;
    }

    public final brn a(int i) {
        return i < 0 ? e : this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            brp brpVar = (brp) obj;
            if (Objects.equals(null, null) && Arrays.equals(this.f, brpVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 961 + Arrays.hashCode(this.f);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }
}
