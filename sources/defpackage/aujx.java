package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aujx {
    public static final aujx a = a("1.229.0");
    public static final aujx b = a("1.81.0");
    public final int c;
    public final int d;
    public final int e;

    public aujx(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static aujx a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)").matcher(str);
        if (matcher.matches()) {
            return new aujx(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
        }
        Log.w("Version", "Failed to parse version from: ".concat(str));
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aujx)) {
            return false;
        }
        aujx aujxVar = (aujx) obj;
        return this.c == aujxVar.c && this.d == aujxVar.d && this.e == aujxVar.e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        return String.format("%d.%d.%d", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }
}
