package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class toy implements tor {
    public final toz a;
    final /* synthetic */ tpb b;
    private boolean c;

    public toy(tpb tpbVar, toz tozVar) {
        this.b = tpbVar;
        this.a = tozVar;
    }

    public final void a() {
        this.b.h(this, false);
    }

    @Override // defpackage.tor
    public final void b() {
        boolean z = this.c;
        tpb tpbVar = this.b;
        if (!z) {
            tpbVar.h(this, true);
        } else {
            tpbVar.h(this, false);
            tpbVar.m(this.a.a);
        }
    }

    @Override // defpackage.tor
    public final OutputStream d() {
        tox toxVar;
        synchronized (this.b) {
            toz tozVar = this.a;
            if (tozVar.d != this) {
                throw new IllegalStateException();
            }
            toxVar = new tox(this, new FileOutputStream(tozVar.b()));
        }
        return toxVar;
    }
}
