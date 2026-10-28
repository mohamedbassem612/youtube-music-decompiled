package defpackage;

import android.content.Context;
import android.util.Log;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abux implements aheh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    public abux(abuy abuyVar, int i, abnl abnlVar, abnp abnpVar, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = abnlVar;
        this.c = abnpVar;
        this.d = abuyVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        if (this.$cid != 0) {
            th.getClass();
            Log.e("LoggingAppWdgtPrvdrDlgt", "Failed to add widget ID " + this.a + '.', th);
            return;
        }
        int i = this.a;
        abuy abuyVar = (abuy) this.d;
        if (i == abuyVar.d.get()) {
            zvl zvlVar = abuyVar.c;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 21;
            zvjVarA.d("Failed to process inlined PlayerResponse");
            zvjVarA.f(th);
            zvlVar.a(zvjVarA.a());
            abuyVar.a((abnl) this.b, (abnp) this.c, Optional.empty());
        }
    }

    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        if (this.$cid != 0) {
            if (((Boolean) obj).booleanValue()) {
                Object obj2 = this.c;
                Object obj3 = this.d;
                Object obj4 = this.b;
                aihf aihfVarCreateBuilder = ainv.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ainv ainvVar = (ainv) aihfVarCreateBuilder.instance;
                ainvVar.c = 2;
                ainvVar.b |= 1;
                ((mao) obj2).c((maq) obj3, (Context) obj4, aihfVarCreateBuilder);
                return;
            }
            return;
        }
        abuy abuyVar = (abuy) this.d;
        abng abngVar = (abng) obj;
        if (this.a == abuyVar.d.get()) {
            abnl abnlVar = (abnl) this.b;
            abuyVar.a(abnlVar, (abnp) this.c, Optional.of(abngVar));
            if (abnlVar.O()) {
                abuyVar.a.al();
            }
        }
    }

    public abux(mao maoVar, maq maqVar, Context context, int i, int i2) {
        this.$cid = i2;
        this.c = maoVar;
        this.d = maqVar;
        this.b = context;
        this.a = i;
    }
}
