package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jqs {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public jqs() {
        this.i = new gev(null, null, null);
        this.b = new fdt();
        ffx ffxVar = new ffx(new axt(20), new ffu(), new ffv());
        this.c = ffxVar;
        this.a = new pj(ffxVar);
        this.j = new ci((byte[]) null, (char[]) null, (byte[]) null);
        this.e = new gev((byte[]) null, (byte[]) null);
        this.f = new ci((byte[]) null, (byte[]) null, (byte[]) null);
        this.g = new eum();
        this.d = new ci((char[]) null, (byte[]) null, (byte[]) null);
        this.h = new ci((short[]) null, (byte[]) null);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        ((gev) this.e).i(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aunn, java.lang.Object] */
    public final agad a(may mayVar) {
        ?? Io = this.b.io();
        Io.getClass();
        ?? Io2 = this.c.io();
        Io2.getClass();
        ?? Io3 = this.j.io();
        Io3.getClass();
        ?? Io4 = this.h.io();
        Io4.getClass();
        ?? Io5 = this.a.io();
        Io5.getClass();
        avmb avmbVar = (avmb) this.e.io();
        avmbVar.getClass();
        Executor executor = (Executor) this.g.io();
        executor.getClass();
        ?? Io6 = this.i.io();
        Io6.getClass();
        vxz vxzVar = (vxz) this.d.io();
        vxzVar.getClass();
        ?? Io7 = this.f.io();
        Io7.getClass();
        return new agad(mayVar, Io, Io2, Io3, Io4, Io5, avmbVar, executor, Io6, vxzVar, Io7);
    }

    public final euj b(Object obj) {
        return ((eum) this.g).a(obj);
    }

    public final List c() {
        List listO = ((ci) this.h).O();
        if (listO.isEmpty()) {
            throw new esh();
        }
        return listO;
    }

    public final List d(Object obj) {
        List listS = ((pj) this.a).S(obj.getClass());
        if (listS.isEmpty()) {
            throw new esi(obj);
        }
        int size = listS.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            eyv eyvVar = (eyv) listS.get(i);
            if (eyvVar.a(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                }
                arrayList.add(eyvVar);
                z = false;
            }
        }
        if (arrayList.isEmpty()) {
            throw new esi(obj, listS);
        }
        return arrayList;
    }

    public final void e(Class cls, eth ethVar) {
        ((ci) this.j).R(cls, ethVar);
    }

    public final void f(Class cls, eub eubVar) {
        ((ci) this.f).N(cls, eubVar);
    }

    public final void g(Class cls, Class cls2, eyw eywVar) {
        ((pj) this.a).T(cls, cls2, eywVar);
    }

    public final void h(String str, Class cls, Class cls2, eua euaVar) {
        ((gev) this.e).g(str, euaVar, cls, cls2);
    }

    public final void i(Class cls, Class cls2, eyw eywVar) {
        ((pj) this.a).U(cls, cls2, eywVar);
    }

    public final void j(String str, Class cls, Class cls2, eua euaVar) {
        ((gev) this.e).h(str, euaVar, cls, cls2);
    }

    public final void k(etj etjVar) {
        ((ci) this.h).P(etjVar);
    }

    public final void l(eui euiVar) {
        ((eum) this.g).b(euiVar);
    }

    public final void m(Class cls, Class cls2, fco fcoVar) {
        ((ci) this.d).U(cls, cls2, fcoVar);
    }

    public final void n(Class cls, Class cls2, eyw eywVar) {
        ((pj) this.a).V(cls, cls2, eywVar);
    }

    public jqs(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, byte[] bArr) {
        this.b = awmdVar;
        this.c = awmdVar2;
        this.j = awmdVar3;
        this.h = awmdVar4;
        this.a = awmdVar5;
        awmdVar6.getClass();
        this.e = awmdVar6;
        awmdVar7.getClass();
        this.g = awmdVar7;
        this.i = awmdVar8;
        awmdVar9.getClass();
        this.d = awmdVar9;
        this.f = awmdVar10;
    }

    public jqs(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
        this.g = awmdVar7;
        this.h = awmdVar8;
        this.i = awmdVar9;
        this.j = awmdVar10;
    }
}
