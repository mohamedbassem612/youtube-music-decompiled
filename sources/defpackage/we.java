package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.car.app.SessionInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class we {
    static BiometricPrompt.Builder a(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    static BiometricPrompt b(BiometricPrompt.Builder builder) {
        return builder.build();
    }

    static void c(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }

    static void d(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }

    static void e(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    static void f(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static SessionInfo j(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("Expected the SessionInfo to be encoded in the bind intent extras, but the extras were null.");
        }
        Bundle bundle = extras.getBundle("androidx.car.app.extra.SESSION_INFO_BUNDLE");
        return new SessionInfo(bundle.getInt("display-type"), bundle.getString("session-id"));
    }

    public static boolean k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey("androidx.car.app.extra.SESSION_INFO_BUNDLE");
    }

    public static boolean l(Context context) {
        return (context == null || context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) ? false : true;
    }

    public static ListenableFuture m(awuz awuzVar) {
        return ape.f(new dzx(awuzVar, 1));
    }

    public static Object n(Context context, awqg awqgVar) {
        try {
            return awqgVar.invoke(context);
        } catch (NoClassDefFoundError unused) {
            p();
            return null;
        }
    }

    public static int o() {
        if (Build.VERSION.SDK_INT >= 33) {
            return dlp.a.a();
        }
        return 0;
    }

    public static int p() {
        if (Build.VERSION.SDK_INT == 31 || Build.VERSION.SDK_INT == 32) {
            return dlo.a.a();
        }
        return 0;
    }

    public void i() {
    }

    public void q(aami aamiVar) {
    }

    public void h(int i, CharSequence charSequence) {
    }
}
