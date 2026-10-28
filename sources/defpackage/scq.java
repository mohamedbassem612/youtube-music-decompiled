package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class scq extends scr implements sao, sap, sal, sam, san, saj, sak, sah, sai {
    public final ahey a;
    public final Map b;
    private final Set e;
    private final Set f;
    private final Set g;
    private final Set h;

    public scq(awmd awmdVar, rmp rmpVar, ahey aheyVar) {
        super(awmdVar);
        this.e = ahng.aj();
        this.f = ahng.aj();
        this.g = ahng.aj();
        this.h = ahng.aj();
        this.b = new ConcurrentHashMap();
        this.a = aheyVar;
    }

    private final void l(Predicate predicate) {
        agke agkeVar = (agke) Collection.EL.stream(this.d.at()).filter(predicate).map(new rxg(9)).collect(aghu.a);
        if (agkeVar.isEmpty()) {
            return;
        }
        t(agkeVar);
    }

    @Override // defpackage.sah
    public final void W(final smr smrVar, final sko skoVar) {
        Set set = this.h;
        final String str = skoVar.a;
        set.add(str);
        l(new Predicate() { // from class: scp
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public final /* synthetic */ Predicate mo841negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                aizs aizsVar = ((snl) obj).b;
                aixr aixrVarA = aixr.a(aizsVar.e);
                if (aixrVarA == null) {
                    aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
                }
                String str2 = str;
                if (aixrVarA == aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED) {
                    if (TextUtils.equals(str2, (aizsVar.b == 18 ? (amka) aizsVar.c : amka.a).b)) {
                        return true;
                    }
                }
                aixr aixrVarA2 = aixr.a(aizsVar.e);
                if (aixrVarA2 == null) {
                    aixrVarA2 = aixr.TRIGGER_TYPE_UNSPECIFIED;
                }
                if (aixrVarA2 == aixr.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED) {
                    aixo aixoVarC = smrVar.c();
                    aixo aixoVarA = aixo.a((aizsVar.b == 27 ? (aoil) aizsVar.c : aoil.a).c);
                    if (aixoVarA == null) {
                        aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                    }
                    if (aixoVarC == aixoVarA) {
                        sko skoVar2 = skoVar;
                        int i = aizsVar.b;
                        aixg aixgVarA = aixg.a((i == 27 ? (aoil) aizsVar.c : aoil.a).d);
                        if (aixgVarA == null) {
                            aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                        }
                        if (skoVar2.b == aixgVarA) {
                            if (!TextUtils.equals(str2, (i == 27 ? (aoil) aizsVar.c : aoil.a).b)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        });
    }

    @Override // defpackage.sap
    public final void X(smr smrVar) {
        this.e.remove(smrVar.a);
    }

    @Override // defpackage.scr
    public final void a(aizs aizsVar, smr smrVar) throws sav {
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (aixrVarA == aixr.TRIGGER_TYPE_SLOT_ID_EXITED) {
            if (this.e.contains((aizsVar.b == 8 ? (aqao) aizsVar.c : aqao.a).b)) {
                return;
            }
            if (!TextUtils.equals(smrVar.a, (aizsVar.b == 8 ? (aqao) aizsVar.c : aqao.a).b)) {
                throw new sav("SlotIdExitedTrigger has unrecognized slotId", 86);
            }
        }
    }

    @Override // defpackage.scr
    protected final void ad(aizs aizsVar) {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.b.remove(aizsVar.d);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.scr
    public final boolean ae(aizs aizsVar, smr smrVar, sgp sgpVar) {
        Set set;
        amka amkaVar;
        Set set2;
        aqan aqanVar;
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (aixrVarA == aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED) {
            if (this.e.contains((aizsVar.b == 12 ? (aqaq) aizsVar.c : aqaq.a).b)) {
                int i = aizsVar.b;
                if ((i == 12 ? (aqaq) aizsVar.c : aqaq.a).c > 0) {
                    j(aizsVar, (i == 12 ? (aqaq) aizsVar.c : aqaq.a).c);
                    return false;
                }
            } else if (aixrVarA == aixr.TRIGGER_TYPE_SLOT_ID_ENTERED) {
                set2 = this.f;
                if (aizsVar.b == 3) {
                    aqanVar = (aqan) aizsVar.c;
                } else {
                    aqanVar = aqan.a;
                }
                if (!set2.contains(aqanVar.b)) {
                    if (aixrVarA == aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED) {
                        return false;
                    }
                    set = this.h;
                    if (aizsVar.b == 18) {
                        amkaVar = (amka) aizsVar.c;
                    } else {
                        amkaVar = amka.a;
                    }
                    if (!set.contains(amkaVar.b)) {
                        return false;
                    }
                }
            } else {
                if (aixrVarA == aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED) {
                    return false;
                }
                set = this.h;
                if (aizsVar.b == 18) {
                    amkaVar = (amka) aizsVar.c;
                } else {
                    amkaVar = amka.a;
                }
                if (!set.contains(amkaVar.b)) {
                    return false;
                }
            }
        } else if (aixrVarA == aixr.TRIGGER_TYPE_SLOT_ID_ENTERED) {
            set2 = this.f;
            if (aizsVar.b == 3) {
                aqanVar = (aqan) aizsVar.c;
            } else {
                aqanVar = aqan.a;
            }
            if (!set2.contains(aqanVar.b)) {
                if (aixrVarA == aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED) {
                    return false;
                }
                set = this.h;
                if (aizsVar.b == 18) {
                    amkaVar = (amka) aizsVar.c;
                } else {
                    amkaVar = amka.a;
                }
                if (!set.contains(amkaVar.b)) {
                    return false;
                }
            }
        } else {
            if (aixrVarA == aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED) {
                return false;
            }
            set = this.h;
            if (aizsVar.b == 18) {
                amkaVar = (amka) aizsVar.c;
            } else {
                amkaVar = amka.a;
            }
            if (!set.contains(amkaVar.b)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.sai
    public final void b(smr smrVar, final sko skoVar, final int i) {
        Set set = this.h;
        final String str = skoVar.a;
        set.remove(str);
        l(new Predicate() { // from class: scm
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public final /* synthetic */ Predicate mo841negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                aizs aizsVar = ((snl) obj).b;
                aixr aixrVarA = aixr.a(aizsVar.e);
                if (aixrVarA == null) {
                    aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
                }
                if (aixrVarA == aixr.TRIGGER_TYPE_LAYOUT_ID_EXITED) {
                    if (TextUtils.equals(str, (aizsVar.b == 28 ? (amkb) aizsVar.c : amkb.a).b)) {
                        return true;
                    }
                }
                aixr aixrVarA2 = aixr.a(aizsVar.e);
                if (aixrVarA2 == null) {
                    aixrVarA2 = aixr.TRIGGER_TYPE_UNSPECIFIED;
                }
                if (aixrVarA2 == aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON) {
                    if (TextUtils.equals(skoVar.a, (aizsVar.b == 14 ? (amjz) aizsVar.c : amjz.a).b)) {
                        int iBg = a.bg((aizsVar.b == 14 ? (amjz) aizsVar.c : amjz.a).c);
                        if (iBg == 0) {
                            iBg = 1;
                        }
                        if (yno.M(iBg) == i) {
                            int i2 = aizsVar.b;
                            if ((i2 == 14 ? (amjz) aizsVar.c : amjz.a).d <= 0) {
                                return true;
                            }
                            this.a.j(aizsVar, (i2 == 14 ? (amjz) aizsVar.c : amjz.a).d);
                        }
                    }
                }
                return false;
            }
        });
    }

    @Override // defpackage.saj
    public final void c(sko skoVar) {
        this.g.add(skoVar.a);
    }

    @Override // defpackage.sal
    public final void d(smr smrVar) {
        l(new sco(smrVar, 3));
    }

    @Override // defpackage.sam
    public final void f(smr smrVar) {
        Set set = this.f;
        String str = smrVar.a;
        set.add(str);
        l(new sco(str, 0));
    }

    @Override // defpackage.san
    public final void g(smr smrVar) {
        Set set = this.f;
        String str = smrVar.a;
        set.remove(str);
        l(new sco(str, 2));
    }

    @Override // defpackage.sao
    public final void h(smr smrVar) {
        Set set = this.e;
        String str = smrVar.a;
        set.add(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.d.at().iterator();
        while (it.hasNext()) {
            aizs aizsVar = ((snl) it.next()).b;
            aixr aixrVarA = aixr.a(aizsVar.e);
            if (aixrVarA == null) {
                aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA == aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED) {
                if (TextUtils.equals((aizsVar.b == 12 ? (aqaq) aizsVar.c : aqaq.a).b, str)) {
                    int i = aizsVar.b;
                    if ((i == 12 ? (aqaq) aizsVar.c : aqaq.a).c > 0) {
                        j(aizsVar, (i == 12 ? (aqaq) aizsVar.c : aqaq.a).c);
                    } else {
                        arrayList.add(aizsVar);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t(arrayList);
    }

    public final void j(final aizs aizsVar, final int i) {
        j$.util.Map.EL.computeIfAbsent(this.b, aizsVar.d, new Function() { // from class: scn
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo840andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                scq scqVar = this.a;
                return scqVar.a.schedule(new rhz(scqVar, aizsVar, 18, null), i, TimeUnit.MILLISECONDS);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.sak
    public final void w(sko skoVar) {
        this.g.remove(skoVar.a);
    }

    @Override // defpackage.sal
    public final void e(smr smrVar) {
    }
}
