package defpackage;

import android.os.Bundle;
import j$.time.LocalDate;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class auf extends auk {
    public final LocalDate a;
    public final int b;

    public auf(LocalDate localDate, int i) {
        this.a = localDate;
        azs.g(i >= 0 && i <= 2, "Invalid format: %s", Integer.valueOf(i));
        this.b = i;
    }

    @Override // defpackage.auk
    public final void a(Bundle bundle) {
        bundle.putLong("value", this.a.toEpochDay());
        bundle.putInt("format", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof auf)) {
            return false;
        }
        auf aufVar = (auf) obj;
        return this == aufVar || (Objects.equals(this.a, aufVar.a) && this.b == aufVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + ", mFormat=" + this.b + '}';
    }
}
