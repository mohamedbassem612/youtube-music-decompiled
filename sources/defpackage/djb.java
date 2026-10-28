package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class djb extends dhn implements dix {
    final /* synthetic */ djc a;
    private final String b;
    private final String c;
    private final dho d;
    private boolean e;
    private int f = -1;
    private int g;
    private diw h;
    private int i;

    public djb(djc djcVar, String str, String str2, dho dhoVar) {
        this.a = djcVar;
        this.b = str;
        this.c = str2;
        this.d = dhoVar;
    }

    @Override // defpackage.dhn
    public final void b() {
        this.a.n(this);
    }

    @Override // defpackage.dhn
    public final void d(int i) {
        diw diwVar = this.h;
        if (diwVar != null) {
            diwVar.d(this.i, i);
        } else {
            this.f = i;
            this.g = 0;
        }
    }

    @Override // defpackage.dhn
    public final void f(int i) {
        diw diwVar = this.h;
        if (diwVar != null) {
            diwVar.f(this.i, i);
        } else {
            this.g += i;
        }
    }

    @Override // defpackage.dhn
    public final boolean i(Intent intent, vy vyVar) {
        diw diwVar = this.h;
        if (diwVar != null) {
            return diwVar.h(this.i, intent, vyVar);
        }
        return false;
    }

    @Override // defpackage.dix
    public final int l() {
        return this.i;
    }

    @Override // defpackage.dix
    public final void m(diw diwVar) {
        this.h = diwVar;
        int i = diwVar.d;
        diwVar.d = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.b);
        bundle.putString("routeGroupId", this.c);
        bundle.putParcelable("routeControllerOptions", this.d.b);
        int i2 = diwVar.c;
        diwVar.c = i2 + 1;
        diwVar.g(3, i2, i, null, bundle);
        this.i = i;
        if (this.e) {
            diwVar.b(i);
            int i3 = this.f;
            if (i3 >= 0) {
                diwVar.d(this.i, i3);
                this.f = -1;
            }
            int i4 = this.g;
            if (i4 != 0) {
                diwVar.f(this.i, i4);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.dhn
    public final void n() {
        q(0);
    }

    @Override // defpackage.dix
    public final void o() {
        diw diwVar = this.h;
        if (diwVar != null) {
            diwVar.a(this.i);
            this.h = null;
            this.i = 0;
        }
    }

    @Override // defpackage.dhn
    public final void p() {
        this.e = true;
        diw diwVar = this.h;
        if (diwVar != null) {
            diwVar.b(this.i);
        }
    }

    @Override // defpackage.dhn
    public final void q(int i) {
        this.e = false;
        diw diwVar = this.h;
        if (diwVar != null) {
            diwVar.e(this.i, i);
        }
    }
}
