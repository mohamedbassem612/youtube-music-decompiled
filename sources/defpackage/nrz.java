package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nrz {
    public static agke a(Iterable iterable, Set set, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (iterable == null) {
            return null;
        }
        int i = 0;
        if (z) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                if (set.contains(Integer.valueOf(i))) {
                    arrayList.add(number);
                }
                i++;
            }
        } else {
            Iterator it2 = iterable.iterator();
            long jLongValue = 0;
            while (it2.hasNext()) {
                Number number2 = (Number) it2.next();
                if (set.contains(Integer.valueOf(i))) {
                    arrayList.add(Long.valueOf(jLongValue + number2.longValue()));
                    jLongValue = 0;
                } else {
                    jLongValue += number2.longValue();
                }
                i++;
            }
        }
        return agke.n(arrayList);
    }

    public static Iterable b(Object obj) {
        if (obj instanceof Object[]) {
            return Arrays.asList((Number[]) obj);
        }
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        return null;
    }
}
