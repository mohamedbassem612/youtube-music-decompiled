package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ito implements BiFunction {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ito(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
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
            default:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r5v22, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [awqk, java.lang.Object] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Object obj3;
        switch (this.$cid) {
            case 0:
                itq itqVar = (itq) this.a;
                Optional optional = (Optional) obj2;
                aihf aihfVarH = ixt.H(itqVar.b, itqVar.g.l(24, 45722989L, false));
                aihfVarH.aY((List) obj);
                imc imcVar = new imc(aihfVarH, 8);
                if (true == optional.isPresent()) {
                    Object obj4 = optional.get();
                    aihf aihfVar = (aihf) imcVar.a;
                    aihfVar.copyOnWrite();
                    alfr alfrVar = (alfr) aihfVar.instance;
                    alfr alfrVar2 = alfr.a;
                    alfrVar.c = (apji) obj4;
                    alfrVar.b |= 1;
                }
                aihf aihfVarCreateBuilder = apox.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                apox apoxVar = (apox) aihfVarCreateBuilder.instance;
                alfr alfrVar3 = (alfr) aihfVarH.build();
                alfrVar3.getClass();
                apoxVar.p = alfrVar3;
                apoxVar.b |= SemanticState.Hidden;
                return (apox) aihfVarCreateBuilder.build();
            case 1:
                ansx ansxVar = (ansx) obj2;
                aamh aamhVar = (aamh) ((agkj) this.a).get((String) obj);
                if (aamhVar == null) {
                    return Optional.empty();
                }
                ansv ansvVarE = ansxVar.d();
                ansvVarE.am(Long.valueOf(DateRetargetClass.toInstant(aamhVar.g).getEpochSecond()));
                return Optional.of(ansvVarE);
            case 2:
                return ((rjm) this.a).d((qvc) obj, (qvc) obj2);
            case 3:
                return ((rjm) this.a).d((qvc) obj, (qvc) obj2);
            case 4:
                return this.a.invoke(obj, obj2);
            case 5:
                Instant instant = (Instant) obj2;
                obj3 = this.a;
                if (instant != null && !((Instant) obj3).isAfter(instant)) {
                    return instant;
                }
                break;
            case 6:
                return this.a.invoke(obj, obj2);
            case 7:
                return this.a.invoke(obj, obj2);
            case 8:
                atpg atpgVar = (atpg) obj2;
                obj3 = this.a;
                if (((atpg) obj3).c <= atpgVar.c) {
                    return atpgVar;
                }
                break;
            default:
                atpg atpgVar2 = (atpg) obj2;
                obj3 = this.a;
                if (((atpg) obj3).c <= atpgVar2.c) {
                    return atpgVar2;
                }
                break;
        }
        return obj3;
    }
}
