package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xxy {
    public final /* synthetic */ Object a;

    public xxy(Object obj) {
        this.a = obj;
    }

    public final void a(xhn xhnVar) {
        zic.k(2, xhnVar.a, ((yha) this.a).d);
    }

    @tcc
    void handleMdxSwitchPlaybackQueueEvent(xyc xycVar) {
        Object obj = this.a;
        xxz xxzVar = (xxz) obj;
        abvk abvkVar = (abvk) xxzVar.c.io();
        acfw acfwVarI = abvkVar.i();
        boolean zX = abvkVar.X();
        vxz vxzVar = xxzVar.d;
        if (vxzVar.l(110, 45620291L, false) && xycVar.c == amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER_PLAY_ON_PHONE && !xycVar.a) {
            abjy abjyVarB = ((abki) obj).b();
            if (abjyVarB != null) {
                abjyVarB.hb();
            } else {
                ((agrc) ((agrc) xxz.a.c()).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueueSwitcher$StateEventListener", "handleMdxSwitchPlaybackQueueEvent", 96, "MdxPlaybackQueueSwitcher.java")).t("Attempted to clear the remote queue but the remote queue was null.");
            }
        }
        boolean z = xycVar.a;
        ((abki) obj).e(z ? abjk.b : abjk.a, xycVar.b);
        if (yno.cV(vxzVar, xycVar.c, xycVar.d, acfwVarI, zX)) {
            abvkVar.A();
        } else {
            if (z) {
                return;
            }
            abvkVar.ap(false, 19);
        }
    }

    public /* synthetic */ xxy(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
