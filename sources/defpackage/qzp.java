package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qzp implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ qzp(int i) {
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
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 0;
        int i2 = 3;
        int i3 = 4;
        int i4 = 2;
        int i5 = 1;
        switch (this.$cid) {
            case 0:
                return (qvk) ((qvc) obj);
            case 1:
                Cloneable cloneable = (qvk) obj;
                boolean z = cloneable instanceof qyw;
                int i6 = qzj.b;
                return z ? Collection.EL.stream(((qyw) cloneable).k()) : Stream.CC.empty();
            case 2:
                return ((qvk) obj).a;
            case 3:
                rab rabVar = (rab) obj;
                int i7 = rac.b;
                aihf aihfVarCreateBuilder = atty.a.createBuilder();
                String str = rabVar.a;
                aihfVarCreateBuilder.copyOnWrite();
                atty attyVar = (atty) aihfVarCreateBuilder.instance;
                attyVar.b |= 1;
                attyVar.e = str;
                aihf aihfVarCreateBuilder2 = attp.a.createBuilder();
                float f = rabVar.b;
                aihfVarCreateBuilder2.copyOnWrite();
                attp attpVar = (attp) aihfVarCreateBuilder2.instance;
                attpVar.b |= 1;
                attpVar.c = f;
                float f2 = rabVar.c;
                aihfVarCreateBuilder2.copyOnWrite();
                attp attpVar2 = (attp) aihfVarCreateBuilder2.instance;
                attpVar2.b |= 2;
                attpVar2.d = f2;
                float f3 = rabVar.d;
                aihfVarCreateBuilder2.copyOnWrite();
                attp attpVar3 = (attp) aihfVarCreateBuilder2.instance;
                attpVar3.b |= 4;
                attpVar3.e = f3;
                aihfVarCreateBuilder.copyOnWrite();
                atty attyVar2 = (atty) aihfVarCreateBuilder.instance;
                attp attpVar4 = (attp) aihfVarCreateBuilder2.build();
                attpVar4.getClass();
                attyVar2.d = attpVar4;
                attyVar2.c = 3;
                return (atty) aihfVarCreateBuilder.build();
            case 4:
                qwz qwzVar = (qwz) obj;
                int i8 = rbk.a;
                aihf aihfVarCreateBuilder3 = auej.a.createBuilder();
                String str2 = qwzVar.a;
                aihfVarCreateBuilder3.copyOnWrite();
                auej auejVar = (auej) aihfVarCreateBuilder3.instance;
                auejVar.b |= 1;
                auejVar.c = str2;
                Optional optional = qwzVar.b;
                jfn jfnVar = new jfn(aihfVarCreateBuilder3, 19);
                if (true == optional.isPresent()) {
                    Object obj2 = optional.get();
                    Object obj3 = jfnVar.a;
                    int iIntValue = ((Integer) obj2).intValue();
                    aihf aihfVar = (aihf) obj3;
                    aihfVar.copyOnWrite();
                    auej auejVar2 = (auej) aihfVar.instance;
                    auejVar2.b |= 8;
                    auejVar2.f = iIntValue;
                }
                Optional optional2 = qwzVar.c;
                jfn jfnVar2 = new jfn(aihfVarCreateBuilder3, 20);
                if (true == optional2.isPresent()) {
                    Object obj4 = optional2.get();
                    Object obj5 = jfnVar2.a;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    aihf aihfVar2 = (aihf) obj5;
                    aihfVar2.copyOnWrite();
                    auej auejVar3 = (auej) aihfVar2.instance;
                    auejVar3.b |= 4;
                    auejVar3.e = iIntValue2;
                }
                Optional optional3 = qwzVar.d;
                rbj rbjVar = new rbj(aihfVarCreateBuilder3, i5);
                if (true == optional3.isPresent()) {
                    Object obj6 = optional3.get();
                    Object obj7 = rbjVar.a;
                    aigu aiguVarAu = ahng.au((Duration) obj6);
                    aihf aihfVar3 = (aihf) obj7;
                    aihfVar3.copyOnWrite();
                    auej auejVar4 = (auej) aihfVar3.instance;
                    aiguVarAu.getClass();
                    auejVar4.d = aiguVarAu;
                    auejVar4.b |= 2;
                }
                Optional optional4 = qwzVar.e;
                rbj rbjVar2 = new rbj(aihfVarCreateBuilder3, i);
                if (true == optional4.isPresent()) {
                    Object obj8 = optional4.get();
                    Object obj9 = rbjVar2.a;
                    int iIntValue3 = ((Integer) obj8).intValue();
                    aihf aihfVar4 = (aihf) obj9;
                    aihfVar4.copyOnWrite();
                    auej auejVar5 = (auej) aihfVar4.instance;
                    auejVar5.b |= 16;
                    auejVar5.g = iIntValue3;
                }
                Optional optional5 = qwzVar.f;
                rbj rbjVar3 = new rbj(aihfVarCreateBuilder3, i4);
                if (true == optional5.isPresent()) {
                    Object obj10 = optional5.get();
                    Object obj11 = rbjVar3.a;
                    int iIntValue4 = ((Integer) obj10).intValue();
                    aihf aihfVar5 = (aihf) obj11;
                    aihfVar5.copyOnWrite();
                    auej auejVar6 = (auej) aihfVar5.instance;
                    auejVar6.b |= 32;
                    auejVar6.h = iIntValue4;
                }
                Optional optional6 = qwzVar.g;
                rbj rbjVar4 = new rbj(aihfVarCreateBuilder3, i2);
                if (true == optional6.isPresent()) {
                    Object obj12 = optional6.get();
                    Object obj13 = rbjVar4.a;
                    int iIntValue5 = ((Integer) obj12).intValue();
                    aihf aihfVar6 = (aihf) obj13;
                    aihfVar6.copyOnWrite();
                    auej auejVar7 = (auej) aihfVar6.instance;
                    auejVar7.b |= 64;
                    auejVar7.i = iIntValue5;
                }
                Optional optional7 = qwzVar.h;
                rbj rbjVar5 = new rbj(aihfVarCreateBuilder3, i3);
                if (true == optional7.isPresent()) {
                    Object obj14 = optional7.get();
                    Object obj15 = rbjVar5.a;
                    int iIntValue6 = ((Integer) obj14).intValue();
                    aihf aihfVar7 = (aihf) obj15;
                    aihfVar7.copyOnWrite();
                    auej auejVar8 = (auej) aihfVar7.instance;
                    auejVar8.b |= SemanticState.Focused;
                    auejVar8.j = iIntValue6;
                }
                Optional optional8 = qwzVar.i;
                rbj rbjVar6 = new rbj(aihfVarCreateBuilder3, 5);
                if (true == optional8.isPresent()) {
                    Object obj16 = optional8.get();
                    Object obj17 = rbjVar6.a;
                    int iIntValue7 = ((Integer) obj16).intValue();
                    aihf aihfVar8 = (aihf) obj17;
                    aihfVar8.copyOnWrite();
                    auej auejVar9 = (auej) aihfVar8.instance;
                    auejVar9.b |= SemanticState.Hidden;
                    auejVar9.k = iIntValue7;
                }
                return (auej) aihfVarCreateBuilder3.build();
            case 5:
                qvc qvcVar = (qvc) obj;
                rbl rblVar = qvcVar.g;
                if (rblVar instanceof rbl) {
                    return rblVar.a;
                }
                aihf aihfVarCreateBuilder4 = asjv.a.createBuilder();
                aihf aihfVarCreateBuilder5 = apsr.a.createBuilder();
                aihf aihfVarCreateBuilder6 = anec.a.createBuilder();
                String strC = qvcVar.c();
                aihfVarCreateBuilder6.copyOnWrite();
                anec anecVar = (anec) aihfVarCreateBuilder6.instance;
                strC.getClass();
                anecVar.b |= 1;
                anecVar.c = strC;
                anec anecVar2 = (anec) aihfVarCreateBuilder6.build();
                aihfVarCreateBuilder5.copyOnWrite();
                apsr apsrVar = (apsr) aihfVarCreateBuilder5.instance;
                anecVar2.getClass();
                apsrVar.c = anecVar2;
                apsrVar.b = 3;
                aihfVarCreateBuilder4.cz((apsr) aihfVarCreateBuilder5.build());
                return (asjv) aihfVarCreateBuilder4.build();
            case 6:
                return Collection.EL.stream(((asjv) obj).d);
            case 7:
                return ((qvc) obj).clone();
            case 8:
                return ((qvc) obj).c;
            case 9:
                return ((qvs) obj).p;
            case 10:
                return ((qvs) obj).m;
            case 11:
                return ((qvu) obj).p;
            case 12:
                return ((qvu) obj).m;
            case 13:
                qxj qxjVar = (qxj) obj;
                return Stream.CC.of((Object[]) new qvu[]{qxjVar.e, qxjVar.f});
            case 14:
                return ((qvu) obj).m;
            case 15:
                return (qvs) ((qvu) obj);
            case 16:
                qxj qxjVar2 = (qxj) obj;
                return Stream.CC.of((Object[]) new qvu[]{qxjVar2.e, qxjVar2.f});
            case 17:
                return ((qvu) obj).m;
            case 18:
                return (qwm) ((qvu) obj);
            case 19:
                qwm qwmVar = (qwm) obj;
                Uri uriC = qwmVar.k.c();
                Duration durationMinus = qwmVar.p.minus(qwmVar.l);
                float f4 = qwmVar.s;
                boolean z2 = qwmVar.k.e;
                return new rcg(uriC, durationMinus, f4, qwmVar.t);
            default:
                List list = (List) obj;
                return list.size() == 1 ? list : agke.q(new rcj(agke.n(list)));
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
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
