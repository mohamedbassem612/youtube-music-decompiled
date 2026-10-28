package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class gzu extends xjm {
    private final Map b;

    public gzu(String str, Map map, xkd xkdVar) {
        super(str, xkdVar);
        this.b = map;
    }

    @Override // defpackage.xjm
    protected final void a(tas tasVar, Set set, Set set2) {
        super.a(tasVar, set, set2);
        for (Map.Entry entry : this.b.entrySet()) {
            f((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
