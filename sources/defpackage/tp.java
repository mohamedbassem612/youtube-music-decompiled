package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tp extends vm {
    final List a;
    final List b;
    public final List c;
    public final List d;
    public Set e;
    private Set f;
    private Set g;

    public tp(List list, List list2, List list3, List list4) {
        super((byte[]) null);
        this.a = list;
        this.b = list2;
        this.c = list3;
        azs.l(list4);
        this.d = list4;
    }

    public final Set a() {
        if (this.f == null) {
            List list = this.a;
            azs.l(list);
            this.f = new afx(list);
        }
        return DesugarCollections.unmodifiableSet(this.f);
    }

    public final Set b() {
        if (this.g == null) {
            List list = this.b;
            azs.l(list);
            this.g = new afx(list);
        }
        return DesugarCollections.unmodifiableSet(this.g);
    }
}
