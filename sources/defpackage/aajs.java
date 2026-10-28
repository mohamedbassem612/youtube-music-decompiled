package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aajs implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aajs(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v51, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v58, types: [qrx] */
    /* JADX WARN: Type inference failed for: r11v72, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v75, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v77, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v89, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v99, types: [aeoq] */
    /* JADX WARN: Type inference failed for: r12v37, types: [qrx] */
    /* JADX WARN: Type inference failed for: r12v48, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        apqt apqtVar;
        int i = 10;
        int i2 = 14;
        int i3 = 16;
        int i4 = 12;
        int i5 = 11;
        int i6 = 1;
        int i7 = 2;
        int i8 = 0;
        ?? r10 = 0;
        r10 = 0;
        switch (this.$cid) {
            case 0:
                tm tmVar = new tm();
                tmVar.c(((aajt) this.a).d);
                tmVar.b(false);
                return ((ug) obj).e(tmVar.a());
            case 1:
                tm tmVar2 = new tm();
                tmVar2.c(((aajt) this.a).d);
                tmVar2.b(true);
                return ((ug) obj).e(tmVar2.a());
            case 2:
                Optional optionalOfNullable = (Optional) obj;
                vre vreVar = new vre(this.a, 9);
                if (true == optionalOfNullable.isPresent()) {
                    Object obj2 = optionalOfNullable.get();
                    aakw aakwVar = (aakw) vreVar.a;
                    optionalOfNullable = Optional.ofNullable(((aaqf) aakwVar.a.io()).b((aaqe) obj2, aakwVar.d));
                }
                return (ListenableFuture) optionalOfNullable.orElse(ahng.n(alub.a));
            case 3:
                Object obj3 = this.a;
                return ahno.ap(afwl.j(new aalq(obj3, (aihf) obj, i6)), ((aalp) obj3).b);
            case 4:
                Object obj4 = this.a;
                aalp aalpVar = (aalp) obj4;
                Optional optional = aalpVar.i;
                optional.isPresent();
                return ahno.ar((ListenableFuture) optional.orElse(ahng.n(aodx.a)), new aaat(obj4, (aihf) obj, i5, r10), aalpVar.b);
            case 5:
                return ((kyr) ((agfa) ((aals) this.a).b).a).A((List) Collection.EL.stream((java.util.Collection) obj).map(new aalr(i7)).collect(Collectors.toCollection(new yoj(8))));
            case 6:
                return ((ahgb) ((agfa) ((aals) this.a).a).a).ae((List) Collection.EL.stream((java.util.Collection) obj).map(new aakc(i3)).collect(Collectors.toCollection(new yoj(8))));
            case 7:
                aaqd aaqdVar = (aaqd) obj;
                if (aaqdVar == null || aaqdVar.a.size() == 0) {
                    return ahng.n(null);
                }
                aarj aarjVar = (aarj) this.a;
                return ((wnh) ((aaqf) aarjVar.d.io()).d).b(aaqdVar, aarjVar.b, null);
            case 8:
                abvx abvxVar = (abvx) this.a;
                abvk abvkVar = abvxVar.b;
                acip acipVarJ = abvkVar.j();
                return (acipVarJ == null || !(abvkVar.V() || abvkVar.aa())) ? aher.a : afxd.f(tzk.b(acipVarJ.ad().x(new yqz(i4)).au())).g(new abfb(15), abvxVar.c);
            case 9:
                Object objIo = this.a.io();
                return objIo == null ? ahng.l() : ahng.n(objIo);
            case 10:
                abzr abzrVar = new abzr(i2);
                axlj axljVar = (axlj) this.a;
                return ((qrx) axljVar.a).a(abzrVar, axljVar.c);
            case 11:
                acuz acuzVar = (acuz) obj;
                if (acuzVar.equals(acuz.a)) {
                    return aher.a;
                }
                Object obj5 = this.a;
                acpb acpbVar = new acpb(acuzVar, i7);
                axlj axljVar2 = (axlj) obj5;
                ?? r2 = axljVar2.c;
                return ahno.as(((qrx) axljVar2.b).a(acpbVar, r2), new aajs(obj5, i), r2);
            case 12:
                aeiy aeiyVar = (aeiy) this.a;
                dvo dvoVar = (dvo) obj;
                aeiv aeivVar = (aeiv) aeiyVar.d;
                aeivVar.a();
                if (dvoVar != null) {
                    return ahno.ar(((lqa) aeiyVar.h).F("shared", dvoVar.c()), new acpb(dvoVar, i2), MoreExecutors.directExecutor());
                }
                aeivVar.d(27);
                return ahng.n(null);
            case 13:
                iqi iqiVar = new iqi(i);
                Object obj6 = this.a;
                aeiy aeiyVar2 = (aeiy) obj6;
                return ahno.as(ahno.ar(ahcs.e(((lqa) aeiyVar2.h).G(iqiVar), afwl.a(new aeiw(4)), MoreExecutors.directExecutor()), new aeiw(i7), MoreExecutors.directExecutor()), new aajs(obj6, i3), aeiyVar2.a);
            case 14:
                String str = (String) obj;
                Object obj7 = this.a;
                aeiy aeiyVar3 = (aeiy) obj7;
                aeiv aeivVar2 = (aeiv) aeiyVar3.d;
                aeivVar2.c("ds_mlc");
                if (!ahno.aa(str)) {
                    aeivVar2.d(24);
                    return ahno.aq(new wan(obj7, str, i5, r10), aeiyVar3.b);
                }
                String strC = aeiy.c();
                aeivVar2.c("ds_cs");
                aeivVar2.d(43);
                return ahno.as(ahno.aq(new wan(obj7, strC, i4, r10), aeiyVar3.b), new aajs(obj7, i4), aeiyVar3.a);
            case 15:
                ArrayList arrayList = new ArrayList();
                arrayList.add("Default");
                arrayList.addAll(DesugarCollections.unmodifiableMap(((arkk) obj).b).values());
                arrayList.toString();
                return ((axlj) ((aeiy) this.a).g).l(arrayList, false);
            case 16:
                aeiy aeiyVar4 = (aeiy) this.a;
                if (!((vxz) aeiyVar4.f).m(11, 45821810L)) {
                    return aher.a;
                }
                ahgb ahgbVar = (ahgb) aeiyVar4.e;
                return ahno.ar(awrc.ag(ahgbVar.c, awov.a, new adqv(ahgbVar, (awoq) null, 6)), new aeiw(i8), MoreExecutors.directExecutor());
            case 17:
                return ((aejd) this.a).c((wtr) obj);
            case 18:
                wtt wttVar = (wtt) obj;
                aejd aejdVar = (aejd) this.a;
                aprv aprvVar = aejdVar.c;
                if (wttVar != null) {
                    Iterator it = wttVar.b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof apqt) {
                                apqtVar = (apqt) next;
                                aprv aprvVarA = aprv.a(apqtVar.e);
                                if (aprvVarA == null) {
                                    aprvVarA = aprv.SETTING_CAT_UNKNOWN;
                                }
                                if (aprvVarA == aprvVar) {
                                }
                            }
                        } else {
                            apqtVar = null;
                        }
                    }
                } else {
                    apqtVar = null;
                }
                if (apqtVar != null) {
                    Iterator it2 = apqtVar.d.iterator();
                    while (it2.hasNext()) {
                        aprb aprbVar = ((apqu) it2.next()).h;
                        if (aprbVar == null) {
                            aprbVar = aprb.a;
                        }
                        aprw aprwVarA = aprw.a(aprbVar.b);
                        if (aprwVarA == null) {
                            aprwVarA = aprw.SETTING_ITEM_ID_UNKNOWN;
                        }
                        if (aprwVarA == aejdVar.d) {
                            r10 = aprbVar;
                        }
                    }
                }
                if (r10 == 0) {
                    return ahng.m(new InvalidParameterException());
                }
                zwb zwbVar = aejdVar.b;
                return aejdVar.a.a(zwbVar.u() ? aeom.a(zwbVar.e().k()) : aeom.b("SignedOutID"), r10, new aaly(2));
            case 19:
                return ((qrx) ((aejd) this.a).f.a).a(new xfj(System.currentTimeMillis(), 7), MoreExecutors.directExecutor());
            default:
                long jCurrentTimeMillis = System.currentTimeMillis() - ((Long) obj).longValue();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (jCurrentTimeMillis / 3600000 < 24) {
                    return ahng.l();
                }
                Object obj8 = this.a;
                aejd aejdVar2 = (aejd) obj8;
                if (aejdVar2.e.l(133, 45649420L, false)) {
                    return afxd.f(aejdVar2.g.h(aejdVar2.b.e())).h(new aajs(obj8, 17), MoreExecutors.directExecutor());
                }
                xpl xplVar = aejdVar2.g;
                return aejdVar2.c(((wty) aguu.aw((Context) xplVar.a, wty.class, ((syn) xplVar.b).m(aejdVar2.b.e()))).u());
        }
    }
}
