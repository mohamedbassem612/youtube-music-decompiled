package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwt {
    private static final agrf a = agrf.h("com/google/apps/tiktok/tracing/Tracer");

    public static boolean a(afvl afvlVar) {
        return (afvlVar == null || (afvlVar instanceof afto) || (afvlVar instanceof afuh) || (afvlVar instanceof afur) || (afvlVar instanceof aful)) ? false : true;
    }

    public static afuu b(int i, qci qciVar) {
        return f(i, qciVar.a);
    }

    public static afuu c(int i, String str) {
        return d(i, str, afux.a, true);
    }

    public static afuu d(int i, String str, afuy afuyVar, boolean z) {
        boolean z2;
        afvl afvlVarC;
        boolean z3;
        afug afugVar;
        afvh afvhVar = (afvh) afty.d.get();
        afvl afvlVar = afvhVar.c;
        if (afvlVar == afur.a) {
            afvlVar = null;
            afty.e(afvhVar, null);
            z2 = true;
        } else {
            z2 = false;
        }
        if (afvlVar == null) {
            UUID uuidB = aftz.a.b();
            String strKg = afsx.kg(uuidB);
            if (afvm.a != 1) {
                aftm aftmVar = new aftm();
                afug.m();
                z3 = z;
                afugVar = new afug(uuidB, strKg, str, afuyVar, aftmVar, z3, afty.n(aftmVar), afvhVar);
            } else {
                z3 = z;
                aftm aftmVar2 = afuf.a;
                afug.m();
                afugVar = new afug(uuidB, strKg, str, afuyVar, aftmVar2, z3, false, afvhVar);
            }
            boolean z4 = afugVar.a;
            afvlVarC = afugVar;
            afvlVarC = afugVar;
            if (!z4 && z3) {
                afty.r(true);
                afvlVarC = afugVar;
            }
        } else {
            afvlVarC = afvlVar instanceof afto ? ((afto) afvlVar).c(str, afuyVar, z, afvhVar) : afvlVar.q(str, i, afuyVar, afvhVar);
        }
        afty.e(afvhVar, afvlVarC);
        return new afuu(afvlVarC, z2);
    }

    public static afuu e(int i, Class cls, String str) {
        return d(i, cls.getName() + ": " + str, afux.a, true);
    }

    public static afuu f(int i, String str) {
        return d(i, str, afux.a, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static afun g(afun afunVar) {
        return afty.d(afunVar);
    }

    public static afuv h(afvl afvlVar, aguu aguuVar, List list) {
        if (afvlVar == null) {
            return afuv.d(2);
        }
        afuv afuvVarD = afuv.d(3);
        loop0: while (afvlVar != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (afvlVar.k((aguu) it.next()).b()) {
                    break loop0;
                }
            }
            afuvVarD = afvlVar.k(aguuVar);
            if (afuvVarD.c() - 1 == 0) {
                break;
            }
            afvlVar = afvlVar.b();
        }
        return afuvVarD;
    }

    public static void i(aguu aguuVar, Object obj) {
        afvl afvlVar = ((afvh) afty.d.get()).c;
        if (afvlVar != null) {
            afvlVar.t(aguuVar, obj);
        } else {
            ((agrc) ((agrc) ((agrc) a.b()).l(agsi.FULL)).k("com/google/apps/tiktok/tracing/Tracer", "appendMetadata", 1153, "Tracer.java")).t("Failed to append runtime metadata as there is no trace present");
        }
    }
}
