package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class st {
    public Map a;
    private int b = 0;
    private ArrayList c = new ArrayList();
    private boolean e = false;
    private final Map d = new afv();

    public final su a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((sw) it.next()).a());
        }
        if (this.a != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.a.entrySet()) {
                bundle.putStringArrayList((String) entry.getKey(), new ArrayList<>((Collection) entry.getValue()));
            }
        }
        this.e = true;
        return new su(this.b, this.c);
    }

    public final sw b(String str) {
        Map map = this.d;
        sw swVar = (sw) map.get(str);
        if (swVar != null) {
            return swVar;
        }
        sw swVar2 = new sw(str);
        map.put(str, swVar2);
        return swVar2;
    }

    public final void c() {
        if (this.e) {
            this.c = new ArrayList(this.c);
            if (this.a != null) {
                afv afvVar = new afv();
                afvVar.putAll(this.a);
                this.a = afvVar;
            }
            this.e = false;
        }
    }

    public final void d(sl slVar) {
        c();
        this.c.add(slVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final void e(int i) {
        azs.f((i ^ (-1)) >>> 31, "Version must be a non-negative number.");
        c();
        this.b = i;
    }
}
