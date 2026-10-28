package defpackage;

import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.function.Function$CC;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rxg implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rxg(int i) {
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
        switch (this.$cid) {
            case 0:
                apji apjiVar = (apji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(akxw.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                return (akxv) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            case 1:
                return new CopyOnWriteArraySet();
            case 2:
                apji apjiVar2 = (apji) obj;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aori.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (aorh) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
            case 3:
                return Collection.EL.stream(((aorh) obj).b);
            case 4:
                return ((slb) obj).o;
            case 5:
                return ((snk) obj).a().name();
            case 6:
                agke agkeVar = ((smr) obj).e;
                int i = ((agpi) agkeVar).d;
                int i2 = 0;
                while (i2 < i) {
                    snk snkVar = (snk) agkeVar.get(i2);
                    i2++;
                    if (snkVar instanceof slk) {
                        return Long.valueOf(((slk) snkVar).b.a);
                    }
                }
                return Long.MAX_VALUE;
            case 7:
                return Collection.EL.stream(((aisu) obj).e);
            case 8:
                return new PriorityQueue(11, Comparator$CC.comparingLong(new cpt(11)));
            case 9:
                return ((snl) obj).b;
            case 10:
                return afxw.i((apji) obj);
            case 11:
                return afxw.b((apji) obj);
            case 12:
                return (aivt) aavv.s((apji) obj, aivv.a);
            case 13:
                return afxw.b((apji) obj);
            case 14:
                shh shhVar = shh.a;
                return ((sht) obj).getClass();
            case 15:
                sht shtVar = (sht) obj;
                shh shhVar2 = shh.a;
                return shtVar;
            case 16:
                apji apjiVar3 = ((ambn) obj).n;
                return apjiVar3 == null ? apji.a : apjiVar3;
            case 17:
                apji apjiVar4 = ((ambn) obj).j;
                return apjiVar4 == null ? apji.a : apjiVar4;
            case 18:
                apji apjiVar5 = ((ambn) obj).k;
                return apjiVar5 == null ? apji.a : apjiVar5;
            case 19:
                apji apjiVar6 = ((ambn) obj).d;
                return apjiVar6 == null ? apji.a : apjiVar6;
            default:
                apji apjiVar7 = ((ambn) obj).i;
                return apjiVar7 == null ? apji.a : apjiVar7;
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
