package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nvj {
    public static final ozi a(pos posVar) {
        posVar.getClass();
        pop popVarB = ozi.b();
        popVarB.l(posVar.a);
        popVarB.t(posVar.i);
        popVarB.m();
        popVarB.q(posVar.b);
        popVarB.s(posVar.c);
        popVarB.r(posVar.d);
        popVarB.o(posVar.f);
        popVarB.n(posVar.g);
        popVarB.p(posVar.h);
        popVarB.a = posVar.e;
        return popVarB.k();
    }

    public static final ozj b(pot potVar) {
        potVar.getClass();
        List list = potVar.u;
        ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((pos) it.next()));
        }
        aifh aifhVar = potVar.t;
        int i = potVar.A;
        long j = potVar.s;
        long j2 = potVar.r;
        long j3 = potVar.h;
        String str = potVar.q;
        String str2 = potVar.j;
        aifv aifvVar = potVar.g;
        String str3 = potVar.f;
        long j4 = potVar.e;
        List list2 = potVar.p;
        aidq aidqVar = potVar.o;
        long j5 = potVar.d;
        long j6 = potVar.c;
        int i2 = potVar.z;
        int i3 = potVar.y;
        aidu aiduVar = potVar.b;
        return new ozj(potVar.a, potVar.B, aiduVar, i3, i2, j6, j5, aidqVar, list2, j4, str3, aifvVar, str2, str, j2, j, j3, i, aifhVar, arrayList, potVar.i, potVar.k, potVar.l, potVar.m, potVar.n, potVar.v, potVar.w, potVar.x);
    }

    public static final List c(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((pot) it.next()));
        }
        return arrayList;
    }
}
