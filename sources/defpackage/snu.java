package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snu {
    public final Object a;
    public final /* synthetic */ Object b;

    public snu(tld tldVar, cc ccVar, Executor executor, rom romVar) {
        this.b = tldVar;
        this.a = new yt(ccVar, executor, new rkk(this, romVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aglz, java.lang.Object] */
    private final void d(String str, aixr aixrVar) {
        ?? r0 = this.a;
        if (r0.t(str)) {
            for (String str2 : r0.c(str)) {
                Object obj = this.b;
                Optional optionalAs = ((scx) obj).d.as(str2);
                if (!optionalAs.isEmpty()) {
                    aixr aixrVarA = aixr.a(((snl) optionalAs.get()).b.e);
                    if (aixrVarA == null) {
                        aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
                    }
                    if (aixrVarA == aixrVar) {
                        ((scr) obj).s(((snl) optionalAs.get()).b);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void a(String str, int i) {
        aixr aixrVar;
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            aixrVar = aixr.TRIGGER_TYPE_ON_PAGE_EXITED;
        } else if (i == 1) {
            aixrVar = aixr.TRIGGER_TYPE_MINI_APP_PLAYBACK_ENDED;
        } else if (i == 4) {
            aixrVar = aixr.TRIGGER_TYPE_ON_PAGE_EXITED;
        } else if (i != 5) {
            aixrVar = aixr.TRIGGER_TYPE_UNSPECIFIED;
        } else {
            aixrVar = aixr.TRIGGER_TYPE_MINI_APP_PLAYBACK_ENDED;
        }
        Object obj = this.b;
        Iterator it = ((scx) obj).d.at().iterator();
        while (it.hasNext()) {
            aizs aizsVar = ((snl) it.next()).b;
            aixr aixrVarA = aixr.a(aizsVar.e);
            if (aixrVarA == null) {
                aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA == aixrVar) {
                int iOrdinal = aixrVar.ordinal();
                if (iOrdinal == 58) {
                    if (((aizsVar.b == 21 ? (aoir) aizsVar.c : aoir.a).b & 1) != 0) {
                        if (TextUtils.equals((aizsVar.b == 21 ? (aoir) aizsVar.c : aoir.a).c, str)) {
                            arrayList.add(aizsVar);
                        }
                    }
                } else if (iOrdinal == 59) {
                    if (((aizsVar.b == 22 ? (aois) aizsVar.c : aois.b).c & 1) != 0) {
                        if (TextUtils.equals((aizsVar.b == 22 ? (aois) aizsVar.c : aois.b).d, str)) {
                            arrayList.add(aizsVar);
                        }
                    }
                } else if (iOrdinal == 86) {
                    if (((aizsVar.b == 49 ? (anht) aizsVar.c : anht.a).b & 1) != 0) {
                        if (TextUtils.equals((aizsVar.b == 49 ? (anht) aizsVar.c : anht.a).c, str)) {
                            arrayList.add(aizsVar);
                        }
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((scr) obj).t(arrayList);
        } else if (i == 5) {
            d(str, aixr.TRIGGER_TYPE_MINI_APP_PLAYBACK_ENDED);
        } else if (i == 0) {
            d(str, aixr.TRIGGER_TYPE_MINI_APP_SKIP_REQUESTED);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [acdx, java.lang.Object] */
    public final void b(abuz abuzVar) {
        ?? r0 = this.a;
        if (abuzVar != null) {
            r0.l(abuzVar);
            return;
        }
        snv snvVar = (snv) this.b;
        r0.j(snvVar.b.p(), snvVar.a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:56:0x012d  */
    public final void c(eqf eqfVar) {
        yt ytVar = (yt) this.a;
        Object obj = ytVar.a;
        if (obj == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        dd ddVar = (dd) obj;
        if (ddVar.ad()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        wj wjVar = (wj) ddVar.g("androidx.biometric.internal.BiometricFragment");
        boolean z = false;
        if (wjVar == null) {
            wjVar = new wj();
            Bundle bundle = new Bundle();
            bundle.putBoolean("host_activity", false);
            wjVar.setArguments(bundle);
            av avVar = new av((dd) ytVar.a);
            avVar.g(0, wjVar, "androidx.biometric.internal.BiometricFragment", 1);
            avVar.a(true, true);
            ((dd) ytVar.a).ah();
        }
        wm wmVar = wjVar.a;
        wmVar.A = eqfVar;
        wmVar.n();
        wm wmVar2 = wjVar.a;
        wmVar2.m = wa.a(wjVar.requireContext()).b();
        wmVar2.n();
        wm wmVar3 = wjVar.a;
        wmVar3.b = null;
        if (Build.VERSION.SDK_INT < 30) {
            eqf eqfVar2 = wmVar3.A;
            for (int i = 1; i <= 15; i = (i << 1) | 1) {
                if (i == 0) {
                    wmVar3.b = vy.k();
                    break;
                }
            }
        }
        wmVar3.n();
        if (wjVar.i()) {
            wjVar.a.e = wjVar.getString(R.string.confirm_device_credential_password);
        } else {
            wjVar.a.e = null;
        }
        Context context = wjVar.getContext();
        if (Build.VERSION.SDK_INT == 29 && !wjVar.h()) {
            Bundle arguments = wjVar.getArguments();
            Context context2 = wjVar.getContext();
            if (arguments.getBoolean("has_face", Build.VERSION.SDK_INT >= 29 && context2 != null && context2.getPackageManager() != null && context2.getPackageManager().hasSystemFeature("android.hardware.biometrics.face"))) {
                if (wjVar.i()) {
                }
                if (wjVar.a.j) {
                    wjVar.b.postDelayed(new wi(wjVar, 1), 600L);
                    return;
                } else {
                    wjVar.g();
                    return;
                }
            }
            Bundle arguments2 = wjVar.getArguments();
            Context context3 = wjVar.getContext();
            if (Build.VERSION.SDK_INT >= 29 && context3 != null && context3.getPackageManager() != null && context3.getPackageManager().hasSystemFeature("android.hardware.biometrics.iris")) {
                z = true;
            }
            if (arguments2.getBoolean("has_iris", z)) {
                if (wjVar.i()) {
                }
                if (wjVar.a.j) {
                    wjVar.b.postDelayed(new wi(wjVar, 1), 600L);
                    return;
                } else {
                    wjVar.g();
                    return;
                }
            }
        } else if (wjVar.i() || wa.a(context).c() == 0) {
            if (wjVar.a.j) {
                wjVar.b.postDelayed(new wi(wjVar, 1), 600L);
                return;
            } else {
                wjVar.g();
                return;
            }
        }
        wjVar.a.h = true;
        wjVar.c();
    }

    public snu(snv snvVar, acdx acdxVar) {
        this.b = snvVar;
        this.a = acdxVar;
    }

    public snu(scx scxVar) {
        this.b = scxVar;
        this.a = new aghn(null);
    }
}
