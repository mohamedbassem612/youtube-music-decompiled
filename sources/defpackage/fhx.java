package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fhx {
    public final long a;

    static {
        new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault());
    }

    public fhx(long j, long j2) {
        this.a = j2;
        String.format("%d%d", Long.valueOf(j2), Long.valueOf(j));
    }
}
