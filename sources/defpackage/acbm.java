package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbm implements zwz {
    private final SparseArray a = new SparseArray();
    private final boolean b;
    private final abmt c;

    public acbm(boolean z, abmt abmtVar) {
        this.b = z;
        this.c = abmtVar;
    }

    @Override // defpackage.zwz
    public final /* bridge */ /* synthetic */ Object a() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return new acbn(arrayList);
            }
            arrayList.add(((accd) sparseArray.valueAt(i)).a());
            i++;
        }
    }

    public final accd b(int i) {
        SparseArray sparseArray = this.a;
        accd accdVar = (accd) sparseArray.get(i);
        if (accdVar != null) {
            return accdVar;
        }
        accd accdVar2 = new accd(i, this.b, this.c);
        sparseArray.put(i, accdVar2);
        return accdVar2;
    }

    public final void c(int i, String str, int i2, int i3) {
        b(i).d(str, i2, i3);
    }
}
