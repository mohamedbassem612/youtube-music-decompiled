package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pqj implements pqg {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final pls c;

    public pqj(Context context, pls plsVar, qnl qnlVar) {
        context.getClass();
        plsVar.getClass();
        qnlVar.getClass();
        this.b = context;
        this.c = plsVar;
    }

    private final SharedPreferences d() {
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    private final FirebaseInstanceId e() {
        return FirebaseInstanceId.getInstance(ppa.a(this.b, this.c));
    }

    private final synchronized void f(String str) {
        SharedPreferences.Editor editorEdit = d().edit();
        editorEdit.getClass();
        editorEdit.putString("reg_id", str);
        editorEdit.apply();
    }

    @Override // defpackage.pqg
    public final synchronized pky a() {
        pqi pqiVar;
        qpj.b();
        String str = this.c.b;
        if (str == null) {
            throw new IllegalArgumentException("Project ID must not be null when trying to reset registration token");
        }
        try {
            FirebaseInstanceId firebaseInstanceIdE = e();
            FirebaseInstanceId.f(firebaseInstanceIdE.b);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new IOException("MAIN_THREAD");
            }
            String strE = FirebaseInstanceId.e("");
            String strB = firebaseInstanceIdE.b();
            ahrn ahrnVar = firebaseInstanceIdE.c;
            Bundle bundle = new Bundle();
            bundle.putString("delete", "1");
            firebaseInstanceIdE.a(ahrn.b(ahrnVar.a(strB, str, strE, bundle)));
            FirebaseInstanceId.g.z(firebaseInstanceIdE.c(), str, strE);
            f(null);
            try {
                c();
            } catch (pqh e) {
                ((agsj) ((agsj) a.c()).j(e)).t("Exception thrown when trying to get token after deletion.");
                pqiVar = new pqi(e, pkx.aG, true);
                return pqiVar;
            }
        } catch (Throwable th) {
            ((agsj) ((agsj) a.c()).j(th)).t("Exception thrown when trying to delete token.");
            pqiVar = new pqi(th, pkx.aF, false);
        }
        return new pla(awmy.a);
    }

    @Override // defpackage.pqg
    public final synchronized String b() {
        return d().getString("reg_id", null);
    }

    @Override // defpackage.pqg
    public final synchronized String c() {
        String strD;
        qpj.b();
        String str = this.c.b;
        if (str == null) {
            throw new IllegalArgumentException("Project ID must not be null when trying to get registration token");
        }
        try {
            strD = e().d(str, "");
            if (strD == null || strD.length() == 0) {
                throw new pqh();
            }
            if (!awrc.c(strD, b())) {
                f(strD);
            }
        } catch (Throwable th) {
            ((agsj) ((agsj) a.c()).j(th)).t("Exception when trying to get token from Firebase.");
            throw new pqh(th);
        }
        return strD;
    }
}
