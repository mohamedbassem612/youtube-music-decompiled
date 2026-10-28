package defpackage;

import j$.util.Optional;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adly extends xhg {
    private final aha e;
    private Map f;

    public adly() {
        this.e = new aha(0);
    }

    public final int b(String str, int i) {
        Object obj = this.e.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    public final Object c(String str) {
        return this.e.get(str);
    }

    public final Object d(String str, Object obj) {
        Object obj2 = this.e.get(str);
        return obj2 != null ? obj2 : obj;
    }

    public final Map e() {
        Map map = this.f;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final void f(String str, Object obj) {
        this.e.put(str, obj);
    }

    public final void g(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.putAll(map);
    }

    public final void h() {
        this.b = xgn.l;
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073830316)) {
                this.a = Optional.empty();
                this.c = null;
                this.d = null;
            }
        }
        this.e.clear();
        Map map = this.f;
        if (map != null) {
            map.clear();
        }
    }

    public final void i(adly adlyVar) {
        adlyVar.getClass();
        h();
        this.b = adlyVar.b;
        this.a = adlyVar.a;
        this.c = adlyVar.c;
        this.d = adlyVar.d;
        g(adlyVar.f);
        this.e.i(adlyVar.e);
    }

    public final boolean j(String str) {
        Object obj = this.e.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public adly(adly adlyVar) {
        this();
        i(adlyVar);
    }
}
