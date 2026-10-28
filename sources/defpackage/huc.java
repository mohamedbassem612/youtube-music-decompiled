package defpackage;

import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class huc {
    public final int a;
    public final int b;

    public huc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof huc) {
            huc hucVar = (huc) obj;
            if (hucVar.a == this.a && hucVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        int i = this.a;
        String str2 = "NONE";
        if (i == 1) {
            str = "NONE";
        } else if (i == 2) {
            str = "AUTO_OFFLINE";
        } else if (i != 3) {
            str = i != 4 ? "EXPLICIT_DOWNLOAD_SYNC" : "AUTO_OFFLINE_SYNC";
        } else {
            str = "EXPLICIT_DOWNLOAD";
        }
        switch (this.b) {
            case 1:
                break;
            case 2:
                str2 = "PENDING_FEEDBACK_TOKENS";
                break;
            case 3:
                str2 = "NO_NETWORK";
                break;
            case 4:
                str2 = "NEEDS_WIFI_OR_UNMETERED_DATA";
                break;
            case 5:
                str2 = "BATTERY_LOW";
                break;
            case 6:
                str2 = "NETWORK_ERROR";
                break;
            default:
                str2 = "CURRENTLY_PLAYING";
                break;
        }
        return String.format(locale, "FailedDownloadSync[trigger=%s, reason=%s]", str, str2);
    }
}
