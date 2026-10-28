package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class guv extends gut {
    public final ttm a;
    public final vxe b;
    public final jin c;
    private final Executor d;
    private final zwb e;
    private final kyr f;

    public guv(kyr kyrVar, ttm ttmVar, Executor executor, vxe vxeVar, jin jinVar, zwb zwbVar) {
        this.f = kyrVar;
        this.a = ttmVar;
        this.d = executor;
        this.b = vxeVar;
        this.c = jinVar;
        this.e = zwbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, zwh] */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anna.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anna.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        anmz anmzVar = (anmz) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        Iterator it = anmzVar.c.iterator();
        while (it.hasNext()) {
            this.b.c((ajwo) it.next(), map);
        }
        kyr kyrVar = this.f;
        aaqf aaqfVarF = ((hen) aguu.aw((Context) kyrVar.a, hen.class, ((syn) kyrVar.b).m(this.e.e()))).F();
        hem hemVar = new hem(aaqfVarF.b, aaqfVarF.d.hw());
        String str = anmzVar.b;
        ahno.F(!TextUtils.isEmpty(str));
        hemVar.a = str;
        if ((ajwoVar.b & 1) != 0) {
            hemVar.n(vxg.a(ajwoVar));
        } else {
            hemVar.m();
        }
        taf.i(((wnh) aaqfVarF.e).b(hemVar, aaqfVarF.c, null), this.d, new gtq(this, 2), new gov(this, map, 6), null);
    }
}
