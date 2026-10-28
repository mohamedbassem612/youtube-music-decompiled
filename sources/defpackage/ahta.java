package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import app.rive.semantics.SemanticState;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahta {
    final /* synthetic */ FirebaseMessaging a;
    private final ahqy b;
    private boolean c;
    private ahqw d;
    private Boolean e;

    public ahta(FirebaseMessaging firebaseMessaging, ahqy ahqyVar) {
        this.a = firebaseMessaging;
        this.b = ahqyVar;
    }

    final synchronized void a() {
        Boolean boolValueOf;
        ApplicationInfo applicationInfo;
        if (this.c) {
            return;
        }
        Context contextA = this.a.c.a();
        SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                PackageManager packageManager = contextA.getPackageManager();
                boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), SemanticState.Focused)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.e = boolValueOf;
        if (boolValueOf == null) {
            ahqw ahqwVar = new ahqw() { // from class: ahsz
                @Override // defpackage.ahqw
                public final void a() {
                    ahta ahtaVar = this.a;
                    if (ahtaVar.b()) {
                        ahtaVar.a.g();
                    }
                }
            };
            this.d = ahqwVar;
            this.b.a(ahno.class, ahqwVar);
        }
        this.c = true;
    }

    public final synchronized boolean b() {
        Boolean bool;
        a();
        bool = this.e;
        return bool != null ? bool.booleanValue() : this.a.c.j();
    }
}
