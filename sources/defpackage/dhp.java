package defpackage;

import android.content.ComponentName;
import android.content.Context;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dhp {
    private final dhl a = new dhl(this);
    public final Context f;
    public final dhm g;
    public dhh h;
    public boolean i;
    public dhq j;
    public boolean k;
    public ast l;

    public dhp(Context context, dhm dhmVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f = context;
        if (dhmVar == null) {
            this.g = new dhm(new ComponentName(context, getClass()));
        } else {
            this.g = dhmVar;
        }
    }

    public dhn c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public void e(dhh dhhVar) {
        throw null;
    }

    public final void gA(dhh dhhVar) {
        dij.c();
        if (Objects.equals(this.h, dhhVar)) {
            return;
        }
        gB(dhhVar);
    }

    final void gB(dhh dhhVar) {
        this.h = dhhVar;
        if (this.i) {
            return;
        }
        this.i = true;
        this.a.sendEmptyMessage(2);
    }

    public final void gC(ast astVar) {
        dij.c();
        this.l = astVar;
    }

    public dhk gw(String str, dho dhoVar) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public dhn gx(String str, dho dhoVar) {
        return c(str);
    }

    public dhn gy(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return gx(str, dho.a);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public final void gz(dhq dhqVar) {
        dij.c();
        if (this.j != dhqVar) {
            this.j = dhqVar;
            if (this.k) {
                return;
            }
            this.k = true;
            this.a.sendEmptyMessage(1);
        }
    }
}
