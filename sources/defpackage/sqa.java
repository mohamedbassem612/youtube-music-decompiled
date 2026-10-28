package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sqa extends nrm {
    private final skl a;
    private final smc b;
    private boolean c;
    private boolean d;
    private final snz e;

    public sqa(snz snzVar, skl sklVar, smc smcVar) {
        super(null, null);
        this.e = snzVar;
        sklVar.getClass();
        this.a = sklVar;
        smcVar.getClass();
        this.b = smcVar;
    }

    private final void d(long j, String str) {
        if (!this.c) {
            this.e.e(this.a.h());
            this.c = true;
        }
        if (this.d) {
            return;
        }
        smc smcVar = this.b;
        if (TextUtils.equals(str, smcVar.o)) {
            long jA = ((long) smcVar.a()) * 1000;
            if (j < (-1000) + jA || j > jA || this.d) {
                return;
            }
            this.e.e(this.a.g());
            this.d = true;
        }
    }

    @Override // defpackage.nrm
    public final void a(long j, String str) {
        d(j, str);
    }

    @Override // defpackage.nrm
    public final void b(aazk aazkVar) {
        if (aazkVar.h) {
            d(aazkVar.a, aazkVar.i);
        }
    }
}
