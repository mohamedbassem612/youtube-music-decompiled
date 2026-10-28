package defpackage;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xnt implements yeb {
    final /* synthetic */ Map a;
    final /* synthetic */ String b;
    final /* synthetic */ xnv c;

    public xnt(xnv xnvVar, Map map, String str) {
        this.a = map;
        this.b = str;
        this.c = xnvVar;
    }

    @Override // defpackage.yeb
    public final void a(IOException iOException) {
        ((agrc) ((agrc) ((agrc) xnv.a.b().i(agso.a, "MDX.DialDeviceFinder")).j(iOException)).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder$1", "handleException", 747, "DialDeviceFinder.java")).w("Error reading device description from %s", this.b);
    }

    @Override // defpackage.yeb
    public final void b(tgo tgoVar) {
        xnv xnvVar = this.c;
        Map map = this.a;
        xvn xvnVarA = xnvVar.a(tgoVar, map);
        if (xvnVarA != null) {
            xnvVar.f(this.b, xvnVarA, map);
        }
    }
}
