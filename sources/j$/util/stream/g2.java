package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class g2 extends h2 {
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(g2 g2Var, t0 t0Var, int i) {
        super(g2Var, t0Var, i);
        this.c = (byte) 1;
        this.d = (Object[]) g2Var.d;
    }

    @Override // j$.util.stream.h2
    public final void a() {
        switch (this.c) {
            case 0:
                ((s0) this.a).d(this.b, this.d);
                break;
            default:
                this.a.h((Object[]) this.d, this.b);
                break;
        }
    }

    @Override // j$.util.stream.h2
    public final h2 b(int i, int i2) {
        switch (this.c) {
            case 0:
                return new g2(this, ((s0) this.a).a(i), i2);
            default:
                return new g2(this, this.a.a(i), i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(t0 t0Var, Object obj, byte b) {
        super(t0Var);
        this.c = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(g2 g2Var, s0 s0Var, int i) {
        super(g2Var, s0Var, i);
        this.c = (byte) 0;
        this.d = g2Var.d;
    }
}
