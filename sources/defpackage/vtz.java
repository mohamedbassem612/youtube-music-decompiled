package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vtz implements tuu {
    final /* synthetic */ vua a;
    private final boolean b;
    private final agkz c;

    public vtz(vua vuaVar, vob vobVar) {
        this.a = vuaVar;
        boolean z = false;
        if (vobVar != null && vobVar.G(vuaVar.b.getResources().getConfiguration().orientation)) {
            z = true;
        }
        this.b = z;
        this.c = vobVar == null ? vve.a : vobVar.r();
    }

    private final int e() {
        return this.a.c.c().bottom;
    }

    private final void f(long j, tut tutVar, int i, vun vunVar) {
        int iA;
        vua vuaVar = this.a;
        int iOrdinal = vunVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            vul vulVar = vuaVar.c;
            iA = vuk.a(vulVar.c().bottom, vulVar.a(), vulVar.b(), vulVar.k(), vunVar);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new RuntimeException(null, null);
            }
            vul vulVar2 = vuaVar.c;
            iA = vuk.a(vulVar2.c().bottom, vulVar2.a(), vulVar2.b(), vulVar2.k(), vunVar);
        } else {
            iA = e();
        }
        vuaVar.d.b(vunVar, vuaVar.a(i, iA, j, vuaVar.b(), tutVar));
    }

    @Override // defpackage.tuu
    public final void a(View view, long j, tut tutVar) {
        f(j, tutVar, this.a.f, vun.d);
    }

    @Override // defpackage.tuu
    public final void b(View view, long j, tut tutVar) {
        f(j, tutVar, e(), this.a.h.F(this.b, this.c));
    }

    @Override // defpackage.tuu
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.tuu
    public final void c(View view) {
    }
}
