package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acev implements aauy {
    private final awmd a;

    public acev(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.aauy
    public final Optional c(wjf wjfVar, acfw acfwVar, String str) {
        str.getClass();
        Object obj = ((aupo) this.a).b;
        obj.getClass();
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return Optional.empty();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Optional optionalC = ((aauy) it.next()).c(wjfVar, acfwVar, str);
            if (optionalC.isPresent()) {
                arrayList.add(optionalC.get());
            }
        }
        return arrayList.isEmpty() ? Optional.empty() : Optional.of(ahno.aA(arrayList));
    }
}
