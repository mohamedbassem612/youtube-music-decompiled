package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class cbg implements cdt {
    private final Context a;
    private final clf b;
    private final clu c = clu.a;

    public cbg(Context context) {
        this.a = context;
        this.b = new clf(context);
    }

    @Override // defpackage.cdt
    public cdp[] jA(Handler handler, cty ctyVar, cfx cfxVar, cch cchVar, cch cchVar2) {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        cta ctaVar = new cta(context);
        clf clfVar = this.b;
        ctaVar.d = clfVar;
        clu cluVar = this.c;
        ctaVar.c = cluVar;
        ctaVar.e = 5000L;
        ctaVar.f = false;
        ctaVar.g = handler;
        ctaVar.h = ctyVar;
        ctaVar.i = 50;
        ctaVar.k = 15000L;
        ctaVar.l = 50000L;
        ahno.O(!ctaVar.b);
        Handler handler2 = ctaVar.g;
        cty ctyVar2 = ctaVar.h;
        ahno.O(handler2 != null ? ctyVar2 != null : ctyVar2 == null);
        ctaVar.b = true;
        arrayList.add(new ctb(ctaVar));
        arrayList.add(new chj(context, clfVar, cluVar, false, handler, cfxVar, new cgz(context).a()));
        arrayList.add(new cpy(cchVar, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new cmg(cchVar2, looper));
        }
        arrayList.add(new cue());
        arrayList.add(new ckw(new zf(context, (byte[]) null)));
        return (cdp[]) arrayList.toArray(new cdp[0]);
    }

    @Override // defpackage.cdt
    public final void jB(cdp cdpVar) {
        cdpVar.j();
    }
}
