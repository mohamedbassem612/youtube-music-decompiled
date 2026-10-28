package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aasf {
    public static final aasf a;
    public static final aasf b;
    public static final aasf c;
    public static final aasf d;
    public static final aasf e;
    public static final aasf f;
    public static final aasf g;
    public static final aasf h;
    public static final aasf i;
    private static final /* synthetic */ aasf[] j;

    static {
        aasf aasfVar = new aasf("TRANSFER_ADD", 0);
        a = aasfVar;
        aasf aasfVar2 = new aasf("TRANSFER_REMOVE", 1);
        b = aasfVar2;
        aasf aasfVar3 = new aasf("TRANSFER_SIZE", 2);
        c = aasfVar3;
        aasf aasfVar4 = new aasf("TRANSFER_WATCH_NEXT_COMPLETE", 3);
        d = aasfVar4;
        aasf aasfVar5 = new aasf("TRANSFER_START", 4);
        e = aasfVar5;
        aasf aasfVar6 = new aasf("TRANSFER_PROGRESS", 5);
        f = aasfVar6;
        aasf aasfVar7 = new aasf("TRANSFER_STATUS_CHANGE", 6);
        g = aasfVar7;
        aasf aasfVar8 = new aasf("TRANSFER_PAUSE", 7);
        h = aasfVar8;
        aasf aasfVar9 = new aasf("TRANSFER_RESUME", 8);
        i = aasfVar9;
        j = new aasf[]{aasfVar, aasfVar2, aasfVar3, aasfVar4, aasfVar5, aasfVar6, aasfVar7, aasfVar8, aasfVar9};
    }

    public static aasf[] values() {
        return (aasf[]) j.clone();
    }
}
