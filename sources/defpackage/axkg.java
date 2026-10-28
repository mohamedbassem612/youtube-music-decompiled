package defpackage;

import org.chromium.net.CronetProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axkg {
    public CronetProvider a;
    public int b;
    public axnh c;

    public final boolean equals(Object obj) {
        return (obj instanceof axkg) && this.a.equals(((axkg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
