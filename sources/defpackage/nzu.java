package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nzu {
    private final Object a = new Object();
    private volatile long b = 0;
    private volatile boolean c = false;
    private final List d = new ArrayList(15);
    private final List e = new ArrayList(5);

    public final List a(String str, nzq nzqVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this.a) {
            List list = this.d;
            arrayList = new ArrayList(list);
            List list2 = this.e;
            arrayList2 = new ArrayList(list2);
            list.clear();
            list2.clear();
        }
        nzp nzpVar = null;
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = i % 3;
            if (i2 == 0) {
                nzpVar = new nzp();
                nzqVar.b(((Long) arrayList.get(i)).intValue());
            } else if (i2 == 1) {
                nzpVar.a = (Long) arrayList.get(i);
            } else {
                nzpVar.b(str);
                nzpVar.b = (Long) arrayList.get(i);
                nzqVar.b = (nzo) arrayList2.get(i / 3);
                nzpVar.e = nzqVar.a();
                arrayList3.add(nzpVar);
            }
        }
        return arrayList3;
    }

    final void b() {
        if (this.c) {
            return;
        }
        synchronized (this.a) {
            this.d.clear();
            this.e.clear();
            this.c = true;
        }
    }

    final void c() {
        List list;
        int size;
        if (this.c) {
            return;
        }
        synchronized (this.a) {
            if (!this.c && (size = (list = this.d).size()) < 15 && size % 3 == 2) {
                list.add(Long.valueOf(SystemClock.elapsedRealtimeNanos() / 1000));
            }
        }
    }

    final void d() {
        List list;
        int size;
        if (this.c) {
            return;
        }
        synchronized (this.a) {
            if (!this.c && (size = (list = this.d).size()) < 15 && size % 3 == 0) {
                this.b++;
                list.add(Long.valueOf(this.b));
                list.add(Long.valueOf(SystemClock.elapsedRealtimeNanos() / 1000));
                this.e.add(nrd.a());
            }
        }
    }
}
