package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egy {
    public Map a;
    public Map b;
    public float c;
    public Map d;
    public List e;
    public ahb f;
    public agk g;
    public List h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public final qa o = new qa((short[]) null);
    private final HashSet p = new HashSet();
    public int n = 0;

    public final float a() {
        return (long) ((b() / this.l) * 1000.0f);
    }

    public final float b() {
        return this.k - this.j;
    }

    public final elh c(long j) {
        return (elh) this.g.e(j);
    }

    public final Map d() {
        ThreadLocal threadLocal = enm.a;
        float f = Resources.getSystem().getDisplayMetrics().density;
        if (f != this.c) {
            for (Map.Entry entry : this.b.entrySet()) {
                Map map = this.b;
                String str = (String) entry.getKey();
                ehn ehnVar = (ehn) entry.getValue();
                float f2 = this.c / f;
                ehn ehnVar2 = new ehn((int) (ehnVar.a * f2), (int) (ehnVar.b * f2), ehnVar.c, ehnVar.d, ehnVar.e);
                Bitmap bitmap = ehnVar.f;
                if (bitmap != null) {
                    ehnVar2.f = Bitmap.createScaledBitmap(bitmap, ehnVar2.a, ehnVar2.b, true);
                }
                map.put(str, ehnVar2);
            }
        }
        this.c = f;
        return this.b;
    }

    public final void e(String str) {
        ((end) ene.a).a(str, null);
        this.p.add(str);
    }

    public final void f(int i) {
        this.n += i;
    }

    public final void g() {
        this.m = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            sb.append(((elh) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
