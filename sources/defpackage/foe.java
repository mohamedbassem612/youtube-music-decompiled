package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class foe extends foh implements Cloneable, fiu, fil {
    private static final AtomicInteger m = new AtomicInteger(0);
    public foe a;
    public boolean b;
    public fof c;
    fip d;
    public Map e;
    public final String f;
    public int i;
    public List j;
    public String k;
    public String l;
    public final int h = m.getAndIncrement();
    public fky g = b();

    protected foe(String str) {
        this.f = str;
        this.l = str;
    }

    static Map d(foe foeVar) {
        HashMap map = new HashMap();
        if (foeVar != null) {
            List list = foeVar.j;
            if (list == null) {
                throw new IllegalStateException(a.cs(foeVar, "Children of current section ", " is null!"));
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                foe foeVar2 = (foe) list.get(i);
                map.put(foeVar2.k, new axq(foeVar2, Integer.valueOf(i)));
            }
        }
        return map;
    }

    public static void e(foe foeVar) {
        foeVar.b = true;
        foe foeVar2 = foeVar.a;
        if (foeVar2 != null) {
            e(foeVar2);
        }
    }

    protected fky b() {
        return null;
    }

    public foe c(boolean z) {
        try {
            foe foeVar = (foe) super.clone();
            if (!z) {
                if (foeVar.j != null) {
                    foeVar.j = new ArrayList();
                }
                foeVar.i = 0;
                foeVar.b = false;
                foeVar.e = null;
            }
            return foeVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fil
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(foe foeVar) {
        throw null;
    }

    @Override // defpackage.fiu
    public final fin n() {
        return this;
    }
}
