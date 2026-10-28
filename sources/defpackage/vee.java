package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class vee implements Function {
    public abstract void a(augr augrVar, aihf aihfVar);

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        augr augrVar = (augr) obj;
        aihf aihfVarCreateBuilder = akpt.a.createBuilder();
        a(augrVar, aihfVarCreateBuilder);
        if ((augrVar.b & SemanticState.Focused) != 0) {
            String str = augrVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            akpt akptVar = (akpt) aihfVarCreateBuilder.instance;
            str.getClass();
            akptVar.b |= 2;
            akptVar.d = str;
        }
        if ((augrVar.b & SemanticState.Hidden) != 0) {
            String str2 = augrVar.h;
            aihfVarCreateBuilder.copyOnWrite();
            akpt akptVar2 = (akpt) aihfVarCreateBuilder.instance;
            str2.getClass();
            akptVar2.b |= 4;
            akptVar2.e = str2;
        }
        if ((augrVar.b & SemanticState.Modal) != 0) {
            boolean z = augrVar.j;
            aihfVarCreateBuilder.copyOnWrite();
            akpt akptVar3 = (akpt) aihfVarCreateBuilder.instance;
            akptVar3.b |= 8;
            akptVar3.f = z;
        }
        if ((augrVar.b & SemanticState.Obscured) != 0) {
            boolean z2 = augrVar.k;
            aihfVarCreateBuilder.copyOnWrite();
            akpt akptVar4 = (akpt) aihfVarCreateBuilder.instance;
            akptVar4.b |= 16;
            akptVar4.g = z2;
        }
        b(augrVar, aihfVarCreateBuilder);
        return (akpt) aihfVarCreateBuilder.build();
    }

    public abstract void b(augr augrVar, aihf aihfVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
