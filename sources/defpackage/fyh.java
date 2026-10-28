package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyh extends fys {
    final Map a;
    private final elr b;

    public fyh(elr elrVar) {
        super("require");
        this.a = new HashMap();
        this.b = elrVar;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fys
    public final fyy a(kwq kwqVar, List list) {
        fyy fyyVar;
        fxw.i("require", 1, list);
        String strI = kwqVar.v((fyy) list.get(0)).i();
        Map map = this.a;
        if (map.containsKey(strI)) {
            return (fyy) map.get(strI);
        }
        ?? r4 = this.b.a;
        if (r4.containsKey(strI)) {
            try {
                fyyVar = (fyy) ((Callable) r4.get(strI)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strI)));
            }
        } else {
            fyyVar = fyy.f;
        }
        if (fyyVar instanceof fys) {
            this.a.put(strI, (fys) fyyVar);
        }
        return fyyVar;
    }
}
