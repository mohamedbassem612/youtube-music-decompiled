package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rlh {
    public static String a(int i) {
        return a.bP(i, "incognito_session_", "||");
    }

    public static boolean b(String str) {
        return str != null && str.startsWith("incognito_session_");
    }

    public static final int c(ajqf ajqfVar, vxz vxzVar) {
        vxzVar.getClass();
        if (!vxzVar.l(77, 45822335L, false) || ajqfVar == null) {
            return R.string.channel_created;
        }
        int iAq = ahng.aq(ajqfVar.f);
        if (iAq == 0 || iAq != 53) {
            if ((ajqfVar.c & 2) == 0) {
                return R.string.channel_created;
            }
            arrc arrcVar = ajqfVar.e;
            if (arrcVar == null) {
                arrcVar = arrc.a;
            }
            if (arrcVar.b != 4) {
                return R.string.channel_created;
            }
        }
        return R.string.channel_restored;
    }

    public static /* synthetic */ ajpu d(String str, wek wekVar) {
        ajpw ajpwVar = (ajpw) wekVar.g(str).g(ajpw.class).E();
        return ajpwVar != null ? ajpw.e(ajpwVar.c) : ajpw.f(str);
    }
}
