package defpackage;

import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class ven implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        aqae aqaeVar = (aqae) obj;
        aihf aihfVarCreateBuilder = akqi.a.createBuilder();
        agkh agkhVarF = agkj.f(DesugarCollections.unmodifiableMap(aqaeVar.b).size());
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(aqaeVar.b).entrySet()) {
            agkhVarF.e((String) entry.getKey(), (akqh) vfk.a.apply((akcy) entry.getValue()));
        }
        agkj agkjVarD = agkhVarF.d(true);
        aihfVarCreateBuilder.copyOnWrite();
        akqi akqiVar = (akqi) aihfVarCreateBuilder.instance;
        aiip aiipVar = akqiVar.b;
        if (!aiipVar.b) {
            akqiVar.b = aiipVar.a();
        }
        akqiVar.b.putAll(agkjVarD);
        return (akqi) aihfVarCreateBuilder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
