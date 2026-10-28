package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aftx extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        afvh afvhVar = new afvh(qpj.h(Thread.currentThread()));
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = afty.c;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, afvhVar);
        }
        return afvhVar;
    }
}
