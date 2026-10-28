package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acik {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;

    public acik(bcv bcvVar, List list) {
        this.d = new ArrayList();
        e(list, false);
        e(list, true);
        if (!bcvVar.b.contains(this)) {
            bcvVar.b.add(this);
            avw avwVar = bcvVar.c;
            avw avwVar2 = bcvVar.d;
            b();
            int i = bcvVar.e;
            c();
        }
        this.c = bcvVar;
    }

    private final void e(List list, boolean z) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            bcr bcrVar = (bcr) list.get(i);
            bcrVar.b();
            if (z) {
                Object obj = bcrVar.b;
                if (obj != null) {
                    throw new IllegalStateException(bcrVar + " (" + i2 + '/' + size + ") is already controlled by " + obj + " but is still added to " + this);
                }
                bcrVar.b = this;
                ((ArrayList) this.d).add(bcrVar);
            }
            i = i2;
        }
    }

    public final int a() {
        return ((ArrayList) this.d).size();
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        throw null;
    }

    public final void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((bcr) arrayList.get(size)).a();
            }
        }
    }

    public final void d() {
    }

    public acik(String str, acij acijVar) {
        this.d = str;
        this.c = acijVar;
        this.a = false;
        this.b = 0;
    }
}
