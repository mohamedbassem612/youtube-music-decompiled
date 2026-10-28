package defpackage;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class man implements aheh {
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ mao c;
    final /* synthetic */ maq d;
    final /* synthetic */ Context e;
    private final aihf f;

    public man(int i, long j, mao maoVar, maq maqVar, Context context) {
        this.a = i;
        this.b = j;
        this.c = maoVar;
        this.d = maqVar;
        this.e = context;
        aihf aihfVarCreateBuilder = ainv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ainv ainvVar = (ainv) aihfVarCreateBuilder.instance;
        ainvVar.c = 3;
        ainvVar.b |= 1;
        this.f = aihfVarCreateBuilder;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        th.getClass();
        Log.e("LoggingAppWdgtPrvdrDlgt", "Failed to remove widget " + this.a + '.', th);
        this.c.c(this.d, this.e, this.f);
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ainw ainwVar = (ainw) obj;
        if (ainwVar == null) {
            Log.e("LoggingAppWdgtPrvdrDlgt", "Failed to remove widget " + this.a + ". ID does not exist.");
        } else {
            long j = ainwVar.d;
            if (j > 0) {
                long j2 = this.b;
                aihf aihfVar = this.f;
                long jI = awro.i(j2 - j, 0L);
                aihfVar.copyOnWrite();
                ainv ainvVar = (ainv) aihfVar.instance;
                ainv ainvVar2 = ainv.a;
                ainvVar.b |= 8;
                ainvVar.f = jI;
            } else if (j != 0) {
                Log.e("LoggingAppWdgtPrvdrDlgt", a.bS(j, "Not logging duration. Installation timestamp was negative: "));
            }
        }
        this.c.c(this.d, this.e, this.f);
    }
}
