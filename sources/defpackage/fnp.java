package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fnp {
    public float c;
    public Map a = null;
    public ArrayList b = null;
    public long d = 0;

    protected abstract float a(long j);

    public final int d() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    protected final fnp e() {
        if (d() <= 1) {
            return f("default_input");
        }
        throw new RuntimeException("Trying to get single input of node with multiple inputs!");
    }

    protected final fnp f(String str) {
        String str2;
        fnp fnpVarG = g(str);
        if (fnpVarG != null) {
            return fnpVarG;
        }
        Map map = this.a;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            String strConcat = "";
            while (it.hasNext()) {
                strConcat = strConcat + '\'' + ((String) it.next()) + '\'';
                if (!it.hasNext()) {
                    strConcat = strConcat.concat(", ");
                }
            }
            str2 = "[" + strConcat + ']';
        } else {
            str2 = "[]";
        }
        throw new RuntimeException(a.ca(str2, str, "Tried to get non-existent input '", "'. Node only has these inputs: "));
    }

    public final fnp g(String str) {
        Map map = this.a;
        if (map == null) {
            return null;
        }
        return (fnp) map.get(str);
    }

    final Collection h() {
        Map map = this.a;
        return map == null ? Collections.EMPTY_SET : map.values();
    }
}
