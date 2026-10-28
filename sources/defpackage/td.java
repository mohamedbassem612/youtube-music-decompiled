package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class td extends vm {
    public final String a;
    final List b;
    private Set c;

    public td(String str, List list) {
        super((byte[]) null);
        this.a = str;
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
