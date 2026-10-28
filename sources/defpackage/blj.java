package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class blj {
    boolean a;
    public boolean b;
    public int[] c;
    public Set d;
    final blk e = new bln();
    final bls f;

    protected blj(bls blsVar) {
        this.f = blsVar;
    }

    public final void a() {
        this.a = true;
    }

    public final void b(ato atoVar) {
        Set set = this.d;
        if (set != null) {
            set.remove(atoVar);
        }
    }
}
