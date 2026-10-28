package defpackage;

import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class acxe implements acxk {
    public acxe() throws ClassNotFoundException {
        Class.forName(ahng.class.getName());
    }

    @Override // defpackage.acxk
    public final Instant a() {
        try {
            return Instant.ofEpochSecond(Long.parseLong("<unknown>"));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
