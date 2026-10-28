package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class usy implements urr {
    private final zvl a;
    private boolean b;

    public usy(zvl zvlVar) {
        zvlVar.getClass();
        this.a = zvlVar;
    }

    @Override // defpackage.urr
    public final void e(auhs auhsVar, List list) {
        if (this.b) {
            return;
        }
        this.b = true;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            urq urqVar = (urq) it.next();
            if (urqVar.c) {
                utw utwVar = urqVar.b;
                zvl zvlVar = this.a;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 40;
                zvjVarA.d("[ShortsCreation][Android][Edit] Failed to apply composition mutation.");
                if (utwVar != null) {
                    zvjVarA.f(utwVar);
                }
                zvlVar.a(zvjVarA.a());
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.urr
    public final void f(auhs auhsVar, List list) {
    }
}
