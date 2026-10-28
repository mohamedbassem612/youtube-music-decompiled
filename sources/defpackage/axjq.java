package defpackage;

import org.chromium.base.CommandLine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axjq {
    public static final axjo a;

    static {
        a = CommandLine.a.e("enable-idle-tracing") ? new axjp() : new axjo();
    }
}
