package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqa {
    public final Object a;

    public lqa(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        DesugarCollections.synchronizedMap(new WeakHashMap());
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public static final void u(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            intent.getAction();
        }
    }

    public static final void v(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
        } else {
            intent.getAction();
        }
    }

    public static final void w(lfv lfvVar, Runnable runnable) {
        lfvVar.aU().j(new lfa(lfvVar, runnable, 7));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final aptc A(String str) {
        return (aptc) this.a.remove(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void B(String str, aptc aptcVar) {
        this.a.put(str, aptcVar);
    }

    public final ListenableFuture C() {
        return ahcs.e(((qrx) this.a).c(), new aeiw(7), MoreExecutors.directExecutor());
    }

    public final ListenableFuture D(String str) {
        return ahcs.e(E(), afwl.a(new acpb(str, 17)), MoreExecutors.directExecutor());
    }

    public final ListenableFuture E() {
        return ((ayq) this.a).i();
    }

    public final ListenableFuture F(String str, String str2) {
        return G(new vvg((Object) str, str2, 3));
    }

    public final ListenableFuture G(axp axpVar) {
        return ahcs.e(((ayq) this.a).j(axpVar), afwl.a(new aeiw(3)), MoreExecutors.directExecutor());
    }

    public final void H() {
        Object obj = this.a;
        aeij aeijVar = ((aeis) obj).b;
        synchronized (aeijVar) {
            ((aeis) obj).k = false;
            ((aeis) obj).l.set(0);
            ((aeis) obj).m = 1;
            ((aeis) obj).n = 30000L;
            aeim aeimVar = ((aeis) obj).f;
            aeit aeitVar = ((aeis) obj).h;
            aeimVar.g = aeitVar;
            if (((aeis) obj).i.d()) {
                aeijVar.c(aipa.MINI_APP_EVENT_USER_INTERACTION);
            } else {
                aeitVar.l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final aeht I(arkm arkmVar, xgn xgnVar) {
        acwd acwdVar = (acwd) this.a.io();
        acwdVar.getClass();
        return new aeht(arkmVar, xgnVar, acwdVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Optional J(String str) {
        return Optional.ofNullable((aehd) this.a.get(str));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void K(fsy fsyVar) {
        ?? r3 = this.a;
        r3.clear();
        for (int i = 0; i < fsyVar.h(); i++) {
            ftg ftgVarN = fsyVar.n(i);
            if (ftgVarN != null) {
                r3.put(ftgVarN, Integer.valueOf(i));
            }
        }
    }

    public final avlh L() {
        return ((avlh) this.a).P().E();
    }

    public final Integer M() {
        return (Integer) ((awku) this.a).aD();
    }

    public final void N(int i) {
        ((awku) this.a).kk(Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aeda, java.lang.Object] */
    public final boolean O() {
        return this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aeda, java.lang.Object] */
    public final boolean P() {
        return this.a.D();
    }

    public final synchronized void Q() {
        ((IdentityHashMap) this.a).clear();
    }

    public final synchronized void R(aqav aqavVar, boolean z) {
        ((IdentityHashMap) this.a).put(aqavVar, Boolean.valueOf(z));
    }

    public final adui S(Object obj) {
        return (adui) ((HashMap) this.a).get(obj);
    }

    public final void T(String str, byte[] bArr) {
        str.getClass();
        ((adon) this.a).put(str, bArr);
    }

    public final byte[] U(String str) {
        str.getClass();
        return (byte[]) ((adon) this.a).get(str);
    }

    public final void a(int i, boolean z) {
        ((lxh) this.a).e(i, z);
    }

    public final void b(int i, lxa lxaVar) {
        ((lxh) this.a).f(i, lxaVar);
    }

    public final void c(int i, double d) {
        ((lxh) this.a).H(i, d);
    }

    public final void d(int i, int i2) {
        ((lxh) this.a).k(i, i2);
    }

    public final void e(int i, int i2) {
        ((lxh) this.a).g(i, i2);
    }

    public final void f(int i, long j) {
        ((lxh) this.a).i(i, j);
    }

    public final void g(int i, float f) {
        ((lxh) this.a).J(i, f);
    }

    public final void h(int i, Object obj, lyz lyzVar) {
        lxh lxhVar = (lxh) this.a;
        lxhVar.q(i, 3);
        lyzVar.k((lwn) obj, this);
        lxhVar.q(i, 4);
    }

    public final void i(int i, int i2) {
        ((lxh) this.a).k(i, i2);
    }

    public final void j(int i, long j) {
        ((lxh) this.a).t(i, j);
    }

    public final void k(int i, Object obj, lyz lyzVar) {
        lwn lwnVar = (lwn) obj;
        lxh lxhVar = (lxh) this.a;
        lxhVar.q(i, 2);
        lxhVar.s(lwnVar.l(lyzVar));
        lyzVar.k(lwnVar, this);
    }

    public final void l(int i, int i2) {
        ((lxh) this.a).g(i, i2);
    }

    public final void m(int i, long j) {
        ((lxh) this.a).i(i, j);
    }

    public final void n(int i, int i2) {
        ((lxh) this.a).r(i, (i2 << 1) ^ (i2 >> 31));
    }

    public final void o(int i, long j) {
        ((lxh) this.a).t(i, (j << 1) ^ (j >> 63));
    }

    public final void p(int i, int i2) {
        ((lxh) this.a).r(i, i2);
    }

    public final void q(int i, long j) {
        ((lxh) this.a).t(i, j);
    }

    public final void r() {
        ((lpf) this.a).u(null);
    }

    public final void s() {
        this.a.getClass().getSimpleName();
    }

    public final void t() {
        this.a.getClass().getSimpleName();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final List x(ajyr ajyrVar) {
        if (ajyrVar == null) {
            return agpi.a;
        }
        agke agkeVar = (agke) this.a.get(ajyrVar);
        return agkeVar == null ? ajyrVar.d : agkeVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void y(ajyr ajyrVar, agke agkeVar) {
        this.a.put(ajyrVar, agkeVar);
    }

    public final void z(srp srpVar) {
        ((dov) ((wjr) this.a).a).ad(srpVar);
    }

    public lqa(Object obj) {
        this.a = obj;
    }

    public lqa(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public lqa(ljj ljjVar) {
        this.a = new ljj(ljjVar.a, ljjVar.b, ljjVar.c, ljjVar.d);
    }

    public lqa(byte[] bArr) {
        this.a = new lpf();
    }

    public lqa(byte[] bArr, short[] sArr) {
        this.a = "";
    }

    public lqa(char[] cArr) {
        this.a = new ljj();
    }

    public lqa(Context context) {
        Context applicationContext = context.getApplicationContext();
        kro.l(applicationContext);
        this.a = applicationContext;
    }

    public lqa(lxh lxhVar) {
        byte[] bArr = lyf.a;
        this.a = lxhVar;
        lxhVar.b = this;
    }

    public lqa(int[] iArr) {
        this.a = new HashMap();
    }

    public lqa(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new IdentityHashMap();
        new IdentityHashMap();
    }

    public lqa(byte[] bArr, char[] cArr) {
        this.a = new awlo().az();
    }

    public lqa(short[] sArr, byte[] bArr) {
        this.a = new wjr((tyz) new ssm(), (Collection) agpr.a);
    }

    public lqa() {
        this.a = new lqa((byte[]) null);
    }

    public lqa(char[] cArr, byte[] bArr) {
        this.a = DesugarCollections.synchronizedMap(new IdentityHashMap());
    }

    public lqa(byte[] bArr, byte[] bArr2) {
        this.a = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap(4)));
    }

    public lqa(short[] sArr) {
        this.a = DesugarCollections.synchronizedSet(new HashSet());
    }

    public lqa(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = new adon();
    }

    public lqa(char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        adsy adsyVar = new adsy();
        adsyVar.b();
        this.a = adsyVar;
    }

    public lqa(byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        this.a = new HashMap();
    }

    public lqa(short[] sArr, char[] cArr) {
        this.a = new IdentityHashMap();
    }

    public lqa(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new awku();
    }

    public lqa(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new ConcurrentHashMap();
    }

    public lqa(char[] cArr, char[] cArr2) {
        this.a = new HashMap();
    }

    public lqa(awmd awmdVar, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public lqa(awmd awmdVar, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public lqa(zj zjVar, ScheduledExecutorService scheduledExecutorService, vxz vxzVar) {
        this.a = new aeis(zjVar, scheduledExecutorService, vxzVar);
    }
}
