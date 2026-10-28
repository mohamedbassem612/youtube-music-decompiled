package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lzz implements mab {
    private static final qro e = new vlf(1);
    public final Context a;
    public final List b;
    public final rrq c;

    public lzz(Context context, rrq rrqVar, ExecutorService executorService) {
        this.a = context;
        this.c = rrqVar;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        List<AppWidgetProviderInfo> installedProviders = (appWidgetManager == null || (installedProviders = appWidgetManager.getInstalledProviders()) == null) ? awno.a : installedProviders;
        ArrayList arrayList = new ArrayList(atqq.N(installedProviders, 10));
        for (AppWidgetProviderInfo appWidgetProviderInfo : installedProviders) {
            qrn qrnVarD = qrp.d(this.a.getApplicationContext(), executorService);
            qrnVarD.c = appWidgetProviderInfo.provider.getClassName();
            qrnVarD.d("ids");
            qrnVarD.b();
            qrnVarD.e(e);
            arrayList.add(qrnVarD.a());
        }
        this.b = arrayList;
    }
}
