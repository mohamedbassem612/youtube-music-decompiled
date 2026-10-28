package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abxm implements abxo {
    public final arfb a;

    public abxm(arfb arfbVar) {
        this.a = arfbVar;
        if (arfbVar == arfb.VIDEO_QUALITY_SETTING_ADVANCED_MENU) {
            throw new IllegalArgumentException("Preset should not be VIDEO_QUALITY_SETTING_ADVANCED_MENU. Use FixedResolution instead.");
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof abxm) && this.a == ((abxm) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PresetVideoQuality(preset=" + this.a + ')';
    }
}
