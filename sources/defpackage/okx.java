package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class okx implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ okx(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v30, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v95, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r14v45, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v63, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r14v77, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v67, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.concurrent.Executor] */
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
    public final ListenableFuture a(Object obj) throws IOException, oig {
        String string;
        int i = 7;
        int i2 = 9;
        int i3 = 19;
        int i4 = 0;
        int i5 = 2;
        switch (this.$cid) {
            case 0:
                oip oipVar = (oip) obj;
                if (oipVar == null) {
                    return ahng.n(okz.a);
                }
                ?? r0 = this.c;
                Object obj2 = this.b;
                xgg xggVar = (xgg) this.a;
                return xggVar.E((oiw) obj2, oipVar, r0, new elr(xggVar.d, (byte[]) null));
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    throw new IOException("Subscribing to group failed");
                }
                Object obj3 = this.b;
                Object obj4 = this.a;
                Object obj5 = this.c;
                aihf builder = ((aihn) obj4).toBuilder();
                builder.copyOnWrite();
                oiw oiwVar = (oiw) builder.instance;
                oiwVar.b |= 8;
                oiwVar.f = false;
                oiw oiwVar2 = (oiw) builder.build();
                xgg xggVar2 = (xgg) obj5;
                ListenableFuture listenableFutureG = xggVar2.m.g(oiwVar2);
                ooi ooiVarD = ooi.d(listenableFutureG);
                ojk ojkVar = new ojk(xggVar2, oiwVar2, (oip) obj3, 13);
                ?? r14 = xggVar2.k;
                return xggVar2.s(ooiVarD.f(ojkVar, r14).f(new ods(obj5, i), r14).f(new ods(obj3, 8), r14).f(new okn(obj5, listenableFutureG, 5), r14), new ojk(obj5, obj3, obj4, 7, (char[]) null));
            case 2:
                return ((olc) this.b).p((onu) this.a, (onu) obj, this.c, 1093);
            case 3:
                Object obj6 = this.c;
                olc olcVar = (olc) obj6;
                return ahno.as(olcVar.n(olcVar.a.l((oiw) this.a, (oip) this.b)), new okn(obj6, (onu) obj, i3), olcVar.b);
            case 4:
                return ((olc) this.b).p((onu) this.a, (onu) obj, this.c, 1092);
            case 5:
                ole oleVar = (ole) this.c;
                return ahno.ar(oleVar.b.h((oiz) this.b, (ojb) this.a), new iun((Boolean) obj, 20), oleVar.c);
            case 6:
                ole oleVar2 = (ole) this.b;
                onu onuVar = (onu) obj;
                oleVar2.d.p();
                Object obj7 = this.a;
                if (onb.a(10000L)) {
                    if (onu.d((onu) obj7, onuVar, this.c)) {
                        oleVar2.e.o(1106);
                    } else {
                        oleVar2.e.o(1103);
                    }
                }
                onu onuVar2 = (onu) obj7;
                if (onuVar2.a) {
                    List list = (List) onuVar2.a();
                    list.getClass();
                    return ahng.n(list);
                }
                Object objB = onuVar2.b();
                objB.getClass();
                return ahng.m((Throwable) objB);
            case 7:
                Object obj8 = this.c;
                ole oleVar3 = (ole) obj8;
                return ahno.as(oleVar3.b(oleVar3.b.h((oiz) this.b, (ojb) this.a)), new olb(obj8, (onu) obj, i2), oleVar3.c);
            case 8:
                if (!((Boolean) obj).booleanValue()) {
                    return aher.a;
                }
                Object obj9 = this.c;
                Object obj10 = this.b;
                Object obj11 = this.a;
                olp olpVar = (olp) obj11;
                ListenableFuture listenableFutureI = olpVar.m.i((oiw) obj10, false);
                ooi ooiVarD2 = ooi.d(listenableFutureI);
                okx okxVar = new okx(obj11, obj10, obj9, 9, (char[]) null);
                Executor executor = olpVar.g;
                return ooiVarD2.f(okxVar, executor).f(new olb(obj11, listenableFutureI, i3), executor);
            case 9:
                oip oipVar2 = (oip) obj;
                if (oipVar2 == null) {
                    return ahng.n(okz.a);
                }
                ?? r1 = this.c;
                Object obj12 = this.b;
                olp olpVar2 = (olp) this.a;
                return olpVar2.m.E((oiw) obj12, oipVar2, r1, new elr(olpVar2.k, (byte[]) null));
            case 10:
                ojb ojbVar = (ojb) obj;
                oiv oivVarA = oiv.a(ojbVar.d);
                if (oivVarA == null) {
                    oivVarA = oiv.NONE;
                }
                if (oivVarA != oiv.DOWNLOAD_COMPLETE) {
                    return aher.a;
                }
                Object obj13 = this.b;
                Object obj14 = this.a;
                Object obj15 = this.c;
                omn omnVar = (omn) obj15;
                ooi ooiVarD3 = ooi.d(omnVar.d((oiz) obj14));
                byte[] bArr = null;
                okx okxVar2 = new okx(obj15, (Object) ojbVar, obj13, 11, bArr);
                ?? r15 = omnVar.b;
                return ooiVarD3.f(okxVar2, r15).c(oig.class, new okx(obj15, (Object) ojbVar, obj14, 12, bArr), r15);
            case 11:
                Uri uri = (Uri) obj;
                if (uri == null) {
                    acb acbVarA = oig.a();
                    acbVarA.b = oif.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                    throw acbVarA.a();
                }
                Object obj16 = this.a;
                Object obj17 = this.c;
                if (!((ojb) obj16).e) {
                    oin oinVar = (oin) this.b;
                    omu.d((ayq) ((omn) obj17).a, oinVar, uri, oinVar.g);
                } else if (!((ayq) ((omn) obj17).a).ac(uri)) {
                    acb acbVarA2 = oig.a();
                    acbVarA2.b = oif.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                    throw acbVarA2.a();
                }
                return aher.a;
            case 12:
                onb.d("%s: reVerifyFile lost or corrupted code %s", "SharedFileManager", ((oig) obj).a);
                aihf builder2 = ((aihn) this.a).toBuilder();
                oiv oivVar = oiv.CORRUPTED;
                builder2.copyOnWrite();
                ojb ojbVar2 = (ojb) builder2.instance;
                ojbVar2.d = oivVar.h;
                ojbVar2.b |= 2;
                ojb ojbVar3 = (ojb) builder2.build();
                omn omnVar2 = (omn) this.c;
                return ooi.d(omnVar2.d.h((oiz) this.b, ojbVar3)).f(new oly(i5), omnVar2.b);
            case 13:
                Object obj18 = this.c;
                oiv oivVar2 = oiv.DOWNLOAD_IN_PROGRESS;
                aihf aihfVar = (aihf) obj18;
                aihfVar.copyOnWrite();
                ojb ojbVar4 = (ojb) aihfVar.instance;
                ojb ojbVar5 = ojb.a;
                ojbVar4.d = oivVar2.h;
                ojbVar4.b |= 2;
                return ((omn) this.a).d.h((oiz) this.b, (ojb) aihfVar.build());
            case 14:
                String str = (String) obj;
                int iAS = a.aS(((oiz) this.a).f);
                return ((omn) this.c).j(iAS != 0 ? iAS : 1, str, ((oin) this.b).g);
            case 15:
                ojb ojbVar6 = (ojb) obj;
                aihf builder3 = ojbVar6.toBuilder();
                builder3.copyOnWrite();
                ojb ojbVar7 = (ojb) builder3.instance;
                oiv oivVar3 = (oiv) this.b;
                ojbVar7.d = oivVar3.h;
                ojbVar7.b |= 2;
                if (oivVar3.equals(oiv.CORRUPTED)) {
                    int i6 = ojbVar6.h + 1;
                    builder3.copyOnWrite();
                    ojb ojbVar8 = (ojb) builder3.instance;
                    ojbVar8.b |= 32;
                    ojbVar8.h = i6;
                }
                return this.c.h((oiz) this.a, (ojb) builder3.build());
            case 16:
                agev agevVar = (agev) obj;
                if (agevVar.g()) {
                    return (ListenableFuture) agevVar.c();
                }
                Object obj19 = this.b;
                Object obj20 = this.a;
                Object obj21 = this.c;
                ahev ahevVar = new ahev(new fxv(7));
                ols olsVar = new ols(obj21, obj20, 11);
                syn synVar = (syn) obj21;
                ?? r4 = synVar.a;
                ListenableFuture listenableFutureAs = ahno.as(ahevVar, olsVar, r4);
                oka okaVar = (oka) obj19;
                ahno.at(listenableFutureAs, new hqd(synVar, (oob) obj20, okaVar, 4), MoreExecutors.directExecutor());
                return ahno.as(((syn) synVar.c).p(okaVar.a, listenableFutureAs), new ols(ahevVar, listenableFutureAs, 12), r4);
            case 17:
                List listQ = (List) obj;
                qmn qmnVar = (qmn) this.a;
                if (!qmnVar.e) {
                    listQ = agke.q("");
                }
                agjz agjzVar = new agjz(4);
                Iterator it = listQ.iterator();
                while (true) {
                    Object obj22 = this.b;
                    if (!it.hasNext()) {
                        return ahng.g(agjzVar.g()).a(new fxv(9), ((qkh) obj22).b());
                    }
                    Object obj23 = this.c;
                    String str2 = (String) it.next();
                    hhc hhcVar = qmx.a;
                    if (hhcVar == null || !hhcVar.b((String) obj23, str2)) {
                        qkh qkhVar = (qkh) obj22;
                        qnc qncVar = new qnc(qkhVar, (String) obj23, str2, qmnVar.c);
                        if (qmnVar.d) {
                            string = qkhVar.c.getSharedPreferences("PhenotypeStickyAccount", 0).getString(qmnVar.a, "");
                        } else {
                            string = str2;
                        }
                        ListenableFuture listenableFutureB = qncVar.b(string);
                        agjzVar.h(aheo.p(listenableFutureB).r(new qmu(qncVar, i4), qkhVar.b()).r(new qmw(qkhVar, listenableFutureB, qmnVar, str2, 1), qkhVar.b()));
                    }
                }
                break;
            case 18:
                if (!((web) obj).b) {
                    return aher.a;
                }
                Object obj24 = this.a;
                Object obj25 = this.c;
                qkh qkhVar2 = (qkh) this.b;
                return aheo.p(qkhVar2.e().C((String) obj25)).r(new qmu(obj24, i5), qkhVar2.b());
            case 19:
                MessageLite messageLite = (MessageLite) ahng.v(this.a);
                ?? r2 = this.c;
                return !messageLite.equals(ahng.v(r2)) ? ((qrg) this.b).d(r2) : r2;
            default:
                Object obj26 = this.b;
                qzf qzfVar = (qzf) this.a;
                return qzfVar.d(qzfVar.b, qzfVar.c((qvc) obj26, (String) obj), this.c);
        }
    }

    public /* synthetic */ okx(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ okx(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ okx(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ okx(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ okx(ole oleVar, oiz oizVar, ojb ojbVar, int i) {
        this.$cid = i;
        this.c = oleVar;
        this.b = oizVar;
        this.a = ojbVar;
    }
}
