package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.View;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aalq implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aalq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v29, types: [abvn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r10v25, types: [avni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v62, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v68, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v23, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface] */
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
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = 2;
        int i2 = 14;
        int i3 = 13;
        int i4 = 8;
        try {
            switch (this.$cid) {
                case 0:
                    Collection<aamj> collection = (Collection) ahng.v(this.a);
                    Map map = (Map) ahng.v(this.b);
                    agjz agjzVar = new agjz(4);
                    for (aamj aamjVar : collection) {
                        aihf aihfVarCreateBuilder = aoeg.a.createBuilder();
                        String str = aamjVar.a.a;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoeg aoegVar = (aoeg) aihfVarCreateBuilder.instance;
                        aoegVar.b |= 1;
                        aoegVar.c = str;
                        List list = aamjVar.b;
                        aihfVarCreateBuilder.bW(list);
                        int size = list.size();
                        aihfVarCreateBuilder.copyOnWrite();
                        aoeg aoegVar2 = (aoeg) aihfVarCreateBuilder.instance;
                        aoegVar2.b |= 2;
                        aoegVar2.e = size;
                        aohx aohxVar = aamjVar.c;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoeg aoegVar3 = (aoeg) aihfVarCreateBuilder.instance;
                        aoegVar3.k = aohxVar.l;
                        aoegVar3.b |= SemanticState.Focused;
                        aogf aogfVar = aamjVar.h;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoeg aoegVar4 = (aoeg) aihfVarCreateBuilder.instance;
                        aoegVar4.m = aogfVar.e;
                        aoegVar4.b |= SemanticState.ReadOnly;
                        long j = aamjVar.g;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoeg aoegVar5 = (aoeg) aihfVarCreateBuilder.instance;
                        aoegVar5.b |= SemanticState.LiveRegion;
                        aoegVar5.l = j;
                        aody aodyVar = (aody) map.get(str);
                        if (aodyVar != null) {
                            aihfVarCreateBuilder.copyOnWrite();
                            aoeg aoegVar6 = (aoeg) aihfVarCreateBuilder.instance;
                            aoegVar6.n = aodyVar;
                            aoegVar6.b |= SemanticState.Modal;
                        }
                        agjzVar.h((aoeg) aihfVarCreateBuilder.build());
                    }
                    return agjzVar.g();
                case 1:
                    AtomicReference atomicReference = ((aalp) this.a).j.h;
                    aaof aaofVar = (aaof) atomicReference.get();
                    Set setI = aaofVar == null ? agpr.a : aaofVar.i();
                    Object obj = this.b;
                    agkz agkzVarD = aalp.d(setI);
                    aihf aihfVar = (aihf) obj;
                    aihfVar.copyOnWrite();
                    aoec aoecVar = (aoec) aihfVar.instance;
                    aoec aoecVar2 = aoec.a;
                    aiie aiieVar = aoecVar.g;
                    if (!aiieVar.c()) {
                        aoecVar.g = aihn.mutableCopy(aiieVar);
                    }
                    aifs.addAll(agkzVarD, aoecVar.g);
                    aaof aaofVar2 = (aaof) atomicReference.get();
                    agkz agkzVarD2 = aalp.d(aaofVar2 == null ? agpr.a : aaofVar2.g());
                    aihfVar.copyOnWrite();
                    aoec aoecVar3 = (aoec) aihfVar.instance;
                    aiie aiieVar2 = aoecVar3.h;
                    if (!aiieVar2.c()) {
                        aoecVar3.h = aihn.mutableCopy(aiieVar2);
                    }
                    aifs.addAll(agkzVarD2, aoecVar3.h);
                    aaof aaofVar3 = (aaof) atomicReference.get();
                    agkz agkzVarD3 = aalp.d(aaofVar3 == null ? agpr.a : aaofVar3.h());
                    aihfVar.copyOnWrite();
                    aoec aoecVar4 = (aoec) aihfVar.instance;
                    aiie aiieVar3 = aoecVar4.i;
                    if (!aiieVar3.c()) {
                        aoecVar4.i = aihn.mutableCopy(aiieVar3);
                    }
                    aifs.addAll(agkzVarD3, aoecVar4.i);
                    return obj;
                case 2:
                    aart aartVar = ((aals) this.b).d;
                    aartVar.g();
                    return aartVar.d(this.a);
                case 3:
                    return ((vxz) this.a).p(6, 45365257L).af(new acjp(this.b, i4));
                case 4:
                    return tuk.v((View) this.a, true).al(new acmv(this.b, 7), new abxq(i3));
                case 5:
                    return ((ilx) this.a).a.af(new acmv(this.b, i2));
                case 6:
                    acoi acoiVar = (acoi) this.a;
                    return acoiVar.t.t.af(new abqo(acoiVar, this.b, i));
                case 7:
                    acoq acoqVar = (acoq) this.a;
                    Object objA = acoqVar.f.a();
                    objA.getClass();
                    return ((avlh) objA).L(acoqVar.c).al(this.b, new acnt(acop.a, 10));
                case 8:
                    return ((avlr) ((adif) this.b).a).af(new acnt(this.a, i3));
                case 9:
                    return this.a.H().ak(new acnt(this.b, i2));
                case 10:
                    return ((avlr) ((adif) this.b).a).af(new acpf(this.a, 15));
                case 11:
                    ((aegs) this.b).K.A(this.a);
                    return null;
                case 12:
                    ((aehd) this.b).x.A(this.a);
                    return null;
                case 13:
                    return Boolean.valueOf(((aeij) this.a).a.h(this.b));
                case 14:
                    Object obj2 = this.a;
                    Object obj3 = this.b;
                    if (!dvy.a("MULTI_PROFILE")) {
                        twu.d("ProfileStoreManager", 6, "Multi-profile is not supported.", null);
                        ((aeiv) ((axlj) obj2).a).d(44);
                        return null;
                    }
                    axlj axljVar = (axlj) obj2;
                    ?? r1 = axljVar.b;
                    if (((Optional) r1.io()).isEmpty()) {
                        twu.d("ProfileStoreManager", 6, "ProfileStore was null.", null);
                        ((aeiv) axljVar.a).d(45);
                        return null;
                    }
                    elq elqVar = (elq) ((Optional) r1.io()).get();
                    try {
                        if (dvy.e.d()) {
                            return dvo.d(elqVar.a.getOrCreateProfile((String) obj3));
                        }
                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                    } catch (RuntimeException unused) {
                        twu.d("ProfileStoreManager", 6, "Failed to create profile.", null);
                        ((aeiv) axljVar.a).d(46);
                        return null;
                    }
                case 15:
                    Object obj4 = this.a;
                    PackageManager packageManager = ((aekx) this.b).a;
                    ResolveInfo resolveInfo = (ResolveInfo) obj4;
                    return new axq(resolveInfo.loadLabel(packageManager), resolveInfo.loadIcon(packageManager));
                case 16:
                    Iterator it = ((Set) ((aeql) this.b).b.io()).iterator();
                    while (true) {
                        Object obj5 = this.a;
                        if (!it.hasNext()) {
                            return obj5;
                        }
                        try {
                            ((wfv) it.next()).b((Bundle) obj5);
                        } catch (RuntimeException e) {
                            ((agrc) ((agrc) ((agrc) aeql.a.b()).j(e)).k("com/google/android/libraries/youtube/systemhealth/feedback/FeedbackDataTracker", "fillBlockingFeedbackData", 'n', "FeedbackDataTracker.java")).t("Failed to fill blocking feedback data.");
                        }
                    }
                    break;
                case 17:
                    aihf aihfVar2 = (aihf) ahng.v(this.a);
                    ?? r10 = this.b;
                    if (r10.isCancelled()) {
                        aihfVar2.copyOnWrite();
                        aqid aqidVar = (aqid) aihfVar2.instance;
                        aqid aqidVar2 = aqid.a;
                        aqidVar.b |= 8;
                        aqidVar.f = 1;
                    } else {
                        aqic aqicVar = (aqic) ahng.v(r10);
                        if (!aqicVar.equals(aqic.a)) {
                            aihfVar2.copyOnWrite();
                            aqid aqidVar3 = (aqid) aihfVar2.instance;
                            aqid aqidVar4 = aqid.a;
                            aqicVar.getClass();
                            aiie aiieVar4 = aqidVar3.g;
                            if (!aiieVar4.c()) {
                                aqidVar3.g = aihn.mutableCopy(aiieVar4);
                            }
                            aqidVar3.g.add(aqicVar);
                        }
                    }
                    return (aqid) aihfVar2.build();
                case 18:
                    ?? r0 = this.b;
                    ?? r11 = this.a;
                    agrf agrfVar = afja.a;
                    ahng.v(r11);
                    ahng.v(r0);
                    return null;
                case 19:
                    StringBuilder sb = new StringBuilder();
                    afra afraVar = (afra) this.b;
                    sb.append(afraVar.a);
                    sb.append(".pb");
                    jij jijVar = (jij) ((afiz) ((ahub) this.a).a).b(afraVar.c, sb.toString()).b;
                    jijVar.E().getParentFile().mkdirs();
                    return ((auor) jijVar.c).j((afqw) jijVar.a, (String) jijVar.b);
                default:
                    this.b.run();
                    return this.a;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public /* synthetic */ aalq(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
