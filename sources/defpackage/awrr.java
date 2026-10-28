package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awrr extends awrw {
    @Override // defpackage.awrw
    public final float a() {
        return b().nextFloat();
    }

    public abstract Random b();

    @Override // defpackage.awrw
    public final int c() {
        return b().nextInt(2147418112);
    }
}
