package defpackage;

import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dil {
    int a;
    boolean b;
    boolean c;
    public boolean d;
    boolean e;
    public boolean f;
    Bundle g;

    public dil(dim dimVar) {
        this.a = 1;
        this.a = dimVar.a;
        this.d = dimVar.d;
        this.e = dimVar.e;
        this.b = dimVar.b;
        this.c = dimVar.c;
        this.f = dimVar.f;
        Bundle bundle = dimVar.g;
        this.g = bundle == null ? null : new Bundle(bundle);
    }

    public final void a(boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = z;
            this.c = true;
        }
    }

    public final void b(boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.e = z;
        }
    }

    public dil() {
        this.a = 1;
        this.b = Build.VERSION.SDK_INT >= 30;
    }
}
