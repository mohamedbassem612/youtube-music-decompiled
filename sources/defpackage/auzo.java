package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auzo extends atxy {
    public ScheduledExecutorService b;
    public final CronetEngine c;
    public final avhf d;
    public int e;
    public final axst f;

    private auzo(String str, int i, CronetEngine cronetEngine) {
        super(null);
        this.f = avkf.f;
        this.e = 4194304;
        this.d = new avhf(InetSocketAddress.createUnresolved(str, i), avfp.d(str, i), new avgj(this));
        this.c = cronetEngine;
    }

    public static auzo v(String str, int i, CronetEngine cronetEngine) {
        cronetEngine.getClass();
        return new auzo(str, i, cronetEngine);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("delegate", this.d);
        return ageuVarAc.toString();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [avkd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [avki, java.lang.Object] */
    public final avax u() {
        auyu auyuVar;
        avhf avhfVar = this.d;
        auzo auzoVar = (auzo) avhfVar.F.a;
        avct avctVar = new avct(new axst(auzoVar.c), MoreExecutors.directExecutor(), auzoVar.b, auzoVar.e, new avkf(auzoVar.f.a));
        axoz axozVarW = auzn.a ? avhf.w(avhfVar.m, avhfVar.k) : avhf.v(avhfVar.m, avhfVar.k);
        Set setSingleton = Collections.singleton(InetSocketAddress.class);
        if (setSingleton != null && !setSingleton.containsAll(((avbu) axozVarW.b).e())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", ((avbu) axozVarW.b).c(), axozVarW.a));
        }
        ?? r4 = axozVarW.a;
        Object obj = axozVarW.b;
        avjx avjxVar = new avjx(avfp.m, 0);
        agfr agfrVar = avfp.o;
        r4.toString();
        List list = avhfVar.j;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            auyu auyuVar2 = null;
            if (!it.hasNext()) {
                auzc.a().c();
                if (avhfVar.z) {
                    Method method = avhf.g;
                    if (method != null) {
                        try {
                            auyuVar = (auyu) method.invoke(null, Boolean.valueOf(avhfVar.A), Boolean.valueOf(avhfVar.B), Boolean.FALSE, Boolean.valueOf(avhfVar.C));
                        } catch (IllegalAccessException e) {
                            avhf.b.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e);
                            auyuVar = null;
                        } catch (InvocationTargetException e2) {
                            avhf.b.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e2);
                            auyuVar = null;
                        }
                    } else {
                        auyuVar = null;
                    }
                    if (auyuVar != null) {
                        arrayList.add(0, auyuVar);
                    }
                }
                if (avhfVar.D) {
                    try {
                        auyuVar2 = (auyu) Class.forName("avcs").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                    } catch (ClassNotFoundException e3) {
                        avhf.b.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e3);
                    } catch (IllegalAccessException e4) {
                        avhf.b.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e4);
                    } catch (NoSuchMethodException e5) {
                        avhf.b.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
                    } catch (InvocationTargetException e6) {
                        avhf.b.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
                    }
                    if (auyuVar2 != null) {
                        arrayList.add(0, auyuVar2);
                    }
                }
                return new avhh(new avhb(avhfVar, avctVar, r4, (avbu) obj, avjxVar, agfrVar, arrayList, avkd.a));
            }
            auyu auyuVar3 = (auyu) it.next();
            if (auyuVar3 instanceof avhe) {
                avay avayVar = ((avhe) auyuVar3).a;
                throw null;
            }
            arrayList.add(auyuVar3);
        }
    }

    public final void w(String str) {
        this.d.n = str;
    }
}
