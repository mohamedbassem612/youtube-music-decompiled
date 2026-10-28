package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tem extends awpk implements awqk {
    final /* synthetic */ teq a;
    final /* synthetic */ tew b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tem(teq teqVar, tew tewVar, int i, String str, long j, awoq awoqVar) {
        super(2, awoqVar);
        this.a = teqVar;
        this.b = tewVar;
        this.e = i;
        this.c = str;
        this.d = j;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new tem(this.a, this.b, this.e, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tem) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        final awri awriVar = new awri();
        final teq teqVar = this.a;
        awwd awwdVar = teqVar.i;
        if (awwdVar != null && awwdVar.q()) {
            tew tewVar = this.b;
            tew tewVarI = teq.i(tewVar);
            if (tewVarI != null && teqVar.j == tewVarI) {
                if (teqVar.f()) {
                    teqVar.k(this.e, new tev(4, tewVar, false, true, 3, false, 0L, 0, 228), this.c);
                }
                return awmy.a;
            }
            awriVar.a = true;
            awwd awwdVar2 = teqVar.i;
            if (awwdVar2 != null) {
                awwdVar2.p(null);
            }
        }
        ConcurrentHashMap concurrentHashMap = teqVar.h;
        final tew tewVar2 = this.b;
        concurrentHashMap.put(tewVar2, new Long(this.d));
        teqVar.j = tewVar2;
        List list = (CopyOnWriteArrayList) teqVar.e.get(tewVar2);
        if (list == null) {
            list = awno.a;
        }
        List list2 = list;
        List list3 = (CopyOnWriteArrayList) teqVar.g.get(tewVar2);
        if (list3 == null) {
            list3 = awno.a;
        }
        List list4 = list3;
        List list5 = (CopyOnWriteArrayList) teqVar.f.get(tewVar2);
        if (list5 == null) {
            list5 = awno.a;
        }
        final long jB = teqVar.d.b();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        final AtomicInteger atomicInteger3 = new AtomicInteger(0);
        awwd awwdVarT = awro.t(teqVar.a, teqVar.b, 0, new tel(teqVar, list4, atomicInteger, list2, atomicInteger2, list5, atomicInteger3, null), 2);
        teqVar.i = awwdVarT;
        final int i = this.e;
        final String str = this.c;
        awwdVarT.kJ(new awqg() { // from class: teg
            @Override // defpackage.awqg
            public final Object invoke(Object obj2) {
                int i2 = i;
                awri awriVar2 = awriVar;
                AtomicInteger atomicInteger4 = atomicInteger;
                AtomicInteger atomicInteger5 = atomicInteger2;
                teq teqVar2 = teqVar;
                AtomicInteger atomicInteger6 = atomicInteger3;
                tew tewVar3 = tewVar2;
                String str2 = str;
                awro.t(teqVar2.a, teqVar2.b, 0, new teh(teqVar2, tewVar3, jB, (Throwable) obj2, i2, awriVar2, atomicInteger4, atomicInteger5, atomicInteger6, str2, null), 2);
                return awmy.a;
            }
        });
        return awmy.a;
    }
}
