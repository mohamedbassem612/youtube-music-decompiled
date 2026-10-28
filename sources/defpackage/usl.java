package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class usl implements aqk {
    public final /* synthetic */ aufd a;
    public final /* synthetic */ vab b;
    public final /* synthetic */ qvm c;
    public final /* synthetic */ Executor d;

    public /* synthetic */ usl(aufd aufdVar, vab vabVar, qvm qvmVar, Executor executor) {
        this.a = aufdVar;
        this.b = vabVar;
        this.c = qvmVar;
        this.d = executor;
    }

    @Override // defpackage.aqk
    public final Object a(aqi aqiVar) {
        aufd aufdVar = this.a;
        apsr apsrVar = aufdVar.g;
        if (apsrVar == null) {
            apsrVar = apsr.a;
        }
        apse apseVar = apsrVar.b == 4 ? (apse) apsrVar.c : apse.a;
        Executor executor = this.d;
        qvm qvmVar = this.c;
        vab vabVar = this.b;
        String str = apseVar.c;
        AtomicReference atomicReference = new AtomicReference();
        atomicReference.set(vabVar.a().x(new hhw(str, 19)).az().al(new usm(str, aufdVar, qvmVar, aqiVar, 0), new usn(aqiVar, 0)));
        aqiVar.a(new ull(atomicReference, 10), executor);
        return "effectsProvider.getAppliedEffectInfosFlowable()";
    }
}
