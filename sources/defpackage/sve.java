package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sve implements vxc {
    private final /* synthetic */ int $cid;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public sve(wpi wpiVar, vxz vxzVar, lqa lqaVar, awmd awmdVar, srr srrVar, vxu vxuVar, Executor executor, int i) {
        this.$cid = i;
        this.a = srrVar;
        vxzVar.getClass();
        this.e = vxzVar;
        lqaVar.getClass();
        this.f = lqaVar;
        wpiVar.getClass();
        this.b = wpiVar;
        awmdVar.getClass();
        this.g = awmdVar;
        vxuVar.getClass();
        this.d = vxuVar;
        this.c = executor;
    }

    private static final aldo d(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aldo.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return (aldo) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, zwh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v8, types: [bog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, zwy] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object, zwb] */
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
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        zh zhVar;
        Optional optionalEmpty;
        Optional optionalEmpty2;
        int i = this.$cid;
        if (i == 0) {
            bp bpVar = (bp) this.f;
            bpVar.iR(false);
            bpVar.gT(((cf) this.a).getSupportFragmentManager(), sud.k);
            ((svo) this.d).b(new svd(this, ajwoVar));
            return;
        }
        if (i == 1) {
            Object obj = (zza) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", zza.class);
            if (obj == null) {
                obj = this.a;
                ((srr) obj).a = map;
            }
            Object objS = tym.S(map, "com.google.android.libraries.youtube.comment.action_tag");
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aomn.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            aomn aomnVar = (aomn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            Iterable iterableQ = aomnVar.d.size() > 0 ? aomnVar.d : agke.q(aomnVar.c);
            Object obj2 = this.b;
            aihf aihfVarCreateBuilder = alni.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            alni alniVar = (alni) aihfVarCreateBuilder.instance;
            aiie aiieVar = alniVar.d;
            if (!aiieVar.c()) {
                alniVar.d = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(iterableQ, alniVar.d);
            wpi wpiVar = (wpi) obj2;
            wpg wpgVar = new wpg(wpiVar.b, wpiVar.c.e(), aihfVarCreateBuilder);
            wpgVar.n(ajwoVar.c);
            aihl aihlVar = appx.b;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite3);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                appw appwVar = (appw) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                if (!appwVar.c.isEmpty()) {
                    wpgVar.p(appwVar.c);
                }
            }
            ?? r1 = this.c;
            taf.i(wpiVar.e.b(wpgVar, r1, null), r1, new roc(obj, 3), new itt(this, obj, 10), null);
            if (aomnVar.e.size() > 0) {
                if (objS != null) {
                    ((vxe) this.g.io()).e(aomnVar.e, objS);
                    return;
                }
                ajxb ajxbVar = ((vxu) this.d).c().s;
                if (ajxbVar == null) {
                    ajxbVar = ajxb.a;
                }
                if (ajxbVar.b) {
                    ((vxe) this.g.io()).b(aomnVar.e);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arpq.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            arpq arpqVar = (arpq) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
            aigj aigjVar = arpqVar.e;
            if (aigjVar.E()) {
                zhVar = null;
            } else {
                zhVar = new zh((byte[]) null);
                zhVar.b = aigjVar;
            }
            wva wvaVar = (wva) this.c;
            wuz wuzVar = new wuz(wvaVar.b, wvaVar.d.e());
            wuzVar.a = arpqVar.d;
            if ((arpqVar.c & 4) != 0) {
                long j = arpqVar.f;
                if (j > 0) {
                    wuzVar.b = j;
                } else {
                    wuzVar.b = ((Long) map.get("pause_subscription_resume_time_ms_key")).longValue();
                }
            } else {
                wuzVar.b = ((Long) map.get("pause_subscription_resume_time_ms_key")).longValue();
            }
            wuzVar.n(ajwoVar.c);
            bp bpVar2 = (bp) this.f;
            bpVar2.iR(false);
            ?? r2 = this.a;
            bpVar2.gT(((cf) r2).getSupportFragmentManager(), sud.k);
            wnh wnhVar = wvaVar.c;
            ?? r3 = wvaVar.e;
            ListenableFuture listenableFutureB = wnhVar.b(wuzVar, r3, null);
            if (((vxz) wvaVar.g).l(3, 45370961L, false)) {
                yno.ef(wvaVar.f, listenableFutureB, r3, 170);
            }
            taf.k(r2, listenableFutureB, new hcq(this, aigjVar, 17), new hcq(this, zhVar, 18, null));
            return;
        }
        aldo aldoVarD = d(ajwoVar);
        int i2 = aldoVarD.c;
        List<adhf> listF = ((i2 & 1) == 0 || (i2 & 2) == 0) ? null : ((aeod) this.c).f(aldoVarD.e);
        if (listF != null) {
            for (adhf adhfVar : listF) {
                adhfVar.c.d(ajwoVar);
                aldo aldoVarD2 = d(ajwoVar);
                xpl xplVar = (xpl) this.e;
                wud wudVarX = ((wqb) aguu.aw((Context) xplVar.b, wqb.class, ((syn) xplVar.a).m(this.b.e()))).x();
                String str = aldoVarD2.d;
                String str2 = aldoVarD2.e;
                Optional optionalOf = (aldoVarD2.c & 4) != 0 ? Optional.of(aldoVarD2.f) : Optional.empty();
                if ((aldoVarD2.c & 8) != 0) {
                    alac alacVarA = alac.a(aldoVarD2.g);
                    if (alacVarA == null) {
                        alacVarA = alac.FLOW_STATE_PASSING_SPEC_UNSPECIFIED;
                    }
                    optionalEmpty = Optional.of(alacVarA);
                } else {
                    optionalEmpty = Optional.empty();
                }
                wqa wqaVar = new wqa(wudVarX.b, wudVarX.e.hw(), wudVarX.c);
                wqaVar.a = wqa.j(str);
                wqaVar.b = str2;
                wqaVar.d = wqa.j(adhfVar.g);
                addb addbVar = new addb(wqaVar, 20);
                if (true == optionalOf.isPresent()) {
                    ((wqa) addbVar.a).c = (String) optionalOf.get();
                }
                adhj adhjVar = new adhj(this, adhfVar, wqaVar);
                if (true == optionalEmpty.isPresent()) {
                    Object obj3 = optionalEmpty.get();
                    sve sveVar = adhjVar.c;
                    adhf adhfVar2 = adhjVar.a;
                    wqa wqaVar2 = adhjVar.b;
                    if (obj3 == alac.FLOW_STATE_PASSING_SPEC_FULL_STATE) {
                        Optional optionalOfNullable = Optional.ofNullable((akzz) sveVar.d.e(sveVar.b.e()).g(adhfVar2.g).g(akzz.class).E());
                        if (true == optionalOfNullable.isPresent()) {
                            optionalOfNullable = Optional.ofNullable(((akzz) optionalOfNullable.get()).c);
                        }
                        addb addbVar2 = new addb(wqaVar2, 19);
                        if (true == optionalOfNullable.isPresent()) {
                            ((wqa) addbVar2.a).e = (alab) optionalOfNullable.get();
                        }
                    }
                }
                if (!((vxz) this.f).m(62, 45681025L) || (ajwoVar.b & 1) == 0) {
                    wqaVar.m();
                } else {
                    wqaVar.n(ajwoVar.c);
                }
                if ((aldoVarD2.c & 16) != 0) {
                    ajwo ajwoVar2 = aldoVarD2.h;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    optionalEmpty2 = Optional.of(ajwoVar2);
                } else {
                    optionalEmpty2 = Optional.empty();
                }
                ListenableFuture listenableFutureB2 = wudVarX.d.b(wqaVar, this.g, null);
                taf.g(listenableFutureB2, new yqj(this, 17));
                taf.j(listenableFutureB2, new xfa(this, optionalEmpty2, 8));
            }
        }
    }

    public sve(aeod aeodVar, xpl xplVar, zwb zwbVar, vxe vxeVar, Executor executor, wbz wbzVar, vxz vxzVar, int i) {
        this.$cid = i;
        this.c = aeodVar;
        this.e = xplVar;
        this.b = zwbVar;
        this.a = vxeVar;
        this.g = executor;
        this.d = wbzVar;
        this.f = vxzVar;
    }

    public sve(cf cfVar, vxe vxeVar, aapz aapzVar, svo svoVar, ttm ttmVar, Executor executor, int i) {
        this.$cid = i;
        this.a = cfVar;
        this.c = aapzVar;
        this.d = svoVar;
        this.b = vxeVar;
        this.e = ttmVar;
        this.g = executor;
        this.f = new sud();
    }

    public sve(wva wvaVar, ttm ttmVar, vwt vwtVar, xeu xeuVar, vxe vxeVar, cf cfVar, int i) {
        this.$cid = i;
        this.c = wvaVar;
        this.e = ttmVar;
        this.d = vwtVar;
        this.g = xeuVar;
        this.b = vxeVar;
        this.a = cfVar;
        this.f = new sud();
    }
}
