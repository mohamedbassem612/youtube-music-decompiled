package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class koa implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    private final Object b;

    public koa(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Dialog dialogH;
        io ioVar;
        int i = this.$cid;
        ?? r5 = this.a;
        if (i != 0) {
            jx jxVar = (jx) r5;
            iq iqVar = jxVar.c;
            if (iqVar != null && (ioVar = iqVar.b) != null) {
                ioVar.O(iqVar);
            }
            View view = (View) jxVar.f;
            if (view != null && view.getWindowToken() != null) {
                Object obj = this.b;
                if (((iz) obj).h()) {
                    jxVar.i = (jv) obj;
                }
            }
            jxVar.l = null;
            return;
        }
        kob kobVar = (kob) r5;
        if (kobVar.a) {
            Object obj2 = this.b;
            klt kltVar = kobVar.c;
            aami aamiVar = (aami) obj2;
            Object obj3 = aamiVar.b;
            klo kloVar = (klo) obj3;
            int i2 = kloVar.c;
            boolean zG = kltVar.g(i2);
            int i3 = aamiVar.a;
            if (!zG) {
                Log.w("BaseLifecycleHelper", "Not showing dialog since ConnectionResult is not user-facing: ".concat(String.valueOf(String.valueOf(obj3))));
                kobVar.b(kloVar, i3);
                return;
            }
            Bundle bundle = kloVar.f;
            int i4 = bundle != null ? bundle.getInt("resolutionHandling", 0) : 0;
            if (i4 == 1) {
                kobVar.b(kloVar, i3);
                return;
            }
            if (kloVar.c()) {
                PendingIntent pendingIntentA = kloVar.a();
                kro.l(pendingIntentA);
                if (i4 != 0) {
                    if (i4 == 2) {
                        Activity activityL = ((kot) r5).l();
                        kou kouVar = kobVar.e;
                        if (kloVar.c()) {
                            PendingIntent pendingIntentA2 = kloVar.a();
                            kro.l(pendingIntentA2);
                            Dialog dialogH2 = kltVar.h(activityL, i2, new kqn(kouVar, pendingIntentA2), r5, bundle);
                            if (dialogH2 != null) {
                                kltVar.f(activityL, dialogH2, "GooglePlayServicesErrorDialog", r5);
                                return;
                            }
                        }
                        kobVar.b(kloVar, i3);
                        return;
                    }
                    if (i4 != 3) {
                        kobVar.b(kloVar, i3);
                        return;
                    }
                }
                kobVar.e.startActivityForResult(GoogleApiActivity.a(((kot) r5).l(), pendingIntentA, i3, false), 1);
                return;
            }
            kot kotVar = (kot) r5;
            if (kltVar.n(kotVar.l(), i2, null) != null) {
                Activity activityL2 = kotVar.l();
                kou kouVar2 = kobVar.e;
                Intent intentN = kltVar.n(activityL2, i2, "d");
                if (intentN != null && (dialogH = kltVar.h(activityL2, i2, new kqm(intentN, kouVar2), r5, null)) != null) {
                    kltVar.f(activityL2, dialogH, "GooglePlayServicesErrorDialog", r5);
                }
                kltVar.e(kotVar.l().getApplicationContext(), kloVar, true);
                return;
            }
            if (i2 != 18) {
                kobVar.b(kloVar, i3);
                return;
            }
            Activity activityL3 = kotVar.l();
            ProgressBar progressBar = new ProgressBar(activityL3, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityL3);
            builder.setView(progressBar);
            builder.setMessage(kqh.b(activityL3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            kltVar.f(activityL3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", r5);
            Context applicationContext = kotVar.l().getApplicationContext();
            mqd mqdVar = new mqd(this, alertDialogCreate);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            kos kosVar = new kos(mqdVar);
            avg.f(applicationContext, kosVar, intentFilter, null, 2);
            kosVar.a = applicationContext;
            if (!kml.f(applicationContext)) {
                mqdVar.a();
                kosVar.a();
            }
            kltVar.e(kotVar.l().getApplicationContext(), kloVar, true);
        }
    }
}
