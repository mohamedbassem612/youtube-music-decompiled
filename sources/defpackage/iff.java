package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class iff extends awpk implements awqk {
    int a;
    Object b;
    Object c;
    boolean d;
    int e;
    final /* synthetic */ ifj f;
    final /* synthetic */ abtu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iff(ifj ifjVar, abtu abtuVar, awoq awoqVar) {
        super(2, awoqVar);
        this.f = ifjVar;
        this.g = abtuVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new iff(this.f, this.g, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((iff) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x0164  */
    /* JADX WARN: Code duplicated, block: B:59:0x0167  */
    /* JADX WARN: Code duplicated, block: B:60:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [xir] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iA;
        boolean z;
        ?? r5;
        Object obj2;
        int iOrdinal;
        abtz abtzVar;
        awox awoxVar = awox.a;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                z = this.d;
                iA = this.a;
                Object obj3 = this.c;
                obj2 = this.b;
                atqp.j(obj);
                r5 = obj3;
            } else {
                iA = this.a;
                atqp.j(obj);
            }
            List list = (List) obj;
            if (r5 != 0) {
                r5.n("sge");
            }
            int i2 = true != z ? iA : 0;
            abtt abttVar = ((abtu) obj2).e;
            new Integer(list.size());
            new Integer(iA);
            ifj ifjVar = this.f;
            abuk abukVarB = ifjVar.e.b();
            zj zjVarT = abuc.t();
            zjVarT.h(i2);
            iOrdinal = abttVar.ordinal();
            if (iOrdinal != 0) {
                abtzVar = abtz.NEXT;
            } else if (iOrdinal != 1) {
                abtzVar = abtz.PREV;
            } else if (iOrdinal != 2 || iOrdinal == 3) {
                abtzVar = abtz.AUTOPLAY;
            } else {
                if (iOrdinal != 4 && iOrdinal != 5) {
                    throw new awmj();
                }
                abtzVar = abtz.JUMP;
            }
            zjVarT.a = abtzVar;
            ifjVar.m(list, abukVarB, zjVarT.f());
            ift iftVar = ifjVar.c;
            iftVar.f();
            ifjVar.j(iA, (abun) list.get(i2));
            iftVar.d();
            return awmy.a;
        }
        atqp.j(obj);
        ifj ifjVar2 = this.f;
        iA = ((abjp) ifjVar2.d.io()).e().a(this.g);
        this.a = iA;
        this.e = 1;
        obj = ifjVar2.a(iA, this);
        if (obj == awoxVar) {
            return awoxVar;
        }
        if (((Boolean) obj).booleanValue()) {
            ((agrc) ifj.a.b().k("com/google/android/apps/youtube/music/player/sequence/QueuePlaybackLoaderNavigator", "navigate$<anonymous>", 162, "QueuePlaybackLoaderNavigator.kt")).u("navigate, invalid arguments, indexOfItemToNavigateTo=%d", iA);
            return awmy.a;
        }
        ifj ifjVar3 = this.f;
        ifjVar3.g.c = false;
        abtu abtuVar = this.g;
        abnp abnpVarA = abtuVar.g;
        if (abnpVarA == null) {
            xit xitVar = ifjVar3.f;
            vxz vxzVar = ifjVar3.i;
            abtt abttVar2 = abtuVar.e;
            abno abnoVarA = abnp.a();
            abnoVarA.a = hzi.e(xitVar, vxzVar, abttVar2);
            abnpVarA = abnoVarA.a();
        } else {
            vxz vxzVar2 = ifjVar3.i;
            if (vxzVar2.l(99, 45770052L, false) && abnpVarA.b == null) {
                abno abnoVarB = abnp.b(abnpVarA);
                abnoVarB.a = hzi.e(ifjVar3.f, vxzVar2, abtuVar.e);
                abnpVarA = abnoVarB.a();
            }
        }
        abtt abttVar3 = abtuVar.e;
        if (abttVar3 == abtt.AUTOPLAY || abttVar3 == abtt.AUTONAV) {
            xir xirVar = abnpVarA.b;
            if (xirVar != null) {
                xirVar.k();
            }
            if (ifjVar3.i.l(99, 45770052L, false) && xirVar != null) {
                aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                agvp.ad(aihfVarCreateBuilder);
                aihf aihfVarCreateBuilder2 = amiw.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                agvp.aa(amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV, aihfVarCreateBuilder2);
                agvp.ac(agvp.Z(aihfVarCreateBuilder2), aihfVarCreateBuilder);
                xirVar.h(agvp.ab(aihfVarCreateBuilder));
            }
        }
        abtu abtuVar2 = new abtu(abttVar3, abtuVar.f, abnpVarA, abtuVar.a());
        boolean zO = ifjVar3.o();
        abnp abnpVar = abtuVar2.g;
        if (abnpVar == null) {
            throw new IllegalArgumentException("PlaybackStartParameters cannot be null for navigation");
        }
        xir xirVar2 = abnpVar.b;
        if (xirVar2 != null) {
            xirVar2.n("sgs");
        }
        ifn ifnVar = ifjVar3.e;
        this.b = abtuVar2;
        this.c = xirVar2;
        this.a = iA;
        this.d = zO;
        this.e = 2;
        obj = ifnVar.d(iA, abtuVar2, zO, this);
        if (obj == awoxVar) {
            return awoxVar;
        }
        z = zO;
        r5 = xirVar2;
        obj2 = abtuVar2;
        List list2 = (List) obj;
        if (r5 != 0) {
            r5.n("sge");
        }
        if (true != z) {
        }
        abtt abttVar4 = ((abtu) obj2).e;
        new Integer(list2.size());
        new Integer(iA);
        ifj ifjVar4 = this.f;
        abuk abukVarB2 = ifjVar4.e.b();
        zj zjVarT2 = abuc.t();
        zjVarT2.h(i2);
        iOrdinal = abttVar4.ordinal();
        if (iOrdinal != 0) {
            abtzVar = abtz.NEXT;
        } else if (iOrdinal != 1) {
            abtzVar = abtz.PREV;
        } else if (iOrdinal != 2) {
            abtzVar = abtz.AUTOPLAY;
        } else {
            abtzVar = abtz.AUTOPLAY;
        }
        zjVarT2.a = abtzVar;
        ifjVar4.m(list2, abukVarB2, zjVarT2.f());
        ift iftVar2 = ifjVar4.c;
        iftVar2.f();
        ifjVar4.j(iA, (abun) list2.get(i2));
        iftVar2.d();
        return awmy.a;
    }
}
