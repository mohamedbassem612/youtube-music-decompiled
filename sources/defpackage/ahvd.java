package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahvd {
    public static final ahvd a;
    public static final ahvd b;
    public static final ahvd c;
    public static final ahvd d;
    public static final ahvd e;
    private static final /* synthetic */ ahvd[] f;

    static {
        ahvd ahvdVar = new ahvd("NO_USER_DATA", 0);
        a = ahvdVar;
        ahvd ahvdVar2 = new ahvd("SERVER_KNOWN_USER_DATA", 1);
        b = ahvdVar2;
        ahvd ahvdVar3 = new ahvd("NON_TEXTUAL_INTERACTION_USER_DATA", 2);
        c = ahvdVar3;
        ahvd ahvdVar4 = new ahvd("CONFIRMED_UPLOAD_SAFE_USER_DATA", 3);
        d = ahvdVar4;
        ahvd ahvdVar5 = new ahvd("NEW_COLLECTION_USER_DATA", 4);
        e = ahvdVar5;
        f = new ahvd[]{ahvdVar, ahvdVar2, ahvdVar3, ahvdVar4, ahvdVar5};
    }

    public static ahvd[] values() {
        return (ahvd[]) f.clone();
    }
}
