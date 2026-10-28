package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwa extends gut {
    public final igy a;
    private final bog b;
    private final xit c;
    private final Executor d;
    private final vxz e;
    private final hwz f;
    private final abzo g;

    public gwa(bog bogVar, igy igyVar, abzo abzoVar, xit xitVar, hwz hwzVar, Executor executor, vxz vxzVar) {
        this.b = bogVar;
        this.a = igyVar;
        this.g = abzoVar;
        this.c = xitVar;
        this.f = hwzVar;
        this.d = executor;
        this.e = vxzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x016b  */
    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [awmd, java.lang.Object] */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        boolean zD;
        ListenableFuture listenableFutureN;
        xgn xgnVar = (xgn) tym.U(map, "com.google.android.libraries.youtube.logging.interaction_logger", xgn.class);
        abzo abzoVar = this.g;
        Context context = (Context) abzoVar.c.io();
        context.getClass();
        Executor executor = (Executor) abzoVar.i.io();
        executor.getClass();
        abqq abqqVar = (abqq) abzoVar.e.io();
        abqqVar.getClass();
        hmt hmtVar = (hmt) abzoVar.j.io();
        hmtVar.getClass();
        aaug aaugVar = (aaug) abzoVar.a.io();
        aaugVar.getClass();
        aanb aanbVar = (aanb) abzoVar.g.io();
        aanbVar.getClass();
        hps hpsVar = (hps) abzoVar.d.io();
        hpsVar.getClass();
        hpd hpdVar = (hpd) abzoVar.h.io();
        hpdVar.getClass();
        hpk hpkVar = (hpk) abzoVar.k.io();
        hpkVar.getClass();
        isi isiVar = (isi) abzoVar.f.io();
        isiVar.getClass();
        jin jinVar = (jin) abzoVar.b.io();
        jinVar.getClass();
        iaw iawVar = new iaw(context, executor, abqqVar, hmtVar, aaugVar, aanbVar, hpsVar, hpdVar, hpkVar, isiVar, jinVar, xgnVar);
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aohu.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aoht aohtVar = (aoht) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (!this.e.l(171, 45647364L, false)) {
            aohtVar.getClass();
            iawVar.d = aohtVar;
            String str = aohtVar.c;
            String str2 = aohtVar.d;
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    zD = iawVar.d(str2);
                }
                d(ajwoVar, aohtVar, map);
                return;
            }
            zD = iawVar.e(str);
            if (zD) {
                return;
            }
            d(ajwoVar, aohtVar, map);
            return;
        }
        bog bogVar = this.b;
        aohtVar.getClass();
        iawVar.d = aohtVar;
        String str3 = aohtVar.c;
        String str4 = aohtVar.d;
        if (!TextUtils.isEmpty(str3)) {
            listenableFutureN = taf.a(bogVar, iawVar.a.g(str3), new gqa(iawVar, str3, 17));
        } else if (!TextUtils.isEmpty(str4)) {
            switch (str4) {
                case "PPSDST":
                    listenableFutureN = taf.a(bogVar, iawVar.b.g(new iaa(6)), new iat(iawVar, 3));
                    break;
                case "PPAD":
                    listenableFutureN = taf.a(bogVar, iawVar.b.h(), new iat(iawVar, 1));
                    break;
                case "PPSE":
                    listenableFutureN = taf.a(bogVar, iawVar.b.g(new iaa(5)), new iat(iawVar, 2));
                    break;
                case "PPSV":
                    listenableFutureN = taf.a(bogVar, iawVar.b.i(), new iat(iawVar, 0));
                    break;
                default:
                    listenableFutureN = taf.a(bogVar, iawVar.b(str4), new iat(iawVar, 4));
                    break;
            }
        } else {
            listenableFutureN = ahng.n(Boolean.FALSE);
        }
        taf.g(listenableFutureN, new gst((gut) this, (Object) ajwoVar, (Object) aohtVar, map, 4));
    }

    public final void d(ajwo ajwoVar, aoht aohtVar, Map map) {
        xit xitVar = this.c;
        aase aaseVarA = hxb.a(map);
        aaseVarA.f(xitVar.p(4));
        hxb hxbVarD = aaseVarA.d();
        if (!aohtVar.c.isEmpty()) {
            aohs aohsVar = aohtVar.h;
            if (aohsVar == null) {
                aohsVar = aohs.a;
            }
            if (aohsVar.g) {
                taf.i(this.f.m(aohtVar.c), this.d, new hfg(this, aohtVar, ajwoVar, hxbVarD, 1), new gst(this, ajwoVar, aohtVar, hxbVarD, 5), null);
                return;
            }
        }
        this.a.s(ajwoVar, hxbVarD);
    }
}
