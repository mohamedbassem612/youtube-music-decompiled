package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aesz {
    public final String a;
    public final aqii b;

    public aesz(String str, aqii aqiiVar) {
        this.a = str;
        this.b = aqiiVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append("pcen:");
            sb.append(str);
        }
        aqii aqiiVar = this.b;
        if (aqiiVar != null) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append("tag:");
            sb.append(aqiiVar.d);
        }
        return sb.toString();
    }
}
