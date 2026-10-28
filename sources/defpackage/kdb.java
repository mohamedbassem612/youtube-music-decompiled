package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kdb {
    public static long a;
    public final kdl b;
    public String c;
    public String d;
    public String g;
    public int h;
    public boolean p;
    public int q;
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public int o = 0;
    public long e = a;
    public int f = 1;

    static {
        new khn("ApplicationAnalyticsSession", (String) null);
        a = System.currentTimeMillis();
    }

    public kdb(kdl kdlVar) {
        this.b = kdlVar;
    }

    public static kdb a(kdl kdlVar) {
        kdb kdbVar = new kdb(kdlVar);
        a++;
        return kdbVar;
    }
}
