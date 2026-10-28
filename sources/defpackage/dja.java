package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dja extends dhk implements dix {
    String a;
    String b;
    final /* synthetic */ djc c;
    private final String d;
    private final dho e;
    private boolean f;
    private int h;
    private diw i;
    private int g = -1;
    private int j = -1;

    public dja(djc djcVar, String str, dho dhoVar) {
        this.c = djcVar;
        this.d = str;
        this.e = dhoVar;
    }

    @Override // defpackage.dhk
    public final void a(String str) {
        diw diwVar = this.i;
        if (diwVar != null) {
            int i = this.j;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = diwVar.c;
            diwVar.c = i2 + 1;
            diwVar.g(12, i2, i, null, bundle);
        }
    }

    @Override // defpackage.dhn
    public final void b() {
        this.c.n(this);
    }

    @Override // defpackage.dhk
    public final void c(String str) {
        diw diwVar = this.i;
        if (diwVar != null) {
            int i = this.j;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = diwVar.c;
            diwVar.c = i2 + 1;
            diwVar.g(13, i2, i, null, bundle);
        }
    }

    @Override // defpackage.dhn
    public final void d(int i) {
        diw diwVar = this.i;
        if (diwVar != null) {
            diwVar.d(this.j, i);
        } else {
            this.g = i;
            this.h = 0;
        }
    }

    @Override // defpackage.dhk
    public final void e(List list) {
        diw diwVar = this.i;
        if (diwVar != null) {
            int i = this.j;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = diwVar.c;
            diwVar.c = i2 + 1;
            diwVar.g(14, i2, i, null, bundle);
        }
    }

    @Override // defpackage.dhn
    public final void f(int i) {
        diw diwVar = this.i;
        if (diwVar != null) {
            diwVar.f(this.j, i);
        } else {
            this.h += i;
        }
    }

    @Override // defpackage.dhn
    public final boolean i(Intent intent, vy vyVar) {
        diw diwVar = this.i;
        if (diwVar != null) {
            return diwVar.h(this.j, intent, vyVar);
        }
        return false;
    }

    @Override // defpackage.dhk
    public final String j() {
        return this.a;
    }

    @Override // defpackage.dhk
    public final String k() {
        return this.b;
    }

    @Override // defpackage.dix
    public final int l() {
        return this.j;
    }

    @Override // defpackage.dix
    public final void m(diw diwVar) {
        diz dizVar = new diz(this);
        this.i = diwVar;
        int i = diwVar.d;
        diwVar.d = i + 1;
        int i2 = diwVar.c;
        diwVar.c = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.d);
        bundle.putParcelable("routeControllerOptions", this.e.b);
        diwVar.g(11, i2, i, null, bundle);
        diwVar.g.put(i2, dizVar);
        this.j = i;
        if (this.f) {
            diwVar.b(i);
            int i3 = this.g;
            if (i3 >= 0) {
                diwVar.d(this.j, i3);
                this.g = -1;
            }
            int i4 = this.h;
            if (i4 != 0) {
                diwVar.f(this.j, i4);
                this.h = 0;
            }
        }
    }

    @Override // defpackage.dhn
    public final void n() {
        q(0);
    }

    @Override // defpackage.dix
    public final void o() {
        diw diwVar = this.i;
        if (diwVar != null) {
            diwVar.a(this.j);
            this.i = null;
            this.j = 0;
        }
    }

    @Override // defpackage.dhn
    public final void p() {
        this.f = true;
        diw diwVar = this.i;
        if (diwVar != null) {
            diwVar.b(this.j);
        }
    }

    @Override // defpackage.dhn
    public final void q(int i) {
        this.f = false;
        diw diwVar = this.i;
        if (diwVar != null) {
            diwVar.e(this.j, i);
        }
    }
}
