package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class yy {
    public Object a;

    public yy(kni kniVar) {
        this.a = kniVar;
    }

    public final boolean a() {
        lpt lptVar = ((lpx) this.a).a;
        kro.l(lptVar);
        return lptVar.a == 1;
    }

    public final View b(int i) {
        return c().findViewById(i);
    }

    public final ViewGroup c() throws jjk {
        Object obj = this.a;
        if (obj != null) {
            return (ViewGroup) obj;
        }
        throw new jjk();
    }

    public yy() {
    }
}
