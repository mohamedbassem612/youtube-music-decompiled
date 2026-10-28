package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ssk implements vxc {
    private final /* synthetic */ int $cid;
    public final Object a;
    public final Context b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final Object g;
    private final Object h;
    private final Object i;
    private final Object k;

    public ssk(Context context, vxe vxeVar, xgm xgmVar, aduv aduvVar, abfv abfvVar, tun tunVar, abfv abfvVar2, vxz vxzVar, qcb qcbVar, vxz vxzVar2, int i) {
        this.$cid = i;
        context.getClass();
        this.b = context;
        vxeVar.getClass();
        this.f = vxeVar;
        xgmVar.getClass();
        this.h = xgmVar;
        this.c = aduvVar;
        this.i = abfvVar;
        this.e = tunVar;
        this.k = abfvVar2;
        this.d = vxzVar;
        this.a = qcbVar;
        this.g = vxzVar2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xgm] */
    private final xgn d() {
        return this.h.hB();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xgm] */
    private final xgn e() {
        return this.i.hB();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xgm] */
    private final xgn f() {
        return this.h.hB();
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r2v22, types: [aduv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object, xgm] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r7v13, types: [android.content.Context, bog] */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context, bog] */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.content.Context, bog] */
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
        int i = this.$cid;
        int i2 = 0;
        if (i == 0) {
            ssd ssdVar = (ssd) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", ssd.class);
            wpi wpiVar = (wpi) this.g;
            wpo wpoVar = new wpo(wpiVar.b, wpiVar.c.e());
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aqzf.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            aqzf aqzfVar = (aqzf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            wpoVar.a = wpo.j(aqzfVar.d);
            wpoVar.n(vxg.a(ajwoVar));
            aihl aihlVar = appx.b;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite3);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                appw appwVar = (appw) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                if (!appwVar.c.isEmpty()) {
                    wpoVar.p(appwVar.c);
                }
            }
            if (map.containsKey("com.google.android.libraries.youtube.comment.update_comment_ignore_text_key")) {
                ((Boolean) map.get("com.google.android.libraries.youtube.comment.update_comment_ignore_text_key")).booleanValue();
            }
            if (ssdVar != null) {
                wpoVar.b = ssdVar.a();
            } else if ((aqzfVar.c & 2) != 0) {
                alay alayVar = aqzfVar.e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                StringBuilder sb = new StringBuilder();
                while (i2 < alayVar.c.size()) {
                    sb.append(((alba) alayVar.c.get(i2)).c);
                    i2++;
                }
                wpoVar.b = sb.toString();
                if (aqzfVar.f && d() != null) {
                    d().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(104380)), null);
                }
            }
            if ((aqzfVar.c & 32) != 0) {
                wpoVar.c = Optional.ofNullable(aqzfVar.i);
            }
            wby wbyVarE = this.d.e(this.i.e());
            taf.k(this.b, wpiVar.g.b(wpoVar, this.k, null), new hmo(this, ssdVar, aqzfVar, wbyVarE, 8, null), new hmo(this, ssdVar, aqzfVar, wbyVarE, 9, null));
            return;
        }
        if (i == 1) {
            srw srwVar = (srw) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", srw.class);
            if (srwVar != null && TextUtils.isEmpty(srwVar.b())) {
                srwVar.f(null);
                return;
            }
            wpi wpiVar2 = (wpi) this.h;
            wpj wpjVar = new wpj(wpiVar2.b, wpiVar2.c.e());
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(akgj.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            akgj akgjVar = (akgj) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
            wpjVar.a = wpj.j(akgjVar.d);
            wpjVar.n(vxg.a(ajwoVar));
            aihl aihlVar2 = appx.b;
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar2);
            ajwoVar.c(aihlVarCheckIsLite5);
            if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar2);
                ajwoVar.c(aihlVarCheckIsLite6);
                Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                appw appwVar2 = (appw) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4));
                if (!appwVar2.c.isEmpty()) {
                    wpjVar.p(appwVar2.c);
                }
            }
            wpjVar.e = akgjVar.i;
            alay alayVar2 = akgjVar.j;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            wpjVar.d = Optional.of(alayVar2);
            if (srwVar != null) {
                wpjVar.b = srwVar.b();
                wpjVar.c = wpj.j(null);
            } else if ((akgjVar.c & 8) != 0) {
                alay alayVar3 = akgjVar.e;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                StringBuilder sb2 = new StringBuilder();
                while (i2 < alayVar3.c.size()) {
                    sb2.append(((alba) alayVar3.c.get(i2)).c);
                    i2++;
                }
                wpjVar.b = sb2.toString();
                if (akgjVar.f && e() != null) {
                    e().p(new xgj(xhb.b(103918)), null);
                    e().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(104380)), null);
                }
            }
            if ((akgjVar.c & SemanticState.LiveRegion) != 0) {
                wpjVar.D = Optional.ofNullable(akgjVar.k);
            }
            ?? r0 = this.g;
            ?? r7 = this.b;
            ?? r5 = this.k;
            wnh wnhVar = wpiVar2.f;
            wby wbyVarC = r0.c();
            taf.k(r7, wnhVar.b(wpjVar, r5, null), new hmo(this, srwVar, akgjVar, wbyVarC, 6, null), new hmo(this, srwVar, akgjVar, wbyVarC, 7, null));
            return;
        }
        if (i == 2) {
            ssc sscVar = (ssc) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", ssc.class);
            if (sscVar != null && TextUtils.isEmpty(sscVar.a())) {
                sscVar.d(null);
                return;
            }
            wpi wpiVar3 = (wpi) this.g;
            wpn wpnVar = new wpn(wpiVar3.b, wpiVar3.c.e());
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aqzi.b);
            ajwoVar.c(aihlVarCheckIsLite7);
            Object objK5 = ajwoVar.j.k(aihlVarCheckIsLite7.d);
            aqzi aqziVar = (aqzi) (objK5 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK5));
            wpnVar.a = wpn.j(aqziVar.d);
            wpnVar.n(vxg.a(ajwoVar));
            aihl aihlVar3 = appx.b;
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar3);
            ajwoVar.c(aihlVarCheckIsLite8);
            if (ajwoVar.j.n(aihlVarCheckIsLite8.d)) {
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar3);
                ajwoVar.c(aihlVarCheckIsLite9);
                Object objK6 = ajwoVar.j.k(aihlVarCheckIsLite9.d);
                appw appwVar3 = (appw) (objK6 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK6));
                if (!appwVar3.c.isEmpty()) {
                    wpnVar.p(appwVar3.c);
                }
            }
            if (sscVar != null) {
                wpnVar.b = sscVar.a();
            } else if ((aqziVar.c & 4) != 0) {
                alay alayVar4 = aqziVar.e;
                if (alayVar4 == null) {
                    alayVar4 = alay.a;
                }
                StringBuilder sb3 = new StringBuilder();
                while (i2 < alayVar4.c.size()) {
                    sb3.append(((alba) alayVar4.c.get(i2)).c);
                    i2++;
                }
                wpnVar.b = sb3.toString();
                if (aqziVar.f && f() != null) {
                    f().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(104380)), null);
                }
            }
            if ((aqziVar.c & 64) != 0) {
                wpnVar.c = Optional.ofNullable(aqziVar.i);
            }
            wby wbyVarE2 = this.d.e(this.i.e());
            taf.k(this.b, wpiVar3.h.b(wpnVar, this.k, null), new hmo(this, sscVar, aqziVar, wbyVarE2, 10, null), new hmo(this, sscVar, aqziVar, wbyVarE2, 11, null));
            return;
        }
        Context context = this.b;
        if (((Activity) context).isFinishing()) {
            return;
        }
        aihl aihlVarCheckIsLite10 = aihn.checkIsLite(akdb.b);
        ajwoVar.c(aihlVarCheckIsLite10);
        Object objK7 = ajwoVar.j.k(aihlVarCheckIsLite10.d);
        akdc akdcVar = ((akdb) (objK7 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK7))).d;
        if (akdcVar == null) {
            akdcVar = akdc.a;
        }
        akdd akddVar = akdcVar.c;
        if (akddVar == null) {
            akddVar = akdd.a;
        }
        akdd akddVar2 = akddVar;
        xgn xgnVarHB = this.h.hB();
        xgnVarHB.d(new xgj(akddVar2.m, (amud) null));
        if (!((vxz) this.g).l(69, 45638764L, false)) {
            abfv abfvVar = (abfv) this.k;
            if (!abfvVar.k()) {
                acwl.i(context, akddVar2, this.f, xgnVarHB, (abfv) this.i, true, true, null, tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), this.c, (tun) this.e, abfvVar, ((vxz) this.d).l(9, 45381188L, false));
                return;
            }
        }
        Object obj = this.a;
        acwu acwuVarA = acwv.a();
        acwuVarA.d(akddVar2);
        acwuVarA.b(true);
        acwuVarA.c(true);
        acwuVarA.b = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        acwuVarA.e(((vxz) this.d).l(9, 45381188L, false));
        acwuVarA.c = xgnVarHB;
        acwuVarA.d = ajwoVar;
        acwv acwvVarA = acwuVarA.a();
        ghi ghiVar = (ghi) ((qcb) obj).a;
        ghj ghjVar = ghiVar.b;
        Context context2 = (Context) ghjVar.b.io();
        vxe vxeVar = (vxe) ghjVar.k.io();
        ght ghtVar = ghiVar.a;
        xgn xgnVar = (xgn) ghtVar.kk.io();
        abfv abfvVar2 = (abfv) ghjVar.m.io();
        aduv aduvVar = (aduv) ghtVar.cD.io();
        tun tunVar = (tun) ghtVar.bc.io();
        abfv abfvVar3 = (abfv) ghjVar.p.io();
        new acwl(context2, vxeVar, xgnVar, abfvVar2, aduvVar, tunVar, abfvVar3, acwvVarA).h();
    }

    public ssk(wpi wpiVar, xsc xscVar, xgm xgmVar, cf cfVar, awmd awmdVar, wbz wbzVar, zwb zwbVar, Executor executor, ttm ttmVar, vxz vxzVar, int i) {
        this.$cid = i;
        wpiVar.getClass();
        this.g = wpiVar;
        xscVar.getClass();
        this.a = xscVar;
        this.h = xgmVar;
        this.b = cfVar;
        this.c = awmdVar;
        this.d = wbzVar;
        this.i = zwbVar;
        this.k = executor;
        this.e = ttmVar;
        this.f = vxzVar;
    }

    public ssk(wpi wpiVar, xsc xscVar, xgm xgmVar, cf cfVar, awmd awmdVar, wbz wbzVar, zwb zwbVar, Executor executor, ttm ttmVar, vxz vxzVar, int i, byte[] bArr) {
        this.$cid = i;
        wpiVar.getClass();
        this.g = wpiVar;
        xscVar.getClass();
        this.a = xscVar;
        this.h = xgmVar;
        this.b = cfVar;
        this.c = awmdVar;
        this.d = wbzVar;
        this.i = zwbVar;
        this.k = executor;
        this.e = ttmVar;
        this.f = vxzVar;
    }

    public ssk(wpi wpiVar, sry sryVar, xsc xscVar, xgm xgmVar, awmd awmdVar, wbz wbzVar, cf cfVar, Executor executor, ttm ttmVar, vxz vxzVar, int i) {
        this.$cid = i;
        wpiVar.getClass();
        this.h = wpiVar;
        this.e = sryVar;
        xscVar.getClass();
        this.a = xscVar;
        this.i = xgmVar;
        this.c = awmdVar;
        this.g = wbzVar;
        this.b = cfVar;
        this.k = executor;
        this.f = ttmVar;
        this.d = vxzVar;
    }
}
