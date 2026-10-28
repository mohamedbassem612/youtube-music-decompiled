package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
enum aedw {
    LIGHT("Light", 300),
    REGULAR("Regular", 400),
    MEDIUM("Medium", 500),
    SEMIBOLD("SemiBold", 600),
    BOLD("Bold", 700),
    EXTRABOLD("ExtraBold", 800),
    BLACK("Black", 900);

    public static final aedw[] h = values();
    public final int i;
    private final String k;

    aedw(String str, int i) {
        this.k = str;
        this.i = i;
    }

    public static aedw a(String str, String str2) {
        int length = str2.length();
        int i = length + 1;
        if (str.length() <= i || !str.startsWith(str2) || str.charAt(length) != '-') {
            return null;
        }
        int length2 = str.length() - i;
        for (aedw aedwVar : h) {
            String str3 = aedwVar.k;
            if (str3.length() == length2 && str.regionMatches(i, str3, 0, length2)) {
                return aedwVar;
            }
        }
        return null;
    }
}
