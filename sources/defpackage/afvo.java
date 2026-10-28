package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import internal.org.jni_zero.JniZero;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afvo implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ afvq a;
    final /* synthetic */ Application.ActivityLifecycleCallbacks b;

    public afvo(afvq afvqVar, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.a = afvqVar;
        this.b = activityLifecycleCallbacks;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws IOException {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityCreated"), 182);
        try {
            activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            afunVarD.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afunVarD.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityDestroyed(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityDestroyed"), 183);
        try {
            activityLifecycleCallbacks.onActivityDestroyed(activity);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPaused(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPaused"), 184);
        try {
            activityLifecycleCallbacks.onActivityPaused(activity);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) throws IOException {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPostCreated(activity, bundle);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPostCreated"), 185);
        try {
            activityLifecycleCallbacks.onActivityPostCreated(activity, bundle);
            afunVarD.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afunVarD.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPostDestroyed(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPostDestroyed"), 186);
        try {
            activityLifecycleCallbacks.onActivityPostDestroyed(activity);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPostPaused(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPostPaused"), 187);
        try {
            activityLifecycleCallbacks.onActivityPostPaused(activity);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) throws IOException {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPostResumed(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPostResumed"), 188);
        try {
            activityLifecycleCallbacks.onActivityPostResumed(activity);
            afunVarD.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afunVarD.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPostSaveInstanceState(activity, bundle);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPostSaveInstanceState"), 189);
        try {
            activityLifecycleCallbacks.onActivityPostSaveInstanceState(activity, bundle);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) throws IOException {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPostStarted(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStarted"), 190);
        try {
            activityLifecycleCallbacks.onActivityPostStarted(activity);
            afunVarD.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afunVarD.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPostStopped(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStopped"), 191);
        try {
            activityLifecycleCallbacks.onActivityPostStopped(activity);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) throws IOException {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPreCreated(activity, bundle);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPreCreated"), 192);
        try {
            activityLifecycleCallbacks.onActivityPreCreated(activity, bundle);
            afunVarD.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afunVarD.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPreDestroyed(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPreDestroyed"), 193);
        try {
            activityLifecycleCallbacks.onActivityPreDestroyed(activity);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPrePaused(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPrePaused"), 194);
        try {
            activityLifecycleCallbacks.onActivityPrePaused(activity);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) throws IOException {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPreResumed(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPreResumed"), 195);
        try {
            activityLifecycleCallbacks.onActivityPreResumed(activity);
            afunVarD.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afunVarD.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPreSaveInstanceState(activity, bundle);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPreSaveInstanceState"), 196);
        try {
            activityLifecycleCallbacks.onActivityPreSaveInstanceState(activity, bundle);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) throws IOException {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPreStarted(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStarted"), 197);
        try {
            activityLifecycleCallbacks.onActivityPreStarted(activity);
            afunVarD.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afunVarD.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityPreStopped(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStopped"), 198);
        try {
            activityLifecycleCallbacks.onActivityPreStopped(activity);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) throws IOException {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityResumed(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityResumed"), 199);
        try {
            activityLifecycleCallbacks.onActivityResumed(activity);
            afunVarD.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afunVarD.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivitySaveInstanceState"), 200);
        try {
            activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) throws IOException {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityStarted(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityStarted"), 201);
        try {
            activityLifecycleCallbacks.onActivityStarted(activity);
            afunVarD.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afunVarD.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!ahno.aD()) {
            activityLifecycleCallbacks.onActivityStopped(activity);
            return;
        }
        afun afunVarD = this.a.d(String.valueOf(activity.getClass().getName()).concat("#onActivityStopped"), 202);
        try {
            activityLifecycleCallbacks.onActivityStopped(activity);
            JniZero.l(afunVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afunVarD, th);
                throw th2;
            }
        }
    }
}
