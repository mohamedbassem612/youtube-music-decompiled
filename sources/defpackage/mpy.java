package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mpy {
    public static final agke a = agke.v(mow.class, mpu.class, mpw.class, mqa.class, mqc.class, mpr.class);

    public static List a(Map map) {
        agjz agjzVar = new agjz(4);
        agqs agqsVarListIterator = ((agke) ((agpn) map).values()).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            nvr nvrVar = (nvr) agqsVarListIterator.next();
            if (!a.contains(nvrVar.getClass())) {
                agjzVar.h(nvrVar);
            }
        }
        return agjzVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List b(Map map, Set set) {
        agjz agjzVar = new agjz(4);
        agqs agqsVarListIterator = ((agke) ((agpn) map).values()).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            agjzVar.h((nvq) ((Pair) agqsVarListIterator.next()).first);
        }
        agjzVar.j(set);
        return agjzVar.g();
    }

    public static List c(Map map) {
        ArrayList arrayList = new ArrayList(new aghv(((agpn) map).values(), new idn(3)));
        Collections.sort(arrayList, new cru(4));
        return arrayList;
    }
}
