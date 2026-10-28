package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import android.view.View;
import android.view.WindowId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gmj {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public gmj(syn synVar, zwb zwbVar, tbt tbtVar, Context context, awut awutVar, Executor executor) {
        synVar.getClass();
        zwbVar.getClass();
        tbtVar.getClass();
        context.getClass();
        awutVar.getClass();
        executor.getClass();
        this.f = synVar;
        this.a = zwbVar;
        this.b = context;
        this.c = awutVar;
        this.d = executor;
        tbtVar.f(this);
        this.e = new ConcurrentHashMap();
    }

    public static final ajwo c(amlg amlgVar, String str) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = amla.b;
        aihf aihfVarCreateBuilder = amla.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amla amlaVar = (amla) aihfVarCreateBuilder.instance;
        amlaVar.f = amlgVar.e;
        amlaVar.c |= 1;
        aihf aihfVarCreateBuilder2 = amlh.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amlh amlhVar = (amlh) aihfVarCreateBuilder2.instance;
        str.getClass();
        amlhVar.b |= 1;
        amlhVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        amla amlaVar2 = (amla) aihfVarCreateBuilder.instance;
        amlh amlhVar2 = (amlh) aihfVarCreateBuilder2.build();
        amlhVar2.getClass();
        amlaVar2.g = amlhVar2;
        amlaVar2.c |= 2;
        aihhVar.e(aihlVar, (amla) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final ListenableFuture a() {
        gmh gmhVar = new gmh(null, 0);
        zwa zwaVarE = this.a.e();
        int i = awrn.a;
        Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(this.e, new awqv(agab.class), new gmi(new gmg(this, zwaVarE, gmhVar, 0)));
        objComputeIfAbsent.getClass();
        return ((afkb) objComputeIfAbsent).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zwa zwaVar, awoq awoqVar) throws Throwable {
        gmd gmdVar;
        Class cls;
        Object obj;
        if (awoqVar instanceof gmd) {
            gmdVar = (gmd) awoqVar;
            int i = gmdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gmdVar.d = i - Integer.MIN_VALUE;
            } else {
                gmdVar = new gmd(this, awoqVar);
            }
        } else {
            gmdVar = new gmd(this, awoqVar);
        }
        Object obj2 = gmdVar.b;
        awox awoxVar = awox.a;
        int i2 = gmdVar.d;
        if (i2 == 0) {
            atqp.j(obj2);
            Object obj3 = this.b;
            ListenableFuture listenableFutureN = ((syn) this.f).n(zwaVar);
            gmdVar.a = obj3;
            gmdVar.e = gmb.class;
            gmdVar.d = 1;
            Object objAd = awrc.ad(listenableFutureN, gmdVar);
            if (objAd == awoxVar) {
                return awoxVar;
            }
            obj2 = objAd;
            cls = gmb.class;
            obj = obj3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cls = gmdVar.e;
            obj = gmdVar.a;
            atqp.j(obj2);
        }
        return ((gmb) aguu.aw((Context) obj, cls, (affd) obj2)).j();
    }

    public final void d(int i) {
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(((cf) this.f).getText(i));
        ((jin) this.b).d(jioVarE.b());
    }

    @tcc
    public final void handleSignInEvent(zwt zwtVar) {
        zwtVar.getClass();
        agrx agrxVar = agso.a;
        ((ConcurrentHashMap) this.e).clear();
    }

    public gmj(cf cfVar, vxe vxeVar, jin jinVar, kwq kwqVar, awmd awmdVar, vxz vxzVar) {
        this.f = cfVar;
        this.d = vxeVar;
        this.b = jinVar;
        this.e = kwqVar;
        this.c = awmdVar;
        this.a = vxzVar;
    }

    public gmj(clo cloVar, MediaFormat mediaFormat, bse bseVar, Surface surface, MediaCrypto mediaCrypto, mgk mgkVar) {
        this.f = cloVar;
        this.d = mediaFormat;
        this.a = bseVar;
        this.c = surface;
        this.b = mediaCrypto;
        this.e = mgkVar;
    }

    public gmj(Context context, awmd awmdVar, Executor executor, wco wcoVar, zwb zwbVar, vxz vxzVar) {
        this.f = context;
        this.c = executor;
        this.b = wcoVar;
        this.d = zwbVar;
        this.e = vxzVar;
        this.a = aguu.al(new cbq(awmdVar, 14));
    }

    public gmj(View view, String str, dsa dsaVar, WindowId windowId, dsk dskVar, Animator animator) {
        this.d = view;
        this.f = str;
        this.e = dskVar;
        this.c = windowId;
        this.a = dsaVar;
        this.b = animator;
    }

    public gmj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6) {
        awmdVar.getClass();
        this.f = awmdVar;
        this.b = awmdVar2;
        this.e = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        this.a = awmdVar5;
        awmdVar6.getClass();
        this.c = awmdVar6;
    }
}
