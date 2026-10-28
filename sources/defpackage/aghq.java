package defpackage;

import j$.util.function.BiFunction$CC;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aghq implements BinaryOperator {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aghq(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.$cid;
        if (i == 0) {
            return BiFunction$CC.$default$andThen(this, function);
        }
        if (i != 1) {
            return i != 2 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            agjz agjzVar = (agjz) obj;
            agjz agjzVar2 = (agjz) obj2;
            agjzVar.a(agjzVar2.a, agjzVar2.b);
            return agjzVar;
        }
        if (i == 1) {
            ahub ahubVar = (ahub) obj;
            Iterator it = ((ahub) obj2).a.iterator();
            while (it.hasNext()) {
                ahubVar.i((agpf) it.next());
            }
            return ahubVar;
        }
        if (i != 2) {
            agkh agkhVar = (agkh) obj;
            agkhVar.g((agkh) obj2);
            return agkhVar;
        }
        agkx agkxVar = (agkx) obj;
        agkxVar.l((agkx) obj2);
        return agkxVar;
    }
}
