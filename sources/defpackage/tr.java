package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tr extends vm {
    public static final sl a;
    public final int[] b;
    public ss c;
    private Integer d;

    static {
        sb sbVar = new sb("VisibilityPermissionType");
        sg sgVar = new sg("allRequiredPermissions");
        sgVar.b(1);
        sbVar.c(sgVar.a());
        a = sbVar.a();
    }

    public tr(Set set) {
        super((byte[]) null);
        set.getClass();
        int[] iArr = new int[set.size()];
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tr) {
            return Arrays.equals(this.b, ((tr) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = this.d;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Arrays.hashCode(this.b));
            this.d = numValueOf;
        }
        return numValueOf.intValue();
    }
}
