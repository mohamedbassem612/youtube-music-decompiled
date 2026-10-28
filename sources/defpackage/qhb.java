package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qhb {
    public final qci a;
    public final boolean b;
    private final String c;

    public qhb(String str, qci qciVar, boolean z) {
        this.c = str;
        this.a = qciVar;
        this.b = z;
    }

    static qhb a(Activity activity) {
        return new qhb(null, new qci(activity.getClass().getName()), true);
    }

    public final String b() {
        qci qciVar = this.a;
        if (qciVar != null) {
            return qciVar.a;
        }
        String str = this.c;
        aguu.ak(str);
        return str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qhb)) {
            return false;
        }
        qhb qhbVar = (qhb) obj;
        return b().equals(qhbVar.b()) && this.b == qhbVar.b;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "MeasurementKey{rawStringEventName=" + this.c + ", noPiiEventName=" + String.valueOf(this.a) + ", isActivity=" + this.b + '}';
    }

    public qhb() {
        throw null;
    }
}
