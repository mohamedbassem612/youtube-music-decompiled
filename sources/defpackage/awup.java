package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awup {
    public static final awou a(awou awouVar, awou awouVar2) {
        return !d(awouVar2) ? awouVar.plus(awouVar2) : (awou) awouVar2.fold(awouVar, new jnk(4));
    }

    public static final awou b(awut awutVar, awou awouVar) {
        awou awouVarPlus;
        awou awouVarB = awutVar.b();
        if (awouVar == awov.a || !d(awouVar)) {
            awouVarPlus = ((awou) awouVarB.fold(awouVarB, new jnk(6))).plus(awouVar);
        } else {
            awrm awrmVar = new awrm();
            awrmVar.a = awouVar;
            awouVarPlus = (awou) ((awou) awrmVar.a).fold((awou) awouVarB.fold(awouVarB, new acfc(awrmVar, 7)), new akm(14));
        }
        awou awouVarPlus2 = awuv.a ? awouVarPlus.plus(new awur(awuv.c.incrementAndGet())) : awouVarPlus;
        awuq awuqVar = awvi.a;
        return (awouVarPlus == awuqVar || awouVarPlus.get(awor.j) != null) ? awouVarPlus2 : awouVarPlus2.plus(awuqVar);
    }

    public static final awxm c(awoq awoqVar, awou awouVar, Object obj) {
        awxm awxmVar = null;
        if ((awoqVar instanceof awph) && awouVar.get(awxn.a) != null) {
            awph callerFrame = (awph) awoqVar;
            while (!(callerFrame instanceof awvf) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof awxm) {
                    awxmVar = (awxm) callerFrame;
                    break;
                }
            }
            if (awxmVar != null) {
                awxmVar.O(awouVar, obj);
            }
        }
        return awxmVar;
    }

    private static final boolean d(awou awouVar) {
        Objects.checkIndex(0, 3);
        if (awouVar != null) {
            if (awouVar instanceof afwr) {
                return true;
            }
            if (awouVar instanceof awos) {
                return false;
            }
        }
        return ((Boolean) awouVar.fold(Boolean.FALSE, new jnk(5))).booleanValue();
    }
}
