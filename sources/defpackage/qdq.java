package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qdq extends qdt {
    public final agfr a;
    private final agfr b;

    public qdq(final long j) {
        if (j <= -100 || j >= 100) {
            final int i = 2;
            this.a = aguu.al(new agfr() { // from class: qdp
                @Override // defpackage.agfr
                public final Object io() {
                    int i2 = i;
                    if (i2 == 0) {
                        return String.valueOf(j);
                    }
                    long j2 = j;
                    return i2 != 1 ? String.format(Locale.US, "%.1e", Double.valueOf(j2)) : Long.valueOf(j2);
                }
            });
            this.b = aguu.al(new ope(this, 11));
        } else {
            final int i2 = 1;
            this.b = aguu.al(new agfr() { // from class: qdp
                @Override // defpackage.agfr
                public final Object io() {
                    int i3 = i2;
                    if (i3 == 0) {
                        return String.valueOf(j);
                    }
                    long j2 = j;
                    return i3 != 1 ? String.format(Locale.US, "%.1e", Double.valueOf(j2)) : Long.valueOf(j2);
                }
            });
            final int i3 = 0;
            this.a = aguu.al(new agfr() { // from class: qdp
                @Override // defpackage.agfr
                public final Object io() {
                    int i4 = i3;
                    if (i4 == 0) {
                        return String.valueOf(j);
                    }
                    long j2 = j;
                    return i4 != 1 ? String.format(Locale.US, "%.1e", Double.valueOf(j2)) : Long.valueOf(j2);
                }
            });
        }
    }

    @Override // defpackage.qdt
    public final /* bridge */ /* synthetic */ Object a() {
        return (Long) this.b.io();
    }

    @Override // defpackage.qdt
    public final String b() {
        return (String) this.a.io();
    }
}
