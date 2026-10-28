package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avez extends avbu {
    private static final boolean a = avjt.r(avez.class.getClassLoader());

    @Override // defpackage.avbq
    public final avbt a(avcm avcmVar, avbo avboVar) {
        String string = null;
        if (!"dns".equals(avcmVar.k)) {
            return null;
        }
        agjz agjzVar = new agjz(4);
        avcm.d(avcmVar.l, agjzVar);
        agke agkeVarG = agjzVar.g();
        ahno.M(!agkeVarG.isEmpty(), "expected 1 path segment in target %s but found %s", avcmVar, agkeVarG);
        String str = (String) agkeVarG.get(0);
        if (avcmVar.f()) {
            StringBuilder sb = new StringBuilder();
            avcmVar.c(sb);
            string = sb.toString();
        }
        avcm.a(string);
        return new avey(str, avboVar, avfp.m, new agfp(), a);
    }

    @Override // defpackage.avbq
    public final avbt b(URI uri, avbo avboVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        path.getClass();
        ahno.M(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String strSubstring = path.substring(1);
        uri.getAuthority();
        return new avey(strSubstring, avboVar, avfp.m, new agfp(), a);
    }

    @Override // defpackage.avbq
    public final String c() {
        return "dns";
    }

    @Override // defpackage.avbu
    public final int d() {
        return 5;
    }

    @Override // defpackage.avbu
    public final Collection e() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.avbu
    protected final void f() {
    }
}
