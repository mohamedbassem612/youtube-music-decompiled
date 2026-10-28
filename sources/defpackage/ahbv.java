package defpackage;

import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ahbv implements ahbw {
    INSTANCE;

    @Override // defpackage.ahbw
    public final Instant a() {
        return Instant.now();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }
}
