package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class vel implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        augt augtVar = (augt) obj;
        aihf aihfVarCreateBuilder = akqd.a.createBuilder();
        if ((augtVar.b & 1) != 0) {
            String str = augtVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            akqd akqdVar = (akqd) aihfVarCreateBuilder.instance;
            str.getClass();
            akqdVar.b |= 1;
            akqdVar.c = str;
        }
        if ((augtVar.b & 2) != 0) {
            agek agekVar = vfj.a;
            auav auavVar = augtVar.d;
            if (auavVar == null) {
                auavVar = auav.a;
            }
            Object objApply = agekVar.apply(auavVar);
            aihfVarCreateBuilder.copyOnWrite();
            akqd akqdVar2 = (akqd) aihfVarCreateBuilder.instance;
            objApply.getClass();
            akqdVar2.d = (akqc) objApply;
            akqdVar2.b |= 2;
        }
        return (akqd) aihfVarCreateBuilder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
