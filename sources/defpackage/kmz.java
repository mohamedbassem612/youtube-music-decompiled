package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kmz implements knd {
    public final Looper A;
    public final int B;
    public final knc C;
    protected final koq D;
    public final khn E;
    public final Context v;
    public final String w;
    public final ktd x;
    public final kms y;
    public final knu z;

    public kmz(Context context, Activity activity, khn khnVar, kms kmsVar, kmy kmyVar) {
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (khnVar == null) {
            throw new NullPointerException("Api must not be null.");
        }
        if (kmyVar == null) {
            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("The provided context did not have an application context.");
        }
        this.v = applicationContext;
        String attributionTag = (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT < 30) ? null : context.getAttributionTag();
        this.w = attributionTag;
        this.x = Build.VERSION.SDK_INT >= 31 ? new ktd(context.getAttributionSource()) : null;
        this.E = khnVar;
        this.y = kmsVar;
        this.A = kmyVar.b;
        knu knuVar = new knu(khnVar, kmsVar, attributionTag);
        this.z = knuVar;
        this.C = new kor(this);
        koq koqVarC = koq.c(applicationContext);
        this.D = koqVarC;
        this.B = koqVarC.i.getAndIncrement();
        if (activity != null && Looper.myLooper() == Looper.getMainLooper()) {
            kou kouVarM = koi.m(activity);
            koi koiVar = (koi) kouVarM.b("ConnectionlessLifecycleHelper", koi.class);
            koiVar = koiVar == null ? new koi(kouVarM, koqVarC) : koiVar;
            koiVar.d.add(knuVar);
            koqVarC.f(koiVar);
        }
        Handler handler = koqVarC.q;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public final lpa A(int i, kpk kpkVar) {
        kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        int i2 = kpkVar.d;
        koq koqVar = this.D;
        koqVar.j(kjcVar, i2, this);
        knr knrVar = new knr(i, kpkVar, kjcVar);
        Handler handler = koqVar.q;
        handler.sendMessage(handler.obtainMessage(4, new xgl(knrVar, koqVar.j.get(), this)));
        return (lpa) kjcVar.a;
    }

    public final void B(int i, kny knyVar) {
        boolean z = true;
        if (!knyVar.h && !((Boolean) BasePendingResult.e.get()).booleanValue()) {
            z = false;
        }
        knyVar.h = z;
        koq koqVar = this.D;
        xgl xglVar = new xgl(new knp(i, knyVar), koqVar.j.get(), this);
        Handler handler = koqVar.q;
        handler.sendMessage(handler.obtainMessage(4, xglVar));
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.lang.Runnable] */
    public final lpa C(hed hedVar) {
        kpc kpcVar = (kpc) hedVar.a;
        if (kpcVar.a() == null) {
            throw new NullPointerException("Listener has already been released.");
        }
        Object obj = hedVar.b;
        koq koqVar = this.D;
        ?? r8 = hedVar.c;
        kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        koqVar.j(kjcVar, kpcVar.d, this);
        knq knqVar = new knq(new hed(kpcVar, (hhc) obj, (Runnable) r8, (byte[]) null), kjcVar);
        Handler handler = koqVar.q;
        handler.sendMessage(handler.obtainMessage(8, new xgl(knqVar, koqVar.j.get(), this)));
        return (lpa) kjcVar.a;
    }

    @Override // defpackage.knd
    public final knu x() {
        return this.z;
    }

    public final kox y(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("Listener must not be null");
        }
        Looper looper = this.A;
        if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        }
        if (str != null) {
            return new kox(looper, obj, str);
        }
        throw new NullPointerException("Listener type must not be null");
    }

    public final kqc z() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        kqc kqcVar = new kqc();
        kms kmsVar = this.y;
        boolean z = kmsVar instanceof kmq;
        Account account = null;
        if (z && (googleSignInAccountA2 = ((kmq) kmsVar).a()) != null) {
            String str = googleSignInAccountA2.c;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        } else if (kmsVar instanceof lrn) {
            account = ((lrn) kmsVar).c;
        }
        kqcVar.a = account;
        Set setA = (!z || (googleSignInAccountA = ((kmq) kmsVar).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.a();
        if (kqcVar.b == null) {
            kqcVar.b = new afx(0);
        }
        kqcVar.b.addAll(setA);
        Context context = this.v;
        kqcVar.d = context.getClass().getName();
        kqcVar.c = context.getPackageName();
        return kqcVar;
    }

    public kmz(Context context, lrn lrnVar) {
        khn khnVar = lro.a;
        gat gatVar = new gat();
        gatVar.b = new kro();
        this(context, null, khnVar, lrnVar, gatVar.f());
        Account account = lrnVar.c;
        if (account != null) {
            String str = account.name;
        }
    }
}
