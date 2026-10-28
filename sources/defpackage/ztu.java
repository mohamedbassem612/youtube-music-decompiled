package defpackage;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ztu extends zsn {
    public static final ztu a = new ztu();

    private static final ahbo i(akkt akktVar, ahbo ahboVar, Predicate predicate, ToIntFunction toIntFunction) {
        int[] iArrG = ahboVar.g();
        for (akks akksVar : akktVar.y) {
            akku akkuVarA = akku.a(akksVar.c);
            if (akkuVarA == null) {
                akkuVarA = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
            }
            int iA = zvb.a(akkuVarA);
            if (iA < iArrG.length && predicate.test(akksVar)) {
                iArrG[iA] = toIntFunction.applyAsInt(akksVar);
            }
        }
        return ahbo.b(iArrG);
    }

    @Override // defpackage.zsn
    public final void b(akkt akktVar, ztq ztqVar) {
        ((zsp) ztqVar).e = i(akktVar, ztqVar.az(), new gqn(20), new crt(5));
    }

    @Override // defpackage.zsn
    public final void c(akkt akktVar, ztq ztqVar) {
        ((zsp) ztqVar).d = i(akktVar, ztqVar.aA(), new ztt(0), new crt(7));
    }

    @Override // defpackage.zsn
    public final void d(akkt akktVar, ztq ztqVar) {
        ((zsp) ztqVar).f = i(akktVar, ztqVar.aB(), new gqn(19), new crt(4));
    }

    @Override // defpackage.zsn
    public final void e(akkt akktVar, ztq ztqVar) {
        ((zsp) ztqVar).a = i(akktVar, ztqVar.aC(), new ztt(1), new crt(6));
    }

    @Override // defpackage.zsn
    public final void f(akkt akktVar, ztq ztqVar) {
        ((zsp) ztqVar).b = i(akktVar, ztqVar.aD(), new gqn(17), new crt(3));
    }

    @Override // defpackage.zsn
    public final void g(akkt akktVar, ztq ztqVar) {
        ahbn ahbnVarAy = ztqVar.ay();
        gqn gqnVar = new gqn(18);
        zts ztsVar = new zts();
        double[] dArrC = ahbnVarAy.c();
        for (akks akksVar : akktVar.y) {
            akku akkuVarA = akku.a(akksVar.c);
            if (akkuVarA == null) {
                akkuVarA = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
            }
            int iA = zvb.a(akkuVarA);
            if (iA < dArrC.length && gqnVar.test(akksVar)) {
                dArrC[iA] = ztsVar.applyAsDouble(akksVar);
            }
        }
        int length = dArrC.length;
        ((zsp) ztqVar).c = length == 0 ? ahbn.a : new ahbn(Arrays.copyOf(dArrC, length));
    }

    @Override // defpackage.zsn
    public final ztq h() {
        return zsp.cp();
    }
}
