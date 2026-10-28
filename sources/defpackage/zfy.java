package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class zfy implements zgn {
    public final zgk a;
    public final ConcurrentLinkedQueue c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private Integer j;
    private wgs k;
    private final abuz l;
    private final hno m;
    public final AtomicInteger b = new AtomicInteger(0);
    private int i = -1;

    public zfy(hno hnoVar, String str, zgk zgkVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.m = hnoVar;
        this.d = str;
        this.a = zgkVar;
        this.l = (abuz) hnoVar.q;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.c = z3 ? new ConcurrentLinkedQueue() : null;
    }

    @Override // defpackage.zgn
    public final int a() {
        int i;
        if (this.f) {
            i = 45;
            if (this.g) {
                i = 45 + (this.b.get() << 5);
            }
        } else {
            i = 0;
        }
        int i2 = this.k != null ? 8 : 0;
        int i3 = this.i;
        if (i3 == -1) {
            agqr it = this.l.d(this.d).entrySet().iterator();
            int length = 10;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                length += ((String) entry.getKey()).length() + 2 + ((String) entry.getValue()).length();
            }
            this.i = length;
            i3 = length;
        }
        return i3 + 20 + i + i2 + (true == this.e ? 20 : 0);
    }

    public final synchronized void b(Integer num) {
        this.j = num;
    }

    @Override // defpackage.zgn
    public final void c(zhg zhgVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        agqr it = this.l.d(this.d).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zhgVar.b((String) entry.getKey(), (String) entry.getValue());
        }
        zgk zgkVar = this.a;
        Object obj = this.m.p;
        zhgVar.d("conn", zgkVar.c() + ':' + ((tfq) obj).a());
        if (this.j != null) {
            zhgVar.d("dt", zgkVar.c() + ':' + this.j);
        }
        if (this.h) {
            return;
        }
        if (this.e) {
            zgi zgiVar = ((zgj) zgkVar).l;
            zhgVar.d("vps", zgkVar.c() + ':' + String.valueOf(zgiVar));
        }
        if (!this.f || (concurrentLinkedQueue = this.c) == null) {
            return;
        }
        Object obj2 = zhgVar.b;
        while (true) {
            argw argwVar = (argw) concurrentLinkedQueue.poll();
            if (argwVar == null) {
                return;
            }
            aihf aihfVar = (aihf) obj2;
            aihfVar.copyOnWrite();
            apbv apbvVar = (apbv) aihfVar.instance;
            apbv apbvVar2 = apbv.a;
            aiie aiieVar = apbvVar.e;
            if (!aiieVar.c()) {
                apbvVar.e = aihn.mutableCopy(aiieVar);
            }
            apbvVar.e.add(argwVar);
            this.b.decrementAndGet();
        }
    }

    public final synchronized void d(wgs wgsVar) {
        this.k = wgsVar;
    }
}
