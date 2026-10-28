package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hcb {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/entities/data/EntityStoreHelperImpl");
    private final wbz b;
    private final zwb c;

    public hcb(wbz wbzVar, zwb zwbVar) {
        this.b = wbzVar;
        this.c = zwbVar;
    }

    public final weh a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c().d(str);
    }

    public final weh b(String str, Class cls) {
        weh wehVarA = a(str);
        if (wehVarA == null) {
            return null;
        }
        if (wehVarA.getClass() == cls) {
            return (weh) cls.cast(wehVarA);
        }
        ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/entities/data/EntityStoreHelperImpl", "getEntity", 90, "EntityStoreHelperImpl.java")).B("Expected entity type: %s, returned: %s", cls, wehVarA.getClass());
        return null;
    }

    public final wek c() {
        return this.b.e(this.c.e());
    }

    public final avmn d(String str, avlw avlwVar, Executor executor) {
        avlr avlrVarJ = c().j(str, false);
        avmb avmbVar = awlg.a;
        return avlrVarJ.O(new awir(executor)).ai(new hbr(avlwVar, 7), new hbr(avlwVar, 8), new hoi(avlwVar, 1), new hbr(avlwVar, 9));
    }

    public final void e(weh wehVar) {
        wer werVarE = c().e();
        werVarE.e(wehVar);
        werVarE.b().D();
    }
}
