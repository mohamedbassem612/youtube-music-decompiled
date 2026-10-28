package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aass {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private int c = 0;
    private int d = 0;

    final synchronized aarw a(String str) {
        return (aarw) this.a.get(str);
    }

    public final synchronized aarw b(String str) {
        aarw aarwVar;
        Integer num;
        aarwVar = (aarw) this.a.remove(str);
        if (aarwVar != null && (num = (Integer) this.b.remove(str)) != null) {
            if (num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 4 || num.intValue() == 7 || num.intValue() == 6) {
                this.c--;
            } else if (num.intValue() == 2) {
                this.d--;
            }
        }
        return aarwVar;
    }

    final synchronized boolean c(int i) {
        try {
            if (i == 1 || i == 3 || i == 4 || i == 7 || i == 6) {
                if (this.c > 0) {
                    return false;
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(a.bR(i, "Invalid transfer type: "));
                }
                if (this.d > 0) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean d(String str) {
        return this.a.containsKey(str);
    }

    final synchronized boolean e(String str, aarw aarwVar, int i) {
        if (!c(i)) {
            return false;
        }
        this.a.put(str, aarwVar);
        this.b.put(str, Integer.valueOf(i));
        if (i == 1 || i == 3 || i == 4 || i == 7 || i == 6) {
            this.c++;
        } else if (i == 2) {
            this.d++;
        }
        return true;
    }
}
