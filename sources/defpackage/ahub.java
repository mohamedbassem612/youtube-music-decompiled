package defpackage;

import android.os.Bundle;
import android.os.Looper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahub {
    public final Object a;

    public ahub(agmj agmjVar) {
        agnw agnwVar;
        agmjVar.e(agdz.a);
        int i = agnw.h;
        agmy agmyVarC = agmjVar.c();
        agmy agmyVar = agmy.a;
        if (agmyVarC == agmyVar && agmjVar.d() == agmyVar) {
            agnwVar = new agnw(agmjVar, agnb.b);
        } else {
            agmy agmyVarC2 = agmjVar.c();
            agmy agmyVar2 = agmy.b;
            if (agmyVarC2 != agmyVar2 || agmjVar.d() != agmyVar) {
                ahno.G(agmjVar.d() != agmyVar2, "Map cannot have both weak and dummy values");
                throw new AssertionError();
            }
            agnwVar = new agnw(agmjVar, agnb.d);
        }
        this.a = agnwVar;
    }

    public static ahub M() {
        return new ahub(agdf.a);
    }

    public static ahub d(byte[] bArr) {
        return new ahub(ahnf.b(bArr));
    }

    public static Object g(Deque deque) {
        Iterator it = (Iterator) deque.getFirst();
        if (!it.hasNext()) {
            deque.removeFirst();
            return null;
        }
        Object next = it.next();
        next.getClass();
        return next;
    }

    public static ahub r(ListenableFuture listenableFuture) {
        return new ahub(ahcs.e(listenableFuture, new aeni(10), MoreExecutors.directExecutor()));
    }

    public static ahub s(ListenableFuture listenableFuture) {
        return new ahub(ahcs.e(listenableFuture, new agel(), MoreExecutors.directExecutor()));
    }

    public final void A(aibw aibwVar) {
        aibwVar.getClass();
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        aiau aiauVar = (aiau) aihfVar.instance;
        aihw aihwVar = aiau.a;
        aiauVar.g = aibwVar;
        aiauVar.c |= 16;
    }

    public final void B(aieu aieuVar) {
        aieuVar.getClass();
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        aiau aiauVar = (aiau) aihfVar.instance;
        aihw aihwVar = aiau.a;
        aiauVar.i = aieuVar;
        aiauVar.c |= 64;
    }

    public final void C(aibz aibzVar) {
        aibzVar.getClass();
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        aiau aiauVar = (aiau) aihfVar.instance;
        aihw aihwVar = aiau.a;
        aiauVar.e = aibzVar;
        aiauVar.c |= 2;
    }

    public final /* synthetic */ void D(Iterable iterable) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        aiau aiauVar = (aiau) aihfVar.instance;
        aihw aihwVar = aiau.a;
        aiie aiieVar = aiauVar.l;
        if (!aiieVar.c()) {
            aiauVar.l = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, aiauVar.l);
    }

    public final /* synthetic */ void E() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aiau) ((aihf) this.a).instance).l);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public final /* synthetic */ ahzs F() {
        aihn aihnVarBuild = ((aihf) this.a).build();
        aihnVarBuild.getClass();
        return (ahzs) aihnVarBuild;
    }

    public final void G(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzs ahzsVar = (ahzs) aihfVar.instance;
        ahzs ahzsVar2 = ahzs.a;
        ahzsVar.b |= 1;
        ahzsVar.e = str;
    }

    public final void H(ahzr ahzrVar) {
        ahzrVar.getClass();
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzs ahzsVar = (ahzs) aihfVar.instance;
        ahzs ahzsVar2 = ahzs.a;
        ahzsVar.d = ahzrVar;
        ahzsVar.c = 1;
    }

    public final /* synthetic */ ahzn I() {
        aihn aihnVarBuild = ((aihf) this.a).build();
        aihnVarBuild.getClass();
        return (ahzn) aihnVarBuild;
    }

    public final void J(ahzm ahzmVar) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzn ahznVar = (ahzn) aihfVar.instance;
        ahzn ahznVar2 = ahzn.a;
        ahznVar.f = ahzmVar;
        ahznVar.b |= 2;
    }

    public final void K(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzn ahznVar = (ahzn) aihfVar.instance;
        ahzn ahznVar2 = ahzn.a;
        ahznVar.b |= 1;
        ahznVar.e = str;
    }

    public final void L(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzn ahznVar = (ahzn) aihfVar.instance;
        ahzn ahznVar2 = ahzn.a;
        ahznVar.c = 4;
        ahznVar.d = str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void a(ByteBuffer byteBuffer) {
        ?? r1 = this.a;
        if (r1.isEmpty() || r1.get(r1.size() - 1) != byteBuffer) {
            r1.add(byteBuffer);
        }
    }

    public final int b() {
        return ((ahnf) this.a).a();
    }

    public final byte[] c() {
        return ((ahnf) this.a).c();
    }

    public final agxz e() {
        return new agxz(((StringBuilder) this.a).toString());
    }

    public final void f(String str, String str2) {
        Object obj = this.a;
        StringBuilder sb = (StringBuilder) obj;
        if (sb.indexOf("#") >= 0) {
            throw new IllegalStateException("Cannot add query parameters after a fragment was added, URL: ".concat(obj.toString()));
        }
        int iIndexOf = sb.indexOf("?");
        if (iIndexOf < 0) {
            sb.append('?');
        } else if (iIndexOf + 1 != sb.length()) {
            sb.append('&');
        }
        agvp agvpVar = ahbk.a;
        sb.append(agvpVar.b(str));
        sb.append('=');
        sb.append(agvpVar.b(str2));
    }

    public final Object h(Object obj) {
        Object obj2;
        agms agmsVarB;
        Object objC;
        do {
            obj2 = this.a;
            if (obj == null) {
                agmsVarB = null;
            } else {
                agnw agnwVar = (agnw) obj2;
                int iA = agnwVar.a(obj);
                agmsVarB = agnwVar.c(iA).b(obj, iA);
            }
            if (agmsVarB != null && (objC = agmsVarB.c()) != null) {
                return objC;
            }
        } while (((agmi) ((agnw) obj2).putIfAbsent(obj, agmi.VALUE)) != null);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void i(agpf agpfVar) {
        ahno.K(!agpfVar.i(), "range must not be empty, but was %s", agpfVar);
        this.a.add(agpfVar);
    }

    public final apjh j() {
        apjh apjhVar = ((asib) this.a).c;
        return apjhVar == null ? apjh.a : apjhVar;
    }

    public final afxj k(afxh afxhVar) {
        aha ahaVar = (aha) this.a;
        if (!ahaVar.isEmpty()) {
            Class<?> cls = afxhVar.getClass();
            for (int i = 0; i < ahaVar.d; i++) {
                Class cls2 = (Class) ahaVar.d(i);
                if (cls2.isAssignableFrom(cls)) {
                    return yno.gG(afxhVar);
                }
            }
        }
        return afxj.b;
    }

    public final void l() {
        ((aha) this.a).clear();
    }

    public final afxd m(Callable callable, Executor executor) {
        return afxd.f(((ahud) this.a).k(callable, executor));
    }

    public final void n() {
        ((Boolean) this.a).booleanValue();
    }

    public final Object o(int i, bog bogVar, afqe afqeVar) {
        aewp aewpVar = new aewp();
        ahno.O(Looper.getMainLooper().getThread() == Thread.currentThread());
        bob bobVarA = bogVar.getLifecycle().a();
        ahno.R(bobVarA == bob.b, "Values may only be accessed during the INITIALIZED part of the LifecycleOwner's lifecycle. Each lifecycle must call getOrCreate() for each and only each value that the first LifecycleOwner instance called getOrCreate() for, exactly once. The current lifecycle state is %s", bobVarA);
        afqf afqfVar = (afqf) this.a;
        if (afqfVar.e) {
            Set set = (Set) afqfVar.a.get(bogVar);
            Integer numValueOf = Integer.valueOf(i);
            ahno.Q(set.add(numValueOf), "A value for idRes %s has already been gotten. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
            Map map = afqfVar.d;
            ahno.Q(map.containsKey(numValueOf), "The first lifecycle didn't create a value for idRes %s. Is the LifecycleOwner accessing this value inside a conditional?", i);
            return ((aciz) map.get(numValueOf)).a;
        }
        ahno.P(bogVar == afqfVar.c, "A second Lifecycle started before the first lifecycle either started or was destroyed. This breaks a boundary condition assumption in TikTok. Please report it as a bug and include reproduction steps and a stack trace.");
        Object objA = afqeVar.a();
        Map map2 = afqfVar.d;
        Integer numValueOf2 = Integer.valueOf(i);
        ahno.Q(map2.put(numValueOf2, new aciz(objA, aewpVar, (char[]) null)) == null, "Input id %s was previously used. Each ID must be used exactly once each lifecycle.", i);
        ahno.Q(((Set) afqfVar.a.get(bogVar)).add(numValueOf2), "A value was previously created for idRes %s. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
        return objA;
    }

    public final avlh p() {
        return ((avlr) this.a).r().g(avla.c);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final ListenableFuture q(String str) {
        ?? r1 = this.a;
        return r1.containsKey(str) ? ahng.n((aciz) r1.get(str)) : ahng.n(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized Object t(long j) {
        return this.a.get(Long.valueOf(j));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void u(long j, Object obj) {
        this.a.put(Long.valueOf(j), obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void v(long j) {
        this.a.remove(Long.valueOf(j));
    }

    public final /* synthetic */ aiau w() {
        aihn aihnVarBuild = ((aihf) this.a).build();
        aihnVarBuild.getClass();
        return (aiau) aihnVarBuild;
    }

    public final void x(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        aiau aiauVar = (aiau) aihfVar.instance;
        aihw aihwVar = aiau.a;
        aiauVar.c |= 1;
        aiauVar.d = str;
    }

    public final void y(aidy aidyVar) {
        aidyVar.getClass();
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        aiau aiauVar = (aiau) aihfVar.instance;
        aihw aihwVar = aiau.a;
        aiauVar.h = aidyVar.q;
        aiauVar.c |= 32;
    }

    public final void z(long j) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        aiau aiauVar = (aiau) aihfVar.instance;
        aihw aihwVar = aiau.a;
        aiauVar.c |= 4;
        aiauVar.f = j;
    }

    public ahub(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ahub(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new HashMap();
    }

    public ahub(byte[] bArr, char[] cArr) {
        this.a = Boolean.FALSE;
    }

    public ahub(char[] cArr, byte[] bArr) {
        this.a = new awli();
    }

    public ahub(short[] sArr) {
        this.a = new aha(0);
    }

    public ahub(byte[] bArr, byte[] bArr2) {
        this.a = new axfi(false);
    }

    public ahub(Matcher matcher) {
        matcher.getClass();
        this.a = matcher;
    }

    public ahub(char[] cArr) {
        this.a = new ArrayList();
    }

    public ahub(Object obj) {
        this.a = obj;
    }

    public ahub(agxz agxzVar) {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        sb.append(agxzVar.a);
    }

    public ahub(byte[] bArr) {
        this.a = new AtomicBoolean(false);
    }

    public ahub(ahpv ahpvVar) {
        Bundle bundle;
        if (ahpvVar.d == 0) {
            ahpvVar.d = System.currentTimeMillis();
        }
        this.a = ahpvVar;
        Bundle bundle2 = new Bundle();
        ahpvVar.a();
        Bundle bundle3 = ahpvVar.a().getBundle("scionData");
        if (bundle3 == null || (bundle = bundle3.getBundle("_cmp")) == null) {
            return;
        }
        aedi.s("medium", "utm_medium", bundle, bundle2);
        aedi.s("source", "utm_source", bundle, bundle2);
        aedi.s("campaign", "utm_campaign", bundle, bundle2);
    }

    public ahub() {
        this.a = new ArrayList();
    }

    public ahub(int[] iArr) {
        this.a = new HashMap();
    }
}
