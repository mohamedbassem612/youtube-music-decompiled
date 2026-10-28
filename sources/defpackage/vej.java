package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class vej implements Function {
    public abstract void a(auhh auhhVar, aihf aihfVar);

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        auhh auhhVar = (auhh) obj;
        aihf aihfVarCreateBuilder = akpo.a.createBuilder();
        int i = auhhVar.c;
        if (i == 2 && atxy.d(2) == 3) {
            akpl akplVar = (akpl) vfh.d.apply(i == 2 ? (auhd) auhhVar.d : auhd.a);
            aihfVarCreateBuilder.copyOnWrite();
            akpo akpoVar = (akpo) aihfVarCreateBuilder.instance;
            akplVar.getClass();
            akpoVar.c = akplVar;
            akpoVar.b = 3;
        }
        int i2 = auhhVar.c;
        if (i2 == 4 && atxy.d(4) == 5) {
            akpn akpnVar = (akpn) vfh.b.apply(i2 == 4 ? (auhg) auhhVar.d : auhg.a);
            aihfVarCreateBuilder.copyOnWrite();
            akpo akpoVar2 = (akpo) aihfVarCreateBuilder.instance;
            akpnVar.getClass();
            akpoVar2.c = akpnVar;
            akpoVar2.b = 4;
        }
        int i3 = auhhVar.c;
        if (i3 == 5 && atxy.d(5) == 6) {
            akpm akpmVar = (akpm) vfh.c.apply(i3 == 5 ? (auhe) auhhVar.d : auhe.a);
            aihfVarCreateBuilder.copyOnWrite();
            akpo akpoVar3 = (akpo) aihfVarCreateBuilder.instance;
            akpmVar.getClass();
            akpoVar3.c = akpmVar;
            akpoVar3.b = 5;
        }
        a(auhhVar, aihfVarCreateBuilder);
        return (akpo) aihfVarCreateBuilder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
