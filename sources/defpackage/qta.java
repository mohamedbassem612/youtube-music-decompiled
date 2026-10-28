package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qta implements qtj {
    private final kii a;
    private final String b;
    private final CopyOnWriteArrayList c;

    public qta(Context context, String str) {
        kii kiiVar = new kii(context, str, null);
        this.c = new CopyOnWriteArrayList();
        if (!str.startsWith("STREAMZ_")) {
            throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
        }
        this.a = kiiVar;
        this.b = str;
    }

    @Override // defpackage.qtj
    public final void a(qti qtiVar) {
        kih kihVar;
        agda agdaVarE = qtiVar.e();
        if (agdaVarE.b.size() == 0) {
            kihVar = null;
        } else {
            kih kihVarG = this.a.g(agdaVarE);
            kihVarG.h = this.b;
            for (String str : this.c) {
                if (kihVarG.a.d()) {
                    throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
                }
                if (kihVarG.c == null) {
                    kihVarG.c = new ArrayList();
                }
                kihVarG.c.add(str);
            }
            kihVar = kihVarG;
        }
        if (kihVar != null) {
            kihVar.e();
        }
    }
}
