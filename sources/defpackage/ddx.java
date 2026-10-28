package defpackage;

import android.util.SparseArray;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ddx {
    public final cwj a;
    public final byte[] c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public final boolean b = false;
    private final SparseArray n = new SparseArray();
    private final SparseArray o = new SparseArray();
    public final dco m = new dco();

    public ddx(cwj cwjVar) {
        this.a = cwjVar;
        byte[] bArr = new byte[SemanticState.Focused];
        this.c = bArr;
        new bxi(bArr, 0, 0);
        b();
    }

    public final void a(bxe bxeVar) {
        this.n.append(bxeVar.d, bxeVar);
    }

    public final void b() {
        this.f = false;
        this.h = false;
    }

    public final void c(amp ampVar) {
        this.o.append(ampVar.a, ampVar);
    }
}
