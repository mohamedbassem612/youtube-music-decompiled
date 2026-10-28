package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class esc extends ContextWrapper {
    static final esr a = new erf();
    public final List b;
    public final Map c;
    public final int d;
    public final ewv e;
    public final dov f;
    public final aerj g;
    private final ffm h;
    private final erh i;
    private fec j;

    public esc(Context context, ewv ewvVar, ffm ffmVar, erh erhVar, Map map, List list, aerj aerjVar, dov dovVar, int i) {
        super(context.getApplicationContext());
        this.e = ewvVar;
        this.i = erhVar;
        this.b = list;
        this.c = map;
        this.g = aerjVar;
        this.f = dovVar;
        this.d = i;
        this.h = new ffl(ffmVar);
    }

    public final synchronized fec a() {
        fec fecVarA;
        fecVarA = this.j;
        if (fecVarA == null) {
            fecVarA = this.i.a();
            fecVarA.T();
            this.j = fecVarA;
        }
        return fecVarA;
    }

    public final jqs b() {
        return (jqs) this.h.a();
    }
}
