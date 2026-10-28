package defpackage;

import java.util.Stack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afpi {
    private static final ThreadLocal a = new afpg();

    public static void a(Object obj) {
        ((afph) ((Stack) a.get()).pop()).a(obj);
    }

    public static void b(afph afphVar) {
        ahno.O(((afph) ((Stack) a.get()).pop()) == afphVar);
    }

    public static void c(afph afphVar) {
        ((Stack) a.get()).push(afphVar);
    }
}
