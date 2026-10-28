package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aelt implements vxc {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/share/endpoint/SubmitShareEngagementCommandResolver");
    public final aunn b;
    private final aunn c;
    private final Executor d;
    private final lqa e;

    public aelt(aunn aunnVar, aunn aunnVar2, lqa lqaVar, Executor executor) {
        aunnVar.getClass();
        aunnVar2.getClass();
        lqaVar.getClass();
        executor.getClass();
        this.c = aunnVar;
        this.b = aunnVar2;
        this.e = lqaVar;
        this.d = executor;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, zwb] */
    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        aptc aptcVarA;
        ajwoVar.getClass();
        aihl aihlVar = aqei.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
            objC.getClass();
            aunn aunnVar = this.c;
            aqei aqeiVar = (aqei) objC;
            aend aendVar = (aend) aunnVar.io();
            abxv abxvVar = aendVar.b;
            zwa zwaVarE = aendVar.c.e();
            zwaVarE.getClass();
            aenc aencVar = new aenc(abxvVar, zwaVarE);
            String str = aqeiVar.g;
            str.getClass();
            if (str.length() != 0) {
                String str2 = aqeiVar.g;
                str2.getClass();
                aencVar.a = str2;
            }
            String str3 = aqeiVar.f;
            str3.getClass();
            if (str3.length() > 0 && (aptcVarA = this.e.A(aqeiVar.f)) != null) {
                aencVar.b = aptcVarA;
            }
            ListenableFuture listenableFutureB = ((wnh) ((aend) aunnVar.io()).d).b(aencVar, MoreExecutors.directExecutor(), null);
            if ((aqeiVar.c & 1) != 0) {
                vxe vxeVar = (vxe) this.b.io();
                ajwo ajwoVar2 = aqeiVar.d;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar.a(ajwoVar2);
            }
            taf.i(listenableFutureB, this.d, new xfa(aqeiVar, this, 12, null), new yqj(this, 20), null);
        }
    }
}
