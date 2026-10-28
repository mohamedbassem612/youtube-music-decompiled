package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ebq implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ebm a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ayq c;

    public /* synthetic */ ebq(ayq ayqVar, ebm ebmVar, String str, int i) {
        this.$cid = i;
        this.c = ayqVar;
        this.a = ebmVar;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Set] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.$cid != 0) {
            List listSingletonList = Collections.singletonList(this.c);
            listSingletonList.getClass();
            efl.a(new eax(this.a, this.b, 2, listSingletonList));
            return awmy.a;
        }
        ebm ebmVar = this.a;
        String str = this.b;
        ayq ayqVar = this.c;
        ebq ebqVar = new ebq(ayqVar, ebmVar, str, 1);
        eet eetVarC = ebmVar.d.C();
        List listJ = eetVarC.j(str);
        if (listJ.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        eeq eeqVar = (eeq) atqq.Z(listJ);
        if (eeqVar == null) {
            ebqVar.invoke();
            return awmy.a;
        }
        String str2 = eeqVar.a;
        ees eesVarC = eetVarC.c(str2);
        if (eesVarC == null) {
            throw new IllegalStateException(a.ct(str, str2, "WorkSpec with ", ", that matches a name \"", "\", wasn't found"));
        }
        if (!eesVarC.e()) {
            throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        }
        if (eeqVar.b == dzr.f) {
            eetVarC.l(str2);
            ebqVar.invoke();
            return awmy.a;
        }
        final ees eesVarF = ees.f((ees) ayqVar.c, str2, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
        eam eamVar = ebmVar.f;
        eamVar.getClass();
        final WorkDatabase workDatabase = ebmVar.d;
        workDatabase.getClass();
        dyl dylVar = ebmVar.c;
        dylVar.getClass();
        List list = ebmVar.e;
        list.getClass();
        final ?? r7 = ayqVar.a;
        final String str3 = eesVarF.c;
        final ees eesVarC2 = workDatabase.C().c(str3);
        if (eesVarC2 == null) {
            throw new IllegalArgumentException(a.bT(str3, "Worker with ", " doesn't exist"));
        }
        if (!eesVarC2.d.a()) {
            if (eesVarC2.e() ^ eesVarF.e()) {
                akl aklVar = new akl(17);
                throw new UnsupportedOperationException("Can't update " + aklVar.invoke(eesVarC2) + " Worker to " + aklVar.invoke(eesVarF) + " Worker. Update operation must preserve worker's type.");
            }
            final boolean zE = eamVar.e(str3);
            if (!zE) {
                ListIterator listIterator = ((awoa) list).listIterator(0);
                while (listIterator.hasNext()) {
                    ((eao) listIterator.next()).b(str3);
                }
            }
            workDatabase.o(new Runnable() { // from class: ebp
                @Override // java.lang.Runnable
                public final void run() {
                    ees eesVar = eesVarF;
                    ees eesVar2 = eesVarC2;
                    int i = eesVar2.t;
                    WorkDatabase workDatabase2 = workDatabase;
                    eet eetVarC2 = workDatabase2.C();
                    eff effVarD = workDatabase2.D();
                    ees eesVarF2 = ees.f(eesVar, null, eesVar2.d, null, null, eesVar2.m, eesVar2.o, eesVar2.s, i + 1, eesVar2.u, eesVar2.v, 29613053);
                    if (eesVar.v == 1) {
                        eesVarF2.u = eesVar.u;
                        eesVarF2.v++;
                    }
                    boolean z = zE;
                    Set set = r7;
                    String str4 = str3;
                    eetVarC2.s(dms.h(eesVarF2));
                    effVarD.b(str4);
                    effVarD.c(str4, set);
                    if (z) {
                        return;
                    }
                    eetVarC2.w(str4, -1L);
                    workDatabase2.B().a(str4);
                }
            });
            if (!zE) {
                eaq.a(dylVar, workDatabase, list);
            }
        }
        return awmy.a;
    }

    public /* synthetic */ ebq(ebm ebmVar, String str, ayq ayqVar, int i) {
        this.$cid = i;
        this.a = ebmVar;
        this.b = str;
        this.c = ayqVar;
    }
}
