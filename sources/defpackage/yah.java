package defpackage;

import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yah {
    public static final amyu a = amyu.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED;
    public final /* synthetic */ yam b;

    public yah(yam yamVar) {
        this.b = yamVar;
    }

    public static final String f(JSONObject jSONObject) {
        return jSONObject.has("activeSourceVideoId") ? jSONObject.optString("activeSourceVideoId") : xyv.a.i;
    }

    public static final String g(JSONObject jSONObject) {
        return jSONObject.optString("listId", xyv.a.g);
    }

    public static final String h(JSONObject jSONObject) {
        return jSONObject.optString("queueId", xyv.a.g);
    }

    public static final String i(JSONObject jSONObject) {
        String str = xyv.a.b;
        return jSONObject.has("videoId") ? jSONObject.optString("videoId", str) : jSONObject.optString("video_id", str);
    }

    private static final int j(JSONObject jSONObject) {
        return jSONObject.optInt("currentIndex", xyv.a.a());
    }

    public final xyv a(JSONObject jSONObject) {
        yam yamVar = this.b;
        if (!yamVar.D.g(i(jSONObject))) {
            xyu xyuVar = new xyu();
            xyuVar.f(g(jSONObject));
            xyuVar.n(i(jSONObject));
            xyuVar.b(f(jSONObject));
            xyuVar.l(Integer.valueOf(xyv.b(j(jSONObject))));
            xyuVar.j(jSONObject.has("params") ? jSONObject.getString("params") : null);
            xyuVar.e(jSONObject.has("playerParams") ? jSONObject.getString("playerParams") : null);
            return xyuVar.a();
        }
        xyu xyuVar2 = new xyu();
        xyuVar2.f(g(jSONObject));
        xyuVar2.n(i(jSONObject));
        xyuVar2.b(f(jSONObject));
        xyuVar2.l(Integer.valueOf(xyv.b(j(jSONObject))));
        xyuVar2.j(yamVar.D.j);
        xyuVar2.e(yamVar.D.k);
        xyuVar2.c(yamVar.D.e);
        agrx agrxVar = agso.a;
        xyuVar2.a();
        return xyuVar2.a();
    }

    public final void b(JSONObject jSONObject, boolean z) {
        yam yamVar = this.b;
        if (yamVar.N == null || !jSONObject.has("adState")) {
            return;
        }
        int i = jSONObject.getInt("adState");
        String str = xyw.a;
        xyw xywVarCT = yno.cT(i);
        if (!xywVarCT.p && (xywVarCT = xywVarCT.s) == null) {
            xywVarCT = xyw.AD_UNSTARTED;
            twu.d(xyw.a, 6, a.ci((byte) 46, i, "YouTube MDx: invalid ad state code "), null);
        }
        yamVar.A(xywVarCT, z);
    }

    public final void c(JSONObject jSONObject) {
        yam yamVar = this.b;
        if (yamVar.N == null || !jSONObject.has("currentTime")) {
            return;
        }
        yamVar.W = TimeUnit.SECONDS.toMillis(jSONObject.getInt("currentTime"));
        yamVar.V = yamVar.j.b();
        yamVar.X = 0L;
    }

    public final void d(JSONObject jSONObject) {
        if (jSONObject.has("currentTime")) {
            this.b.W = ((long) jSONObject.getInt("currentTime")) * 1000;
        } else {
            boolean zHas = jSONObject.has("current_time");
            yam yamVar = this.b;
            if (zHas) {
                yamVar.W = ((long) jSONObject.getInt("current_time")) * 1000;
            } else {
                yamVar.W = 0L;
            }
        }
        yam yamVar2 = this.b;
        boolean zHas2 = jSONObject.has("liveIngestionTime");
        yamVar2.ad = zHas2;
        if (zHas2) {
            yamVar2.Y = ((long) jSONObject.optInt("seekableEndTime", 0)) * 1000;
        } else {
            yamVar2.Y = ((long) jSONObject.optInt("duration", 0)) * 1000;
        }
        if (yamVar2.ad && jSONObject.has("seekableStartTime")) {
            yamVar2.Z = ((long) jSONObject.getInt("seekableStartTime")) * 1000;
        } else {
            yamVar2.Z = 0L;
        }
        if (jSONObject.has("liveIngestionTime")) {
            yamVar2.aa = ((long) jSONObject.getInt("liveIngestionTime")) * 1000;
        } else {
            yamVar2.aa = -1L;
        }
        yamVar2.V = yamVar2.j.b();
        yamVar2.X = 0L;
    }

    public final boolean e(JSONObject jSONObject) {
        return this.b.A(yno.cT(jSONObject.optInt("state", xyw.UNSTARTED.o)), false);
    }
}
