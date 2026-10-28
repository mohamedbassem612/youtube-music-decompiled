package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rsl {
    public final smr a;
    public final skh b;
    public rvo o;
    public sba p;
    public rxj q;
    public boolean r;
    public boolean s;
    public sko t;
    public int u;
    public int v;
    public ryj w;
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final Map g = new HashMap();
    public final Map f = new HashMap();
    public final Map h = new HashMap();
    public final Map i = new HashMap();
    public final Map j = new HashMap();
    public final List k = new ArrayList();
    public final Set l = new HashSet();
    public final List m = new ArrayList();
    public final Set n = new HashSet();
    public final sqe c = new sqe(3);

    public rsl(smr smrVar, skh skhVar) {
        this.a = smrVar;
        this.b = skhVar;
    }

    public final String a() {
        int i = this.u;
        if (i == 0) {
            return "NOT_SCHEDULED";
        }
        if (i == 1) {
            return "SCHEDULED";
        }
        if (i == 2) {
            return "ENTER_REQUESTED";
        }
        if (i == 3) {
            return "ENTERED";
        }
        if (i != 4) {
            return i != 5 ? "EXIT_REQUESTED" : "RENDERING_STOP_REQUESTED";
        }
        return "RENDERING";
    }

    public final boolean b() {
        return this.v == 1;
    }

    public final boolean c() {
        int i = this.u;
        return i == 2 || i == 3 || i == 4 || i == 5 || i == 6;
    }

    public final boolean d() {
        int i = this.u;
        return i == 4 || i == 5;
    }

    public final boolean e() {
        return this.u == 1;
    }

    public final boolean f() {
        return this.u == 2;
    }

    public final boolean g() {
        return this.u == 6;
    }
}
