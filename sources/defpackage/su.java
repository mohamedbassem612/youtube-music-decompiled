package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class su extends vm {
    public final int a;
    final List b;
    private Set c;

    public su(int i, List list) {
        super((byte[]) null);
        this.a = i;
        azs.l(list);
        this.b = list;
    }

    public final Set a() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new afx(this.b));
        this.c = setUnmodifiableSet;
        return setUnmodifiableSet;
    }
}
