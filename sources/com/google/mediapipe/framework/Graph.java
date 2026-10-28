package com.google.mediapipe.framework;

import defpackage.ahno;
import defpackage.axst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class Graph {
    private final List b = new ArrayList();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Object f = new Object();
    private long a = nativeCreateGraph();

    private native long nativeCreateGraph();

    private native void nativeReleaseGraph(long j);

    private native void nativeSetParentGlContext(long j, long j2);

    public final synchronized long a() {
        return this.a;
    }

    public final synchronized void b(long j) {
        ahno.P(this.a != 0, "Invalid context, tearDown() might have been called already.");
        nativeSetParentGlContext(this.a, j);
    }

    public final synchronized void c() {
        ahno.P(this.a != 0, "Invalid context, tearDown() might have been called already.");
        Map map = this.c;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((Packet) ((Map.Entry) it.next()).getValue()).release();
        }
        map.clear();
        Map map2 = this.d;
        for (Map.Entry entry : map2.entrySet()) {
            if (entry.getValue() != null) {
                ((Packet) entry.getValue()).release();
            }
        }
        map2.clear();
        Map map3 = this.e;
        Iterator it2 = map3.entrySet().iterator();
        while (it2.hasNext()) {
            ArrayList arrayList = (ArrayList) ((Map.Entry) it2.next()).getValue();
            if (arrayList.size() > 0) {
                Object obj = ((axst) arrayList.get(0)).a;
                throw null;
            }
        }
        map3.clear();
        synchronized (this.f) {
            try {
                long j = this.a;
                if (j != 0) {
                    nativeReleaseGraph(j);
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.clear();
    }
}
