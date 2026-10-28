package defpackage;

import android.content.Intent;
import com.google.android.libraries.elements.interfaces.ResourceEntry;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class okv implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ okv(axfd axfdVar, affd affdVar, afff afffVar, int i) {
        this.$cid = i;
        this.b = axfdVar;
        this.a = affdVar;
        this.c = afffVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v19, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ola] */
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
        almd almdVar;
        ahcs ahcqVar;
        affd affdVar;
        int i = 1;
        switch (this.$cid) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (true) {
                    ?? r0 = this.b;
                    Object obj2 = this.a;
                    if (!it.hasNext()) {
                        return new kjc(new ahek(false, agke.j(r0))).N(new okp(2), ((xgg) obj2).k);
                    }
                    Object obj3 = this.c;
                    oiw oiwVar = (oiw) it.next();
                    xgg xggVar = (xgg) obj2;
                    r0.add(xggVar.s(xggVar.m.g(oiwVar), new okn(obj3, (aihn) oiwVar, 10)));
                }
                break;
            case 1:
                gnq gnqVar = (gnq) obj;
                Object obj4 = this.a;
                gmy gmyVar = (gmy) obj4;
                if (gmyVar.p.l(206, 45734052L, false) && gnqVar.b.a) {
                    if (hdu.g.contains(this.b) && (almdVar = gnqVar.a.a) != null && (almdVar.b & 2) != 0) {
                        allx allxVar = almdVar.d;
                        if (allxVar == null) {
                            allxVar = allx.a;
                        }
                        if (allxVar.b == 99965204) {
                            allx allxVar2 = almdVar.d;
                            if (allxVar2 == null) {
                                allxVar2 = allx.a;
                            }
                            anpf anpfVar = allxVar2.b == 99965204 ? (anpf) allxVar2.c : anpf.a;
                            if ((anpfVar.b & 4) != 0) {
                                apji apjiVar = anpfVar.d;
                                if (apjiVar == null) {
                                    apjiVar = apji.a;
                                }
                                aihl aihlVarCheckIsLite = aihn.checkIsLite(anxo.a);
                                apjiVar.c(aihlVarCheckIsLite);
                                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                                    apji apjiVar2 = anpfVar.d;
                                    if (apjiVar2 == null) {
                                        apjiVar2 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anxo.a);
                                    apjiVar2.c(aihlVarCheckIsLite2);
                                    Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                                    if ((((anxn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b & 16) != 0) {
                                        heh hehVarA = ((heh) this.c).a();
                                        hehVarA.g();
                                        hehVarA.h(2);
                                        return afxd.f(gmyVar.a(hehVarA)).h(new gqb(obj4, hehVarA, i), gmyVar.k);
                                    }
                                }
                            }
                        }
                    }
                }
                return gnqVar == null ? aher.a : new aher(gnqVar);
            case 2:
                ?? r2 = this.c;
                ahno.R(r2.isDone(), "Future was expected to be done: %s", r2);
                ?? r4 = this.b;
                Object objI = a.i(r2);
                ahno.R(r4.isDone(), "Future was expected to be done: %s", r4);
                boolean zEquals = objI.equals(a.i(r4));
                Object obj5 = this.a;
                if (zEquals) {
                    return obj == null ? aher.a : new aher(obj);
                }
                idm idmVar = new idm(obj5, r4, 11);
                long j = afwl.a;
                ahdb ahdbVar = new ahdb(afty.c(false), idmVar, 1);
                qrt qrtVar = (qrt) obj5;
                Executor executor = qrtVar.b;
                ahcqVar = new ahcq(r4, ahdbVar);
                r4.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
                synchronized (qrtVar.d) {
                    break;
                }
                break;
            case 3:
                return ((qrx) this.a).b.i(this.c, this.b);
            case 4:
                return ((qrx) ((hwe) this.a).a).b.i(this.c, this.b);
            case 5:
                ResourceEntry resourceEntry = (ResourceEntry) obj;
                asbr asbrVar = (asbr) aihn.parseFrom(asbr.a, resourceEntry.getResourceBytes(), ExtensionRegistryLite.getGeneratedRegistry());
                ConcurrentHashMap concurrentHashMap = ((wag) this.c).h;
                String str = ((asjk) this.b).b;
                concurrentHashMap.put(str, resourceEntry);
                return new aher(new waf(asbrVar, str, (vzz) this.a));
            case 6:
                affg affgVar = (affg) obj;
                if (affgVar.c != null || (affdVar = affgVar.a) == null) {
                    return this.b;
                }
                return ((axfd) this.c).k(affdVar, (Intent) this.a, affgVar.e);
            default:
                afhm afhmVar = (afhm) obj;
                boolean z = afhmVar.a;
                Object obj6 = this.a;
                Object obj7 = this.c;
                if (!z) {
                    return new aher(new affg((affd) obj6, afhq.a, afhmVar, null, (afff) obj7));
                }
                ListenableFuture listenableFutureY = ((abhh) ((axfd) this.b).e).y((affd) obj6);
                idv idvVar = new idv(afhmVar, obj7, 7, null);
                long j2 = afwl.a;
                afwi afwiVar = new afwi(afty.c(false), idvVar);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                ahcqVar = new ahcr(listenableFutureY, afwiVar);
                listenableFutureY.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
                break;
                break;
        }
        return ahcqVar;
    }

    public /* synthetic */ okv(axfd axfdVar, Intent intent, ListenableFuture listenableFuture, int i) {
        this.$cid = i;
        this.c = axfdVar;
        this.a = intent;
        this.b = listenableFuture;
    }

    public /* synthetic */ okv(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ okv(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ okv(wag wagVar, asjk asjkVar, vzz vzzVar, int i) {
        this.$cid = i;
        this.c = wagVar;
        this.b = asjkVar;
        this.a = vzzVar;
    }
}
