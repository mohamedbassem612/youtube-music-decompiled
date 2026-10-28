package defpackage;

import android.graphics.Rect;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvq {
    public final fvq a;
    public final fvr b;
    public final Object c;
    public final Rect d;
    public final int e;
    public final int f;
    public final int g;
    public List h;

    public fvq(fvq fvqVar, fvr fvrVar, Object obj, Rect rect, int i) {
        this.a = fvqVar;
        this.b = fvrVar;
        this.c = obj;
        this.d = rect;
        this.e = fvqVar != null ? fvqVar.e + rect.left : rect.left;
        this.f = fvqVar != null ? fvqVar.f + rect.top : rect.top;
        this.g = i;
    }

    public final int a() {
        List list = this.h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void b(Rect rect) {
        int i = this.e;
        rect.left = i;
        int i2 = this.f;
        rect.top = i2;
        Rect rect2 = this.d;
        rect.right = i + rect2.width();
        rect.bottom = i2 + rect2.height();
    }

    public final String c() {
        fjr fjrVar = (fjr) this.b;
        String string = fjrVar.b.c.getClass().toString();
        fvq fvqVar = this.a;
        return String.format(Locale.US, "Id=%d; contentType='%s'; indexInTree=%d; posInParent=%d; bounds=%s; absPosition=[%d, %d]; childCount=%d; parentId=%d;", Long.valueOf(fjrVar.a), string, -1, Integer.valueOf(this.g), this.d.toShortString(), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(a()), Long.valueOf(fvqVar != null ? ((fjr) fvqVar.b).a : -1L));
    }
}
