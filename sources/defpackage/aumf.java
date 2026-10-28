package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aumf extends aumi {
    final Logger a;

    public aumf(String str) {
        this.a = Logger.getLogger(str);
    }

    @Override // defpackage.aumi
    public final void a(String str) {
        this.a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
