package defpackage;

import android.view.accessibility.CaptioningManager;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vtq implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vtq(aihf aihfVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, int i) {
        this.$cid = i;
        this.b = aihfVar;
        this.c = listenableFuture;
        this.a = listenableFuture2;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x02cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v4, types: [axso, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [axso, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [axso, java.lang.Object] */
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
        boolean z;
        avmc avmcVarT;
        boolean zBooleanValue;
        int i = 4;
        int i2 = 14;
        int i3 = 18;
        int i4 = 17;
        int i5 = 16;
        int i6 = 8;
        int i7 = 10;
        int i8 = 0;
        int i9 = 1;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                return ((avlh) this.b).p().ak(new mnt(this.a, this.c, i7, bArr));
            case 1:
                final ?? r1 = this.b;
                final xdi xdiVar = (xdi) this.c;
                return ((avmc) this.a).C(new avni() { // from class: vpx
                    /* JADX WARN: Type inference failed for: r3v20, types: [aunn, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, vsq] */
                    @Override // defpackage.avni
                    public final void a(Object obj) {
                        String strAb;
                        boolean z2;
                        vob vobVarC;
                        Optional optional = (Optional) obj;
                        if (optional.isEmpty()) {
                            return;
                        }
                        vor vorVar = (vor) ((agew) optional.get()).a;
                        ajwo ajwoVar = (ajwo) ((agew) optional.get()).b;
                        Optional optionalB = xdi.b(ajwoVar);
                        if (optionalB.isEmpty() || vorVar.J((apxs) optionalB.get()) || (strAb = tzk.ab((apxs) optionalB.get())) == null) {
                            return;
                        }
                        optionalB.get();
                        apxr apxrVar = ((apxs) optionalB.get()).f;
                        if (apxrVar == null) {
                            apxrVar = apxr.a;
                        }
                        akuf akufVar = apxrVar.c;
                        if (akufVar == null) {
                            akufVar = akuf.a;
                        }
                        akuj akujVar = akufVar.b == 138681066 ? (akuj) akufVar.c : akuj.b;
                        aihf builder = akujVar.toBuilder();
                        int i10 = akujVar.e;
                        if (i10 != 1) {
                            if (((i10 == 18 ? (akud) akujVar.f : akud.a).b & 2) == 0) {
                                aihf builder2 = (akujVar.e == 18 ? (akud) akujVar.f : akud.a).toBuilder();
                                builder2.copyOnWrite();
                                akud akudVar = (akud) builder2.instance;
                                akudVar.b |= 2;
                                akudVar.d = strAb;
                                builder.copyOnWrite();
                                akuj akujVar2 = (akuj) builder.instance;
                                akud akudVar2 = (akud) builder2.build();
                                akudVar2.getClass();
                                akujVar2.f = akudVar2;
                                akujVar2.e = 18;
                            }
                        }
                        if ((akujVar.c & SemanticState.ReadOnly) == 0) {
                            builder.copyOnWrite();
                            akuj akujVar3 = (akuj) builder.instance;
                            akujVar3.p = 1;
                            akujVar3.c |= SemanticState.ReadOnly;
                        }
                        akuj akujVar4 = (akuj) builder.build();
                        boolean zG = vorVar.G(strAb);
                        apxr apxrVar2 = ((apxs) optionalB.get()).f;
                        if (apxrVar2 == null) {
                            apxrVar2 = apxr.a;
                        }
                        int iAS = a.aS(apxrVar2.f);
                        if (iAS == 0) {
                            iAS = 1;
                        }
                        int i11 = iAS - 1;
                        if (i11 == 1) {
                            z2 = true;
                        } else if (i11 != 2) {
                            apxr apxrVar3 = ((apxs) optionalB.get()).f;
                            if (apxrVar3 == null) {
                                apxrVar3 = apxr.a;
                            }
                            z2 = apxrVar3.e;
                        } else {
                            z2 = false;
                        }
                        xdi xdiVar2 = xdiVar;
                        boolean z3 = (zG && z2 && (!((vxz) xdiVar2.c).l(413, 45836026L, false) || ((vobVarC = vorVar.c(strAb)) != null && vobVarC.u() != null && (vobVarC.u().c & 4) != 0))) ? false : true;
                        Map map = r1;
                        vorVar.x(akujVar4, null, z3, true != ((vxz) xdiVar2.a.io()).l(147, 45765124L, false) ? null : ajwoVar, true, null);
                        boolean z4 = z3;
                        Optional optionalEQ = yno.eQ(ajwoVar, vorVar, xdiVar2.b, ((vxz) xdiVar2.d.io()).l(31, 45780065L, false) ? (vnz) tym.U(map, "engagement_panel_close_listener_key", vnz.class) : null, yno.eP((apxs) optionalB.get()), false);
                        if (optionalEQ.isEmpty() || !z4) {
                            return;
                        }
                        if ((akujVar4.c & 4) == 0) {
                            xdi.f((vob) optionalEQ.get(), true);
                        }
                        xdiVar2.d(strAb, (apxs) optionalB.get(), vorVar, (vob) optionalEQ.get(), akujVar4, ajwoVar);
                    }
                });
            case 2:
                return ((avlh) this.a).ac(this.b, new jnx(i7)).ak(new vpi(this.c, i5));
            case 3:
                return ((avlh) this.a).p().ac(this.b, new jnx(11)).ak(new vpi(this.c, i4));
            case 4:
                return avlh.f(this.b, ((vum) this.a).b, new jnx(12)).x(new sqj(i5)).ak(new vpi(this.c, i3));
            case 5:
                Object obj = this.b;
                String str = (String) obj;
                avlm avlmVarR = tzk.f(((wdf) this.c).c.d(str)).r(new ugm(obj, 13));
                aaun aaunVar = new aaun();
                aaunVar.d(str);
                return ((avlr) this.a).U(avlmVarR.h(aaunVar.b()).z());
            case 6:
                String str2 = (String) this.a;
                tge tgeVarA = tgf.a(str2);
                tgeVarA.c("Origin", "package:com.google.android.youtube");
                xnv xnvVar = (xnv) this.c;
                if (xnvVar.p.m(14, 45627566L)) {
                    tgeVarA.d(tok.MDX_DISCOVERY_DIAL_DEVICE_FINDER);
                }
                yno.cL(xnvVar.e, tgeVarA.a(), new xnt(xnvVar, this.b, str2));
                return null;
            case 7:
                Object obj2 = this.b;
                algr algrVar = (algr) obj2;
                boolean z2 = algrVar.d;
                Object obj3 = this.c;
                if (z2) {
                    xot xotVar = (xot) obj3;
                    ycp ycpVar = xotVar.m;
                    if (ycpVar.e != null || (xotVar.k.aE() && ycpVar.j())) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                Object obj4 = this.a;
                avmc avmcVarT2 = avmc.t(Boolean.valueOf(z));
                algq algqVar = (algq) obj4;
                algt algtVar = algqVar.f;
                if (algtVar == null) {
                    algtVar = algt.a;
                }
                avmc avmcVarT3 = !algrVar.e ? avmc.t(Boolean.TRUE) : avmc.m(new xor(obj3, new xvz(algtVar.c), i8));
                avmc avmcVarT4 = !algrVar.c ? avmc.t(Boolean.TRUE) : ((avlh) ((xot) obj3).c.r().n).au().u(new xdx(3)).A(500L, TimeUnit.MILLISECONDS, avmc.t(Boolean.TRUE));
                algt algtVar2 = algqVar.f;
                if (algtVar2 == null) {
                    algtVar2 = algt.a;
                }
                String str3 = algtVar2.b;
                if (algrVar.b || algrVar.f) {
                    awic awicVar = new awic(new wci(obj3, str3, i7), new mkc(obj3, (aihn) obj2, (Object) str3, 6), new vqe(i4));
                    avnn avnnVar = atqp.o;
                    avmcVarT = awicVar;
                } else {
                    avmcVarT = avmc.t(Boolean.TRUE);
                }
                xot xotVar2 = (xot) obj3;
                avmc avmcVarAo = (xotVar2.k.af() && algrVar.g) ? xotVar2.o.e.ao() : avmc.t(Boolean.TRUE);
                algt algtVar3 = algqVar.f;
                if (algtVar3 == null) {
                    algtVar3 = algt.a;
                }
                String str4 = algtVar3.b;
                if (!algrVar.h) {
                    zBooleanValue = true;
                } else if (str4.isEmpty()) {
                    agrx agrxVar = agso.a;
                    zBooleanValue = false;
                } else {
                    zBooleanValue = ((Boolean) xotVar2.l.io()).booleanValue();
                }
                int i10 = 19;
                avmc avmcVarAh = avmc.f(avlh.B(agke.v(avmcVarT2, avmcVarT3, avmcVarT4, avmcVarT, avmcVarAo, avmc.t(Boolean.valueOf(zBooleanValue))))).ah(new sqj(i10));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                awgv awgvVar = new awgv(avmc.t(Boolean.FALSE), new vqe(i3));
                avnn avnnVar2 = atqp.o;
                return avmcVarAh.A(5L, timeUnit, awgvVar).v(xotVar2.i).D(new mnt(obj3, obj4, i2), new vqe(i10));
            case 8:
                return (agke) Collection.EL.stream(this.b).map(new aazx((agkj) ahng.v(this.c), (agkj) ahng.v(this.a), i9, bArr)).collect(aghu.a);
            case 9:
                aajk.f((ug) this.c);
                return aakb.b((rv) ahng.v(this.a), (rv) ahng.v(this.b));
            case 10:
                taf.g(((ug) ahng.v(this.c)).d(), new uqk(i6));
                return aakb.b((rv) ahng.v(this.a), (rv) ahng.v(this.b));
            case 11:
                ug ugVar = (ug) ahng.v(this.a);
                boolean zBooleanValue2 = ((Boolean) ahng.v(this.b)).booleanValue();
                Object obj5 = this.c;
                if (zBooleanValue2) {
                    ((aajt) obj5).i = true;
                }
                aajt aajtVar = (aajt) obj5;
                isi isiVar = aajtVar.j;
                if (!isiVar.R()) {
                    return ugVar;
                }
                ((aajm) aajtVar.f.io()).d();
                if (aajtVar.i) {
                    aajtVar.e.c();
                    aajtVar.i = false;
                }
                aait aaitVar = aajtVar.e;
                aaitVar.e();
                if (isiVar.P() || isiVar.Q()) {
                    aaitVar.b();
                    return ugVar;
                }
                aaitVar.d();
                return ugVar;
            case 12:
                ?? r2 = this.c;
                aakh aakhVar = (aakh) this.a;
                aaqn aaqnVarB = aakhVar.b.b();
                if (!r2.k().equals(aaqnVarB.s())) {
                    aano aanoVar = new aano(aanp.b);
                    aanoVar.d = 35;
                    return aanoVar.a();
                }
                aaew aaewVarD = aaqnVarB.d();
                if (aaewVarD == null) {
                    aano aanoVar2 = new aano(aanp.b);
                    aanoVar2.d = 15;
                    return aanoVar2.a();
                }
                String str5 = (String) this.b;
                aamt aamtVarF = aaewVarD.f(str5);
                if (aamtVarF == null) {
                    aano aanoVar3 = new aano(aanp.c);
                    aanoVar3.d = 26;
                    return aanoVar3.a();
                }
                if (aamtVarF.i != 0) {
                    aaewVarD.Q(str5, 0L);
                    aakhVar.d(str5);
                }
                return aanp.a;
            case 13:
                ((aakz) this.a).a.b(this.c).e().a((String) this.b).b().G();
                return aanp.a;
            case 14:
                Object obj6 = this.b;
                abuy abuyVar = (abuy) this.a;
                alvt alvtVar = (alvt) abuyVar.f.D((byte[]) obj6, alvt.a);
                if (alvtVar == null) {
                    throw new IllegalStateException("Inlined PlayerResponse parsed to null");
                }
                Object obj7 = this.c;
                ahgr ahgrVar = new ahgr();
                isi isiVar2 = abuyVar.e;
                String str6 = (String) ((abnl) obj7).o().orElse(null);
                mbc mbcVar = abuyVar.b;
                ahgrVar.a = isiVar2.A(str6, mbcVar.b()).a(alvtVar);
                ahgrVar.j(mbcVar.f());
                return ahgrVar.i();
            case 15:
                if (!((Boolean) ahng.v(this.b)).booleanValue()) {
                    acag acagVar = (acag) this.a;
                    agev agevVar = (agev) ahng.v(acagVar.k);
                    if (agevVar.g()) {
                        boolean zIsEnabled = ((CaptioningManager) agevVar.c()).isEnabled();
                        if (!zIsEnabled && ((abmt) this.c).n.l(332, 45801823L, false)) {
                            return Boolean.TRUE;
                        }
                        abwv abwvVarA = acagVar.c.a();
                        abwvVarA.b(Boolean.valueOf(zIsEnabled));
                        taf.j(abwvVarA.a(), new abwu(i7));
                    }
                }
                return Boolean.TRUE;
            case 16:
                int iP = a.p(((Long) ahng.v(this.c)).longValue());
                aihf aihfVar = (aihf) this.b;
                aihfVar.copyOnWrite();
                axgj axgjVar = (axgj) aihfVar.instance;
                axgj axgjVar2 = axgj.a;
                axgjVar.b |= 4;
                axgjVar.e = iP;
                long jLongValue = ((Long) ahng.v(this.a)).longValue();
                aihfVar.copyOnWrite();
                axgj axgjVar3 = (axgj) aihfVar.instance;
                axgjVar3.b |= 8;
                axgjVar3.f = jLongValue;
                aihf aihfVarCreateBuilder = axgl.a.createBuilder();
                axgj axgjVar4 = (axgj) aihfVar.build();
                aihfVarCreateBuilder.copyOnWrite();
                axgl axglVar = (axgl) aihfVarCreateBuilder.instance;
                axgjVar4.getClass();
                axglVar.g = axgjVar4;
                axglVar.c |= 8;
                axgl axglVar2 = (axgl) aihfVarCreateBuilder.build();
                qck qckVarA = qck.a();
                qci qciVar = new qci("PERIODIC");
                aihh aihhVar = (aihh) axgh.a.createBuilder();
                aihhVar.e(axgl.b, axglVar2);
                qckVarA.a.a(qciVar, (axgh) aihhVar.build());
                return null;
            default:
                return ((ahpj) this.c).a.submit(new agrq(this.b, this.a, i, bArr));
        }
    }

    public /* synthetic */ vtq(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ vtq(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ vtq(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ vtq(Object obj, zwa zwaVar, String str, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = zwaVar;
        this.b = str;
    }
}
