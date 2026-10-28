package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qh {
    private static final int a = -419430401;
    private static final int b = -2145707237;
    private static qo c;

    /* JADX WARN: Type inference failed for: r5v0, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [awqg, java.lang.Object] */
    public static /* synthetic */ void a(qe qeVar) {
        qx qxVarP = dl.p(0, 0);
        qx qxVarP2 = dl.p(a, b);
        View decorView = qeVar.getWindow().getDecorView();
        decorView.getClass();
        qo qjVar = c;
        if (qjVar == null) {
            if (Build.VERSION.SDK_INT >= 35) {
                qjVar = new qm();
            } else if (Build.VERSION.SDK_INT >= 30) {
                qjVar = new ql();
            } else if (Build.VERSION.SDK_INT >= 29) {
                qjVar = new qk();
            } else {
                qjVar = Build.VERSION.SDK_INT >= 28 ? new qj() : new qi();
            }
            c = qjVar;
        }
        Window window = qeVar.getWindow();
        window.getClass();
        ?? r5 = qxVarP.c;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) r5.invoke(resources)).booleanValue();
        ?? r6 = qxVarP2.c;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        qjVar.a(qxVarP, qxVarP2, window, decorView, zBooleanValue, ((Boolean) r6.invoke(resources2)).booleanValue());
        Window window2 = qeVar.getWindow();
        window2.getClass();
        qjVar.b(window2);
    }
}
