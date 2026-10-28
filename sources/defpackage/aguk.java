package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aguk extends agtx {
    public static final Set a;
    public static final agth b;
    public static final agui c;
    private final String d;
    private final Level e;
    private final Set f;
    private final agth g;
    private final int h;

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(agrj.a, agso.a, agsp.a)));
        a = setUnmodifiableSet;
        agtd agtdVar = new agtd(agtk.a);
        agtdVar.d = agtk.b;
        agtdVar.a(setUnmodifiableSet);
        agte agteVar = new agte(agtdVar);
        b = agteVar;
        c = new agui(2, Level.ALL, false, setUnmodifiableSet, agteVar);
    }

    public aguk(String str, int i, Level level, Set set, agth agthVar) {
        super(str);
        String strE = aguu.e(str);
        this.d = strE.substring(0, Math.min(strE.length(), 23));
        this.h = 2;
        this.e = level;
        this.f = set;
        this.g = agthVar;
    }

    public static void e(agsu agsuVar, String str, int i, Level level, Set set, agth agthVar) {
        String string;
        Boolean bool = (Boolean) agsuVar.m().d(agsp.a);
        if (bool == null || !bool.booleanValue()) {
            agtr agtrVarG = agtr.g(agtu.f(), agsuVar.m());
            boolean z = agsuVar.q().intValue() < level.intValue();
            if (z || agtv.a(agsuVar, agtrVarG, set)) {
                StringBuilder sb = new StringBuilder();
                if (ahng.aa(2, agsuVar.f(), sb)) {
                    sb.append(' ');
                }
                if (!z || agsuVar.n() == null) {
                    agvh.e(agsuVar, sb);
                    agtv.b(agtrVarG, agthVar, sb);
                } else {
                    sb.append("(REDACTED) ");
                    sb.append(agsuVar.n().b);
                }
                string = sb.toString();
            } else {
                Object objO = agsuVar.o();
                try {
                    string = agsy.c(objO);
                } catch (RuntimeException e) {
                    string = agsy.a(objO, e);
                }
            }
            Throwable th = (Throwable) agsuVar.m().d(agrj.a);
            int iD = aguu.d(agsuVar.q());
            if (iD == 2 || iD == 3 || iD == 4) {
                return;
            }
            if (iD != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // defpackage.agsw
    public final void c(agsu agsuVar) {
        e(agsuVar, this.d, 2, this.e, this.f, this.g);
    }

    @Override // defpackage.agsw
    public final boolean d(Level level) {
        String str = this.d;
        int iD = aguu.d(level);
        return Log.isLoggable(str, iD) || Log.isLoggable("all", iD);
    }
}
