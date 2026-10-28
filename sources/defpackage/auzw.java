package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auzw {
    public static final auzw a;
    public final ConcurrentNavigableMap b;
    public final ConcurrentMap c;
    public final ConcurrentMap d;

    static {
        Logger.getLogger(auzw.class.getName());
        a = new auzw();
    }

    public auzw() {
        new ConcurrentSkipListMap();
        this.b = new ConcurrentSkipListMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static void a(Map map, auzz auzzVar) {
    }

    public static void b(Map map, auzz auzzVar) {
    }
}
