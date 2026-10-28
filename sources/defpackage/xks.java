package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xks {
    public final boolean a;
    public final List b;
    public final int c;

    private xks(boolean z, List list, int i) {
        this.a = z;
        this.b = list;
        this.c = i;
    }

    public static xks a(int[] iArr) {
        if (iArr != null) {
            if (iArr.length >= 2) {
                boolean z = iArr[0] == 1;
                int i = iArr[1];
                ArrayList arrayList = new ArrayList();
                for (int i2 = 2; i2 < iArr.length; i2++) {
                    ajwc ajwcVarA = ajwc.a(iArr[i2]);
                    if (ajwcVarA != null) {
                        arrayList.add(ajwcVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(ajwc.COLLECTION_REASON_UNKNOWN);
                }
                return new xks(z, arrayList, i);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ajwc.COLLECTION_REASON_UNKNOWN);
        return new xks(false, arrayList2, 0);
    }
}
