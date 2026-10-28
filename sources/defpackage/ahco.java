package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class ahco extends ahfq implements ListenableFuture {
    static final Object g = new Object();
    static final aheu h = new aheu(ahch.class);
    static final boolean i;
    public static final ahci j;
    volatile ahce listenersField;
    volatile Object valueField;
    volatile ahcn waitersField;

    static {
        boolean z;
        ahci ahcjVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        i = z;
        String property = System.getProperty("java.runtime.name", "");
        if (property == null || property.contains("Android")) {
            try {
                ahcjVar = new ahcm();
            } catch (Error | Exception unused2) {
                ahcjVar = new ahcj();
            }
        } else {
            ahcjVar = new ahcj();
        }
        j = ahcjVar;
    }

    public final void n(ahcn ahcnVar) {
        ahcnVar.thread = null;
        while (true) {
            ahcn ahcnVar2 = this.waitersField;
            if (ahcnVar2 != ahcn.a) {
                ahcn ahcnVar3 = null;
                while (ahcnVar2 != null) {
                    ahcn ahcnVar4 = ahcnVar2.next;
                    if (ahcnVar2.thread != null) {
                        ahcnVar3 = ahcnVar2;
                    } else if (ahcnVar3 != null) {
                        ahcnVar3.next = ahcnVar4;
                        if (ahcnVar3.thread == null) {
                        }
                    } else if (o(ahcnVar2, ahcnVar4)) {
                    }
                    ahcnVar2 = ahcnVar4;
                }
                return;
            }
            return;
        }
    }

    public final boolean o(ahcn ahcnVar, ahcn ahcnVar2) {
        return j.g(this, ahcnVar, ahcnVar2);
    }
}
