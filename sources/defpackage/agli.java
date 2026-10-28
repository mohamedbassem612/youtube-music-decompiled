package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agli extends agkx {
    private final Comparator e;

    public agli(Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
    }

    @Override // defpackage.agkx, defpackage.agju, defpackage.agjv
    public final /* synthetic */ void c(Object obj) {
        super.c(obj);
    }

    @Override // defpackage.agkx
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final aglk g() {
        agps agpsVar;
        Object[] objArrCopyOf = this.a;
        int i = this.b;
        Comparator comparator = this.e;
        if (i == 0) {
            agpsVar = aglk.E(comparator);
        } else {
            aguu.j(objArrCopyOf, i);
            Arrays.sort(objArrCopyOf, 0, i, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArrCopyOf[i3];
                if (comparator.compare(obj, objArrCopyOf[i2 - 1]) != 0) {
                    objArrCopyOf[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArrCopyOf, i2, i, (Object) null);
            if (i2 < (objArrCopyOf.length >> 1)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            agpsVar = new agps(agke.i(objArrCopyOf, i2), comparator);
        }
        this.b = agpsVar.size();
        this.c = true;
        return agpsVar;
    }

    public final void n(Object obj) {
        super.c(obj);
    }

    public final void o(Object... objArr) {
        super.i(objArr);
    }
}
