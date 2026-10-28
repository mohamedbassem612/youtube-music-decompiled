package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fys implements fyy, fyu {
    public final String d;
    protected final Map e = new HashMap();

    public fys(String str) {
        this.d = str;
    }

    public abstract fyy a(kwq kwqVar, List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fys) {
            fys fysVar = (fys) obj;
            String str = this.d;
            if (str != null) {
                return str.equals(fysVar.d);
            }
        }
        return false;
    }

    @Override // defpackage.fyu
    public final fyy f(String str) {
        Map map = this.e;
        return map.containsKey(str) ? (fyy) map.get(str) : f;
    }

    @Override // defpackage.fyy
    public final Boolean g() {
        return Boolean.TRUE;
    }

    @Override // defpackage.fyy
    public final fyy gR(String str, kwq kwqVar, List list) {
        return "toString".equals(str) ? new fzb(this.d) : fhz.aC(this, new fzb(str), kwqVar, list);
    }

    @Override // defpackage.fyy
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.fyy
    public final String i() {
        return this.d;
    }

    @Override // defpackage.fyy
    public final Iterator l() {
        return fhz.ar(this.e);
    }

    @Override // defpackage.fyu
    public final void r(String str, fyy fyyVar) {
        Map map = this.e;
        if (fyyVar == null) {
            map.remove(str);
        } else {
            map.put(str, fyyVar);
        }
    }

    @Override // defpackage.fyu
    public final boolean t(String str) {
        return this.e.containsKey(str);
    }

    @Override // defpackage.fyy
    public fyy d() {
        return this;
    }
}
