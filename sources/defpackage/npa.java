package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npa {
    public byte[] b;
    public final /* synthetic */ npb e;
    public final AtomicBoolean a = new AtomicBoolean();
    public int c = 0;
    public final tld f = new tld((byte[]) null, (byte[]) null);
    public boolean d = false;

    public npa(npb npbVar) {
        this.e = npbVar;
    }

    final void a() {
        this.a.set(false);
        this.e.b.removeCallbacks(new mga(this, 8));
    }
}
