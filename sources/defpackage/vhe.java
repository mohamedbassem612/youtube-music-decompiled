package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vhe {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/videoeffects/fragment/RecentlyUsedStickerPagePresenter");
    public final vhd b;
    public final xgm c;

    public vhe(vhd vhdVar, xgm xgmVar) {
        this.b = vhdVar;
        this.c = xgmVar;
    }

    public static void a(xgm xgmVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageLite messageLiteR = aavv.r((apji) it.next());
            if (messageLiteR instanceof aqcs) {
                xgmVar.hB().d(new xgj(yno.fl((aqcs) messageLiteR).G()));
            } else if (messageLiteR instanceof aqcr) {
                xgmVar.hB().d(yno.fh((aqcr) messageLiteR));
            }
        }
    }
}
