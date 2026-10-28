package defpackage;

import com.google.android.libraries.blocks.StatusException;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aalc implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aalc(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        switch (this.$cid) {
            case 0:
                Optional optional = (Optional) obj;
                return true == optional.isPresent() ? Optional.ofNullable(((aret) optional.get()).d()) : optional;
            case 1:
                return ((avmc) obj).g();
            case 2:
                return (agkj) Collection.EL.stream((agkz) obj).collect(aghu.a(new aakc(6), Function$CC.identity()));
            case 3:
                return agev.i((aaro) obj);
            case 4:
                return (aaww) ((Optional) obj).get();
            case 5:
                return Integer.valueOf(((aazn) obj).a);
            case 6:
                yvu yvuVar = (yvu) obj;
                aihf aihfVarCreateBuilder = asga.a.createBuilder();
                int i = 12;
                agke agkeVar = (agke) DesugarArrays.stream(yvuVar.h).map(new aalr(i)).collect(aghu.a);
                aihfVarCreateBuilder.copyOnWrite();
                asga asgaVar = (asga) aihfVarCreateBuilder.instance;
                aiie aiieVar = asgaVar.c;
                if (!aiieVar.c()) {
                    asgaVar.c = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(agkeVar, asgaVar.c);
                wgs wgsVar = yvuVar.f;
                if (wgsVar != null) {
                    Optional optionalFindFirst = Collection.EL.stream(agkeVar).filter(new aajl(wgsVar, 11)).findFirst();
                    aihfVarCreateBuilder.getClass();
                    yyk yykVar = new yyk(aihfVarCreateBuilder, i);
                    if (true == optionalFindFirst.isPresent()) {
                        Object obj2 = optionalFindFirst.get();
                        aihf aihfVar = (aihf) yykVar.a;
                        aihfVar.copyOnWrite();
                        asga asgaVar2 = (asga) aihfVar.instance;
                        asgaVar2.d = (ajhl) obj2;
                        asgaVar2.b |= 1;
                    }
                }
                return (asga) aihfVarCreateBuilder.build();
            case 7:
                alvl alvlVar = (alvl) obj;
                aihf aihfVarCreateBuilder2 = asgx.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                asgx asgxVar = (asgx) aihfVarCreateBuilder2.instance;
                alvlVar.getClass();
                asgxVar.c = alvlVar;
                asgxVar.b |= 1;
                return (asgx) aihfVarCreateBuilder2.build();
            case 8:
                acca accaVar = ((aazb) obj).b;
                if (accaVar == null) {
                    return asge.a;
                }
                aihf aihfVarCreateBuilder3 = ajoj.a.createBuilder();
                String string = typ.b(accaVar.p).toString();
                aihfVarCreateBuilder3.copyOnWrite();
                ajoj ajojVar = (ajoj) aihfVarCreateBuilder3.instance;
                string.getClass();
                ajojVar.b |= 1;
                ajojVar.c = string;
                aihfVarCreateBuilder3.copyOnWrite();
                ajoj ajojVar2 = (ajoj) aihfVarCreateBuilder3.instance;
                String str = accaVar.a;
                str.getClass();
                ajojVar2.b |= 4;
                ajojVar2.e = str;
                aihfVarCreateBuilder3.copyOnWrite();
                ajoj ajojVar3 = (ajoj) aihfVarCreateBuilder3.instance;
                String str2 = accaVar.k;
                str2.getClass();
                ajojVar3.b |= 2;
                ajojVar3.d = str2;
                ajoj ajojVar4 = (ajoj) aihfVarCreateBuilder3.build();
                aihf aihfVarCreateBuilder4 = asge.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                asge asgeVar = (asge) aihfVarCreateBuilder4.instance;
                ajojVar4.getClass();
                asgeVar.c = ajojVar4;
                asgeVar.b |= 1;
                return (asge) aihfVarCreateBuilder4.build();
            case 9:
                int i2 = ((aazn) obj).a;
                aihf aihfVarCreateBuilder5 = ashf.a.createBuilder();
                int iL = aajg.l(i2);
                aihfVarCreateBuilder5.copyOnWrite();
                ashf ashfVar = (ashf) aihfVarCreateBuilder5.instance;
                ashfVar.c = iL - 1;
                ashfVar.b |= 1;
                return (ashf) aihfVarCreateBuilder5.build();
            case 10:
                aaxh aaxhVar = (aaxh) obj;
                aihf aihfVarCreateBuilder6 = ashd.a.createBuilder();
                Float f = aaxhVar.d;
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    aihfVarCreateBuilder6.copyOnWrite();
                    ashd ashdVar = (ashd) aihfVarCreateBuilder6.instance;
                    ashdVar.b |= 2;
                    ashdVar.d = fFloatValue;
                }
                aihf aihfVarCreateBuilder7 = asfw.a.createBuilder();
                aihf aihfVarCreateBuilder8 = asfx.a.createBuilder();
                float f2 = aaxhVar.c;
                aihfVarCreateBuilder8.copyOnWrite();
                asfx asfxVar = (asfx) aihfVarCreateBuilder8.instance;
                asfxVar.b |= 1;
                asfxVar.c = f2;
                aihfVarCreateBuilder8.copyOnWrite();
                asfx asfxVar2 = (asfx) aihfVarCreateBuilder8.instance;
                ashd ashdVar2 = (ashd) aihfVarCreateBuilder6.build();
                ashdVar2.getClass();
                asfxVar2.d = ashdVar2;
                asfxVar2.b |= 2;
                aihfVarCreateBuilder7.copyOnWrite();
                asfw asfwVar = (asfw) aihfVarCreateBuilder7.instance;
                asfx asfxVar3 = (asfx) aihfVarCreateBuilder8.build();
                asfxVar3.getClass();
                asfwVar.c = asfxVar3;
                asfwVar.b |= 1;
                return (asfw) aihfVarCreateBuilder7.build();
            case 11:
                aazk aazkVar = (aazk) obj;
                if (aazkVar == null) {
                    return asgk.a;
                }
                aihf aihfVarCreateBuilder9 = asgk.a.createBuilder();
                aihfVarCreateBuilder9.copyOnWrite();
                asgk asgkVar = (asgk) aihfVarCreateBuilder9.instance;
                asgkVar.b |= 1;
                asgkVar.c = aazkVar.a;
                return (asgk) aihfVarCreateBuilder9.build();
            case 12:
                aihf aihfVarCreateBuilder10 = ashc.a.createBuilder();
                float f3 = ((aaxh) obj).c;
                aihfVarCreateBuilder10.copyOnWrite();
                ashc ashcVar = (ashc) aihfVarCreateBuilder10.instance;
                ashcVar.b |= 1;
                ashcVar.c = f3;
                return (ashc) aihfVarCreateBuilder10.build();
            case 13:
                return ((aaxo) obj).a;
            case 14:
                abnr abnrVar = (abnr) obj;
                ashl ashlVar = (ashl) abab.a.get(abnrVar);
                if (ashlVar == null) {
                    throw new StatusException(ahxw.UNIMPLEMENTED, "Unable to map native visibility state: ".concat(String.valueOf(String.valueOf(abnrVar))));
                }
                aihf aihfVarCreateBuilder11 = ashm.a.createBuilder();
                aihfVarCreateBuilder11.copyOnWrite();
                ashm ashmVar = (ashm) aihfVarCreateBuilder11.instance;
                ashmVar.c = ashlVar.l;
                ashmVar.b |= 1;
                return (ashm) aihfVarCreateBuilder11.build();
            case 15:
                return Boolean.valueOf(((atpu) obj).d);
            case 16:
                return aawb.u(((aazq) obj).b);
            case 17:
                return ((acip) obj).an();
            case 18:
                return Boolean.valueOf((((atpu) obj).b & 4) != 0);
            case 19:
                return (Boolean) ((Optional) obj).get();
            default:
                return Boolean.valueOf(((atpu) obj).e);
        }
    }
}
