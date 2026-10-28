package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgy extends rgr {
    public rfr c = null;
    public Duration d = null;
    private UUID e = null;

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // defpackage.rgr
    protected final void c(rfs rfsVar) {
        this.c = rfsVar.c;
        UUID uuid = this.e;
        if (uuid != null) {
            if (rfsVar.A(uuid)) {
                this.e = null;
                this.d = null;
            }
        } else if (!rfsVar.B()) {
            if (this.d != null) {
                Duration durationJ = rfsVar.j();
                durationJ.getClass();
                if (aext.k(this.d, durationJ)) {
                    this.d = rfsVar.j();
                }
            } else {
                this.d = rfsVar.j();
            }
        }
        e(rfsVar);
    }

    @Override // defpackage.rhd
    public final void k(rfs rfsVar) {
        this.e = rfsVar.c.a;
        this.d = null;
    }
}
