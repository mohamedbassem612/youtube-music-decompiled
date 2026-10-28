package defpackage;

import java.io.IOException;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xnr implements yeb, zsl {
    public xva a = xva.b(-2);
    final /* synthetic */ xns b;
    private final String c;
    private final boolean d;

    public xnr(xns xnsVar, String str, boolean z) {
        this.b = xnsVar;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.yeb
    public final void a(IOException iOException) {
        ((agrc) ((agrc) ((agrc) xns.a.b().i(agso.a, "MDX.discovery")).j(iOException)).k("com/google/android/libraries/youtube/mdx/discovery/DialAppStatusService$AppStatusHttpResponseHandler", "handleException", 192, "DialAppStatusService.java")).w("Failed getting app status from %s", this.c);
    }

    @Override // defpackage.yeb
    public final void b(tgo tgoVar) {
        int i = tgoVar.a;
        if (i == 404) {
            this.a = xva.b(-1);
            return;
        }
        if (i != 200 && (!this.d || i != 0)) {
            agrx agrxVar = agso.a;
            this.a = xva.b(-2);
            return;
        }
        tgn tgnVar = tgoVar.d;
        if (tgnVar == null) {
            agrx agrxVar2 = agso.a;
            return;
        }
        xnq xnqVar = new xnq();
        try {
            xns.c(tgnVar.c(), xnqVar);
            int i2 = xnqVar.c;
            if (i2 < 0) {
                this.a = xva.b(-2);
                return;
            }
            xns xnsVar = this.b;
            String str = xnsVar.c.aq() ? "cl" : xnsVar.b;
            xvg xvgVarA = null;
            xvz xvzVar = (xnqVar.b() == null || !xns.b(xnqVar, str)) ? null : new xvz(xnqVar.b());
            if (xnqVar.a() != null && xns.b(xnqVar, str)) {
                xvgVarA = xnqVar.a();
            }
            xuz xuzVarA = xva.a();
            xuzVarA.e(i2);
            xuzVarA.a = xnqVar.a;
            xuzVarA.d = xnqVar.b;
            xuzVarA.b = xvzVar;
            xuzVarA.c = xvgVarA;
            xuzVarA.f(xnqVar.d);
            xuzVarA.d(xnqVar.d());
            xuzVarA.c(xnqVar.e);
            xuzVarA.b(xnqVar.f);
            xuzVarA.e = xnqVar.c();
            this.a = xuzVarA.a();
        } catch (IOException | SAXException e) {
            ((agrc) ((agrc) ((agrc) xns.a.b().i(agso.a, "MDX.discovery")).j(e)).k("com/google/android/libraries/youtube/mdx/discovery/DialAppStatusService$AppStatusHttpResponseHandler", "handleResponse", 156, "DialAppStatusService.java")).w("Failed getting app status from %s", this.c);
        }
    }

    @Override // defpackage.zsl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xva d(tnm tnmVar) {
        int i = tnmVar.d;
        if (i == 404) {
            xva xvaVarB = xva.b(-1);
            this.a = xvaVarB;
            return xvaVarB;
        }
        if (i != 200) {
            ((agrc) ((agrc) xns.a.b().i(agso.a, "MDX.discovery")).k("com/google/android/libraries/youtube/mdx/discovery/DialAppStatusService$AppStatusHttpResponseHandler", "convertResponse", 209, "DialAppStatusService.java")).A("Request for TV app status from %s got response code %d", this.c, i);
            xva xvaVarB2 = xva.b(-2);
            this.a = xvaVarB2;
            return xvaVarB2;
        }
        byte[] bArrE = tnmVar.e();
        if (bArrE.length == 0) {
            agrx agrxVar = agso.a;
            return this.a;
        }
        xnq xnqVar = new xnq();
        try {
            xns.c(aigj.v(bArrE).h(), xnqVar);
            int i2 = xnqVar.c;
            if (i2 < 0) {
                xva xvaVarB3 = xva.b(-2);
                this.a = xvaVarB3;
                return xvaVarB3;
            }
            xns xnsVar = this.b;
            String str = xnsVar.c.aq() ? "cl" : xnsVar.b;
            xvg xvgVarA = null;
            xvz xvzVar = (xnqVar.b() == null || !xns.b(xnqVar, str)) ? null : new xvz(xnqVar.b());
            if (xnqVar.a() != null && xns.b(xnqVar, str)) {
                xvgVarA = xnqVar.a();
            }
            xuz xuzVarA = xva.a();
            xuzVarA.e(i2);
            xuzVarA.a = xnqVar.a;
            xuzVarA.d = xnqVar.b;
            xuzVarA.b = xvzVar;
            xuzVarA.c = xvgVarA;
            xuzVarA.f(xnqVar.d);
            xuzVarA.d(xnqVar.d());
            xuzVarA.c(xnqVar.e);
            xuzVarA.b(xnqVar.f);
            xuzVarA.e = xnqVar.c();
            xva xvaVarA = xuzVarA.a();
            this.a = xvaVarA;
            return xvaVarA;
        } catch (IOException | SAXException e) {
            ((agrc) ((agrc) ((agrc) xns.a.b().i(agso.a, "MDX.discovery")).j(e)).k("com/google/android/libraries/youtube/mdx/discovery/DialAppStatusService$AppStatusHttpResponseHandler", "convertResponse", 224, "DialAppStatusService.java")).w("Failed getting app status from %s", this.c);
            return this.a;
        }
    }
}
