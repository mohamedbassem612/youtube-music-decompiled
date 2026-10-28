package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bto {
    public final int a;
    public final String b;
    public final int c;
    private final bse[] d;
    private int e;

    static {
        int i = bwp.a;
    }

    public bto(String str, bse... bseVarArr) {
        int length = bseVarArr.length;
        int i = 1;
        ahno.F(length > 0);
        this.b = str;
        this.d = bseVarArr;
        this.a = length;
        String str2 = bseVarArr[0].q;
        this.c = TextUtils.isEmpty(str2) ? bsy.b(bseVarArr[0].p) : bsy.b(str2);
        bse bseVar = bseVarArr[0];
        String strC = c(bseVar.d);
        int i2 = bseVar.f | 16384;
        while (true) {
            bse[] bseVarArr2 = this.d;
            if (i >= bseVarArr2.length) {
                return;
            }
            bse bseVar2 = bseVarArr2[i];
            String str3 = bseVar2.d;
            if (!strC.equals(c(str3))) {
                d("languages", bseVarArr2[0].d, str3, i);
                return;
            } else {
                if (i2 != (bseVar2.f | 16384)) {
                    d("role flags", Integer.toBinaryString(bseVarArr2[0].f), Integer.toBinaryString(this.d[i].f), i);
                    return;
                }
                i++;
            }
        }
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(String str, String str2, String str3, int i) {
        bvx.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ')'));
    }

    public final int a(bse bseVar) {
        int i = 0;
        while (true) {
            bse[] bseVarArr = this.d;
            if (i >= bseVarArr.length) {
                return -1;
            }
            if (bseVar == bseVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final bse b(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bto btoVar = (bto) obj;
            if (this.b.equals(btoVar.b) && Arrays.equals(this.d, btoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.b.hashCode() + 527) * 31) + Arrays.hashCode(this.d);
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
