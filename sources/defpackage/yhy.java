package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yhy implements ygp {
    private final /* synthetic */ int $cid;
    private final byte[] a;
    private final int b;
    private final AtomicBoolean c;
    private final Object d;

    public yhy(byte[] bArr, int i, yhl yhlVar, int i2) {
        this.$cid = i2;
        this.a = bArr;
        this.b = i;
        this.d = yhlVar;
        this.c = new AtomicBoolean(false);
    }

    @Override // defpackage.ygp
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ygp
    public final void b() {
        if (this.$cid == 0) {
            if (((AtomicBoolean) this.d).compareAndSet(false, true)) {
                this.c.set(false);
            }
        } else if (this.c.compareAndSet(false, true)) {
            ((yhl) this.d).a(this.a);
        }
    }

    @Override // defpackage.ygp
    public final byte[] c() {
        return this.a;
    }

    public yhy(byte[] bArr, int i, AtomicBoolean atomicBoolean, int i2) {
        this.$cid = i2;
        this.a = bArr;
        this.b = i;
        this.c = atomicBoolean;
        this.d = new AtomicBoolean(false);
    }
}
