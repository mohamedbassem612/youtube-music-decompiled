package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqf implements zqs, zqt {
    public final awmi a;
    public UUID b;
    public final Map c;
    public final aghp d;
    private final awmi e;
    private final awmi f;
    private final awmi g;
    private final awmi h;
    private final axaf i;
    private final UUID j;
    private final awmi k;
    private final awmi l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zqs] */
    public zqf(mgk mgkVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        mgkVar.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        awmdVar3.getClass();
        awmdVar4.getClass();
        mgkVar.a.add(this);
        ?? r2 = mgkVar.b;
        if (r2 != 0) {
            k(r2);
        }
        this.e = new awmp(new zqe(awmdVar4, 0));
        this.f = new awmp(new zqe(awmdVar4, 2));
        this.g = new awmp(new pbm(awmdVar4, 17));
        this.a = new awmp(new pbm(awmdVar4, 18));
        this.h = new awmp(new pbm(awmdVar3, 19));
        this.i = axaw.a(null);
        UUID uuidAf = yno.af();
        this.j = uuidAf;
        this.b = uuidAf;
        this.c = new LinkedHashMap();
        Map mapV = atqq.v(new awml(new zqr(uuidAf), new zqr(uuidAf)));
        agjo agjoVar = new agjo(mapV.size());
        agjoVar.putAll(mapV);
        this.d = agjoVar;
        this.k = new awmp(new efi(this, awmdVar, 9));
        this.l = new awmp(new pbm(awmdVar2, 20));
    }

    public static final Set g(awmi awmiVar) {
        return (Set) awmiVar.a();
    }

    private final zqg n(zqg zqgVar) {
        return new zqg(s(zqgVar.a), zqgVar.b);
    }

    private final zqs o() {
        return (zqs) this.i.c();
    }

    private final Object p(Function0 function0) {
        return ((Boolean) this.e.a()).booleanValue() ? d(function0) : function0.invoke();
    }

    private final Map q() {
        return this.d.a();
    }

    private final UUID r(UUID uuid) {
        UUID uuidAf = yno.af();
        zqr zqrVar = new zqr(uuidAf);
        if (uuid == null) {
            uuid = uuidAf;
        }
        ((agjo) this.d).g(zqrVar, new zqr(uuid), false);
        return uuidAf;
    }

    private final UUID s(UUID uuid) {
        zqr zqrVar = (zqr) q().get(new zqr(uuid));
        UUID uuid2 = zqrVar != null ? zqrVar.a : null;
        return uuid2 == null ? r(uuid) : uuid2;
    }

    private final dov t() {
        Object objA = this.k.a();
        objA.getClass();
        return (dov) objA;
    }

    @Override // defpackage.zqt
    public final void a(zrc zrcVar) {
        zrb zqhVar;
        zqg zqgVarN = n(zrcVar.a);
        Objects.checkIndex(0, 9);
        zrb zqiVar = zrcVar.b;
        if (zqiVar instanceof zra) {
            zra zraVar = (zra) zqiVar;
            zqg zqgVarN2 = n(zraVar.a);
            List list = zraVar.b;
            ArrayList arrayList = new ArrayList(atqq.N(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(n((zqg) it.next()));
            }
            zqiVar = new zra(zqgVarN2, arrayList);
        } else {
            if (zqiVar instanceof zqx) {
                zqhVar = new zqx(n(((zqx) zqiVar).a));
            } else if (zqiVar instanceof zqz) {
                zqz zqzVar = (zqz) zqiVar;
                zqg zqgVarN3 = n(zqzVar.a);
                List list2 = zqzVar.b;
                ArrayList arrayList2 = new ArrayList(atqq.N(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(n((zqg) it2.next()));
                }
                zqiVar = new zqz(zqgVarN3, arrayList2);
            } else if (zqiVar instanceof zqw) {
                zqhVar = new zqw(n(((zqw) zqiVar).a));
            } else if (zqiVar instanceof zqi) {
                zqi zqiVar2 = (zqi) zqiVar;
                zqg zqgVarN4 = n(zqiVar2.a);
                List list3 = zqiVar2.b;
                ArrayList arrayList3 = new ArrayList(atqq.N(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(n((zqg) it3.next()));
                }
                zqiVar = new zqi(zqgVarN4, arrayList3);
            } else if (zqiVar instanceof zqh) {
                zqh zqhVar2 = (zqh) zqiVar;
                zqhVar = new zqh(n(zqhVar2.a), zqhVar2.b);
            } else if (!(zqiVar instanceof zrf) && !(zqiVar instanceof zre)) {
                throw new awmj();
            }
            zqiVar = zqhVar;
        }
        zrc zrcVar2 = new zrc(zqgVarN, zqiVar, null);
        this.b = zrcVar2.a.a;
        t().ab(new vnm(new yrc(zrcVar2, 7), 17));
    }

    @Override // defpackage.zqs
    public final zrg b(UUID uuid) {
        uuid.getClass();
        this.b = uuid;
        zqs zqsVarO = o();
        if (zqsVarO == null) {
            return null;
        }
        return (zrg) p(new bi(zqsVarO, this, uuid, 8));
    }

    public final zrg c(UUID uuid, zqs zqsVar) {
        return (zrg) p(new bi(this, uuid, zqsVar, 10, null));
    }

    @Override // defpackage.zqs
    public final Object d(Function0 function0) {
        zqs zqsVarO = o();
        return zqsVarO == null ? function0.invoke() : zqsVarO.d(function0);
    }

    @Override // defpackage.zqs
    public final List e() {
        zqs zqsVarO = o();
        List listE = zqsVarO != null ? zqsVarO.e() : null;
        if (listE == null) {
            return !awrc.c(this.b, this.j) ? atqq.H(new zqr(this.b)) : awno.a;
        }
        ArrayList arrayList = new ArrayList(atqq.N(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(new zqr(s(((zqr) it.next()).a)));
        }
        return arrayList;
    }

    @Override // defpackage.zqs
    public final List f(UUID uuid) {
        uuid.getClass();
        zqr zqrVar = (zqr) this.d.get(new zqr(uuid));
        UUID uuid2 = zqrVar != null ? zqrVar.a : null;
        if (uuid2 != null) {
            zqs zqsVarO = o();
            List listF = zqsVarO != null ? zqsVarO.f(uuid2) : null;
            if (listF != null) {
                return listF;
            }
        }
        awnm awnmVar = (awnm) this.c.get(new zqr(uuid));
        return awnmVar != null ? atqq.ap(awnmVar) : awno.a;
    }

    @Override // defpackage.zqs
    public final UUID h() {
        zqs zqsVarO = o();
        return r(zqsVarO != null ? zqsVarO.h() : null);
    }

    @Override // defpackage.zqs
    public final UUID i() {
        return this.j;
    }

    @Override // defpackage.zqu
    public final void j(zqt zqtVar) {
        t().ac(zqtVar);
    }

    public final void k(zqs zqsVar) {
        zqs zqsVarO;
        if (((Boolean) this.g.a()).booleanValue() && (zqsVarO = o()) != null) {
            UUID uuidA = zqq.a(zqsVarO);
            ArrayList arrayList = new ArrayList();
            zqg zqgVar = null;
            for (Map.Entry entry : q().entrySet()) {
                UUID uuid = ((zqr) entry.getKey()).a;
                UUID uuid2 = ((zqr) entry.getValue()).a;
                List listF = zqsVarO.f(uuid);
                ArrayList arrayList2 = new ArrayList(atqq.N(listF, 10));
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new zqg(uuid2, (zrg) it.next()));
                }
                if (awrc.c(uuid, uuidA) && (zqgVar = (zqg) atqq.ac(arrayList2)) == null) {
                    zqgVar = new zqg(uuid2, null);
                }
                if (arrayList2.isEmpty()) {
                    arrayList.add(new zqg(uuid2, null));
                } else {
                    atqq.aA(arrayList, arrayList2);
                }
            }
            if (zqgVar == null) {
                zqgVar = new zqg(zqq.a(this), null);
            }
            t().ab(new vnm(new yrc(new zrc(new zqg(zqgVar.a, null), new zqi(zqgVar, arrayList), null, 4, null), 8), 18));
        }
        if (!zqsVar.e().isEmpty()) {
            throw new IllegalArgumentException("Mapping non-empty backstacks onto existing contexts is currently unsupported.");
        }
        aghp aghpVar = this.d;
        agjm agjmVar = new agjm((agjn) aghpVar.keySet());
        while (agjmVar.hasNext()) {
            Object next = agjmVar.next();
            next.getClass();
            UUID uuid3 = ((zqr) next).a;
            ((agjo) aghpVar).g(new zqr(uuid3), new zqr(awrc.c(uuid3, this.j) ? zqsVar.i() : zqsVar.h()), false);
        }
        Object obj = aghpVar.get(new zqr(this.b));
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        UUID uuid4 = ((zqr) obj).a;
        zqsVar.j(this);
        zqsVar.l(this);
        this.i.d(zqsVar);
        p(new bi(zqsVar, uuid4, this, 9));
    }

    @Override // defpackage.zqp
    public final void l(zqf zqfVar) {
        Object objA = this.l.a();
        objA.getClass();
        ((dov) objA).ac(zqfVar);
    }

    @Override // defpackage.zqs
    public final void m(zrg zrgVar) {
        zrgVar.getClass();
        zqs zqsVarO = o();
        if (zqsVarO != null) {
            zqsVarO.m(zrgVar);
            return;
        }
        Map map = this.c;
        zqr zqrVar = new zqr(this.b);
        Object awnmVar = map.get(zqrVar);
        if (awnmVar == null) {
            awnmVar = new awnm();
            map.put(zqrVar, awnmVar);
        }
        awnm awnmVar2 = (awnm) awnmVar;
        if (!((Boolean) this.f.a()).booleanValue() && !awnmVar2.isEmpty()) {
            awnmVar2.set(0, zrgVar);
            return;
        }
        loop0: while (!awnmVar2.isEmpty()) {
            if (!awnmVar2.isEmpty()) {
                zrg zrgVar2 = (zrg) awnmVar2.b[awnmVar2.c(awnmVar2.a + (awnmVar2.c - 1))];
                Object objA = this.h.a();
                objA.getClass();
                Set set = (Set) objA;
                if (set.isEmpty()) {
                    break;
                }
                Iterator it = set.iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                } while (!hmy.W(zrgVar2));
                awnmVar2.removeLast();
            } else {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
        }
        awnmVar2.addLast(zrgVar);
    }
}
