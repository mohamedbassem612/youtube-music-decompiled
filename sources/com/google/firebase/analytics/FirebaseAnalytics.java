package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import defpackage.ahnr;
import defpackage.ahnx;
import defpackage.ahrv;
import defpackage.ahrw;
import defpackage.kzv;
import defpackage.laa;
import defpackage.lab;
import defpackage.lay;
import defpackage.les;
import defpackage.mda;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics b;
    public final lay a;

    public FirebaseAnalytics(lay layVar) {
        if (layVar == null) {
            throw new NullPointerException("null reference");
        }
        this.a = layVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (b == null) {
                    b = new FirebaseAnalytics(lay.c(context, null));
                }
            }
        }
        return b;
    }

    public static les getScionFrontendApiImplementation(Context context, Bundle bundle) {
        lay layVarC = lay.c(context, bundle);
        if (layVarC == null) {
            return null;
        }
        return new ahnx(layVarC);
    }

    public final void a(boolean z) {
        lay layVar = this.a;
        layVar.i(new lab(layVar, Boolean.valueOf(z)));
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = ahrv.a;
            return (String) mda.o(((ahrv) ahnr.b().f(ahrw.class)).a(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        lay layVar = this.a;
        layVar.i(new laa(layVar, kzv.a(activity), str, str2));
    }
}
