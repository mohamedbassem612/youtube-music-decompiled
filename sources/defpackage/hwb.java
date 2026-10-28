package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hwb implements abhp {
    boolean a;
    final /* synthetic */ hwc b;

    public hwb(hwc hwcVar) {
        this.b = hwcVar;
    }

    @Override // defpackage.abhp
    public final void f(int i, long j) {
        if (i == 1) {
            this.a = true;
            hwc hwcVar = this.b;
            if (hwcVar.f.isTouchExplorationEnabled() || hwcVar.p) {
                hwcVar.e();
            } else {
                if (hwcVar.o) {
                    hwcVar.D.b(true);
                    hwcVar.h(28244);
                }
                hwcVar.g();
            }
        } else if (i == 2) {
            ibf ibfVar = this.b.E;
            ibfVar.c();
            ibfVar.b();
        } else if (i == 3 || i == 4) {
            this.a = false;
            hwc hwcVar2 = this.b;
            if (hwcVar2.o) {
                hwcVar2.D.b(false);
            }
            hwcVar2.E.d();
            hwcVar2.V.x(j, appa.SEEK_SOURCE_SLIDE_ON_SCRUBBER_BAR);
            if (hwcVar2.m || (hwcVar2.t && hwcVar2.o)) {
                hwcVar2.D();
            }
        }
        ablt abltVar = this.b.E.d;
        if (abltVar != null) {
            ((hwo) abltVar).a(i, j);
        }
    }
}
