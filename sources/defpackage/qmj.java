package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qmj {
    private volatile qme a;
    private qmi b;

    public qmj(qme qmeVar) {
        this.a = qmeVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final qmi a(final qkh qkhVar) {
        final qme qmeVar = this.a;
        qme qmeVar2 = qmi.a;
        if (qmeVar != qmeVar2) {
            Context context = qkhVar.c;
            ruk rukVar = qmi.i;
            final boolean[] zArr = new boolean[1];
            omj omjVar = (omj) ConcurrentMap.EL.computeIfAbsent(rukVar.a, qmeVar.a(context), new Function() { // from class: qmh
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public final /* synthetic */ Function mo840andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    qkh qkhVar2 = qkhVar;
                    qme qmeVar3 = qmeVar;
                    qmi qmiVar = new qmi(qkhVar2, qmeVar3);
                    boolean z = qmeVar3.c;
                    omj omjVar2 = new omj(qmiVar);
                    zArr[0] = true;
                    return omjVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (zArr[0]) {
                qnf qnfVar = qkhVar.f;
                boolean z = qmeVar.a;
                ahnm ahnmVar = ahnm.FILE;
                if (qke.d()) {
                    qmx.a(context, null, new hhc(rukVar));
                } else if (z) {
                    qlg qlgVarB = qnfVar.b();
                    if (qlgVarB.e && new aihx(qlgVarB.i, qlg.a).contains(ahnmVar) && qlgVarB.n) {
                        qmx.a(context, null, new hhc(rukVar));
                    } else {
                        qmx.a(context, new hhc(rukVar), new hhc(rukVar));
                    }
                } else {
                    qlf qlfVarA = qnfVar.a();
                    if (qlfVarA.e && new aihx(qlfVarA.j, qlf.a).contains(ahnmVar) && qlfVarA.o) {
                        qmx.a(context, null, new hhc(rukVar));
                    } else {
                        qmx.a(context, new hhc(rukVar), new hhc(rukVar));
                    }
                }
                boolean z2 = qmeVar.c;
            }
            this.b = (qmi) omjVar.a;
            this.a = qmeVar2;
        }
        return this.b;
    }
}
