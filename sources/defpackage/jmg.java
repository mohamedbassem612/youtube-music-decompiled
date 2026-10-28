package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.voice.views.NestedScrollListeningFrameLayout;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.Objects;
import j$.util.Optional;
import java.io.FileDescriptor;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmg extends jlq implements hkw {
    private static final agrf aM = agrf.h("com/google/android/apps/youtube/music/voice/views/VoiceSearchFragment");
    public xgm A;
    public adxj B;
    public Optional C;
    public aunn D;
    public aevw E;
    aevq F;
    public ViewTreeObserver.OnGlobalLayoutListener G;
    public jml H;
    public aefv I;
    public aejo J;
    public List K;
    public boolean L;
    public boolean M;
    public boolean N;
    public FrameLayout P;
    public NestedScrollListeningFrameLayout Q;
    public FrameLayout R;
    public FrameLayout S;
    public TextView T;
    public TextView U;
    public TextView V;
    public TextView W;
    public TextView X;
    public TextView Y;
    public boolean Z;
    public vxz aA;
    public vxz aB;
    public jnj aC;
    public aerj aD;
    public axlj aE;
    public vwt aF;
    public aend aG;
    public aciz aH;
    public kyr aI;
    public xsc aL;
    private boolean aO;
    private View aP;
    private TextView aR;
    private LottieAnimationView aS;
    private ImageView aT;
    private ImageView aU;
    private ImageView aV;
    private ImageView aW;
    private ImageView aX;
    private YouTubeAppCompatTextView aY;
    private TextView aZ;
    public ajwo aa;
    public aigj ab;
    public ViewGroup ac;
    public EditText ad;
    public ImageView ae;
    public ImageView af;
    public boolean ag;
    public boolean ah;
    public LottieAnimationView ai;
    public ImageView aj;
    public TextView ak;
    public ViewGroup al;
    public LoadingFrameLayout am;
    public boolean an;
    public NestedScrollListeningFrameLayout aq;
    public boolean ar;
    public boolean as;
    public boolean at;
    public jls au;
    public aprb av;
    public ListenableFuture aw;
    public hcb ax;
    public acwq ay;
    private boolean bb;
    private jlo bc;
    private aeke bd;
    private ahgb bf;
    public vxe k;
    public xgn l;
    public aejq m;
    public tbt n;
    public vyo o;
    public xit p;
    public abvk q;
    public jer r;
    public acxn s;
    public ahey t;
    public ahey u;
    public jlh v;
    public aunn w;
    public aunn x;
    public aunn y;
    public aunn z;
    private byte[] aN = new byte[0];
    public aigj O = aigj.d;
    private boolean aQ = true;
    public int az = 1;
    private int be = 1;
    public String ao = "";
    public aolh ap = aolh.PANEL_EXPANDED_STYLE_UNKNOWN;
    private boolean ba = false;
    final qcb aK = new qcb(this);
    final qcb aJ = new qcb(this);

    private final woc S(String str) {
        ajwo ajwoVar = this.aa;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        woc wocVarJ = this.aG.j();
        wocVarJ.a = str;
        wocVarJ.b = (String) Objects.requireNonNullElse(this.q.n(), "");
        wocVarJ.c = (String) Objects.requireNonNullElse(this.q.m(), "");
        wocVarJ.e = this.O;
        aigj aigjVar = this.ab;
        if (aigjVar == null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apym.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            aigjVar = ((apym) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).g;
        }
        wocVarJ.d = aigjVar;
        wocVarJ.n(ajwoVar.c);
        return wocVarJ;
    }

    private static final String T() {
        String strN = aedi.n();
        boolean zIsEmpty = strN.isEmpty();
        String strO = aedi.o();
        return (zIsEmpty || strO.isEmpty()) ? "en-US" : a.cl(strO, (byte) 45, strN);
    }

    public static jmg l(ajwo ajwoVar) {
        jmg jmgVar = new jmg();
        jmgVar.aa = ajwoVar;
        return jmgVar;
    }

    public static jmg m(byte[] bArr, String str, int i) {
        aihf aihfVarCreateBuilder = aoar.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
        aoarVar.b |= 2;
        aoarVar.d = i;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
            aoarVar2.b |= 1;
            aoarVar2.c = str;
        }
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder.build());
        jmg jmgVarL = l((ajwo) aihhVar.build());
        jmgVarL.aN = bArr;
        return jmgVarL;
    }

    public final void A(acxm acxmVar, ViewGroup viewGroup) {
        adly adlyVar = new adly();
        adlyVar.a(this.l);
        kro.Q(acxmVar, viewGroup, this.r.a, adlyVar);
    }

    public final void B() {
        this.Z = false;
        this.L = false;
        aejo aejoVar = this.J;
        if (aejoVar != null) {
            aejoVar.i();
        }
        L();
    }

    @Override // defpackage.hkw
    public final void C() {
        RecyclerView recyclerView;
        jml jmlVar = this.H;
        if (jmlVar == null || (recyclerView = jmlVar.e) == null) {
            return;
        }
        recyclerView.aj(0);
    }

    public final void D() {
        EditText editText;
        anmq anmqVar = (anmq) this.ax.a(kro.ao());
        if ((anmqVar == null || !(anmqVar.getState() == anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_LOADING || anmqVar.getState() == anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_LOADING_FROM_SUGGESTION)) && !this.ba) {
            if (this.L) {
                G(anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_VOICE_INPUT);
                return;
            }
            if (!this.ag && (Build.VERSION.SDK_INT >= 30 || (editText = this.ad) == null || !editText.isFocused())) {
                G(anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_ZERO_STATE);
                return;
            }
            EditText editText2 = this.ad;
            if (editText2 == null || TextUtils.isEmpty(editText2.getText())) {
                G(anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_KEYBOARD_OPEN);
            } else {
                G(anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_TYPING);
            }
        }
    }

    public final void E(woc wocVar, twi twiVar, twi twiVar2) {
        TextView textView = this.aZ;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ListenableFuture listenableFuture = this.aw;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            this.aw.cancel(false);
        }
        ListenableFuture listenableFutureK = this.aG.k(wocVar);
        this.aw = listenableFutureK;
        taf.k(this, listenableFutureK, twiVar, twiVar2);
    }

    public final void F(int i) {
        jls jlsVar = this.au;
        if (jlsVar != null) {
            jlsVar.c(i);
        }
    }

    public final void G(anmt anmtVar) {
        String strAo = kro.ao();
        strAo.getClass();
        ahno.P(!strAo.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = anmr.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anmr anmrVar = (anmr) aihfVarCreateBuilder.instance;
        anmrVar.b |= 1;
        anmrVar.c = strAo;
        anmo anmoVar = new anmo(aihfVarCreateBuilder);
        aolh aolhVar = this.ap;
        if (aolhVar != aolh.PANEL_EXPANDED_STYLE_WRAP_CONTENT) {
            anmoVar.am(aolhVar);
        } else {
            aevw aevwVar = this.E;
            if (aevwVar != null && aevwVar.a().F != 4) {
                anmoVar.am(aolh.PANEL_EXPANDED_STYLE_FULL_SCREEN);
            } else if (anmtVar == anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_UNKNOWN || anmtVar == anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_ZERO_STATE || anmtVar == anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_VOICE_INPUT) {
                anmoVar.am(this.ap);
            } else {
                anmoVar.am(aolh.PANEL_EXPANDED_STYLE_FULL_SCREEN);
                J(true);
            }
        }
        aihf aihfVar = anmoVar.a;
        aihfVar.copyOnWrite();
        anmr anmrVar2 = (anmr) aihfVar.instance;
        anmrVar2.d = anmtVar.h;
        anmrVar2.b |= 2;
        hcb hcbVar = this.ax;
        hcbVar.c();
        hcbVar.e(anmoVar.an());
        if (anmtVar == anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_LOADING || anmtVar == anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_LOADING_FROM_SUGGESTION) {
            this.ba = true;
            LottieAnimationView lottieAnimationView = this.ai;
            if (lottieAnimationView != null && !this.at) {
                lottieAnimationView.setVisibility(0);
                this.ai.g();
            }
        } else {
            this.ba = false;
        }
        TextView textView = this.aZ;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void H(Configuration configuration) {
        LottieAnimationView lottieAnimationView;
        if (this.az == 3) {
            if (this.at || (lottieAnimationView = this.ai) == null || lottieAnimationView.getVisibility() != 0) {
                return;
            }
            if (configuration.orientation == 2) {
                this.ai.h(R.raw.ask_music_zero_state_landscape);
                return;
            } else {
                if (configuration.orientation == 1) {
                    this.ai.h(R.raw.ask_music_zero_state_portrait);
                    return;
                }
                return;
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (configuration.orientation == 2) {
            layoutParams.addRule(15);
            layoutParams.addRule(21);
            layoutParams2.addRule(16, R.id.microphone_container);
        } else {
            layoutParams.addRule(14);
            layoutParams.addRule(12);
            layoutParams2.addRule(2, R.id.microphone_container);
        }
        View view = this.aP;
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        FrameLayout frameLayout = this.R;
        if (frameLayout != null) {
            frameLayout.setLayoutParams(layoutParams2);
        }
        jls jlsVar = this.au;
        if (jlsVar != null) {
            jlsVar.e(configuration);
        }
    }

    public final void I(boolean z) {
        EditText editText = this.ad;
        if (editText != null) {
            editText.setEnabled(z);
        }
        ImageView imageView = this.af;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        ImageView imageView2 = this.ae;
        if (imageView2 != null) {
            imageView2.setEnabled(z);
        }
        if (!this.as || getContext() == null) {
            return;
        }
        Context context = getContext();
        if (z) {
            EditText editText2 = this.ad;
            if (editText2 != null) {
                editText2.setTextColor(tzk.i(context, R.attr.ytOverlayTextPrimary));
                this.ad.setHintTextColor(tzk.i(context, R.attr.ytOverlayTextSecondary));
            }
            ImageView imageView3 = this.ae;
            if (imageView3 != null) {
                imageView3.setImageTintList(ColorStateList.valueOf(tzk.i(context, R.attr.ytOverlayTextPrimary)));
                return;
            }
            return;
        }
        int i = tzk.i(context, R.attr.ytTextDisabled);
        EditText editText3 = this.ad;
        if (editText3 != null) {
            editText3.setText("");
            this.ad.setTextColor(i);
            this.ad.setHintTextColor(i);
        }
        ImageView imageView4 = this.ae;
        if (imageView4 != null) {
            imageView4.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final void J(boolean z) {
        FrameLayout frameLayout;
        if (this.ap != aolh.PANEL_EXPANDED_STYLE_WRAP_CONTENT || this.E == null || this.ac == null || (frameLayout = this.R) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            ViewGroup.LayoutParams layoutParams3 = this.ac.getLayoutParams();
            if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                if (z && this.E.a().F != 3) {
                    this.E.a().I(3);
                }
                layoutParams2.addRule(2, R.id.text_forward_input_group);
                this.R.setLayoutParams(layoutParams2);
                layoutParams4.removeRule(3);
                layoutParams4.addRule(12);
                this.ac.setLayoutParams(layoutParams4);
            }
        }
    }

    public final void K() {
        G(anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_ZERO_STATE);
        NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout = this.Q;
        if (nestedScrollListeningFrameLayout != null) {
            kro.X(nestedScrollListeningFrameLayout, this.r.a);
        }
        z();
        LottieAnimationView lottieAnimationView = this.ai;
        if (lottieAnimationView != null && !this.at) {
            lottieAnimationView.d();
            this.ai.setVisibility(0);
        }
        I(true);
        EditText editText = this.ad;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            ImageView imageView = this.af;
            if (imageView != null && !this.as) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.ae;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            r(true);
        }
        TextView textView = this.aZ;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public final void L() {
        TextView textView;
        if (this.az == 3) {
            jls jlsVar = this.au;
            if (jlsVar != null) {
                jlsVar.h();
            }
            I(true);
            return;
        }
        NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout = this.Q;
        if (nestedScrollListeningFrameLayout == null || nestedScrollListeningFrameLayout.getVisibility() != 0) {
            if (this.az == 4) {
                jls jlsVar2 = this.au;
                if (jlsVar2 != null) {
                    jlsVar2.l();
                    return;
                }
                return;
            }
            TextView textView2 = this.W;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.T;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = this.U;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            TextView textView5 = this.X;
            if (textView5 == null || TextUtils.isEmpty(textView5.getText()) || (textView = this.V) == null) {
                TextView textView6 = this.V;
                if (textView6 != null) {
                    textView6.setText(getResources().getText(R.string.try_again_text));
                }
            } else {
                textView.setText(getResources().getText(R.string.try_saying_text));
            }
            TextView textView7 = this.V;
            if (textView7 != null) {
                textView7.setVisibility(0);
            }
            TextView textView8 = this.Y;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
            TextView textView9 = this.X;
            if (textView9 != null) {
                textView9.setVisibility(0);
            }
            jls jlsVar3 = this.au;
            if (jlsVar3 != null) {
                jlsVar3.h();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void M() {
        FileDescriptor fileDescriptorB;
        if (this.J != null) {
            if (this.q.X()) {
                this.q.ap(false, 19);
            }
            this.aI.s(jli.OPEN);
            this.L = true;
            this.M = false;
            this.N = false;
            if (this.az != 3) {
                TextView textView = this.T;
                if (textView != null) {
                    textView.setVisibility(8);
                    this.T.setText("");
                }
                TextView textView2 = this.U;
                if (textView2 != null) {
                    textView2.setText("");
                }
                TextView textView3 = this.V;
                if (textView3 != null) {
                    textView3.setText(getResources().getText(R.string.listening));
                    this.V.setVisibility(0);
                }
            }
            final aejo aejoVar = this.J;
            String str = (String) Objects.requireNonNullElse(this.q.n(), "");
            String str2 = (String) Objects.requireNonNullElse(this.q.m(), "");
            aigj aigjVar = this.O;
            aejoVar.K = str;
            aejoVar.L = str2;
            aejoVar.N = aigjVar;
            AudioRecord audioRecord = aejoVar.c;
            if (audioRecord == null || audioRecord.getState() != 1) {
                ((agrc) ((agrc) aejo.a.b()).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "startConversation", 435, "EmbeddedAssistant.java")).t("AudioRecord is null or not initialized");
                if (this.az != 3) {
                    dismiss();
                    return;
                }
                return;
            }
            if (!aejoVar.A) {
                boolean zK = aejoVar.k(aejoVar.z);
                aejoVar.A = zK;
                if (zK) {
                    if (aejoVar.l()) {
                        fileDescriptorB = aejoVar.x.b();
                        if (fileDescriptorB == null && fileDescriptorB.valid()) {
                            aejoVar.O.set(true);
                            aejoVar.h(fileDescriptorB, 0L, new byte[SemanticState.ReadOnly]);
                        } else {
                            ((agrc) ((agrc) aejo.a.b()).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "startEncodedAudioStreaming", 980, "EmbeddedAssistant.java")).t("MEMFD: FD null or invalid at start");
                            aejoVar.O.set(false);
                        }
                        synchronized (aejoVar) {
                            aejoVar.b();
                            aejoVar.q = aejoVar.o.schedule(afwl.i(new aehz(aejoVar, 15)), 20000L, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } else if (aejoVar.l()) {
                fileDescriptorB = aejoVar.x.b();
                if (fileDescriptorB == null) {
                    ((agrc) ((agrc) aejo.a.b()).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "startEncodedAudioStreaming", 980, "EmbeddedAssistant.java")).t("MEMFD: FD null or invalid at start");
                    aejoVar.O.set(false);
                } else {
                    ((agrc) ((agrc) aejo.a.b()).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "startEncodedAudioStreaming", 980, "EmbeddedAssistant.java")).t("MEMFD: FD null or invalid at start");
                    aejoVar.O.set(false);
                }
                synchronized (aejoVar) {
                    aejoVar.b();
                    aejoVar.q = aejoVar.o.schedule(afwl.i(new aehz(aejoVar, 15)), 20000L, TimeUnit.MILLISECONDS);
                }
            }
            aejoVar.c.startRecording();
            qcb qcbVar = aejoVar.X;
            qcbVar.getClass();
            aejoVar.d.post(new aehz(qcbVar, 13));
            aejoVar.f.execute(afwl.i(new Runnable() { // from class: aejj
                @Override // java.lang.Runnable
                public final void run() {
                    aejo aejoVar2 = aejoVar;
                    int i = 1;
                    if (aejoVar2.S == null) {
                        zwb zwbVar = aejoVar2.m;
                        zwa zwaVarE = zwbVar.e();
                        if (zwaVarE.h() || !(zwaVarE instanceof rlt)) {
                            aejoVar2.k = "";
                        } else {
                            zwk zwkVarA = aejoVar2.s.a((rlt) zwaVarE);
                            if (zwkVarA.f()) {
                                aejoVar2.k = zwkVarA.d();
                            } else {
                                aejoVar2.k = "";
                            }
                        }
                        zwa zwaVarE2 = zwbVar.e();
                        if (zwaVarE2 != null && zwaVarE2.d()) {
                            avbe avbeVar = aejoVar2.r;
                            avba avbaVar = avbe.b;
                            int i2 = avbb.c;
                            avbeVar.e(new avaz("X-Goog-PageId", avbaVar), zwaVarE2.l());
                        }
                        if (ahno.aa(aejoVar2.k)) {
                            avbe avbeVar2 = aejoVar2.r;
                            avba avbaVar2 = avbe.b;
                            int i3 = avbb.c;
                            avbeVar2.e(new avaz("x-goog-api-key", avbaVar2), aejoVar2.j);
                            aejoVar2.d();
                        } else if (aejoVar2.B) {
                            aejoVar2.d();
                        }
                        auzo auzoVarV = auzo.v(aejoVar2.F, 443, aejoVar2.i);
                        auzoVarV.d.j.addAll(Arrays.asList(new aejs(aejoVar2.r, aejoVar2.k)));
                        auzoVarV.w(aejoVar2.n);
                        aejoVar2.u = auzoVarV.u();
                        aejoVar2.S = (avkm) avkm.a(new atxx(1), aejoVar2.u);
                        if (aejoVar2.J) {
                            avkm avkmVar = aejoVar2.S;
                            aejoVar2.S = new avkm(avkmVar.a, avkmVar.b.c(ahvb.a, Integer.valueOf(tok.EMBEDDED_ASSISTANT.az)), (byte[]) null);
                        }
                    }
                    avkm avkmVar2 = aejoVar2.S;
                    avkw avkwVar = aejoVar2.v;
                    auyr auyrVar = avkmVar2.a;
                    avbh avbhVarC = afxw.a;
                    if (avbhVarC == null) {
                        synchronized (afxw.class) {
                            avbhVarC = afxw.a;
                            if (avbhVarC == null) {
                                aeg aegVarC = avbh.c();
                                aegVarC.e = avbg.d;
                                aegVarC.d = avbh.b("google.assistant.embedded.v1.EmbeddedAssistant", "YTAssist");
                                aegVarC.d();
                                afxp afxpVar = afxp.a;
                                ExtensionRegistryLite extensionRegistryLite = avkl.a;
                                aegVarC.c = new avkk(afxpVar);
                                aegVarC.b = new avkk(afxq.a);
                                avbhVarC = aegVarC.c();
                                afxw.a = avbhVarC;
                            }
                        }
                    }
                    aejoVar2.t = avks.a(auyrVar.a(avbhVarC, avkmVar2.b), avkwVar);
                    aihf aihfVarCreateBuilder = afxn.a.createBuilder();
                    afxr afxrVar = aejoVar2.g;
                    aihfVarCreateBuilder.copyOnWrite();
                    afxn afxnVar = (afxn) aihfVarCreateBuilder.instance;
                    afxrVar.getClass();
                    afxnVar.d = afxrVar;
                    afxnVar.c = 1;
                    afxt afxtVar = aejoVar2.h;
                    aihfVarCreateBuilder.copyOnWrite();
                    afxn afxnVar2 = (afxn) aihfVarCreateBuilder.instance;
                    afxtVar.getClass();
                    afxnVar2.e = afxtVar;
                    afxnVar2.b |= 1;
                    afxu afxuVar = aejoVar2.b;
                    aihfVarCreateBuilder.copyOnWrite();
                    afxn afxnVar3 = (afxn) aihfVarCreateBuilder.instance;
                    afxuVar.getClass();
                    afxnVar3.g = afxuVar;
                    afxnVar3.b |= 8;
                    aihf aihfVarCreateBuilder2 = allj.a.createBuilder();
                    int i4 = aejoVar2.P;
                    aihfVarCreateBuilder2.copyOnWrite();
                    allj alljVar = (allj) aihfVarCreateBuilder2.instance;
                    if (i4 == 0) {
                        throw null;
                    }
                    alljVar.i = i4 - 1;
                    alljVar.b |= SemanticState.Multiline;
                    float f = aejoVar2.y;
                    aihfVarCreateBuilder2.copyOnWrite();
                    allj alljVar2 = (allj) aihfVarCreateBuilder2.instance;
                    alljVar2.b |= 16384;
                    alljVar2.j = f;
                    aihfVarCreateBuilder2.copyOnWrite();
                    allj alljVar3 = (allj) aihfVarCreateBuilder2.instance;
                    alljVar3.b |= 64;
                    alljVar3.g = false;
                    aihf aihfVarCreateBuilder3 = alli.a.createBuilder();
                    aihfVarCreateBuilder3.copyOnWrite();
                    alli alliVar = (alli) aihfVarCreateBuilder3.instance;
                    alliVar.b |= 1;
                    alliVar.c = false;
                    aihf aihfVarCreateBuilder4 = aqnk.a.createBuilder();
                    aijp aijpVar = aejoVar2.H;
                    long j = aijpVar.b;
                    aihfVarCreateBuilder4.copyOnWrite();
                    aqnk aqnkVar = (aqnk) aihfVarCreateBuilder4.instance;
                    aqnkVar.b |= 1;
                    aqnkVar.c = j;
                    int i5 = aijpVar.c;
                    aihfVarCreateBuilder4.copyOnWrite();
                    aqnk aqnkVar2 = (aqnk) aihfVarCreateBuilder4.instance;
                    aqnkVar2.b |= 2;
                    aqnkVar2.d = i5;
                    aqnk aqnkVar3 = (aqnk) aihfVarCreateBuilder4.build();
                    aihfVarCreateBuilder3.copyOnWrite();
                    alli alliVar2 = (alli) aihfVarCreateBuilder3.instance;
                    aqnkVar3.getClass();
                    alliVar2.d = aqnkVar3;
                    alliVar2.b |= 2;
                    alli alliVar3 = (alli) aihfVarCreateBuilder3.build();
                    aihfVarCreateBuilder2.copyOnWrite();
                    allj alljVar4 = (allj) aihfVarCreateBuilder2.instance;
                    alliVar3.getClass();
                    alljVar4.l = alliVar3;
                    alljVar4.b |= 2097152;
                    aihf aihfVarO = aejoVar2.U.o(aejoVar2.m.e(), "UNSET_SERVICE_NAME");
                    aejoVar2.V.I(aihfVarO);
                    if (aihfVarO == null) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        throw null;
                    }
                    aihfVarCreateBuilder2.copyOnWrite();
                    allj alljVar5 = (allj) aihfVarCreateBuilder2.instance;
                    InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarO.build();
                    innertubeContext$InnerTubeContext.getClass();
                    alljVar5.c = innertubeContext$InnerTubeContext;
                    alljVar5.b |= 1;
                    aigj aigjVar2 = aejoVar2.M;
                    if (aigjVar2 != null) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        allj alljVar6 = (allj) aihfVarCreateBuilder2.instance;
                        alljVar6.b |= 16777216;
                        alljVar6.m = aigjVar2;
                    }
                    aigj aigjVar3 = aejoVar2.N;
                    if (aigjVar3 != null && !aigjVar3.E()) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        allj alljVar7 = (allj) aihfVarCreateBuilder2.instance;
                        alljVar7.b |= 4;
                        alljVar7.e = aigjVar3;
                    }
                    aihf aihfVarCreateBuilder5 = allh.a.createBuilder();
                    boolean z = aejoVar2.D;
                    aihfVarCreateBuilder5.copyOnWrite();
                    allh allhVar = (allh) aihfVarCreateBuilder5.instance;
                    allhVar.b |= 4;
                    allhVar.e = !z;
                    String str3 = aejoVar2.E;
                    aihfVarCreateBuilder5.copyOnWrite();
                    allh allhVar2 = (allh) aihfVarCreateBuilder5.instance;
                    str3.getClass();
                    allhVar2.b |= 1;
                    allhVar2.c = str3;
                    if (z) {
                        String str4 = aejoVar2.e;
                        aihfVarCreateBuilder5.copyOnWrite();
                        allh allhVar3 = (allh) aihfVarCreateBuilder5.instance;
                        str4.getClass();
                        allhVar3.b |= 2;
                        allhVar3.d = str4;
                    }
                    allh allhVar4 = (allh) aihfVarCreateBuilder5.build();
                    aihfVarCreateBuilder2.copyOnWrite();
                    allj alljVar8 = (allj) aihfVarCreateBuilder2.instance;
                    allhVar4.getClass();
                    alljVar8.k = allhVar4;
                    alljVar8.b |= 262144;
                    aihf aihfVarCreateBuilder6 = arnm.a.createBuilder();
                    agev agevVar = aejoVar2.C;
                    if (agevVar.g()) {
                        Object objC = agevVar.c();
                        aihfVarCreateBuilder6.copyOnWrite();
                        arnm arnmVar = (arnm) aihfVarCreateBuilder6.instance;
                        arnmVar.b |= SemanticState.LiveRegion;
                        arnmVar.c = (String) objC;
                    }
                    aihf aihfVarCreateBuilder7 = arno.a.createBuilder();
                    aihfVarCreateBuilder7.copyOnWrite();
                    arno arnoVar = (arno) aihfVarCreateBuilder7.instance;
                    arnm arnmVar2 = (arnm) aihfVarCreateBuilder6.build();
                    arnmVar2.getClass();
                    arnoVar.d = arnmVar2;
                    arnoVar.b |= 4;
                    aihf aihfVarCreateBuilder8 = apnh.a.createBuilder();
                    aihfVarCreateBuilder8.copyOnWrite();
                    apnh apnhVar = (apnh) aihfVarCreateBuilder8.instance;
                    apnhVar.b |= 2;
                    apnhVar.c = false;
                    aihfVarCreateBuilder8.copyOnWrite();
                    apnh apnhVar2 = (apnh) aihfVarCreateBuilder8.instance;
                    apnhVar2.b |= 8;
                    apnhVar2.d = false;
                    apnh apnhVar3 = (apnh) aihfVarCreateBuilder8.build();
                    aihfVarCreateBuilder7.copyOnWrite();
                    arno arnoVar2 = (arno) aihfVarCreateBuilder7.instance;
                    apnhVar3.getClass();
                    arnoVar2.e = apnhVar3;
                    arnoVar2.b |= SemanticState.Focused;
                    aihf aihfVarCreateBuilder9 = apne.a.createBuilder();
                    lqa lqaVar = aejoVar2.T;
                    aihfVarCreateBuilder9.copyOnWrite();
                    apne apneVar = (apne) aihfVarCreateBuilder9.instance;
                    apneVar.b |= 1;
                    apneVar.c = false;
                    Object obj = lqaVar.a;
                    aihfVarCreateBuilder9.copyOnWrite();
                    apne apneVar2 = (apne) aihfVarCreateBuilder9.instance;
                    apneVar2.b |= 2;
                    apneVar2.d = (String) obj;
                    apne apneVar3 = (apne) aihfVarCreateBuilder9.build();
                    aihfVarCreateBuilder7.copyOnWrite();
                    arno arnoVar3 = (arno) aihfVarCreateBuilder7.instance;
                    apneVar3.getClass();
                    arnoVar3.f = apneVar3;
                    arnoVar3.b |= SemanticState.Hidden;
                    aihf aihfVarCreateBuilder10 = arnn.a.createBuilder();
                    try {
                        alxu alxuVar = (alxu) aihn.parseFrom(alxu.a, aejoVar2.l);
                        aihfVarCreateBuilder10.copyOnWrite();
                        arnn arnnVar = (arnn) aihfVarCreateBuilder10.instance;
                        alxuVar.getClass();
                        arnnVar.c = alxuVar;
                        arnnVar.b |= 1;
                    } catch (aiik unused) {
                    }
                    aihfVarCreateBuilder10.copyOnWrite();
                    arnn arnnVar2 = (arnn) aihfVarCreateBuilder10.instance;
                    arnnVar2.b |= SemanticState.Modal;
                    arnnVar2.d = false;
                    arnn arnnVar3 = (arnn) aihfVarCreateBuilder10.build();
                    aihfVarCreateBuilder7.copyOnWrite();
                    arno arnoVar4 = (arno) aihfVarCreateBuilder7.instance;
                    arnnVar3.getClass();
                    arnoVar4.c = arnnVar3;
                    arnoVar4.b |= 1;
                    aihfVarCreateBuilder2.copyOnWrite();
                    allj alljVar9 = (allj) aihfVarCreateBuilder2.instance;
                    arno arnoVar5 = (arno) aihfVarCreateBuilder7.build();
                    arnoVar5.getClass();
                    alljVar9.h = arnoVar5;
                    alljVar9.b |= SemanticState.Obscured;
                    String str5 = aejoVar2.K;
                    if (str5 != null && !str5.equals("")) {
                        aihf aihfVarCreateBuilder11 = apml.a.createBuilder();
                        String str6 = aejoVar2.K;
                        str6.getClass();
                        aihfVarCreateBuilder11.copyOnWrite();
                        apml apmlVar = (apml) aihfVarCreateBuilder11.instance;
                        apmlVar.b |= 2;
                        apmlVar.d = str6;
                        aihfVarCreateBuilder11.copyOnWrite();
                        apml apmlVar2 = (apml) aihfVarCreateBuilder11.instance;
                        apmlVar2.c = 1;
                        apmlVar2.b |= 1;
                        String str7 = aejoVar2.L;
                        if (str7 != null && !str7.equals("")) {
                            aihf aihfVarCreateBuilder12 = apmk.a.createBuilder();
                            String str8 = aejoVar2.L;
                            str8.getClass();
                            aihfVarCreateBuilder12.copyOnWrite();
                            apmk apmkVar = (apmk) aihfVarCreateBuilder12.instance;
                            apmkVar.b |= 16;
                            apmkVar.d = str8;
                            apmk apmkVar2 = (apmk) aihfVarCreateBuilder12.build();
                            aihfVarCreateBuilder11.copyOnWrite();
                            apml apmlVar3 = (apml) aihfVarCreateBuilder11.instance;
                            apmkVar2.getClass();
                            apmlVar3.e = apmkVar2;
                            apmlVar3.b |= 32;
                        }
                        aihf aihfVarCreateBuilder13 = apmm.a.createBuilder();
                        aihfVarCreateBuilder13.copyOnWrite();
                        apmm apmmVar = (apmm) aihfVarCreateBuilder13.instance;
                        apml apmlVar4 = (apml) aihfVarCreateBuilder11.build();
                        apmlVar4.getClass();
                        apmmVar.c = apmlVar4;
                        apmmVar.b |= 2;
                        apmm apmmVar2 = (apmm) aihfVarCreateBuilder13.build();
                        aihfVarCreateBuilder2.copyOnWrite();
                        allj alljVar10 = (allj) aihfVarCreateBuilder2.instance;
                        apmmVar2.getClass();
                        alljVar10.d = apmmVar2;
                        alljVar10.b |= 2;
                    }
                    allj alljVar11 = (allj) aihfVarCreateBuilder2.build();
                    aihf aihfVarCreateBuilder14 = atxz.a.createBuilder();
                    aigj byteString = alljVar11.toByteString();
                    aihfVarCreateBuilder14.copyOnWrite();
                    atxz atxzVar = (atxz) aihfVarCreateBuilder14.instance;
                    atxzVar.b = 1;
                    atxzVar.c = byteString;
                    if (aejoVar2.G) {
                        int i6 = true != aejoVar2.l() ? 6 : 2;
                        aihf aihfVarCreateBuilder15 = atyb.a.createBuilder();
                        aihf aihfVarCreateBuilder16 = afye.a.createBuilder();
                        String str9 = aejoVar2.I;
                        aihfVarCreateBuilder16.copyOnWrite();
                        afye afyeVar = (afye) aihfVarCreateBuilder16.instance;
                        str9.getClass();
                        afyeVar.b |= SemanticState.Focused;
                        afyeVar.e = str9;
                        String str10 = aejoVar2.e;
                        aihfVarCreateBuilder16.copyOnWrite();
                        afye afyeVar2 = (afye) aihfVarCreateBuilder16.instance;
                        str10.getClass();
                        afyeVar2.b |= 4;
                        afyeVar2.d = str10;
                        int i7 = aejoVar2.R;
                        aihfVarCreateBuilder16.copyOnWrite();
                        afye afyeVar3 = (afye) aihfVarCreateBuilder16.instance;
                        int i8 = i7 - 1;
                        if (i7 == 0) {
                            throw null;
                        }
                        afyeVar3.f = i8;
                        afyeVar3.b |= SemanticState.Hidden;
                        aihfVarCreateBuilder16.copyOnWrite();
                        afye afyeVar4 = (afye) aihfVarCreateBuilder16.instance;
                        aihv aihvVar = afyeVar4.c;
                        if (!aihvVar.c()) {
                            afyeVar4.c = aihn.mutableCopy(aihvVar);
                        }
                        afyeVar4.c.h(0);
                        aihfVarCreateBuilder15.copyOnWrite();
                        atyb atybVar = (atyb) aihfVarCreateBuilder15.instance;
                        afye afyeVar5 = (afye) aihfVarCreateBuilder16.build();
                        afyeVar5.getClass();
                        atybVar.c = afyeVar5;
                        atybVar.b |= 1;
                        aihf aihfVarCreateBuilder17 = afyf.a.createBuilder();
                        aihfVarCreateBuilder17.copyOnWrite();
                        afyf afyfVar = (afyf) aihfVarCreateBuilder17.instance;
                        afyfVar.c = i6 - 1;
                        afyfVar.b |= 1;
                        int i9 = aejoVar2.Q;
                        int i10 = i9 - 1;
                        if (i9 == 0) {
                            throw null;
                        }
                        if (i10 == 2) {
                            i = 7;
                        } else if (i10 == 3) {
                            i = 10;
                        } else if (i10 == 4) {
                            i = 8;
                        }
                        aihfVarCreateBuilder17.copyOnWrite();
                        afyf afyfVar2 = (afyf) aihfVarCreateBuilder17.instance;
                        afyfVar2.d = i - 1;
                        afyfVar2.b |= 2;
                        aihfVarCreateBuilder15.copyOnWrite();
                        atyb atybVar2 = (atyb) aihfVarCreateBuilder15.instance;
                        afyf afyfVar3 = (afyf) aihfVarCreateBuilder17.build();
                        afyfVar3.getClass();
                        atybVar2.d = afyfVar3;
                        atybVar2.b |= 2;
                        aigj byteString2 = ((atyb) aihfVarCreateBuilder15.build()).toByteString();
                        aihfVarCreateBuilder14.copyOnWrite();
                        atxz atxzVar2 = (atxz) aihfVarCreateBuilder14.instance;
                        atxzVar2.d = 4;
                        atxzVar2.e = byteString2;
                    }
                    atxz atxzVar3 = (atxz) aihfVarCreateBuilder14.build();
                    aihf aihfVarCreateBuilder18 = afxv.a.createBuilder();
                    String str11 = aejoVar2.e;
                    aihfVarCreateBuilder18.copyOnWrite();
                    afxv afxvVar = (afxv) aihfVarCreateBuilder18.instance;
                    str11.getClass();
                    afxvVar.b = str11;
                    boolean z2 = aejoVar2.D;
                    aihfVarCreateBuilder18.copyOnWrite();
                    ((afxv) aihfVarCreateBuilder18.instance).c = z2;
                    aihf aihfVarCreateBuilder19 = afxx.a.createBuilder();
                    aigj byteString3 = atxzVar3.toByteString();
                    aihfVarCreateBuilder19.copyOnWrite();
                    ((afxx) aihfVarCreateBuilder19.instance).b = byteString3;
                    afxx afxxVar = (afxx) aihfVarCreateBuilder19.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    afxn afxnVar4 = (afxn) aihfVarCreateBuilder.instance;
                    afxxVar.getClass();
                    afxnVar4.h = afxxVar;
                    afxnVar4.b |= SemanticState.Focused;
                    afxv afxvVar2 = (afxv) aihfVarCreateBuilder18.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    afxn afxnVar5 = (afxn) aihfVarCreateBuilder.instance;
                    afxvVar2.getClass();
                    afxnVar5.f = afxvVar2;
                    afxnVar5.b |= 4;
                    if (aejoVar2.t == null) {
                        aejoVar2.j();
                        aejoVar2.d.post(new aead(aejoVar2, new NullPointerException(), 7));
                        return;
                    }
                    synchronized (aejoVar2) {
                        if (aejoVar2.t != null) {
                            avkw avkwVar2 = aejoVar2.t;
                            aihf aihfVarCreateBuilder20 = afxp.a.createBuilder();
                            aihfVarCreateBuilder20.copyOnWrite();
                            afxp afxpVar2 = (afxp) aihfVarCreateBuilder20.instance;
                            afxn afxnVar6 = (afxn) aihfVarCreateBuilder.build();
                            afxnVar6.getClass();
                            afxpVar2.c = afxnVar6;
                            afxpVar2.b = 2;
                            avkwVar2.c((afxp) aihfVarCreateBuilder20.build());
                        }
                    }
                    aejoVar2.w.run();
                }
            }));
            jls jlsVar = this.au;
            if (jlsVar != null) {
                jlsVar.k();
            }
        }
    }

    public final void N() {
        this.L = false;
        aejo aejoVar = this.J;
        if (aejoVar != null) {
            aejoVar.c();
            this.J = null;
        }
        if (avg.c(requireContext(), "android.permission.RECORD_AUDIO") == 0) {
            L();
        }
    }

    public final void O(String str) {
        TextView textView = this.ak;
        if (textView != null) {
            textView.setText(str);
            this.ak.setVisibility(0);
        }
        ImageView imageView = this.aj;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public final boolean P() {
        ajlu ajluVar;
        ajwo ajwoVar = this.aa;
        if (ajwoVar == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apym.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        if ((((apym) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c & SemanticState.Focused) == 0) {
            return !(this.ao.isEmpty() || (ajluVar = (ajlu) this.ax.b(this.ao, ajlu.class)) == null || ajluVar.getValue().booleanValue()) || (!this.O.E() && this.an);
        }
        return false;
    }

    @Override // defpackage.aevy, defpackage.bp
    public final void dismiss() {
        u();
        super.dismiss();
    }

    @Override // defpackage.aevy, defpackage.gs, defpackage.bp
    public final Dialog iH(Bundle bundle) {
        aevw aevwVar = new aevw(requireContext());
        this.E = aevwVar;
        aevwVar.b();
        int i = 0;
        this.E.a().E = false;
        int i2 = 1;
        if (this.aA.m(210, 45741213L)) {
            this.E.a().E = true;
        }
        this.E.setOnShowListener(new gxu(this, 3));
        this.E.a().D = true;
        if (this.at) {
            this.E.a().F(false);
        }
        Window window = this.E.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                window.setDecorFitsSystemWindows(false);
                window.getDecorView().setOnApplyWindowInsetsListener(new jmb(this, i));
            } else {
                window.setSoftInputMode(16);
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        aevw aevwVar2 = this.E;
        if (i3 >= 33) {
            aevwVar2.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, new pa(this, 3));
        } else {
            aevwVar2.setOnKeyListener(new xsm(this, i2));
        }
        this.F = new jmc(this);
        this.E.a().y(this.F);
        return this.E;
    }

    public final int k() {
        ViewGroup viewGroup = this.ac;
        int height = viewGroup != null ? viewGroup.getHeight() : 0;
        FrameLayout frameLayout = this.R;
        return frameLayout != null ? height + frameLayout.getHeight() : height;
    }

    public final ajwo n(ajwo ajwoVar) {
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihl aihlVar = aoaq.b;
        aihf aihfVarCreateBuilder = aoar.a.createBuilder();
        String strI = this.l.i();
        aihfVarCreateBuilder.copyOnWrite();
        aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
        strI.getClass();
        aoarVar.b |= 1;
        aoarVar.c = strI;
        aihhVar.e(aihlVar, (aoar) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    public final void o() {
        List list = this.K;
        if (list == null || list.isEmpty()) {
            return;
        }
        SpannableString spannableString = new SpannableString("\"" + ((String) this.K.get(0)) + '\"');
        spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getResources().getString(R.string.try_saying_text));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) spannableString);
        TextView textView = this.Y;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        Iterator it = this.K.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            SpannableString spannableString2 = new SpannableString("\"" + ((String) it.next()) + '\"');
            spannableString2.setSpan(new StyleSpan(2), 0, spannableString2.length(), 33);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            if (i >= 3) {
                break;
            } else {
                spannableStringBuilder2.append((CharSequence) "\n\n");
            }
        }
        TextView textView2 = this.X;
        if (textView2 != null) {
            textView2.setText(spannableStringBuilder2);
        }
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        H(configuration);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.ar = this.aA.l(233, 45783977L, false) || this.aA.m(276, 45846392L);
        this.as = this.aA.l(246, 45803623L, false) || this.aA.m(277, 45846563L);
        this.at = this.aA.l(247, 45803630L, false) || this.aA.m(278, 45846565L);
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r28v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [awmd, java.lang.Object] */
    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.voice_search_fragment, viewGroup, false);
        boolean z = true;
        if (bundle != null) {
            this.aQ = bundle.getBoolean("key_first_open", true);
            byte[] byteArray = bundle.getByteArray("key_searchbox_stats");
            if (byteArray == null) {
                byteArray = new byte[0];
            }
            this.aN = byteArray;
            this.aO = bundle.getBoolean("key_permission_requested");
            byte[] byteArray2 = bundle.getByteArray("key_opaque_conversation_token");
            this.O = byteArray2 != null ? aigj.v(byteArray2) : aigj.d;
            try {
                byte[] byteArray3 = bundle.getByteArray("key_start_command");
                if (byteArray3 != null) {
                    this.aa = (ajwo) aihn.parseFrom(ajwo.a, byteArray3, ExtensionRegistryLite.getGeneratedRegistry());
                }
            } catch (Exception e) {
                ((agrc) ((agrc) ((agrc) aM.c()).j(e)).k("com/google/android/apps/youtube/music/voice/views/VoiceSearchFragment", "onCreateView", (char) 589, "VoiceSearchFragment.java")).t("Failed to parse startCommand stored in savedInstantState bundle");
            }
        }
        ajwo ajwoVar = this.aa;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
            this.aa = ajwoVar;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apym.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        int iAV = a.aV(((apym) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).f);
        if (iAV == 0) {
            iAV = 1;
        }
        this.az = iAV;
        int i2 = 2;
        if (iAV == 1) {
            this.az = 2;
        }
        ajwo ajwoVar2 = this.aa;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apym.b);
        ajwoVar2.c(aihlVarCheckIsLite2);
        Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
        int iP = aext.p(((apym) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).h);
        if (iP == 0) {
            iP = 1;
        }
        this.be = iP;
        ajwo ajwoVar3 = this.aa;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apym.b);
        ajwoVar3.c(aihlVarCheckIsLite3);
        Object objK3 = ajwoVar3.j.k(aihlVarCheckIsLite3.d);
        aolh aolhVarA = aolh.a(((apym) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3))).l);
        if (aolhVarA == null) {
            aolhVarA = aolh.PANEL_EXPANDED_STYLE_UNKNOWN;
        }
        this.ap = aolhVarA;
        if (aolhVarA == aolh.PANEL_EXPANDED_STYLE_UNKNOWN) {
            this.ap = aolh.PANEL_EXPANDED_STYLE_FULL_SCREEN;
        }
        ajwo ajwoVar4 = this.aa;
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apym.b);
        ajwoVar4.c(aihlVarCheckIsLite4);
        Object objK4 = ajwoVar4.j.k(aihlVarCheckIsLite4.d);
        this.ao = ((apym) (objK4 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK4))).m;
        this.al = (ViewGroup) viewInflate.findViewById(R.id.contents_container);
        TextView textView = (TextView) viewInflate.findViewById(R.id.voice_language_title);
        this.ak = textView;
        int i3 = 12;
        if (textView != null) {
            textView.setOnClickListener(new jjc(this, i3));
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.voice_language_button);
        this.aj = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new jjc(this, 13));
        }
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.back_button);
        this.aU = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new jjc(this, 14));
        }
        this.aV = (ImageView) viewInflate.findViewById(R.id.drag_handle);
        int i4 = 8;
        if (this.aA.m(210, 45741213L)) {
            ImageView imageView3 = this.aU;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            ImageView imageView4 = this.aV;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
                bac.p(this.aV, new jmd(this));
                if (this.aA.l(265, 45833023L, false) && this.aV.getLayoutParams() != null) {
                    this.aV.setPadding(0, getResources().getDimensionPixelSize(R.dimen.voice_plate_drag_handle_padding), 0, 0);
                    this.aV.getLayoutParams().height = -2;
                }
            }
        }
        this.R = (FrameLayout) viewInflate.findViewById(R.id.voice_tips_or_dialog_frame);
        this.aP = viewInflate.findViewById(R.id.microphone_container);
        this.P = (FrameLayout) viewInflate.findViewById(R.id.listening_voice_tips_frame);
        this.V = (TextView) viewInflate.findViewById(R.id.state_text_view);
        this.T = (TextView) viewInflate.findViewById(R.id.stable_recognized_text);
        this.U = (TextView) viewInflate.findViewById(R.id.unstable_recognized_text);
        this.W = (TextView) viewInflate.findViewById(R.id.error_text);
        this.X = (TextView) viewInflate.findViewById(R.id.error_voice_tips);
        this.Y = (TextView) viewInflate.findViewById(R.id.listening_voice_tips_text);
        this.Q = (NestedScrollListeningFrameLayout) viewInflate.findViewById(R.id.voice_dialog_frame);
        this.S = (FrameLayout) viewInflate.findViewById(R.id.background_container);
        this.ac = (ViewGroup) viewInflate.findViewById(R.id.text_forward_input_group);
        this.aY = (YouTubeAppCompatTextView) viewInflate.findViewById(R.id.ask_music_banner);
        EditText editText = (EditText) viewInflate.findViewById(R.id.text_input);
        this.ad = editText;
        if (editText != null && this.as && Build.VERSION.SDK_INT >= 29) {
            this.ad.setTextCursorDrawable(R.drawable.search_edit_text_cursor);
        }
        this.aR = (TextView) viewInflate.findViewById(R.id.input_disclaimer);
        this.ae = (ImageView) viewInflate.findViewById(R.id.text_input_mic);
        this.aS = (LottieAnimationView) viewInflate.findViewById(R.id.text_input_mic_indicator);
        this.aT = (ImageView) viewInflate.findViewById(R.id.text_input_mic_background);
        this.af = (ImageView) viewInflate.findViewById(R.id.text_input_clear);
        this.aX = (ImageView) viewInflate.findViewById(R.id.history_button);
        if (this.as) {
            this.aW = (ImageView) viewInflate.findViewById(R.id.text_input_submit);
        } else {
            this.aW = (ImageView) viewInflate.findViewById(R.id.submit);
        }
        this.ai = (LottieAnimationView) viewInflate.findViewById(R.id.ask_music_background);
        this.am = (LoadingFrameLayout) viewInflate.findViewById(R.id.loading_frame);
        this.aZ = (TextView) viewInflate.findViewById(R.id.text_forward_something_went_wrong);
        ImageView imageView5 = this.aj;
        if (imageView5 != null) {
            imageView5.setImageResource(this.B.b(arqz.hN));
        }
        ImageView imageView6 = this.aU;
        if (imageView6 != null) {
            imageView6.setImageResource(this.B.b(arqz.oQ));
        }
        ImageView imageView7 = this.ae;
        if (imageView7 != null) {
            imageView7.setImageResource(this.B.b(arqz.iS));
        }
        ImageView imageView8 = this.af;
        if (imageView8 != null) {
            imageView8.setImageResource(this.B.b(arqz.oQ));
        }
        ImageView imageView9 = this.aW;
        if (imageView9 != null) {
            boolean z2 = this.as;
            adxj adxjVar = this.B;
            if (z2) {
                imageView9.setImageResource(adxjVar.b(arqz.eJ));
            } else {
                imageView9.setImageResource(adxjVar.b(arqz.bz));
            }
        }
        this.aq = (NestedScrollListeningFrameLayout) viewInflate.findViewById(R.id.section_list_frame);
        jmm jmmVar = (jmm) this.D.io();
        NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout = this.aq;
        vwt vwtVar = this.aF;
        jlz jlzVar = new jlz(this, i);
        jax jaxVar = (jax) jmmVar.a.io();
        jaxVar.getClass();
        jaz jazVar = (jaz) jmmVar.b.io();
        jazVar.getClass();
        wrp wrpVar = (wrp) jmmVar.c.io();
        wrpVar.getClass();
        kyr kyrVar = (kyr) jmmVar.d.io();
        xgn xgnVar = (xgn) jmmVar.e.io();
        xgnVar.getClass();
        jer jerVar = (jer) jmmVar.f.io();
        jerVar.getClass();
        hhb hhbVar = (hhb) jmmVar.g.io();
        hhbVar.getClass();
        aeod aeodVar = (aeod) jmmVar.h.io();
        aeodVar.getClass();
        ?? Io = jmmVar.i.io();
        Io.getClass();
        vxz vxzVar = (vxz) jmmVar.j.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) jmmVar.k.io();
        vxzVar2.getClass();
        advn advnVar = (advn) jmmVar.l.io();
        advnVar.getClass();
        Executor executor = (Executor) jmmVar.m.io();
        executor.getClass();
        Executor executor2 = (Executor) jmmVar.n.io();
        executor2.getClass();
        ?? Io2 = jmmVar.o.io();
        Io2.getClass();
        ahrn ahrnVar = (ahrn) jmmVar.p.io();
        nestedScrollListeningFrameLayout.getClass();
        vwtVar.getClass();
        this.H = new jml(jaxVar, jazVar, wrpVar, kyrVar, xgnVar, jerVar, hhbVar, aeodVar, Io, vxzVar, vxzVar2, advnVar, executor, executor2, Io2, ahrnVar, nestedScrollListeningFrameLayout, vwtVar, jlzVar);
        o();
        int i5 = this.az;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        if (i6 != 1) {
            int i7 = 3;
            int i8 = 7;
            if (i6 == 2) {
                View view = this.aP;
                if (view != null) {
                    view.setVisibility(8);
                }
                FrameLayout frameLayout2 = this.P;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
                ViewGroup viewGroup2 = this.ac;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ImageView imageView10 = this.ae;
                if (imageView10 != null) {
                    imageView10.setVisibility(0);
                }
                ImageView imageView11 = this.af;
                if (imageView11 != null) {
                    imageView11.setVisibility(8);
                }
                ImageView imageView12 = this.aW;
                if (imageView12 != null) {
                    imageView12.setEnabled(false);
                    this.aW.setVisibility(8);
                }
                if (this.aA.l(265, 45833023L, false) && this.aY != null) {
                    aciz acizVar = this.aH;
                    aedu aeduVarA = aedv.a();
                    aeduVarA.a = 2;
                    aeduVarA.b = 1;
                    aeduVarA.c = 1;
                    aeduVarA.d = 1;
                    acizVar.B(aeduVarA.a(), requireContext(), this.aY);
                    this.aY.setVisibility(0);
                }
                if (this.as) {
                    EditText editText2 = this.ad;
                    if (editText2 != null) {
                        editText2.setInputType(131073);
                        this.ad.setMaxLines(Alert.DURATION_SHOW_INDEFINITELY);
                        this.ad.setHorizontallyScrolling(false);
                        this.ad.setImeOptions(33554434);
                        if (this.ad.getLayoutParams() != null) {
                            this.ad.getLayoutParams().height = -2;
                        }
                        this.ad.setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.conversation_input_size));
                    }
                    if (this.ae != null) {
                        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.text_input_mic_padding_updated);
                        this.ae.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                        ViewParent parent = this.ae.getParent();
                        if (parent instanceof FrameLayout) {
                            FrameLayout frameLayout3 = (FrameLayout) parent;
                            if (frameLayout3.getLayoutParams() != null) {
                                frameLayout3.getLayoutParams().height = -2;
                            }
                            frameLayout3.setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.conversation_input_size));
                        }
                    }
                }
                NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout2 = this.Q;
                if (nestedScrollListeningFrameLayout2 != null) {
                    nestedScrollListeningFrameLayout2.a = new ixe(this, i8);
                }
                if (this.aq != null && this.aA.m(270, 45835641L)) {
                    this.aq.a = new ixe(this, i8);
                }
                FrameLayout frameLayout4 = this.R;
                if (frameLayout4 != null) {
                    aolh aolhVar = this.ap;
                    aolh aolhVar2 = aolh.PANEL_EXPANDED_STYLE_WRAP_CONTENT;
                    if (aolhVar == aolhVar2) {
                        this.G = new jg(this, 10);
                        frameLayout4.getViewTreeObserver().addOnGlobalLayoutListener(this.G);
                        if (this.ap == aolhVar2 && this.E != null && this.ac != null && (frameLayout = this.R) != null && this.Q != null) {
                            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                                ViewGroup.LayoutParams layoutParams3 = this.ac.getLayoutParams();
                                if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                                    ViewGroup.LayoutParams layoutParams5 = this.Q.getLayoutParams();
                                    if (layoutParams5 instanceof FrameLayout.LayoutParams) {
                                        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                                        layoutParams2.removeRule(2);
                                        layoutParams2.height = -2;
                                        this.R.setLayoutParams(layoutParams2);
                                        layoutParams6.height = -2;
                                        this.Q.setLayoutParams(layoutParams6);
                                        layoutParams4.removeRule(12);
                                        layoutParams4.addRule(3, R.id.voice_tips_or_dialog_frame);
                                        this.ac.setLayoutParams(layoutParams4);
                                    }
                                }
                            }
                        }
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(getString(R.string.ask_music_input_disclaimer, "https://support.google.com/youtubemusic/answer/17090260")));
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                int length = uRLSpanArr.length;
                int i9 = 0;
                while (i9 < length) {
                    URLSpan uRLSpan = uRLSpanArr[i9];
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    boolean z3 = z;
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    int i10 = i2;
                    jme jmeVar = new jme(uRLSpan.getURL());
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(jmeVar, spanStart, spanEnd, spanFlags);
                    i9++;
                    z = z3;
                    i2 = i10;
                }
                int i11 = i2;
                TextView textView2 = this.aR;
                if (textView2 != null) {
                    textView2.setText(spannableStringBuilder);
                    this.aR.setMovementMethod(LinkMovementMethod.getInstance());
                    this.aR.setGravity(17);
                }
                jlu jluVar = new jlu(requireContext(), this.ae, this.aS, this.aT, this.ad, this.B.b(arqz.bc), this.B.b(arqz.iS), this.as);
                this.au = jluVar;
                jluVar.h();
                ImageView imageView13 = this.ae;
                if (imageView13 != null) {
                    imageView13.setOnClickListener(new jjc(this, i4));
                }
                final EditText editText3 = this.ad;
                if (editText3 != null) {
                    if (this.as) {
                        final int i12 = tzk.i(editText3.getContext(), R.attr.ytTextDisabled);
                        final int i13 = tzk.i(editText3.getContext(), R.attr.ytOverlayTextSecondary);
                        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: jlx
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view2, boolean z4) {
                                editText3.setHintTextColor(true != z4 ? i13 : i12);
                                if (Build.VERSION.SDK_INT < 30) {
                                    this.a.D();
                                }
                            }
                        });
                    } else {
                        editText3.setOnFocusChangeListener(new gxs(this, i7));
                    }
                    this.ad.addTextChangedListener(new gxv(this, 7));
                }
                ImageView imageView14 = this.af;
                if (imageView14 != null) {
                    imageView14.setOnClickListener(new jjc(this, 9));
                }
                EditText editText4 = this.ad;
                if (editText4 != null) {
                    editText4.setOnEditorActionListener(new jly(this, i));
                }
                ImageView imageView15 = this.aW;
                if (imageView15 != null) {
                    imageView15.setOnClickListener(new jjc(this, 10));
                }
                NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout3 = this.Q;
                if (nestedScrollListeningFrameLayout3 != null) {
                    nestedScrollListeningFrameLayout3.setPadding(0, 0, 0, 0);
                    ViewGroup.LayoutParams layoutParams7 = this.Q.getLayoutParams();
                    if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams7;
                        marginLayoutParams.topMargin = (int) getResources().getDimension(R.dimen.ask_music_top_margin);
                        this.Q.setLayoutParams(marginLayoutParams);
                    }
                }
                aihf aihfVarCreateBuilder = aojl.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aojl aojlVar = (aojl) aihfVarCreateBuilder.instance;
                aojlVar.c |= 2;
                aojlVar.e = "ASK_MUSIC_LEGAL_DISCLAIMER";
                aihfVarCreateBuilder.copyOnWrite();
                aojl aojlVar2 = (aojl) aihfVarCreateBuilder.instance;
                aojlVar2.d = i11;
                aojlVar2.c |= 1;
                aojl aojlVar3 = (aojl) aihfVarCreateBuilder.build();
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihhVar.e(aojl.b, aojlVar3);
                this.k.a((ajwo) aihhVar.build());
                this.C.isPresent();
            } else if (i6 == 3) {
                View viewFindViewById = viewInflate.findViewById(R.id.voice_microphone_view);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
                ImageView imageView16 = this.aX;
                if (imageView16 != null) {
                    imageView16.setOnClickListener(new jjc(this, 6));
                    this.aX.setEnabled(true);
                    this.aX.setVisibility(0);
                }
                View viewFindViewById2 = viewInflate.findViewById(R.id.voice_search_background);
                if (viewFindViewById2 != null && getActivity() != null && !this.at) {
                    viewFindViewById2.setBackgroundColor(getActivity().getColor(R.color.yt_black4));
                }
                FrameLayout frameLayout5 = this.P;
                if (frameLayout5 != null) {
                    frameLayout5.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView = (LottieAnimationView) viewInflate.findViewById(R.id.sound_search_button);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setOnClickListener(new jjc(this, i8));
                }
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) viewInflate.findViewById(R.id.sound_search_ring);
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) viewInflate.findViewById(R.id.sound_search_pulse);
                LottieAnimationView lottieAnimationView4 = (LottieAnimationView) viewInflate.findViewById(R.id.sound_search_background);
                TextView textView3 = (TextView) viewInflate.findViewById(R.id.sound_search_search_again);
                TextView textView4 = (TextView) viewInflate.findViewById(R.id.sound_search_state_text);
                if (lottieAnimationView2 != null && lottieAnimationView3 != null && lottieAnimationView != null && lottieAnimationView4 != null) {
                    this.au = new jlt(requireContext(), lottieAnimationView2, lottieAnimationView3, lottieAnimationView, lottieAnimationView4, textView3, textView4, this.t);
                }
            }
        } else {
            View viewFindViewById3 = viewInflate.findViewById(R.id.voice_microphone_view);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setOnClickListener(new jjc(this, 11));
            }
            this.au = new jlr(requireContext(), viewFindViewById3, this.B.b(arqz.bc), this.B.b(arqz.iS));
        }
        H(getResources().getConfiguration());
        if (this.aA.m(166, 45642684L) && this.az == 2) {
            this.I = new aefv(this.aD, this.k, this.A);
            axlj axljVar = this.aE;
            String packageName = requireContext().getPackageName();
            String strN = aedi.n();
            boolean zIsEmpty = strN.isEmpty();
            String strO = aedi.o();
            String strCl = (zIsEmpty || strO.isEmpty()) ? "en-US" : a.cl(strO, (byte) 45, strN);
            aejd aejdVar = (aejd) axljVar.a.io();
            aejdVar.getClass();
            lqa lqaVar = (lqa) axljVar.b.io();
            lqaVar.getClass();
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) axljVar.c.io();
            scheduledExecutorService.getClass();
            packageName.getClass();
            this.bf = new ahgb(aejdVar, lqaVar, scheduledExecutorService, packageName, strCl);
        }
        return viewInflate;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        this.aP = null;
        this.P = null;
        this.V = null;
        this.T = null;
        this.U = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.ac = null;
        this.ad = null;
        this.aR = null;
        this.ae = null;
        this.aS = null;
        this.af = null;
        this.aW = null;
        this.aU = null;
        this.aV = null;
        this.aY = null;
        this.aZ = null;
        NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout = this.aq;
        if (nestedScrollListeningFrameLayout != null) {
            nestedScrollListeningFrameLayout.a = null;
            this.aq = null;
        }
        FrameLayout frameLayout = this.R;
        if (frameLayout != null && this.G != null) {
            frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.G);
            this.G = null;
        }
        this.R = null;
        aevw aevwVar = this.E;
        if (aevwVar != null && this.F != null) {
            aevwVar.a().D(this.F);
            this.F = null;
        }
        this.E = null;
        NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout2 = this.Q;
        if (nestedScrollListeningFrameLayout2 != null) {
            kro.X(nestedScrollListeningFrameLayout2, this.r.a);
            this.Q.a = null;
            this.Q = null;
        }
        z();
        this.S = null;
        jls jlsVar = this.au;
        if (jlsVar != null) {
            jlsVar.a();
            this.au = null;
        }
        aeke aekeVar = this.bd;
        if (aekeVar != null) {
            aekeVar.t = null;
            this.bd = null;
        }
        this.C.isPresent();
        jml jmlVar = this.H;
        if (jmlVar != null) {
            jmlVar.h = null;
            jmlVar.i = null;
            jmlVar.k = false;
            jmlVar.l = 0;
            jmlVar.c.b(3);
            if (jmlVar.n.k(45859825L, false)) {
                jmlVar.b.i();
            }
            aecp aecpVar = jmlVar.f;
            if (aecpVar != null) {
                aecpVar.a();
            }
            this.H = null;
        }
        super.onDestroyView();
    }

    @Override // defpackage.cc
    public final void onPause() {
        N();
        this.l.t();
        super.onPause();
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02f2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.cc
    public final void onResume() {
        ListenableFuture listenableFutureN;
        jmg jmgVar;
        ViewGroup viewGroup;
        super.onResume();
        int iC = avg.c(requireContext(), "android.permission.RECORD_AUDIO");
        ajwo ajwoVar = this.aa;
        if (ajwoVar == null) {
            dismiss();
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apym.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        int i = 0;
        int i2 = 1;
        boolean z = iC == 0;
        apym apymVar = (apym) objC;
        if (!z && !this.aO && (this.az == 4 || apymVar.j)) {
            y();
            this.aO = true;
            return;
        }
        int i3 = this.az;
        int i4 = 2;
        if (i3 == 2) {
            if (!z) {
                dismiss();
                return;
            }
            i3 = 2;
        }
        byte[] bArr = null;
        if (i3 == 0) {
            throw null;
        }
        int i5 = i3 - 1;
        if (i5 == 1) {
            this.l.b(xhb.a(22678), this.aa, null);
            this.l.l(new xgj(xhb.b(62943)));
        } else if (i5 == 2) {
            this.l.b(xhb.a(198313), this.aa, null);
            this.l.l(new xgj(xhb.b(217900)));
            this.l.l(new xgj(xhb.b(217901)));
            this.l.l(new xgj(xhb.b(217902)));
        } else if (i5 == 3) {
            this.l.b(xhb.a(189810), this.aa, null);
            this.l.l(new xgj(xhb.b(189808)));
            this.l.l(new xgj(xhb.b(261068)));
        }
        this.l.l(new xgj(xhb.b(22156)));
        x("voz_vp");
        if (this.az == 3) {
            G(anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_ZERO_STATE);
        }
        if (this.aA.m(166, 45642684L) && this.az == 2) {
            ahgb ahgbVar = this.bf;
            if (ahgbVar != null) {
                String str = (String) ahgbVar.b;
                if (str.hashCode() == 1713433253 && str.equals("com.google.android.apps.youtube.music")) {
                    Object obj = ahgbVar.d;
                    aprv aprvVar = aprv.SETTING_CAT_MUSIC_TOP_LEVEL;
                    aprw aprwVar = aprw.MUSIC_VOICE_LANGUAGE;
                    aejd aejdVar = (aejd) obj;
                    aejdVar.c = aprvVar;
                    aejdVar.d = aprwVar;
                }
                aejd aejdVar2 = (aejd) ahgbVar.d;
                zwb zwbVar = aejdVar2.b;
                afxd afxdVarF = afxd.f(aejdVar2.a.e(zwbVar.u() ? aeom.a(zwbVar.e().k()) : aeom.b("SignedOutID")));
                aekb aekbVar = new aekb(ahgbVar, i2);
                ?? r11 = ahgbVar.a;
                afxd afxdVarC = afxdVarF.h(aekbVar, r11).c(aeon.class, new aekb(ahgbVar, i), MoreExecutors.directExecutor());
                ListenableFuture listenableFutureAs = ahno.as(((lqa) ahgbVar.e).C(), new aekb(ahgbVar, i4), r11);
                taf.k(this, ahno.av(listenableFutureAs, afxdVarC).l(new wan(listenableFutureAs, afxdVarC, 16, bArr), MoreExecutors.directExecutor()), new iny(this, 17), new iny(this, 18));
            }
            listenableFutureN = ahng.u(((lqa) this.x.io()).C(), 300L, TimeUnit.MILLISECONDS, this.u);
        } else {
            listenableFutureN = ahng.n("");
        }
        ListenableFuture listenableFuture = listenableFutureN;
        aelo aeloVar = new aelo(this, this.aQ && z, apymVar, i2);
        if (!this.aQ || this.az != 3 || !apymVar.e.isEmpty()) {
            taf.l(this, listenableFuture, new iny(aeloVar, 19), aeloVar);
        }
        if (this.aQ && this.az == 3) {
            if (this.ai != null && !this.at) {
                int i6 = getResources().getConfiguration().orientation;
                LottieAnimationView lottieAnimationView = this.ai;
                if (i6 == 1) {
                    lottieAnimationView.h(R.raw.ask_music_zero_state_portrait);
                } else {
                    lottieAnimationView.h(R.raw.ask_music_zero_state_landscape);
                }
                this.ai.setVisibility(0);
            }
            int i7 = this.be;
            if (i7 == 7) {
                F(R.string.ask_about_your_listening_prompt);
            } else if (i7 == 9) {
                F(R.string.tell_us_what_you_like_prompt);
            } else {
                F(true != this.as ? R.string.ask_any_way_you_like_prompt : R.string.ask_anything_prompt);
            }
            if (this.ad == null || apymVar.e.isEmpty()) {
                int i8 = this.be;
                if (i8 == 3 || i8 == 6) {
                    F(R.string.multi_turn_input_prompt);
                } else {
                    EditText editText = this.ad;
                    if (editText != null && this.ap != aolh.PANEL_EXPANDED_STYLE_WRAP_CONTENT && i8 != 12) {
                        editText.requestFocus();
                        Window window = requireActivity().getWindow();
                        if (window != null) {
                            new zf(window, this.ad).f();
                        }
                    }
                }
            } else {
                this.ad.setText((String) aguu.J(agfm.b('\n').f(apymVar.e), ""));
            }
            if (this.be == 10 && (viewGroup = this.ac) != null) {
                viewGroup.setVisibility(8);
            }
            if (apymVar.e.isEmpty()) {
                jmgVar = this;
                jmgVar.E(S(""), new jlz(this, i4), new gyr(jmgVar, listenableFuture, aeloVar, 4, (byte[]) null));
                LoadingFrameLayout loadingFrameLayout = jmgVar.am;
                if (loadingFrameLayout != null) {
                    loadingFrameLayout.setVisibility(0);
                    jmgVar.am.h(2);
                }
            } else {
                jmgVar = this;
            }
        } else {
            jmgVar = this;
        }
        jmgVar.aQ = false;
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        bundle.putBoolean("key_first_open", this.aQ);
        ajwo ajwoVar = this.aa;
        if (ajwoVar != null) {
            bundle.putByteArray("key_start_command", ajwoVar.toByteArray());
        }
        bundle.putByteArray("key_searchbox_stats", this.aN);
        bundle.putBoolean("key_permission_requested", this.aO);
        bundle.putByteArray("key_opaque_conversation_token", this.O.G());
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        aevw aevwVar;
        View viewFindViewById;
        super.onStart();
        if (!this.at || (aevwVar = this.E) == null || (viewFindViewById = aevwVar.findViewById(R.id.design_bottom_sheet)) == null) {
            return;
        }
        viewFindViewById.setBackgroundResource(R.drawable.voice_plate_background);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    public final void p() {
        if (this.az == 3) {
            u();
        }
        dd parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        cw cwVar = (cw) parentFragmentManager.l.get("voiceSearchDismissed");
        if (cwVar != null) {
            boc bocVar = cwVar.a;
            if (bocVar.a().a(bob.d)) {
                cwVar.b.a();
            } else {
                parentFragmentManager.k.put("voiceSearchDismissed", bundle);
            }
        } else {
            parentFragmentManager.k.put("voiceSearchDismissed", bundle);
        }
        if (dd.aa(2)) {
            bundle.toString();
        }
        super.dismiss();
    }

    public final void q() {
        ajwo ajwoVar = this.aa;
        if (ajwoVar == null) {
            p();
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apym.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apym apymVar = (apym) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if ((apymVar.c & SemanticState.Focused) != 0) {
            vxe vxeVar = this.k;
            ajwo ajwoVar2 = apymVar.k;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            vxeVar.a(ajwoVar2);
            p();
            return;
        }
        if (!P()) {
            p();
            return;
        }
        u();
        this.ah = true;
        jmf jmfVar = new jmf(this);
        acwq acwqVar = this.ay;
        acwf acwfVarT = acww.t();
        acwfVarT.a = getString(R.string.leave_ask_music_confirm_title);
        acfz.z(acwfVarT, getString(R.string.leave_ask_music_confirm_msg));
        ajnf ajnfVar = ajnf.a;
        aihh aihhVar = (aihh) ajnfVar.createBuilder();
        alay alayVarD = ackj.d(getString(R.string.leave_ask_music_confirm_button));
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        alayVarD.getClass();
        ajnfVar2.m = alayVarD;
        ajnfVar2.b |= 64;
        aihhVar.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
        ajnfVar3.d = 42;
        ajnfVar3.c = 1;
        acwfVarT.c = (ajnf) aihhVar.build();
        aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
        alay alayVarD2 = ackj.d(getString(R.string.leave_ask_music_cancel_button));
        aihhVar2.copyOnWrite();
        ajnf ajnfVar4 = (ajnf) aihhVar2.instance;
        alayVarD2.getClass();
        ajnfVar4.m = alayVarD2;
        ajnfVar4.b |= 64;
        aihhVar2.copyOnWrite();
        ajnf ajnfVar5 = (ajnf) aihhVar2.instance;
        ajnfVar5.d = 39;
        ajnfVar5.c = 1;
        acwfVarT.d = (ajnf) aihhVar2.build();
        acwfVarT.f = jmfVar;
        acwqVar.f(acwfVarT.a());
    }

    public final void r(boolean z) {
        if (z != this.bb) {
            this.bb = z;
            ImageView imageView = this.aW;
            if (imageView != null) {
                imageView.setEnabled(z);
                this.aW.setVisibility(true != z ? 8 : 0);
            }
            int i = true != z ? 2 : 1;
            dsi dsiVar = new dsi();
            dsiVar.P(0);
            dsiVar.O(new drn());
            dsiVar.O(new drp(i));
            ViewGroup viewGroup = this.ac;
            if (viewGroup != null) {
                dse.b(viewGroup, dsiVar);
            }
        }
    }

    public final void s() {
        FrameLayout frameLayout;
        this.l.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(217902)), null);
        EditText editText = this.ad;
        if (editText != null) {
            String string = editText.getText().toString();
            if (TextUtils.getTrimmedLength(string) > 0) {
                NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout = this.aq;
                if (nestedScrollListeningFrameLayout != null && this.H != null && nestedScrollListeningFrameLayout.getVisibility() == 0) {
                    this.H.c(string);
                }
                r(false);
                I(false);
                ImageView imageView = this.af;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                G(anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_LOADING);
                if (this.at && (frameLayout = this.S) != null) {
                    frameLayout.setVisibility(8);
                }
                E(S(string), new iny(this, 20), new jlz(this, 1));
            }
        }
    }

    public final void t(allk allkVar) {
        alxu alxuVar;
        alxu alxuVar2;
        alxu alxuVar3 = null;
        if ((allkVar.b & 4) != 0) {
            this.l.l(new xgj(allkVar.d, (amud) null));
        }
        if ((allkVar.b & 65536) != 0) {
            aihh aihhVar = (aihh) aoda.a.createBuilder();
            allg allgVar = allkVar.g;
            if (allgVar == null) {
                allgVar = allg.a;
            }
            alay alayVar = allgVar.b;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            aihhVar.copyOnWrite();
            aoda aodaVar = (aoda) aihhVar.instance;
            alayVar.getClass();
            aodaVar.c = alayVar;
            aodaVar.b |= 1;
            this.n.c(vvr.a((aoda) aihhVar.build()));
            this.p.q(48);
            return;
        }
        ajwo ajwoVar = allkVar.f;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        ajwo ajwoVar2 = ajwoVar;
        ajwo ajwoVar3 = allkVar.f;
        if (ajwoVar3 == null) {
            ajwoVar3 = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
        ajwoVar3.c(aihlVarCheckIsLite);
        boolean zN = ajwoVar3.j.n(aihlVarCheckIsLite.d);
        if ((allkVar.b & 8) != 0) {
            this.O = allkVar.e;
        }
        if (zN) {
            TextView textView = this.T;
            String string = textView == null ? "" : textView.getText().toString();
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apni.a);
            ajwoVar2.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
            aihh aihhVar2 = (aihh) ((apng) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
            aihhVar2.copyOnWrite();
            apng apngVar = (apng) aihhVar2.instance;
            string.getClass();
            apngVar.b |= SemanticState.Modal;
            apngVar.h = string;
            if (this.aB.l(0, 45712947L, false)) {
                alxr alxrVar = alxr.SEARCH_PAGE_TYPE_LANDING;
                aihhVar2.copyOnWrite();
                apng apngVar2 = (apng) aihhVar2.instance;
                apngVar2.d = alxrVar.i;
                apngVar2.b |= 2;
            }
            if (this.az == 4) {
                try {
                    byte[] bArr = this.aN;
                    if (bArr == null) {
                        alxuVar = alxu.a;
                    } else {
                        alxuVar = (alxu) aihn.parseFrom(alxu.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                    }
                    aihf builder = alxuVar.toBuilder();
                    builder.copyOnWrite();
                    alxu alxuVar4 = (alxu) builder.instance;
                    alxuVar4.f = 35;
                    alxuVar4.b |= 16;
                    alxuVar2 = (alxu) builder.build();
                    alxuVar3 = alxuVar2;
                } catch (aiik e) {
                    ((agrc) ((agrc) ((agrc) aM.c()).j(e)).k("com/google/android/apps/youtube/music/voice/views/VoiceSearchFragment", "handleResponse", (char) 2392, "VoiceSearchFragment.java")).t("Failed to parse SearchboxStats");
                }
            } else {
                byte[] bArr2 = this.aN;
                if (bArr2 != null && bArr2.length > 0) {
                    try {
                        alxuVar2 = (alxu) aihn.parseFrom(alxu.a, bArr2, ExtensionRegistryLite.getGeneratedRegistry());
                        alxuVar3 = alxuVar2;
                    } catch (aiik e2) {
                        ((agrc) ((agrc) ((agrc) aM.c()).j(e2)).k("com/google/android/apps/youtube/music/voice/views/VoiceSearchFragment", "handleResponse", (char) 2400, "VoiceSearchFragment.java")).t("Failed to parse SearchboxStats");
                    }
                }
            }
            if (alxuVar3 != null) {
                aihhVar2.e(apnd.b, alxuVar3);
            }
            aihh aihhVar3 = (aihh) ajwoVar2.toBuilder();
            aihhVar3.e(apni.a, (apng) aihhVar2.build());
            ajwoVar2 = (ajwo) aihhVar3.build();
        } else {
            this.p.q(48);
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apym.b);
        ajwoVar2.c(aihlVarCheckIsLite3);
        if (ajwoVar2.j.n(aihlVarCheckIsLite3.d)) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apym.b);
            ajwoVar2.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
            apym apymVar = (apym) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
            if (!apymVar.m.isEmpty()) {
                this.ao = apymVar.m;
            }
            int i = apymVar.h;
            int iP = aext.p(i);
            if (iP != 0 && iP != 1) {
                int iP2 = aext.p(i);
                this.be = iP2 != 0 ? iP2 : 1;
            }
        }
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apym.b);
        ajwoVar2.c(aihlVarCheckIsLite5);
        if (!ajwoVar2.j.n(aihlVarCheckIsLite5.d)) {
            dismiss();
        }
        this.k.a(n(ajwoVar2));
    }

    public final void u() {
        EditText editText = this.ad;
        if (editText != null) {
            tuk.i(editText);
            this.ad.clearFocus();
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    public final void v(String str) {
        int i;
        String country;
        String simCountryIso;
        aejo aejoVar = this.J;
        if (aejoVar != null) {
            aejoVar.c();
            this.J = null;
        }
        if (this.az != 4) {
            int iBc = a.bc(this.aC.f().d);
            i = iBc == 0 ? 1 : iBc;
        } else {
            i = this.aA.l(195, 45711448L, false) ? 4 : 2;
        }
        String strT = TextUtils.isEmpty(str) ? T() : str;
        aejq aejqVar = this.m;
        qcb qcbVar = this.aK;
        qcb qcbVar2 = this.aJ;
        byte[] bArr = this.aN;
        String strT2 = T();
        CronetEngine cronetEngine = (CronetEngine) aejqVar.b.io();
        cronetEngine.getClass();
        rly rlyVar = (rly) aejqVar.c.io();
        rlyVar.getClass();
        abxv abxvVar = (abxv) aejqVar.d.io();
        abxvVar.getClass();
        wjr wjrVar = (wjr) aejqVar.e.io();
        wjrVar.getClass();
        ((vxu) aejqVar.f.io()).getClass();
        ((vyo) aejqVar.g.io()).getClass();
        zwb zwbVar = (zwb) aejqVar.h.io();
        zwbVar.getClass();
        ci ciVar = (ci) aejqVar.a.io();
        ciVar.getClass();
        Executor executor = (Executor) aejqVar.i.io();
        executor.getClass();
        Handler handler = (Handler) aejqVar.j.io();
        handler.getClass();
        String str2 = (String) aejqVar.k.io();
        str2.getClass();
        vxz vxzVar = (vxz) aejqVar.l.io();
        vxzVar.getClass();
        mbc mbcVar = (mbc) aejqVar.m.io();
        mbcVar.getClass();
        ahey aheyVar = (ahey) aejqVar.n.io();
        aheyVar.getClass();
        qcbVar.getClass();
        qcbVar2.getClass();
        strT.getClass();
        bArr.getClass();
        aejp aejpVar = new aejp(cronetEngine, rlyVar, abxvVar, wjrVar, zwbVar, ciVar, executor, handler, str2, vxzVar, mbcVar, aheyVar, qcbVar, qcbVar2, strT, bArr, i, strT2);
        jnj jnjVar = this.aC;
        aejpVar.s = (jnjVar.f().b & 64) != 0 ? agev.i(jnjVar.f().e) : agdf.a;
        String str3 = this.aC.f().f;
        agev agevVarI = str3.isEmpty() ? agdf.a : agev.i(str3);
        if (agevVarI.g()) {
            aejpVar.t = (String) agevVarI.c();
        }
        aejpVar.q = !TextUtils.isEmpty(str);
        anpk anpkVar = this.o.b().h;
        if (anpkVar == null) {
            anpkVar = anpk.a;
        }
        anpn anpnVar = anpkVar.h;
        if (anpnVar == null) {
            anpnVar = anpn.a;
        }
        aejpVar.o = anpnVar.g;
        int i2 = this.az;
        if (i2 == 4) {
            aejpVar.p = true;
            TelephonyManager telephonyManager = (TelephonyManager) requireContext().getSystemService("phone");
            if (telephonyManager == null || (simCountryIso = telephonyManager.getSimCountryIso()) == null || simCountryIso.length() != 2) {
                String country2 = requireContext().getResources().getConfiguration().getLocales().get(0).getCountry();
                country = (country2 == null || country2.length() != 2) ? Locale.getDefault().getCountry() : country2.toUpperCase(Locale.getDefault());
            } else {
                country = simCountryIso.toUpperCase(Locale.getDefault());
            }
            aejpVar.u = country;
            aejpVar.z = 11;
            this.J = new aejo(aejpVar);
            return;
        }
        if (i2 == 3) {
            aigj aigjVar = this.ab;
            if (aigjVar != null) {
                aejpVar.v = aigjVar;
            } else {
                ajwo ajwoVar = this.aa;
                if (ajwoVar != null) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(apym.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                    aejpVar.v = ((apym) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).g;
                }
            }
            if (!this.O.E()) {
                aejpVar.w = this.O;
            }
        }
        int iBg = a.bg(this.aC.f().c);
        aejpVar.y = iBg == 0 ? 1 : iBg;
        aejpVar.r = 1.0f;
        this.J = new aejo(aejpVar);
    }

    public final void w() {
        B();
        aprb aprbVar = this.av;
        if (aprbVar != null) {
            xgn xgnVar = this.l;
            aeke aekeVar = new aeke();
            aekeVar.n = xgnVar;
            Bundle bundle = new Bundle();
            ahng.aG(bundle, "renderer", aprbVar);
            aekeVar.setArguments(bundle);
            this.bd = aekeVar;
            aekeVar.t = this;
            afpu.e(aekeVar, ((syn) this.z.io()).m(((zwb) this.y.io()).e()));
            this.l.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(95983)), null);
            av avVar = new av(getChildFragmentManager());
            avVar.g(0, this.bd, "VOICE_LANGUAGE_SELECTOR_FRAGMENT", 1);
            avVar.e();
        }
    }

    public final void x(String str) {
        if (this.p.r(48)) {
            this.p.u(str, 48);
        }
    }

    public final void y() {
        jlo jloVarAq = this.bc;
        if (jloVarAq == null) {
            jloVarAq = this.aL.aq(requireActivity());
            this.bc = jloVarAq;
        }
        jloVarAq.c(new jma());
    }

    public final void z() {
        FrameLayout frameLayout = this.S;
        if (frameLayout != null) {
            kro.X(frameLayout, this.at ? admh.b : this.r.a);
        }
    }
}
