package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sse implements vxc {
    public final sry a;
    public final awmd b;
    public final cf c;
    public final ttm d;
    public final vxz e;
    public final xsc f;
    private final wpi g;
    private final xgm h;
    private final wbz i;
    private final Executor k;

    public sse(wpi wpiVar, sry sryVar, xsc xscVar, xgm xgmVar, awmd awmdVar, wbz wbzVar, Executor executor, cf cfVar, ttm ttmVar, vxz vxzVar) {
        wpiVar.getClass();
        this.g = wpiVar;
        this.a = sryVar;
        xscVar.getClass();
        this.f = xscVar;
        this.h = xgmVar;
        this.b = awmdVar;
        this.i = wbzVar;
        this.k = executor;
        this.c = cfVar;
        this.d = ttmVar;
        this.e = vxzVar;
    }

    private final xgn d() {
        return this.h.hB();
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        wpl wplVar = (wpl) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", wpl.class);
        if (wplVar != null && TextUtils.isEmpty(wplVar.b())) {
            wplVar.d(null);
            return;
        }
        wpi wpiVar = this.g;
        wpk wpkVar = new wpk(wpiVar.b, wpiVar.c.e());
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akgg.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        akgg akggVar = (akgg) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        wpkVar.a = wpk.j(akggVar.d);
        wpkVar.n(ajwoVar.c);
        if (wplVar != null) {
            wpkVar.b = wplVar.b();
            wpkVar.c = wplVar.a();
        } else if ((akggVar.c & 2) != 0) {
            alay alayVar = akggVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < alayVar.c.size(); i++) {
                sb.append(((alba) alayVar.c.get(i)).c);
            }
            wpkVar.b = sb.toString();
            wpkVar.c = Long.valueOf(akggVar.i);
            if (akggVar.f && d() != null) {
                d().p(new xgj(xhb.b(103918)), null);
                d().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(104380)), null);
            }
        }
        int i2 = akggVar.c;
        if ((i2 & SemanticState.LiveRegion) != 0) {
            wpkVar.d = akggVar.n;
        }
        if ((i2 & 64) != 0) {
            wpkVar.e = Integer.valueOf(akggVar.j);
        }
        if (akggVar.k.length() > 0) {
            wpkVar.D = wpk.j(akggVar.k);
        }
        if (akggVar.l.size() > 0) {
            wpkVar.E = akggVar.l;
        }
        aihl aihlVar = appx.b;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            appw appwVar = (appw) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
            if (!appwVar.c.isEmpty()) {
                wpkVar.p(appwVar.c);
            }
            if ((appwVar.b & 2) != 0) {
                argn argnVar = argn.a;
                aihf aihfVarCreateBuilder = argnVar.createBuilder();
                argn argnVar2 = appwVar.d;
                if (argnVar2 == null) {
                    argnVar2 = argnVar;
                }
                int i3 = argnVar2.d;
                aihfVarCreateBuilder.copyOnWrite();
                argn argnVar3 = (argn) aihfVarCreateBuilder.instance;
                argnVar3.b |= 2;
                argnVar3.d = i3;
                argn argnVar4 = appwVar.d;
                if (argnVar4 != null) {
                    argnVar = argnVar4;
                }
                int i4 = argnVar.f;
                aihfVarCreateBuilder.copyOnWrite();
                argn argnVar5 = (argn) aihfVarCreateBuilder.instance;
                argnVar5.b |= 8;
                argnVar5.f = i4;
                aigj aigjVarA = vxg.a(ajwoVar);
                aihfVarCreateBuilder.copyOnWrite();
                argn argnVar6 = (argn) aihfVarCreateBuilder.instance;
                aigjVarA.getClass();
                argnVar6.b |= 1;
                argnVar6.c = aigjVarA;
                wpkVar.o = (argn) aihfVarCreateBuilder.build();
            }
        }
        wbz wbzVar = this.i;
        cf cfVar = this.c;
        Executor executor = this.k;
        wnh wnhVar = wpiVar.d;
        wby wbyVarC = wbzVar.c();
        taf.k(cfVar, wnhVar.b(wpkVar, executor, null), new hmo(this, wplVar, akggVar, (wek) wbyVarC, 4), new hmo(this, wplVar, akggVar, (wek) wbyVarC, 5));
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
