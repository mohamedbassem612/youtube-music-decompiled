package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class onu {
    public final boolean a;
    private final Object b;
    private final Object c;

    public onu(boolean z, Object obj, Object obj2) {
        this.a = z;
        this.b = obj;
        this.c = obj2;
    }

    public static boolean d(onu onuVar, onu onuVar2, Comparator comparator) {
        Object obj;
        Object obj2;
        if (onuVar == null || !onuVar.a || (obj = onuVar.b) == null || onuVar2 == null || !onuVar2.a || (obj2 = onuVar2.b) == null) {
            return a.ae(onuVar, onuVar2);
        }
        ArrayList arrayList = new ArrayList((Collection) obj);
        ArrayList arrayList2 = new ArrayList((Collection) obj2);
        Collections.sort(arrayList, comparator);
        Collections.sort(arrayList2, comparator);
        return arrayList.equals(arrayList2);
    }

    public final Object a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Either was not left");
    }

    public final Object b() {
        if (c()) {
            return this.c;
        }
        throw new IllegalStateException("Either was not right");
    }

    public final boolean c() {
        return !this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof onu)) {
            return false;
        }
        onu onuVar = (onu) obj;
        if (this.a) {
            if (!onuVar.a || !a.ae(a(), onuVar.a())) {
                return false;
            }
        } else if (!onuVar.c() || !a.ae(b(), onuVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c});
    }
}
