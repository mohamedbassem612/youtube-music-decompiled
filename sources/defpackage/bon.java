package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class bon {
    final boq c;
    boolean d;
    int e = -1;
    final /* synthetic */ boo f;

    public bon(boo booVar, boq boqVar) {
        this.f = booVar;
        this.c = boqVar;
    }

    public boolean c(bog bogVar) {
        return false;
    }

    final void d(boolean z) {
        boolean z2;
        if (z != this.d) {
            this.d = z;
            boo booVar = this.f;
            int i = true != z ? -1 : 1;
            int i2 = booVar.c;
            booVar.c = i + i2;
            if (!booVar.d) {
                booVar.d = true;
                while (true) {
                    try {
                        int i3 = booVar.c;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0) {
                            i2 = 0;
                            z2 = i3 > 0;
                        } else {
                            z2 = false;
                        }
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            booVar.e();
                        } else if (z3) {
                            booVar.f();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        booVar.d = false;
                        throw th;
                    }
                }
                booVar.d = false;
            }
            if (this.d) {
                this.f.b(this);
            }
        }
    }

    public abstract boolean fY();

    public void b() {
    }
}
