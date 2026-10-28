package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kwc {
    public static volatile int a = 1;
    private final Context b;
    private final Executor c;
    private final lpa d;
    private final boolean e;

    public kwc(Context context, Executor executor, lpa lpaVar, boolean z) {
        this.b = context;
        this.c = executor;
        this.d = lpaVar;
        this.e = z;
    }

    public static kwc a(Context context, Executor executor, boolean z) {
        kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        if (z) {
            executor.execute(new jmi(context, kjcVar, 13));
        } else {
            executor.execute(new iqc(kjcVar, 15));
        }
        return new kwc(context, executor, (lpa) kjcVar.a, z);
    }

    public void b(int i, String str) {
        e(i, 0L, null, null, str);
    }

    public void c(int i, long j, Exception exc) {
        e(i, j, exc, null, null);
    }

    public void d(int i, long j) {
        e(i, j, null, null, null);
    }

    public final void e(final int i, long j, Exception exc, String str, String str2) {
        int i2 = 1;
        if (!this.e) {
            this.d.a(this.c, new vlm(i2));
            return;
        }
        final aihf aihfVarCreateBuilder = fxb.a.createBuilder();
        String packageName = this.b.getPackageName();
        aihfVarCreateBuilder.copyOnWrite();
        fxb fxbVar = (fxb) aihfVarCreateBuilder.instance;
        packageName.getClass();
        fxbVar.b |= 1;
        fxbVar.c = packageName;
        aihfVarCreateBuilder.copyOnWrite();
        fxb fxbVar2 = (fxb) aihfVarCreateBuilder.instance;
        fxbVar2.b |= 2;
        fxbVar2.d = j;
        int i3 = a;
        aihfVarCreateBuilder.copyOnWrite();
        fxb fxbVar3 = (fxb) aihfVarCreateBuilder.instance;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        fxbVar3.i = i4;
        fxbVar3.b |= SemanticState.Modal;
        if (exc != null) {
            String strA = agfv.a(exc);
            aihfVarCreateBuilder.copyOnWrite();
            fxb fxbVar4 = (fxb) aihfVarCreateBuilder.instance;
            strA.getClass();
            fxbVar4.b |= 4;
            fxbVar4.e = strA;
            String name = exc.getClass().getName();
            aihfVarCreateBuilder.copyOnWrite();
            fxb fxbVar5 = (fxb) aihfVarCreateBuilder.instance;
            name.getClass();
            fxbVar5.b |= 8;
            fxbVar5.f = name;
        }
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            fxb fxbVar6 = (fxb) aihfVarCreateBuilder.instance;
            fxbVar6.b |= 16;
            fxbVar6.g = str2;
        }
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            fxb fxbVar7 = (fxb) aihfVarCreateBuilder.instance;
            fxbVar7.b |= SemanticState.ReadOnly;
            fxbVar7.h = str;
        }
        this.d.a(this.c, new loo() { // from class: kwb
            @Override // defpackage.loo
            public final Object a(lpa lpaVar) {
                int i5 = kwc.a;
                if (!lpaVar.j()) {
                    return Boolean.FALSE;
                }
                int i6 = i;
                aihf aihfVar = aihfVarCreateBuilder;
                ixt.ag(((fxb) aihfVar.build()).toByteArray(), 0, i6, (ahek) lpaVar.f());
                return Boolean.TRUE;
            }
        });
    }
}
