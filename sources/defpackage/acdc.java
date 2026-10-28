package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acdc {
    public final abvn a;
    public volatile float d;
    private final wis e;
    public final avmm c = new avmm();
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());

    public acdc(wis wisVar, abvn abvnVar) {
        this.e = wisVar;
        this.a = abvnVar;
    }

    @tcc
    public void handleFormatStreamChangeEvent(yvu yvuVar) {
        float f;
        wgs wgsVar = yvuVar.c;
        if (wgsVar != null) {
            int i = wgsVar.i();
            int iD = wgsVar.d();
            if (i < 0 || iD < 0) {
                i = 1280;
                iD = 720;
            }
            int iAn = wgsVar.an();
            aoqd aoqdVar = this.e.io().d;
            float f2 = 0.0f;
            if ((aoqdVar.b & Integer.MIN_VALUE) != 0) {
                argy argyVar = aoqdVar.u;
                if (argyVar == null) {
                    argyVar = argy.a;
                }
                f = argyVar.f;
            } else {
                f = 0.0f;
            }
            if ((iAn == 3 || iAn == 4 || iAn == 5) && f != 0.0f) {
                i = (int) (iD * f);
            }
            if (iD > 0 && i > 0) {
                f2 = i / iD;
            }
            this.d = f2;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((acdb) it.next()).a();
            }
        }
    }
}
