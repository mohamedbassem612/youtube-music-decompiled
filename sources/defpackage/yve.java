package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class yve {
    public final String d;
    public yvd h;
    public int a = -1;
    public int b = -1;
    public String c = "";
    public String e = "vod";
    public String f = "";
    public String g = "";
    public String i = "";
    public long j = -1;

    public yve(zsf zsfVar) {
        String str = "";
        int iOrdinal = zsfVar.ordinal();
        if (iOrdinal == 0) {
            str = "fw";
        } else if (iOrdinal == 1) {
            str = "exo";
        } else if (iOrdinal == 2) {
            str = "exo2";
        } else if (iOrdinal == 3) {
            str = "plat";
        } else if (iOrdinal == 5) {
            str = "base";
        }
        this.d = str;
    }
}
