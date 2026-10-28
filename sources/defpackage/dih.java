package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dih {
    final dhp a;
    final List b = new ArrayList();
    final boolean c;
    public dhq d;
    private final dhm e;

    public dih(dhp dhpVar, boolean z) {
        this.a = dhpVar;
        this.e = dhpVar.g;
        this.c = z;
    }

    public final ComponentName a() {
        return this.e.a;
    }

    public final dhp b() {
        dij.c();
        return this.a;
    }

    final dii c(String str) {
        for (dii diiVar : this.b) {
            if (diiVar.c.equals(str)) {
                return diiVar;
            }
        }
        return null;
    }

    public final String d() {
        return this.e.a();
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + d() + " }";
    }
}
