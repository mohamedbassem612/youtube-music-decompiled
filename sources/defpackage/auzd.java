package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auzd {
    public static final auzd a;
    public static final auzd b;
    public static final auzd c;
    public static final auzd d;
    public static final auzd e;
    private static final /* synthetic */ auzd[] f;

    static {
        auzd auzdVar = new auzd("CONNECTING", 0);
        a = auzdVar;
        auzd auzdVar2 = new auzd("READY", 1);
        b = auzdVar2;
        auzd auzdVar3 = new auzd("TRANSIENT_FAILURE", 2);
        c = auzdVar3;
        auzd auzdVar4 = new auzd("IDLE", 3);
        d = auzdVar4;
        auzd auzdVar5 = new auzd("SHUTDOWN", 4);
        e = auzdVar5;
        f = new auzd[]{auzdVar, auzdVar2, auzdVar3, auzdVar4, auzdVar5};
    }

    public static auzd[] values() {
        return (auzd[]) f.clone();
    }
}
