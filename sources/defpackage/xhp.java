package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xhp {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/logging/interaction/internal/InteractionLoggingVisibilityUpdateController");
    private static final amec b = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_FIRST_SHOWN;
    private static final amec c = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_HIDDEN;
    private final xgo d;

    public xhp(xgo xgoVar) {
        this.d = xgoVar;
    }

    private static final boolean c(Optional optional, amud amudVar) {
        if (optional.isPresent()) {
            if (amudVar == null || (amudVar.c & 64) == 0) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/logging/interaction/internal/InteractionLoggingVisibilityUpdateController", "isFvlCriteriaValid", 149, "InteractionLoggingVisibilityUpdateController.java")).t("INTERACTIONLOGGING: No LoggingDirectives available or no FocusVisibilityLoggingConfig in LoggingDirectives when logging a FocusVisibilityLoggingCriteria as hidden");
                return false;
            }
            atqc atqcVar = amudVar.i;
            if (atqcVar == null) {
                atqcVar = atqc.a;
            }
            atqd atqdVar = (atqd) optional.get();
            atqg atqgVar = atqdVar.c;
            if (atqgVar == null) {
                atqgVar = atqg.a;
            }
            atqf atqfVar = atqgVar.c;
            if (atqfVar == null) {
                atqfVar = atqf.a;
            }
            atqd atqdVar2 = atqcVar.c;
            if (atqdVar2 == null) {
                atqdVar2 = atqd.a;
            }
            atqg atqgVar2 = atqdVar2.c;
            if (atqgVar2 == null) {
                atqgVar2 = atqg.a;
            }
            atqf atqfVar2 = atqgVar2.c;
            if (atqfVar2 == null) {
                atqfVar2 = atqf.a;
            }
            if (!atqfVar.equals(atqfVar2)) {
                atqg atqgVar3 = atqdVar.c;
                if (atqgVar3 == null) {
                    atqgVar3 = atqg.a;
                }
                atqf atqfVar3 = atqgVar3.c;
                if (atqfVar3 == null) {
                    atqfVar3 = atqf.a;
                }
                atqd atqdVar3 = atqcVar.d;
                if (atqdVar3 == null) {
                    atqdVar3 = atqd.a;
                }
                atqg atqgVar4 = atqdVar3.c;
                if (atqgVar4 == null) {
                    atqgVar4 = atqg.a;
                }
                atqf atqfVar4 = atqgVar4.c;
                if (atqfVar4 == null) {
                    atqfVar4 = atqf.a;
                }
                if (!atqfVar3.equals(atqfVar4)) {
                    ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/logging/interaction/internal/InteractionLoggingVisibilityUpdateController", "isFvlCriteriaValid", 156, "InteractionLoggingVisibilityUpdateController.java")).t("INTERACTIONLOGGING: Logged FocusVisibilityLoggingCriteria does not belong to any criteria listed in LoggingDirectives");
                    return false;
                }
            }
        }
        return true;
    }

    public final void a(xgz xgzVar, Optional optional, Optional optional2, amdd amddVar, xgt xgtVar, xie xieVar) {
        amud amudVarB = xgzVar.b();
        if (c(optional, amudVarB)) {
            xhl xhlVar = amudVarB != null ? new xhl(xgzVar, optional, amddVar, optional2) : new xhl(c, xgo.b(xgzVar.c()), optional, amddVar, optional2);
            xgo xgoVar = this.d;
            if (xgo.q(xgoVar.a(), xgtVar, xhlVar)) {
                if (xgoVar.i && xhlVar.g.isEmpty()) {
                    xgtVar.g.remove(xhlVar.f);
                }
                if (xgo.r(xhlVar)) {
                    if ((xhlVar.c.a() == amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN && xgoVar.j) || xgtVar.i(xhlVar, xgoVar.l)) {
                        return;
                    }
                    xgtVar.e(xhlVar, xgoVar.m);
                    aihf aihfVarCreateBuilder = amcc.a.createBuilder();
                    String str = xgtVar.a;
                    aihfVarCreateBuilder.copyOnWrite();
                    amcc amccVar = (amcc) aihfVarCreateBuilder.instance;
                    str.getClass();
                    amccVar.b |= 1;
                    amccVar.c = str;
                    amec amecVar = xhlVar.e;
                    aihfVarCreateBuilder.copyOnWrite();
                    amcc amccVar2 = (amcc) aihfVarCreateBuilder.instance;
                    amccVar2.f = amecVar.i;
                    amccVar2.b |= 8;
                    argn argnVar = xhlVar.f;
                    aihfVarCreateBuilder.copyOnWrite();
                    amcc amccVar3 = (amcc) aihfVarCreateBuilder.instance;
                    argnVar.getClass();
                    amccVar3.d = argnVar;
                    amccVar3.b |= 2;
                    amdd amddVar2 = xhlVar.h;
                    if (amddVar2 != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        amcc amccVar4 = (amcc) aihfVarCreateBuilder.instance;
                        amccVar4.e = amddVar2;
                        amccVar4.b |= 4;
                    }
                    Optional optional3 = xhlVar.g;
                    if (optional3.isPresent()) {
                        atqd atqdVar = (atqd) optional3.get();
                        aihf aihfVarCreateBuilder2 = atqe.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        atqe atqeVar = (atqe) aihfVarCreateBuilder2.instance;
                        atqeVar.c = atqdVar;
                        atqeVar.b |= 1;
                        Optional optional4 = xhlVar.a;
                        if (optional4.isPresent()) {
                            int iIntValue = ((Integer) optional4.get()).intValue();
                            aihfVarCreateBuilder2.copyOnWrite();
                            atqe atqeVar2 = (atqe) aihfVarCreateBuilder2.instance;
                            atqeVar2.b |= 2;
                            atqeVar2.d = iIntValue;
                        }
                        atqe atqeVar3 = (atqe) aihfVarCreateBuilder2.build();
                        aihfVarCreateBuilder.copyOnWrite();
                        amcc amccVar5 = (amcc) aihfVarCreateBuilder.instance;
                        atqeVar3.getClass();
                        amccVar5.g = atqeVar3;
                        amccVar5.b |= 16;
                    }
                    amcc amccVar6 = (amcc) aihfVarCreateBuilder.build();
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    amccVar6.getClass();
                    alouVar.d = amccVar6;
                    alouVar.c = 73;
                    xgoVar.d(alosVar, xgtVar, xieVar);
                    ((xhf) xgoVar.c.io()).g(amccVar6, xieVar);
                }
            }
        }
    }

    public final void b(xgz xgzVar, Optional optional, amdd amddVar, xgt xgtVar, xie xieVar) {
        amud amudVarB = xgzVar.b();
        if (c(optional, amudVarB)) {
            this.d.n(xgtVar, amudVarB != null ? new xhm(xgzVar, optional, amddVar) : new xhm(b, xgo.b(xgzVar.c()), optional, amddVar), xieVar);
        }
    }
}
