package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avbg {
    public static final avbg a;
    public static final avbg b;
    public static final avbg c;
    public static final avbg d;
    public static final avbg e;
    private static final /* synthetic */ avbg[] f;

    static {
        avbg avbgVar = new avbg("UNARY", 0);
        a = avbgVar;
        avbg avbgVar2 = new avbg("CLIENT_STREAMING", 1);
        b = avbgVar2;
        avbg avbgVar3 = new avbg("SERVER_STREAMING", 2);
        c = avbgVar3;
        avbg avbgVar4 = new avbg("BIDI_STREAMING", 3);
        d = avbgVar4;
        avbg avbgVar5 = new avbg("UNKNOWN", 4);
        e = avbgVar5;
        f = new avbg[]{avbgVar, avbgVar2, avbgVar3, avbgVar4, avbgVar5};
    }

    public static avbg[] values() {
        return (avbg[]) f.clone();
    }
}
