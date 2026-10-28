package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eaq {
    public static final /* synthetic */ int a = 0;

    static {
        dzf.a("Schedulers");
    }

    public static void a(dyl dylVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eet eetVarC = workDatabase.C();
        new ArrayList();
        workDatabase.m();
        try {
            List listD = eetVarC.d();
            bnz bnzVar = dylVar.k;
            c(eetVarC, listD);
            List listU = eetVarC.u();
            int i = dylVar.i;
            List listC = eetVarC.C();
            c(eetVarC, listC);
            if (listD != null) {
                listC.addAll(listD);
            }
            int i2 = dylVar.h;
            workDatabase.p();
            workDatabase.n();
            b(listC, list, true);
            b(listU, list, false);
        } catch (Throwable th) {
            workDatabase.n();
            throw th;
        }
    }

    private static void b(List list, List list2, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        ees[] eesVarArr = (ees[]) list.toArray(new ees[list.size()]);
        ListIterator listIterator = ((awoa) list2).listIterator(0);
        while (listIterator.hasNext()) {
            eao eaoVar = (eao) listIterator.next();
            if (eaoVar.d() == z) {
                eaoVar.c(eesVarArr);
            }
        }
    }

    private static void c(eet eetVar, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eetVar.w(((ees) it.next()).c, jCurrentTimeMillis);
            }
        }
    }
}
