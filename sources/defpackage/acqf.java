package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acqf {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public acqf(ahia ahiaVar) {
        this.c = new HashMap(ahiaVar.a);
        this.d = new HashMap(ahiaVar.b);
        this.a = new HashMap(ahiaVar.c);
        this.b = new HashMap(ahiaVar.d);
    }

    public static abnl d(wgi wgiVar, abnl abnlVar, vyo vyoVar) {
        aoqs aoqsVarR;
        String str = wgiVar.b;
        ajwo ajwoVar = wgiVar.d;
        if (ajwoVar == null || (aoqsVarR = abmt.r(vyoVar)) == null || !aoqsVarR.w) {
            abnk abnkVarF = abnlVar.f();
            abnkVarF.r = str;
            return abnkVarF.a();
        }
        abnk abnkVar = new abnk();
        abnkVar.y = abnlVar.g;
        abnkVar.a = ajwoVar;
        abnl abnlVarA = abnkVar.a();
        if (!TextUtils.isEmpty(abnlVarA.w())) {
            return abnlVarA;
        }
        abnk abnkVarF2 = abnlVarA.f();
        abnkVarF2.r = str;
        return abnkVarF2.a();
    }

    public static ListenableFuture e(wgi wgiVar, abnl abnlVar, abnp abnpVar, String str, agek agekVar, vyo vyoVar) {
        return (ListenableFuture) agekVar.apply(new abpw(d(wgiVar, abnlVar, vyoVar), abnpVar, str, true));
    }

    public static final abrj f(avlr avlrVar, avlr avlrVar2) {
        ahgr ahgrVarB = abrj.b();
        ahgrVarB.h(agkj.k(abpg.class, avlrVar, abqu.class, avlrVar2));
        return ahgrVarB.f();
    }

    public static final abrj g(ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        return f(tzk.c(listenableFuture).k(), tzk.c(listenableFuture2).k());
    }

    public static grj h(abnl abnlVar, abnp abnpVar, vyo vyoVar, String str, agek agekVar, agek agekVar2, boolean z, Executor executor) {
        if (!TextUtils.isEmpty(abnlVar.w())) {
            return new grj((ListenableFuture) agekVar.apply(new abpw(abnlVar, abnpVar, str, z)), agdf.a);
        }
        ListenableFuture listenableFuture = (ListenableFuture) agekVar2.apply(new abpx(abnlVar, abnpVar));
        return new grj(ahcs.f(listenableFuture, afwl.d(new okm(abnlVar, abnpVar, str, agekVar, vyoVar, 7)), executor), agev.i(listenableFuture));
    }

    public final void a() {
        ((avmm) this.d).b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture b(agkj agkjVar) {
        return ahno.as(((syn) this.c).n(this.b.e()), new aaoq(this, agkjVar, 7, null), this.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture c() {
        return ahno.ar(((syn) this.d.io()).n(((zwb) this.b.io()).e()), new aaoz(new abqf(this, 6), 15), this.a);
    }

    public acqf(Executor executor, Executor executor2, abmt abmtVar, vyo vyoVar) {
        this.b = executor;
        this.d = executor2;
        this.a = abmtVar;
        this.c = vyoVar;
    }

    public acqf(acqz acqzVar, aunn aunnVar, hno hnoVar) {
        acqzVar.getClass();
        aunnVar.getClass();
        hnoVar.getClass();
        this.a = acqzVar;
        this.b = aunnVar;
        this.c = hnoVar;
        this.d = new avmm();
    }

    public acqf(Context context, awmd awmdVar, awmd awmdVar2, Executor executor) {
        context.getClass();
        awmdVar2.getClass();
        executor.getClass();
        this.c = context;
        this.d = awmdVar;
        this.b = awmdVar2;
        this.a = executor;
    }

    public acqf(mbc mbcVar, String str, ListenableFuture listenableFuture) {
        this.d = mbcVar;
        this.a = str;
        this.c = listenableFuture;
        this.b = mbcVar.f();
    }

    public acqf(aeeu aeeuVar, alhq alhqVar, View view, xgn xgnVar, aeem aeemVar) {
        this.d = new aeet(alhqVar.c, view, aeeuVar.d);
        this.b = new WeakReference(alhqVar);
        this.a = new WeakReference(xgnVar);
        this.c = new WeakReference(aeemVar);
    }

    public acqf() {
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public acqf(Context context, zwb zwbVar, syn synVar, Executor executor) {
        this.a = context;
        this.b = zwbVar;
        this.c = synVar;
        this.d = executor;
    }
}
