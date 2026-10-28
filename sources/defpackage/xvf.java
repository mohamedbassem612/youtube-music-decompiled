package defpackage;

import android.content.Intent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvf {
    public static final xvf a;
    public static final xvf b;
    public static final xvf c;
    public static final xvf d;
    public static final xvf e;
    public static final xvf f;
    public static final xvf g;
    public static final xvf h;
    public static final xvf i;
    public static final xvf j;
    public static final xvf k;
    public static final xvf l;
    public static final xvf m;
    public static final xvf n;
    public static final xvf o;
    public static final xvf p;
    public static final xvf q;
    public static final xvf r;
    public static final xvf s;
    public static final xvf t;
    public static final xvf u;
    public static final xvf v;
    public static final xvf w;
    private static final /* synthetic */ xvf[] x;

    static {
        xvf xvfVar = new xvf("AUTHORIZATION_LIGHTWEIGHT_ACCOUNT", 0);
        a = xvfVar;
        xvf xvfVar2 = new xvf("BIG_SCREEN_CONNECTED", 1);
        b = xvfVar2;
        xvf xvfVar3 = new xvf("BIG_SCREEN_ON_ERROR", 2);
        c = xvfVar3;
        xvf xvfVar4 = new xvf("BIG_SCREEN_PLAY_STATE_UPDATE", 3);
        d = xvfVar4;
        xvf xvfVar5 = new xvf("BIG_SCREEN_PLAYER_STATE_CHANGED", 4);
        e = xvfVar5;
        xvf xvfVar6 = new xvf("BIG_SCREEN_PLAYLIST_CONFIRMED", 5);
        f = xvfVar6;
        xvf xvfVar7 = new xvf("BIG_SCREEN_PLAYLIST_UPDATE", 6);
        g = xvfVar7;
        xvf xvfVar8 = new xvf("CLOUD_SERVICE_NO_NETWORK", 7);
        h = xvfVar8;
        xvf xvfVar9 = new xvf("DECLINED_PARTY", 8);
        i = xvfVar9;
        xvf xvfVar10 = new xvf("END_PARTY_MODE", 9);
        j = xvfVar10;
        xvf xvfVar11 = new xvf("GO_HOME", 10);
        k = xvfVar11;
        xvf xvfVar12 = new xvf("LOUNGE_SERVER_CONNECTION_ERROR", 11);
        l = xvfVar12;
        xvf xvfVar13 = new xvf("LOUNGE_STATUS", 12);
        m = xvfVar13;
        xvf xvfVar14 = new xvf("NO_ACTION", 13);
        n = xvfVar14;
        xvf xvfVar15 = new xvf("PARTY_VIDEO_FLING", 14);
        o = xvfVar15;
        xvf xvfVar16 = new xvf("PLAYSTATE_CHANGED", 15);
        p = xvfVar16;
        xvf xvfVar17 = new xvf("QUEUE_MODIFIED", 16);
        q = xvfVar17;
        xvf xvfVar18 = new xvf("QUEUE_MODIFIED_VIDEO_ADDED", 17);
        r = xvfVar18;
        xvf xvfVar19 = new xvf("QUEUE_MODIFIED_VIDEO_REMOVED", 18);
        s = xvfVar19;
        xvf xvfVar20 = new xvf("REFRESH", 19);
        t = xvfVar20;
        xvf xvfVar21 = new xvf("REMOTE_CALL_ERROR", 20);
        u = xvfVar21;
        xvf xvfVar22 = new xvf("SHARED_PLAYLIST_MODIFIED", 21);
        v = xvfVar22;
        xvf xvfVar23 = new xvf("SWITCH_USER", 22);
        w = xvfVar23;
        x = new xvf[]{xvfVar, xvfVar2, xvfVar3, xvfVar4, xvfVar5, xvfVar6, xvfVar7, xvfVar8, xvfVar9, xvfVar10, xvfVar11, xvfVar12, xvfVar13, xvfVar14, xvfVar15, xvfVar16, xvfVar17, xvfVar18, xvfVar19, xvfVar20, xvfVar21, xvfVar22, xvfVar23};
    }

    public static xvf[] values() {
        return (xvf[]) x.clone();
    }

    public final Intent a() {
        return new Intent(toString());
    }

    @Override // java.lang.Enum
    public final String toString() {
        return xvf.class.getCanonicalName() + '.' + name();
    }
}
