package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acce {
    public final int a;
    public final acco b;
    final acch c;

    public acce(int i, acco accoVar, acch acchVar) {
        this.a = i;
        this.b = accoVar;
        this.c = acchVar;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "id: %d text: %s settings: %s", Integer.valueOf(this.a), this.b, this.c);
    }
}
