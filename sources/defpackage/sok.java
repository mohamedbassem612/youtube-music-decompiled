package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sok {
    public static final sok a = new sok(null, null, null);
    public final CharSequence b;
    public final CharSequence c;
    public final aqmh d;

    public sok(CharSequence charSequence, CharSequence charSequence2, aqmh aqmhVar) {
        this.b = charSequence;
        this.c = charSequence2;
        this.d = aqmhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sok) {
            sok sokVar = (sok) obj;
            if (Objects.equals(this.b, sokVar.b) && Objects.equals(this.c, sokVar.c) && Objects.equals(this.d, sokVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d);
    }
}
