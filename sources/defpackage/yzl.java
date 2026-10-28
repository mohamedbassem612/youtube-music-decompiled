package defpackage;

import android.os.Build;
import androidx.car.app.model.Alert;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yzl implements clu {
    private final yye b;

    public yzl(yye yyeVar) {
        this.b = yyeVar;
    }

    @Override // defpackage.clu
    public final synchronized List a(String str, boolean z, boolean z2) {
        wiu wiuVar;
        zjv zjvVarF;
        agke agkeVarQ;
        zcf zcfVar;
        yye yyeVar = this.b;
        zjr zjrVar = yyeVar.d;
        vxz vxzVar = zjrVar.j;
        if (vxzVar.m(294, 45717299L)) {
            List<clo> listB = b(str, cma.e(str, z, z2));
            if (listB.isEmpty()) {
                agkeVarQ = agpi.a;
            } else {
                wiu wiuVar2 = yyeVar.m != null ? yyeVar.m.y : wiu.c;
                agjz agjzVar = new agjz(4);
                agjzVar.j(zjrVar.ag());
                agjzVar.j(wiuVar2.V());
                agke agkeVarG = agjzVar.g();
                Set setW = wiuVar2.W();
                final List listAf = zjrVar.af();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (clo cloVar : listB) {
                    String str2 = cloVar.b;
                    if (!agkeVarG.contains(str2)) {
                        if (!setW.contains(str2)) {
                            arrayList.add(cloVar);
                        } else if (wiuVar2.m || listAf.contains(str2)) {
                            arrayList2.add(cloVar);
                        }
                    }
                }
                Collections.sort(arrayList2, Comparator$CC.comparingInt(new ToIntFunction() { // from class: yzk
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        int iIndexOf = listAf.indexOf(((clo) obj).b);
                        return iIndexOf == -1 ? Alert.DURATION_SHOW_INDEFINITELY : iIndexOf;
                    }
                }));
                agjz agjzVar2 = new agjz(4);
                agjzVar2.j(arrayList);
                agjzVar2.j(arrayList2);
                agkeVarQ = agjzVar2.g();
            }
        } else {
            zcf zcfVar2 = yyeVar.m;
            if (zcfVar2 != null) {
                wiuVar = zcfVar2.y;
                if (zjrVar.ex()) {
                    zjvVarF = zcfVar2.f();
                } else {
                    zco zcoVarD = zcfVar2.d();
                    zjvVarF = zcoVarD != null ? zcoVarD.c : zjv.a;
                }
            } else {
                wiuVar = wiu.c;
                zjvVarF = zjv.a;
            }
            wiu wiuVar3 = wiuVar;
            zjv zjvVar = zjv.c;
            Set setW2 = zjvVarF == zjvVar ? wiuVar3.W() : agpr.a;
            yzc yzcVar = yyeVar.c;
            wgt wgtVar = wgt.NONE;
            if (yzcVar.a && bsy.n(str)) {
                wgtVar = yzcVar.e;
            }
            Set setV = wiuVar3.V();
            agkj agkjVarB = wiuVar3.B();
            List listB2 = b(str, cma.e(str, z, z2));
            boolean z3 = wiuVar3.m;
            int i = wgtVar.d;
            clo cloVarAu = yno.au(zjrVar, str, setV, setW2, agkjVarB, i, listB2, z3);
            if (vxzVar.m(293, 45716198L) && cloVarAu == null && zcfVar2 != null && (zcfVar = zcfVar2.m) != null && zcfVar.f() != null) {
                cloVarAu = yno.au(zjrVar, str, wiuVar3.V(), zcfVar2.m.f() == zjvVar ? wiuVar3.W() : agpr.a, wiuVar3.B(), i, b(str, cma.e(str, z, z2)), wiuVar3.m);
            }
            agkeVarQ = cloVarAu == null ? agpi.a : agke.q(cloVarAu);
        }
        return agkeVarQ;
    }

    final List b(String str, List list) {
        if (!this.b.d.i.m(463, 45815744L) || !Objects.equals(str, "audio/mp4a-latm") || Build.VERSION.SDK_INT < 37) {
            return list;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                i = -1;
                break;
            }
            if (Objects.equals(((clo) list.get(i)).b, "c2.android.inproc.aac.decoder")) {
                break;
            }
            i++;
        }
        if (i <= 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, (clo) arrayList.remove(i));
        return agke.n(arrayList);
    }
}
