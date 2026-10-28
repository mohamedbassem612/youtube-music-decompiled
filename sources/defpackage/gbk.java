package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gbk extends fzq {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;

    public gbk(String str) {
        HashMap mapA = a(str);
        if (mapA != null) {
            this.a = (Long) mapA.get(0);
            this.b = (Long) mapA.get(1);
            this.c = (Long) mapA.get(2);
            this.d = (Long) mapA.get(3);
            this.e = (Long) mapA.get(4);
        }
    }

    @Override // defpackage.fzq
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.a);
        map.put(1, this.b);
        map.put(2, this.c);
        map.put(3, this.d);
        map.put(4, this.e);
        return map;
    }
}
