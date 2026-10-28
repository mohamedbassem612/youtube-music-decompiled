package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.util.Optional;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yaa {
    public final /* synthetic */ Object a;

    public yaa(Object obj) {
        this.a = obj;
    }

    public final void a(kbu kbuVar) {
        yae yaeVar = (yae) this.a;
        if (yaeVar.g) {
            return;
        }
        yaeVar.f = kbuVar.c();
        yaeVar.e = kbuVar;
        if (yaeVar.e != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", "getMdxSessionStatus");
                agrx agrxVar = agso.a;
                Looper looperMyLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                Object obj = this.a;
                if (looperMyLooper == mainLooper) {
                    ((yae) obj).e.m(jSONObject.toString());
                } else {
                    ((yae) obj).d.post(new xoy(this, jSONObject, 4));
                }
            } catch (JSONException e) {
                ((agrc) ((agrc) ((agrc) yae.a.b().i(agso.a, "MDX.CastV3")).j(e)).k("com/google/android/libraries/youtube/mdx/remote/internal/CastSession$CastSdkClientConsumerImpl", "sendCastLocalChannelMessage", (char) 548, "CastSession.java")).w("%s", "Could not create outgoing Cast local channel message: getMdxSessionStatus");
            }
        }
    }

    public final void b(int i) {
        Object obj = this.a;
        yae yaeVar = (yae) obj;
        if (yaeVar.x.ak() && xmo.a.contains(Integer.valueOf(i))) {
            afwv afwvVar = yaeVar.j;
            String strC = yaeVar.h.c();
            Object obj2 = afwvVar.b;
            if (obj2 != null) {
                xyp.i(i, strC).gT(((cf) obj2).getSupportFragmentManager(), xyp.class.getCanonicalName());
            }
        }
        ((ycj) obj).aP(yae.aH(i, amyu.MDX_SESSION_DISCONNECT_REASON_CAST_SESSION_START_FAILED_ERROR), Optional.of(Integer.valueOf(i)));
    }

    public final void c(int i, int i2, int i3) {
        xyq xyqVar;
        amyu amyuVar;
        yay yayVar = (yay) this.a;
        yayVar.p = i3 + 1;
        if (i2 == 0) {
            xyqVar = xyq.LAUNCH_FAIL_DEVICE_BUSY;
        } else if (i2 == 2 || i2 == 3) {
            xyqVar = xyq.LAUNCH_FAIL_TIMEOUT;
        } else if (i2 != 4) {
            xyqVar = i2 != 5 ? xyq.UNKNOWN : xyq.UNKNOWN;
        } else {
            xyqVar = xyq.NETWORK;
        }
        ((agrc) ((agrc) yay.a.b().i(agso.a, "MDX.Dial")).k("com/google/android/libraries/youtube/mdx/remote/internal/DialSession$1", "onScreenNotFound", 560, "DialSession.java")).B("Could not find cloud screen corresponding to DIAL device %s, %s", yayVar.k, xyqVar);
        if (i2 == 0) {
            amyuVar = amyu.MDX_SESSION_DISCONNECT_REASON_DIAL_SERVER_ERROR;
        } else if (i2 == 2) {
            amyuVar = amyu.MDX_SESSION_DISCONNECT_REASON_DIAL_CLIENT_ERROR;
        } else if (i2 == 3) {
            amyuVar = amyu.MDX_SESSION_DISCONNECT_REASON_DIAL_CLOUD_SCREEN_FOR_PAIRING_CODE_NOT_FOUND;
        } else if (i2 != 4) {
            amyuVar = i2 != 5 ? amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN : amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN;
        } else {
            amyuVar = amyu.MDX_SESSION_DISCONNECT_REASON_DIAL_LAUNCH_NETWORK_ERROR;
        }
        yayVar.aD(xyqVar, amyuVar, Optional.of(Integer.valueOf(i)));
    }

    @tcc
    public void onNetworkChange(tfn tfnVar) {
        yab yabVar = (yab) this.a;
        if (!yabVar.l.ar() && yabVar.f == 1 && tfnVar.a) {
            if (!yabVar.e || yabVar.m.j(1)) {
                agrx agrxVar = agso.a;
                Handler handler = yabVar.c;
                handler.removeMessages(1);
                handler.sendEmptyMessage(1);
            }
        }
    }
}
