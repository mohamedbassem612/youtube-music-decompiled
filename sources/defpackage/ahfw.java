package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahfw {
    public static final ahfw a = new ahfw("ENABLED");
    public static final ahfw b = new ahfw("DISABLED");
    public static final ahfw c = new ahfw("DESTROYED");
    private final String d;

    private ahfw(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
