package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emi {
    static final boy a = boy.s("k");

    public static List a(emz emzVar, egy egyVar, float f, emw emwVar, boolean z) {
        emz emzVar2;
        float f2;
        emw emwVar2;
        ArrayList arrayList = new ArrayList();
        if (emzVar.p() == 6) {
            egyVar.e("Lottie doesn't support expressions.");
        } else {
            emzVar.h();
            while (emzVar.n()) {
                if (emzVar.q(a) != 0) {
                    emzVar.m();
                } else if (emzVar.p() == 1) {
                    emzVar.g();
                    if (emzVar.p() != 7) {
                        while (emzVar.n()) {
                            emz emzVar3 = emzVar;
                            arrayList.add(emh.a(emzVar3, egyVar, f, emwVar, true, z));
                            emzVar = emzVar3;
                        }
                        emzVar2 = emzVar;
                        f2 = f;
                        emwVar2 = emwVar;
                    } else {
                        emzVar2 = emzVar;
                        f2 = f;
                        emwVar2 = emwVar;
                        int i = emh.c;
                        arrayList.add(new enn(emwVar2.a(emzVar2, f2)));
                    }
                    emzVar2.i();
                    emzVar = emzVar2;
                    egyVar = egyVar;
                    f = f2;
                    emwVar = emwVar2;
                    z = z;
                } else {
                    emz emzVar4 = emzVar;
                    int i2 = emh.c;
                    arrayList.add(new enn(emwVar.a(emzVar4, f)));
                    emzVar = emzVar4;
                    egyVar = egyVar;
                }
            }
            emzVar.j();
            b(arrayList);
        }
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            enn ennVar = (enn) list.get(i2);
            i2++;
            enn ennVar2 = (enn) list.get(i2);
            ennVar.h = Float.valueOf(ennVar2.g);
            if (ennVar.c == null && (obj = ennVar2.b) != null) {
                ennVar.c = obj;
                if (ennVar instanceof ejf) {
                    ((ejf) ennVar).a();
                }
            }
        }
        enn ennVar3 = (enn) list.get(i);
        if ((ennVar3.b == null || ennVar3.c == null) && list.size() > 1) {
            list.remove(ennVar3);
        }
    }
}
