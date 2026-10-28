package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class ved implements Function {
    private final /* synthetic */ int $cid;

    public ved(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                ajwe ajweVar = (ajwe) obj;
                aihf aihfVarCreateBuilder = aqla.a.createBuilder();
                double d = ajweVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                aqla aqlaVar = (aqla) aihfVarCreateBuilder.instance;
                aqlaVar.b |= 1;
                aqlaVar.c = d;
                double d2 = ajweVar.d;
                aihfVarCreateBuilder.copyOnWrite();
                aqla aqlaVar2 = (aqla) aihfVarCreateBuilder.instance;
                aqlaVar2.b |= 2;
                aqlaVar2.d = d2;
                double d3 = ajweVar.e;
                aihfVarCreateBuilder.copyOnWrite();
                aqla aqlaVar3 = (aqla) aihfVarCreateBuilder.instance;
                aqlaVar3.b |= 4;
                aqlaVar3.e = d3;
                double d4 = ajweVar.f;
                aihfVarCreateBuilder.copyOnWrite();
                aqla aqlaVar4 = (aqla) aihfVarCreateBuilder.instance;
                aqlaVar4.b |= 8;
                aqlaVar4.f = d4;
                return (aqla) aihfVarCreateBuilder.build();
            case 1:
                auhd auhdVar = (auhd) obj;
                aihf aihfVarCreateBuilder2 = akpl.a.createBuilder();
                if ((auhdVar.b & 1) != 0) {
                    String str = auhdVar.c;
                    aihfVarCreateBuilder2.copyOnWrite();
                    akpl akplVar = (akpl) aihfVarCreateBuilder2.instance;
                    str.getClass();
                    akplVar.b |= 1;
                    akplVar.c = str;
                }
                return (akpl) aihfVarCreateBuilder2.build();
            case 2:
                auih auihVar = (auih) obj;
                aihf aihfVarCreateBuilder3 = akpu.a.createBuilder();
                aigj aigjVar = (auihVar.c == 10 ? (auhx) auihVar.d : auhx.a).c;
                aihfVarCreateBuilder3.copyOnWrite();
                akpu akpuVar = (akpu) aihfVarCreateBuilder3.instance;
                aigjVar.getClass();
                akpuVar.b |= 2;
                akpuVar.c = aigjVar;
                return (akpu) aihfVarCreateBuilder3.build();
            case 3:
                augs augsVar = (augs) obj;
                aihf aihfVarCreateBuilder4 = akpv.a.createBuilder();
                if ((augsVar.b & 1) != 0) {
                    String str2 = augsVar.c;
                    aihfVarCreateBuilder4.copyOnWrite();
                    akpv akpvVar = (akpv) aihfVarCreateBuilder4.instance;
                    str2.getClass();
                    akpvVar.b |= 1;
                    akpvVar.c = str2;
                }
                return (akpv) aihfVarCreateBuilder4.build();
            case 4:
                auih auihVar2 = (auih) obj;
                aihf aihfVarCreateBuilder5 = akpz.a.createBuilder();
                if (((auihVar2.c == 4 ? (auhz) auihVar2.d : auhz.a).b & 1) != 0) {
                    String str3 = (auihVar2.c == 4 ? (auhz) auihVar2.d : auhz.a).c;
                    aihfVarCreateBuilder5.copyOnWrite();
                    akpz akpzVar = (akpz) aihfVarCreateBuilder5.instance;
                    str3.getClass();
                    akpzVar.b |= 1;
                    akpzVar.c = str3;
                }
                Iterable iterable = (Iterable) Collection.EL.stream((auihVar2.c == 4 ? (auhz) auihVar2.d : auhz.a).d).map(new ush(15)).collect(aghu.a);
                aihfVarCreateBuilder5.copyOnWrite();
                akpz akpzVar2 = (akpz) aihfVarCreateBuilder5.instance;
                aiie aiieVar = akpzVar2.d;
                if (!aiieVar.c()) {
                    akpzVar2.d = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(iterable, akpzVar2.d);
                aihf aihfVarCreateBuilder6 = akpy.a.createBuilder();
                int i = auihVar2.c;
                if (((i == 4 ? (auhz) auihVar2.d : auhz.a).b & 4) != 0) {
                    aqlb aqlbVar = (i == 4 ? (auhz) auihVar2.d : auhz.a).f;
                    if (aqlbVar == null) {
                        aqlbVar = aqlb.a;
                    }
                    aihfVarCreateBuilder6.copyOnWrite();
                    akpy akpyVar = (akpy) aihfVarCreateBuilder6.instance;
                    aqlbVar.getClass();
                    akpyVar.c = aqlbVar;
                    akpyVar.b |= 1;
                }
                agek agekVar = vfo.a;
                auie auieVar = (auihVar2.c == 4 ? (auhz) auihVar2.d : auhz.a).e;
                if (auieVar == null) {
                    auieVar = auie.a;
                }
                Object objApply = agekVar.apply(auieVar);
                objApply.getClass();
                aihfVarCreateBuilder6.copyOnWrite();
                akpy akpyVar2 = (akpy) aihfVarCreateBuilder6.instance;
                akpyVar2.d = (akqt) objApply;
                akpyVar2.b |= 2;
                aihfVarCreateBuilder5.copyOnWrite();
                akpz akpzVar3 = (akpz) aihfVarCreateBuilder5.instance;
                akpy akpyVar3 = (akpy) aihfVarCreateBuilder6.build();
                akpyVar3.getClass();
                akpzVar3.e = akpyVar3;
                akpzVar3.b |= 2;
                return (akpz) aihfVarCreateBuilder5.build();
            case 5:
                auih auihVar3 = (auih) obj;
                aihf aihfVarCreateBuilder7 = akqb.a.createBuilder();
                if (auihVar3.c == 8) {
                    aihfVarCreateBuilder7.copyOnWrite();
                    akqb akqbVar = (akqb) aihfVarCreateBuilder7.instance;
                    akqbVar.b |= 1;
                    akqbVar.c = true;
                }
                if (auihVar3.c == 8) {
                    aihf aihfVarCreateBuilder8 = akqa.a.createBuilder();
                    agek agekVar2 = vfo.a;
                    auie auieVar2 = (auihVar3.c == 8 ? (auia) auihVar3.d : auia.a).b;
                    if (auieVar2 == null) {
                        auieVar2 = auie.a;
                    }
                    Object objApply2 = agekVar2.apply(auieVar2);
                    objApply2.getClass();
                    aihfVarCreateBuilder8.copyOnWrite();
                    akqa akqaVar = (akqa) aihfVarCreateBuilder8.instance;
                    akqaVar.c = (akqt) objApply2;
                    akqaVar.b |= 1;
                    aihfVarCreateBuilder7.copyOnWrite();
                    akqb akqbVar2 = (akqb) aihfVarCreateBuilder7.instance;
                    akqa akqaVar2 = (akqa) aihfVarCreateBuilder8.build();
                    akqaVar2.getClass();
                    akqbVar2.d = akqaVar2;
                    akqbVar2.b |= 2;
                }
                return (akqb) aihfVarCreateBuilder7.build();
            case 6:
                auhe auheVar = (auhe) obj;
                aihf aihfVarCreateBuilder9 = akpm.a.createBuilder();
                if ((auheVar.b & 1) != 0) {
                    String str4 = auheVar.c;
                    aihfVarCreateBuilder9.copyOnWrite();
                    akpm akpmVar = (akpm) aihfVarCreateBuilder9.instance;
                    str4.getClass();
                    akpmVar.b |= 1;
                    akpmVar.c = str4;
                }
                return (akpm) aihfVarCreateBuilder9.build();
            case 7:
                auih auihVar4 = (auih) obj;
                aihf aihfVarCreateBuilder10 = akqg.a.createBuilder();
                if (((auihVar4.c == 5 ? (auid) auihVar4.d : auid.a).b & 1) != 0) {
                    String str5 = (auihVar4.c == 5 ? (auid) auihVar4.d : auid.a).c;
                    aihfVarCreateBuilder10.copyOnWrite();
                    akqg akqgVar = (akqg) aihfVarCreateBuilder10.instance;
                    str5.getClass();
                    akqgVar.b |= 1;
                    akqgVar.c = str5;
                }
                Iterable iterable2 = (Iterable) Collection.EL.stream((auihVar4.c == 5 ? (auid) auihVar4.d : auid.a).d).map(new ush(16)).collect(aghu.a);
                aihfVarCreateBuilder10.copyOnWrite();
                akqg akqgVar2 = (akqg) aihfVarCreateBuilder10.instance;
                aiie aiieVar2 = akqgVar2.d;
                if (!aiieVar2.c()) {
                    akqgVar2.d = aihn.mutableCopy(aiieVar2);
                }
                aifs.addAll(iterable2, akqgVar2.d);
                aihf aihfVarCreateBuilder11 = akqf.a.createBuilder();
                int i2 = auihVar4.c;
                if (((i2 == 5 ? (auid) auihVar4.d : auid.a).b & 4) != 0) {
                    aqlb aqlbVar2 = (i2 == 5 ? (auid) auihVar4.d : auid.a).f;
                    if (aqlbVar2 == null) {
                        aqlbVar2 = aqlb.a;
                    }
                    aihfVarCreateBuilder11.copyOnWrite();
                    akqf akqfVar = (akqf) aihfVarCreateBuilder11.instance;
                    aqlbVar2.getClass();
                    akqfVar.c = aqlbVar2;
                    akqfVar.b |= 1;
                }
                agek agekVar3 = vfo.a;
                auie auieVar3 = (auihVar4.c == 5 ? (auid) auihVar4.d : auid.a).e;
                if (auieVar3 == null) {
                    auieVar3 = auie.a;
                }
                Object objApply3 = agekVar3.apply(auieVar3);
                objApply3.getClass();
                aihfVarCreateBuilder11.copyOnWrite();
                akqf akqfVar2 = (akqf) aihfVarCreateBuilder11.instance;
                akqfVar2.d = (akqt) objApply3;
                akqfVar2.b |= 2;
                aihfVarCreateBuilder10.copyOnWrite();
                akqg akqgVar3 = (akqg) aihfVarCreateBuilder10.instance;
                akqf akqfVar3 = (akqf) aihfVarCreateBuilder11.build();
                akqfVar3.getClass();
                akqgVar3.e = akqfVar3;
                akqgVar3.b |= 2;
                return (akqg) aihfVarCreateBuilder10.build();
            case 8:
                aimw aimwVar = (aimw) obj;
                aihf aihfVarCreateBuilder12 = akqk.a.createBuilder();
                if ((aimwVar.b & 1) != 0) {
                    double d5 = aimwVar.c;
                    aihfVarCreateBuilder12.copyOnWrite();
                    akqk akqkVar = (akqk) aihfVarCreateBuilder12.instance;
                    akqkVar.b |= 1;
                    akqkVar.c = d5;
                }
                if ((aimwVar.b & 2) != 0) {
                    double d6 = aimwVar.d;
                    aihfVarCreateBuilder12.copyOnWrite();
                    akqk akqkVar2 = (akqk) aihfVarCreateBuilder12.instance;
                    akqkVar2.b |= 2;
                    akqkVar2.d = d6;
                }
                if ((aimwVar.b & 4) != 0) {
                    double d7 = aimwVar.e;
                    aihfVarCreateBuilder12.copyOnWrite();
                    akqk akqkVar3 = (akqk) aihfVarCreateBuilder12.instance;
                    akqkVar3.b |= 4;
                    akqkVar3.e = d7;
                }
                if ((aimwVar.b & 8) != 0) {
                    double d8 = aimwVar.f;
                    aihfVarCreateBuilder12.copyOnWrite();
                    akqk akqkVar4 = (akqk) aihfVarCreateBuilder12.instance;
                    akqkVar4.b |= 8;
                    akqkVar4.f = d8;
                }
                return (akqk) aihfVarCreateBuilder12.build();
            case 9:
                augv augvVar = (augv) obj;
                aihf aihfVarCreateBuilder13 = akqm.a.createBuilder();
                if ((augvVar.b & 2) != 0) {
                    String str6 = augvVar.d;
                    aihfVarCreateBuilder13.copyOnWrite();
                    akqm akqmVar = (akqm) aihfVarCreateBuilder13.instance;
                    str6.getClass();
                    akqmVar.b |= 1;
                    akqmVar.c = str6;
                }
                if ((augvVar.b & 1) != 0) {
                    String str7 = augvVar.c;
                    aihfVarCreateBuilder13.copyOnWrite();
                    akqm akqmVar2 = (akqm) aihfVarCreateBuilder13.instance;
                    str7.getClass();
                    akqmVar2.b |= 2;
                    akqmVar2.d = str7;
                }
                return (akqm) aihfVarCreateBuilder13.build();
            case 10:
                auih auihVar5 = (auih) obj;
                aihf aihfVarCreateBuilder14 = akqn.a.createBuilder();
                int iBt = a.bt((auihVar5.c == 9 ? (auif) auihVar5.d : auif.a).b);
                if (iBt == 0) {
                    iBt = 1;
                }
                aihfVarCreateBuilder14.copyOnWrite();
                akqn akqnVar = (akqn) aihfVarCreateBuilder14.instance;
                akqnVar.c = iBt - 1;
                akqnVar.b |= 1;
                aqlb aqlbVar3 = (auihVar5.c == 9 ? (auif) auihVar5.d : auif.a).c;
                if (aqlbVar3 == null) {
                    aqlbVar3 = aqlb.a;
                }
                aihfVarCreateBuilder14.copyOnWrite();
                akqn akqnVar2 = (akqn) aihfVarCreateBuilder14.instance;
                aqlbVar3.getClass();
                akqnVar2.d = aqlbVar3;
                akqnVar2.b |= 2;
                return (akqn) aihfVarCreateBuilder14.build();
            case 11:
                auhg auhgVar = (auhg) obj;
                aihf aihfVarCreateBuilder15 = akpn.a.createBuilder();
                if ((auhgVar.b & 1) != 0) {
                    String str8 = auhgVar.c;
                    aihfVarCreateBuilder15.copyOnWrite();
                    akpn akpnVar = (akpn) aihfVarCreateBuilder15.instance;
                    str8.getClass();
                    akpnVar.b |= 1;
                    akpnVar.c = str8;
                }
                return (akpn) aihfVarCreateBuilder15.build();
            case 12:
                auih auihVar6 = (auih) obj;
                aihf aihfVarCreateBuilder16 = akqq.a.createBuilder();
                ameh amehVar = auihVar6.e;
                if (amehVar == null) {
                    amehVar = ameh.a;
                }
                apji apjiVar = amehVar.e;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(arfi.b);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                arfi arfiVar = (arfi) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                arff arffVar = arfiVar.c;
                if (arffVar == null) {
                    arffVar = arff.a;
                }
                if ((arffVar.b & 2) != 0) {
                    arff arffVar2 = arfiVar.c;
                    if (arffVar2 == null) {
                        arffVar2 = arff.a;
                    }
                    String str9 = arffVar2.c;
                    aihfVarCreateBuilder16.copyOnWrite();
                    akqq akqqVar = (akqq) aihfVarCreateBuilder16.instance;
                    str9.getClass();
                    akqqVar.b |= 1;
                    akqqVar.c = str9;
                }
                String str10 = (auihVar6.c == 1 ? (auig) auihVar6.d : auig.a).d;
                aihfVarCreateBuilder16.copyOnWrite();
                akqq akqqVar2 = (akqq) aihfVarCreateBuilder16.instance;
                str10.getClass();
                akqqVar2.b |= 2;
                akqqVar2.d = str10;
                if (((auihVar6.c == 1 ? (auig) auihVar6.d : auig.a).b & 4) != 0) {
                    aihf aihfVarCreateBuilder17 = akqp.a.createBuilder();
                    aqlb aqlbVar4 = (auihVar6.c == 1 ? (auig) auihVar6.d : auig.a).c;
                    if (aqlbVar4 == null) {
                        aqlbVar4 = aqlb.a;
                    }
                    aihfVarCreateBuilder17.copyOnWrite();
                    akqp akqpVar = (akqp) aihfVarCreateBuilder17.instance;
                    aqlbVar4.getClass();
                    akqpVar.c = aqlbVar4;
                    akqpVar.b |= 1;
                    agek agekVar4 = vfo.a;
                    auie auieVar4 = (auihVar6.c == 1 ? (auig) auihVar6.d : auig.a).e;
                    if (auieVar4 == null) {
                        auieVar4 = auie.a;
                    }
                    Object objApply4 = agekVar4.apply(auieVar4);
                    objApply4.getClass();
                    aihfVarCreateBuilder17.copyOnWrite();
                    akqp akqpVar2 = (akqp) aihfVarCreateBuilder17.instance;
                    akqpVar2.d = (akqt) objApply4;
                    akqpVar2.b |= 4;
                    aihfVarCreateBuilder16.copyOnWrite();
                    akqq akqqVar3 = (akqq) aihfVarCreateBuilder16.instance;
                    akqp akqpVar3 = (akqp) aihfVarCreateBuilder17.build();
                    akqpVar3.getClass();
                    akqqVar3.e = akqpVar3;
                    akqqVar3.b |= 4;
                }
                return (akqq) aihfVarCreateBuilder16.build();
            default:
                augq augqVar = (augq) obj;
                switch (augqVar.ordinal()) {
                    case 0:
                    case 1:
                    case 3:
                        return arfp.COMMENT_SOURCE_UNSPECIFIED;
                    case 2:
                        return arfp.COMMENT_SOURCE_VOD_COMMENTS;
                    case 4:
                        return arfp.COMMENT_SOURCE_SHORT_COMMENTS;
                    case 5:
                        return arfp.COMMENT_SOURCE_COMMENTS_PICKER_CAMERA_SUGGESTED;
                    case 6:
                        return arfp.COMMENT_SOURCE_COMMENTS_PICKER_CAMERA_SAVED;
                    default:
                        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(augqVar))));
                }
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
