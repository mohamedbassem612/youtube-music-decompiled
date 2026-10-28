package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class suz implements vxc {
    public final vxe a;
    public final ttm b;
    private final zwb c;
    private final cf d;
    private final Executor e;
    private final xpl f;

    public suz(cf cfVar, vxe vxeVar, xpl xplVar, zwb zwbVar, ttm ttmVar, Executor executor) {
        this.d = cfVar;
        this.f = xplVar;
        this.c = zwbVar;
        this.a = vxeVar;
        this.b = ttmVar;
        this.e = executor;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwh] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, zwy] */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        zwa zwaVarE = this.c.e();
        xpl xplVar = this.f;
        aapz aapzVarA = ((wvj) aguu.aw((Context) xplVar.b, wvj.class, ((syn) xplVar.a).m(zwaVarE))).A();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arqh.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        wuu wuuVar = new wuu(aapzVarA.b, aapzVarA.c.hw());
        wuuVar.a = ((arqh) objC).c;
        wuuVar.n(ajwoVar.c);
        cf cfVar = this.d;
        Executor executor = this.e;
        ListenableFuture listenableFutureB = ((wnh) aapzVarA.e).b(wuuVar, executor, null);
        if (((vxz) aapzVarA.f).l(3, 45370961L, false)) {
            yno.ef(aapzVarA.d, listenableFutureB, executor, 172);
        }
        taf.k(cfVar, listenableFutureB, new jlz(this, 16), new jlz(this, 17));
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
