package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajf extends awna implements Collection, j$.util.Collection, awrp {
    private final ajc a;

    public ajf(ajc ajcVar) {
        this.a = ajcVar;
    }

    @Override // defpackage.awna
    public final int a() {
        return 0;
    }

    @Override // defpackage.awna, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ajh[] ajhVarArr = new ajh[8];
        for (int i = 0; i < 8; i++) {
            ajhVarArr[i] = new ajk();
        }
        return new ajd(this.a.a, ajhVarArr);
    }
}
