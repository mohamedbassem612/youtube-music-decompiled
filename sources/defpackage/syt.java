package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class syt implements syp {
    public final int a;
    final LinkedHashMap b;

    public syt(int i) {
        this.a = i;
        this.b = new sys(this, ((int) Math.ceil(i / 0.75f)) + 1);
    }

    @Override // defpackage.syp
    public final synchronized Object a(Object obj) {
        obj.getClass();
        return this.b.get(obj);
    }

    @Override // defpackage.syp
    public final synchronized void b() {
        this.b.clear();
    }

    @Override // defpackage.syp
    public final synchronized void c(Object obj, Object obj2) {
        obj.getClass();
        this.b.put(obj, obj2);
    }

    public final synchronized void d(Object obj) {
        obj.getClass();
        this.b.remove(obj);
    }

    public final synchronized String toString() {
        return this.b.toString();
    }
}
