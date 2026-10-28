package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lwm implements lyo {
    public static void l(Iterable iterable, List list) {
        lyf.a(iterable);
        if (iterable instanceof lyk) {
            List listA = ((lyk) iterable).a();
            lyk lykVar = (lyk) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (lykVar.size() - size) + " is null.";
                    int size2 = lykVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        lykVar.remove(size2);
                    }
                } else if (obj instanceof lxa) {
                    lykVar.b();
                } else if (obj instanceof byte[]) {
                    lxa.h((byte[]) obj);
                    lykVar.b();
                } else {
                    lykVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof lyv) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof lyx) {
                lyx lyxVar = (lyx) list;
                int size4 = list.size() + size3;
                int length = lyxVar.b.length;
                if (size4 > length) {
                    if (length == 0) {
                        lyxVar.b = new Object[Math.max(size4, 10)];
                    } else {
                        while (length < size4) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        lyxVar.b = Arrays.copyOf(lyxVar.b, length);
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    rpi.C(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i = 0; i < size6; i++) {
            Object obj3 = list2.get(i);
            if (obj3 == null) {
                rpi.C(list, size5);
            }
            list.add(obj3);
        }
    }

    @Override // 
    public abstract lwm k();

    public void m(byte[] bArr, int i, lxl lxlVar) {
        throw null;
    }
}
