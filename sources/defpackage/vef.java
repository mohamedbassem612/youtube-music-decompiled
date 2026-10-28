package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class vef implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        akcy akcyVar = (akcy) obj;
        aihf aihfVarCreateBuilder = akqh.a.createBuilder();
        if (akcyVar.b == 1 && a.bt(1) == 2) {
            String str = akcyVar.b == 1 ? (String) akcyVar.c : "";
            aihfVarCreateBuilder.copyOnWrite();
            akqh akqhVar = (akqh) aihfVarCreateBuilder.instance;
            str.getClass();
            akqhVar.b = 1;
            akqhVar.c = str;
        }
        if (akcyVar.b == 2 && a.bt(2) == 3) {
            double dDoubleValue = akcyVar.b == 2 ? ((Double) akcyVar.c).doubleValue() : 0.0d;
            aihfVarCreateBuilder.copyOnWrite();
            akqh akqhVar2 = (akqh) aihfVarCreateBuilder.instance;
            akqhVar2.b = 2;
            akqhVar2.c = Double.valueOf(dDoubleValue);
        }
        if (akcyVar.b == 3 && a.bt(3) == 4) {
            long jLongValue = akcyVar.b == 3 ? ((Long) akcyVar.c).longValue() : 0L;
            aihfVarCreateBuilder.copyOnWrite();
            akqh akqhVar3 = (akqh) aihfVarCreateBuilder.instance;
            akqhVar3.b = 3;
            akqhVar3.c = Long.valueOf(jLongValue);
        }
        if (akcyVar.b == 4 && a.bt(4) == 5) {
            boolean zBooleanValue = akcyVar.b == 4 ? ((Boolean) akcyVar.c).booleanValue() : false;
            aihfVarCreateBuilder.copyOnWrite();
            akqh akqhVar4 = (akqh) aihfVarCreateBuilder.instance;
            akqhVar4.b = 4;
            akqhVar4.c = Boolean.valueOf(zBooleanValue);
        }
        if (akcyVar.b == 5 && a.bt(5) == 6) {
            aqla aqlaVar = (aqla) vfd.a.apply(akcyVar.b == 5 ? (ajwe) akcyVar.c : ajwe.a);
            aihfVarCreateBuilder.copyOnWrite();
            akqh akqhVar5 = (akqh) aihfVarCreateBuilder.instance;
            aqlaVar.getClass();
            akqhVar5.c = aqlaVar;
            akqhVar5.b = 5;
        }
        return (akqh) aihfVarCreateBuilder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
