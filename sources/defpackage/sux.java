package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sux implements vxc {
    private final cf a;
    private final wvi b;
    private final sud c = new sud();
    private final wbz d;
    private final zwb e;
    private final xgm f;
    private final Executor g;
    private final vxe h;
    private final vxz i;
    private final vwt k;
    private final xsc l;

    public sux(cf cfVar, xsc xscVar, wbz wbzVar, zwb zwbVar, wvi wviVar, vwt vwtVar, xgm xgmVar, Executor executor, vxe vxeVar, vxz vxzVar) {
        this.a = cfVar;
        this.b = wviVar;
        this.l = xscVar;
        this.k = vwtVar;
        this.d = wbzVar;
        this.e = zwbVar;
        this.f = xgmVar;
        this.g = executor;
        this.h = vxeVar;
        this.i = vxzVar;
    }

    @Override // defpackage.vxc
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        CharSequence charSequence;
        String str;
        String str2;
        byte[] bArr;
        suw suwVar;
        amqw amqwVar;
        xgn xgnVarHB;
        byte[] bArrC;
        long jLongValue = -1;
        if (map != null) {
            suw suwVar2 = (suw) map.get("HANDLE_TRANSACTION_CALLBACK");
            str = (String) map.get("FUNDS_GUARANTEE_CALLBACK_CLIENT_DATA");
            str2 = (String) map.get("PAYMENTS_PAYLOAD");
            bArr = (byte[]) map.get("SERIALIZED_BACKEND_ANALYTICS_EVENT");
            jLongValue = ((Long) tym.T(map, "PURCHASE_PRICE_MICROS", -1L)).longValue();
            CharSequence charSequence2 = (CharSequence) tym.U(map, "CLIENT_CHAT_MESSAGE_TEXT", String.class);
            amqwVar = (amqw) tym.U(map, "LIVE_CHAT_RICH_MESSAGE_INPUT", amqw.class);
            suwVar = suwVar2;
            charSequence = charSequence2;
        } else {
            charSequence = "";
            str = null;
            str2 = null;
            bArr = null;
            suwVar = null;
            amqwVar = null;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arox.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        vxe vxeVar = this.h;
        arox aroxVar = (arox) objC;
        ajwn ajwnVar = aroxVar.k;
        if (ajwnVar == null) {
            ajwnVar = ajwn.a;
        }
        nsh.g(vxeVar, ajwnVar);
        wvi wviVar = this.b;
        zwb zwbVar = wviVar.d;
        suw suwVar3 = suwVar;
        wvh wvhVar = new wvh(wviVar.b, zwbVar.e());
        wvhVar.o(vzh.b);
        if ((ajwoVar.b & 1) != 0) {
            wvhVar.n(ajwoVar.c);
        }
        int i = aroxVar.c;
        if ((i & 1) != 0) {
            String str3 = aroxVar.d;
            str3.getClass();
            wvhVar.b = str3;
        }
        if ((i & 2) != 0) {
            String str4 = aroxVar.e;
            str4.getClass();
            wvhVar.c = str4;
        }
        if (str2 != null) {
            wvhVar.d = str2;
        }
        if (str != null) {
            wvhVar.e = str;
        }
        if (bArr != null) {
            wvhVar.D = bArr;
        }
        if (amqwVar != null) {
            wvhVar.F = amqwVar;
        }
        if (charSequence != null) {
            wvhVar.G = charSequence;
        }
        if ((i & 16) != 0) {
            aqoy aqoyVar = aroxVar.h;
            if (aqoyVar == null) {
                aqoyVar = aqoy.a;
            }
            aqoyVar.getClass();
            wvhVar.H = aqoyVar;
        }
        if ((aroxVar.c & 8) != 0) {
            int iAU = a.aU(aroxVar.g);
            wvhVar.I = iAU != 0 ? iAU : 1;
        }
        if (aroxVar.j.size() > 0) {
            aiie aiieVar = aroxVar.j;
            wby wbyVarE = this.d.e(this.e.e());
            Iterator it = aiieVar.iterator();
            while (it.hasNext()) {
                weh wehVar = (weh) wbyVarE.g((String) it.next()).E();
                if (wehVar != null && (bArrC = wehVar.c()) != null) {
                    wvhVar.a.add(aigj.v(bArrC));
                }
            }
        }
        if (!aroxVar.i) {
            if (this.i.m(13, 45616898L)) {
                this.c.iR(false);
            }
            this.c.h(this.a.getSupportFragmentManager(), sud.k);
        }
        xsc xscVar = this.l;
        vwt vwtVar = this.k;
        sud sudVar = this.c;
        if (map == null || (xgnVarHB = (xgn) tym.U(map, "com.google.android.libraries.youtube.logging.interaction_logger", xgn.class)) == null) {
            xgnVarHB = this.f.hB();
        }
        ttm ttmVar = (ttm) xscVar.c.io();
        ttmVar.getClass();
        xeu xeuVar = (xeu) xscVar.a.io();
        xeuVar.getClass();
        vxe vxeVar2 = (vxe) xscVar.b.io();
        vxeVar2.getClass();
        aroxVar.getClass();
        vwtVar.getClass();
        xgnVarHB.getClass();
        swe sweVar = new swe(ttmVar, xeuVar, vxeVar2, suwVar3, aroxVar, vwtVar, sudVar, xgnVarHB);
        wvhVar.E = jLongValue;
        Executor executor = this.g;
        ListenableFuture listenableFutureF = wviVar.j.m(9, 45408147L) ? ahcs.f(wviVar.c(zwbVar.e(), ajgq.ENGAGEMENT_TYPE_YPC_HANDLE_TRANSACTION, executor), afwl.d(new qzc(wviVar, wvhVar, executor, 16)), executor) : wviVar.g.b(wvhVar, executor, null);
        if (wviVar.i.l(3, 45370961L, false)) {
            yno.ef(wviVar.h, listenableFutureF, executor, 161);
        }
        taf.i(listenableFutureF, executor, new roc(sweVar, 4), new ixb(sweVar, 4), null);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
