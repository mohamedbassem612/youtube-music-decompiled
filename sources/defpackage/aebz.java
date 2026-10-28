package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aebz {
    public final aeby a;
    public final xgn b;
    public final ArrayList c;
    public final Runnable d;
    public final aebx e;
    private final Runnable f;

    public aebz(aeby aebyVar, xgn xgnVar, List list, Runnable runnable, Runnable runnable2, aebx aebxVar) {
        this.a = aebyVar;
        xgnVar.getClass();
        this.b = xgnVar;
        this.c = new ArrayList(list);
        this.f = runnable;
        this.d = runnable2;
        this.e = aebxVar;
    }

    public final void a() {
        ArrayList arrayList;
        loop0: while (true) {
            arrayList = this.c;
            if (arrayList.isEmpty()) {
                break;
            }
            Activity activityA = this.a.a();
            for (String str : aebx.d(activityA, ((aebt) arrayList.get(0)).a)) {
                if (avg.c(activityA, str) != 0) {
                    break loop0;
                }
            }
            arrayList.remove(0);
        }
        if (arrayList.isEmpty()) {
            this.f.run();
            return;
        }
        aebt aebtVar = (aebt) arrayList.get(0);
        xhc xhcVar = aebtVar.b;
        xgn xgnVar = this.b;
        xgnVar.d(new xgj(xhcVar));
        xgnVar.d(new xgj(aebtVar.c));
        aeby aebyVar = this.a;
        Activity activityA2 = aebyVar.a();
        int i = aebtVar.a;
        String[] strArrD = aebx.d(activityA2, i);
        taf.j(this.e.e.b(new acpb(strArrD, 13)), new abwu(14));
        aebyVar.a.requestPermissions(strArrD, i);
    }
}
