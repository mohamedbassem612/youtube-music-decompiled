package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hfc implements zza {
    protected final awmd a;
    protected final ttm b;
    public final huf c;
    protected final ajwo d;
    protected final Map e;
    protected final tbt f;
    protected final awkv g;
    protected final awkv h;
    protected final vxz i;
    protected final vxz j;
    protected final khn k;
    private final hpb l;
    private final hpy m;
    private final Executor n;

    public hfc(awmd awmdVar, ttm ttmVar, hpb hpbVar, hpy hpyVar, khn khnVar, huf hufVar, ajwo ajwoVar, Map map, tbt tbtVar, Executor executor, vxz vxzVar, vxz vxzVar2, awkv awkvVar, awkv awkvVar2) {
        this.a = awmdVar;
        this.b = ttmVar;
        this.l = hpbVar;
        this.m = hpyVar;
        this.k = khnVar;
        this.c = hufVar;
        this.f = tbtVar;
        this.n = executor;
        this.i = vxzVar;
        this.j = vxzVar2;
        this.g = awkvVar;
        this.h = awkvVar2;
        this.d = ajwoVar;
        this.e = map;
    }

    protected static boolean f(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return false;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        amlh amlhVar = ((amla) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).g;
        if (amlhVar == null) {
            amlhVar = amlh.a;
        }
        return fhz.v(amlhVar);
    }

    protected final void d(amla amlaVar, amlg amlgVar) {
        if (amlaVar == null || (amlaVar.c & 2) == 0) {
            return;
        }
        amlh amlhVar = amlaVar.g;
        if (amlhVar == null) {
            amlhVar = amlh.a;
        }
        if (fhz.v(amlhVar)) {
            this.h.kk(new gsf(amlhVar.d, amlgVar));
        } else if (fhz.w(amlhVar)) {
            this.g.kk(new gsg(amlhVar.c, amlgVar));
        }
    }

    protected final void e() {
        ahno.at(this.l.o(this.m, "LM"), new hfb(this, 0), this.n);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
