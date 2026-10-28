package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnz {
    public static final List a = new ArrayList();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ftg f;
    public final List g;
    public final List h;
    public final List i;

    public fnz(int i, int i2, int i3, int i4, ftg ftgVar, List list, List list2, List list3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = ftgVar == null ? fqe.r() : ftgVar;
        if (list == null) {
            this.g = a;
        } else {
            int size = list.size();
            this.g = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                ftg ftgVarR = (ftg) list.get(i5);
                List list4 = this.g;
                if (ftgVarR == null) {
                    ftgVarR = fqe.r();
                }
                list4.add(ftgVarR);
            }
        }
        this.h = list2 != null ? DesugarCollections.unmodifiableList(list2) : null;
        this.i = list3 != null ? DesugarCollections.unmodifiableList(list3) : null;
    }

    public static fnz a(int i, int i2, Object obj) {
        List listSingletonList = obj != null ? Collections.singletonList(obj) : null;
        return new fnz(0, i, i2, 1, null, null, listSingletonList, listSingletonList);
    }

    public static fnz b(int i, int i2, ftg ftgVar, Object obj, Object obj2) {
        return new fnz(i, i2, -1, 1, ftgVar, null, obj != null ? Collections.singletonList(obj) : null, obj2 != null ? Collections.singletonList(obj2) : null);
    }

    public static fnz c(int i, Object obj) {
        return b(3, i, fqe.r(), obj, null);
    }
}
