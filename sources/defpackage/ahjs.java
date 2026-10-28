package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahjs {
    public static final ahjs a = new ahjs("SHA256");
    public static final ahjs b = new ahjs("SHA384");
    public static final ahjs c = new ahjs("SHA512");
    public final String d;

    private ahjs(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
