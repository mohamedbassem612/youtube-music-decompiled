package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyc extends cyh {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String[] d;
    private final cyh[] e;

    public cyc(String str, boolean z, boolean z2, String[] strArr, cyh[] cyhVarArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = strArr;
        this.e = cyhVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyc cycVar = (cyc) obj;
            if (this.b == cycVar.b && this.c == cycVar.c && Objects.equals(this.a, cycVar.a) && Arrays.equals(this.d, cycVar.d) && Arrays.equals(this.e, cycVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b ? 1 : 0) + 527) * 31) + (this.c ? 1 : 0)) * 31) + this.a.hashCode();
    }
}
