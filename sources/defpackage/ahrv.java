package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahrv implements ahrw {
    public static final Object a = new Object();
    public final ahnr b;
    public final ahsh c;
    public final ahsd d;
    public final auor e;
    private final ahox f;
    private final Object g;
    private final ExecutorService h;
    private final Executor i;
    private String j;
    private final Set k;
    private final List l;

    static {
        new ahru();
    }

    public ahrv(ahnr ahnrVar, ahrs ahrsVar, ExecutorService executorService, Executor executor) {
        ahsh ahshVar = new ahsh(ahnrVar.a(), ahrsVar);
        auor auorVar = new auor(ahnrVar);
        long j = ahsd.a;
        ahno.o();
        ahsd ahsdVarC = ahsd.c();
        ahox ahoxVar = new ahox(new ahop(ahnrVar, 2));
        int i = ahsb.a;
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.b = ahnrVar;
        this.c = ahshVar;
        this.e = auorVar;
        this.d = ahsdVarC;
        this.f = ahoxVar;
        this.h = executorService;
        this.i = executor;
    }

    private final synchronized String n() {
        return this.j;
    }

    private final void o(ahsc ahscVar) {
        synchronized (this.g) {
            this.l.add(ahscVar);
        }
    }

    private final void p() {
        kro.j(d(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        kro.j(e(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        kro.j(c(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String strD = d();
        long j = ahsd.a;
        kro.d(strD.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        kro.d(ahsd.b.matcher(c()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.ahrw
    public final lpa a() {
        p();
        String strN = n();
        if (strN != null) {
            lpf lpfVar = new lpf();
            lpfVar.t(strN);
            return lpfVar;
        }
        kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        o(new ahrz(kjcVar));
        Object obj = kjcVar.a;
        this.h.execute(new acem(this, 18));
        return (lpa) obj;
    }

    public final ahse b() {
        return (ahse) this.f.a();
    }

    final String c() {
        return this.b.e().a;
    }

    final String d() {
        return this.b.e().b;
    }

    final String e() {
        return this.b.e().d;
    }

    @Override // defpackage.ahrw
    public final void f() {
        this.e.f().delete();
    }

    public final void g(Exception exc) {
        synchronized (this.g) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                if (((ahsc) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void h(ahsg ahsgVar) {
        synchronized (this.g) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                if (((ahsc) it.next()).b(ahsgVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void i(String str) {
        this.j = str;
    }

    public final synchronized void j(ahsg ahsgVar, ahsg ahsgVar2) {
        Set set = this.k;
        if (set.size() != 0 && !TextUtils.equals(ahsgVar.a, ahsgVar2.a)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Object obj = ((avgj) it.next()).a;
                if (((FirebaseMessaging) obj).b() != null) {
                    ((FirebaseMessaging) obj).f();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:5:0x000d, B:7:0x0019, B:9:0x0025, B:51:0x0077, B:52:0x007b, B:11:0x002b, B:13:0x0030, B:14:0x0036, B:35:0x0060, B:37:0x0066, B:48:0x0074, B:15:0x0037, B:19:0x0042, B:21:0x0044, B:22:0x0046, B:33:0x005e, B:40:0x006c, B:44:0x0070), top: B:68:0x000d, outer: #3, inners: #2 }] */
    public final void k() {
        ahsg ahsgVarE;
        String strA;
        String string;
        synchronized (a) {
            ahnr ahnrVar = this.b;
            ahpu ahpuVarE = ahpu.e(ahnrVar.a());
            try {
                ahsgVarE = this.e.e();
                if (ahsgVarE.c()) {
                    if ((ahnrVar.g().equals("CHIME_ANDROID_SDK") || ahnrVar.k()) && ahsgVarE.g == 1) {
                        ahse ahseVarB = b();
                        SharedPreferences sharedPreferences = ahseVarB.b;
                        synchronized (sharedPreferences) {
                            try {
                                synchronized (sharedPreferences) {
                                    try {
                                        strA = null;
                                        string = sharedPreferences.getString("|S|id", null);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (TextUtils.isEmpty(string)) {
                                    string = ahsb.a();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (string == null) {
                            SharedPreferences sharedPreferences2 = ahseVarB.b;
                            synchronized (sharedPreferences2) {
                                String string2 = sharedPreferences2.getString("|S||P|", null);
                                if (string2 != null) {
                                    PublicKey publicKeyB = ahseVarB.b(string2);
                                    if (publicKeyB != null) {
                                        strA = ahse.a(publicKeyB);
                                    }
                                }
                            }
                            string = strA;
                        }
                        if (TextUtils.isEmpty(string)) {
                            string = ahsb.a();
                        }
                    } else {
                        string = ahsb.a();
                    }
                    auor auorVar = this.e;
                    ahsf ahsfVar = new ahsf(ahsgVarE);
                    ahsfVar.a = string;
                    ahsfVar.c(3);
                    ahsgVarE = ahsfVar.a();
                    auorVar.g(ahsgVarE);
                }
                if (ahpuVarE != null) {
                    ahpuVarE.c();
                }
            } catch (Throwable th3) {
                if (ahpuVarE != null) {
                    ahpuVarE.c();
                }
                throw th3;
            }
        }
        h(ahsgVarE);
        this.i.execute(new Runnable() { // from class: ahrt
            @Override // java.lang.Runnable
            public final void run() {
                ahsg ahsgVarE2;
                String str;
                ahsg ahsgVarA;
                Object obj = ahrv.a;
                ahrv ahrvVar = this.a;
                synchronized (obj) {
                    ahpu ahpuVarE2 = ahpu.e(ahrvVar.b.a());
                    try {
                        ahsgVarE2 = ahrvVar.e.e();
                        if (ahpuVarE2 != null) {
                            ahpuVarE2.c();
                        }
                    } catch (Throwable th4) {
                        if (ahpuVarE2 == null) {
                            throw th4;
                        }
                        ahpuVarE2.c();
                        throw th4;
                    }
                }
                try {
                    if (ahsgVarE2.b() || ahsgVarE2.e()) {
                        String str2 = ahsgVarE2.a;
                        if (str2 == null || str2.length() != 11) {
                            str = null;
                            break;
                        }
                        ahse ahseVarB2 = ahrvVar.b();
                        SharedPreferences sharedPreferences3 = ahseVarB2.b;
                        synchronized (sharedPreferences3) {
                            try {
                                String[] strArr = ahse.a;
                                int i = 0;
                                while (true) {
                                    if (i >= 4) {
                                        str = null;
                                        break;
                                    }
                                    String str3 = strArr[i];
                                    String string3 = sharedPreferences3.getString("|T|" + ahseVarB2.c + '|' + str3, null);
                                    if (string3 != null && !string3.isEmpty()) {
                                        if (string3.startsWith("{")) {
                                            try {
                                                string3 = new JSONObject(string3).getString("token");
                                            } catch (JSONException unused) {
                                                string3 = null;
                                            }
                                        }
                                        str = string3;
                                        break;
                                    }
                                    i++;
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        ahsi ahsiVarB = ahrvVar.c.b(ahrvVar.c(), ahsgVarE2.a, ahrvVar.e(), ahrvVar.d(), str);
                        int i2 = ahsiVarB.d;
                        int i3 = i2 - 1;
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i3 == 0) {
                            String str4 = ahsiVarB.a;
                            String str5 = ahsiVarB.b;
                            long jA = ahrvVar.d.a();
                            ahsl ahslVar = ahsiVarB.c;
                            String str6 = ahslVar.a;
                            long j = ahslVar.b;
                            ahsf ahsfVar2 = new ahsf(ahsgVarE2);
                            ahsfVar2.a = str4;
                            ahsfVar2.c(4);
                            ahsfVar2.b = str6;
                            ahsfVar2.c = str5;
                            ahsfVar2.b(j);
                            ahsfVar2.d(jA);
                            ahsgVarA = ahsfVar2.a();
                        } else {
                            if (i3 != 1) {
                                throw new ahrx("Firebase Installations Service is unavailable. Please try again later.");
                            }
                            ahsgVarA = ahsgVarE2.f();
                        }
                    } else {
                        ahsd ahsdVar = ahrvVar.d;
                        if (!ahsdVar.b(ahsgVarE2)) {
                            return;
                        }
                        ahsl ahslVarC = ahrvVar.c.c(ahrvVar.c(), ahsgVarE2.a, ahrvVar.e(), ahsgVarE2.c);
                        int i4 = ahslVarC.c;
                        int i5 = i4 - 1;
                        if (i4 == 0) {
                            throw null;
                        }
                        if (i5 == 0) {
                            String str7 = ahslVarC.a;
                            long j2 = ahslVarC.b;
                            long jA2 = ahsdVar.a();
                            ahsf ahsfVar3 = new ahsf(ahsgVarE2);
                            ahsfVar3.b = str7;
                            ahsfVar3.b(j2);
                            ahsfVar3.d(jA2);
                            ahsgVarA = ahsfVar3.a();
                        } else if (i5 == 1) {
                            ahsgVarA = ahsgVarE2.f();
                        } else {
                            if (i5 != 2) {
                                throw new ahrx("Firebase Installations Service is unavailable. Please try again later.");
                            }
                            ahrvVar.i(null);
                            ahsf ahsfVar4 = new ahsf(ahsgVarE2);
                            ahsfVar4.c(2);
                            ahsgVarA = ahsfVar4.a();
                        }
                    }
                    synchronized (ahrv.a) {
                        ahpu ahpuVarE3 = ahpu.e(ahrvVar.b.a());
                        try {
                            ahrvVar.e.g(ahsgVarA);
                            if (ahpuVarE3 != null) {
                                ahpuVarE3.c();
                            }
                        } catch (Throwable th6) {
                            if (ahpuVarE3 == null) {
                                throw th6;
                            }
                            ahpuVarE3.c();
                            throw th6;
                        }
                    }
                    ahrvVar.j(ahsgVarE2, ahsgVarA);
                    if (ahsgVarA.d()) {
                        ahrvVar.i(ahsgVarA.a);
                    }
                    if (ahsgVarA.b()) {
                        ahrvVar.g(new ahrx());
                    } else if (ahsgVarA.c()) {
                        ahrvVar.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    } else {
                        ahrvVar.h(ahsgVarA);
                    }
                } catch (ahrx e) {
                    ahrvVar.g(e);
                }
            }
        });
    }

    @Override // defpackage.ahrw
    public final lpa l() {
        p();
        kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        o(new ahry(this.d, kjcVar));
        Object obj = kjcVar.a;
        this.h.execute(new acem(this, 19));
        return (lpa) obj;
    }

    @Override // defpackage.ahrw
    public final synchronized void m(avgj avgjVar) {
        this.k.add(avgjVar);
    }
}
