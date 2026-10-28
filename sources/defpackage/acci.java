package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acci implements Serializable {
    public final int a;
    public final long b;
    public final accf c;
    public final CharSequence d;
    public final CharSequence e;
    public final boolean f = false;

    public acci(int i, long j, CharSequence charSequence, CharSequence charSequence2, accf accfVar) {
        this.a = i;
        this.b = j;
        this.d = charSequence;
        this.c = accfVar;
        this.e = charSequence2;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "id: %d time: %d text: %s fullText: %s settings: %s", Integer.valueOf(this.a), Long.valueOf(this.b), this.d, this.e, this.c);
    }
}
