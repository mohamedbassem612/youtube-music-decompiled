package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gus extends gut {
    private final aunn a;
    private final aunn b;
    private final tqj c;

    public gus(aunn aunnVar, aunn aunnVar2, tqj tqjVar) {
        aunnVar.getClass();
        aunnVar2.getClass();
        tqjVar.getClass();
        this.a = aunnVar;
        this.b = aunnVar2;
        this.c = tqjVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0028 A[SYNTHETIC] */
    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        ajwoVar.getClass();
        aihl aihlVar = anlw.b;
        aihlVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            throw new IllegalArgumentException("command is missing musicClearClientDataAction extension");
        }
        aihlVar.getClass();
        for (anlu anluVar : ((anlw) aext.x(ajwoVar, aihlVar)).c) {
            if (anluVar.b == 1) {
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihhVar.getClass();
                aihl aihlVar2 = ajth.b;
                aihlVar2.getClass();
                ajth ajthVar = anluVar.b == 1 ? (ajth) anluVar.c : ajth.a;
                ajthVar.getClass();
                aihhVar.e(aihlVar2, ajthVar);
                ((vxe) this.a.io()).a(atqp.W(aihhVar));
            }
            if (anluVar.b == 2) {
                Object objIo = this.b.io();
                objIo.getClass();
                tqj tqjVar = this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) objIo;
                boolean z = (anluVar.b == 2 ? (anlv) anluVar.c : anlv.a).c;
                boolean z2 = (anluVar.b == 2 ? (anlv) anluVar.c : anlv.a).b;
                if (z) {
                    if (z2) {
                    }
                    if (z) {
                        yno.er(sharedPreferences, null, true, false);
                    }
                } else if (z2) {
                }
                tqh tqhVarD = tqjVar.d(1);
                int i = tqr.a;
                tqhVarD.b(88621, 1L);
                tqhVarD.a();
                if (z) {
                    yno.er(sharedPreferences, null, true, false);
                }
            }
        }
    }
}
