package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsq {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public jsv d;
    public boolean e;

    public jsq(int i, String str, jsv jsvVar) {
        this.a = i;
        this.b = str;
        this.d = jsvVar;
    }

    static /* synthetic */ String c(IOException iOException, String str, String str2) {
        return str + iOException.getMessage() + str2 + Log.getStackTraceString(iOException);
    }

    public final jtd a(long j) {
        String str = this.b;
        jtd jtdVar = new jtd(str, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        jtd jtdVar2 = (jtd) treeSet.floor(jtdVar);
        if (jtdVar2 != null) {
            if (jtdVar2.b + jtdVar2.c > j) {
                return jtdVar2;
            }
        }
        jtd jtdVar3 = (jtd) treeSet.ceiling(jtdVar);
        return jtdVar3 == null ? new jtd(str, j, -1L, -9223372036854775807L, null) : new jtd(str, j, jtdVar3.b - j, -9223372036854775807L, null);
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jsq jsqVar = (jsq) obj;
            if (this.a == jsqVar.a && this.b.equals(jsqVar.b) && this.c.equals(jsqVar.c) && this.d.equals(jsqVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }
}
