package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class vep implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        augu auguVar = (augu) obj;
        aihf aihfVarCreateBuilder = akql.a.createBuilder();
        if ((auguVar.b & 1) != 0) {
            String str = auguVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            akql akqlVar = (akql) aihfVarCreateBuilder.instance;
            str.getClass();
            akqlVar.b |= 1;
            akqlVar.c = str;
        }
        if ((auguVar.b & 4) != 0) {
            Function function = vfm.a;
            aimw aimwVar = auguVar.e;
            if (aimwVar == null) {
                aimwVar = aimw.a;
            }
            akqk akqkVar = (akqk) function.apply(aimwVar);
            aihfVarCreateBuilder.copyOnWrite();
            akql akqlVar2 = (akql) aihfVarCreateBuilder.instance;
            akqkVar.getClass();
            akqlVar2.d = akqkVar;
            akqlVar2.b |= 2;
        }
        if ((auguVar.b & 8) != 0) {
            Function function2 = vfm.a;
            aimw aimwVar2 = auguVar.f;
            if (aimwVar2 == null) {
                aimwVar2 = aimw.a;
            }
            akqk akqkVar2 = (akqk) function2.apply(aimwVar2);
            aihfVarCreateBuilder.copyOnWrite();
            akql akqlVar3 = (akql) aihfVarCreateBuilder.instance;
            akqkVar2.getClass();
            akqlVar3.e = akqkVar2;
            akqlVar3.b |= 4;
        }
        if ((auguVar.b & 64) != 0) {
            agek agekVar = vfm.b;
            atzx atzxVarA = atzx.a(auguVar.i);
            if (atzxVarA == null) {
                atzxVarA = atzx.ALIGN_HORIZONTAL_UNSPECIFIED;
            }
            Object objApply = agekVar.apply(atzxVarA);
            aihfVarCreateBuilder.copyOnWrite();
            akql akqlVar4 = (akql) aihfVarCreateBuilder.instance;
            akqlVar4.f = ((arfo) objApply).e;
            akqlVar4.b |= 8;
        }
        if ((auguVar.b & 32) != 0) {
            agek agekVar2 = vfm.c;
            auir auirVarA = auir.a(auguVar.h);
            if (auirVarA == null) {
                auirVarA = auir.UNRECOGNIZED;
            }
            Object objApply2 = agekVar2.apply(auirVarA);
            aihfVarCreateBuilder.copyOnWrite();
            akql akqlVar5 = (akql) aihfVarCreateBuilder.instance;
            akqlVar5.g = ((arfq) objApply2).u;
            akqlVar5.b |= 16;
        }
        if ((auguVar.b & SemanticState.LiveRegion) != 0) {
            int iBc = a.bc(auguVar.l);
            int i = iBc != 0 ? iBc : 1;
            aihfVarCreateBuilder.copyOnWrite();
            akql akqlVar6 = (akql) aihfVarCreateBuilder.instance;
            akqlVar6.h = i - 1;
            akqlVar6.b |= 32;
        }
        if ((auguVar.b & SemanticState.ReadOnly) != 0) {
            String str2 = auguVar.m;
            aihfVarCreateBuilder.copyOnWrite();
            akql akqlVar7 = (akql) aihfVarCreateBuilder.instance;
            str2.getClass();
            akqlVar7.b |= 64;
            akqlVar7.i = str2;
        }
        return (akql) aihfVarCreateBuilder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
