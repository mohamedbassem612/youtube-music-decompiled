package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kxo extends kxu {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ ixt c;
    final /* synthetic */ qcb d;

    public kxo(Intent intent, WeakReference weakReference, qcb qcbVar, ixt ixtVar) {
        this.a = intent;
        this.b = weakReference;
        this.d = qcbVar;
        this.c = ixtVar;
    }

    @Override // defpackage.kxu
    public final void d(GoogleHelp googleHelp) {
        GoogleHelp googleHelp2;
        ViewGroup viewGroup;
        Intent intent = this.a;
        long jNanoTime = System.nanoTime();
        intent.putExtra("EXTRA_START_TICK", jNanoTime);
        Activity activity = (Activity) this.b.get();
        if (activity != null) {
            qcb qcbVar = this.d;
            if (qcbVar == null && this.c == null) {
                googleHelp2 = googleHelp;
            } else {
                Context applicationContext = activity.getApplicationContext();
                ixt ixtVar = this.c;
                if (qcbVar != null) {
                    googleHelp.A = true;
                    googleHelp2 = googleHelp;
                    ixt.T(new kxg(applicationContext, googleHelp2, qcbVar, jNanoTime, 2), 4);
                } else {
                    googleHelp2 = googleHelp;
                }
                if (ixtVar != null) {
                    googleHelp2.B = true;
                    ixt.T(new kxg(applicationContext, googleHelp2, ixtVar, jNanoTime, 1), 4);
                    ixt.T(new kxg(applicationContext, googleHelp2, ixtVar, jNanoTime, 0), 4);
                }
            }
            googleHelp2.z = klt.b;
            TogglingData togglingData = googleHelp2.w;
            if (togglingData != null) {
                String string = activity.getTitle().toString();
                int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
                if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof TextView) {
                            string = ((TextView) childAt).getText().toString();
                            break;
                        }
                    }
                }
                togglingData.c = string;
            }
            if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
                intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp2);
            } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
                kxe kxeVar = (kxe) ket.z(intent, "EXTRA_IN_PRODUCT_HELP", kxe.CREATOR);
                kxeVar.a = googleHelp2;
                intent.putExtra("EXTRA_IN_PRODUCT_HELP", ket.A(kxeVar));
            }
            new afkg(Looper.getMainLooper(), (byte[]) null).post(new jmi(activity, intent, 15));
        }
    }
}
