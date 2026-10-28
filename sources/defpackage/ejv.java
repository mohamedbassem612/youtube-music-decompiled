package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ejv {
    public static final ejv a = new ejv("COMPOSITION");
    public ejw b;
    private final List c;

    private ejv(ejv ejvVar) {
        this.c = new ArrayList(ejvVar.c);
        this.b = ejvVar.b;
    }

    private final boolean g() {
        List list = this.c;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    public final int a(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.c;
        if (((String) list.get(i)).equals("**")) {
            return (i == list.size() + (-1) || !((String) list.get(i + 1)).equals(str)) ? 0 : 2;
        }
        return 1;
    }

    public final ejv b(String str) {
        ejv ejvVar = new ejv(this);
        ejvVar.c.add(str);
        return ejvVar;
    }

    public final ejv c(ejw ejwVar) {
        ejv ejvVar = new ejv(this);
        ejvVar.b = ejwVar;
        return ejvVar;
    }

    public final boolean d(String str, int i) {
        List list = this.c;
        if (i >= list.size()) {
            return false;
        }
        int size = list.size() - 1;
        String str2 = (String) list.get(i);
        if (!str2.equals("**")) {
            boolean z = str2.equals(str) || str2.equals("*");
            if ((i != size && (i != list.size() - 2 || !g())) || !z) {
                return false;
            }
        } else if (i != size) {
            int i2 = i + 1;
            if (!((String) list.get(i2)).equals(str)) {
                if (i2 >= list.size() - 1) {
                    return ((String) list.get(i2)).equals(str);
                }
                return false;
            }
            if (i != list.size() - 2 && (i != list.size() - 3 || !g())) {
                return false;
            }
        }
        return true;
    }

    public final boolean e(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.c;
        return i < list.size() && (((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ejv ejvVar = (ejv) obj;
            if (this.c.equals(ejvVar.c)) {
                ejw ejwVar = this.b;
                if (ejwVar != null) {
                    return ejwVar.equals(ejvVar.b);
                }
                if (ejvVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.c;
        return i < list.size() + (-1) || ((String) list.get(i)).equals("**");
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        ejw ejwVar = this.b;
        return iHashCode + (ejwVar != null ? ejwVar.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        ejw ejwVar = this.b;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(strValueOf);
        sb.append(",resolved=");
        sb.append(ejwVar != null);
        sb.append('}');
        return sb.toString();
    }

    public ejv(String... strArr) {
        this.c = Arrays.asList(strArr);
    }
}
