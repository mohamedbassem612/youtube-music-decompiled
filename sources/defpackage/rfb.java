package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rfb implements raq {
    private final /* synthetic */ int $cid;
    final /* synthetic */ float a;
    final /* synthetic */ Object b;

    public rfb(Size size, float f, int i) {
        this.$cid = i;
        this.b = size;
        this.a = f;
    }

    @Override // defpackage.raq
    public final float a() {
        return this.a;
    }

    @Override // defpackage.raq
    public final Size b() {
        int i = this.$cid;
        Object obj = this.b;
        return i != 0 ? (Size) obj : ((rff) obj).c.n();
    }

    public rfb(rff rffVar, float f, int i) {
        this.$cid = i;
        this.a = f;
        this.b = rffVar;
    }
}
