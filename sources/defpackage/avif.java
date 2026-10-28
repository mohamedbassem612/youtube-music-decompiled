package defpackage;

import java.net.SocketAddress;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avif implements avas {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ avat b;

    public /* synthetic */ avif(avie avieVar, avic avicVar, int i) {
        this.$cid = i;
        this.b = avieVar;
        this.a = avicVar;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    @Override // defpackage.avas
    public final void a(auze auzeVar) {
        auzd auzdVar;
        avar avakVar;
        avak avakVar2;
        auzd auzdVar2;
        if (this.$cid == 0) {
            avii aviiVar = (avii) this.b;
            avaq avaqVar = aviiVar.h;
            Object obj = this.a;
            if (obj != avaqVar || (auzdVar = auzeVar.a) == auzd.e) {
                return;
            }
            auzd auzdVar3 = auzd.c;
            if (auzdVar == auzdVar3 || auzdVar == auzd.d) {
                aviiVar.g.e();
            }
            if (aviiVar.i == auzdVar3) {
                if (auzdVar == auzd.a) {
                    return;
                }
                if (auzdVar == auzd.d) {
                    aviiVar.d();
                    return;
                }
            }
            int iOrdinal = auzdVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    avakVar2 = new avak(avan.e((avaq) obj));
                } else if (iOrdinal == 2) {
                    avakVar2 = new avak(avan.b(auzeVar.b));
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("Unsupported state:".concat(auzdVar.toString()));
                    }
                    avakVar = new avih(aviiVar);
                }
                avakVar = avakVar2;
            } else {
                avakVar = new avak(avii.f);
            }
            aviiVar.e(auzdVar, avakVar);
            return;
        }
        Object obj2 = this.a;
        avic avicVar = (avic) obj2;
        avaq avaqVar2 = avicVar.a;
        avat avatVar = this.b;
        SocketAddress socketAddressK = avie.k(avaqVar2);
        avie avieVar = (avie) avatVar;
        Map map = avieVar.j;
        if (obj2 != map.get(socketAddressK) || (auzdVar2 = auzeVar.a) == auzd.e) {
            return;
        }
        auzd auzdVar4 = auzd.d;
        if (auzdVar2 == auzdVar4 && avicVar.b == auzd.b) {
            avieVar.i.e();
        }
        avicVar.b(auzdVar2);
        auzd auzdVar5 = avieVar.n;
        auzd auzdVar6 = auzd.c;
        if (auzdVar5 == auzdVar6 || avieVar.o == auzdVar6) {
            if (auzdVar2 == auzd.a) {
                return;
            }
            if (auzdVar2 == auzdVar4) {
                avieVar.f();
                return;
            }
        }
        int iOrdinal2 = auzdVar2.ordinal();
        if (iOrdinal2 == 0) {
            auzd auzdVar7 = auzd.a;
            avieVar.n = auzdVar7;
            if (avieVar.h || avieVar.k.f()) {
                avhz avhzVar = avieVar.k;
                if (avhzVar.f() && !map.containsKey(avhzVar.b())) {
                    avieVar.k.g(avie.k(avaqVar2));
                }
            } else {
                avieVar.k.g(avie.k(avaqVar2));
            }
            avieVar.h(auzdVar7, new avak(avan.d("pick_first: attempting to connect")));
            return;
        }
        if (iOrdinal2 == 1) {
            axoz axozVar = avieVar.s;
            if (axozVar != null) {
                axozVar.a();
                avieVar.s = null;
            }
            avieVar.q = null;
            avieVar.e();
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                avaq avaqVar3 = ((avic) it.next()).a;
                if (!avaqVar3.equals(avaqVar2)) {
                    avaqVar3.b();
                }
            }
            map.clear();
            auzd auzdVar8 = auzd.b;
            avicVar.b(auzdVar8);
            map.put(avie.k(avaqVar2), obj2);
            avieVar.k.g(avie.k(avaqVar2));
            avieVar.n = auzdVar8;
            avieVar.i(avicVar);
            return;
        }
        if (iOrdinal2 != 2) {
            if (iOrdinal2 != 3) {
                throw new IllegalArgumentException("Unsupported state:".concat(auzdVar2.toString()));
            }
            avieVar.k.c();
            avieVar.n = auzdVar4;
            avieVar.h(auzdVar4, new avib(avieVar, avieVar));
            return;
        }
        avhz avhzVar2 = avieVar.k;
        if (avhzVar2.f() && map.get(avhzVar2.b()) == obj2) {
            if (avhzVar2.e()) {
                avieVar.e();
                avieVar.f();
            } else if (map.size() >= avhzVar2.a()) {
                avieVar.g();
            } else {
                avhzVar2.c();
                avieVar.f();
            }
        }
        if (map.size() >= avhzVar2.a()) {
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                if (!((avic) it2.next()).c) {
                    return;
                }
            }
            avieVar.n = auzdVar6;
            avieVar.h(auzdVar6, new avak(avan.b(auzeVar.b)));
            int i = avieVar.l + 1;
            avieVar.l = i;
            if (i >= avhzVar2.a() || avieVar.m) {
                avieVar.m = false;
                avieVar.l = 0;
                avieVar.i.e();
            }
        }
    }

    public avif(avii aviiVar, avaq avaqVar, int i) {
        this.$cid = i;
        this.a = avaqVar;
        this.b = aviiVar;
    }
}
