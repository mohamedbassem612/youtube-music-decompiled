package defpackage;

import android.os.Bundle;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class auj extends auk {
    public final LocalTime a;

    public auj(LocalTime localTime) {
        this.a = localTime.truncatedTo(ChronoUnit.SECONDS);
    }

    @Override // defpackage.auk
    public final void a(Bundle bundle) {
        bundle.putLong("value", this.a.toSecondOfDay());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof auj)) {
            return false;
        }
        auj aujVar = (auj) obj;
        if (this == aujVar) {
            return true;
        }
        return Objects.equals(this.a, aujVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + '}';
    }
}
