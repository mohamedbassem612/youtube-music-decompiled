package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyb extends cyh implements cxk {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    private final cyh[] g;

    public cyb(String str, int i, int i2, long j, long j2, cyh[] cyhVarArr) {
        String str2;
        super("CHAP");
        ahno.F(i <= i2);
        this.a = str;
        this.b = i;
        this.c = i2;
        int length = cyhVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            cyh cyhVar = cyhVarArr[i3];
            if (cyhVar instanceof cym) {
                cym cymVar = (cym) cyhVar;
                if (cymVar.f.equals("TIT2") && !cymVar.b.isEmpty()) {
                    str2 = (String) cymVar.b.get(0);
                    break;
                }
            }
            i3++;
        }
        if (str2 != null) {
            new bsg(null, str2);
        }
        this.d = j;
        this.e = j2;
        this.g = cyhVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyb cybVar = (cyb) obj;
            if (this.b == cybVar.b && this.c == cybVar.c && this.d == cybVar.d && this.e == cybVar.e && Objects.equals(this.a, cybVar.a) && Arrays.equals(this.g, cybVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b + 527;
        String str = this.a;
        long j = this.e;
        return (((((((i * 31) + this.c) * 31) + ((int) this.d)) * 31) + ((int) j)) * 31) + str.hashCode();
    }
}
