package defpackage;

import android.app.Notification;
import android.graphics.PorterDuff;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class auq {
    public auq(aaf aafVar) {
        ((agjz) aafVar.b).g();
    }

    static Notification.ProgressStyle.Point a(aur aurVar) {
        return aup.a(aurVar).setSemanticStyle(aurVar.d);
    }

    static Notification.ProgressStyle.Segment b(aus ausVar) {
        return aup.b(ausVar).setSemanticStyle(ausVar.d);
    }

    static void c(Notification.ProgressStyle progressStyle, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressPoint(a((aur) it.next()));
        }
    }

    static void d(Notification.ProgressStyle progressStyle, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressSegment(b((aus) it.next()));
        }
    }

    public static PorterDuff.Mode e(int i) {
        switch (i - 1) {
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 6:
                return PorterDuff.Mode.DST_IN;
            case 7:
                return PorterDuff.Mode.SRC_OUT;
            case 8:
                return PorterDuff.Mode.DST_OUT;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 10:
                return PorterDuff.Mode.DST_ATOP;
            case 11:
                return PorterDuff.Mode.XOR;
            case 12:
                return PorterDuff.Mode.ADD;
            case 13:
                return PorterDuff.Mode.MULTIPLY;
            case 14:
                return PorterDuff.Mode.SCREEN;
            case 15:
                return PorterDuff.Mode.OVERLAY;
            case 16:
                return PorterDuff.Mode.DARKEN;
            default:
                return PorterDuff.Mode.LIGHTEN;
        }
    }

    public static Pair f(cju cjuVar) {
        Map mapD = cjuVar.d();
        if (mapD == null) {
            return null;
        }
        return new Pair(Long.valueOf(g(mapD, "LicenseDurationRemaining")), Long.valueOf(g(mapD, "PlaybackDurationRemaining")));
    }

    private static long g(Map map, String str) {
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
        } catch (NumberFormatException unused) {
        }
        return -9223372036854775807L;
    }
}
