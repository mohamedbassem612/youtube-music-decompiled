package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uqp {
    public final akgx a;
    public final int b;
    public final int c;

    public uqp(akgx akgxVar, int i, int i2) {
        if (akgxVar == null) {
            throw new NullPointerException("Null renderer");
        }
        this.a = akgxVar;
        this.b = i;
        this.c = i2;
    }

    static uqp a(akgx akgxVar, DisplayMetrics displayMetrics) {
        int iGz = yno.gz(akgxVar, displayMetrics);
        float fMax = Math.max(akgxVar.k, akgxVar.j);
        agrf agrfVar = twm.a;
        return new uqp(akgxVar, iGz, (int) TypedValue.applyDimension(1, fMax, displayMetrics));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqp) {
            uqp uqpVar = (uqp) obj;
            if (this.a.equals(uqpVar.a) && this.b == uqpVar.b && this.c == uqpVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "GuidelinesRenderer{renderer=" + this.a.toString() + ", snapThresholdPixel=" + this.b + ", fadeInThresholdPixel=" + this.c + '}';
    }

    public uqp() {
        throw null;
    }
}
