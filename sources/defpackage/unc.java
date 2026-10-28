package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class unc implements bnu {
    public boolean a;
    public final AtomicReference b = new AtomicReference(null);
    private final Optional c;
    private int d;

    public unc(Optional optional) {
        this.c = optional;
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        this.d++;
        if (this.a) {
            this.c.isPresent();
            qcb qcbVar = (qcb) this.b.get();
            if (qcbVar != null) {
                qcbVar.e(true);
            }
        }
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        int i = this.d - 1;
        this.d = i;
        if (!this.a || i > 0) {
            return;
        }
        this.c.isPresent();
        qcb qcbVar = (qcb) this.b.get();
        if (qcbVar != null) {
            qcbVar.e(false);
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }
}
