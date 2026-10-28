package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qfb {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qfb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 296760191;
    }

    public final String toString() {
        return "GlobalConfigurations{componentNameSupplier=null, extensionProvider=null, pauseTimersWhenSleeping=false, pauseStartupMeasuresWhenSleeping=false}";
    }
}
