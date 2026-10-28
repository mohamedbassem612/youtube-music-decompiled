package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ewq {
    final Object a;
    public List b;
    ewq c;
    ewq d;

    public ewq(Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final int a() {
        List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object b() {
        int iA = a();
        if (iA > 0) {
            return this.b.remove(iA - 1);
        }
        return null;
    }

    ewq() {
        throw null;
    }
}
