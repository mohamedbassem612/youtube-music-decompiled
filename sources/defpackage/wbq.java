package defpackage;

import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wbq implements BiFunction {
    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        wbe wbeVar = (wbe) obj;
        wbi wbiVar = wbeVar.c;
        wbe wbeVar2 = (wbe) obj2;
        wbi wbiVar2 = wbeVar2.c;
        if (true == wbiVar2.d()) {
            wbiVar = wbiVar2;
        }
        wbi wbiVar3 = wbeVar2.a;
        if (wbiVar3.d()) {
            return new wbe(wbiVar3, null, wbiVar);
        }
        wbk wbjVar = wbeVar.b;
        wbi wbiVar4 = wbeVar.a;
        if (wbjVar == null) {
            wbjVar = wbeVar2.b;
        } else {
            wbk wbkVar = wbeVar2.b;
            if (wbkVar != null) {
                wbjVar = new wbj(wbjVar, wbkVar);
            }
        }
        return new wbe(wbiVar4, wbjVar, wbiVar);
    }
}
