package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ry {
    public final int a;
    public final Object b;
    public final String c;

    public ry(int i, Object obj, String str) {
        this.a = i;
        this.b = obj;
        this.c = str;
    }

    public static ry a(Throwable th) {
        boolean z = th instanceof ts;
        if (!z || ((ts) th).a != 6) {
            Log.w("AppSearchResult", "Converting throwable to failed result.", th);
        } else if (vo.a) {
            Objects.toString(th);
        }
        if (z) {
            ts tsVar = (ts) th;
            return new ry(tsVar.a, null, tsVar.getMessage());
        }
        String simpleName = th.getClass().getSimpleName();
        int i = 13;
        if (!(th instanceof CancellationException) && !(th instanceof InterruptedException)) {
            i = 2;
            if (!(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof ExecutionException)) {
                if (th instanceof IllegalArgumentException) {
                    i = 3;
                } else if (th instanceof IOException) {
                    i = 4;
                } else {
                    i = th instanceof SecurityException ? 8 : 1;
                }
            }
        }
        return new ry(i, null, simpleName + ": " + th.getMessage());
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ry) {
            ry ryVar = (ry) obj;
            if (this.a == ryVar.a && j$.util.Objects.equals(this.b, ryVar.b) && j$.util.Objects.equals(this.c, ryVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(Integer.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        if (b()) {
            Object obj = this.b;
            Objects.toString(obj);
            return "[SUCCESS]: ".concat(String.valueOf(obj));
        }
        return "[FAILURE(" + this.a + ")]: " + this.c;
    }
}
