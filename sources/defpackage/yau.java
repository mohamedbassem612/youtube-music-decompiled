package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class yau implements yco {
    private static final avmc a = avmc.q(new xza());

    @Override // defpackage.xzc
    public final String A() {
        String str;
        ycr ycrVarAJ = aJ();
        return (ycrVarAJ == null || (str = ((yam) ycrVarAJ).P) == null) ? xyv.a.g : str;
    }

    @Override // defpackage.xzc
    public final String B() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ycrVarAJ.g();
        }
        return null;
    }

    @Override // defpackage.xzc
    public final String C() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ycrVarAJ.h();
        }
        return null;
    }

    @Override // defpackage.xzc
    public final String D() {
        String strI;
        ycr ycrVarAJ = aJ();
        return (ycrVarAJ == null || (strI = ycrVarAJ.i()) == null) ? xyv.a.b : strI;
    }

    @Override // defpackage.xzc
    public final void E(List list) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            yamVar.k();
            xvy xvyVar = new xvy();
            xvyVar.a("videoIds", TextUtils.join(",", list));
            xvyVar.a("videoSources", "XX");
            yamVar.q(xvu.ADD_VIDEOS, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public final void F(List list) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            yamVar.k();
            xvy xvyVar = new xvy();
            yam.C(xvyVar, list);
            yamVar.q(xvu.ADD_VIDEOS, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public final void G(String str) {
        str.getClass();
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            yamVar.k();
            xvy xvyVar = new xvy();
            xvyVar.a("videoId", str);
            xvyVar.a("videoSources", "XX");
            yamVar.q(xvu.ADD_VIDEO, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public final void H() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            yamVar.k();
            if (yamVar.y() && !TextUtils.isEmpty(yamVar.i())) {
                yamVar.u();
            }
            yamVar.q(xvu.CLEAR_PLAYLIST, xvy.a);
        }
    }

    @Override // defpackage.xzc
    public final void K(List list) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            yamVar.k();
            xvy xvyVar = new xvy();
            xvyVar.a("videoIds", TextUtils.join(",", list));
            yamVar.q(xvu.INSERT_VIDEOS, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public final void L(List list) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            yamVar.k();
            xvy xvyVar = new xvy();
            yam.C(xvyVar, list);
            yamVar.q(xvu.INSERT_VIDEOS, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public final void M(String str) {
        str.getClass();
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            yamVar.k();
            xvy xvyVar = new xvy();
            xvyVar.a("videoId", str);
            yamVar.q(xvu.INSERT_VIDEO, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public final void N(String str, int i) {
        str.getClass();
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            yamVar.k();
            xvy xvyVar = new xvy();
            xvyVar.a("videoId", str);
            xvyVar.a("delta", String.valueOf(i));
            yamVar.q(xvu.MOVE_VIDEO, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public final void O() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            if (yamVar.y()) {
                yamVar.q(xvu.NEXT, xvy.a);
            }
        }
    }

    @Override // defpackage.xzc
    public final void P() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            ((yam) ycrVarAJ).q(xvu.ON_USER_ACTIVITY, xvy.a);
        }
    }

    @Override // defpackage.xzc
    public void S() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            if (yamVar.y()) {
                yamVar.q(xvu.PAUSE, xvy.a);
            }
        }
    }

    @Override // defpackage.xzc
    public void T() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            ycrVarAJ.p();
        }
    }

    @Override // defpackage.xzc
    public final void V() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            if (yamVar.y()) {
                yamVar.q(xvu.PREVIOUS, xvy.a);
            }
        }
    }

    @Override // defpackage.xzc
    public final void W(String str) {
        str.getClass();
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            yamVar.k();
            xvy xvyVar = new xvy();
            xvyVar.a("videoId", str);
            yamVar.q(xvu.REMOVE_VIDEO, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public final void X(long j) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            if (yamVar.y()) {
                yamVar.X += j - yamVar.a();
                xvy xvyVar = new xvy();
                xvyVar.a("newTime", String.valueOf(j / 1000));
                yamVar.q(xvu.SEEK_TO, xvyVar);
            }
        }
    }

    @Override // defpackage.xzc
    public final void Y(boolean z) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            ((yam) ycrVarAJ).T = z;
        }
    }

    @Override // defpackage.xzc
    public final void Z(String str) {
        str.getClass();
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            if (!yamVar.L.d()) {
                ((agrc) ((agrc) yam.a.b().i(agso.a, "MDX.Cloud")).k("com/google/android/libraries/youtube/mdx/remote/internal/CloudSession", "setAudioTrack", 1117, "CloudSession.java")).t("Cannot send audio track, no confirmed video.");
                return;
            }
            xvy xvyVar = new xvy();
            xvyVar.a("audioTrackId", str);
            xvyVar.a("videoId", yamVar.L.b);
            yamVar.q(xvu.SET_AUDIO_TRACK, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public final float a() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ((yam) ycrVarAJ).R;
        }
        return 1.0f;
    }

    protected abstract ycr aJ();

    @Override // defpackage.xzc
    public final void ab(String str) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            yamVar.S = str;
            xvy xvyVar = new xvy();
            xvyVar.a("loopMode", String.valueOf(yamVar.S));
            yamVar.q(xvu.SET_LOOP_MODE, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public final void ae(acca accaVar) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            hhy hhyVar = yamVar.ap;
            if (hhyVar != null) {
                yamVar.g.removeCallbacks(hhyVar);
            }
            yamVar.ap = new hhy(yamVar, accaVar, 9);
            yamVar.g.postDelayed(yamVar.ap, 300L);
        }
    }

    @Override // defpackage.xzc
    public final void af(float f) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            yamVar.W = yamVar.a();
            yamVar.V = yamVar.j.b();
            yamVar.R = f;
            xvu xvuVar = xvu.SET_PLAYBACK_SPEED;
            xvy xvyVar = new xvy();
            xvyVar.a("playbackSpeed", String.valueOf(f));
            yamVar.q(xvuVar, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public void ag(int i) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            if (yamVar.y()) {
                xvy xvyVar = new xvy();
                xvyVar.a("volume", String.valueOf(i));
                yamVar.q(xvu.SET_VOLUME, xvyVar);
            }
        }
    }

    @Override // defpackage.xzc
    public final void ah() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            ((yam) ycrVarAJ).q(xvu.SKIP_AD, xvy.a);
        }
    }

    @Override // defpackage.xzc
    public final void ai(String str) {
        str.getClass();
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            xvy xvyVar = new xvy();
            xvyVar.a("targetRouteId", str);
            yam yamVar = (yam) ycrVarAJ;
            yamVar.q(xvu.START_TRANSFER_SESSION, xvyVar);
            wjr wjrVar = yamVar.aq;
            wjrVar.v(179);
            wjrVar.w(179, "cx_sst");
        }
    }

    @Override // defpackage.xzc
    public final void aj() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            ycrVarAJ.u();
        }
    }

    @Override // defpackage.xzc
    public void ak(int i, int i2) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            yam yamVar = (yam) ycrVarAJ;
            if (yamVar.y()) {
                xvy xvyVar = new xvy();
                xvyVar.a("delta", String.valueOf(i2));
                xvyVar.a("volume", String.valueOf(i));
                yamVar.q(xvu.SET_VOLUME, xvyVar);
            }
        }
    }

    @Override // defpackage.xzc
    public final boolean al() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ycrVarAJ.v();
        }
        return false;
    }

    @Override // defpackage.xzc
    public final boolean ap() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ycrVarAJ.w();
        }
        return false;
    }

    @Override // defpackage.xzc
    public final boolean aq() {
        ycr ycrVarAJ = aJ();
        return ycrVarAJ != null && ((yam) ycrVarAJ).I == 4;
    }

    @Override // defpackage.xzc
    public final boolean as() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ((yam) ycrVarAJ).z("vsp");
        }
        return false;
    }

    @Override // defpackage.xzc
    public final boolean at(String str) {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ycrVarAJ.z(str);
        }
        return false;
    }

    @Override // defpackage.xzc
    public final boolean au(String str, String str2) {
        str.getClass();
        str2.getClass();
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ == null) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = ((yam) ycrVarAJ).P;
        }
        yam yamVar = (yam) ycrVarAJ;
        return ((!TextUtils.isEmpty(yamVar.i()) && yamVar.i().equals(str) && (yamVar.f().equals(str2) || (yamVar.x() && (TextUtils.isEmpty(str2) || TextUtils.isEmpty(yamVar.f()) || str2.equals(yamVar.P))))) || (TextUtils.isEmpty(yamVar.i()) && yamVar.v() && yamVar.Q.equals(str))) ? false : true;
    }

    @Override // defpackage.xzc
    public final int aw() {
        int i;
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ == null || (i = ((yam) ycrVarAJ).ak) == 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.xzc
    public final void ax() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            xvy xvyVar = new xvy();
            xvyVar.a("debugCommand", "stats4nerds ");
            ((yam) ycrVarAJ).q(xvu.SEND_DEBUG_COMMAND, xvyVar);
        }
    }

    @Override // defpackage.xzc
    public int c() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ((yam) ycrVarAJ).ae;
        }
        return 30;
    }

    @Override // defpackage.xzc
    public final long d() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ycrVarAJ.a();
        }
        return 0L;
    }

    @Override // defpackage.xzc
    public final long e() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ == null) {
            return -1L;
        }
        yam yamVar = (yam) ycrVarAJ;
        long j = yamVar.aa;
        if (j != -1) {
            return ((j + yamVar.X) + yamVar.j.b()) - yamVar.V;
        }
        return -1L;
    }

    @Override // defpackage.xzc
    public final long f() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ == null) {
            return 0L;
        }
        yam yamVar = (yam) ycrVarAJ;
        return (!yamVar.ad || yamVar.r.equals("up")) ? yamVar.Y : (yamVar.Y + yamVar.j.b()) - yamVar.V;
    }

    @Override // defpackage.xzc
    public final long g() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ == null) {
            return -1L;
        }
        yam yamVar = (yam) ycrVarAJ;
        return (yamVar.Z <= 0 || yamVar.r.equals("up")) ? yamVar.Z : (yamVar.Z + yamVar.j.b()) - yamVar.V;
    }

    @Override // defpackage.xzc
    public final smk h() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ((yam) ycrVarAJ).N;
        }
        return null;
    }

    @Override // defpackage.xzc
    public final xve i() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ((yam) ycrVarAJ).t;
        }
        return null;
    }

    @Override // defpackage.xzc
    public final xvz k() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ((yam) ycrVarAJ).t.d;
        }
        return null;
    }

    @Override // defpackage.xzc
    public final xyw l() {
        xyw xywVar;
        ycr ycrVarAJ = aJ();
        return (ycrVarAJ == null || (xywVar = ((yam) ycrVarAJ).K) == null) ? xyw.UNSTARTED : xywVar;
    }

    @Override // defpackage.xzc
    public final xzb m() {
        xzb xzbVar;
        ycr ycrVarAJ = aJ();
        return (ycrVarAJ == null || (xzbVar = ((yam) ycrVarAJ).C) == null) ? ycq.a : xzbVar;
    }

    @Override // defpackage.xzc
    public final ListenableFuture p() {
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ != null) {
            return ((yam) ycrVarAJ).O;
        }
        return null;
    }

    @Override // defpackage.xzc
    public final avmc t() {
        awlx awlxVar;
        ycr ycrVarAJ = aJ();
        return (ycrVarAJ == null || (awlxVar = ((yam) ycrVarAJ).ai) == null) ? a : awlxVar;
    }

    @Override // defpackage.xzc
    public final String v() {
        xwc xwcVar;
        ycr ycrVarAJ = aJ();
        if (ycrVarAJ == null || (xwcVar = ((yam) ycrVarAJ).t.h) == null) {
            return null;
        }
        return xwcVar.b;
    }

    @Override // defpackage.xzc
    public final String w() {
        xwb xwbVar;
        ycr ycrVarAJ = aJ();
        return (ycrVarAJ == null || (xwbVar = ((yam) ycrVarAJ).v) == null) ? "" : xwbVar.a();
    }

    @Override // defpackage.xzc
    public final String x() {
        String strF;
        ycr ycrVarAJ = aJ();
        return (ycrVarAJ == null || (strF = ycrVarAJ.f()) == null) ? xyv.a.g : strF;
    }

    @Override // defpackage.xzc
    public final String y() {
        xwb xwbVar;
        ycr ycrVarAJ = aJ();
        return (ycrVarAJ == null || (xwbVar = ((yam) ycrVarAJ).v) == null) ? "" : xwbVar.a.c;
    }

    @Override // defpackage.xzc
    public final String z() {
        String str;
        ycr ycrVarAJ = aJ();
        return (ycrVarAJ == null || (str = ((yam) ycrVarAJ).Q) == null) ? xyv.a.b : str;
    }
}
