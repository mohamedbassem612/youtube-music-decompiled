package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sxc implements vxc {
    private final /* synthetic */ int $cid;
    public final sud a = new sud();
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final cf f;
    private final Executor g;
    private final wnn h;

    public sxc(cf cfVar, aapz aapzVar, ttm ttmVar, vwt vwtVar, xeu xeuVar, vxe vxeVar, Executor executor, int i) {
        this.$cid = i;
        this.f = cfVar;
        this.h = aapzVar;
        this.b = ttmVar;
        this.d = vwtVar;
        this.e = xeuVar;
        this.c = vxeVar;
        this.g = executor;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, zwy] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, zwb] */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        byte[] bArrC;
        zh zhVar;
        if (this.$cid != 0) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arqa.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            arqa arqaVar = (arqa) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            aigj aigjVar = arqaVar.d;
            if (aigjVar.E()) {
                zhVar = null;
            } else {
                zhVar = new zh((byte[]) null);
                zhVar.b = aigjVar;
            }
            aapz aapzVar = (aapz) this.h;
            wvc wvcVar = new wvc(aapzVar.b, aapzVar.e.e());
            wvcVar.a = arqaVar.c;
            wvcVar.n(ajwoVar.c);
            sud sudVar = this.a;
            sudVar.iR(false);
            cf cfVar = this.f;
            sudVar.gT(cfVar.getSupportFragmentManager(), sud.k);
            Executor executor = this.g;
            ListenableFuture listenableFutureB = ((wnh) aapzVar.c).b(wvcVar, executor, null);
            if (((vxz) aapzVar.f).l(3, 45370961L, false)) {
                yno.ef(aapzVar.d, listenableFutureB, executor, 171);
            }
            taf.k(cfVar, listenableFutureB, new hcq(this, aigjVar, 19), new hcq(this, zhVar, 20, null));
            return;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akaj.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        akaj akajVar = (akaj) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
        if (!akajVar.j) {
            sud sudVar2 = this.a;
            sudVar2.iR(false);
            sudVar2.gT(this.f.getSupportFragmentManager(), sud.k);
        }
        wnn wnnVar = this.h;
        akak akakVar = akajVar.k;
        if (akakVar == null) {
            akakVar = akak.a;
        }
        aaqf aaqfVar = (aaqf) wnnVar;
        wur wurVarC = aaqfVar.c(akakVar.b);
        wurVarC.c = akajVar.e;
        wurVarC.b = akajVar.d;
        wurVarC.n(ajwoVar.c);
        aiie<String> aiieVar = akajVar.f;
        wby wbyVarC = this.c.c();
        for (String str : aiieVar) {
            if (wbyVarC.g(str).E() != null && (bArrC = ((weh) wbyVarC.g(str).E()).c()) != null) {
                wurVarC.a.add(aigj.v(bArrC));
            }
        }
        if ((akajVar.c & 4) != 0) {
            ?? r11 = this.b;
            ajwo ajwoVar2 = akajVar.g;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            r11.a(ajwoVar2);
        }
        Executor executor2 = this.g;
        taf.i(aaqfVar.d(wurVarC, executor2), executor2, new gou(this, akajVar, 17), new itt(this, akajVar, 12), null);
    }

    public sxc(cf cfVar, vxe vxeVar, aaqf aaqfVar, wbz wbzVar, ttm ttmVar, xgm xgmVar, Executor executor, int i) {
        this.$cid = i;
        this.f = cfVar;
        this.h = aaqfVar;
        this.b = vxeVar;
        this.c = wbzVar;
        this.d = ttmVar;
        this.e = xgmVar;
        this.g = executor;
    }
}
