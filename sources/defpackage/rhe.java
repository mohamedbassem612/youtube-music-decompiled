package defpackage;

import j$.time.Duration;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rhe extends rgr {
    private BigDecimal c = BigDecimal.ZERO;
    private final BigDecimal d = BigDecimal.ONE;

    @Override // defpackage.rgr
    protected final void c(rfs rfsVar) {
        if (!rfsVar.B()) {
            rfsVar.a(h(rfsVar.getTimestamp()));
        }
        e(rfsVar);
    }

    public final long h(long j) {
        return new BigDecimal(j).multiply(this.d).add(this.c).setScale(0, RoundingMode.FLOOR).longValueExact();
    }

    public final void i(Duration duration) {
        this.c = new BigDecimal(ahbt.a(duration));
    }

    @Override // defpackage.rhd
    public final void k(rfs rfsVar) {
    }
}
