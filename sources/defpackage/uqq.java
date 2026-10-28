package defpackage;

import android.graphics.PointF;
import android.os.Bundle;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uqq implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uqq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v55, types: [abke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, wnf] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, wnf] */
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
    @Override // java.util.function.Supplier
    public final Object get() {
        Optional optionalEmpty;
        switch (this.$cid) {
            case 0:
                Object obj = this.a;
                Object obj2 = this.b;
                hqb hqbVar = new hqb(obj, obj2, 15);
                Optional optional = ((uro) obj2).c;
                if (true != optional.isPresent()) {
                    return optional;
                }
                Optional optionalB = ((uqx) hqbVar.a).b((PointF) optional.get(), ((uro) hqbVar.b).f);
                optionalB.getClass();
                return optionalB;
            case 1:
                return Collection.EL.stream(((agqq) this.a).c(((Duration) this.b).plusNanos(1000L))).findFirst();
            case 2:
                Object obj3 = this.a;
                vnr vnrVar = (vnr) obj3;
                vps vpsVar = vnrVar.c;
                abxu abxuVar = vnrVar.y;
                xgn xgnVar = ((vmz) obj3).e;
                ?? r3 = this.b;
                return vnrVar.w.b(xgnVar, r3, abxuVar.q(r3, xgnVar, (vnb) obj3), vnrVar, vpsVar);
            case 3:
                Object obj4 = this.a;
                vnr vnrVar2 = (vnr) obj4;
                vnrVar2.y.q(this.b, ((vmz) obj4).e, (vnb) obj4);
                return vnrVar2.C.r();
            case 4:
                Optional optionalM = ((xpc) this.a).b.m(((algt) this.b).b);
                return true == optionalM.isPresent() ? xpc.g((dii) optionalM.get()) : optionalM;
            case 5:
                String str = ((algt) this.b).b;
                Object obj5 = this.a;
                xsa xsaVar = ((xpc) obj5).b;
                if (xsaVar.d != null) {
                    Iterator it = xsaVar.l(false, false).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            dii diiVar = (dii) it.next();
                            if (!xsa.e(diiVar) && xsa.b(str, diiVar.d)) {
                                optionalEmpty = Optional.of(diiVar);
                            }
                        } else {
                            optionalEmpty = Optional.empty();
                        }
                    }
                } else {
                    optionalEmpty = Optional.empty();
                }
                vre vreVar = new vre(obj5, 4);
                if (true == optionalEmpty.isPresent()) {
                    Object obj6 = optionalEmpty.get();
                    Object obj7 = vreVar.a;
                    Bundle bundle = ((dii) obj6).s;
                    Optional optionalEmpty2 = bundle == null ? Optional.empty() : Optional.ofNullable(((xpc) obj7).k.c(bundle)).or(new vnn(obj6, 9));
                    optionalEmpty2.getClass();
                    return optionalEmpty2;
                }
                break;
            case 6:
                Optional optionalE = ((xpc) this.a).k.e((String) this.b);
                return true == optionalE.isPresent() ? Optional.ofNullable(((xvn) optionalE.get()).c) : optionalE;
            case 7:
                zhl zhlVar = (zhl) this.b;
                return zhlVar.b() != 0.0f ? Optional.of(Float.valueOf(zhlVar.b())) : ((wiu) this.a).L();
            case 8:
                zhl zhlVar2 = (zhl) this.b;
                float fA = zhlVar2.a();
                Object obj8 = this.a;
                if (fA != 0.0f) {
                    wiu wiuVar = (wiu) obj8;
                    if (wiuVar.L().isPresent() && ((Float) wiuVar.L().get()).floatValue() != -19.0f) {
                        return Optional.of(Float.valueOf(zhlVar2.a()));
                    }
                }
                return ((wiu) obj8).L();
            case 9:
                return ((aapd) ((aapa) this.a).b.io()).a((abnl) this.b);
            case 10:
                return ((aapd) ((aapa) this.a).b.io()).a((abnl) this.b);
            case 11:
                return ((aapd) ((aapa) this.a).b.io()).a((abnl) this.b);
            case 12:
                return tzk.c(((aapd) ((aapa) this.a).b.io()).a((abnl) this.b)).k();
            case 13:
                ?? r0 = this.b;
                abnl abnlVarN = r0.n();
                if (abnlVarN != null) {
                    ((agrc) ((agrc) abiz.j.c()).k("com/google/android/libraries/youtube/player/features/queue/AbstractNavigablePlaybackQueue", "getVideoItemForNavigationHelper", 206, "AbstractNavigablePlaybackQueue.java")).w("cannot resolve INSERT navigation within the queue list, PSD=%s", abnlVarN);
                }
                abiz abizVar = (abiz) this.a;
                int iMax = Math.max(0, abizVar.hd() + 1);
                abizVar.ha(0, iMax, Collections.singleton(r0));
                return Optional.of(new abiy(r0, iMax));
            default:
                optionalEmpty = Optional.ofNullable(((acfg) this.a).o);
                rub rubVar = new rub(this.b, 6);
                if (true == optionalEmpty.isPresent()) {
                    if (true != ((acfs) optionalEmpty.get()).E().equals(rubVar.a)) {
                        return Optional.empty();
                    }
                }
                break;
        }
        return optionalEmpty;
    }

    public /* synthetic */ uqq(zjr zjrVar, wiu wiuVar, int i) {
        this.$cid = i;
        this.b = zjrVar;
        this.a = wiuVar;
    }
}
