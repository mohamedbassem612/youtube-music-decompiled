package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ydw {
    private static final agkz a = agkz.q(amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER, amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER_SCREEN_INITIATED);

    public static boolean a(amyu amyuVar, boolean z) {
        if (z) {
            return amyuVar == amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER_PLAY_ON_PHONE || a.contains(amyuVar);
        }
        return a.contains(amyuVar);
    }

    public static boolean b(amyu amyuVar) {
        return amyuVar == amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER;
    }
}
