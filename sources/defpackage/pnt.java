package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.net.URL;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pnt implements pnn {
    private final pnu a;
    private final pnn b;
    private final pls c;
    private final pwf d;
    private final Context e;
    private final awut f;
    private final kjc g;

    public pnt(pnu pnuVar, kjc kjcVar, pnn pnnVar, pls plsVar, pwf pwfVar, Context context, awut awutVar) {
        plsVar.getClass();
        pwfVar.getClass();
        context.getClass();
        this.a = pnuVar;
        this.g = kjcVar;
        this.b = pnnVar;
        this.c = plsVar;
        this.d = pwfVar;
        this.e = context;
        this.f = awutVar;
    }

    @Override // defpackage.pnn
    public final ListenableFuture a(pnp pnpVar) {
        pnpVar.getClass();
        return awrc.ag(this.f, awov.a, new gmc(this, pnpVar, (awoq) null, 18));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [awmd, java.lang.Object] */
    public final Object b(pnp pnpVar, awoq awoqVar) throws Throwable {
        pns pnsVar;
        pnp pnpVarG;
        if (awoqVar instanceof pns) {
            pnsVar = (pns) awoqVar;
            int i = pnsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pnsVar.c = i - Integer.MIN_VALUE;
            } else {
                pnsVar = new pns(this, awoqVar);
            }
        } else {
            pnsVar = new pns(this, awoqVar);
        }
        Object objAd = pnsVar.a;
        awox awoxVar = awox.a;
        int i2 = pnsVar.c;
        if (i2 == 0) {
            atqp.j(objAd);
            pnu pnuVar = this.a;
            pnpVar.getClass();
            if (auvm.c().length() > 0) {
                ContentResolver contentResolver = pnuVar.a.getContentResolver();
                contentResolver.getClass();
                long jC = lsx.c(contentResolver, 0L);
                if (jC != 0) {
                    tge tgeVarB = pnpVar.b();
                    pno pnoVar = pno.b;
                    String string = Long.toString(jC, 16);
                    string.getClass();
                    tgeVarB.i(pnoVar, string);
                    pno pnoVar2 = pno.c;
                    aihf aihfVarCreateBuilder = auld.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    aigj aigjVarX = aigj.x(auvm.c());
                    aigjVarX.getClass();
                    aihfVarCreateBuilder.copyOnWrite();
                    auld auldVar = (auld) aihfVarCreateBuilder.instance;
                    auldVar.b |= 8;
                    auldVar.c = aigjVarX;
                    aihn aihnVarBuild = aihfVarCreateBuilder.build();
                    aihnVarBuild.getClass();
                    tgeVarB.i(pnoVar2, nwv.a((auld) aihnVarBuild));
                    pnpVarG = tgeVarB.g();
                } else {
                    pnpVarG = pnpVar;
                }
            } else {
                pnpVarG = pnpVar;
            }
            kjc kjcVar = this.g;
            URL url = pnpVarG.a;
            url.getClass();
            String host = url.getHost();
            if (host != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (awrc.l(lowerCase, ".google.com", false) || awrc.l(lowerCase, ".googleapis.com", false) || awrc.c(lowerCase, "google.com") || awrc.c(lowerCase, "googleapis.com")) {
                    tge tgeVarB2 = pnpVarG.b();
                    ?? r2 = kjcVar.a;
                    pno pnoVar3 = pno.e;
                    Object objIo = r2.io();
                    objIo.getClass();
                    tgeVarB2.i(pnoVar3, atqq.aD((Iterable) objIo, ",", null, null, null, 62));
                    pnpVarG = tgeVarB2.g();
                }
            }
            long jA = auva.a.io().a();
            if (jA != -1) {
                String str = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(jA)}, 1));
                str.getClass();
                tge tgeVarB3 = pnpVarG.b();
                tgeVarB3.i(pno.d, str);
                pnpVarG = tgeVarB3.g();
            }
            pnn pnnVar = this.b;
            zzz zzzVar = new zzz(pnpVarG);
            aaaa aaaaVar = (aaaa) pnnVar;
            if (aaaaVar.b.m(14, 45627566L)) {
                zzzVar.B(tok.GNP_HTTP_REQUEST);
            }
            afxd afxdVarB = afxd.f(aaaaVar.a.c(zzzVar)).g(new xwx(10), MoreExecutors.directExecutor()).b(zzy.class, new xwx(11), MoreExecutors.directExecutor());
            pnsVar.d = pnpVar;
            pnsVar.c = 1;
            objAd = awrc.ad(afxdVarB, pnsVar);
            if (objAd == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pnpVar = pnsVar.d;
            atqp.j(objAd);
        }
        pwf pwfVar = this.d;
        Context context = this.e;
        pls plsVar = this.c;
        int i3 = pnpVar.e;
        pnq pnqVar = (pnq) objAd;
        String packageName = context.getPackageName();
        String path = i3 == 2 ? pnpVar.a.getPath() : "";
        Integer num = pnqVar.a;
        int iIntValue = num != null ? num.intValue() : -1;
        String strA = nxc.a(i3);
        if (i3 == 0) {
            throw null;
        }
        ((qtf) pwfVar.h.io()).b(1L, packageName, plsVar.a, "youtube", path, Integer.valueOf(iIntValue), strA);
        objAd.getClass();
        return objAd;
    }
}
