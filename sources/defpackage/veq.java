package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class veq implements Function {
    public abstract void a(auhb auhbVar, aihf aihfVar);

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        auhb auhbVar = (auhb) obj;
        aihf aihfVarCreateBuilder = akql.a.createBuilder();
        if ((auhbVar.b & 2) != 0) {
            b(auhbVar, aihfVarCreateBuilder);
        }
        if ((auhbVar.b & 32) != 0) {
            agek agekVar = vfn.a;
            atzx atzxVarA = atzx.a(auhbVar.h);
            if (atzxVarA == null) {
                atzxVarA = atzx.ALIGN_HORIZONTAL_UNSPECIFIED;
            }
            Object objApply = agekVar.apply(atzxVarA);
            aihfVarCreateBuilder.copyOnWrite();
            akql akqlVar = (akql) aihfVarCreateBuilder.instance;
            akqlVar.f = ((arfo) objApply).e;
            akqlVar.b |= 8;
        }
        if ((auhbVar.b & 16) != 0) {
            c(auhbVar, aihfVarCreateBuilder);
        }
        a(auhbVar, aihfVarCreateBuilder);
        if ((auhbVar.b & 64) != 0) {
            float f = auhbVar.i;
            aihfVarCreateBuilder.copyOnWrite();
            akql akqlVar2 = (akql) aihfVarCreateBuilder.instance;
            akqlVar2.b |= 32768;
            akqlVar2.l = f;
        }
        return (akql) aihfVarCreateBuilder.build();
    }

    public abstract void b(auhb auhbVar, aihf aihfVar);

    public abstract void c(auhb auhbVar, aihf aihfVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
