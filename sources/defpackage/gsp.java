package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gsp extends gut {
    public final vxe a;
    public final ttm b;
    private final wva c;

    public gsp(wva wvaVar, vxe vxeVar, ttm ttmVar) {
        wvaVar.getClass();
        this.c = wvaVar;
        vxeVar.getClass();
        this.a = vxeVar;
        ttmVar.getClass();
        this.b = ttmVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, zwb] */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        zza zzaVar = (zza) tym.S(map, "addCommandListener");
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aixb.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        wva wvaVar = this.c;
        wrh wrhVar = new wrh(wvaVar.b, wvaVar.e.e(), ((aixb) objC).c);
        wrhVar.n(ajwoVar.c);
        ((wnh) wvaVar.g).d(wrhVar, new gww(this, zzaVar, 1));
    }
}
