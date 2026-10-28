package defpackage;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kxh implements Runnable {
    public final GoogleHelp a;
    public final aclc b;
    private boolean c;

    public kxh(GoogleHelp googleHelp, aclc aclcVar) {
        this.a = googleHelp;
        this.b = aclcVar;
    }

    public final synchronized boolean a() {
        if (this.c) {
            return false;
        }
        this.c = true;
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listF;
        this.c = false;
        afkg afkgVar = new afkg(Looper.getMainLooper(), (byte[]) null);
        kcx kcxVar = new kcx(this, 14, null);
        afkgVar.postDelayed(kcxVar, this.a.C);
        try {
            kvz kvzVar = new kvz();
            kvzVar.c();
            listF = new ArrayList(1);
            try {
                listF.add(Pair.create("gms:googlehelp:sync_help_psd_collection_time_ms", String.valueOf(kvzVar.a())));
            } catch (UnsupportedOperationException unused) {
                ArrayList arrayList = new ArrayList(listF);
                arrayList.add(Pair.create("gms:googlehelp:sync_help_psd_collection_time_ms", String.valueOf(kvzVar.a())));
                listF = arrayList;
            }
        } catch (Exception e) {
            Log.w("gH_GetSyncHelpPsd", "Failed to get sync help psd.", e);
            listF = ksy.f(Pair.create("gms:googlehelp:sync_help_psd_failure", "exception"));
        }
        if (a()) {
            afkgVar.removeCallbacks(kcxVar);
            GoogleHelp googleHelp = this.a;
            ixt.U(listF, googleHelp);
            this.b.a(googleHelp);
        }
    }
}
