package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fpw implements ftg {
    private final Map a;
    private Map b = null;

    protected fpw(fpv fpvVar) {
        this.a = fpvVar.a;
    }

    @Override // defpackage.ftg
    public final int a() {
        Map map = this.a;
        if (map == null || !map.containsKey("span_size")) {
            return 1;
        }
        return ((Integer) map.get("span_size")).intValue();
    }

    @Override // defpackage.ftg
    public final int b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ftg
    public fgy c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ftg
    public final fpt d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ftg
    public final fpu e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ftg
    public final Object f(String str) {
        Map map = this.a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // defpackage.ftg
    public String g() {
        return null;
    }

    @Override // defpackage.ftg
    public final void i(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ftg
    public final boolean j() {
        Map map = this.a;
        if (map == null || !map.containsKey("is_full_span")) {
            return false;
        }
        return ((Boolean) map.get("is_full_span")).booleanValue();
    }

    @Override // defpackage.ftg
    public final boolean k() {
        Map map = this.a;
        if (map == null || !map.containsKey("is_sticky")) {
            return false;
        }
        return ((Boolean) map.get("is_sticky")).booleanValue();
    }

    @Override // defpackage.ftg
    public boolean l() {
        throw null;
    }

    @Override // defpackage.ftg
    public boolean m() {
        return false;
    }

    @Override // defpackage.ftg
    public final void n(Object obj) {
        Map mapSynchronizedMap = this.b;
        if (mapSynchronizedMap == null) {
            mapSynchronizedMap = DesugarCollections.synchronizedMap(new HashMap());
            this.b = mapSynchronizedMap;
        }
        mapSynchronizedMap.put("section_global_key", obj);
    }

    @Override // defpackage.ftg
    public void o() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ftg
    public omj q() {
        return null;
    }

    @Override // defpackage.ftg
    public final void h() {
    }

    @Override // defpackage.ftg
    public final void p() {
    }
}
