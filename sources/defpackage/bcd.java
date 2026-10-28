package defpackage;

import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bcd {
    public final AccessibilityRecord a;

    @Deprecated
    public bcd(Object obj) {
        this.a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcd) {
            bcd bcdVar = (bcd) obj;
            AccessibilityRecord accessibilityRecord = this.a;
            if (accessibilityRecord != null) {
                return accessibilityRecord.equals(bcdVar.a);
            }
            if (bcdVar.a == null) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }
}
