package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vkb implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        augy augyVar = (augy) obj;
        int i = augyVar.c;
        if (i != 102) {
            return augyVar;
        }
        augt augtVar = i == 102 ? (augt) augyVar.d : augt.a;
        auav auavVar = augtVar.d;
        if (auavVar == null) {
            auavVar = auav.a;
        }
        aihf aihfVarCreateBuilder = aqlb.a.createBuilder();
        vju vjuVar = vjv.a;
        aimw aimwVar = auavVar.d;
        if (aimwVar == null) {
            aimwVar = aimw.a;
        }
        aqla aqlaVar = (aqla) vjuVar.b(aimwVar);
        aihfVarCreateBuilder.copyOnWrite();
        aqlb aqlbVar = (aqlb) aihfVarCreateBuilder.instance;
        aqlaVar.getClass();
        aqlbVar.c = aqlaVar;
        aqlbVar.b |= 1;
        aimw aimwVar2 = auavVar.f;
        if (aimwVar2 == null) {
            aimwVar2 = aimw.a;
        }
        aqla aqlaVar2 = (aqla) vjuVar.b(aimwVar2);
        aihfVarCreateBuilder.copyOnWrite();
        aqlb aqlbVar2 = (aqlb) aihfVarCreateBuilder.instance;
        aqlaVar2.getClass();
        aqlbVar2.d = aqlaVar2;
        aqlbVar2.b |= 2;
        aimw aimwVar3 = auavVar.f;
        if (aimwVar3 == null) {
            aimwVar3 = aimw.a;
        }
        aqla aqlaVar3 = (aqla) vjuVar.b(aimwVar3);
        aihfVarCreateBuilder.copyOnWrite();
        aqlb aqlbVar3 = (aqlb) aihfVarCreateBuilder.instance;
        aqlaVar3.getClass();
        aqlbVar3.e = aqlaVar3;
        aqlbVar3.b |= 4;
        aimw aimwVar4 = auavVar.c;
        if (aimwVar4 == null) {
            aimwVar4 = aimw.a;
        }
        aqla aqlaVar4 = (aqla) vjuVar.b(aimwVar4);
        aihfVarCreateBuilder.copyOnWrite();
        aqlb aqlbVar4 = (aqlb) aihfVarCreateBuilder.instance;
        aqlaVar4.getClass();
        aqlbVar4.f = aqlaVar4;
        aqlbVar4.b |= 8;
        aimw aimwVar5 = auavVar.e;
        if (aimwVar5 == null) {
            aimwVar5 = aimw.a;
        }
        aqla aqlaVar5 = (aqla) vjuVar.b(aimwVar5);
        aihfVarCreateBuilder.copyOnWrite();
        aqlb aqlbVar5 = (aqlb) aihfVarCreateBuilder.instance;
        aqlaVar5.getClass();
        aqlbVar5.g = aqlaVar5;
        aqlbVar5.b |= 16;
        aqlb aqlbVar6 = (aqlb) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = aqcx.a.createBuilder();
        String str = augtVar.c;
        aihfVarCreateBuilder2.copyOnWrite();
        aqcx aqcxVar = (aqcx) aihfVarCreateBuilder2.instance;
        str.getClass();
        aqcxVar.b |= 1;
        aqcxVar.c = str;
        aihfVarCreateBuilder2.copyOnWrite();
        aqcx aqcxVar2 = (aqcx) aihfVarCreateBuilder2.instance;
        aqlbVar6.getClass();
        aqcxVar2.d = aqlbVar6;
        aqcxVar2.b |= 8;
        aqcx aqcxVar3 = (aqcx) aihfVarCreateBuilder2.build();
        aihf aihfVarCreateBuilder3 = auib.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        auib auibVar = (auib) aihfVarCreateBuilder3.instance;
        aqcxVar3.getClass();
        auibVar.c = aqcxVar3;
        auibVar.b |= 4;
        auib auibVar2 = (auib) aihfVarCreateBuilder3.build();
        jrr jrrVar = (jrr) augyVar.toBuilder();
        jrrVar.copyOnWrite();
        ((augy) jrrVar.instance).p = augy.emptyProtobufList();
        jrrVar.copyOnWrite();
        augy augyVar2 = (augy) jrrVar.instance;
        if (augyVar2.c == 102) {
            augyVar2.c = 0;
            augyVar2.d = null;
        }
        aihf builder = (augyVar.c == 107 ? (auhv) augyVar.d : auhv.a).toBuilder();
        String str2 = augtVar.e;
        builder.copyOnWrite();
        auhv auhvVar = (auhv) builder.instance;
        str2.getClass();
        auhvVar.b |= 1;
        auhvVar.e = str2;
        auhv auhvVar2 = augyVar.c == 107 ? (auhv) augyVar.d : auhv.a;
        aihf builder2 = (auhvVar2.c == 2 ? (auih) auhvVar2.d : auih.a).toBuilder();
        builder2.copyOnWrite();
        auih auihVar = (auih) builder2.instance;
        auibVar2.getClass();
        auihVar.d = auibVar2;
        auihVar.c = 3;
        builder2.copyOnWrite();
        auih auihVar2 = (auih) builder2.instance;
        auihVar2.f = 2;
        auihVar2.b |= 2;
        builder.copyOnWrite();
        auhv auhvVar3 = (auhv) builder.instance;
        auih auihVar3 = (auih) builder2.build();
        auihVar3.getClass();
        auhvVar3.d = auihVar3;
        auhvVar3.c = 2;
        jrrVar.copyOnWrite();
        augy augyVar3 = (augy) jrrVar.instance;
        auhv auhvVar4 = (auhv) builder.build();
        auhvVar4.getClass();
        augyVar3.d = auhvVar4;
        augyVar3.c = 107;
        return (augy) jrrVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
