package defpackage;

import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ablr {
    public static final ChronoUnit a = ChronoUnit.SECONDS;
    public final ahbw e;
    public final abmt g;
    public String i;
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public Instant d = Instant.MIN;
    public Optional f = Optional.empty();
    public final agm h = new agm(5);

    public ablr(abmt abmtVar, ahbw ahbwVar) {
        this.g = abmtVar;
        this.e = ahbwVar;
    }

    public final void a(String str) {
        if (str == null || this.h.b(str) == null) {
            return;
        }
        this.i = str;
    }

    public final void b(String str, wjf wjfVar, boolean z) {
        if (str != null) {
            this.h.c(str, Optional.ofNullable(wjfVar));
            if (z) {
                this.i = str;
            }
        }
    }
}
