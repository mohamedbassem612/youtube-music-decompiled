package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abob {
    public static final abob a;
    public static final abob b;
    public static final abob c;
    public static final abob d;
    public static final abob e;
    public static final abob f;
    public static final abob g;
    public static final abob h;
    public static final abob i;
    public static final abob j;
    private static final /* synthetic */ abob[] k;

    static {
        abob abobVar = new abob("NEW", 0);
        a = abobVar;
        abob abobVar2 = new abob("PLAYBACK_PENDING", 1);
        b = abobVar2;
        abob abobVar3 = new abob("PLAYBACK_LOADED", 2);
        c = abobVar3;
        abob abobVar4 = new abob("PLAYBACK_INTERRUPTED", 3);
        d = abobVar4;
        abob abobVar5 = new abob("INTERSTITIAL_REQUESTED", 4);
        e = abobVar5;
        abob abobVar6 = new abob("INTERSTITIAL_PLAYING", 5);
        f = abobVar6;
        abob abobVar7 = new abob("READY", 6);
        g = abobVar7;
        abob abobVar8 = new abob("VIDEO_REQUESTED", 7);
        h = abobVar8;
        abob abobVar9 = new abob("VIDEO_PLAYING", 8);
        i = abobVar9;
        abob abobVar10 = new abob("ENDED", 9);
        j = abobVar10;
        k = new abob[]{abobVar, abobVar2, abobVar3, abobVar4, abobVar5, abobVar6, abobVar7, abobVar8, abobVar9, abobVar10};
    }

    public static abob[] values() {
        return (abob[]) k.clone();
    }

    public final boolean a(abob... abobVarArr) {
        for (abob abobVar : abobVarArr) {
            if (this == abobVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        return a(e, h, b);
    }

    public final boolean c(abob abobVar) {
        return ordinal() >= abobVar.ordinal();
    }

    public final boolean d() {
        return a(f, i);
    }

    public final boolean e() {
        return d() || b();
    }

    public final boolean f() {
        return a(h, i);
    }

    public final boolean g() {
        return a(d) || h();
    }

    public final boolean h() {
        return a(e, f);
    }
}
