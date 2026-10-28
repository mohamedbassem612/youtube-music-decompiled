package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aikg implements aiki {
    boolean b;
    protected final Map a = new HashMap();
    boolean c = true;

    public final affc a() {
        return b().a();
    }

    public final aikh b() {
        Map map = this.a;
        if (map.isEmpty()) {
            return this.b ? aikh.b : aikh.a;
        }
        return new aikh(new HashMap(map), this.b);
    }

    public final void c(int i) {
        aikh aikhVarD = aikh.b;
        if (this.b) {
            aikhVarD = aikhVarD.d();
        }
        boolean zEquals = aikh.a.equals(aikhVarD);
        Map map = this.a;
        if (zEquals) {
            map.remove(Integer.valueOf(i));
        } else {
            map.put(Integer.valueOf(i), aikhVarD);
        }
        this.c = false;
    }

    public final void d(int... iArr) {
        for (int i : iArr) {
            c(i);
        }
    }
}
