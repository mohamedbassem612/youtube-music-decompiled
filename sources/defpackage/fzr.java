package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fzr extends fzq {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;

    public fzr(String str) {
        this.a = "E";
        this.b = -1L;
        this.c = "E";
        this.d = "E";
        this.e = "E";
        HashMap mapA = a(str);
        if (mapA != null) {
            this.a = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.b = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.c = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.d = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.e = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }

    @Override // defpackage.fzq
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.a);
        map.put(4, this.e);
        map.put(3, this.d);
        map.put(2, this.c);
        map.put(1, Long.valueOf(this.b));
        return map;
    }

    public fzr() {
        this.a = "E";
        this.b = -1L;
        this.c = "E";
        this.d = "E";
        this.e = "E";
    }
}
