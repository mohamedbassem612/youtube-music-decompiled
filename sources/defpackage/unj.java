package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerImageView;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerVideoView;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerViewContainer;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class unj extends uoc implements afnb, afpd, afvj {
    private unn b;
    private Context c;
    private final boh d = new boh(this);
    private final afts e = new afts(this);
    private boolean f;

    @Deprecated
    public unj() {
        qpj.c();
    }

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final unn peer() {
        unn unnVar = this.b;
        if (unnVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return unnVar;
    }

    @Override // defpackage.uoc
    protected final /* bridge */ /* synthetic */ afpu b() {
        return new afpk(this, false);
    }

    @Override // defpackage.viz
    public final void c(cc ccVar) {
        unn unnVarPeer = peer();
        if (unnVarPeer.k != null) {
            av avVar = new av(unnVarPeer.b.getChildFragmentManager());
            avVar.l(ccVar);
            avVar.e();
        }
    }

    @Override // defpackage.viz
    public final void d() {
        peer();
    }

    @Override // defpackage.viz
    public final void e() {
        peer();
    }

    @Override // defpackage.viz
    public final void f(uxi uxiVar, jrr jrrVar, vbu vbuVar) {
        unh unhVar = peer().k;
        if (unhVar != null) {
            if (unhVar.E.l(52, 45704166L, false)) {
                unhVar.m.execute(afwl.i(new mrh(unhVar, uxiVar, jrrVar, vbuVar, 14, (char[]) null)));
                return;
            }
            umf umfVar = unhVar.A;
            umfVar.m(uxiVar);
            umfVar.q(new ahgb((augy) jrrVar.build(), vbuVar));
            unhVar.d.i();
        }
    }

    @Override // defpackage.viz
    public final void g(jrr jrrVar, vja vjaVar) {
        unh unhVar = peer().k;
        if (unhVar != null) {
            PointF pointFS = unhVar.H.s();
            aihf aihfVarCreateBuilder = auhp.a.createBuilder();
            float f = pointFS.x;
            aihfVarCreateBuilder.copyOnWrite();
            auhp auhpVar = (auhp) aihfVarCreateBuilder.instance;
            auhpVar.b |= 1;
            auhpVar.c = f;
            float f2 = pointFS.y;
            aihfVarCreateBuilder.copyOnWrite();
            auhp auhpVar2 = (auhp) aihfVarCreateBuilder.instance;
            auhpVar2.b |= 2;
            auhpVar2.d = f2;
            jrrVar.copyOnWrite();
            augy augyVar = (augy) jrrVar.instance;
            auhp auhpVar3 = (auhp) aihfVarCreateBuilder.build();
            augy augyVar2 = augy.a;
            auhpVar3.getClass();
            augyVar.k = auhpVar3;
            augyVar.b |= 64;
            unhVar.A.q(new ahgb((augy) jrrVar.build(), vjaVar.a, vjaVar.b));
            unhVar.d.i();
        }
    }

    @Override // defpackage.afvj
    public final afwn getAnimationRef() {
        return (afwn) this.e.c;
    }

    @Override // defpackage.uoc, defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        if (this.c == null) {
            this.c = new afpe(this, super.getContext());
        }
        return this.c;
    }

    @Override // defpackage.afpd
    public final Locale getCustomLocale() {
        return aguu.au(this);
    }

    @Override // defpackage.cc, defpackage.bog
    public final boc getLifecycle() {
        return this.d;
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return unn.class;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        this.e.i();
        try {
            super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cc
    public final void onActivityResult(int i, int i2, Intent intent) {
        afvn afvnVarA = this.e.a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            afvnVarA.close();
        } catch (Throwable th) {
            try {
                afvnVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.uoc, defpackage.cc
    public final void onAttach(Context context) {
        this.e.i();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.onAttach(context);
            if (this.b == null) {
                unp unpVar = (unp) aguu.as(this, unp.class);
                afuu afuuVarE = afwt.e(64, unj.class, "CreatePeer");
                try {
                    this.b = unpVar.o();
                    afuuVarE.close();
                    this.b.u = this;
                    super.getLifecycle().b(new afox(this.e, this.d));
                } catch (Throwable th) {
                    try {
                        afuuVarE.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (getActivity() != null) {
                unn unnVar = this.b;
                roq roqVar = unnVar.r;
                ufs ufsVarC = unn.c(unnVar.b);
                uke ukeVar = new uke(ufsVarC);
                ?? r0 = roqVar.a;
                Object objIo = ((awmd) Map.EL.getOrDefault(r0, ufs.CREATION_FLOW_COMMON, new gfy(19))).io();
                objIo.getClass();
                Object objIo2 = ((awmd) Map.EL.getOrDefault(r0, ufsVarC, new gfy(20))).io();
                objIo2.getClass();
                Iterator it = atqq.aj((agke) objIo, (agke) objIo2).iterator();
                while (it.hasNext()) {
                    ((ukf) it.next()).iY(ukeVar);
                }
            }
            bpp parentFragment = getParentFragment();
            if (parentFragment instanceof afvj) {
                afts aftsVar = this.e;
                if (aftsVar.c == null) {
                    aftsVar.g(((afvj) parentFragment).getAnimationRef(), true);
                }
            }
            afty.k();
        } catch (Throwable th3) {
            try {
                afty.k();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.e.i();
        try {
            super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
            unn unnVarPeer = peer();
            if (!unnVarPeer.p.l(56, 45726969L, false)) {
                unj unjVar = unnVarPeer.b;
                unjVar.requireActivity().getOnBackPressedDispatcher().c(unjVar, new unl(unnVarPeer));
            }
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cc
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.e.h(i, i2);
        afty.k();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x06a3 A[Catch: NullPointerException -> 0x0730, IOException | NullPointerException -> 0x0732, all -> 0x0aa2, TRY_ENTER, TryCatch #2 {all -> 0x0aa2, blocks: (B:3:0x000d, B:5:0x0028, B:7:0x002e, B:12:0x0041, B:14:0x0069, B:16:0x0070, B:18:0x0074, B:19:0x0096, B:21:0x020c, B:22:0x0218, B:24:0x024f, B:26:0x0258, B:28:0x025c, B:30:0x0285, B:31:0x028a, B:33:0x02d8, B:34:0x0303, B:36:0x0330, B:38:0x0338, B:39:0x033f, B:41:0x036a, B:43:0x0370, B:45:0x037b, B:51:0x0397, B:53:0x039f, B:55:0x03b1, B:57:0x03bb, B:62:0x03d1, B:64:0x03db, B:66:0x03ea, B:68:0x03f0, B:73:0x0405, B:75:0x0409, B:77:0x0447, B:83:0x047b, B:86:0x048b, B:87:0x04a1, B:89:0x04c2, B:90:0x04c4, B:92:0x04cf, B:94:0x04ff, B:95:0x0508, B:97:0x0517, B:99:0x051f, B:100:0x052d, B:101:0x0583, B:103:0x05a4, B:105:0x05aa, B:106:0x05be, B:108:0x05c4, B:112:0x05d7, B:116:0x05e6, B:118:0x05f8, B:120:0x05fc, B:122:0x0603, B:124:0x060b, B:128:0x0614, B:130:0x0620, B:134:0x0628, B:136:0x063d, B:137:0x0649, B:139:0x0656, B:141:0x065a, B:144:0x0664, B:146:0x067a, B:148:0x067e, B:150:0x0693, B:158:0x06d1, B:165:0x06e8, B:171:0x06f6, B:173:0x0701, B:175:0x070b, B:178:0x071c, B:191:0x0753, B:193:0x075f, B:195:0x0763, B:198:0x0769, B:199:0x0775, B:201:0x0779, B:203:0x077d, B:204:0x08d3, B:206:0x08dd, B:208:0x0905, B:210:0x0909, B:212:0x09f7, B:214:0x0a40, B:216:0x0a46, B:211:0x093e, B:190:0x0737, B:157:0x06a3, B:121:0x05ff, B:115:0x05df, B:111:0x05cf, B:76:0x0441, B:71:0x0401, B:60:0x03cd, B:48:0x0392, B:78:0x044d, B:80:0x0451, B:81:0x0461, B:219:0x0a64, B:221:0x0a6f, B:222:0x0a74, B:224:0x0a7c, B:225:0x0a81, B:227:0x0a85, B:228:0x0a8a, B:229:0x0a99, B:230:0x0a9a, B:231:0x0aa1, B:13:0x0052), top: B:247:0x000d, inners: #1, #6, #9 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x03db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x03f0 A[Catch: aiik -> 0x0400, all -> 0x0aa2, TRY_LEAVE, TryCatch #9 {aiik -> 0x0400, blocks: (B:66:0x03ea, B:68:0x03f0), top: B:254:0x03ea, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0405 A[Catch: all -> 0x0aa2, TryCatch #2 {all -> 0x0aa2, blocks: (B:3:0x000d, B:5:0x0028, B:7:0x002e, B:12:0x0041, B:14:0x0069, B:16:0x0070, B:18:0x0074, B:19:0x0096, B:21:0x020c, B:22:0x0218, B:24:0x024f, B:26:0x0258, B:28:0x025c, B:30:0x0285, B:31:0x028a, B:33:0x02d8, B:34:0x0303, B:36:0x0330, B:38:0x0338, B:39:0x033f, B:41:0x036a, B:43:0x0370, B:45:0x037b, B:51:0x0397, B:53:0x039f, B:55:0x03b1, B:57:0x03bb, B:62:0x03d1, B:64:0x03db, B:66:0x03ea, B:68:0x03f0, B:73:0x0405, B:75:0x0409, B:77:0x0447, B:83:0x047b, B:86:0x048b, B:87:0x04a1, B:89:0x04c2, B:90:0x04c4, B:92:0x04cf, B:94:0x04ff, B:95:0x0508, B:97:0x0517, B:99:0x051f, B:100:0x052d, B:101:0x0583, B:103:0x05a4, B:105:0x05aa, B:106:0x05be, B:108:0x05c4, B:112:0x05d7, B:116:0x05e6, B:118:0x05f8, B:120:0x05fc, B:122:0x0603, B:124:0x060b, B:128:0x0614, B:130:0x0620, B:134:0x0628, B:136:0x063d, B:137:0x0649, B:139:0x0656, B:141:0x065a, B:144:0x0664, B:146:0x067a, B:148:0x067e, B:150:0x0693, B:158:0x06d1, B:165:0x06e8, B:171:0x06f6, B:173:0x0701, B:175:0x070b, B:178:0x071c, B:191:0x0753, B:193:0x075f, B:195:0x0763, B:198:0x0769, B:199:0x0775, B:201:0x0779, B:203:0x077d, B:204:0x08d3, B:206:0x08dd, B:208:0x0905, B:210:0x0909, B:212:0x09f7, B:214:0x0a40, B:216:0x0a46, B:211:0x093e, B:190:0x0737, B:157:0x06a3, B:121:0x05ff, B:115:0x05df, B:111:0x05cf, B:76:0x0441, B:71:0x0401, B:60:0x03cd, B:48:0x0392, B:78:0x044d, B:80:0x0451, B:81:0x0461, B:219:0x0a64, B:221:0x0a6f, B:222:0x0a74, B:224:0x0a7c, B:225:0x0a81, B:227:0x0a85, B:228:0x0a8a, B:229:0x0a99, B:230:0x0a9a, B:231:0x0aa1, B:13:0x0052), top: B:247:0x000d, inners: #1, #6, #9 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0409 A[Catch: all -> 0x0aa2, TryCatch #2 {all -> 0x0aa2, blocks: (B:3:0x000d, B:5:0x0028, B:7:0x002e, B:12:0x0041, B:14:0x0069, B:16:0x0070, B:18:0x0074, B:19:0x0096, B:21:0x020c, B:22:0x0218, B:24:0x024f, B:26:0x0258, B:28:0x025c, B:30:0x0285, B:31:0x028a, B:33:0x02d8, B:34:0x0303, B:36:0x0330, B:38:0x0338, B:39:0x033f, B:41:0x036a, B:43:0x0370, B:45:0x037b, B:51:0x0397, B:53:0x039f, B:55:0x03b1, B:57:0x03bb, B:62:0x03d1, B:64:0x03db, B:66:0x03ea, B:68:0x03f0, B:73:0x0405, B:75:0x0409, B:77:0x0447, B:83:0x047b, B:86:0x048b, B:87:0x04a1, B:89:0x04c2, B:90:0x04c4, B:92:0x04cf, B:94:0x04ff, B:95:0x0508, B:97:0x0517, B:99:0x051f, B:100:0x052d, B:101:0x0583, B:103:0x05a4, B:105:0x05aa, B:106:0x05be, B:108:0x05c4, B:112:0x05d7, B:116:0x05e6, B:118:0x05f8, B:120:0x05fc, B:122:0x0603, B:124:0x060b, B:128:0x0614, B:130:0x0620, B:134:0x0628, B:136:0x063d, B:137:0x0649, B:139:0x0656, B:141:0x065a, B:144:0x0664, B:146:0x067a, B:148:0x067e, B:150:0x0693, B:158:0x06d1, B:165:0x06e8, B:171:0x06f6, B:173:0x0701, B:175:0x070b, B:178:0x071c, B:191:0x0753, B:193:0x075f, B:195:0x0763, B:198:0x0769, B:199:0x0775, B:201:0x0779, B:203:0x077d, B:204:0x08d3, B:206:0x08dd, B:208:0x0905, B:210:0x0909, B:212:0x09f7, B:214:0x0a40, B:216:0x0a46, B:211:0x093e, B:190:0x0737, B:157:0x06a3, B:121:0x05ff, B:115:0x05df, B:111:0x05cf, B:76:0x0441, B:71:0x0401, B:60:0x03cd, B:48:0x0392, B:78:0x044d, B:80:0x0451, B:81:0x0461, B:219:0x0a64, B:221:0x0a6f, B:222:0x0a74, B:224:0x0a7c, B:225:0x0a81, B:227:0x0a85, B:228:0x0a8a, B:229:0x0a99, B:230:0x0a9a, B:231:0x0aa1, B:13:0x0052), top: B:247:0x000d, inners: #1, #6, #9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0441 A[Catch: all -> 0x0aa2, TryCatch #2 {all -> 0x0aa2, blocks: (B:3:0x000d, B:5:0x0028, B:7:0x002e, B:12:0x0041, B:14:0x0069, B:16:0x0070, B:18:0x0074, B:19:0x0096, B:21:0x020c, B:22:0x0218, B:24:0x024f, B:26:0x0258, B:28:0x025c, B:30:0x0285, B:31:0x028a, B:33:0x02d8, B:34:0x0303, B:36:0x0330, B:38:0x0338, B:39:0x033f, B:41:0x036a, B:43:0x0370, B:45:0x037b, B:51:0x0397, B:53:0x039f, B:55:0x03b1, B:57:0x03bb, B:62:0x03d1, B:64:0x03db, B:66:0x03ea, B:68:0x03f0, B:73:0x0405, B:75:0x0409, B:77:0x0447, B:83:0x047b, B:86:0x048b, B:87:0x04a1, B:89:0x04c2, B:90:0x04c4, B:92:0x04cf, B:94:0x04ff, B:95:0x0508, B:97:0x0517, B:99:0x051f, B:100:0x052d, B:101:0x0583, B:103:0x05a4, B:105:0x05aa, B:106:0x05be, B:108:0x05c4, B:112:0x05d7, B:116:0x05e6, B:118:0x05f8, B:120:0x05fc, B:122:0x0603, B:124:0x060b, B:128:0x0614, B:130:0x0620, B:134:0x0628, B:136:0x063d, B:137:0x0649, B:139:0x0656, B:141:0x065a, B:144:0x0664, B:146:0x067a, B:148:0x067e, B:150:0x0693, B:158:0x06d1, B:165:0x06e8, B:171:0x06f6, B:173:0x0701, B:175:0x070b, B:178:0x071c, B:191:0x0753, B:193:0x075f, B:195:0x0763, B:198:0x0769, B:199:0x0775, B:201:0x0779, B:203:0x077d, B:204:0x08d3, B:206:0x08dd, B:208:0x0905, B:210:0x0909, B:212:0x09f7, B:214:0x0a40, B:216:0x0a46, B:211:0x093e, B:190:0x0737, B:157:0x06a3, B:121:0x05ff, B:115:0x05df, B:111:0x05cf, B:76:0x0441, B:71:0x0401, B:60:0x03cd, B:48:0x0392, B:78:0x044d, B:80:0x0451, B:81:0x0461, B:219:0x0a64, B:221:0x0a6f, B:222:0x0a74, B:224:0x0a7c, B:225:0x0a81, B:227:0x0a85, B:228:0x0a8a, B:229:0x0a99, B:230:0x0a9a, B:231:0x0aa1, B:13:0x0052), top: B:247:0x000d, inners: #1, #6, #9 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x044d A[Catch: all -> 0x0aa2, TryCatch #2 {all -> 0x0aa2, blocks: (B:3:0x000d, B:5:0x0028, B:7:0x002e, B:12:0x0041, B:14:0x0069, B:16:0x0070, B:18:0x0074, B:19:0x0096, B:21:0x020c, B:22:0x0218, B:24:0x024f, B:26:0x0258, B:28:0x025c, B:30:0x0285, B:31:0x028a, B:33:0x02d8, B:34:0x0303, B:36:0x0330, B:38:0x0338, B:39:0x033f, B:41:0x036a, B:43:0x0370, B:45:0x037b, B:51:0x0397, B:53:0x039f, B:55:0x03b1, B:57:0x03bb, B:62:0x03d1, B:64:0x03db, B:66:0x03ea, B:68:0x03f0, B:73:0x0405, B:75:0x0409, B:77:0x0447, B:83:0x047b, B:86:0x048b, B:87:0x04a1, B:89:0x04c2, B:90:0x04c4, B:92:0x04cf, B:94:0x04ff, B:95:0x0508, B:97:0x0517, B:99:0x051f, B:100:0x052d, B:101:0x0583, B:103:0x05a4, B:105:0x05aa, B:106:0x05be, B:108:0x05c4, B:112:0x05d7, B:116:0x05e6, B:118:0x05f8, B:120:0x05fc, B:122:0x0603, B:124:0x060b, B:128:0x0614, B:130:0x0620, B:134:0x0628, B:136:0x063d, B:137:0x0649, B:139:0x0656, B:141:0x065a, B:144:0x0664, B:146:0x067a, B:148:0x067e, B:150:0x0693, B:158:0x06d1, B:165:0x06e8, B:171:0x06f6, B:173:0x0701, B:175:0x070b, B:178:0x071c, B:191:0x0753, B:193:0x075f, B:195:0x0763, B:198:0x0769, B:199:0x0775, B:201:0x0779, B:203:0x077d, B:204:0x08d3, B:206:0x08dd, B:208:0x0905, B:210:0x0909, B:212:0x09f7, B:214:0x0a40, B:216:0x0a46, B:211:0x093e, B:190:0x0737, B:157:0x06a3, B:121:0x05ff, B:115:0x05df, B:111:0x05cf, B:76:0x0441, B:71:0x0401, B:60:0x03cd, B:48:0x0392, B:78:0x044d, B:80:0x0451, B:81:0x0461, B:219:0x0a64, B:221:0x0a6f, B:222:0x0a74, B:224:0x0a7c, B:225:0x0a81, B:227:0x0a85, B:228:0x0a8a, B:229:0x0a99, B:230:0x0a9a, B:231:0x0aa1, B:13:0x0052), top: B:247:0x000d, inners: #1, #6, #9 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0451 A[Catch: all -> 0x0aa2, TryCatch #2 {all -> 0x0aa2, blocks: (B:3:0x000d, B:5:0x0028, B:7:0x002e, B:12:0x0041, B:14:0x0069, B:16:0x0070, B:18:0x0074, B:19:0x0096, B:21:0x020c, B:22:0x0218, B:24:0x024f, B:26:0x0258, B:28:0x025c, B:30:0x0285, B:31:0x028a, B:33:0x02d8, B:34:0x0303, B:36:0x0330, B:38:0x0338, B:39:0x033f, B:41:0x036a, B:43:0x0370, B:45:0x037b, B:51:0x0397, B:53:0x039f, B:55:0x03b1, B:57:0x03bb, B:62:0x03d1, B:64:0x03db, B:66:0x03ea, B:68:0x03f0, B:73:0x0405, B:75:0x0409, B:77:0x0447, B:83:0x047b, B:86:0x048b, B:87:0x04a1, B:89:0x04c2, B:90:0x04c4, B:92:0x04cf, B:94:0x04ff, B:95:0x0508, B:97:0x0517, B:99:0x051f, B:100:0x052d, B:101:0x0583, B:103:0x05a4, B:105:0x05aa, B:106:0x05be, B:108:0x05c4, B:112:0x05d7, B:116:0x05e6, B:118:0x05f8, B:120:0x05fc, B:122:0x0603, B:124:0x060b, B:128:0x0614, B:130:0x0620, B:134:0x0628, B:136:0x063d, B:137:0x0649, B:139:0x0656, B:141:0x065a, B:144:0x0664, B:146:0x067a, B:148:0x067e, B:150:0x0693, B:158:0x06d1, B:165:0x06e8, B:171:0x06f6, B:173:0x0701, B:175:0x070b, B:178:0x071c, B:191:0x0753, B:193:0x075f, B:195:0x0763, B:198:0x0769, B:199:0x0775, B:201:0x0779, B:203:0x077d, B:204:0x08d3, B:206:0x08dd, B:208:0x0905, B:210:0x0909, B:212:0x09f7, B:214:0x0a40, B:216:0x0a46, B:211:0x093e, B:190:0x0737, B:157:0x06a3, B:121:0x05ff, B:115:0x05df, B:111:0x05cf, B:76:0x0441, B:71:0x0401, B:60:0x03cd, B:48:0x0392, B:78:0x044d, B:80:0x0451, B:81:0x0461, B:219:0x0a64, B:221:0x0a6f, B:222:0x0a74, B:224:0x0a7c, B:225:0x0a81, B:227:0x0a85, B:228:0x0a8a, B:229:0x0a99, B:230:0x0a9a, B:231:0x0aa1, B:13:0x0052), top: B:247:0x000d, inners: #1, #6, #9 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0461 A[Catch: all -> 0x0aa2, TryCatch #2 {all -> 0x0aa2, blocks: (B:3:0x000d, B:5:0x0028, B:7:0x002e, B:12:0x0041, B:14:0x0069, B:16:0x0070, B:18:0x0074, B:19:0x0096, B:21:0x020c, B:22:0x0218, B:24:0x024f, B:26:0x0258, B:28:0x025c, B:30:0x0285, B:31:0x028a, B:33:0x02d8, B:34:0x0303, B:36:0x0330, B:38:0x0338, B:39:0x033f, B:41:0x036a, B:43:0x0370, B:45:0x037b, B:51:0x0397, B:53:0x039f, B:55:0x03b1, B:57:0x03bb, B:62:0x03d1, B:64:0x03db, B:66:0x03ea, B:68:0x03f0, B:73:0x0405, B:75:0x0409, B:77:0x0447, B:83:0x047b, B:86:0x048b, B:87:0x04a1, B:89:0x04c2, B:90:0x04c4, B:92:0x04cf, B:94:0x04ff, B:95:0x0508, B:97:0x0517, B:99:0x051f, B:100:0x052d, B:101:0x0583, B:103:0x05a4, B:105:0x05aa, B:106:0x05be, B:108:0x05c4, B:112:0x05d7, B:116:0x05e6, B:118:0x05f8, B:120:0x05fc, B:122:0x0603, B:124:0x060b, B:128:0x0614, B:130:0x0620, B:134:0x0628, B:136:0x063d, B:137:0x0649, B:139:0x0656, B:141:0x065a, B:144:0x0664, B:146:0x067a, B:148:0x067e, B:150:0x0693, B:158:0x06d1, B:165:0x06e8, B:171:0x06f6, B:173:0x0701, B:175:0x070b, B:178:0x071c, B:191:0x0753, B:193:0x075f, B:195:0x0763, B:198:0x0769, B:199:0x0775, B:201:0x0779, B:203:0x077d, B:204:0x08d3, B:206:0x08dd, B:208:0x0905, B:210:0x0909, B:212:0x09f7, B:214:0x0a40, B:216:0x0a46, B:211:0x093e, B:190:0x0737, B:157:0x06a3, B:121:0x05ff, B:115:0x05df, B:111:0x05cf, B:76:0x0441, B:71:0x0401, B:60:0x03cd, B:48:0x0392, B:78:0x044d, B:80:0x0451, B:81:0x0461, B:219:0x0a64, B:221:0x0a6f, B:222:0x0a74, B:224:0x0a7c, B:225:0x0a81, B:227:0x0a85, B:228:0x0a8a, B:229:0x0a99, B:230:0x0a9a, B:231:0x0aa1, B:13:0x0052), top: B:247:0x000d, inners: #1, #6, #9 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r4v48, types: [android.content.ComponentCallbacks, java.lang.Object, ulf] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ajwo ajwoVar;
        Enum r2;
        View view;
        Throwable th;
        unf unfVar;
        ukh ukhVarC;
        unf unfVar2;
        boolean z;
        ardq ardqVar;
        byte[] byteArray;
        xpl xplVar;
        asv asvVar;
        this.e.i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            unn unnVarPeer = peer();
            View viewInflate = layoutInflater.inflate(R.layout.image_editor_fragment, viewGroup, false);
            Bundle arguments = unnVarPeer.b.getArguments();
            if (arguments == null || !arguments.containsKey("navigation_endpoint")) {
                ajwoVar = null;
            } else {
                try {
                    ajwoVar = (ajwo) ahng.aA(arguments, "navigation_endpoint", ajwo.a, ExtensionRegistryLite.getGeneratedRegistry());
                } catch (aiik unused) {
                    ajwoVar = null;
                }
            }
            if (ajwoVar != null) {
                ugo ugoVar = new ugo(unnVarPeer.t, xhb.a(156999));
                ugoVar.a = ajwoVar;
                ugoVar.b();
            } else {
                zvp.a(zvn.a, zvm.m, "[Creation][Android][ImageEditor]NavigationEndpoint was null");
                new ugo(unnVarPeer.t, xhb.a(156999)).b();
            }
            unf unfVarD = unnVarPeer.d();
            if (unfVarD != null && unfVarD.j) {
                tym.h(viewInflate.findViewById(R.id.shorts_edit_player_view_wrapper), new tyi(unnVarPeer.b.requireActivity().getResources().getDimensionPixelSize(R.dimen.image_editor_fullscreen_shorts_player_view_bottom_margin), 1), ViewGroup.MarginLayoutParams.class);
            }
            unf unfVarD2 = unnVarPeer.d();
            uni uniVar = unnVarPeer.c;
            roq roqVar = unnVarPeer.s;
            aehs aehsVar = (aehs) uniVar.a.io();
            uxj uxjVar = (uxj) uniVar.c.io();
            uxjVar.getClass();
            ulp ulpVar = (ulp) uniVar.d.io();
            ulpVar.getClass();
            awmd awmdVar = uniVar.e;
            cc ccVar = (cc) ((aupo) uniVar.f).b;
            ccVar.getClass();
            uvx uvxVar = (uvx) uniVar.g.io();
            uvxVar.getClass();
            und undVar = (und) uniVar.h.io();
            undVar.getClass();
            vfq vfqVar = (vfq) uniVar.i.io();
            vfqVar.getClass();
            ((yno) uniVar.j.io()).getClass();
            aefv aefvVar = (aefv) uniVar.k.io();
            aefvVar.getClass();
            aeew aeewVar = (aeew) uniVar.l.io();
            aeewVar.getClass();
            ahey aheyVar = (ahey) uniVar.m.io();
            aheyVar.getClass();
            Executor executor = (Executor) uniVar.n.io();
            executor.getClass();
            umf umfVar = (umf) uniVar.o.io();
            umfVar.getClass();
            uwb uwbVar = (uwb) uniVar.p.io();
            roq roqVar2 = (roq) uniVar.q.io();
            roqVar2.getClass();
            java.util.Map map = (java.util.Map) uniVar.r.io();
            vxz vxzVar = (vxz) uniVar.s.io();
            vxzVar.getClass();
            vjn vjnVar = (vjn) uniVar.t.io();
            vjnVar.getClass();
            vjf vjfVar = (vjf) uniVar.u.io();
            vjfVar.getClass();
            uof uofVar = (uof) uniVar.v.io();
            Context context = (Context) uniVar.w.io();
            context.getClass();
            java.util.Map map2 = (java.util.Map) uniVar.x.io();
            ((aaok) uniVar.y.io()).getClass();
            wbz wbzVar = (wbz) uniVar.z.io();
            wbzVar.getClass();
            zwh zwhVar = (zwh) uniVar.A.io();
            zwhVar.getClass();
            ukp ukpVar = (ukp) uniVar.B.io();
            ukpVar.getClass();
            viewInflate.getClass();
            roqVar.getClass();
            unnVarPeer.k = new unh(aehsVar, uxjVar, ulpVar, awmdVar, ccVar, uvxVar, undVar, vfqVar, aefvVar, aeewVar, aheyVar, executor, umfVar, uwbVar, roqVar2, map, vxzVar, vjnVar, vjfVar, uofVar, context, map2, wbzVar, zwhVar, ukpVar, viewInflate, roqVar, unfVarD2);
            unh unhVar = unnVarPeer.k;
            unhVar.o.h(viewInflate);
            Optional optionalOfNullable = Optional.ofNullable(unhVar.y);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(((unf) optionalOfNullable.get()).i);
            }
            audb audbVar = (audb) optionalOfNullable.orElse(audb.MEDIA_ENGINE_CLIENT_IMAGE_EDITOR);
            ulp ulpVar2 = unhVar.d;
            roq roqVar3 = unhVar.G;
            ShortsPlayerView shortsPlayerView = unhVar.f;
            ShortsPlayerViewContainer shortsPlayerViewContainer = unhVar.g;
            ulx ulxVar = unhVar.i;
            roq roqVar4 = unhVar.F;
            umi umiVar = new umi();
            xrh xrhVar = new xrh();
            xrhVar.a = true;
            xrhVar.c = (byte) (xrhVar.c | 1);
            xrhVar.d(false);
            xrhVar.d(true);
            if (audbVar == null) {
                throw new NullPointerException("Null mediaEngineClient");
            }
            xrhVar.d = audbVar;
            if (xrhVar.c != 3 || (r2 = xrhVar.d) == null) {
                StringBuilder sb = new StringBuilder();
                if ((xrhVar.c & 1) == 0) {
                    sb.append(" shouldPlayAfterInitialization");
                }
                if ((xrhVar.c & 2) == 0) {
                    sb.append(" forcePreviewFrameResolutionToMatchSource");
                }
                if (xrhVar.d == null) {
                    sb.append(" mediaEngineClient");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            ulk ulkVar = new ulk(xrhVar.a, xrhVar.b, (audb) r2);
            ulpVar2.E = shortsPlayerView;
            ulpVar2.L = roqVar3;
            ulpVar2.F = ulxVar;
            ulpVar2.J = roqVar4;
            ulpVar2.H = umiVar;
            uxj uxjVar2 = ulpVar2.h;
            vab vabVar = ulpVar2.i;
            vabVar.i(uxjVar2.m);
            vabVar.o(uxjVar2.q);
            if (!vabVar.j()) {
                vabVar.h(uxjVar2.a);
            }
            vabVar.p((yno) ulpVar2.j.io());
            vabVar.z();
            ulj uljVar = ulpVar2.v;
            ?? I = uljVar.i();
            ull ullVar = new ull(ulpVar2, 0);
            ((uld) I).r = ulkVar;
            ((uld) I).s = ullVar;
            ((uld) I).k = ulkVar.a;
            ((uld) I).c.registerComponentCallbacks(I);
            ((uld) I).u = (Optional) ((uld) I).g.io();
            if (((uld) I).u.isPresent()) {
                afxd.f(((vkr) ((uld) I).f.io()).d).i(new hhi(I, (qxg) ((uld) I).u.get(), 9, null), ((uld) I).e);
            }
            ulpVar2.t = ((uld) uljVar.j()).d;
            int i = 19;
            ulpVar2.m = uljVar.k().l().ag(new jeh(i), new uln(ulpVar2, 13));
            shortsPlayerViewContainer.b = ulxVar;
            if (ulxVar.i == 2 && (asvVar = (asv) shortsPlayerViewContainer.getLayoutParams()) != null) {
                asvVar.c = 17;
                shortsPlayerViewContainer.setLayoutParams(asvVar);
            }
            ugf ugfVar = ulpVar2.y;
            ulpVar2.n = ugfVar.a().ag(new jeh(15), new uln(ugfVar, 0));
            ulpVar2.f.i = new uky();
            uxj uxjVar3 = unhVar.c;
            cc ccVar2 = unhVar.h;
            ufs ufsVar = ufs.CREATION_FLOW_UNKNOWN;
            int i2 = 7;
            if (bundle != null && !uxjVar3.g()) {
                uxjVar3.i = null;
                byte[] byteArray2 = bundle.getByteArray("camera_swazzle_effects_settings_key");
                if (byteArray2 != null) {
                    try {
                        uxjVar3.i = (aqhu) aihn.parseFrom(aqhu.a, byteArray2, ExtensionRegistryLite.getGeneratedRegistry());
                        uxjVar3.a.d(uxjVar3.i);
                    } catch (aiik unused2) {
                        uxjVar3.i = null;
                    }
                    z = false;
                } else {
                    z = true;
                }
                byte[] byteArray3 = bundle.getByteArray("shorts_effect_picker_entry_renderer_key");
                if (byteArray3 != null) {
                    try {
                        uxjVar3.d.kk((apwm) aihn.parseFrom(apwm.a, byteArray3, ExtensionRegistryLite.getGeneratedRegistry()));
                    } catch (aiik unused3) {
                    }
                }
                uxjVar3.k = null;
                byte[] byteArray4 = bundle.getByteArray("shorts_layout_picker_entry_renderer_key");
                if (byteArray4 != null) {
                    try {
                        uxjVar3.k = (apwr) aihn.parseFrom(apwr.a, byteArray4, ExtensionRegistryLite.getGeneratedRegistry());
                        apwr apwrVar = uxjVar3.k;
                        ardqVar = null;
                    } catch (aiik unused4) {
                        ardqVar = null;
                        uxjVar3.k = null;
                    }
                    uxjVar3.j = ardqVar;
                    byteArray = bundle.getByteArray("edit_kazoo_effects_settings_key");
                    if (byteArray != null) {
                        try {
                            uxjVar3.j = (ardq) aihn.parseFrom(ardq.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                        } catch (aiik unused5) {
                        }
                        z = false;
                    }
                    try {
                        if (bundle.containsKey("engagement_panel_list_key")) {
                            uxjVar3.n = ahng.aD(bundle, "engagement_panel_list_key", akuf.a, ExtensionRegistryLite.getGeneratedRegistry());
                            uxjVar3.d();
                        }
                    } catch (aiik unused6) {
                        uxjVar3.n = null;
                    }
                    if (!z) {
                        xplVar = uxjVar3.p;
                        if (ccVar2 != null) {
                            taf.k(ccVar2, afxd.f(((ayq) xplVar.a).i()).g(new sdp(i2), MoreExecutors.directExecutor()).c(IOException.class, new uzh(xplVar, 1), MoreExecutors.directExecutor()), new uny(uxjVar3, 6), new uny(uxjVar3, i2));
                        } else {
                            uxjVar3.a();
                            uxjVar3.c();
                        }
                        uxjVar3.f(uxjVar3.j);
                    } else if (ufsVar == ufs.CREATION_FLOW_VIDEO_THUMBNAIL) {
                        uxjVar3.l.a(uxjVar3.i(), agke.q(arfs.SHORTS_CREATION_PACKAGE_EDIT_THUMBNAIL), uxjVar3);
                    } else {
                        uxh uxhVar = uxjVar3.l;
                        qcb qcbVarI = uxjVar3.i();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(arfs.SHORTS_CREATION_PACKAGE_CAMERA);
                        arrayList.add(arfs.SHORTS_CREATION_PACKAGE_EDIT);
                        uxhVar.a(qcbVarI, arrayList, uxjVar3);
                    }
                } else {
                    ardqVar = null;
                    uxjVar3.j = ardqVar;
                    byteArray = bundle.getByteArray("edit_kazoo_effects_settings_key");
                    if (byteArray != null) {
                        uxjVar3.j = (ardq) aihn.parseFrom(ardq.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                        z = false;
                    }
                    if (bundle.containsKey("engagement_panel_list_key")) {
                        uxjVar3.n = ahng.aD(bundle, "engagement_panel_list_key", akuf.a, ExtensionRegistryLite.getGeneratedRegistry());
                        uxjVar3.d();
                    }
                    if (!z) {
                        xplVar = uxjVar3.p;
                        if (ccVar2 != null) {
                            taf.k(ccVar2, afxd.f(((ayq) xplVar.a).i()).g(new sdp(i2), MoreExecutors.directExecutor()).c(IOException.class, new uzh(xplVar, 1), MoreExecutors.directExecutor()), new uny(uxjVar3, 6), new uny(uxjVar3, i2));
                        } else {
                            uxjVar3.a();
                            uxjVar3.c();
                        }
                        uxjVar3.f(uxjVar3.j);
                    } else if (ufsVar == ufs.CREATION_FLOW_VIDEO_THUMBNAIL) {
                        uxjVar3.l.a(uxjVar3.i(), agke.q(arfs.SHORTS_CREATION_PACKAGE_EDIT_THUMBNAIL), uxjVar3);
                    } else {
                        uxh uxhVar2 = uxjVar3.l;
                        qcb qcbVarI2 = uxjVar3.i();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(arfs.SHORTS_CREATION_PACKAGE_CAMERA);
                        arrayList2.add(arfs.SHORTS_CREATION_PACKAGE_EDIT);
                        uxhVar2.a(qcbVarI2, arrayList2, uxjVar3);
                    }
                }
            } else if (ufsVar == ufs.CREATION_FLOW_VIDEO_THUMBNAIL) {
                uxjVar3.l.a(uxjVar3.i(), agke.q(arfs.SHORTS_CREATION_PACKAGE_EDIT_THUMBNAIL), uxjVar3);
            } else {
                uxh uxhVar3 = uxjVar3.l;
                qcb qcbVarI3 = uxjVar3.i();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(arfs.SHORTS_CREATION_PACKAGE_CAMERA);
                arrayList3.add(arfs.SHORTS_CREATION_PACKAGE_EDIT);
                uxhVar3.a(qcbVarI3, arrayList3, uxjVar3);
            }
            if (bundle != null) {
                byte[] byteArray5 = bundle.getByteArray("intentful_creation_exit_command");
                byte[] byteArray6 = bundle.getByteArray("non_intentful_creation_exit_command");
                if (byteArray5 != null && byteArray6 != null) {
                    try {
                        ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                        ajwo ajwoVar2 = ajwo.a;
                    } catch (aiik unused7) {
                    }
                }
            }
            uvx uvxVar2 = unhVar.B;
            unhVar.a();
            uvxVar2.k();
            uvxVar2.d = true;
            uvxVar2.e = 3;
            ukd ukdVar = unhVar.b;
            ukdVar.e(viewInflate);
            vxz vxzVar2 = unhVar.E;
            if (vxzVar2.l(72, 45791091L, false)) {
                ukdVar.f = unhVar;
            }
            if (vxzVar2.m(12, 45415478L)) {
                vjf vjfVar2 = unhVar.C;
                vjfVar2.f = viewInflate.findViewById(R.id.edit_video_container);
                vjfVar2.g = viewInflate.findViewById(R.id.interactive_sticker_edit_layer);
                vjfVar2.g.setImportantForAccessibility(2);
                vjfVar2.g.setOnClickListener(new vhv(vjfVar2, 3));
                View viewFindViewById = vjfVar2.g.findViewById(R.id.interactive_sticker_edit_layer_done_button);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(new vhv(vjfVar2, 4));
                }
                vjfVar2.h = vjfVar2.g.findViewById(R.id.interactive_sticker_edit_layer_back_button);
                if (vjfVar2.h != null && vjfVar2.q.m()) {
                    View view2 = vjfVar2.h;
                    view2.getClass();
                    view2.setOnClickListener(new vhv(vjfVar2, 5));
                }
                vjfVar2.i = (ViewGroup) vjfVar2.g.findViewById(R.id.sticker_view_container);
                vjfVar2.j = (ViewGroup) vjfVar2.g.findViewById(R.id.button_shelf_container);
                vjfVar2.k = (RecyclerView) vjfVar2.g.findViewById(R.id.theme_picker_paged);
                vjc.c(vjfVar2.k, vjfVar2.b);
                avlr avlrVarH = vjfVar2.c.H();
                ukdVar.getClass();
                ukdVar.d.c(avlrVarH.af(new uln(ukdVar, 18)));
                unhVar.u.d(viewInflate, unhVar.a(), unhVar.G.a, unhVar.g);
            }
            ShortsPlayerView shortsPlayerView2 = unhVar.f;
            shortsPlayerView2.getViewTreeObserver().addOnGlobalLayoutListener(unhVar.x);
            unhVar.D = unnVarPeer;
            avmm avmmVar = unnVarPeer.i;
            avmmVar.c(unnVarPeer.n.b.af(new uln(unnVarPeer, i)));
            if (unfVarD2 != null && unfVarD2.g) {
                avmmVar.c(ukdVar.b.e().af(new uln(unnVarPeer, 20)));
            }
            Uri uriA = unnVarPeer.a();
            if (uriA != null) {
                unj unjVar = unnVarPeer.b;
                Bundle arguments2 = unjVar.getArguments();
                boolean z2 = arguments2 == null ? true : arguments2.getBoolean("input_image_uri_is_external");
                Bundle arguments3 = unjVar.getArguments();
                boolean z3 = arguments3 == null ? true : arguments3.getBoolean("is_editing_enabled");
                unhVar.r.e(unhVar.s.hw());
                float f = (!vxzVar2.l(72, 45791091L, false) || (unfVar2 = unhVar.y) == null) ? unhVar.i.b : unfVar2.b;
                und undVar2 = unhVar.j;
                unf unfVar3 = unhVar.y;
                vfb vfbVarB = undVar2.b(uriA, f, unfVar3 != null && unfVar3.j, z2, null);
                uqc uqcVar = unfVar3 != null ? unfVar3.k : null;
                int i3 = 16;
                if (uqcVar != null) {
                    uof uofVar2 = unhVar.v;
                    View view3 = unhVar.w;
                    view3.getClass();
                    vfbVarB.getClass();
                    uofVar2.b = uqcVar;
                    View viewFindViewById2 = view3.findViewById(R.id.crop_image_editor_button);
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setVisibility(0);
                        viewFindViewById2.setOnClickListener(new jip(uofVar2, vfbVarB, i3));
                    }
                }
                unhVar.n.setVisibility(0);
                vfq vfqVar2 = unhVar.k;
                vfqVar2.c(vfbVarB);
                try {
                    Bitmap bitmapR = nuo.r(unhVar.q, (unfVar3 == null || !unfVar3.g) ? uriA : vfbVarB.a(uriA));
                    shortsPlayerView2.d(bitmapR.getWidth() / bitmapR.getHeight());
                    if (unfVar3 == null || unfVar3.j) {
                        view = viewInflate;
                    } else {
                        vfb vfbVar = (vfb) vfqVar2.b();
                        vfbVar.getClass();
                        if (vxzVar2.l(52, 45704166L, false)) {
                            try {
                                ukhVarC = vfbVar.c();
                                if (ukhVarC == null) {
                                    qtt qttVar = vfbVar.c;
                                    qttVar.getClass();
                                    ukg ukgVar = new ukg();
                                    ukgVar.c((float) qttVar.b());
                                    ukgVar.e((float) qttVar.d());
                                    ukgVar.d((float) qttVar.c());
                                    ukgVar.b((float) qttVar.a());
                                    ukhVarC = ukgVar.a();
                                }
                            } catch (IOException | NullPointerException e) {
                                th = e;
                                view = viewInflate;
                                ((agrc) ((agrc) ((agrc) unh.a.b()).j(th)).k("com/google/android/libraries/youtube/creation/editor/image/ImageEditorController", "setPlayerAspectRatioAndInitialCrop", (char) 502, "ImageEditorController.java")).t("Open image file failed.");
                                zvp.b(zvn.b, zvm.z, "[Creation][Android][ImageEditor] Open image file failed.", th);
                            }
                        } else {
                            qtt qttVar2 = vfbVar.c;
                            qttVar2.getClass();
                            ukg ukgVar2 = new ukg();
                            ukgVar2.c((float) qttVar2.b());
                            ukgVar2.e((float) qttVar2.d());
                            ukgVar2.d((float) qttVar2.c());
                            ukgVar2.b((float) qttVar2.a());
                            ukhVarC = ukgVar2.a();
                        }
                        double d = ukhVarC.a;
                        double d2 = ukhVarC.b;
                        view = viewInflate;
                        try {
                            ahno.F(d >= 0.0d && d <= 1.0d);
                            ahno.F(d2 >= 0.0d && d2 <= 1.0d);
                            shortsPlayerView2.m = d;
                            shortsPlayerView2.n = d2;
                            ulx ulxVar2 = shortsPlayerView2.h;
                            if (ulxVar2 != null) {
                                float f2 = shortsPlayerView2.i;
                                float f3 = ulxVar2.b;
                                if (f2 > f3) {
                                    shortsPlayerView2.m = Math.min(d, 1.0f - (f3 / f2));
                                    shortsPlayerView2.n = 0.0d;
                                } else if (f2 < f3) {
                                    shortsPlayerView2.n = Math.min(d2, 1.0f - (f2 / f3));
                                    shortsPlayerView2.m = 0.0d;
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            th = e;
                            ((agrc) ((agrc) ((agrc) unh.a.b()).j(th)).k("com/google/android/libraries/youtube/creation/editor/image/ImageEditorController", "setPlayerAspectRatioAndInitialCrop", (char) 502, "ImageEditorController.java")).t("Open image file failed.");
                            zvp.b(zvn.b, zvm.z, "[Creation][Android][ImageEditor] Open image file failed.", th);
                        } catch (NullPointerException e3) {
                            e = e3;
                            th = e;
                            ((agrc) ((agrc) ((agrc) unh.a.b()).j(th)).k("com/google/android/libraries/youtube/creation/editor/image/ImageEditorController", "setPlayerAspectRatioAndInitialCrop", (char) 502, "ImageEditorController.java")).t("Open image file failed.");
                            zvp.b(zvn.b, zvm.z, "[Creation][Android][ImageEditor] Open image file failed.", th);
                        }
                    }
                } catch (IOException | NullPointerException e4) {
                    e = e4;
                    view = viewInflate;
                }
                cc ccVar3 = unhVar.h;
                if ((nuo.m(ccVar3.getContext(), uriA) && ((unfVar = unhVar.y) == null || !unfVar.d)) || !z3) {
                    unhVar.z = false;
                    unhVar.e.b();
                    unhVar.b.e = false;
                }
                unf unfVar4 = unhVar.y;
                if (unfVar4 != null && !unfVar4.j) {
                    aeew aeewVar2 = unhVar.p;
                    String string = ccVar3.requireContext().getString(R.string.editor_reposition_hint);
                    aihf aihfVarCreateBuilder = alhq.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    alhq alhqVar = (alhq) aihfVarCreateBuilder.instance;
                    alhqVar.b |= 1;
                    alhqVar.c = "editor_reposition_edu_tooltip";
                    aihf aihfVarCreateBuilder2 = alhn.a.createBuilder();
                    aihf aihfVarCreateBuilder3 = alhj.a.createBuilder();
                    aihh aihhVar = (aihh) alay.a.createBuilder();
                    aihhVar.copyOnWrite();
                    alay alayVar = (alay) aihhVar.instance;
                    string.getClass();
                    alayVar.b |= 1;
                    alayVar.d = string;
                    aihfVarCreateBuilder3.copyOnWrite();
                    alhj alhjVar = (alhj) aihfVarCreateBuilder3.instance;
                    alay alayVar2 = (alay) aihhVar.build();
                    alayVar2.getClass();
                    alhjVar.f = alayVar2;
                    alhjVar.b |= 2;
                    aihfVarCreateBuilder3.copyOnWrite();
                    alhj alhjVar2 = (alhj) aihfVarCreateBuilder3.instance;
                    alhjVar2.b |= 1;
                    alhjVar2.e = true;
                    aihf aihfVarCreateBuilder4 = aiqd.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    aiqd aiqdVar = (aiqd) aihfVarCreateBuilder4.instance;
                    string.getClass();
                    aiqdVar.b |= 2;
                    aiqdVar.c = string;
                    aihfVarCreateBuilder3.copyOnWrite();
                    alhj alhjVar3 = (alhj) aihfVarCreateBuilder3.instance;
                    aiqd aiqdVar2 = (aiqd) aihfVarCreateBuilder4.build();
                    aiqdVar2.getClass();
                    alhjVar3.i = aiqdVar2;
                    alhjVar3.b |= SemanticState.Focused;
                    aihfVarCreateBuilder2.copyOnWrite();
                    alhn alhnVar = (alhn) aihfVarCreateBuilder2.instance;
                    alhj alhjVar4 = (alhj) aihfVarCreateBuilder3.build();
                    alhjVar4.getClass();
                    alhnVar.c = alhjVar4;
                    alhnVar.b = 106514900;
                    aihfVarCreateBuilder.copyOnWrite();
                    alhq alhqVar2 = (alhq) aihfVarCreateBuilder.instance;
                    alhn alhnVar2 = (alhn) aihfVarCreateBuilder2.build();
                    alhnVar2.getClass();
                    alhqVar2.d = alhnVar2;
                    alhqVar2.b |= 2;
                    aihf aihfVarCreateBuilder5 = alhp.a.createBuilder();
                    aihfVarCreateBuilder5.copyOnWrite();
                    alhp alhpVar = (alhp) aihfVarCreateBuilder5.instance;
                    alhpVar.b |= 1;
                    alhpVar.c = 604800L;
                    aihfVarCreateBuilder5.copyOnWrite();
                    alhp alhpVar2 = (alhp) aihfVarCreateBuilder5.instance;
                    alhpVar2.b |= 2;
                    alhpVar2.d = 3L;
                    aihfVarCreateBuilder.copyOnWrite();
                    alhq alhqVar3 = (alhq) aihfVarCreateBuilder.instance;
                    alhp alhpVar3 = (alhp) aihfVarCreateBuilder5.build();
                    alhpVar3.getClass();
                    alhqVar3.g = alhpVar3;
                    alhqVar3.b |= 16;
                    aihf aihfVarCreateBuilder6 = alhr.a.createBuilder();
                    aihfVarCreateBuilder6.copyOnWrite();
                    alhr alhrVar = (alhr) aihfVarCreateBuilder6.instance;
                    alhrVar.c = 1;
                    alhrVar.b |= 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    alhq alhqVar4 = (alhq) aihfVarCreateBuilder.instance;
                    alhr alhrVar2 = (alhr) aihfVarCreateBuilder6.build();
                    alhrVar2.getClass();
                    alhqVar4.h = alhrVar2;
                    alhqVar4.b |= 32;
                    aeewVar2.b((alhq) aihfVarCreateBuilder.build(), unhVar.g, "ShortsPlayerViewContainer", unhVar.G.a);
                }
                unhVar.n.setVisibility(8);
            } else {
                view = viewInflate;
            }
            unj unjVar2 = unnVarPeer.b;
            float dimensionPixelSize = unjVar2.getResources().getDimensionPixelSize(R.dimen.image_editor_toolbar_button_elevation);
            unf unfVarD3 = unnVarPeer.d();
            View view4 = view;
            CreationButtonView creationButtonView = (CreationButtonView) view4.findViewById(R.id.shorts_post_button_icon);
            if (unfVarD3 == null || !unfVarD3.f) {
                TextView textView = (TextView) view4.findViewById(R.id.shorts_post_button_text);
                textView.setAllCaps(true);
                aeaa aeaaVarD = unnVarPeer.q.d(textView);
                String string2 = unjVar2.getContext().getString(R.string.done);
                aihh aihhVar2 = (aihh) ajnf.a.createBuilder();
                aihh aihhVar3 = (aihh) alay.a.createBuilder();
                aihh aihhVar4 = (aihh) alba.a.createBuilder();
                aihhVar4.copyOnWrite();
                alba albaVar = (alba) aihhVar4.instance;
                string2.getClass();
                albaVar.b |= 1;
                albaVar.c = string2;
                aihhVar4.copyOnWrite();
                alba albaVar2 = (alba) aihhVar4.instance;
                albaVar2.b |= 2;
                albaVar2.d = true;
                aihhVar3.f((alba) aihhVar4.build());
                alay alayVar3 = (alay) aihhVar3.build();
                aihhVar2.copyOnWrite();
                ajnf ajnfVar = (ajnf) aihhVar2.instance;
                alayVar3.getClass();
                ajnfVar.m = alayVar3;
                ajnfVar.b |= 64;
                aihhVar2.copyOnWrite();
                ajnf ajnfVar2 = (ajnf) aihhVar2.instance;
                ajnfVar2.d = 41;
                ajnfVar2.c = 1;
                aihhVar2.copyOnWrite();
                ajnf ajnfVar3 = (ajnf) aihhVar2.instance;
                ajnfVar3.k = 1;
                ajnfVar3.b |= 2;
                aeaaVarD.a((ajnf) aihhVar2.build(), null, null);
                aeaaVarD.c = new sug(unnVarPeer, i2);
                view4.findViewById(R.id.shorts_post_button).setVisibility(0);
                creationButtonView.setVisibility(8);
            } else {
                creationButtonView.a(unnVarPeer.h.b(arqz.fL));
                creationButtonView.setContentDescription(unjVar2.getContext().getString(R.string.done));
                creationButtonView.setOnClickListener(new uit(unnVarPeer, 2));
                creationButtonView.findViewById(R.id.editor_tool_button_icon).setElevation(dimensionPixelSize);
                view4.findViewById(R.id.shorts_post_button).setVisibility(8);
                creationButtonView.setVisibility(0);
            }
            roq roqVar5 = unnVarPeer.t;
            ugo ugoVarK = roqVar5.k(xhb.b(146985));
            ugoVarK.h(true);
            ugoVarK.c();
            CreationButtonView creationButtonView2 = (CreationButtonView) view4.findViewById(R.id.shorts_edit_back);
            ugo ugoVarK2 = roqVar5.k(xhb.b(22156));
            ugoVarK2.h(true);
            ugoVarK2.c();
            creationButtonView2.b.getDrawable().setAutoMirrored(true);
            creationButtonView2.setOnClickListener(new uit(unnVarPeer, 3));
            creationButtonView2.findViewById(R.id.editor_tool_button_icon).setElevation(dimensionPixelSize);
            if (unfVarD != null && unfVarD.j) {
                View viewFindViewById3 = view4.findViewById(R.id.shorts_edit_player_view);
                viewFindViewById3.getViewTreeObserver().addOnGlobalLayoutListener(new unm(viewFindViewById3, view4.findViewById(R.id.trash_container)));
            }
            afty.k();
            return view4;
        } catch (Throwable th2) {
            try {
                afty.k();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // defpackage.cc
    public final void onDestroy() {
        afvn afvnVarC = this.e.c();
        try {
            super.onDestroy();
            afvnVarC.close();
        } catch (Throwable th) {
            try {
                afvnVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.content.ComponentCallbacks, java.lang.Object, ulf] */
    @Override // defpackage.cc
    public final void onDestroyView() {
        afvn afvnVarC = this.e.c();
        try {
            super.onDestroyView();
            unn unnVarPeer = peer();
            unh unhVar = unnVarPeer.k;
            if (unhVar != null) {
                ulp ulpVar = unhVar.d;
                ulpVar.k();
                ulpVar.j();
                Object obj = ulpVar.l;
                if (obj != null) {
                    avnr.b((AtomicReference) obj);
                }
                Object obj2 = ulpVar.m;
                if (obj2 != null) {
                    avnr.b((AtomicReference) obj2);
                }
                Object obj3 = ulpVar.n;
                if (obj3 != null) {
                    avnr.b((AtomicReference) obj3);
                }
                ?? I = ulpVar.v.i();
                ((uld) I).c.unregisterComponentCallbacks(I);
                synchronized (((uld) I).i) {
                    try {
                        ((uld) I).A();
                        ((uld) I).w();
                        Optional.empty();
                        ((uld) I).b.clear();
                        ((uld) I).j.clear();
                        ((uld) I).m = true;
                        ((uld) I).n = Duration.ZERO;
                        Optional optional = ((uld) I).u;
                        uhe uheVar = new uhe(I, 4);
                        if (true == optional.isPresent()) {
                            Object obj4 = optional.get();
                            Object obj5 = uheVar.a;
                            try {
                                ((qxg) obj4).close();
                            } catch (Exception e) {
                                ((uld) obj5).s("font_manager_close_failed", e);
                            }
                        }
                        ((uld) I).u = Optional.empty();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                List list = ulpVar.u;
                Collection.EL.stream(list).forEach(new ulo(0));
                list.clear();
                ulpVar.i.d();
                if (ulpVar.P.S()) {
                    ulpVar.e.f();
                }
                ukd ukdVar = unhVar.b;
                ukdVar.d.dispose();
                vkl vklVar = ukdVar.g.a;
                vkr vkrVar = vklVar.l;
                if (vkrVar != null) {
                    vkm vkmVar = vkrVar.a;
                    vkmVar.a.cancel();
                    vkmVar.cancel(true);
                }
                ujp ujpVar = vklVar.k;
                View view = ujpVar.a;
                if (view != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(ujpVar.b);
                    ujpVar.a = null;
                }
                ujpVar.j = null;
                vklVar.p.isPresent();
                if (vklVar.p()) {
                    TextWatcher textWatcher = vklVar.M;
                }
                vklVar.i.dispose();
            }
            unnVarPeer.i.dispose();
            new ugo(unnVarPeer.t, xhb.a(156999)).a();
            afvnVarC.close();
        } catch (Throwable th2) {
            try {
                afvnVarC.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.cc
    public final void onDetach() {
        afvn afvnVarB = this.e.b();
        try {
            super.onDetach();
            this.f = true;
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.uoc, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.e.i();
        try {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(new afpe(this, layoutInflaterOnGetLayoutInflater));
            afty.k();
            return layoutInflaterCloneInContext;
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cc
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        this.e.a("Fragment:onOptionsItemSelected").close();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, ulj] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ulh] */
    @Override // defpackage.cc
    public final void onPause() {
        this.e.i();
        try {
            super.onPause();
            unh unhVar = peer().k;
            if (unhVar != null) {
                unhVar.A.p(unhVar);
                ukd ukdVar = unhVar.b;
                ((uwf) ukdVar.a.io()).a();
                ulp ulpVar = ukdVar.c;
                ulj uljVar = ulpVar.v;
                uljVar.k().x(ulpVar);
                abix abixVar = ulpVar.I;
                if (abixVar.a) {
                    abixVar.a = false;
                    ?? r2 = abixVar.d;
                    r2.k().x(abixVar.c);
                    ((avmm) abixVar.e).b();
                }
                ((uld) uljVar.i()).A();
                ulpVar.A.b.isPresent();
                ulpVar.k();
                ulpVar.j();
                Object obj = ulpVar.l;
                if (obj != null) {
                    avnr.b((AtomicReference) obj);
                }
                ulpVar.w.b();
                ShortsPlayerView shortsPlayerView = ulpVar.E;
                if (shortsPlayerView != null && shortsPlayerView.f != null) {
                    ulx ulxVar = shortsPlayerView.h;
                    if (ulxVar == null || !ulxVar.c) {
                        shortsPlayerView.b.a();
                    }
                    shortsPlayerView.f = null;
                    ult ultVar = shortsPlayerView.e;
                    if (ultVar != null) {
                        AnimatorSet animatorSet = ultVar.c;
                        if (animatorSet.isRunning()) {
                            animatorSet.end();
                        }
                        LottieAnimationView lottieAnimationView = ultVar.a;
                        if (lottieAnimationView.t()) {
                            lottieAnimationView.d();
                            lottieAnimationView.p(0.0f, true);
                        }
                        LottieAnimationView lottieAnimationView2 = ultVar.b;
                        if (lottieAnimationView2.t()) {
                            lottieAnimationView2.d();
                            lottieAnimationView2.p(0.0f, true);
                        }
                    }
                }
                if (!ulpVar.P.S()) {
                    ulpVar.e.f();
                }
                ulpVar.r();
                vdv vdvVar = ulpVar.C;
                Object obj2 = vdvVar.e;
                if (obj2 != null) {
                    avnr.b((AtomicReference) obj2);
                }
                vdvVar.e = null;
            }
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, ulj] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, ulh] */
    @Override // defpackage.cc
    public final void onResume() {
        afvn afvnVarC = this.e.c();
        try {
            super.onResume();
            unh unhVar = peer().k;
            if (unhVar != null) {
                unhVar.A.o(unhVar);
                ukd ukdVar = unhVar.b;
                ulp ulpVar = ukdVar.c;
                ShortsPlayerView shortsPlayerView = ulpVar.E;
                int i = 1;
                if (shortsPlayerView != null) {
                    ulj uljVar = ulpVar.v;
                    roq roqVar = ulpVar.L;
                    roqVar.getClass();
                    aaok aaokVar = ulpVar.P;
                    Executor executor = ulpVar.b;
                    ulx ulxVar = ulpVar.F;
                    ulxVar.getClass();
                    ult ultVar = new ult(ulpVar.E.findViewById(R.id.video_preview_estate));
                    shortsPlayerView.f = uljVar;
                    shortsPlayerView.q = roqVar;
                    shortsPlayerView.r = aaokVar;
                    shortsPlayerView.g = executor;
                    shortsPlayerView.h = ulxVar;
                    shortsPlayerView.e = ultVar;
                    if (ulxVar.c) {
                        ShortsPlayerVideoView shortsPlayerVideoView = shortsPlayerView.b;
                        SurfaceView surfaceView = shortsPlayerVideoView.b;
                        shortsPlayerView.o = new ulu(shortsPlayerView, surfaceView, uljVar);
                        SurfaceHolder.Callback callback = shortsPlayerView.o;
                        shortsPlayerVideoView.a();
                        SurfaceHolder holder = surfaceView.getHolder();
                        callback.getClass();
                        holder.addCallback(callback);
                        surfaceView.setVisibility(0);
                        shortsPlayerVideoView.c = true;
                        shortsPlayerVideoView.e = ulxVar;
                        shortsPlayerVideoView.f = callback;
                    } else {
                        ShortsPlayerVideoView shortsPlayerVideoView2 = shortsPlayerView.b;
                        zkm zkmVar = new zkm(shortsPlayerView, 1);
                        shortsPlayerVideoView2.e = ulxVar;
                        TextureView textureView = shortsPlayerVideoView2.a;
                        textureView.setOpaque(false);
                        textureView.setSurfaceTextureListener(zkmVar);
                        textureView.setVisibility(0);
                    }
                    ShortsPlayerImageView shortsPlayerImageView = shortsPlayerView.d;
                    shortsPlayerImageView.b = ulxVar;
                    shortsPlayerImageView.setVisibility(0);
                }
                ulj uljVar2 = ulpVar.v;
                uljVar2.k().q(ulpVar);
                abix abixVar = ulpVar.I;
                int i2 = 18;
                int i3 = 2;
                if (!abixVar.a) {
                    abixVar.a = true;
                    ?? r5 = abixVar.d;
                    r5.k().q(abixVar.c);
                    ((avmm) abixVar.e).c(r5.k().l().r().af(new usn(new rla(abixVar, 19), i3)));
                    ((roq) abixVar.b).h(new rla(abixVar, i2));
                }
                ulf ulfVarI = uljVar2.i();
                if (((uld) ulfVarI).q != null || ((uld) ulfVarI).o == null || ((uld) ulfVarI).p == null) {
                    if (((uld) ulfVarI).o == null) {
                        ((uld) ulfVarI).s("init_no_surface", null);
                    }
                    if (((uld) ulfVarI).p == null) {
                        ((uld) ulfVarI).s("init_no_output_size", null);
                    }
                } else {
                    ((uld) ulfVarI).r();
                }
                Runnable runnable = ((uld) ulfVarI).s;
                if (runnable != null && ((uld) ulfVarI).o != null) {
                    runnable.run();
                }
                avmm avmmVar = ulpVar.w;
                avmmVar.c(ulpVar.z.a().ag(new uln(ulpVar, 5), new uln(ulpVar, 6)));
                int i4 = 9;
                if (ulpVar.P.O()) {
                    int i5 = 17;
                    avlr avlrVarR = ((avlr) ulpVar.M.b).K(new ugm(new prq(i5), i)).r();
                    avmb avmbVar = ulpVar.c;
                    avmmVar.c(avlrVarR.r().O(avmbVar).ag(new jeh(16), new uln(ulpVar, 7)));
                    axat axatVar = ulpVar.B.b;
                    awov awovVar = awov.a;
                    axeh[] axehVarArr = axeo.a;
                    avmmVar.c(avlh.C(new axei(axatVar, awvi.b.plus(awovVar))).p().L(avmbVar).al(new jeh(i5), new uln(ulpVar, i4)));
                } else {
                    avmmVar.c(ulpVar.i.r().p().L(ulpVar.c).al(new jeh(i2), new uln(ulpVar, 10)));
                }
                ulpVar.q();
                ulpVar.p();
                final vdv vdvVar = ulpVar.C;
                avlr avlrVarE = vdvVar.a.e();
                vds vdsVar = new vds(null, null);
                awer awerVar = new awer(avlrVarE, new avog(vdsVar), new vnc(new akm(i3), i));
                avnn avnnVar = atqp.l;
                vdvVar.e = awerVar.ag(new var(new awqg() { // from class: vdr
                    /* JADX WARN: Type inference failed for: r14v0, types: [awut, java.lang.Object] */
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj) {
                        vdf vdfVarA;
                        aiie aiieVar;
                        vds vdsVar2 = (vds) obj;
                        vdsVar2.getClass();
                        boolean z = vdsVar2.c;
                        aufa aufaVar = vdsVar2.b;
                        vdv vdvVar2 = vdvVar;
                        int i6 = 0;
                        if (z || vdsVar2.d) {
                            int i7 = 1;
                            if (aufaVar != null) {
                                aiie aiieVar2 = aufaVar.k;
                                aiieVar2.getClass();
                                aihl aihlVar = auft.b;
                                aihlVar.getClass();
                                auft auftVar = (auft) yno.gh(aiieVar2, aihlVar);
                                if (auftVar != null) {
                                    if ((auftVar.c & SemanticState.Focused) != 0) {
                                        auhu auhuVar = auftVar.j;
                                        if (auhuVar == null) {
                                            auhuVar = auhu.a;
                                        }
                                        aihf builder = auhuVar.toBuilder();
                                        aigu aiguVar = auhuVar.f;
                                        if (aiguVar == null) {
                                            aiguVar = aigu.a;
                                        }
                                        aigu aiguVarC = aikw.c(Math.min(aikw.b(aiguVar), 15000L));
                                        builder.copyOnWrite();
                                        auhu auhuVar2 = (auhu) builder.instance;
                                        aiguVarC.getClass();
                                        auhuVar2.h = aiguVarC;
                                        auhuVar2.b |= SemanticState.Focused;
                                        auhu auhuVar3 = (auhu) builder.build();
                                        vdf vdfVarA2 = vdg.a();
                                        vdfVarA2.p = auhuVar3;
                                        vdfVarA2.p(auhuVar3.g);
                                        vdfVarA = new vdf(vdfVarA2.a());
                                    } else {
                                        vdfVarA = vdg.a();
                                        vdfVarA.a = (aufaVar.c == 102 ? (auey) aufaVar.d : auey.a).c;
                                        int i8 = aufaVar.c;
                                        if (((i8 == 102 ? (auey) aufaVar.d : auey.a).b & 2) != 0) {
                                            vdfVarA.c = (i8 == 102 ? (auey) aufaVar.d : auey.a).d;
                                        }
                                        auev auevVar = auftVar.f;
                                        if (auevVar == null) {
                                            auevVar = auev.a;
                                        }
                                        if ((auevVar.b & 2) != 0) {
                                            auev auevVar2 = auftVar.f;
                                            if (auevVar2 == null) {
                                                auevVar2 = auev.a;
                                            }
                                            aqmh aqmhVar = auevVar2.d;
                                            if (aqmhVar == null) {
                                                aqmhVar = aqmh.a;
                                            }
                                            vdfVarA.f = aqmhVar;
                                        }
                                        auev auevVar3 = auftVar.f;
                                        if (((auevVar3 == null ? auev.a : auevVar3).b & 1) != 0) {
                                            if (auevVar3 == null) {
                                                auevVar3 = auev.a;
                                            }
                                            vdfVarA.g = auevVar3.c;
                                        }
                                        if ((auftVar.c & 16) != 0) {
                                            vdfVarA.h(auftVar.g);
                                        }
                                        if ((auftVar.c & SemanticState.Hidden) != 0) {
                                            aigu aiguVar2 = auftVar.k;
                                            if (aiguVar2 == null) {
                                                aiguVar2 = aigu.a;
                                            }
                                            aiguVar2.getClass();
                                            vdfVarA.l(aext.v(aiguVar2).toMillis());
                                        }
                                        if ((auftVar.c & 32) != 0) {
                                            aihf aihfVarCreateBuilder = apvm.a.createBuilder();
                                            aihfVarCreateBuilder.getClass();
                                            String str = auftVar.h;
                                            str.getClass();
                                            aihfVarCreateBuilder.copyOnWrite();
                                            apvm apvmVar = (apvm) aihfVarCreateBuilder.instance;
                                            apvmVar.b |= 2;
                                            apvmVar.c = str;
                                            aihn aihnVarBuild = aihfVarCreateBuilder.build();
                                            aihnVarBuild.getClass();
                                            vdfVarA.i = (apvm) aihnVarBuild;
                                        }
                                        if ((auftVar.c & 64) != 0) {
                                            ajwo ajwoVar = auftVar.i;
                                            if (ajwoVar == null) {
                                                ajwoVar = ajwo.a;
                                            }
                                            vdfVarA.o = ajwoVar;
                                        }
                                    }
                                    aiie aiieVar3 = aufaVar.k;
                                    aiieVar3.getClass();
                                    aihl aihlVar2 = aufo.b;
                                    aihlVar2.getClass();
                                    aufo aufoVar = (aufo) yno.gh(aiieVar3, aihlVar2);
                                    ajai ajaiVar = (aufoVar == null || (aiieVar = aufoVar.c) == null) ? null : (ajai) atqq.Z(aiieVar);
                                    if (ajaiVar != null) {
                                        vdfVarA.v = ajaiVar;
                                    }
                                    aigu aiguVar3 = aufaVar.h;
                                    if (aiguVar3 == null) {
                                        aiguVar3 = aigu.a;
                                    }
                                    aiguVar3.getClass();
                                    vdfVarA.p(aext.v(aiguVar3).toMillis());
                                    vdfVarA.q(aufaVar.i);
                                    aigu aiguVar4 = aufaVar.f;
                                    if (aiguVar4 == null) {
                                        aiguVar4 = aigu.a;
                                    }
                                    aiguVar4.getClass();
                                    vdfVarA.n(aext.v(aiguVar4));
                                    aigu aiguVar5 = aufaVar.g;
                                    if (aiguVar5 == null) {
                                        aiguVar5 = aigu.a;
                                    }
                                    aiguVar5.getClass();
                                    Duration durationV = aext.v(aiguVar5);
                                    vdfVarA.m(durationV);
                                    vdfVarA.s(durationV.toMillis());
                                    vdfVarA.a();
                                }
                            }
                            if (aufaVar != null) {
                                aiie aiieVar4 = aufaVar.k;
                                aiieVar4.getClass();
                                aihl aihlVar3 = auft.b;
                                aihlVar3.getClass();
                                auft auftVar2 = (auft) yno.gh(aiieVar4, aihlVar3);
                                if (auftVar2 == null || (auftVar2.c & SemanticState.Focused) == 0) {
                                    ahgb ahgbVar = vdvVar2.h;
                                    qbj qbjVar = new qbj(ahgbVar, aufaVar, (awoq) null, 12);
                                    ?? r14 = ahgbVar.d;
                                    afxd afxdVarF = afxd.f(awrc.ag(r14, awov.a, qbjVar));
                                    afxdVarF.getClass();
                                    afki afkiVar = vdvVar2.c;
                                    ahub ahubVarR = ahub.r(afxdVarF.g(new vdm(new uhd(8), i7), MoreExecutors.directExecutor()));
                                    ahub ahubVar = new ahub(UUID.randomUUID().toString());
                                    umk umkVar = vdvVar2.d;
                                    afkiVar.d(ahubVarR, ahubVar, umkVar);
                                    ugn ugnVar = new ugn(null, "[AddedSoundCmpListener] Inflate video ID asset.", 63);
                                    aeiv aeivVar = vdvVar2.f;
                                    aeivVar.t(ugnVar);
                                    awut awutVar = vdvVar2.b;
                                    awro.t(awutVar, null, 0, new vdu(vdvVar2, afxdVarF, null, 1, null), 3).kJ(new pge(vdvVar2, ugnVar, 15));
                                    if (z || auftVar2 == null || (auftVar2.c & SemanticState.Hidden) == 0) {
                                        afxd afxdVarF2 = afxd.f(awrc.ag(r14, awov.a, new qbj(aufaVar, ahgbVar, (awoq) null, 11)));
                                        afxdVarF2.getClass();
                                        final long j = aufaVar.e;
                                        afkiVar.d(ahub.r(afxdVarF2.g(new vdm(new awqg() { // from class: vdl
                                            /* JADX WARN: Code duplicated, block: B:100:0x01ff  */
                                            /* JADX WARN: Code duplicated, block: B:102:0x0203  */
                                            /* JADX WARN: Code duplicated, block: B:103:0x0206  */
                                            /* JADX WARN: Code duplicated, block: B:164:0x0209 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:167:0x0207 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:169:? A[LOOP:1: B:92:0x01e8->B:169:?, LOOP_END, SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:89:0x01e0  */
                                            /* JADX WARN: Code duplicated, block: B:91:0x01e4  */
                                            /* JADX WARN: Code duplicated, block: B:94:0x01ee  */
                                            /* JADX WARN: Code duplicated, block: B:96:0x01f6  */
                                            /* JADX WARN: Code duplicated, block: B:98:0x01fc  */
                                            @Override // defpackage.awqg
                                            public final Object invoke(Object obj2) {
                                                aiie aiieVar5;
                                                aufa aufaVarH;
                                                aiie<apvn> aiieVar6;
                                                ajai ajaiVar2;
                                                ajai ajaiVarA;
                                                alqv alqvVar = (alqv) obj2;
                                                alqvVar.getClass();
                                                aihf aihfVarCreateBuilder2 = umo.a.createBuilder();
                                                aihfVarCreateBuilder2.getClass();
                                                aihf aihfVarCreateBuilder3 = uml.a.createBuilder();
                                                aihfVarCreateBuilder3.getClass();
                                                aihfVarCreateBuilder3.copyOnWrite();
                                                uml umlVar = (uml) aihfVarCreateBuilder3.instance;
                                                umlVar.b |= 1;
                                                umlVar.c = j;
                                                ajfj ajfjVarFp = yno.fp(alqvVar);
                                                int i9 = 3;
                                                aufa aufaVarH2 = null;
                                                ajaiVar = null;
                                                ajai ajaiVar3 = null;
                                                aufaVarH2 = null;
                                                if (ajfjVarFp != null) {
                                                    aphw aphwVar = (aphw) Collection.EL.stream(ajfjVarFp.c).filter(new uvm(i9)).findFirst().orElse(null);
                                                    if (aphwVar == null) {
                                                        aufaVarH = null;
                                                    } else {
                                                        aihf aihfVarCreateBuilder4 = aufa.a.createBuilder();
                                                        aihfVarCreateBuilder4.getClass();
                                                        aihf aihfVarCreateBuilder5 = auey.a.createBuilder();
                                                        aihfVarCreateBuilder5.getClass();
                                                        String str2 = aphwVar.c;
                                                        str2.getClass();
                                                        atqn.u(str2, aihfVarCreateBuilder5);
                                                        String str3 = aphwVar.e;
                                                        str3.getClass();
                                                        aihfVarCreateBuilder5.copyOnWrite();
                                                        auey aueyVar = (auey) aihfVarCreateBuilder5.instance;
                                                        aueyVar.b |= 2;
                                                        aueyVar.d = str3;
                                                        atqo.m(atqn.t(aihfVarCreateBuilder5), aihfVarCreateBuilder4);
                                                        aigu aiguVar6 = aikw.a;
                                                        aiguVar6.getClass();
                                                        atqo.l(aiguVar6, aihfVarCreateBuilder4);
                                                        apxe apxeVar = aphwVar.f;
                                                        if (apxeVar == null) {
                                                            apxeVar = apxe.a;
                                                        }
                                                        aigu aiguVar7 = apxeVar.b;
                                                        if (aiguVar7 == null) {
                                                            aiguVar7 = aigu.a;
                                                        }
                                                        aiguVar7.getClass();
                                                        atqo.k(aiguVar7, aihfVarCreateBuilder4);
                                                        atqo.r(aihfVarCreateBuilder4);
                                                        aihh aihhVar = (aihh) aufs.a.createBuilder();
                                                        aihhVar.getClass();
                                                        aihl aihlVar4 = auft.b;
                                                        aihlVar4.getClass();
                                                        aihf aihfVarCreateBuilder6 = auft.a.createBuilder();
                                                        aihfVarCreateBuilder6.getClass();
                                                        if ((aphwVar.b & SemanticState.LiveRegion) != 0) {
                                                            apxe apxeVar2 = aphwVar.f;
                                                            if (apxeVar2 == null) {
                                                                apxeVar2 = apxe.a;
                                                            }
                                                            aigu aiguVar8 = apxeVar2.c;
                                                            if (aiguVar8 == null) {
                                                                aiguVar8 = aigu.a;
                                                            }
                                                            aiguVar8.getClass();
                                                            aihfVarCreateBuilder6.copyOnWrite();
                                                            auft auftVar3 = (auft) aihfVarCreateBuilder6.instance;
                                                            auftVar3.d = aiguVar8;
                                                            auftVar3.c |= 1;
                                                            apxe apxeVar3 = aphwVar.f;
                                                            if (apxeVar3 == null) {
                                                                apxeVar3 = apxe.a;
                                                            }
                                                            aigu aiguVar9 = apxeVar3.c;
                                                            if (aiguVar9 == null) {
                                                                aiguVar9 = aigu.a;
                                                            }
                                                            int iB = (int) aikw.b(aiguVar9);
                                                            aihfVarCreateBuilder6.copyOnWrite();
                                                            auft auftVar4 = (auft) aihfVarCreateBuilder6.instance;
                                                            auftVar4.c |= 16;
                                                            auftVar4.g = iB;
                                                        }
                                                        if ((aphwVar.b & SemanticState.Modal) != 0) {
                                                            aigu aiguVar10 = aphwVar.h;
                                                            if (aiguVar10 == null) {
                                                                aiguVar10 = aigu.a;
                                                            }
                                                            aiguVar10.getClass();
                                                            aihfVarCreateBuilder6.copyOnWrite();
                                                            auft auftVar5 = (auft) aihfVarCreateBuilder6.instance;
                                                            auftVar5.k = aiguVar10;
                                                            auftVar5.c |= SemanticState.Hidden;
                                                        }
                                                        if ((aphwVar.b & SemanticState.ReadOnly) != 0) {
                                                            aihf aihfVarCreateBuilder7 = auev.a.createBuilder();
                                                            aihfVarCreateBuilder7.getClass();
                                                            apxa apxaVar = aphwVar.g;
                                                            if (apxaVar == null) {
                                                                apxaVar = apxa.a;
                                                            }
                                                            if ((apxaVar.b & 1) != 0) {
                                                                apxa apxaVar2 = aphwVar.g;
                                                                if (apxaVar2 == null) {
                                                                    apxaVar2 = apxa.a;
                                                                }
                                                                aqmh aqmhVar2 = apxaVar2.c;
                                                                if (aqmhVar2 == null) {
                                                                    aqmhVar2 = aqmh.a;
                                                                }
                                                                aqmhVar2.getClass();
                                                                atqo.t(aqmhVar2, aihfVarCreateBuilder7);
                                                            }
                                                            apxa apxaVar3 = aphwVar.g;
                                                            if (((apxaVar3 == null ? apxa.a : apxaVar3).b & 2) != 0) {
                                                                if (apxaVar3 == null) {
                                                                    apxaVar3 = apxa.a;
                                                                }
                                                                alay alayVar = apxaVar3.d;
                                                                if (alayVar == null) {
                                                                    alayVar = alay.a;
                                                                }
                                                                atqo.u(ackj.k(null, alayVar, null, false).toString(), aihfVarCreateBuilder7);
                                                            }
                                                            atqn.r(atqo.s(aihfVarCreateBuilder7), aihfVarCreateBuilder6);
                                                        }
                                                        if ((aphwVar.b & 65536) != 0) {
                                                            ajwo ajwoVar2 = aphwVar.j;
                                                            if (ajwoVar2 == null) {
                                                                ajwoVar2 = ajwo.a;
                                                            }
                                                            ajwoVar2.getClass();
                                                            aihfVarCreateBuilder6.copyOnWrite();
                                                            auft auftVar6 = (auft) aihfVarCreateBuilder6.instance;
                                                            auftVar6.i = ajwoVar2;
                                                            auftVar6.c |= 64;
                                                        }
                                                        apvm apvmVar2 = aphwVar.d;
                                                        if (apvmVar2 == null) {
                                                            apvmVar2 = apvm.a;
                                                        }
                                                        if ((apvmVar2.b & 2) != 0) {
                                                            apvm apvmVar3 = aphwVar.d;
                                                            if (apvmVar3 == null) {
                                                                apvmVar3 = apvm.a;
                                                            }
                                                            String str4 = apvmVar3.c;
                                                            str4.getClass();
                                                            atqn.s(str4, aihfVarCreateBuilder6);
                                                        }
                                                        aihhVar.e(aihlVar4, atqn.q(aihfVarCreateBuilder6));
                                                        atqo.p(atxy.f(aihhVar), aihfVarCreateBuilder4);
                                                        aufaVarH = atqo.h(aihfVarCreateBuilder4);
                                                    }
                                                    if (aufaVarH != null) {
                                                        aiie aiieVar7 = alqvVar.d;
                                                        if (aiieVar7 == null) {
                                                            aiieVar6 = alqvVar.e;
                                                            if (aiieVar6 != null) {
                                                                while (r13.hasNext()) {
                                                                    if (apvnVar == null) {
                                                                        ajaiVar2 = null;
                                                                    } else {
                                                                        if ((apvnVar.b & SemanticState.ReadOnly) == 0) {
                                                                            apvnVar = null;
                                                                        }
                                                                        if (apvnVar != null) {
                                                                            ajaiVar2 = apvnVar.d;
                                                                            if (ajaiVar2 == null) {
                                                                                ajaiVar2 = ajai.a;
                                                                            }
                                                                        } else {
                                                                            ajaiVar2 = null;
                                                                        }
                                                                    }
                                                                    if (ajaiVar2 != null) {
                                                                        ajaiVar3 = ajaiVar2;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            Iterator<E> it = aiieVar7.iterator();
                                                            do {
                                                                if (!it.hasNext()) {
                                                                    ajaiVarA = null;
                                                                    break;
                                                                }
                                                                ajaiVarA = ugi.a((apvl) it.next());
                                                            } while (ajaiVarA == null);
                                                            if (ajaiVarA == null) {
                                                                aiieVar6 = alqvVar.e;
                                                                if (aiieVar6 != null) {
                                                                    for (apvn apvnVar : aiieVar6) {
                                                                        if (apvnVar == null) {
                                                                            ajaiVar2 = null;
                                                                        } else {
                                                                            if ((apvnVar.b & SemanticState.ReadOnly) == 0) {
                                                                                apvnVar = null;
                                                                            }
                                                                            if (apvnVar != null) {
                                                                                ajaiVar2 = apvnVar.d;
                                                                                if (ajaiVar2 == null) {
                                                                                    ajaiVar2 = ajai.a;
                                                                                }
                                                                            } else {
                                                                                ajaiVar2 = null;
                                                                            }
                                                                        }
                                                                        if (ajaiVar2 != null) {
                                                                            ajaiVar3 = ajaiVar2;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ajaiVar3 = ajaiVarA;
                                                            }
                                                        }
                                                        if (ajaiVar3 != null) {
                                                            aihl aihlVar5 = aufo.b;
                                                            aihlVar5.getClass();
                                                            uwk uwkVar = new uwk(ajaiVar3, 7);
                                                            aihf builder2 = aufaVarH.toBuilder();
                                                            builder2.getClass();
                                                            atqo.r(builder2);
                                                            atqo.q(builder2);
                                                            atqo.r(builder2);
                                                            aiie aiieVar8 = aufaVarH.k;
                                                            aiieVar8.getClass();
                                                            atqo.o(yno.gk(aiieVar8, aihlVar5, uwkVar), builder2);
                                                            aufaVarH2 = atqo.h(builder2);
                                                        } else {
                                                            aufaVarH2 = aufaVarH;
                                                        }
                                                    }
                                                } else if (alqvVar.d.size() > 0) {
                                                    Object obj3 = alqvVar.d.get(0);
                                                    obj3.getClass();
                                                    apvl apvlVar = (apvl) obj3;
                                                    aihf aihfVarCreateBuilder8 = aufa.a.createBuilder();
                                                    aihfVarCreateBuilder8.getClass();
                                                    aihf aihfVarCreateBuilder9 = auey.a.createBuilder();
                                                    aihfVarCreateBuilder9.getClass();
                                                    String str5 = apvlVar.e;
                                                    str5.getClass();
                                                    atqn.u(str5, aihfVarCreateBuilder9);
                                                    atqo.m(atqn.t(aihfVarCreateBuilder9), aihfVarCreateBuilder8);
                                                    aigu aiguVar11 = aikw.a;
                                                    aiguVar11.getClass();
                                                    atqo.l(aiguVar11, aihfVarCreateBuilder8);
                                                    aiguVar11.getClass();
                                                    atqo.k(aiguVar11, aihfVarCreateBuilder8);
                                                    atqo.r(aihfVarCreateBuilder8);
                                                    aufs aufsVar = aufs.a;
                                                    aihh aihhVar2 = (aihh) aufsVar.createBuilder();
                                                    aihhVar2.getClass();
                                                    aihl aihlVar6 = auft.b;
                                                    aihlVar6.getClass();
                                                    aihf aihfVarCreateBuilder10 = auft.a.createBuilder();
                                                    aihfVarCreateBuilder10.getClass();
                                                    if ((apvlVar.b & 1) != 0) {
                                                        aihf aihfVarCreateBuilder11 = auev.a.createBuilder();
                                                        aihfVarCreateBuilder11.getClass();
                                                        apxa apxaVar4 = apvlVar.c;
                                                        if (apxaVar4 == null) {
                                                            apxaVar4 = apxa.a;
                                                        }
                                                        if ((apxaVar4.b & 1) != 0) {
                                                            apxa apxaVar5 = apvlVar.c;
                                                            if (apxaVar5 == null) {
                                                                apxaVar5 = apxa.a;
                                                            }
                                                            aqmh aqmhVar3 = apxaVar5.c;
                                                            if (aqmhVar3 == null) {
                                                                aqmhVar3 = aqmh.a;
                                                            }
                                                            aqmhVar3.getClass();
                                                            atqo.t(aqmhVar3, aihfVarCreateBuilder11);
                                                        }
                                                        apxa apxaVar6 = apvlVar.c;
                                                        if (((apxaVar6 == null ? apxa.a : apxaVar6).b & 2) != 0) {
                                                            if (apxaVar6 == null) {
                                                                apxaVar6 = apxa.a;
                                                            }
                                                            alay alayVar2 = apxaVar6.d;
                                                            if (alayVar2 == null) {
                                                                alayVar2 = alay.a;
                                                            }
                                                            atqo.u(ackj.k(null, alayVar2, null, false).toString(), aihfVarCreateBuilder11);
                                                        }
                                                        atqn.r(atqo.s(aihfVarCreateBuilder11), aihfVarCreateBuilder10);
                                                    }
                                                    apvm apvmVar4 = apvlVar.d;
                                                    if (apvmVar4 == null) {
                                                        apvmVar4 = apvm.a;
                                                    }
                                                    if ((apvmVar4.b & 2) != 0) {
                                                        apvm apvmVar5 = apvlVar.d;
                                                        if (apvmVar5 == null) {
                                                            apvmVar5 = apvm.a;
                                                        }
                                                        String str6 = apvmVar5.c;
                                                        str6.getClass();
                                                        atqn.s(str6, aihfVarCreateBuilder10);
                                                    }
                                                    aihhVar2.e(aihlVar6, atqn.q(aihfVarCreateBuilder10));
                                                    atqo.p(atxy.f(aihhVar2), aihfVarCreateBuilder8);
                                                    ajai ajaiVarA2 = ugi.a(apvlVar);
                                                    if (ajaiVarA2 != null) {
                                                        atqo.r(aihfVarCreateBuilder8);
                                                        aihh aihhVar3 = (aihh) aufsVar.createBuilder();
                                                        aihhVar3.getClass();
                                                        aihl aihlVar7 = aufo.b;
                                                        aihlVar7.getClass();
                                                        jrq jrqVar = (jrq) aufo.a.createBuilder();
                                                        jrqVar.getClass();
                                                        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aufo) jrqVar.instance).c);
                                                        listUnmodifiableList.getClass();
                                                        new aikl(listUnmodifiableList);
                                                        jrqVar.j(ajaiVarA2);
                                                        aihn aihnVarBuild2 = jrqVar.build();
                                                        aihnVarBuild2.getClass();
                                                        aihhVar3.e(aihlVar7, (aufo) aihnVarBuild2);
                                                        atqo.p(atxy.f(aihhVar3), aihfVarCreateBuilder8);
                                                    }
                                                    aufaVarH2 = atqo.h(aihfVarCreateBuilder8);
                                                } else {
                                                    twu.d("GssvCompositionUtils", 6, "GSSV response has no remix command or remix sources.", null);
                                                }
                                                if (aufaVarH2 != null && (aiieVar5 = aufaVarH2.k) != null) {
                                                    aihl aihlVar8 = auft.b;
                                                    aihlVar8.getClass();
                                                    auft auftVar7 = (auft) yno.gh(aiieVar5, aihlVar8);
                                                    if (auftVar7 != null) {
                                                        aihfVarCreateBuilder3.copyOnWrite();
                                                        uml umlVar2 = (uml) aihfVarCreateBuilder3.instance;
                                                        umlVar2.d = auftVar7;
                                                        umlVar2.b |= 2;
                                                        aihn aihnVarBuild3 = aihfVarCreateBuilder3.build();
                                                        aihnVarBuild3.getClass();
                                                        aihfVarCreateBuilder2.copyOnWrite();
                                                        umo umoVar = (umo) aihfVarCreateBuilder2.instance;
                                                        umoVar.c = (uml) aihnVarBuild3;
                                                        umoVar.b = 3;
                                                        return yno.gH(aihfVarCreateBuilder2);
                                                    }
                                                }
                                                throw new IllegalStateException("Failed to refresh derived source mixin");
                                            }
                                        }, i6), MoreExecutors.directExecutor())), new ahub(UUID.randomUUID().toString()), umkVar);
                                        ugn ugnVar2 = new ugn(null, "[AddedSoundCmpListener] Refresh GSSV metadata.", 63);
                                        aeivVar.t(ugnVar2);
                                        awro.t(awutVar, null, 0, new vdu(vdvVar2, afxdVarF2, null, 0), 3).kJ(new pge(vdvVar2, ugnVar2, 14));
                                    }
                                }
                            }
                        }
                        if (vdsVar2.e && aufaVar != null) {
                            if (((vxz) vdvVar2.g.b).l(615, 45856122L, false)) {
                                aiie aiieVar5 = aufaVar.k;
                                aiieVar5.getClass();
                                aihl aihlVar4 = auft.b;
                                aihlVar4.getClass();
                                auft auftVar3 = (auft) yno.gh(aiieVar5, aihlVar4);
                                if (auftVar3 == null || (auftVar3.c & SemanticState.Focused) == 0) {
                                    (aufaVar.c == 102 ? (auey) aufaVar.d : auey.a).c.getClass();
                                } else {
                                    auhu auhuVar4 = auftVar3.j;
                                    if (auhuVar4 == null) {
                                        auhuVar4 = auhu.a;
                                    }
                                    auhuVar4.c.getClass();
                                }
                            } else {
                                (aufaVar.c == 102 ? (auey) aufaVar.d : auey.a).c.getClass();
                            }
                            aigu aiguVar6 = aufaVar.f;
                            if (aiguVar6 == null) {
                                aiguVar6 = aigu.a;
                            }
                            aiguVar6.getClass();
                            aext.v(aiguVar6);
                            aigu aiguVar7 = aufaVar.g;
                            if (aiguVar7 == null) {
                                aiguVar7 = aigu.a;
                            }
                            aiguVar7.getClass();
                            aext.v(aiguVar7);
                            aigu aiguVar8 = aufaVar.h;
                            if (aiguVar8 == null) {
                                aiguVar8 = aigu.a;
                            }
                            aiguVar8.getClass();
                            aext.v(aiguVar8);
                        }
                        return awmy.a;
                    }
                }, 8), new var(new uhd(i4), i4));
                vkl vklVar = ukdVar.g.a;
                vkw vkwVar = vklVar.G;
                if (vklVar.p() && vkwVar != null) {
                    uxi uxiVar = vkwVar.a;
                    if (uxiVar != null) {
                        uwi uwiVar = vklVar.f;
                        Optional.of(Long.valueOf(uxiVar.a()));
                    } else {
                        uwi uwiVar2 = vklVar.f;
                    }
                }
            }
            afvnVarC.close();
        } catch (Throwable th) {
            try {
                afvnVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        this.e.i();
        afty.k();
    }

    @Override // defpackage.cc
    public final void onStart() {
        this.e.i();
        try {
            super.onStart();
            unn unnVarPeer = peer();
            cf activity = unnVarPeer.b.getActivity();
            int requestedOrientation = activity != null ? activity.getRequestedOrientation() : 1;
            unnVarPeer.m = requestedOrientation;
            if (requestedOrientation != 1) {
                unnVarPeer.h(1);
                unnVarPeer.l = true;
            }
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cc
    public final void onStop() {
        this.e.i();
        try {
            super.onStop();
            unn unnVarPeer = peer();
            if (unnVarPeer.l) {
                unnVarPeer.h(unnVarPeer.m);
            }
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        this.e.i();
        afty.k();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onViewStateRestored */
    public final void m674lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        this.e.i();
        try {
            super.m674lambda$restoreViewState$0$androidsupportv4appFragment(bundle);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afvj
    public final void setAnimationRef(afwn afwnVar, boolean z) {
        this.e.g(afwnVar, z);
    }

    @Override // defpackage.afvj
    public final void setBackPressRef(afwn afwnVar) {
        this.e.d = afwnVar;
    }

    @Override // defpackage.cc
    public final void setEnterTransition(Object obj) {
        afts aftsVar = this.e;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setEnterTransition(obj);
    }

    @Override // defpackage.cc
    public final void setExitTransition(Object obj) {
        afts aftsVar = this.e;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setExitTransition(obj);
    }

    @Override // defpackage.cc
    public final void setReenterTransition(Object obj) {
        afts aftsVar = this.e;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
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
        afts aftsVar = this.e;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setReturnTransition(obj);
    }

    @Override // defpackage.cc
    public final void setSharedElementEnterTransition(Object obj) {
        afts aftsVar = this.e;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    @Override // defpackage.cc
    public final void setSharedElementReturnTransition(Object obj) {
        afts aftsVar = this.e;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    @Override // defpackage.cc
    public final void startActivity(Intent intent) {
        aguu.at(intent, getContext());
        super.startActivity(intent);
    }

    @Override // defpackage.cc
    public final void startActivity(Intent intent, Bundle bundle) {
        aguu.at(intent, getContext());
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.uoc, defpackage.cc
    public final void onAttach(Activity activity) {
        this.e.i();
        try {
            super.onAttach(activity);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
