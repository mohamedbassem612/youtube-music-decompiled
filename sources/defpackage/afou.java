package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import internal.org.jni_zero.JniZero;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class afou extends cc implements afvj, afpd {
    private final AtomicBoolean a;
    protected final afts b;
    public final boh c;

    public afou() {
        qpj.c();
        this.b = new afts(this);
        this.c = new boh(this);
        this.a = new AtomicBoolean(false);
    }

    private static final boolean a(Intent intent, Context context) {
        String str = intent.getPackage();
        if (str != null) {
            if (str.equals(context != null ? context.getPackageName() : null)) {
                return true;
            }
        }
        return false;
    }

    protected final void f(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
    }

    protected final void g() {
        super.onDestroy();
    }

    @Override // defpackage.afvj
    public final afwn getAnimationRef() {
        return (afwn) this.b.c;
    }

    @Override // defpackage.afpd
    public final Locale getCustomLocale() {
        return aguu.au(this);
    }

    @Override // defpackage.cc, defpackage.bog
    public final boc getLifecycle() {
        return this.c;
    }

    protected final void h() {
        super.onDestroyView();
    }

    protected final void i() {
        super.onDetach();
    }

    protected final void j() {
        super.onPause();
    }

    protected final void k() {
        super.onResume();
    }

    protected final void l() {
        super.onStart();
    }

    protected final void m() {
        super.onStop();
    }

    protected final void n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        this.b.d();
        try {
            super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
            afty.k();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afty.k();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    public final void onActivityResult(int i, int i2, Intent intent) {
        afvn afvnVarA = this.b.a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            JniZero.l(afvnVarA, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afvnVarA, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    public void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        bpp parentFragment = getParentFragment();
        if (parentFragment instanceof afvj) {
            afts aftsVar = this.b;
            if (aftsVar.c == null) {
                aftsVar.g(((afvj) parentFragment).getAnimationRef(), true);
            }
        }
        afts aftsVar2 = this.b;
        cc ccVar = (cc) aftsVar2.b;
        ccVar.getChildFragmentManager().n(new afvp(((aftr) aguu.av(ccVar.getContext(), aftr.class)).as()));
        if (this.a.compareAndSet(false, true)) {
            super.getLifecycle().b(new afox(aftsVar2, this.c));
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.b.d();
        try {
            super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
            afty.k();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afty.k();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        JniZero.l(this.b.h(i, i2), null);
        return null;
    }

    @Override // defpackage.cc
    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        JniZero.l(this.b.h(i, i2), null);
        return null;
    }

    @Override // defpackage.cc
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        this.b.d();
        try {
            View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            afty.k();
            return viewOnCreateView;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afty.k();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    public void onDestroy() {
        afvn afvnVarC = this.b.c();
        try {
            super.onDestroy();
            JniZero.l(afvnVarC, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afvnVarC, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    public void onDestroyView() {
        afvn afvnVarC = this.b.c();
        try {
            super.onDestroyView();
            JniZero.l(afvnVarC, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afvnVarC, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    public void onDetach() {
        afvn afvnVarB = this.b.b();
        try {
            super.onDetach();
            JniZero.l(afvnVarB, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afvnVarB, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        JniZero.l(this.b.a("Fragment:onOptionsItemSelected"), null);
        return false;
    }

    @Override // defpackage.cc
    public void onPause() {
        afvn afvnVarD = this.b.d();
        try {
            super.onPause();
            JniZero.l(afvnVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afvnVarD, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    public void onResume() throws IOException {
        afvn afvnVarC = this.b.c();
        try {
            super.onResume();
            afvnVarC.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afvnVarC.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        bundle.getClass();
        JniZero.l(this.b.d(), null);
    }

    @Override // defpackage.cc
    public void onStart() {
        this.b.d();
        try {
            super.onStart();
            afty.k();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afty.k();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    public void onStop() {
        afvn afvnVarD = this.b.d();
        try {
            super.onStop();
            JniZero.l(afvnVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afvnVarD, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        JniZero.l(this.b.d(), null);
    }

    @Override // defpackage.afvj
    public final void setAnimationRef(afwn afwnVar, boolean z) {
        this.b.g(afwnVar, z);
    }

    @Override // defpackage.afvj
    public final void setBackPressRef(afwn afwnVar) {
        this.b.d = afwnVar;
    }

    @Override // defpackage.cc
    public final void setEnterTransition(Object obj) {
        this.b.f(obj != null);
        super.setEnterTransition(obj);
    }

    @Override // defpackage.cc
    public final void setExitTransition(Object obj) {
        this.b.f(obj != null);
        super.setExitTransition(obj);
    }

    @Override // defpackage.cc
    public final void setReenterTransition(Object obj) {
        this.b.f(obj != null);
        super.setReenterTransition(obj);
    }

    @Override // defpackage.cc
    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.cc
    public final void setReturnTransition(Object obj) {
        this.b.f(obj != null);
        super.setReturnTransition(obj);
    }

    @Override // defpackage.cc
    public final void setSharedElementEnterTransition(Object obj) {
        this.b.f(obj != null);
        super.setSharedElementEnterTransition(obj);
    }

    @Override // defpackage.cc
    public final void setSharedElementReturnTransition(Object obj) {
        this.b.f(obj != null);
        super.setSharedElementReturnTransition(obj);
    }

    @Override // defpackage.cc
    public final void startActivity(Intent intent) {
        intent.getClass();
        Context context = getContext();
        if (a(intent, context != null ? context.getApplicationContext() : null)) {
            afwl.l(intent);
        }
        super.startActivity(intent);
    }

    @Override // defpackage.cc
    public final void startActivity(Intent intent, Bundle bundle) {
        intent.getClass();
        Context context = getContext();
        if (a(intent, context != null ? context.getApplicationContext() : null)) {
            afwl.l(intent);
        }
        super.startActivity(intent, bundle);
    }
}
