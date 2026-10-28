package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahus {
    public String a;
    public String e;
    public final aglz b = new aghn(null);
    public boolean c = true;
    public int d = 3;
    public boolean f = false;
    public Long g = null;
    public final Set h = new HashSet();
    public Integer i = null;
    public Integer j = null;

    public final void a(aglz aglzVar) {
        this.b.y(aglzVar);
    }

    public final void b(String str) {
        boolean z = true;
        if (!str.equals("GET") && !str.equals("HEAD") && !str.equals("DELETE") && !str.equals("POST") && !str.equals("PATCH") && !str.equals("PUT")) {
            z = false;
        }
        ahno.O(z);
        this.e = str;
    }

    public final void c(String str) {
        str.getClass();
        this.a = str;
    }
}
