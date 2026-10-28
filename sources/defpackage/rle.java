package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rle implements adme {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rle(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v31, types: [advb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v20, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v22, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v24, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    @Override // defpackage.adme
    public final adma a(ViewGroup viewGroup) {
        switch (this.$cid) {
            case 0:
                return new adlm(((rlf) this.a).a);
            case 1:
                iix iixVar = (iix) this.a;
                iiw iiwVar = iixVar.h;
                iiwVar.getClass();
                xsc xscVar = iixVar.l;
                tbt tbtVar = (tbt) xscVar.c.io();
                tbtVar.getClass();
                Executor executor = (Executor) xscVar.a.io();
                executor.getClass();
                aduv aduvVar = (aduv) xscVar.b.io();
                aduvVar.getClass();
                Context context = iixVar.a;
                context.getClass();
                return new ijg(tbtVar, executor, aduvVar, context, iixVar.b, iiwVar);
            case 2:
                roh rohVar = (roh) this.a;
                return rohVar.p.F(rohVar.k, viewGroup);
            case 3:
                roh rohVar2 = (roh) this.a;
                return rohVar2.q.h(rohVar2.k, viewGroup);
            case 4:
                roh rohVar3 = (roh) this.a;
                return rohVar3.l.a(rohVar3.k, viewGroup);
            case 5:
                Object obj = this.a;
                roh rohVar4 = (roh) obj;
                swe sweVar = rohVar4.o;
                ?? r1 = sweVar.c;
                roj rojVar = rohVar4.k;
                Context context2 = (Context) r1.io();
                context2.getClass();
                zwb zwbVar = (zwb) sweVar.g.io();
                zwbVar.getClass();
                rmw rmwVar = (rmw) sweVar.b.io();
                rmwVar.getClass();
                xsc xscVar2 = (xsc) sweVar.d.io();
                xscVar2.getClass();
                Activity activity = (Activity) sweVar.h.io();
                activity.getClass();
                Handler handler = (Handler) sweVar.f.io();
                handler.getClass();
                abzo abzoVar = (abzo) sweVar.e.io();
                tld tldVar = (tld) sweVar.a.io();
                tldVar.getClass();
                rojVar.getClass();
                return new rom(context2, zwbVar, rmwVar, xscVar2, activity, handler, abzoVar, tldVar, rojVar, (cc) obj);
            case 6:
                roh rohVar5 = (roh) this.a;
                return rohVar5.n.a(rohVar5.k, viewGroup);
            case 7:
                roi roiVar = (roi) this.a;
                return roiVar.k.F(roiVar.g, viewGroup);
            case 8:
                roi roiVar2 = (roi) this.a;
                return roiVar2.l.h(roiVar2.g, viewGroup);
            case 9:
                roi roiVar3 = (roi) this.a;
                return roiVar3.h.a(roiVar3.g, viewGroup);
            case 10:
                roi roiVar4 = (roi) this.a;
                return roiVar4.j.a(roiVar4.g, viewGroup);
            case 11:
                ?? r13 = this.a;
                xpl xplVar = ((xas) r13).b;
                Context context3 = (Context) xplVar.a.io();
                context3.getClass();
                vxe vxeVar = (vxe) xplVar.b.io();
                vxeVar.getClass();
                return new wzt(context3, r13, vxeVar);
            case 12:
                return new xta((Context) this.a, 0);
            default:
                aekv aekvVar = (aekv) this.a;
                vxe vxeVar2 = aekvVar.d;
                return new aenb(aekvVar.a, aekvVar, aekvVar.c, vxeVar2);
        }
    }

    public rle(xas xasVar, int i) {
        this.$cid = i;
        this.a = xasVar;
    }
}
