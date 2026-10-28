package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class fyv implements fyy, fyu {
    public final Map a = new HashMap();

    @Override // defpackage.fyy
    public final fyy d() {
        fyv fyvVar = new fyv();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof fyu;
            Map map = fyvVar.a;
            if (z) {
                map.put((String) entry.getKey(), (fyy) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((fyy) entry.getValue()).d());
            }
        }
        return fyvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fyv) {
            return this.a.equals(((fyv) obj).a);
        }
        return false;
    }

    @Override // defpackage.fyu
    public final fyy f(String str) {
        Map map = this.a;
        return map.containsKey(str) ? (fyy) map.get(str) : f;
    }

    @Override // defpackage.fyy
    public final Boolean g() {
        return Boolean.TRUE;
    }

    @Override // defpackage.fyy
    public fyy gR(String str, kwq kwqVar, List list) {
        return "toString".equals(str) ? new fzb(toString()) : fhz.aC(this, new fzb(str), kwqVar, list);
    }

    @Override // defpackage.fyy
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.fyy
    public final String i() {
        return "[object Object]";
    }

    @Override // defpackage.fyy
    public final Iterator l() {
        return fhz.ar(this.a);
    }

    @Override // defpackage.fyu
    public final void r(String str, fyy fyyVar) {
        Map map = this.a;
        if (fyyVar == null) {
            map.remove(str);
        } else {
            map.put(str, fyyVar);
        }
    }

    @Override // defpackage.fyu
    public final boolean t(String str) {
        return this.a.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        Map map = this.a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append('}');
        return sb.toString();
    }
}
