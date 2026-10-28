package defpackage;

import android.util.Log;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aguj extends agtx {
    private final Level a;
    private final boolean b;
    private final Set c;
    private final agth d;
    private final int e;

    public aguj(String str, int i, Level level, boolean z, Set set, agth agthVar) {
        super(str);
        this.e = 2;
        this.a = level;
        this.b = z;
        this.c = set;
        this.d = agthVar;
    }

    @Override // defpackage.agsw
    public final void c(agsu agsuVar) {
        String strB = (String) agsuVar.m().d(agso.a);
        if (strB == null) {
            strB = a();
        }
        if (strB == null) {
            strB = agsuVar.f().b();
            int iIndexOf = strB.indexOf(36, strB.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strB = strB.substring(0, iIndexOf);
            }
        }
        String strE = aguu.e(strB);
        String strSubstring = strE.substring(0, Math.min(strE.length(), 23));
        Level levelQ = agsuVar.q();
        if (!this.b) {
            int iD = aguu.d(levelQ);
            if (!Log.isLoggable(strSubstring, iD) && !Log.isLoggable("all", iD)) {
                return;
            }
        }
        aguk.e(agsuVar, strSubstring, 2, this.a, this.c, this.d);
    }

    @Override // defpackage.agsw
    public final boolean d(Level level) {
        return true;
    }
}
