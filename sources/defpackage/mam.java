package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mam extends AppWidgetProvider {
    private final awmi yQ = new awmp(new aoh(12));

    public static final ExecutorService f() {
        Object objA = lzx.a.a();
        objA.getClass();
        return (ExecutorService) objA;
    }

    public abstract maq b();

    public final mao e() {
        return (mao) this.yQ.a();
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        context.getClass();
        appWidgetManager.getClass();
        bundle.getClass();
        mao maoVarE = e();
        maq maqVarB = b();
        f();
        aihf aihfVarCreateBuilder = ainv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ainv ainvVar = (ainv) aihfVarCreateBuilder.instance;
        ainvVar.c = 5;
        ainvVar.b |= 1;
        maoVarE.c(maqVarB, context, aihfVarCreateBuilder);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        context.getClass();
        iArr.getClass();
        mao maoVarE = e();
        maq maqVarB = b();
        ExecutorService executorServiceF = f();
        long jCurrentTimeMillis = System.currentTimeMillis();
        mad madVarA = maoVarE.a(context, executorServiceF);
        for (int i : iArr) {
            awrm awrmVar = new awrm();
            mdu.i(mdu.m(mdu.l(((maf) madVarA).b, new iun(new mai(awrmVar, i, 1), 5)), new iun(awrmVar, 6)), new man(i, jCurrentTimeMillis, maoVarE, maqVarB, context));
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        e().b(b(), context, iArr, f());
    }
}
