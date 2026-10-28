package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hww {
    public static final hww a;
    public static final hww b;
    public static final hww c;
    public static final hww d;
    public static final hww e;
    public static final hww f;
    public static final hww g;
    public static final hww h;
    public static final hww i;
    public static final hww j;
    public static final hww k;
    public static final hww l;
    private static final /* synthetic */ hww[] m;

    static {
        hww hwwVar = new hww("DISMISSED", 0);
        a = hwwVar;
        hww hwwVar2 = new hww("MINIMIZED", 1);
        b = hwwVar2;
        hww hwwVar3 = new hww("MAXIMIZED_NOW_PLAYING", 2);
        c = hwwVar3;
        hww hwwVar4 = new hww("MAXIMIZED_NOW_PLAYING_HALF_EXPANDED", 3);
        d = hwwVar4;
        hww hwwVar5 = new hww("MAXIMIZED_PLAYER_ADDITIONAL_VIEW", 4);
        e = hwwVar5;
        hww hwwVar6 = new hww("DOCKED_ENGAGEMENT_PANEL_BELOW_MINI_PLAYER", 5);
        f = hwwVar6;
        hww hwwVar7 = new hww("DOCKED_ENGAGEMENT_PANEL_BELOW_PLAYER", 6);
        g = hwwVar7;
        hww hwwVar8 = new hww("FULLSCREEN", 7);
        h = hwwVar8;
        hww hwwVar9 = new hww("SLIDING_VERTICALLY", 8);
        i = hwwVar9;
        hww hwwVar10 = new hww("QUEUE_EXPANDING", 9);
        j = hwwVar10;
        hww hwwVar11 = new hww("DOCKED_ENGAGEMENT_PANEL_EXPANDING", 10);
        k = hwwVar11;
        hww hwwVar12 = new hww("SLIDING_HORIZONTALLY", 11);
        l = hwwVar12;
        m = new hww[]{hwwVar, hwwVar2, hwwVar3, hwwVar4, hwwVar5, hwwVar6, hwwVar7, hwwVar8, hwwVar9, hwwVar10, hwwVar11, hwwVar12};
    }

    public static boolean c(hww hwwVar) {
        return hwwVar == b || hwwVar == e || hwwVar == f;
    }

    public static hww[] values() {
        return (hww[]) m.clone();
    }

    public final boolean a() {
        return this == f || this == g || this == k;
    }

    public final boolean b(hww... hwwVarArr) {
        for (hww hwwVar : hwwVarArr) {
            if (this == hwwVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 8:
            case 11:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
                return true;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public final boolean e() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 11:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                throw new RuntimeException(null, null);
        }
    }
}
