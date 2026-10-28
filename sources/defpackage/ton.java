package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ton implements tor {
    public final too a;
    final /* synthetic */ toq b;
    private boolean c;

    public ton(toq toqVar, too tooVar) {
        this.b = toqVar;
        this.a = tooVar;
    }

    public final void a() {
        this.b.f(this, false);
    }

    @Override // defpackage.tor
    public final void b() {
        boolean z = this.c;
        toq toqVar = this.b;
        if (!z) {
            toqVar.f(this, true);
        } else {
            toqVar.f(this, false);
            toqVar.m(this.a.a);
        }
    }

    @Override // defpackage.tor
    public final OutputStream d() {
        tom tomVar;
        synchronized (this.b) {
            too tooVar = this.a;
            if (tooVar.d != this) {
                throw new IllegalStateException();
            }
            tomVar = new tom(this, new FileOutputStream(tooVar.c()));
        }
        return tomVar;
    }
}
