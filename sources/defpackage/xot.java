package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xot implements vxc {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/handoff/HandoffGateCommandResolver");
    public final vxe b;
    public final abvn c;
    public final Context d;
    public final xsa e;
    public final xnv f;
    public final xwj g;
    public final Executor h;
    public final avmb i;
    public final xla k;
    public final awmd l;
    public final ycp m;
    public final xwo n;
    public final xkw o;
    private final vwt p;

    public xot(abvn abvnVar, Context context, xsa xsaVar, xnv xnvVar, ycp ycpVar, vxe vxeVar, xwj xwjVar, xwo xwoVar, vwt vwtVar, Executor executor, avmb avmbVar, xla xlaVar, xkw xkwVar, awmd awmdVar) {
        this.c = abvnVar;
        this.d = context;
        this.e = xsaVar;
        this.f = xnvVar;
        this.m = ycpVar;
        this.b = vxeVar;
        this.g = xwjVar;
        this.n = xwoVar;
        this.p = vwtVar;
        this.h = executor;
        this.i = avmbVar;
        this.k = xlaVar;
        this.o = xkwVar;
        this.l = awmdVar;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        aihl aihlVar = algq.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        algq algqVar = (algq) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        algr algrVar = algqVar.g;
        if (algrVar == null) {
            algrVar = algr.a;
        }
        this.p.D(new vtq(this, algrVar, algqVar, 7, (char[]) null));
    }
}
