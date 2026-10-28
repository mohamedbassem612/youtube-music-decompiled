package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bb extends be {
    private final boolean b;
    private boolean c;
    private eol d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(ea eaVar, boolean z) {
        super(eaVar);
        eaVar.getClass();
        this.b = z;
    }

    public final eol a(Context context) {
        if (this.c) {
            return this.d;
        }
        ea eaVar = this.a;
        eol eolVarH = f.h(context, eaVar.a, eaVar.h == 2, this.b);
        this.d = eolVarH;
        this.c = true;
        return eolVarH;
    }
}
