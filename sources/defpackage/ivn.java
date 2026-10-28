package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.signin.OnboardingVideoView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ivn extends ivk implements zws, xgm {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/signin/SignInFragment");
    private View A;
    private boolean B;
    public avmb b;
    public hex c;
    public ttm d;
    public zwb e;
    public xgn f;
    public tbt g;
    public vxe h;
    public Boolean i;
    public aunn j;
    public String k;
    public boolean l;
    public View m;
    public boolean n;
    public rql o;
    public jij p;
    public hkk q;
    public hfn r;
    public hfn s;
    public hfn t;
    private final avmm v = new avmm();
    private boolean w;
    private OnboardingVideoView x;
    private View y;
    private View z;

    private final void h() {
        this.A.setVisibility(0);
        this.y.setVisibility(8);
        this.m.setVisibility(8);
        this.z.setVisibility(8);
    }

    private final void i() {
        this.A.setVisibility(8);
        this.y.setVisibility(0);
        this.m.setVisibility(0);
        this.z.setVisibility(8);
    }

    private final void j() {
        h();
        this.w = false;
        if (getTag() != null) {
            this.c.u();
        }
    }

    @Override // defpackage.zws
    public final void c() {
        i();
        this.w = false;
    }

    @Override // defpackage.zws
    public final void e(Exception exc) {
        ((agrc) ((agrc) ((agrc) a.b()).j(exc)).k("com/google/android/apps/youtube/music/signin/SignInFragment", "onSignInFailure", (char) 351, "SignInFragment.java")).t("Couldn't sign in");
        this.w = false;
        this.k = this.d.b(exc);
        f();
    }

    public final void f() {
        View view = getView();
        if (!isAdded() || view == null) {
            return;
        }
        if (this.e.u()) {
            j();
            return;
        }
        if (this.n) {
            h();
            this.w = false;
            String tag = getTag();
            if (tag != null) {
                this.c.o(tag);
                return;
            }
            return;
        }
        this.i.booleanValue();
        if (!this.l) {
            i();
            return;
        }
        int i = 1;
        if (this.k == null) {
            if (this.w) {
                return;
            }
            this.w = true;
            this.o.d(requireActivity(), this);
            return;
        }
        this.A.setVisibility(8);
        this.y.setVisibility(8);
        this.m.setVisibility(0);
        this.z.setVisibility(0);
        ((TextView) this.z.findViewById(R.id.setup_login_error_message)).setText(this.k);
        this.p.a(this.z.findViewById(R.id.setup_login_retry_button), null, new ivp(this, i), null, false).i(getString(R.string.setup_login_retry), 16, 4);
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.f;
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        j();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            this.l = bundle.getBoolean("has_seen_warm_welcome");
            this.k = bundle.getString("login_exception_error_msg", null);
            this.B = bundle.getBoolean("is_retail_mode");
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Optional optionalEmpty;
        Optional optionalEmpty2;
        this.g.f(this);
        xgn xgnVar = this.f;
        hkk hkkVar = this.q;
        if (hkkVar.a) {
            hkkVar.a = false;
            i = 181013;
        } else {
            i = 21537;
        }
        xgnVar.b(xhb.a(i), null, null);
        View viewInflate = layoutInflater.inflate(R.layout.signin_fragment, viewGroup, false);
        this.x = (OnboardingVideoView) viewInflate.findViewById(R.id.sign_in_background_video);
        this.y = viewInflate.findViewById(R.id.welcome_layout);
        this.m = viewInflate.findViewById(R.id.button_layout);
        this.z = viewInflate.findViewById(R.id.setup_login_failure);
        this.A = viewInflate.findViewById(R.id.spinner);
        TextView textView = (TextView) viewInflate.findViewById(R.id.sign_in_button);
        View viewFindViewById = viewInflate.findViewById(R.id.skip_button);
        this.B = this.r.E();
        int i2 = 3;
        this.v.c(this.s.M().L(this.b).al(new iho(this, 4), new ihp(3)));
        this.p.a(textView, null, new hxg(this, 2), null, false).i(getString(R.string.promo_continue), 27, 4);
        this.f.l(new xgj(xhb.b(21538)));
        if (this.B) {
            viewFindViewById.setVisibility(8);
            textView.setText(getString(R.string.promo_preview));
            this.w = true;
            this.o.d(requireActivity(), this);
        } else {
            viewFindViewById.setVisibility(0);
            this.p.a(viewFindViewById, null, new hxg(this, i2), null, false).i(getString(R.string.promo_continue_signed_out), 16, 4);
            this.f.l(new xgj(xhb.b(71178)));
        }
        try {
            Account[] accountArrD = ((rre) this.t.a).d();
            optionalEmpty = accountArrD != null ? Optional.of(accountArrD) : Optional.empty();
        } catch (RemoteException | kmj | kmk unused) {
            optionalEmpty = Optional.empty();
        }
        if (optionalEmpty.isPresent() && ((Account[]) optionalEmpty.get()).length == 1 && !this.B) {
            this.l = true;
        }
        hkk hkkVar2 = this.q;
        if (((Optional) hkkVar2.c).isPresent()) {
            aihf aihfVarCreateBuilder = apzh.a.createBuilder();
            Object obj = ((Optional) hkkVar2.c).get();
            aihfVarCreateBuilder.copyOnWrite();
            apzh apzhVar = (apzh) aihfVarCreateBuilder.instance;
            apzhVar.b |= 32;
            apzhVar.d = (String) obj;
            apzh apzhVar2 = (apzh) aihfVarCreateBuilder.build();
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aihhVar.e(apzi.a, apzhVar2);
            ajwo ajwoVar = (ajwo) aihhVar.build();
            hkkVar2.c = Optional.empty();
            optionalEmpty2 = Optional.of(ajwoVar);
        } else {
            optionalEmpty2 = Optional.empty();
        }
        hkp hkpVar = new hkp(this, 5);
        if (true == optionalEmpty2.isPresent()) {
            ((ivn) hkpVar.a).h.a((ajwo) optionalEmpty2.get());
        }
        requireActivity().getWindow().setStatusBarColor(viewInflate.getContext().getColor(R.color.music_full_transparent));
        return viewInflate;
    }

    @Override // defpackage.cc
    public final void onDestroyView() {
        View view = getView();
        cf activity = getActivity();
        if (view != null && activity != null) {
            activity.getWindow().setStatusBarColor(view.getContext().getColor(R.color.header_color));
        }
        this.v.dispose();
        this.g.l(this);
        super.onDestroyView();
        if (getView() instanceof ViewGroup) {
            ((ViewGroup) getView()).removeView(this.x);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aunn, java.lang.Object] */
    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        getContext();
        OnboardingVideoView onboardingVideoView = this.x;
        String packageName = onboardingVideoView.getContext().getPackageName();
        VideoView videoView = onboardingVideoView.a;
        videoView.setAudioFocusRequest(0);
        videoView.setVideoPath("android.resource://" + packageName + "/2131951721");
        videoView.start();
        hef hefVar = (hef) this.j.io();
        ListenableFuture listenableFutureI = ((ayq) hefVar.a.io()).i();
        hys hysVar = new hys(9);
        ?? r0 = hefVar.b;
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), hysVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureI, afwiVar);
        listenableFutureI.addListener(ahcrVar, MoreExecutors.c(r0, ahcrVar));
        gek gekVar = new gek(2);
        hyl hylVar = new hyl(this, 3);
        Executor executor = taf.a;
        boc lifecycle = getLifecycle();
        bob bobVar = bob.b;
        taq.d();
        ahcrVar.addListener(new ahei(ahcrVar, new afwj(afty.c(false), new tac(bobVar, lifecycle, hylVar, gekVar), 0)), taf.a);
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        bundle.putBoolean("has_seen_warm_welcome", this.l);
        bundle.putString("login_exception_error_msg", this.k);
        bundle.putBoolean("is_retail_mode", this.B);
    }

    @Override // defpackage.zws
    public final void d() {
    }
}
