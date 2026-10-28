package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.backgroundtask.workmanager.BackgroundTaskWorker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class syn {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public syn(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, tqj tqjVar) {
        int i = tqr.a;
        boolean zK = tqjVar.k(1073815003);
        this.a = new tbp(awmdVar, zK);
        this.d = new tbp(awmdVar2, zK);
        this.c = new tbp(awmdVar3, zK);
        this.b = new tbp(awmdVar4, zK);
    }

    private static final affd s(ListenableFuture listenableFuture, String str) {
        try {
            return (affd) ahng.b(listenableFuture, 5L, TimeUnit.SECONDS);
        } catch (ExecutionException | TimeoutException e) {
            throw new IllegalStateException(str, e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture a(ahcy ahcyVar) {
        ListenableFuture listenableFutureA;
        if (((dov) this.c).aq()) {
            try {
                listenableFutureA = ahcyVar.a((qrx) this.d.io());
            } catch (Exception e) {
                ((dov) this.c).ap();
                return ahng.m(e);
            }
        } else {
            gwj gwjVar = new gwj(this, ahcyVar, 19);
            ?? r5 = this.b;
            long j = afwl.a;
            ahfo ahfoVar = new ahfo(new afwh(afty.c(false), gwjVar, 0));
            r5.execute(ahfoVar);
            listenableFutureA = ahfoVar;
        }
        try {
            return afxd.f(listenableFutureA).g(new olh(this, 16), MoreExecutors.directExecutor()).c(Throwable.class, new thc(this, 1), MoreExecutors.directExecutor());
        } catch (Exception e2) {
            ((dov) this.c).ap();
            return ahng.m(e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final void b(String str) {
        ((dzt) this.d.io()).a(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, mbc] */
    public final void c(String str, long j, long j2, boolean z, int i, boolean z2, Bundle bundle, syj syjVar) {
        long j3;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (((vxz) this.b.io()).l(234, 45779797L, false)) {
            j3 = j;
            bundle2.putLong("sched_time", this.c.f().toEpochMilli() + TimeUnit.SECONDS.toMillis(j3));
        } else {
            j3 = j;
        }
        dzo dzoVar = new dzo(BackgroundTaskWorker.class, j3, TimeUnit.SECONDS, j2, TimeUnit.SECONDS);
        taq.L(dzoVar, i, z2, bundle2, syjVar);
        dzoVar.b(str);
        dzoVar.c(str.substring(0, Math.min(str.length(), 127)));
        ((dzt) this.d.io()).g(str, true != z ? 2 : 1, dzoVar.g());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    public final void d(String str, long j, int i, int i2, boolean z, Bundle bundle, syj syjVar, boolean z2) {
        int i3;
        String strB;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (((vxz) this.b.io()).l(234, 45779797L, false)) {
            bundle.putLong("sched_time", this.c.f().toEpochMilli() + TimeUnit.SECONDS.toMillis(j));
        }
        dzg dzgVar = new dzg(BackgroundTaskWorker.class);
        taq.L(dzgVar, i2, z, bundle, syjVar);
        dzgVar.e(j, TimeUnit.SECONDS);
        if (z2) {
            strB = ((afft) this.a).b(str);
            i3 = 4;
        } else {
            i3 = i + (-1) != 0 ? 1 : 2;
            strB = str;
        }
        dzgVar.b(str);
        dzgVar.c(str.substring(0, Math.min(str.length(), 127)));
        ((dzt) this.d.io()).h(strB, i3, dzgVar.g());
    }

    public final void e() {
        ((avmm) this.a).b();
    }

    public final void f() {
        ((avmm) this.a).b();
        ((vwt) this.d).F(new qoh(this, 18));
        long jS = ((taq) this.b).S();
        if (jS == null) {
            jS = 0L;
        }
        g(jS);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, wbz] */
    public final void g(Long l) {
        boolean zBooleanValue = ((taq) this.b).R().booleanValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String strI = typ.i((l.longValue() + 500) / 1000, 3);
        wby wbyVarC = this.c.c();
        String strG = wfs.g(ajxs.b.a(), "");
        strG.getClass();
        ahno.P(!strG.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = ajxs.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajxs ajxsVar = (ajxs) aihfVarCreateBuilder.instance;
        ajxsVar.c |= 1;
        ajxsVar.d = strG;
        ajxp ajxpVar = new ajxp(aihfVarCreateBuilder);
        aihf aihfVar = ajxpVar.a;
        aihfVar.copyOnWrite();
        ajxs ajxsVar2 = (ajxs) aihfVar.instance;
        strI.getClass();
        ajxsVar2.c |= 2;
        ajxsVar2.e = strI;
        long jLongValue = l.longValue();
        aihfVar.copyOnWrite();
        ajxs ajxsVar3 = (ajxs) aihfVar.instance;
        ajxsVar3.c |= 4;
        ajxsVar3.f = jLongValue;
        boolean z = !zBooleanValue;
        Boolean.valueOf(z).getClass();
        aihfVar.copyOnWrite();
        ajxs ajxsVar4 = (ajxs) aihfVar.instance;
        ajxsVar4.c |= 8;
        ajxsVar4.g = z;
        ajxr ajxrVarAm = ajxpVar.am();
        wer werVarE = wbyVarC.e();
        werVarE.e(ajxrVarAm);
        werVarE.b().D();
    }

    public final void h(int i, boolean z) {
        if (z) {
            ((View) this.d).setVisibility(8);
            return;
        }
        if (i == 0) {
            View view = (View) this.d;
            view.setEnabled(false);
            view.setVisibility(0);
            ((ImageView) this.c).setVisibility(8);
            return;
        }
        Object obj = this.d;
        if (i != 1) {
            View view2 = (View) obj;
            view2.setEnabled(false);
            view2.setVisibility(8);
            ((ImageView) this.c).setVisibility(8);
            return;
        }
        View view3 = (View) obj;
        view3.setEnabled(true);
        Context context = (Context) this.b;
        if (twb.e(context)) {
            tuk.n(context, R.string.accessibility_skip_ad, 0);
        }
        TextView textView = (TextView) this.a;
        textView.setContentDescription(null);
        textView.setText(context.getResources().getString(R.string.skip_ad));
        view3.setVisibility(0);
        ((ImageView) this.c).setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final snz i() {
        return new snz(this.c, this.b, (zzj) this.a, (sny) this.d, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final snz j(wgn wgnVar) {
        return new snz(this.c, this.b, (zzj) this.a, (sny) this.d, wgnVar);
    }

    public final void k(int i, int i2, int i3) {
        aihf aihfVarCreateBuilder = aiqy.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aiqy aiqyVar = (aiqy) aihfVarCreateBuilder.instance;
        aiqyVar.c = i - 1;
        aiqyVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aiqy aiqyVar2 = (aiqy) aihfVarCreateBuilder.instance;
        aiqyVar2.d = i2 - 1;
        aiqyVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        aiqy aiqyVar3 = (aiqy) aihfVarCreateBuilder.instance;
        aiqyVar3.e = i3 - 1;
        aiqyVar3.b |= 4;
        aiqy aiqyVar4 = (aiqy) aihfVarCreateBuilder.build();
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aiqyVar4.getClass();
        alouVar.d = aiqyVar4;
        alouVar.c = 389;
        ((dov) this.c).R((alou) alosVar.build());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void l(int i) {
        this.b.execute(afwl.i(new gkw(this, i, 3)));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    public final affd m(zwa zwaVar) {
        ListenableFuture listenableFutureO;
        ?? r5 = this.c;
        String strC = rmp.c(zwaVar);
        String strD = rmp.d(zwaVar);
        axqr axqrVar = (axqr) r5.io();
        afir afirVar = new afir(strC, strD);
        synchronized (axqrVar.a) {
            ?? r3 = axqrVar.b;
            ListenableFuture listenableFuture = (ListenableFuture) r3.get(afirVar);
            if (listenableFuture != null) {
                listenableFutureO = ahng.o(listenableFuture);
            } else {
                SettableFuture settableFutureCreate = SettableFuture.create();
                r3.put(afirVar, settableFutureCreate);
                settableFutureCreate.setFuture(ahcs.e(((qrx) axqrVar.c).c(), afwl.a(new afiq(strC, strD, 0)), MoreExecutors.directExecutor()));
                listenableFutureO = ahng.o(settableFutureCreate);
            }
        }
        return s(listenableFutureO, a.ca(strD, strC, "DefaultAccountIdResolver could not resolve ", ", "));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final ListenableFuture n(zwa zwaVar) {
        return afxd.f(((afho) this.d.io()).c()).g(new olh(zwaVar, 10), (Executor) this.a.io()).c(rqv.class, new idm(this, zwaVar, 12), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final ListenableFuture o(String str) {
        return afxd.f(((afho) this.d.io()).c()).g(new rns(str, 5), (Executor) this.a.io());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture p(String str, ListenableFuture listenableFuture) {
        int i = onb.a;
        return ((omj) this.b).c(new gmf(this, str, listenableFuture, 7, (char[]) null), this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture q(String str) {
        int i = onb.a;
        return ((omj) this.b).b(new jkb(this, str, 9), this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture r(String str) {
        int i = onb.a;
        return ((omj) this.b).c(new gwj(this, str, 11), this.a);
    }

    public syn(awmd awmdVar, afft afftVar, mbc mbcVar, awmd awmdVar2) {
        this.d = awmdVar;
        this.a = afftVar;
        this.c = mbcVar;
        this.b = awmdVar2;
    }

    public syn(dov dovVar, zwb zwbVar, rqu rquVar, Executor executor) {
        this.c = dovVar;
        this.a = zwbVar;
        this.d = rquVar;
        this.b = executor;
    }

    public syn(Executor executor, dov dovVar, Runnable runnable, awmd awmdVar) {
        this.b = executor;
        this.c = dovVar;
        this.a = runnable;
        this.d = awmdVar;
    }

    public syn(org orgVar, qnl qnlVar, Set set, kjc kjcVar) {
        this.d = orgVar;
        this.b = qnlVar;
        this.a = set;
        this.c = kjcVar;
    }

    public syn(sny snyVar, zwb zwbVar, Executor executor, zzj zzjVar) {
        this.d = snyVar;
        this.c = zwbVar;
        this.b = executor;
        this.a = zzjVar;
    }

    public syn(wbz wbzVar, taq taqVar, vwt vwtVar) {
        this.c = wbzVar;
        this.b = taqVar;
        this.a = new avmm();
        this.d = vwtVar;
    }

    public syn(xgg xggVar, ola olaVar, ong ongVar, Executor executor) {
        this.d = xggVar;
        this.b = olaVar;
        this.c = ongVar;
        this.a = executor;
    }

    public syn(Context context, View view, TextView textView, ImageView imageView) {
        context.getClass();
        this.b = context;
        view.getClass();
        this.d = view;
        textView.getClass();
        this.a = textView;
        imageView.getClass();
        this.c = imageView;
    }

    public syn(agev agevVar, agke agkeVar, agke agkeVar2, aero aeroVar) {
        this.c = agevVar;
        this.a = agkeVar;
        this.b = agkeVar2;
        this.d = aeroVar;
    }

    public syn(Executor executor, ont ontVar) {
        this.b = new omj();
        this.c = new HashMap();
        this.a = executor;
        this.d = ontVar;
    }

    public syn(Context context, agev agevVar, Executor executor, agfr agfrVar) {
        this.a = executor;
        this.b = agfrVar;
        this.c = new syn(executor, new ons());
        this.d = new syn(executor, new ooc(agevVar, context, 0));
    }
}
