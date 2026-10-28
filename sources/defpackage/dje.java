package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dje {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final AbstractCollection e;
    public final Object f;
    public final Object g;
    final Object h;
    private final Object i;

    public dje(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, bvd bvdVar, bvt bvtVar, boolean z) {
        this.d = thread;
        this.e = copyOnWriteArraySet;
        this.c = bvtVar;
        this.i = new Object();
        this.h = new ArrayDeque();
        this.g = new ArrayDeque();
        this.f = (looper == null || bvdVar == null || bvtVar == null) ? null : bvdVar.d(looper, new bwd(this, 1));
        this.b = z;
    }

    private final void j() {
        if (this.b && !i()) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void a() {
        ((Handler) this.d).post(this.g);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.AbstractCollection, java.util.List] */
    public final void b() {
        if (this.b) {
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList2 = new ArrayList();
                Iterator<ResolveInfo> it = ((PackageManager) this.i).queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (!this.a || TextUtils.equals(((Context) this.c).getPackageName(), serviceInfo.packageName)) {
                        arrayList2.add(serviceInfo);
                    }
                }
                arrayList = arrayList2;
            }
            Iterator<ResolveInfo> it2 = ((PackageManager) this.i).queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i = 0;
            while (true) {
                byte[] bArr = null;
                int i2 = -1;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if (dij.e() && !arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                ServiceInfo serviceInfo3 = (ServiceInfo) it3.next();
                                if (!serviceInfo2.packageName.equals(serviceInfo3.packageName) || !serviceInfo2.name.equals(serviceInfo3.name)) {
                                }
                            }
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    ?? r9 = this.e;
                    ArrayList arrayList3 = (ArrayList) r9;
                    int size = arrayList3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ComponentName componentName = ((djc) arrayList3.get(i3)).a;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            i2 = i3;
                            break;
                        }
                    }
                    if (i2 < 0) {
                        djc djcVar = new djc((Context) this.c, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        djcVar.n = new hhb(this, bArr);
                        djcVar.o();
                        arrayList3.add(i, djcVar);
                        ((dgr) this.h).i(djcVar, false);
                        i++;
                    } else if (i2 >= i) {
                        int i4 = i + 1;
                        djc djcVar2 = (djc) arrayList3.get(i2);
                        djcVar2.o();
                        if (djcVar2.d == null && djcVar2.r()) {
                            djcVar2.p();
                            djcVar2.f();
                        }
                        Collections.swap(r9, i2, i);
                        i = i4;
                    }
                }
            }
            ArrayList arrayList4 = (ArrayList) this.e;
            if (i < arrayList4.size()) {
                for (int size2 = arrayList4.size() - 1; size2 >= i; size2--) {
                    djc djcVar3 = (djc) arrayList4.get(size2);
                    ((dgr) this.h).l(djcVar3);
                    arrayList4.remove(djcVar3);
                    djcVar3.n = null;
                    if (djcVar3.c) {
                        djcVar3.c = false;
                        djcVar3.q();
                    }
                }
            }
        }
    }

    public final void c(Object obj) {
        obj.getClass();
        synchronized (this.i) {
            if (this.a) {
                return;
            }
            ((CopyOnWriteArraySet) this.e).add(new bvu(obj));
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [bvq, java.lang.Object] */
    public final void d() {
        j();
        Object obj = this.g;
        ArrayDeque arrayDeque = (ArrayDeque) obj;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            ?? r2 = this.f;
            r2.getClass();
            if (!r2.c(1)) {
                r2.m(r2.j(1));
            }
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.h;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(obj);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void e(int i, bvs bvsVar) {
        j();
        ((ArrayDeque) this.g).add(new kdw(new CopyOnWriteArraySet(this.e), i, bvsVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [bvt, java.lang.Object] */
    public final void f() {
        j();
        synchronized (this.i) {
            this.a = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.e;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((bvu) it.next()).a(this.c);
        }
        copyOnWriteArraySet.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [bvt, java.lang.Object] */
    public final void g(Object obj) {
        j();
        CopyOnWriteArraySet<bvu> copyOnWriteArraySet = (CopyOnWriteArraySet) this.e;
        for (bvu bvuVar : copyOnWriteArraySet) {
            if (bvuVar.a.equals(obj)) {
                bvuVar.a(this.c);
                copyOnWriteArraySet.remove(bvuVar);
            }
        }
    }

    public final void h(int i, bvs bvsVar) {
        e(i, bvsVar);
        d();
    }

    public final boolean i() {
        return Thread.currentThread() == this.d;
    }

    public dje(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public dje(Context context, dgr dgrVar) {
        this.e = new ArrayList();
        this.f = new djd(this);
        this.g = new px(this, 7);
        this.c = context;
        this.h = dgrVar;
        this.d = new Handler();
        this.i = context.getPackageManager();
    }
}
