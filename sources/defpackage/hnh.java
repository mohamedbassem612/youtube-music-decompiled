package defpackage;

import j$.util.function.BiFunction$CC;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hnh implements BinaryOperator {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hnh(int i) {
        this.$cid = i;
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
            case 9:
                break;
            case 10:
                break;
            default:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                String str = (String) obj2;
                agrf agrfVar = hnl.a;
                return str;
            case 1:
                anuk anukVar = (anuk) obj2;
                agrf agrfVar2 = hnl.a;
                return anukVar;
            case 2:
                anjx anjxVar = (anjx) obj2;
                agrf agrfVar3 = hnl.a;
                return anjxVar;
            case 3:
                return (aamo) obj2;
            case 4:
                return (aamt) obj2;
            case 5:
                return (aamj) obj2;
            case 6:
                return (aamh) obj2;
            case 7:
                return (aamh) obj;
            case 8:
                return (uqa) obj;
            case 9:
                return (tzk) obj;
            case 10:
                agld agldVar = (agld) obj;
                agld agldVar2 = (agld) obj2;
                agldVar.c(agldVar.b + agldVar2.b);
                System.arraycopy(agldVar2.d, 0, agldVar.d, agldVar.b, agldVar2.b);
                System.arraycopy(agldVar2.e, 0, agldVar.e, agldVar.b, agldVar2.b);
                agldVar.b += agldVar2.b;
                return agldVar;
            default:
                ahgr ahgrVar = (ahgr) obj;
                ahgr ahgrVar2 = (ahgr) obj2;
                if (ahgrVar.b == null) {
                    return ahgrVar2;
                }
                if (ahgrVar2.b == null) {
                    return ahgrVar;
                }
                if (ahgrVar.a.isEmpty()) {
                    ahgrVar.a = new ArrayList();
                }
                ahgrVar.a.add(ahgrVar2.b);
                ahgrVar.a.addAll(ahgrVar2.a);
                if (ahgrVar.a.size() <= 4) {
                    return ahgrVar;
                }
                ?? r4 = ahgrVar.a;
                r4.subList(4, r4.size()).clear();
                throw ahgrVar.a(true);
        }
    }
}
