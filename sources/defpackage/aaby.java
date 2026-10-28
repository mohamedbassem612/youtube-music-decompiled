package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaby {
    public static final aaby a;
    public static final aaby b;
    public static final aaby c;
    public static final aaby d;
    public static final aaby e;
    public static final aaby f;
    public static final aaby g;
    public static final aaby h;
    private static final /* synthetic */ aaby[] i;

    static {
        aaby aabyVar = new aaby("USER_CHANGED", 0);
        a = aabyVar;
        aaby aabyVar2 = new aaby("LOCALE_CHANGED", 1);
        b = aabyVar2;
        aaby aabyVar3 = new aaby("FCM_TOKEN_CHANGED", 2);
        c = aabyVar3;
        aaby aabyVar4 = new aaby("OS_SETTINGS_CHANGED", 3);
        d = aabyVar4;
        aaby aabyVar5 = new aaby("DEVICE_START", 4);
        e = aabyVar5;
        aaby aabyVar6 = new aaby("APP_UPDATED", 5);
        f = aabyVar6;
        aaby aabyVar7 = new aaby("TIMEZONE_CHANGED", 6);
        g = aabyVar7;
        aaby aabyVar8 = new aaby("EOM_STATE_CHANGED", 7);
        h = aabyVar8;
        i = new aaby[]{aabyVar, aabyVar2, aabyVar3, aabyVar4, aabyVar5, aabyVar6, aabyVar7, aabyVar8};
    }

    public static aaby[] values() {
        return (aaby[]) i.clone();
    }
}
