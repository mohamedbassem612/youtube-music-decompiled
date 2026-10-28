package defpackage;

import android.util.Log;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.MultiEffectProcessorBase;
import io.grpc.Status;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import org.chromium.base.AndroidInfo;
import org.chromium.net.Proxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axoz {
    public final Object a;
    public final Object b;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public axoz(axoz axozVar) {
        this.a = new HashMap((Map) axozVar.a);
        HashMap map = new HashMap((Map) axozVar.b);
        this.b = map;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((auje) ((Map.Entry) it.next()).getValue()).e.get()) {
                it.remove();
            }
        }
    }

    public static final int e(int i) {
        if (i != 1) {
            return i == 2 ? 1 : 0;
        }
        return 2;
    }

    public static boolean f(int i) {
        return i != 0;
    }

    public static axoz g(List list, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Effect effect = (Effect) it.next();
            if (hashSet.contains(effect)) {
                Log.e(MultiEffectProcessorBase.f, "Requested duplicate effect(s) in execution order");
                return null;
            }
            if (set.contains(effect)) {
                Log.e(MultiEffectProcessorBase.f, "executionOrder and unusedCachedEffects have disallowed intersection");
                return null;
            }
            hashSet.add(effect);
        }
        return new axoz(agke.n(list), agkz.n(set));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    public final void a() {
        ((avci) this.b).b = true;
        this.a.cancel(false);
    }

    public final boolean b() {
        avci avciVar = (avci) this.b;
        return (avciVar.c || avciVar.b) ? false : true;
    }

    public final boolean c() {
        return this.a != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public axoz(avar avarVar, Status status) {
        this.b = avarVar;
        this.a = status;
    }

    public axoz(axle axleVar) {
        this.a = axleVar.a;
        this.b = axleVar.b;
    }

    public axoz(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public axoz(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public axoz(twp twpVar) {
        this.b = null;
        this.a = twpVar;
    }

    public axoz() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public axoz(agke agkeVar, agke agkeVar2) {
        this.b = new atyu(agkeVar);
        this.a = new atyu(agkeVar2);
    }

    public axoz(Status status, Object obj) {
        status.getClass();
        this.b = status;
        this.a = obj;
    }

    public axoz(String str) {
        this.a = new HashMap();
        this.b = str;
    }

    public axoz(awuz[] awuzVarArr) {
        this.b = awuzVarArr;
        this.a = new awtp(awuzVarArr.length, awts.a);
    }

    public axoz(avci avciVar, ScheduledFuture scheduledFuture) {
        this.b = avciVar;
        scheduledFuture.getClass();
        this.a = scheduledFuture;
    }

    public axoz(atzm atzmVar) {
        this.b = atzmVar;
        this.a = null;
    }

    public axoz(Executor executor, Proxy.HttpConnectCallback httpConnectCallback) {
        if (AndroidInfo.h() >= 49) {
            executor.getClass();
            this.b = executor;
            httpConnectCallback.getClass();
            this.a = httpConnectCallback;
            return;
        }
        throw new AssertionError(String.format("This should not have been created: the Cronet API being used has an ApiLevel of %s, but ProxyCallback was added in ApiLevel %s", Integer.valueOf(AndroidInfo.h()), 49));
    }
}
