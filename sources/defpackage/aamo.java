package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aamo {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public aamo(asqr asqrVar, aunn aunnVar, aunn aunnVar2, agev agevVar) {
        this.b = asqrVar;
        this.e = aunnVar;
        this.d = aunnVar2;
        this.a = ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.c = valueAnimatorOfFloat;
        float f = asqrVar.g;
        if (f > 0.0f) {
            valueAnimatorOfFloat.setDuration((long) f);
        } else {
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setRepeatCount(-1);
        }
    }

    public static aamo b(aohb aohbVar) {
        aqmh aqmhVar = aohbVar.d;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        abuz abuzVar = new abuz(aajg.f(aqmhVar, agke.r(240, 480)));
        aodw aodwVar = aohbVar.e;
        if (aodwVar == null) {
            aodwVar = aodw.a;
        }
        return new aamo(aohbVar, false, abuzVar, aaok.b(aodwVar));
    }

    private static void q() {
        ahno.P(Looper.myLooper() == Looper.getMainLooper(), "Must be called from the main thread");
    }

    private static String r(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        aihf aihfVarCreateBuilder = fxp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        fxp fxpVar = (fxp) aihfVarCreateBuilder.instance;
        fxpVar.f = 4;
        fxpVar.b |= 4;
        aihfVarCreateBuilder.A(aigj.v(bArr));
        return Base64.encodeToString(((fxp) aihfVarCreateBuilder.build()).toByteArray(), 11);
    }

    private final synchronized byte[] s(Map map) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.c;
        } catch (Exception e) {
            ((kwc) this.b).c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public final long a() {
        return ((aohb) this.e).q;
    }

    public final aqmh c() {
        Object obj = this.c;
        if (obj != null) {
            return ((abuz) obj).l();
        }
        return null;
    }

    public final String d() {
        return ((aohb) this.e).c;
    }

    public final String e() {
        return ((asqr) this.b).f;
    }

    public final synchronized void f() {
        q();
        ahno.O(this.a);
        Object obj = this.c;
        if (((ValueAnimator) obj).isRunning()) {
            ((ValueAnimator) obj).removeAllListeners();
            ((ValueAnimator) obj).setCurrentPlayTime(Math.max((long) ((asqr) this.b).g, 0L));
            ((ValueAnimator) obj).cancel();
        }
    }

    public final synchronized void g(nrv nrvVar) {
        q();
        Object obj = this.c;
        if (!((ValueAnimator) obj).isRunning()) {
            ((ValueAnimator) obj).removeAllUpdateListeners();
            ((ValueAnimator) obj).addUpdateListener(new vmg(this, nrvVar, 1));
            Object obj2 = this.b;
            if ((((asqr) obj2).c & 8) != 0) {
                ((ValueAnimator) obj).addListener(new mgf(this, nrvVar));
            }
            if (!this.a || ValueAnimator.areAnimatorsEnabled()) {
                ((ValueAnimator) obj).start();
            } else if (((asqr) obj2).g > 0.0f) {
                ((ValueAnimator) obj).end();
            }
        }
    }

    public final synchronized void h() {
        q();
        Object obj = this.c;
        ((ValueAnimator) obj).removeAllUpdateListeners();
        if (!this.a) {
            ((ValueAnimator) obj).end();
        } else {
            ((ValueAnimator) obj).removeAllListeners();
            ((ValueAnimator) obj).cancel();
        }
    }

    public final synchronized int i() {
        Object obj;
        try {
            obj = this.c;
        } catch (Exception e) {
            throw new kwu(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }

    public final synchronized void j() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.c;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            ((kwc) this.b).d(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new kwu(2003, e);
        }
    }

    public final synchronized boolean k() {
        Object obj;
        try {
            obj = this.c;
        } catch (Exception e) {
            throw new kwu(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kww] */
    public final synchronized String l(Context context, String str, View view, Activity activity) {
        byte[] bArrS;
        Map mapA = this.d.a();
        mapA.put("f", "c");
        mapA.put("ctx", context);
        mapA.put("cs", str);
        mapA.put("aid", null);
        mapA.put("view", view);
        mapA.put("act", activity);
        bArrS = s(mapA);
        if (this.a) {
            mapA.clear();
        }
        return r(bArrS);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kww] */
    public final synchronized String m(Context context, View view, Activity activity) {
        byte[] bArrS;
        Map mapD = this.d.d();
        mapD.put("f", "v");
        mapD.put("ctx", context);
        mapD.put("aid", null);
        mapD.put("view", view);
        mapD.put("act", activity);
        bArrS = s(mapD);
        if (this.a) {
            mapD.clear();
        }
        return r(bArrS);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kww] */
    public final synchronized String n(Context context) {
        byte[] bArrS;
        Map mapB = this.d.b();
        mapB.put("f", "q");
        mapB.put("ctx", context);
        mapB.put("aid", null);
        bArrS = s(mapB);
        if (this.a) {
            mapB.clear();
        }
        return r(bArrS);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kww] */
    public final synchronized void o(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapC = this.d.c();
            mapC.put("aid", null);
            mapC.put("evt", motionEvent);
            Object obj = this.c;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapC);
            ((kwc) this.b).d(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new kwu(2005, e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Set] */
    public final void p(Optional optional) {
        if (!((abmt) this.b).bj()) {
            ?? r6 = this.c;
            for (mbb mbbVar : r6) {
                if (optional.isPresent()) {
                    mbbVar.c((Throwable) optional.get());
                } else {
                    mbbVar.b();
                }
            }
            r6.clear();
            return;
        }
        ?? r0 = this.d;
        ArrayList arrayList = new ArrayList(r0.entrySet());
        r0.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i);
            mbb mbbVar2 = (mbb) entry.getKey();
            List list = (List) entry.getValue();
            if (optional.isPresent()) {
                mbbVar2.c((Throwable) optional.get());
            } else {
                mbbVar2.b();
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((acga) this.e).n((abac) it.next());
                }
            }
        }
    }

    public aamo(Object obj, aepb aepbVar, kww kwwVar, kwc kwcVar, boolean z) {
        this.c = obj;
        this.e = aepbVar;
        this.d = kwwVar;
        this.b = kwcVar;
        this.a = z;
    }

    public aamo(CharSequence charSequence, Bundle bundle, Set set) {
        this.d = "com.google.android.libraries.notifications.REPLY_TEXT_KEY";
        this.e = charSequence;
        this.a = true;
        this.b = bundle;
        this.c = set;
    }

    public aamo(aohb aohbVar, boolean z, abuz abuzVar, aaok aaokVar) {
        aohbVar.getClass();
        this.e = aohbVar;
        this.a = z;
        this.c = abuzVar;
        this.b = aaokVar;
        if (!aohbVar.j.isEmpty()) {
            Uri.parse(aohbVar.j);
        }
        this.d = new Date(TimeUnit.SECONDS.toMillis(aohbVar.h));
    }

    public aamo(acga acgaVar, abmt abmtVar) {
        this.c = new HashSet();
        this.d = new ConcurrentHashMap();
        acgaVar.getClass();
        this.e = acgaVar;
        abmtVar.getClass();
        this.b = abmtVar;
        this.a = abmtVar.g.m(94, 45617235L);
    }
}
