package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apyw {
    public static final apyw a;
    public static final apyw b;
    public static final apyw c;
    public static final apyw d;
    public static final apyw e;
    private static final /* synthetic */ apyw[] f;

    static {
        apyw apywVar = new apyw("ADD_CONTENT_ACTION", 0);
        a = apywVar;
        apyw apywVar2 = new apyw("REMOVE_MEMBER_ACTION", 1);
        b = apywVar2;
        apyw apywVar3 = new apyw("MOVE_MEMBER_ACTION", 2);
        c = apywVar3;
        apyw apywVar4 = new apyw("SET_PLAYLIST_NAME_ACTION", 3);
        d = apywVar4;
        apyw apywVar5 = new apyw("EDITACTION_NOT_SET", 4);
        e = apywVar5;
        f = new apyw[]{apywVar, apywVar2, apywVar3, apywVar4, apywVar5};
    }

    public static apyw a(int i) {
        if (i == 0) {
            return e;
        }
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i != 4) {
            return null;
        }
        return d;
    }

    public static apyw[] values() {
        return (apyw[]) f.clone();
    }
}
