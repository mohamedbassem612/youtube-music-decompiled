package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dim {
    public final int a;
    public final boolean b;
    final boolean c;
    public final boolean d;
    final boolean e;
    final boolean f;
    public final Bundle g;

    public dim(dil dilVar) {
        this.a = dilVar.a;
        this.b = dilVar.b;
        this.c = dilVar.c;
        this.d = dilVar.d;
        this.e = dilVar.e;
        this.f = dilVar.f;
        Bundle bundle = dilVar.g;
        this.g = bundle == null ? Bundle.EMPTY : new Bundle(bundle);
    }
}
