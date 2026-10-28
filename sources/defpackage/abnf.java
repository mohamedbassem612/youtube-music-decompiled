package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class abnf implements abnm {
    public abstract int a(Object obj);

    public abstract jrk b(Object obj);

    public abstract String d(Object obj);

    public abstract String e(Object obj);

    public abstract boolean f(Object obj, Object obj2);

    @Override // defpackage.abnm
    public final int i(ajwo ajwoVar) {
        return a(k(ajwoVar));
    }

    @Override // defpackage.abnm
    public final jrk j(ajwo ajwoVar) {
        return b(k(ajwoVar));
    }

    public final Object k(ajwo ajwoVar) {
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(c());
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            throw new IllegalArgumentException();
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(c());
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        return objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
    }

    @Override // defpackage.abnm
    public final String l(ajwo ajwoVar) {
        return d(k(ajwoVar));
    }

    @Override // defpackage.abnm
    public final String m(ajwo ajwoVar) {
        return e(k(ajwoVar));
    }

    @Override // defpackage.abnm
    public final boolean n(ajwo ajwoVar, ajwo ajwoVar2) {
        return f(k(ajwoVar), k(ajwoVar2));
    }

    @Override // defpackage.abnm
    public ajwo g(ajwo ajwoVar) {
        return ajwoVar;
    }
}
