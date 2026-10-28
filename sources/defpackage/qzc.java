package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qzc implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qzc(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v69, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v71, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v73, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v79, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r15v43, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r15v45, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r15v73, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v10, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r1v56, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Set] */
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
        rmj rmjVar;
        rmi rmiVar;
        wnt wntVar;
        Throwable th;
        int i = 12;
        int i2 = 3;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.b;
                qzf qzfVar = (qzf) this.a;
                return qzfVar.d(qzfVar.b, qzfVar.c((qvc) obj2, (String) obj), this.c);
            case 1:
                Object obj3 = this.b;
                qzf qzfVar2 = (qzf) this.a;
                return qzfVar2.d(qzfVar2.b, qzfVar2.c((qvc) obj3, (String) obj), this.c);
            case 2:
                Object obj4 = this.b;
                qzf qzfVar3 = (qzf) this.a;
                return qzfVar3.d(qzfVar3.b, qzfVar3.c((qvc) obj4, (String) obj), this.c);
            case 3:
                rmh rmhVar = (rmh) obj;
                do {
                    Object obj5 = this.b;
                    rmjVar = (rmj) this.a;
                    rmiVar = (rmi) rmjVar.d.get();
                    wntVar = new wnt(rmiVar);
                    if (obj5 != null) {
                        Object hashSet = wntVar.c;
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        wntVar.c = hashSet;
                        wntVar.c.add(obj5);
                    }
                    th = rmhVar.b;
                    if (th == null) {
                        wntVar.a = obj5;
                        wntVar.b = null;
                    }
                } while (!rmjVar.B(rmiVar, wntVar));
                if (th == null) {
                    return ((axfd) this.c).P(rmhVar.a);
                }
                return ahng.m(th);
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj6 = this.b;
                if (!zBooleanValue) {
                    return ahng.n(obj6);
                }
                ?? r15 = this.c;
                return rrx.f(ahno.ap(this.a, r15), obj6, 10L, r15);
            case 5:
                return ahno.ar(((qrx) obj).a(this.a, this.c), new rwj(this.b, i2), MoreExecutors.directExecutor());
            case 6:
                alps alpsVar = (alps) obj;
                int i4 = alpsVar.b & SemanticState.Focused;
                Object obj7 = this.b;
                if (i4 != 0) {
                    amud amudVar = alpsVar.g;
                    if (amudVar == null) {
                        amudVar = amud.b;
                    }
                    xgj xgjVar = new xgj(amudVar);
                    roq roqVar = ((vcl) obj7).o;
                    new ugo(roqVar, xgjVar).c();
                    new ugo(roqVar, xgjVar).f();
                }
                if ((alpsVar.b & 8) != 0) {
                    vcl vclVar = (vcl) obj7;
                    vxe vxeVar = vclVar.c;
                    ajwo ajwoVar = alpsVar.e;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar.a(ajwoVar);
                    IllegalStateException illegalStateException = new IllegalStateException("Received error during I2T.");
                    vclVar.f(illegalStateException, "Received error during I2T.", 0);
                    return ahng.m(illegalStateException);
                }
                if (alpsVar.d.size() == 0) {
                    ((vcl) obj7).g("[MediaGeneration][Android] Received zero prompt.");
                    return ahng.m(new IllegalArgumentException("Received zero prompt."));
                }
                Object obj8 = this.a;
                aihf builder = asdf.a.toBuilder();
                builder.copyOnWrite();
                asdf asdfVar = (asdf) builder.instance;
                obj8.getClass();
                asdfVar.b |= 1;
                asdfVar.d = (String) obj8;
                asdf asdfVar2 = (asdf) builder.build();
                for (akgn akgnVar : alpsVar.d) {
                    if (akgnVar.b == 6) {
                        aihf builder2 = asdfVar2.toBuilder();
                        builder2.cv(akgnVar.b == 6 ? (akhn) akgnVar.c : akhn.a);
                        asdfVar2 = (asdf) builder2.build();
                    }
                }
                ((vcl) obj7).d.put(this.c, asdfVar2);
                return ahng.n(asdfVar2);
            case 7:
                alps alpsVar2 = (alps) obj;
                int i5 = alpsVar2.b & SemanticState.Focused;
                Object obj9 = this.b;
                if (i5 != 0) {
                    amud amudVar2 = alpsVar2.g;
                    if (amudVar2 == null) {
                        amudVar2 = amud.b;
                    }
                    xgj xgjVar2 = new xgj(amudVar2);
                    roq roqVar2 = ((vcl) obj9).o;
                    new ugo(roqVar2, xgjVar2).c();
                    new ugo(roqVar2, xgjVar2).f();
                }
                if ((alpsVar2.b & 8) != 0) {
                    vcl vclVar2 = (vcl) obj9;
                    vxe vxeVar2 = vclVar2.c;
                    ajwo ajwoVar2 = alpsVar2.e;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    vxeVar2.a(ajwoVar2);
                    IllegalStateException illegalStateException2 = new IllegalStateException("Received error during I2T.");
                    vclVar2.f(illegalStateException2, "Received error during I2T.", 0);
                    vclVar2.h("aa");
                    return ahng.m(illegalStateException2);
                }
                if (alpsVar2.d.size() == 0) {
                    vcl vclVar3 = (vcl) obj9;
                    vclVar3.g("[MediaGeneration][Android] Received zero prompt.");
                    vclVar3.h("aa");
                    return ahng.m(new IllegalArgumentException("Received zero prompt."));
                }
                Object obj10 = this.a;
                aihf aihfVarCreateBuilder = ascz.a.createBuilder();
                String str = ((ascy) obj10).b;
                aihfVarCreateBuilder.copyOnWrite();
                ascz asczVar = (ascz) aihfVarCreateBuilder.instance;
                str.getClass();
                asczVar.b |= 1;
                asczVar.d = str;
                for (akgn akgnVar2 : alpsVar2.d) {
                    int i6 = akgnVar2.b;
                    if (i6 == 6) {
                        akhn akhnVar = i6 == 6 ? (akhn) akgnVar2.c : akhn.a;
                        aihfVarCreateBuilder.copyOnWrite();
                        ascz asczVar2 = (ascz) aihfVarCreateBuilder.instance;
                        akhnVar.getClass();
                        aiie aiieVar = asczVar2.c;
                        if (!aiieVar.c()) {
                            asczVar2.c = aihn.mutableCopy(aiieVar);
                        }
                        asczVar2.c.add(akhnVar);
                    }
                }
                Object obj11 = this.c;
                ascz asczVar3 = (ascz) aihfVarCreateBuilder.build();
                vcl vclVar4 = (vcl) obj9;
                vclVar4.g.put(obj11, asczVar3);
                vclVar4.h("aft");
                return ahng.n(asczVar3);
            case 8:
                ascv ascvVar = (ascv) obj;
                boolean zIsEmpty = ascvVar.c.isEmpty();
                Object obj12 = this.b;
                if (zIsEmpty) {
                    ((vcl) obj12).g("[MediaGeneration][Android] Received empty post id.");
                    return ahng.m(new IllegalArgumentException("Received empty post id."));
                }
                Object obj13 = this.a;
                Object obj14 = this.c;
                String str2 = ascvVar.c;
                String str3 = ((asde) obj13).c;
                aihf aihfVarCreateBuilder2 = akoy.a.createBuilder();
                aihf aihfVarCreateBuilder3 = aljm.a.createBuilder();
                aihf aihfVarCreateBuilder4 = akhb.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                akhb akhbVar = (akhb) aihfVarCreateBuilder4.instance;
                str2.getClass();
                akhbVar.b = 8;
                akhbVar.c = str2;
                akhb akhbVar2 = (akhb) aihfVarCreateBuilder4.build();
                aihfVarCreateBuilder3.copyOnWrite();
                aljm aljmVar = (aljm) aihfVarCreateBuilder3.instance;
                akhbVar2.getClass();
                aljmVar.c = akhbVar2;
                aljmVar.b |= 1;
                aihfVarCreateBuilder3.copyOnWrite();
                aljm aljmVar2 = (aljm) aihfVarCreateBuilder3.instance;
                aljmVar2.d = 1;
                aljmVar2.b |= 2;
                aljm aljmVar3 = (aljm) aihfVarCreateBuilder3.build();
                aihfVarCreateBuilder2.copyOnWrite();
                akoy akoyVar = (akoy) aihfVarCreateBuilder2.instance;
                aljmVar3.getClass();
                akoyVar.c = aljmVar3;
                akoyVar.b = 13;
                return ahno.as(((vcl) obj12).d((akoy) aihfVarCreateBuilder2.build(), str3), new qzc(obj12, (Object) str2, obj14, 6, (byte[]) null), MoreExecutors.directExecutor());
            case 9:
                return ((vmx) this.b).b((ajwo) this.c, this.a, true);
            case 10:
                agev agevVar = (agev) obj;
                boolean zG = agevVar.g();
                Object obj15 = this.a;
                if (zG) {
                    ((wkf) obj15).m = (ajgu) agevVar.c();
                }
                return ((wom) this.b).i((woo) obj15, this.c);
            case 11:
                wom womVar = (wom) this.b;
                return ahno.ar(((wok) aguu.aw(womVar.j, wok.class, ((syn) womVar.k.io()).m(this.a))).b().v((ajgq) this.c, agpn.b), new vxq(9), MoreExecutors.directExecutor());
            case 12:
                zwq zwqVar = (zwq) obj;
                String strC = typ.c(zwqVar.b());
                int iC = zwqVar.c();
                Object obj16 = this.a;
                if (iC != 1 || strC.isEmpty()) {
                    Exception excA = zwqVar.a();
                    return excA != null ? ahng.m(excA) : ahng.m((Throwable) this.b);
                }
                typ.f(strC);
                aihf aihfVarCreateBuilder5 = apcu.a.createBuilder();
                aihfVarCreateBuilder5.copyOnWrite();
                apcu apcuVar = (apcu) aihfVarCreateBuilder5.instance;
                apcuVar.b |= 1;
                apcuVar.c = strC;
                wkf wkfVar = (wkf) obj16;
                wkfVar.n = (apcu) aihfVarCreateBuilder5.build();
                synchronized (wkfVar.p) {
                    ((wkf) obj16).C = null;
                    ((wkf) obj16).q = null;
                    break;
                }
                return ((woz) this.c).f.b((wlu) obj16, MoreExecutors.directExecutor(), null);
            case 13:
                return ahno.ar(((wrt) aguu.aw(((wrv) this.b).f, wrt.class, (affd) obj)).b().v((ajgq) this.c, this.a), new vxq(12), MoreExecutors.directExecutor());
            case 14:
                agev agevVar2 = (agev) obj;
                boolean zG2 = agevVar2.g();
                Object obj17 = this.a;
                if (zG2) {
                    ((wkf) obj17).m = (ajgu) agevVar2.c();
                }
                return ((wrv) this.b).g.f((wlu) obj17, this.c);
            case 15:
                Optional optional = (Optional) obj;
                boolean zIsEmpty2 = optional.isEmpty();
                Object obj18 = this.b;
                if (!zIsEmpty2) {
                    ((wkf) obj18).m = (ajgu) optional.get();
                }
                return ((wnh) ((abqx) this.a).h).b((wlu) obj18, this.c, null);
            case 16:
                Optional optional2 = (Optional) obj;
                boolean zIsEmpty3 = optional2.isEmpty();
                Object obj19 = this.b;
                if (!zIsEmpty3) {
                    ((wkf) obj19).m = (ajgu) optional2.get();
                }
                return ((wvi) this.a).g.b((wlu) obj19, this.c, null);
            case 17:
                Optional optional3 = (Optional) obj;
                boolean zIsEmpty4 = optional3.isEmpty();
                Object obj20 = this.b;
                if (!zIsEmpty4) {
                    ((wkf) obj20).m = (ajgu) optional3.get();
                }
                return ((wvi) this.a).e.b((wlu) obj20, this.c, null);
            case 18:
                return ((yae) this.b).aC((amyu) this.a, (Optional) this.c, (Boolean) obj);
            case 19:
                abqq abqqVar = (abqq) this.c;
                ((elr) abqqVar.e).q(aaan.FAILURE);
                Object obj21 = abqqVar.f;
                String str4 = ((ozj) this.b).a;
                ((aaap) obj21).a("Direct reply failed for thread ".concat(str4));
                tld tldVar = (tld) abqqVar.d.io();
                aheo aheoVarP = aheo.p(awrc.ag(tldVar.b, awov.a, new egh(tldVar, (plx) this.a, str4, plb.c(), (awoq) null, 11)));
                agek agekVarA = afwl.a(new xwx(i));
                ?? r0 = abqqVar.g;
                return ((aheo) ahbz.e(aheoVarP, Exception.class, agekVarA, r0)).r(afwl.d(new uzh((Exception) obj, 20)), r0);
            default:
                List list = (List) Collection.EL.stream(this.c).filter(new aajl((agkj) obj, i3)).collect(aghu.a);
                ?? r1 = this.b;
                aagy aagyVar = (aagy) this.a;
                return ahno.ar(aagyVar.e(r1, list), new aagw(list, i2), aagyVar.e ? MoreExecutors.directExecutor() : aagyVar.d);
        }
    }

    public /* synthetic */ qzc(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ qzc(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ qzc(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ qzc(Callable callable, ScheduledExecutorService scheduledExecutorService, Object obj, int i) {
        this.$cid = i;
        this.a = callable;
        this.c = scheduledExecutorService;
        this.b = obj;
    }
}
