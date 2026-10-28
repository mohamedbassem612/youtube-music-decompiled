package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acjk {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/player/virtual/DefaultVirtualTimeConverter");
    private final List b;
    private final List c;

    public acjk(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    public final long a(acin acinVar) {
        String str;
        List list = this.b;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            str = acinVar.b;
            if (i >= size) {
                i = -1;
                break;
            }
            aciu aciuVar = (aciu) list.get(i);
            if (awrc.c(aciuVar.d(), str)) {
                long jA = aciuVar.a();
                long j2 = acinVar.a;
                if (j2 >= j && j2 < j + jA) {
                    break;
                }
                j += jA;
            }
            i++;
        }
        if (i == -1) {
            ((agrc) a.b().k("com/google/android/libraries/youtube/player/virtual/DefaultVirtualTimeConverter", "globalTimeFromLocalTime", 39, "DefaultVirtualTimeConverter.kt")).M(acinVar, j);
            return acinVar.a;
        }
        long jA2 = acinVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            aciu aciuVar2 = (aciu) list.get(i2);
            String strD = aciuVar2.d();
            strD.getClass();
            if (!awrc.c(strD, str) && this.c.contains(strD)) {
                jA2 += aciuVar2.a();
            }
        }
        return jA2;
    }
}
