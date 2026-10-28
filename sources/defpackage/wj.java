package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.youtube.music.R;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wj extends cc {
    public wm a;
    public final Handler b = new Handler(Looper.getMainLooper());

    private final void l() {
        this.a.g = false;
        if (isAdded()) {
            dd parentFragmentManager = getParentFragmentManager();
            wo woVar = (wo) parentFragmentManager.g("androidx.biometric.internal.FingerprintDialogFragment");
            if (woVar != null) {
                if (woVar.isAdded()) {
                    woVar.iQ(true, false, false);
                    return;
                }
                av avVar = new av(parentFragmentManager);
                avVar.l(woVar);
                avVar.a(true, true);
            }
        }
    }

    private final boolean m() {
        return getArguments().getBoolean("host_activity", true);
    }

    public final void a(int i) {
        if (i == 3 || !this.a.k) {
            if (j()) {
                this.a.f = i;
                if (i == 1) {
                    e(10, vz.e(getContext(), 10));
                }
            }
            aetn aetnVarR = this.a.r();
            Object obj = aetnVarR.c;
            if (obj != null) {
                try {
                    ((CancellationSignal) obj).cancel();
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                aetnVarR.c = null;
            }
            Object obj2 = aetnVarR.b;
            if (obj2 != null) {
                try {
                    ((awl) obj2).a();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                aetnVarR.b = null;
            }
        }
    }

    final void b() {
        l();
        wm wmVar = this.a;
        wmVar.g = false;
        if (!wmVar.i && isAdded()) {
            av avVar = new av(getParentFragmentManager());
            avVar.l(this);
            avVar.a(true, true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && vy.g(context, str, R.array.delay_showing_prompt_models)) {
                wm wmVar2 = this.a;
                wmVar2.j = true;
                this.b.postDelayed(new wi(wmVar2, 0), 600L);
            }
        }
    }

    public final void c() {
        Context context = getContext();
        KeyguardManager keyguardManagerC = context != null ? vz.c(context) : null;
        if (keyguardManagerC == null) {
            d(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        CharSequence charSequenceE = this.a.e();
        CharSequence charSequenceC = this.a.c();
        Intent intentCreateConfirmDeviceCredentialIntent = keyguardManagerC.createConfirmDeviceCredentialIntent(charSequenceE, charSequenceC != null ? charSequenceC : null);
        if (intentCreateConfirmDeviceCredentialIntent == null) {
            d(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.a.i = true;
        if (j()) {
            l();
        }
        intentCreateConfirmDeviceCredentialIntent.setFlags(134742016);
        startActivityForResult(intentCreateConfirmDeviceCredentialIntent, 1);
    }

    public final void d(int i, CharSequence charSequence) {
        e(i, charSequence);
        b();
    }

    public final void e(int i, CharSequence charSequence) {
        wm wmVar = this.a;
        if (wmVar.i) {
            return;
        }
        if (!wmVar.h) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            wmVar.h = false;
            wmVar.f().execute(new qd(this, i, charSequence, 3, (byte[]) null));
        }
    }

    public final void f(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.a.k(2);
        this.a.j(charSequence);
    }

    public final void g() {
        int i;
        xsc xscVar;
        Object obj;
        wm wmVar = this.a;
        if (wmVar.g) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        wmVar.g = true;
        wmVar.h = true;
        Context context = getContext();
        if (context != null) {
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                if (Build.VERSION.SDK_INT == 29) {
                    wm wmVar2 = this.a;
                    int i2 = wmVar2.n;
                    if (wf.e(i2) && wf.c(i2)) {
                        wmVar2.l = true;
                    }
                }
            }
            c();
            return;
        }
        FingerprintManager.CryptoObject cryptoObject = null;
        if (!j()) {
            BiometricPrompt.Builder builderA = we.a(requireContext().getApplicationContext());
            CharSequence charSequenceE = this.a.e();
            CharSequence charSequenceC = this.a.c();
            if (charSequenceE != null) {
                we.g(builderA, charSequenceE);
            }
            if (charSequenceC != null) {
                we.f(builderA, charSequenceC);
            }
            CharSequence charSequenceB = this.a.b();
            if (!TextUtils.isEmpty(charSequenceB)) {
                Executor executorF = this.a.f();
                wm wmVar3 = this.a;
                if (wmVar3.c == null) {
                    wmVar3.c = new wl(wmVar3, 0);
                }
                we.e(builderA, charSequenceB, executorF, wmVar3.c);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                eqf eqfVar = this.a.A;
                wf.a(builderA, true);
            }
            int i3 = this.a.n;
            if (Build.VERSION.SDK_INT >= 30) {
                wg.a(builderA, i3);
            } else if (Build.VERSION.SDK_INT >= 29) {
                wf.b(builderA, wf.c(i3));
            }
            if (Build.VERSION.SDK_INT >= 35) {
                wm wmVar4 = this.a;
                eqf eqfVar2 = wmVar4.A;
                wmVar4.f();
                wm wmVar5 = this.a;
                if (wmVar5.d == null) {
                    wmVar5.d = new wl(wmVar5, 1, null);
                }
                DialogInterface.OnClickListener onClickListener = wmVar5.d;
            }
            BiometricPrompt biometricPromptB = we.b(builderA);
            Context context2 = getContext();
            BiometricPrompt.CryptoObject cryptoObjectJ = vy.j(this.a.b);
            aetn aetnVarR = this.a.r();
            if (aetnVarR.c == null) {
                Object obj2 = aetnVarR.a;
                aetnVarR.c = new CancellationSignal();
            }
            Object obj3 = aetnVarR.c;
            wh whVar = new wh(0);
            wr wrVarA = this.a.a();
            if (wrVarA.a == null) {
                wrVarA.a = new wq(wrVarA.b);
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = wrVarA.a;
            try {
                if (cryptoObjectJ == null) {
                    we.c(biometricPromptB, (CancellationSignal) obj3, whVar, biometricPrompt$AuthenticationCallback);
                } else {
                    we.d(biometricPromptB, cryptoObjectJ, (CancellationSignal) obj3, whVar, biometricPrompt$AuthenticationCallback);
                }
                return;
            } catch (NullPointerException e) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
                d(1, context2 != null ? context2.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = requireContext().getApplicationContext();
        ek ekVar = new ek(applicationContext, null);
        if (ekVar.h()) {
            i = !ekVar.g() ? 11 : 0;
        } else {
            i = 12;
        }
        if (i != 0) {
            d(i, vz.e(applicationContext, i));
            return;
        }
        if (isAdded()) {
            this.a.u = true;
            if (!vy.i(applicationContext, Build.MODEL)) {
                this.b.postDelayed(new mc(this, 14, null), 500L);
                boolean zM = m();
                wo woVar = new wo();
                Bundle bundle = new Bundle();
                bundle.putBoolean("host_activity", zM);
                woVar.setArguments(bundle);
                woVar.gT(getParentFragmentManager(), "androidx.biometric.internal.FingerprintDialogFragment");
            }
            wm wmVar6 = this.a;
            wmVar6.f = 0;
            wb wbVar = wmVar6.b;
            if (wbVar == null) {
                xscVar = null;
            } else {
                Cipher cipher = wbVar.b;
                if (cipher != null) {
                    xscVar = new xsc(cipher);
                } else {
                    Signature signature = wbVar.a;
                    if (signature != null) {
                        xscVar = new xsc(signature);
                    } else {
                        Mac mac = wbVar.c;
                        if (mac != null) {
                            xscVar = new xsc(mac);
                        } else {
                            if (Build.VERSION.SDK_INT >= 30 && wbVar.e != null) {
                                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                            } else if (Build.VERSION.SDK_INT >= 33 && wbVar.f != null) {
                                Log.e("CryptoObjectUtils", "Presentation session is not supported by FingerprintManager.");
                            } else if (Build.VERSION.SDK_INT >= 36 && a.at() >= 3600001 && wbVar.d != null) {
                                Log.e("CryptoObjectUtils", "Key agreement is not supported by FingerprintManager.");
                            } else if (Build.VERSION.SDK_INT >= 35) {
                                Log.e("CryptoObjectUtils", "Operation handle is not supported by FingerprintManager.");
                            }
                            xscVar = null;
                        }
                    }
                }
            }
            aetn aetnVarR2 = this.a.r();
            if (aetnVarR2.b == null) {
                Object obj4 = aetnVarR2.a;
                aetnVarR2.b = new awl();
            }
            Object obj5 = aetnVarR2.b;
            wr wrVarA2 = this.a.a();
            if (wrVarA2.c == null) {
                wrVarA2.c = new qcb(wrVarA2);
            }
            qcb qcbVar = wrVarA2.c;
            if (obj5 != null) {
                try {
                    synchronized (obj5) {
                        try {
                            if (((awl) obj5).b == null) {
                                ((awl) obj5).b = new CancellationSignal();
                                if (((awl) obj5).a) {
                                    ((CancellationSignal) ((awl) obj5).b).cancel();
                                }
                            }
                            obj = ((awl) obj5).b;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (NullPointerException e2) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e2);
                    d(1, vz.e(applicationContext, 1));
                    return;
                }
            } else {
                obj = null;
            }
            FingerprintManager fingerprintManagerB = vz.b((Context) ekVar.a);
            if (fingerprintManagerB != null) {
                if (xscVar != null) {
                    Object obj6 = xscVar.b;
                    if (obj6 != null) {
                        cryptoObject = new FingerprintManager.CryptoObject((Cipher) obj6);
                    } else {
                        Object obj7 = xscVar.a;
                        if (obj7 != null) {
                            cryptoObject = new FingerprintManager.CryptoObject((Signature) obj7);
                        } else {
                            Object obj8 = xscVar.c;
                            if (obj8 != null) {
                                cryptoObject = new FingerprintManager.CryptoObject((Mac) obj8);
                            }
                        }
                    }
                }
                fingerprintManagerB.authenticate(cryptoObject, (CancellationSignal) obj, 0, new wp(qcbVar), null);
            }
        }
    }

    public final boolean h() {
        return getArguments().getBoolean("has_fingerprint", we.l(getContext()));
    }

    public final boolean i() {
        return Build.VERSION.SDK_INT <= 28 && wf.c(this.a.n);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final boolean j() {
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = getContext();
            if (context != null && this.a.b != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (Build.VERSION.SDK_INT != 28) {
                    if (Build.VERSION.SDK_INT == 28) {
                        return false;
                    }
                    return false;
                }
                if (str != null) {
                    for (String str3 : context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                        if (!str.equalsIgnoreCase(str3)) {
                        }
                    }
                    if (!vy.h(context, str2, R.array.crypto_fingerprint_fallback_prefixes)) {
                        if (Build.VERSION.SDK_INT == 28) {
                            return false;
                        }
                        return false;
                    }
                } else if (!vy.h(context, str2, R.array.crypto_fingerprint_fallback_prefixes)) {
                    if (Build.VERSION.SDK_INT == 28) {
                        return false;
                    }
                    return false;
                }
            } else if (Build.VERSION.SDK_INT == 28 || h()) {
                return false;
            }
        }
        return true;
    }

    public final void k() {
        wm wmVar = this.a;
        if (wmVar.h) {
            wmVar.h = false;
            wmVar.f().execute(new mc(this, 13, null));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        b();
    }

    @Override // defpackage.cc
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            wm wmVar = this.a;
            wmVar.i = false;
            if (i2 != -1) {
                d(10, getString(R.string.generic_error_user_canceled));
                return;
            }
            if (wmVar.l) {
                wmVar.l = false;
            }
            k();
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        wm wmVarA = this.a;
        if (wmVarA == null) {
            wmVarA = yt.a(this, m());
            this.a = wmVarA;
        }
        if (wmVarA.o == null) {
            wmVarA.o = new bop();
        }
        final int i = 1;
        wmVarA.o.c(this, new boq(this) { // from class: wd
            public final /* synthetic */ wj a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:71:0x0113 A[PHI: r0
              0x0113: PHI (r0v3 int) = (r0v2 int), (r0v6 int), (r0v6 int), (r0v6 int), (r0v2 int) binds: [B:59:0x00f2, B:65:0x00fc, B:67:0x0102, B:69:0x010c, B:63:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:73:0x011c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:74:0x011e  */
            /* JADX WARN: Code duplicated, block: B:77:0x0129  */
            /* JADX WARN: Code duplicated, block: B:79:0x012f A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:80:0x0131  */
            /* JADX WARN: Code duplicated, block: B:82:0x0138  */
            /* JADX WARN: Code duplicated, block: B:84:0x013e  */
            /* JADX WARN: Code duplicated, block: B:85:0x0142  */
            /* JADX WARN: Code duplicated, block: B:87:0x0156  */
            /* JADX WARN: Code duplicated, block: B:89:0x015e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0168 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:93:0x016a  */
            /* JADX WARN: Instruction removed from duplicated block: B:93:0x016a, please report this as an issue */
            @Override // defpackage.boq
            public final void a(Object obj) {
                int i2;
                CharSequence charSequenceE;
                CharSequence charSequence;
                int i3;
                int i4 = i;
                if (i4 != 0) {
                    if (i4 == 1) {
                        if (((aami) obj) != null) {
                            wj wjVar = this.a;
                            wjVar.k();
                            wjVar.a.q(null);
                            return;
                        }
                        return;
                    }
                    if (i4 == 2) {
                        CharSequence charSequence2 = (CharSequence) obj;
                        if (charSequence2 != null) {
                            wj wjVar2 = this.a;
                            if (wjVar2.j()) {
                                wjVar2.f(charSequence2);
                            }
                            wjVar2.a.g(null);
                            return;
                        }
                        return;
                    }
                    if (i4 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar3 = this.a;
                            if (wjVar3.j()) {
                                wjVar3.f(wjVar3.getString(R.string.fingerprint_not_recognized));
                            }
                            wm wmVar = wjVar3.a;
                            if (wmVar.h) {
                                wmVar.f().execute(new mc(wjVar3, 12, null));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            wjVar3.a.h(false);
                            return;
                        }
                        return;
                    }
                    if (i4 == 4) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar4 = this.a;
                            if (wjVar4.i()) {
                                wjVar4.c();
                            } else {
                                CharSequence charSequenceB = wjVar4.a.b();
                                if (charSequenceB == null) {
                                    charSequenceB = wjVar4.getString(R.string.default_error_msg);
                                }
                                wjVar4.d(13, charSequenceB);
                                wjVar4.a(2);
                            }
                            wjVar4.a.m(false);
                            return;
                        }
                        return;
                    }
                    if (i4 != 5) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar5 = this.a;
                            wjVar5.a(1);
                            wjVar5.b();
                            wjVar5.a.i(false);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wj wjVar6 = this.a;
                        wjVar6.d(22, wjVar6.getString(R.string.content_view_more_options_button_clicked));
                        wjVar6.a(4);
                        wjVar6.a.l(false);
                        return;
                    }
                    return;
                }
                ws wsVar = (ws) obj;
                if (wsVar != null) {
                    int i5 = wsVar.a;
                    switch (i5) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 20:
                        case 22:
                            break;
                        case 6:
                        case 16:
                        case 17:
                        case 19:
                        default:
                            i5 = 8;
                            break;
                        case 18:
                        case 21:
                            i5 = 1;
                            break;
                    }
                    wj wjVar7 = this.a;
                    Context context = wjVar7.getContext();
                    if (Build.VERSION.SDK_INT >= 29) {
                        i2 = i5;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i2);
                            }
                            charSequence = charSequenceE;
                            if (i2 == 5) {
                                i3 = wjVar7.a.f;
                                if (i3 != 0 || i3 == 3) {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i2, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler = wjVar7.b;
                                    qd qdVar = new qd(wjVar7, i2, charSequence, 4, (byte[]) null);
                                    Context context2 = wjVar7.getContext();
                                    handler.postDelayed(qdVar, (context2 == null && vy.i(context2, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i2;
                            }
                            wjVar7.d(i2, charSequenceE);
                        }
                    } else if (i5 == 7) {
                        if (context == null && vz.d(context) && wf.c(wjVar7.a.n)) {
                            wjVar7.c();
                        } else {
                            i2 = i5;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i2);
                                }
                                charSequence = charSequenceE;
                                if (i2 == 5) {
                                    i3 = wjVar7.a.f;
                                    if (i3 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i2, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler2 = wjVar7.b;
                                        qd qdVar2 = new qd(wjVar7, i2, charSequence, 4, (byte[]) null);
                                        Context context3 = wjVar7.getContext();
                                        handler2.postDelayed(qdVar2, (context3 == null && vy.i(context3, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i2;
                                }
                                wjVar7.d(i2, charSequenceE);
                            }
                        }
                    } else if (i5 == 9) {
                        i5 = 9;
                        if (context == null) {
                            i2 = i5;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i2);
                                }
                                charSequence = charSequenceE;
                                if (i2 == 5) {
                                    i3 = wjVar7.a.f;
                                    if (i3 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i2, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler3 = wjVar7.b;
                                        qd qdVar3 = new qd(wjVar7, i2, charSequence, 4, (byte[]) null);
                                        Context context4 = wjVar7.getContext();
                                        handler3.postDelayed(qdVar3, (context4 == null && vy.i(context4, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i2;
                                }
                                wjVar7.d(i2, charSequenceE);
                            }
                        } else {
                            i2 = i5;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i2);
                                }
                                charSequence = charSequenceE;
                                if (i2 == 5) {
                                    i3 = wjVar7.a.f;
                                    if (i3 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i2, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler4 = wjVar7.b;
                                        qd qdVar4 = new qd(wjVar7, i2, charSequence, 4, (byte[]) null);
                                        Context context5 = wjVar7.getContext();
                                        handler4.postDelayed(qdVar4, (context5 == null && vy.i(context5, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i2;
                                }
                                wjVar7.d(i2, charSequenceE);
                            }
                        }
                    } else {
                        i2 = i5;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i2);
                            }
                            charSequence = charSequenceE;
                            if (i2 == 5) {
                                i3 = wjVar7.a.f;
                                if (i3 != 0) {
                                    wjVar7.e(5, charSequence);
                                } else {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i2, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler5 = wjVar7.b;
                                    qd qdVar5 = new qd(wjVar7, i2, charSequence, 4, (byte[]) null);
                                    Context context6 = wjVar7.getContext();
                                    handler5.postDelayed(qdVar5, (context6 == null && vy.i(context6, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i2;
                            }
                            wjVar7.d(i2, charSequenceE);
                        }
                    }
                    wjVar7.a.g(null);
                }
            }
        });
        wm wmVar = this.a;
        if (wmVar.p == null) {
            wmVar.p = new bop();
        }
        final int i2 = 0;
        wmVar.p.c(this, new boq(this) { // from class: wd
            public final /* synthetic */ wj a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:71:0x0113 A[PHI: r0
              0x0113: PHI (r0v3 int) = (r0v2 int), (r0v6 int), (r0v6 int), (r0v6 int), (r0v2 int) binds: [B:59:0x00f2, B:65:0x00fc, B:67:0x0102, B:69:0x010c, B:63:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:73:0x011c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:74:0x011e  */
            /* JADX WARN: Code duplicated, block: B:77:0x0129  */
            /* JADX WARN: Code duplicated, block: B:79:0x012f A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:80:0x0131  */
            /* JADX WARN: Code duplicated, block: B:82:0x0138  */
            /* JADX WARN: Code duplicated, block: B:84:0x013e  */
            /* JADX WARN: Code duplicated, block: B:85:0x0142  */
            /* JADX WARN: Code duplicated, block: B:87:0x0156  */
            /* JADX WARN: Code duplicated, block: B:89:0x015e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0168 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:93:0x016a  */
            /* JADX WARN: Instruction removed from duplicated block: B:93:0x016a, please report this as an issue */
            @Override // defpackage.boq
            public final void a(Object obj) {
                int i3;
                CharSequence charSequenceE;
                CharSequence charSequence;
                int i4;
                int i5 = i2;
                if (i5 != 0) {
                    if (i5 == 1) {
                        if (((aami) obj) != null) {
                            wj wjVar = this.a;
                            wjVar.k();
                            wjVar.a.q(null);
                            return;
                        }
                        return;
                    }
                    if (i5 == 2) {
                        CharSequence charSequence2 = (CharSequence) obj;
                        if (charSequence2 != null) {
                            wj wjVar2 = this.a;
                            if (wjVar2.j()) {
                                wjVar2.f(charSequence2);
                            }
                            wjVar2.a.g(null);
                            return;
                        }
                        return;
                    }
                    if (i5 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar3 = this.a;
                            if (wjVar3.j()) {
                                wjVar3.f(wjVar3.getString(R.string.fingerprint_not_recognized));
                            }
                            wm wmVar2 = wjVar3.a;
                            if (wmVar2.h) {
                                wmVar2.f().execute(new mc(wjVar3, 12, null));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            wjVar3.a.h(false);
                            return;
                        }
                        return;
                    }
                    if (i5 == 4) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar4 = this.a;
                            if (wjVar4.i()) {
                                wjVar4.c();
                            } else {
                                CharSequence charSequenceB = wjVar4.a.b();
                                if (charSequenceB == null) {
                                    charSequenceB = wjVar4.getString(R.string.default_error_msg);
                                }
                                wjVar4.d(13, charSequenceB);
                                wjVar4.a(2);
                            }
                            wjVar4.a.m(false);
                            return;
                        }
                        return;
                    }
                    if (i5 != 5) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar5 = this.a;
                            wjVar5.a(1);
                            wjVar5.b();
                            wjVar5.a.i(false);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wj wjVar6 = this.a;
                        wjVar6.d(22, wjVar6.getString(R.string.content_view_more_options_button_clicked));
                        wjVar6.a(4);
                        wjVar6.a.l(false);
                        return;
                    }
                    return;
                }
                ws wsVar = (ws) obj;
                if (wsVar != null) {
                    int i6 = wsVar.a;
                    switch (i6) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 20:
                        case 22:
                            break;
                        case 6:
                        case 16:
                        case 17:
                        case 19:
                        default:
                            i6 = 8;
                            break;
                        case 18:
                        case 21:
                            i6 = 1;
                            break;
                    }
                    wj wjVar7 = this.a;
                    Context context = wjVar7.getContext();
                    if (Build.VERSION.SDK_INT >= 29) {
                        i3 = i6;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i3);
                            }
                            charSequence = charSequenceE;
                            if (i3 == 5) {
                                i4 = wjVar7.a.f;
                                if (i4 != 0 || i4 == 3) {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i3, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler5 = wjVar7.b;
                                    qd qdVar5 = new qd(wjVar7, i3, charSequence, 4, (byte[]) null);
                                    Context context6 = wjVar7.getContext();
                                    handler5.postDelayed(qdVar5, (context6 == null && vy.i(context6, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i3;
                            }
                            wjVar7.d(i3, charSequenceE);
                        }
                    } else if (i6 == 7) {
                        if (context == null && vz.d(context) && wf.c(wjVar7.a.n)) {
                            wjVar7.c();
                        } else {
                            i3 = i6;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i3);
                                }
                                charSequence = charSequenceE;
                                if (i3 == 5) {
                                    i4 = wjVar7.a.f;
                                    if (i4 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i3, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler6 = wjVar7.b;
                                        qd qdVar6 = new qd(wjVar7, i3, charSequence, 4, (byte[]) null);
                                        Context context7 = wjVar7.getContext();
                                        handler6.postDelayed(qdVar6, (context7 == null && vy.i(context7, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i3;
                                }
                                wjVar7.d(i3, charSequenceE);
                            }
                        }
                    } else if (i6 == 9) {
                        i6 = 9;
                        if (context == null) {
                            i3 = i6;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i3);
                                }
                                charSequence = charSequenceE;
                                if (i3 == 5) {
                                    i4 = wjVar7.a.f;
                                    if (i4 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i3, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler7 = wjVar7.b;
                                        qd qdVar7 = new qd(wjVar7, i3, charSequence, 4, (byte[]) null);
                                        Context context8 = wjVar7.getContext();
                                        handler7.postDelayed(qdVar7, (context8 == null && vy.i(context8, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i3;
                                }
                                wjVar7.d(i3, charSequenceE);
                            }
                        } else {
                            i3 = i6;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i3);
                                }
                                charSequence = charSequenceE;
                                if (i3 == 5) {
                                    i4 = wjVar7.a.f;
                                    if (i4 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i3, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler8 = wjVar7.b;
                                        qd qdVar8 = new qd(wjVar7, i3, charSequence, 4, (byte[]) null);
                                        Context context9 = wjVar7.getContext();
                                        handler8.postDelayed(qdVar8, (context9 == null && vy.i(context9, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i3;
                                }
                                wjVar7.d(i3, charSequenceE);
                            }
                        }
                    } else {
                        i3 = i6;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i3);
                            }
                            charSequence = charSequenceE;
                            if (i3 == 5) {
                                i4 = wjVar7.a.f;
                                if (i4 != 0) {
                                    wjVar7.e(5, charSequence);
                                } else {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i3, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler9 = wjVar7.b;
                                    qd qdVar9 = new qd(wjVar7, i3, charSequence, 4, (byte[]) null);
                                    Context context10 = wjVar7.getContext();
                                    handler9.postDelayed(qdVar9, (context10 == null && vy.i(context10, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i3;
                            }
                            wjVar7.d(i3, charSequenceE);
                        }
                    }
                    wjVar7.a.g(null);
                }
            }
        });
        wm wmVar2 = this.a;
        if (wmVar2.q == null) {
            wmVar2.q = new bop();
        }
        final int i3 = 2;
        wmVar2.q.c(this, new boq(this) { // from class: wd
            public final /* synthetic */ wj a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:71:0x0113 A[PHI: r0
              0x0113: PHI (r0v3 int) = (r0v2 int), (r0v6 int), (r0v6 int), (r0v6 int), (r0v2 int) binds: [B:59:0x00f2, B:65:0x00fc, B:67:0x0102, B:69:0x010c, B:63:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:73:0x011c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:74:0x011e  */
            /* JADX WARN: Code duplicated, block: B:77:0x0129  */
            /* JADX WARN: Code duplicated, block: B:79:0x012f A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:80:0x0131  */
            /* JADX WARN: Code duplicated, block: B:82:0x0138  */
            /* JADX WARN: Code duplicated, block: B:84:0x013e  */
            /* JADX WARN: Code duplicated, block: B:85:0x0142  */
            /* JADX WARN: Code duplicated, block: B:87:0x0156  */
            /* JADX WARN: Code duplicated, block: B:89:0x015e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0168 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:93:0x016a  */
            /* JADX WARN: Instruction removed from duplicated block: B:93:0x016a, please report this as an issue */
            @Override // defpackage.boq
            public final void a(Object obj) {
                int i4;
                CharSequence charSequenceE;
                CharSequence charSequence;
                int i5;
                int i6 = i3;
                if (i6 != 0) {
                    if (i6 == 1) {
                        if (((aami) obj) != null) {
                            wj wjVar = this.a;
                            wjVar.k();
                            wjVar.a.q(null);
                            return;
                        }
                        return;
                    }
                    if (i6 == 2) {
                        CharSequence charSequence2 = (CharSequence) obj;
                        if (charSequence2 != null) {
                            wj wjVar2 = this.a;
                            if (wjVar2.j()) {
                                wjVar2.f(charSequence2);
                            }
                            wjVar2.a.g(null);
                            return;
                        }
                        return;
                    }
                    if (i6 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar3 = this.a;
                            if (wjVar3.j()) {
                                wjVar3.f(wjVar3.getString(R.string.fingerprint_not_recognized));
                            }
                            wm wmVar3 = wjVar3.a;
                            if (wmVar3.h) {
                                wmVar3.f().execute(new mc(wjVar3, 12, null));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            wjVar3.a.h(false);
                            return;
                        }
                        return;
                    }
                    if (i6 == 4) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar4 = this.a;
                            if (wjVar4.i()) {
                                wjVar4.c();
                            } else {
                                CharSequence charSequenceB = wjVar4.a.b();
                                if (charSequenceB == null) {
                                    charSequenceB = wjVar4.getString(R.string.default_error_msg);
                                }
                                wjVar4.d(13, charSequenceB);
                                wjVar4.a(2);
                            }
                            wjVar4.a.m(false);
                            return;
                        }
                        return;
                    }
                    if (i6 != 5) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar5 = this.a;
                            wjVar5.a(1);
                            wjVar5.b();
                            wjVar5.a.i(false);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wj wjVar6 = this.a;
                        wjVar6.d(22, wjVar6.getString(R.string.content_view_more_options_button_clicked));
                        wjVar6.a(4);
                        wjVar6.a.l(false);
                        return;
                    }
                    return;
                }
                ws wsVar = (ws) obj;
                if (wsVar != null) {
                    int i7 = wsVar.a;
                    switch (i7) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 20:
                        case 22:
                            break;
                        case 6:
                        case 16:
                        case 17:
                        case 19:
                        default:
                            i7 = 8;
                            break;
                        case 18:
                        case 21:
                            i7 = 1;
                            break;
                    }
                    wj wjVar7 = this.a;
                    Context context = wjVar7.getContext();
                    if (Build.VERSION.SDK_INT >= 29) {
                        i4 = i7;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i4);
                            }
                            charSequence = charSequenceE;
                            if (i4 == 5) {
                                i5 = wjVar7.a.f;
                                if (i5 != 0 || i5 == 3) {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i4, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler9 = wjVar7.b;
                                    qd qdVar9 = new qd(wjVar7, i4, charSequence, 4, (byte[]) null);
                                    Context context10 = wjVar7.getContext();
                                    handler9.postDelayed(qdVar9, (context10 == null && vy.i(context10, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i4;
                            }
                            wjVar7.d(i4, charSequenceE);
                        }
                    } else if (i7 == 7) {
                        if (context == null && vz.d(context) && wf.c(wjVar7.a.n)) {
                            wjVar7.c();
                        } else {
                            i4 = i7;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i4);
                                }
                                charSequence = charSequenceE;
                                if (i4 == 5) {
                                    i5 = wjVar7.a.f;
                                    if (i5 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i4, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler10 = wjVar7.b;
                                        qd qdVar10 = new qd(wjVar7, i4, charSequence, 4, (byte[]) null);
                                        Context context11 = wjVar7.getContext();
                                        handler10.postDelayed(qdVar10, (context11 == null && vy.i(context11, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i4;
                                }
                                wjVar7.d(i4, charSequenceE);
                            }
                        }
                    } else if (i7 == 9) {
                        i7 = 9;
                        if (context == null) {
                            i4 = i7;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i4);
                                }
                                charSequence = charSequenceE;
                                if (i4 == 5) {
                                    i5 = wjVar7.a.f;
                                    if (i5 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i4, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler11 = wjVar7.b;
                                        qd qdVar11 = new qd(wjVar7, i4, charSequence, 4, (byte[]) null);
                                        Context context12 = wjVar7.getContext();
                                        handler11.postDelayed(qdVar11, (context12 == null && vy.i(context12, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i4;
                                }
                                wjVar7.d(i4, charSequenceE);
                            }
                        } else {
                            i4 = i7;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i4);
                                }
                                charSequence = charSequenceE;
                                if (i4 == 5) {
                                    i5 = wjVar7.a.f;
                                    if (i5 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i4, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler12 = wjVar7.b;
                                        qd qdVar12 = new qd(wjVar7, i4, charSequence, 4, (byte[]) null);
                                        Context context13 = wjVar7.getContext();
                                        handler12.postDelayed(qdVar12, (context13 == null && vy.i(context13, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i4;
                                }
                                wjVar7.d(i4, charSequenceE);
                            }
                        }
                    } else {
                        i4 = i7;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i4);
                            }
                            charSequence = charSequenceE;
                            if (i4 == 5) {
                                i5 = wjVar7.a.f;
                                if (i5 != 0) {
                                    wjVar7.e(5, charSequence);
                                } else {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i4, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler13 = wjVar7.b;
                                    qd qdVar13 = new qd(wjVar7, i4, charSequence, 4, (byte[]) null);
                                    Context context14 = wjVar7.getContext();
                                    handler13.postDelayed(qdVar13, (context14 == null && vy.i(context14, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i4;
                            }
                            wjVar7.d(i4, charSequenceE);
                        }
                    }
                    wjVar7.a.g(null);
                }
            }
        });
        wm wmVar3 = this.a;
        if (wmVar3.r == null) {
            wmVar3.r = new bop();
        }
        final int i4 = 3;
        wmVar3.r.c(this, new boq(this) { // from class: wd
            public final /* synthetic */ wj a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:71:0x0113 A[PHI: r0
              0x0113: PHI (r0v3 int) = (r0v2 int), (r0v6 int), (r0v6 int), (r0v6 int), (r0v2 int) binds: [B:59:0x00f2, B:65:0x00fc, B:67:0x0102, B:69:0x010c, B:63:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:73:0x011c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:74:0x011e  */
            /* JADX WARN: Code duplicated, block: B:77:0x0129  */
            /* JADX WARN: Code duplicated, block: B:79:0x012f A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:80:0x0131  */
            /* JADX WARN: Code duplicated, block: B:82:0x0138  */
            /* JADX WARN: Code duplicated, block: B:84:0x013e  */
            /* JADX WARN: Code duplicated, block: B:85:0x0142  */
            /* JADX WARN: Code duplicated, block: B:87:0x0156  */
            /* JADX WARN: Code duplicated, block: B:89:0x015e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0168 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:93:0x016a  */
            /* JADX WARN: Instruction removed from duplicated block: B:93:0x016a, please report this as an issue */
            @Override // defpackage.boq
            public final void a(Object obj) {
                int i5;
                CharSequence charSequenceE;
                CharSequence charSequence;
                int i6;
                int i7 = i4;
                if (i7 != 0) {
                    if (i7 == 1) {
                        if (((aami) obj) != null) {
                            wj wjVar = this.a;
                            wjVar.k();
                            wjVar.a.q(null);
                            return;
                        }
                        return;
                    }
                    if (i7 == 2) {
                        CharSequence charSequence2 = (CharSequence) obj;
                        if (charSequence2 != null) {
                            wj wjVar2 = this.a;
                            if (wjVar2.j()) {
                                wjVar2.f(charSequence2);
                            }
                            wjVar2.a.g(null);
                            return;
                        }
                        return;
                    }
                    if (i7 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar3 = this.a;
                            if (wjVar3.j()) {
                                wjVar3.f(wjVar3.getString(R.string.fingerprint_not_recognized));
                            }
                            wm wmVar4 = wjVar3.a;
                            if (wmVar4.h) {
                                wmVar4.f().execute(new mc(wjVar3, 12, null));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            wjVar3.a.h(false);
                            return;
                        }
                        return;
                    }
                    if (i7 == 4) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar4 = this.a;
                            if (wjVar4.i()) {
                                wjVar4.c();
                            } else {
                                CharSequence charSequenceB = wjVar4.a.b();
                                if (charSequenceB == null) {
                                    charSequenceB = wjVar4.getString(R.string.default_error_msg);
                                }
                                wjVar4.d(13, charSequenceB);
                                wjVar4.a(2);
                            }
                            wjVar4.a.m(false);
                            return;
                        }
                        return;
                    }
                    if (i7 != 5) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar5 = this.a;
                            wjVar5.a(1);
                            wjVar5.b();
                            wjVar5.a.i(false);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wj wjVar6 = this.a;
                        wjVar6.d(22, wjVar6.getString(R.string.content_view_more_options_button_clicked));
                        wjVar6.a(4);
                        wjVar6.a.l(false);
                        return;
                    }
                    return;
                }
                ws wsVar = (ws) obj;
                if (wsVar != null) {
                    int i8 = wsVar.a;
                    switch (i8) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 20:
                        case 22:
                            break;
                        case 6:
                        case 16:
                        case 17:
                        case 19:
                        default:
                            i8 = 8;
                            break;
                        case 18:
                        case 21:
                            i8 = 1;
                            break;
                    }
                    wj wjVar7 = this.a;
                    Context context = wjVar7.getContext();
                    if (Build.VERSION.SDK_INT >= 29) {
                        i5 = i8;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i5);
                            }
                            charSequence = charSequenceE;
                            if (i5 == 5) {
                                i6 = wjVar7.a.f;
                                if (i6 != 0 || i6 == 3) {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i5, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler13 = wjVar7.b;
                                    qd qdVar13 = new qd(wjVar7, i5, charSequence, 4, (byte[]) null);
                                    Context context14 = wjVar7.getContext();
                                    handler13.postDelayed(qdVar13, (context14 == null && vy.i(context14, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i5;
                            }
                            wjVar7.d(i5, charSequenceE);
                        }
                    } else if (i8 == 7) {
                        if (context == null && vz.d(context) && wf.c(wjVar7.a.n)) {
                            wjVar7.c();
                        } else {
                            i5 = i8;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i5);
                                }
                                charSequence = charSequenceE;
                                if (i5 == 5) {
                                    i6 = wjVar7.a.f;
                                    if (i6 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i5, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler14 = wjVar7.b;
                                        qd qdVar14 = new qd(wjVar7, i5, charSequence, 4, (byte[]) null);
                                        Context context15 = wjVar7.getContext();
                                        handler14.postDelayed(qdVar14, (context15 == null && vy.i(context15, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i5;
                                }
                                wjVar7.d(i5, charSequenceE);
                            }
                        }
                    } else if (i8 == 9) {
                        i8 = 9;
                        if (context == null) {
                            i5 = i8;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i5);
                                }
                                charSequence = charSequenceE;
                                if (i5 == 5) {
                                    i6 = wjVar7.a.f;
                                    if (i6 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i5, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler15 = wjVar7.b;
                                        qd qdVar15 = new qd(wjVar7, i5, charSequence, 4, (byte[]) null);
                                        Context context16 = wjVar7.getContext();
                                        handler15.postDelayed(qdVar15, (context16 == null && vy.i(context16, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i5;
                                }
                                wjVar7.d(i5, charSequenceE);
                            }
                        } else {
                            i5 = i8;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i5);
                                }
                                charSequence = charSequenceE;
                                if (i5 == 5) {
                                    i6 = wjVar7.a.f;
                                    if (i6 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i5, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler16 = wjVar7.b;
                                        qd qdVar16 = new qd(wjVar7, i5, charSequence, 4, (byte[]) null);
                                        Context context17 = wjVar7.getContext();
                                        handler16.postDelayed(qdVar16, (context17 == null && vy.i(context17, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i5;
                                }
                                wjVar7.d(i5, charSequenceE);
                            }
                        }
                    } else {
                        i5 = i8;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i5);
                            }
                            charSequence = charSequenceE;
                            if (i5 == 5) {
                                i6 = wjVar7.a.f;
                                if (i6 != 0) {
                                    wjVar7.e(5, charSequence);
                                } else {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i5, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler17 = wjVar7.b;
                                    qd qdVar17 = new qd(wjVar7, i5, charSequence, 4, (byte[]) null);
                                    Context context18 = wjVar7.getContext();
                                    handler17.postDelayed(qdVar17, (context18 == null && vy.i(context18, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i5;
                            }
                            wjVar7.d(i5, charSequenceE);
                        }
                    }
                    wjVar7.a.g(null);
                }
            }
        });
        wm wmVar4 = this.a;
        if (wmVar4.s == null) {
            wmVar4.s = new bop();
        }
        final int i5 = 4;
        wmVar4.s.c(this, new boq(this) { // from class: wd
            public final /* synthetic */ wj a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:71:0x0113 A[PHI: r0
              0x0113: PHI (r0v3 int) = (r0v2 int), (r0v6 int), (r0v6 int), (r0v6 int), (r0v2 int) binds: [B:59:0x00f2, B:65:0x00fc, B:67:0x0102, B:69:0x010c, B:63:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:73:0x011c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:74:0x011e  */
            /* JADX WARN: Code duplicated, block: B:77:0x0129  */
            /* JADX WARN: Code duplicated, block: B:79:0x012f A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:80:0x0131  */
            /* JADX WARN: Code duplicated, block: B:82:0x0138  */
            /* JADX WARN: Code duplicated, block: B:84:0x013e  */
            /* JADX WARN: Code duplicated, block: B:85:0x0142  */
            /* JADX WARN: Code duplicated, block: B:87:0x0156  */
            /* JADX WARN: Code duplicated, block: B:89:0x015e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0168 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:93:0x016a  */
            /* JADX WARN: Instruction removed from duplicated block: B:93:0x016a, please report this as an issue */
            @Override // defpackage.boq
            public final void a(Object obj) {
                int i6;
                CharSequence charSequenceE;
                CharSequence charSequence;
                int i7;
                int i8 = i5;
                if (i8 != 0) {
                    if (i8 == 1) {
                        if (((aami) obj) != null) {
                            wj wjVar = this.a;
                            wjVar.k();
                            wjVar.a.q(null);
                            return;
                        }
                        return;
                    }
                    if (i8 == 2) {
                        CharSequence charSequence2 = (CharSequence) obj;
                        if (charSequence2 != null) {
                            wj wjVar2 = this.a;
                            if (wjVar2.j()) {
                                wjVar2.f(charSequence2);
                            }
                            wjVar2.a.g(null);
                            return;
                        }
                        return;
                    }
                    if (i8 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar3 = this.a;
                            if (wjVar3.j()) {
                                wjVar3.f(wjVar3.getString(R.string.fingerprint_not_recognized));
                            }
                            wm wmVar5 = wjVar3.a;
                            if (wmVar5.h) {
                                wmVar5.f().execute(new mc(wjVar3, 12, null));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            wjVar3.a.h(false);
                            return;
                        }
                        return;
                    }
                    if (i8 == 4) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar4 = this.a;
                            if (wjVar4.i()) {
                                wjVar4.c();
                            } else {
                                CharSequence charSequenceB = wjVar4.a.b();
                                if (charSequenceB == null) {
                                    charSequenceB = wjVar4.getString(R.string.default_error_msg);
                                }
                                wjVar4.d(13, charSequenceB);
                                wjVar4.a(2);
                            }
                            wjVar4.a.m(false);
                            return;
                        }
                        return;
                    }
                    if (i8 != 5) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar5 = this.a;
                            wjVar5.a(1);
                            wjVar5.b();
                            wjVar5.a.i(false);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wj wjVar6 = this.a;
                        wjVar6.d(22, wjVar6.getString(R.string.content_view_more_options_button_clicked));
                        wjVar6.a(4);
                        wjVar6.a.l(false);
                        return;
                    }
                    return;
                }
                ws wsVar = (ws) obj;
                if (wsVar != null) {
                    int i9 = wsVar.a;
                    switch (i9) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 20:
                        case 22:
                            break;
                        case 6:
                        case 16:
                        case 17:
                        case 19:
                        default:
                            i9 = 8;
                            break;
                        case 18:
                        case 21:
                            i9 = 1;
                            break;
                    }
                    wj wjVar7 = this.a;
                    Context context = wjVar7.getContext();
                    if (Build.VERSION.SDK_INT >= 29) {
                        i6 = i9;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i6);
                            }
                            charSequence = charSequenceE;
                            if (i6 == 5) {
                                i7 = wjVar7.a.f;
                                if (i7 != 0 || i7 == 3) {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i6, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler17 = wjVar7.b;
                                    qd qdVar17 = new qd(wjVar7, i6, charSequence, 4, (byte[]) null);
                                    Context context18 = wjVar7.getContext();
                                    handler17.postDelayed(qdVar17, (context18 == null && vy.i(context18, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i6;
                            }
                            wjVar7.d(i6, charSequenceE);
                        }
                    } else if (i9 == 7) {
                        if (context == null && vz.d(context) && wf.c(wjVar7.a.n)) {
                            wjVar7.c();
                        } else {
                            i6 = i9;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i6);
                                }
                                charSequence = charSequenceE;
                                if (i6 == 5) {
                                    i7 = wjVar7.a.f;
                                    if (i7 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i6, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler18 = wjVar7.b;
                                        qd qdVar18 = new qd(wjVar7, i6, charSequence, 4, (byte[]) null);
                                        Context context19 = wjVar7.getContext();
                                        handler18.postDelayed(qdVar18, (context19 == null && vy.i(context19, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i6;
                                }
                                wjVar7.d(i6, charSequenceE);
                            }
                        }
                    } else if (i9 == 9) {
                        i9 = 9;
                        if (context == null) {
                            i6 = i9;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i6);
                                }
                                charSequence = charSequenceE;
                                if (i6 == 5) {
                                    i7 = wjVar7.a.f;
                                    if (i7 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i6, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler19 = wjVar7.b;
                                        qd qdVar19 = new qd(wjVar7, i6, charSequence, 4, (byte[]) null);
                                        Context context110 = wjVar7.getContext();
                                        handler19.postDelayed(qdVar19, (context110 == null && vy.i(context110, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i6;
                                }
                                wjVar7.d(i6, charSequenceE);
                            }
                        } else {
                            i6 = i9;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i6);
                                }
                                charSequence = charSequenceE;
                                if (i6 == 5) {
                                    i7 = wjVar7.a.f;
                                    if (i7 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i6, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler110 = wjVar7.b;
                                        qd qdVar110 = new qd(wjVar7, i6, charSequence, 4, (byte[]) null);
                                        Context context111 = wjVar7.getContext();
                                        handler110.postDelayed(qdVar110, (context111 == null && vy.i(context111, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i6;
                                }
                                wjVar7.d(i6, charSequenceE);
                            }
                        }
                    } else {
                        i6 = i9;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i6);
                            }
                            charSequence = charSequenceE;
                            if (i6 == 5) {
                                i7 = wjVar7.a.f;
                                if (i7 != 0) {
                                    wjVar7.e(5, charSequence);
                                } else {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i6, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler111 = wjVar7.b;
                                    qd qdVar111 = new qd(wjVar7, i6, charSequence, 4, (byte[]) null);
                                    Context context112 = wjVar7.getContext();
                                    handler111.postDelayed(qdVar111, (context112 == null && vy.i(context112, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i6;
                            }
                            wjVar7.d(i6, charSequenceE);
                        }
                    }
                    wjVar7.a.g(null);
                }
            }
        });
        wm wmVar5 = this.a;
        if (wmVar5.t == null) {
            wmVar5.t = new bop();
        }
        final int i6 = 5;
        wmVar5.t.c(this, new boq(this) { // from class: wd
            public final /* synthetic */ wj a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:71:0x0113 A[PHI: r0
              0x0113: PHI (r0v3 int) = (r0v2 int), (r0v6 int), (r0v6 int), (r0v6 int), (r0v2 int) binds: [B:59:0x00f2, B:65:0x00fc, B:67:0x0102, B:69:0x010c, B:63:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:73:0x011c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:74:0x011e  */
            /* JADX WARN: Code duplicated, block: B:77:0x0129  */
            /* JADX WARN: Code duplicated, block: B:79:0x012f A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:80:0x0131  */
            /* JADX WARN: Code duplicated, block: B:82:0x0138  */
            /* JADX WARN: Code duplicated, block: B:84:0x013e  */
            /* JADX WARN: Code duplicated, block: B:85:0x0142  */
            /* JADX WARN: Code duplicated, block: B:87:0x0156  */
            /* JADX WARN: Code duplicated, block: B:89:0x015e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0168 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:93:0x016a  */
            /* JADX WARN: Instruction removed from duplicated block: B:93:0x016a, please report this as an issue */
            @Override // defpackage.boq
            public final void a(Object obj) {
                int i7;
                CharSequence charSequenceE;
                CharSequence charSequence;
                int i8;
                int i9 = i6;
                if (i9 != 0) {
                    if (i9 == 1) {
                        if (((aami) obj) != null) {
                            wj wjVar = this.a;
                            wjVar.k();
                            wjVar.a.q(null);
                            return;
                        }
                        return;
                    }
                    if (i9 == 2) {
                        CharSequence charSequence2 = (CharSequence) obj;
                        if (charSequence2 != null) {
                            wj wjVar2 = this.a;
                            if (wjVar2.j()) {
                                wjVar2.f(charSequence2);
                            }
                            wjVar2.a.g(null);
                            return;
                        }
                        return;
                    }
                    if (i9 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar3 = this.a;
                            if (wjVar3.j()) {
                                wjVar3.f(wjVar3.getString(R.string.fingerprint_not_recognized));
                            }
                            wm wmVar6 = wjVar3.a;
                            if (wmVar6.h) {
                                wmVar6.f().execute(new mc(wjVar3, 12, null));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            wjVar3.a.h(false);
                            return;
                        }
                        return;
                    }
                    if (i9 == 4) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar4 = this.a;
                            if (wjVar4.i()) {
                                wjVar4.c();
                            } else {
                                CharSequence charSequenceB = wjVar4.a.b();
                                if (charSequenceB == null) {
                                    charSequenceB = wjVar4.getString(R.string.default_error_msg);
                                }
                                wjVar4.d(13, charSequenceB);
                                wjVar4.a(2);
                            }
                            wjVar4.a.m(false);
                            return;
                        }
                        return;
                    }
                    if (i9 != 5) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar5 = this.a;
                            wjVar5.a(1);
                            wjVar5.b();
                            wjVar5.a.i(false);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wj wjVar6 = this.a;
                        wjVar6.d(22, wjVar6.getString(R.string.content_view_more_options_button_clicked));
                        wjVar6.a(4);
                        wjVar6.a.l(false);
                        return;
                    }
                    return;
                }
                ws wsVar = (ws) obj;
                if (wsVar != null) {
                    int i10 = wsVar.a;
                    switch (i10) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 20:
                        case 22:
                            break;
                        case 6:
                        case 16:
                        case 17:
                        case 19:
                        default:
                            i10 = 8;
                            break;
                        case 18:
                        case 21:
                            i10 = 1;
                            break;
                    }
                    wj wjVar7 = this.a;
                    Context context = wjVar7.getContext();
                    if (Build.VERSION.SDK_INT >= 29) {
                        i7 = i10;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i7);
                            }
                            charSequence = charSequenceE;
                            if (i7 == 5) {
                                i8 = wjVar7.a.f;
                                if (i8 != 0 || i8 == 3) {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i7, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler111 = wjVar7.b;
                                    qd qdVar111 = new qd(wjVar7, i7, charSequence, 4, (byte[]) null);
                                    Context context112 = wjVar7.getContext();
                                    handler111.postDelayed(qdVar111, (context112 == null && vy.i(context112, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i7;
                            }
                            wjVar7.d(i7, charSequenceE);
                        }
                    } else if (i10 == 7) {
                        if (context == null && vz.d(context) && wf.c(wjVar7.a.n)) {
                            wjVar7.c();
                        } else {
                            i7 = i10;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i7);
                                }
                                charSequence = charSequenceE;
                                if (i7 == 5) {
                                    i8 = wjVar7.a.f;
                                    if (i8 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i7, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler112 = wjVar7.b;
                                        qd qdVar112 = new qd(wjVar7, i7, charSequence, 4, (byte[]) null);
                                        Context context113 = wjVar7.getContext();
                                        handler112.postDelayed(qdVar112, (context113 == null && vy.i(context113, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i7;
                                }
                                wjVar7.d(i7, charSequenceE);
                            }
                        }
                    } else if (i10 == 9) {
                        i10 = 9;
                        if (context == null) {
                            i7 = i10;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i7);
                                }
                                charSequence = charSequenceE;
                                if (i7 == 5) {
                                    i8 = wjVar7.a.f;
                                    if (i8 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i7, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler113 = wjVar7.b;
                                        qd qdVar113 = new qd(wjVar7, i7, charSequence, 4, (byte[]) null);
                                        Context context114 = wjVar7.getContext();
                                        handler113.postDelayed(qdVar113, (context114 == null && vy.i(context114, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i7;
                                }
                                wjVar7.d(i7, charSequenceE);
                            }
                        } else {
                            i7 = i10;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i7);
                                }
                                charSequence = charSequenceE;
                                if (i7 == 5) {
                                    i8 = wjVar7.a.f;
                                    if (i8 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i7, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler114 = wjVar7.b;
                                        qd qdVar114 = new qd(wjVar7, i7, charSequence, 4, (byte[]) null);
                                        Context context115 = wjVar7.getContext();
                                        handler114.postDelayed(qdVar114, (context115 == null && vy.i(context115, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i7;
                                }
                                wjVar7.d(i7, charSequenceE);
                            }
                        }
                    } else {
                        i7 = i10;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i7);
                            }
                            charSequence = charSequenceE;
                            if (i7 == 5) {
                                i8 = wjVar7.a.f;
                                if (i8 != 0) {
                                    wjVar7.e(5, charSequence);
                                } else {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i7, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler115 = wjVar7.b;
                                    qd qdVar115 = new qd(wjVar7, i7, charSequence, 4, (byte[]) null);
                                    Context context116 = wjVar7.getContext();
                                    handler115.postDelayed(qdVar115, (context116 == null && vy.i(context116, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i7;
                            }
                            wjVar7.d(i7, charSequenceE);
                        }
                    }
                    wjVar7.a.g(null);
                }
            }
        });
        wm wmVar6 = this.a;
        if (wmVar6.v == null) {
            wmVar6.v = new bop();
        }
        final int i7 = 6;
        wmVar6.v.c(this, new boq(this) { // from class: wd
            public final /* synthetic */ wj a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:71:0x0113 A[PHI: r0
              0x0113: PHI (r0v3 int) = (r0v2 int), (r0v6 int), (r0v6 int), (r0v6 int), (r0v2 int) binds: [B:59:0x00f2, B:65:0x00fc, B:67:0x0102, B:69:0x010c, B:63:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:73:0x011c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:74:0x011e  */
            /* JADX WARN: Code duplicated, block: B:77:0x0129  */
            /* JADX WARN: Code duplicated, block: B:79:0x012f A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:80:0x0131  */
            /* JADX WARN: Code duplicated, block: B:82:0x0138  */
            /* JADX WARN: Code duplicated, block: B:84:0x013e  */
            /* JADX WARN: Code duplicated, block: B:85:0x0142  */
            /* JADX WARN: Code duplicated, block: B:87:0x0156  */
            /* JADX WARN: Code duplicated, block: B:89:0x015e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0168 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:93:0x016a  */
            /* JADX WARN: Instruction removed from duplicated block: B:93:0x016a, please report this as an issue */
            @Override // defpackage.boq
            public final void a(Object obj) {
                int i8;
                CharSequence charSequenceE;
                CharSequence charSequence;
                int i9;
                int i10 = i7;
                if (i10 != 0) {
                    if (i10 == 1) {
                        if (((aami) obj) != null) {
                            wj wjVar = this.a;
                            wjVar.k();
                            wjVar.a.q(null);
                            return;
                        }
                        return;
                    }
                    if (i10 == 2) {
                        CharSequence charSequence2 = (CharSequence) obj;
                        if (charSequence2 != null) {
                            wj wjVar2 = this.a;
                            if (wjVar2.j()) {
                                wjVar2.f(charSequence2);
                            }
                            wjVar2.a.g(null);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar3 = this.a;
                            if (wjVar3.j()) {
                                wjVar3.f(wjVar3.getString(R.string.fingerprint_not_recognized));
                            }
                            wm wmVar7 = wjVar3.a;
                            if (wmVar7.h) {
                                wmVar7.f().execute(new mc(wjVar3, 12, null));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            wjVar3.a.h(false);
                            return;
                        }
                        return;
                    }
                    if (i10 == 4) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar4 = this.a;
                            if (wjVar4.i()) {
                                wjVar4.c();
                            } else {
                                CharSequence charSequenceB = wjVar4.a.b();
                                if (charSequenceB == null) {
                                    charSequenceB = wjVar4.getString(R.string.default_error_msg);
                                }
                                wjVar4.d(13, charSequenceB);
                                wjVar4.a(2);
                            }
                            wjVar4.a.m(false);
                            return;
                        }
                        return;
                    }
                    if (i10 != 5) {
                        if (((Boolean) obj).booleanValue()) {
                            wj wjVar5 = this.a;
                            wjVar5.a(1);
                            wjVar5.b();
                            wjVar5.a.i(false);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wj wjVar6 = this.a;
                        wjVar6.d(22, wjVar6.getString(R.string.content_view_more_options_button_clicked));
                        wjVar6.a(4);
                        wjVar6.a.l(false);
                        return;
                    }
                    return;
                }
                ws wsVar = (ws) obj;
                if (wsVar != null) {
                    int i11 = wsVar.a;
                    switch (i11) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 20:
                        case 22:
                            break;
                        case 6:
                        case 16:
                        case 17:
                        case 19:
                        default:
                            i11 = 8;
                            break;
                        case 18:
                        case 21:
                            i11 = 1;
                            break;
                    }
                    wj wjVar7 = this.a;
                    Context context = wjVar7.getContext();
                    if (Build.VERSION.SDK_INT >= 29) {
                        i8 = i11;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i8);
                            }
                            charSequence = charSequenceE;
                            if (i8 == 5) {
                                i9 = wjVar7.a.f;
                                if (i9 != 0 || i9 == 3) {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i8, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler115 = wjVar7.b;
                                    qd qdVar115 = new qd(wjVar7, i8, charSequence, 4, (byte[]) null);
                                    Context context116 = wjVar7.getContext();
                                    handler115.postDelayed(qdVar115, (context116 == null && vy.i(context116, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i8;
                            }
                            wjVar7.d(i8, charSequenceE);
                        }
                    } else if (i11 == 7) {
                        if (context == null && vz.d(context) && wf.c(wjVar7.a.n)) {
                            wjVar7.c();
                        } else {
                            i8 = i11;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i8);
                                }
                                charSequence = charSequenceE;
                                if (i8 == 5) {
                                    i9 = wjVar7.a.f;
                                    if (i9 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i8, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler116 = wjVar7.b;
                                        qd qdVar116 = new qd(wjVar7, i8, charSequence, 4, (byte[]) null);
                                        Context context117 = wjVar7.getContext();
                                        handler116.postDelayed(qdVar116, (context117 == null && vy.i(context117, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i8;
                                }
                                wjVar7.d(i8, charSequenceE);
                            }
                        }
                    } else if (i11 == 9) {
                        i11 = 9;
                        if (context == null) {
                            i8 = i11;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i8);
                                }
                                charSequence = charSequenceE;
                                if (i8 == 5) {
                                    i9 = wjVar7.a.f;
                                    if (i9 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i8, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler117 = wjVar7.b;
                                        qd qdVar117 = new qd(wjVar7, i8, charSequence, 4, (byte[]) null);
                                        Context context118 = wjVar7.getContext();
                                        handler117.postDelayed(qdVar117, (context118 == null && vy.i(context118, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i8;
                                }
                                wjVar7.d(i8, charSequenceE);
                            }
                        } else {
                            i8 = i11;
                            charSequenceE = wsVar.b;
                            if (wjVar7.j()) {
                                if (charSequenceE == null) {
                                    charSequenceE = vz.e(wjVar7.getContext(), i8);
                                }
                                charSequence = charSequenceE;
                                if (i8 == 5) {
                                    i9 = wjVar7.a.f;
                                    if (i9 != 0) {
                                        wjVar7.e(5, charSequence);
                                    } else {
                                        wjVar7.e(5, charSequence);
                                    }
                                    wjVar7.b();
                                } else {
                                    if (wjVar7.a.u) {
                                        wjVar7.d(i8, charSequence);
                                    } else {
                                        wjVar7.f(charSequence);
                                        Handler handler118 = wjVar7.b;
                                        qd qdVar118 = new qd(wjVar7, i8, charSequence, 4, (byte[]) null);
                                        Context context119 = wjVar7.getContext();
                                        handler118.postDelayed(qdVar118, (context119 == null && vy.i(context119, Build.MODEL)) ? 0 : 2000);
                                    }
                                    wjVar7.a.u = true;
                                }
                            } else {
                                if (charSequenceE == null) {
                                    charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i8;
                                }
                                wjVar7.d(i8, charSequenceE);
                            }
                        }
                    } else {
                        i8 = i11;
                        charSequenceE = wsVar.b;
                        if (wjVar7.j()) {
                            if (charSequenceE == null) {
                                charSequenceE = vz.e(wjVar7.getContext(), i8);
                            }
                            charSequence = charSequenceE;
                            if (i8 == 5) {
                                i9 = wjVar7.a.f;
                                if (i9 != 0) {
                                    wjVar7.e(5, charSequence);
                                } else {
                                    wjVar7.e(5, charSequence);
                                }
                                wjVar7.b();
                            } else {
                                if (wjVar7.a.u) {
                                    wjVar7.d(i8, charSequence);
                                } else {
                                    wjVar7.f(charSequence);
                                    Handler handler119 = wjVar7.b;
                                    qd qdVar119 = new qd(wjVar7, i8, charSequence, 4, (byte[]) null);
                                    Context context1110 = wjVar7.getContext();
                                    handler119.postDelayed(qdVar119, (context1110 == null && vy.i(context1110, Build.MODEL)) ? 0 : 2000);
                                }
                                wjVar7.a.u = true;
                            }
                        } else {
                            if (charSequenceE == null) {
                                charSequenceE = wjVar7.getString(R.string.default_error_msg) + ' ' + i8;
                            }
                            wjVar7.d(i8, charSequenceE);
                        }
                    }
                    wjVar7.a.g(null);
                }
            }
        });
    }

    @Override // defpackage.cc
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29) {
            wm wmVar = this.a;
            if (wf.c(wmVar.n)) {
                wmVar.k = true;
                this.b.postDelayed(new wi(wmVar, 2, null), 250L);
            }
        }
    }

    @Override // defpackage.cc
    public final void onStop() {
        super.onStop();
        wm wmVar = this.a;
        if (!wmVar.g || wmVar.i) {
            return;
        }
        cf activity = getActivity();
        if (isRemoving()) {
            if (activity == null || !activity.isChangingConfigurations()) {
                a(0);
            }
        }
    }
}
