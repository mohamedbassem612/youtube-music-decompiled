package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class vei implements Function {
    public abstract void a(augy augyVar, aihf aihfVar);

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        augy augyVar = (augy) obj;
        aihf aihfVarCreateBuilder = akqu.a.createBuilder();
        b(augyVar, aihfVarCreateBuilder);
        if ((augyVar.b & SemanticState.Modal) != 0) {
            agek agekVar = vfg.c;
            aimy aimyVar = augyVar.q;
            if (aimyVar == null) {
                aimyVar = aimy.a;
            }
            Object objApply = agekVar.apply(aimyVar);
            aihfVarCreateBuilder.copyOnWrite();
            akqu akquVar = (akqu) aihfVarCreateBuilder.instance;
            objApply.getClass();
            akquVar.d = (akpp) objApply;
            akquVar.b |= 4;
        }
        if ((augyVar.b & 4) != 0) {
            int i = augyVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            akqu akquVar2 = (akqu) aihfVarCreateBuilder.instance;
            akquVar2.b |= 8;
            akquVar2.e = i;
        }
        a(augyVar, aihfVarCreateBuilder);
        Iterator it = augyVar.p.iterator();
        while (it.hasNext()) {
            akpo akpoVar = (akpo) vfg.b.apply((auhh) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            akqu akquVar3 = (akqu) aihfVarCreateBuilder.instance;
            akpoVar.getClass();
            aiie aiieVar = akquVar3.g;
            if (!aiieVar.c()) {
                akquVar3.g = aihn.mutableCopy(aiieVar);
            }
            akquVar3.g.add(akpoVar);
        }
        return (akqu) aihfVarCreateBuilder.build();
    }

    public abstract void b(augy augyVar, aihf aihfVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
