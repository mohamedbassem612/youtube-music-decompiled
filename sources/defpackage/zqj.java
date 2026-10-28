package defpackage;

import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqj implements zqs {
    public final awmd a;
    public final awmd b;
    public final zhg c;
    private final Set d;
    private final awmi e;
    private final awmi f;
    private final acqb g;
    private aeiv h;
    private final elq i;

    public zqj(zhg zhgVar, acqb acqbVar, elq elqVar, Set set, awmd awmdVar, awmd awmdVar2) {
        set.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        this.c = zhgVar;
        this.g = acqbVar;
        this.i = elqVar;
        this.d = set;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.e = new awmp(new zqe(this, 3));
        this.f = new awmp(new zqe(this, 4));
    }

    public static final zqg a(zqy zqyVar) {
        int iAg = yno.ag(zqyVar);
        if (iAg == 0) {
            return ((zra) zqyVar).a;
        }
        if (iAg == 1) {
            return ((zqz) zqyVar).a;
        }
        if (iAg == 2) {
            return ((zqi) zqyVar).a;
        }
        if (iAg == 3) {
            return null;
        }
        throw new awmj();
    }

    private final zqg c() {
        return new zqg(g(), (zrg) atqq.ac(zqq.b(this)));
    }

    private final UUID g() {
        return this.g.c();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    private final void k(zqy zqyVar, awqg awqgVar) {
        aeiv aeivVar = this.h;
        if (aeivVar == null) {
            zqg zqgVarC = c();
            n(zqyVar, zqgVarC, new ega(this, zqyVar, zqgVarC, awqgVar, 3));
        } else {
            if (aeivVar.c == null) {
                aeivVar.c = zqyVar;
            }
            atqq.aA(aeivVar.b, ((zra) zqyVar).b);
            aeivVar.a.add(awqgVar);
        }
    }

    private final void n(zqy zqyVar, zqg zqgVar, Function0 function0) {
        o().ab(new vnm(new yrc(new zrc(zqgVar, zqyVar, null), 9), 20));
        function0.invoke();
        o().ab(new vnm(new yrc(new zrc(zqgVar, zqyVar.a(), null), 10), 19));
    }

    private final dov o() {
        Object objA = this.e.a();
        objA.getClass();
        return (dov) objA;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.zqs
    public final zrg b(UUID uuid) {
        uuid.getClass();
        UUID uuidG = g();
        if (awrc.c(uuid, uuidG)) {
            return (zrg) atqq.ac(zqq.b(this));
        }
        zqg zqgVar = new zqg(uuidG, (zrg) atqq.ac(zqq.b(this)));
        acqb acqbVar = this.g;
        if (!acqbVar.a.contains(new zqr(uuid))) {
            throw new IllegalArgumentException("Received unrecognized ContextHandle: ".concat(zqr.a(uuid)));
        }
        awnm awnmVar = (awnm) acqbVar.d;
        awnmVar.remove(new zqr(uuid));
        awnmVar.addLast(new zqr(uuid));
        zqr zqrVar = (zqr) (awnmVar.isEmpty() ? null : awnmVar.b[awnmVar.a]);
        UUID uuid2 = zqrVar != null ? zqrVar.a : null;
        Object obj = acqbVar.e;
        if (uuid2 != null && awrc.c(uuid2, obj)) {
            awnmVar.removeFirst();
        }
        ?? r3 = acqbVar.c;
        zqr zqrVar2 = new zqr(uuid);
        Object awnmVar2 = r3.get(zqrVar2);
        if (awnmVar2 == null) {
            awnmVar2 = new awnm();
            r3.put(zqrVar2, awnmVar2);
        }
        acqbVar.f = (awnm) awnmVar2;
        k(new zra(zqgVar, awno.a), new pge(acqbVar.b(uuidG), acqbVar.b(uuid), 16, null));
        return (zrg) atqq.ac(zqq.b(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [zqy] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [zqj] */
    @Override // defpackage.zqs
    public final Object d(Function0 function0) {
        Object obj;
        ?? zraVar;
        zqy zqzVar;
        aeiv aeivVar = this.h;
        aeiv aeivVar2 = aeivVar == null ? new aeiv() : aeivVar;
        this.h = aeivVar2;
        try {
            Object objInvoke = function0.invoke();
            this.h = aeivVar;
            if (aeivVar == null && (obj = aeivVar2.c) != null) {
                int iAg = yno.ag(obj);
                if (iAg != 0) {
                    if (iAg == 1) {
                        zqzVar = new zqz(((zqz) obj).a, aeivVar2.b);
                    } else if (iAg == 2) {
                        zqzVar = new zqi(((zqi) obj).a, aeivVar2.b);
                    } else {
                        if (iAg != 3) {
                            throw new awmj();
                        }
                        zraVar = obj;
                    }
                    zraVar = zqzVar;
                } else {
                    zraVar = new zra(((zra) obj).a, aeivVar2.b);
                }
                zqg zqgVarC = c();
                n(zraVar, zqgVarC, new ega((zqj) this, (zqy) zraVar, zqgVarC, aeivVar2, 2));
            }
            return objInvoke;
        } catch (Throwable th) {
            this.h = aeivVar;
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.zqs
    public final List e() {
        return this.g.d;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.zqs
    public final List f(UUID uuid) {
        uuid.getClass();
        awnm awnmVar = (awnm) this.g.c.get(new zqr(uuid));
        return awnmVar == null ? awno.a : awnmVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.zqs
    public final UUID h() {
        UUID uuidAf = yno.af();
        this.g.a.add(new zqr(uuidAf));
        return uuidAf;
    }

    @Override // defpackage.zqs
    public final UUID i() {
        return (UUID) this.g.e;
    }

    @Override // defpackage.zqu
    public final void j(zqt zqtVar) {
        taq.d();
        o().ac(zqtVar);
    }

    @Override // defpackage.zqp
    public final void l(zqf zqfVar) {
        taq.d();
        Object objA = this.f.a();
        objA.getClass();
        ((dov) objA).ac(zqfVar);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.zqs
    public final void m(zrg zrgVar) {
        int iNextIndex;
        zqm zqmVar;
        List arrayList;
        zrgVar.getClass();
        taq.d();
        List listB = zqq.b(this);
        ListIterator listIterator = listB.listIterator(listB.size());
        loop0: while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            zrg zrgVar2 = (zrg) listIterator.previous();
            Set set = this.d;
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (hmy.W(zrgVar2)) {
                        }
                    }
                }
            }
            iNextIndex = listIterator.nextIndex();
            break;
        }
        int iMax = iNextIndex + 1;
        zhg zhgVar = this.c;
        dd ddVarE = zhgVar.e();
        zhgVar.f();
        if (ddVarE.f(R.id.fragment_container) != null) {
            zqq.b(this).size();
        }
        awmd awmdVar = (awmd) this.i.a.get(zrgVar.getClass());
        if (awmdVar == null || (zqmVar = (zqm) awmdVar.io()) == null) {
            throw new IllegalStateException("No destination descriptor found for route ".concat(String.valueOf(zrgVar.getClass().getSimpleName())));
        }
        yno ynoVarB = zqmVar instanceof zqo ? ((zqo) zqmVar).b() : zqmVar.a(zrgVar);
        Objects.checkIndex(0, 3);
        if (ynoVarB != null) {
            zrd zrdVar = null;
            if (ynoVarB instanceof zqk) {
                cc ccVar = ((zqk) ynoVarB).a;
                zqg zqgVar = new zqg(g(), (zrg) atqq.ac(zqq.b(this)));
                acqb acqbVar = this.g;
                if (iMax < 0) {
                    iMax = Math.max(((awnm) acqbVar.f).c + iMax, 0);
                }
                ?? r5 = acqbVar.f;
                int i = ((awnm) r5).c;
                if (iMax < i) {
                    int i2 = i - iMax;
                    List listAo = atqq.ao(r5, i2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((awnm) acqbVar.f).removeLast();
                    }
                    int i4 = iMax + 1;
                    String strE = acqb.e(acqbVar.c(), i4);
                    if (acqbVar.d() && i4 <= i) {
                        while (true) {
                            acqbVar.b.remove(acqb.e(acqbVar.c(), i4));
                            if (i4 == i) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    zrdVar = new zrd(strE, listAo);
                }
                zrd zrdVar2 = zrdVar;
                ((awnm) acqbVar.f).addLast(zrgVar);
                if (acqbVar.d()) {
                    acqbVar.b.put(acqb.e(acqbVar.c(), ((awnm) acqbVar.f).c), new zqg(acqbVar.c(), zrgVar));
                }
                String strB = acqbVar.b(g());
                if (zrdVar2 != null) {
                    List list = zrdVar2.b;
                    arrayList = new ArrayList(atqq.N(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new zqg(g(), (zrg) it2.next()));
                    }
                } else {
                    arrayList = awno.a;
                }
                k(new zra(zqgVar, arrayList), new hgo((Object) zrdVar2, (Object) strB, (Object) ccVar, 13, (char[]) null));
                return;
            }
            if (ynoVarB instanceof zql) {
                throw null;
            }
        }
        throw new awmj();
    }
}
