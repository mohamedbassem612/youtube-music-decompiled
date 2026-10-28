package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aczv extends aczm implements aczw {
    public vxz A;
    public vxz B;
    adbm C;
    qa D;
    public afip E;
    public afip F;
    private acxd T;
    private asmv U;
    private akrn V;
    private avmm W;
    private mel X;
    private fjw Y;
    private fjw Z;
    private String aa;
    private xgn ab;
    private Object ac;
    private Optional ad = Optional.empty();
    private akrn ae;
    private aczu af;
    aebp k;
    public awmd l;
    List m;
    public aunn n;
    public nuc o;
    public awmd p;
    public awmd q;
    public Context r;
    public adxl s;
    public aeda t;
    public tqj u;
    RecyclerView v;
    public acxx w;
    public vxz x;
    public vxz y;
    public vxz z;

    private final fjw D(aigj aigjVar, Context context) {
        avmm avmmVar = this.W;
        if (avmmVar == null) {
            avmmVar = new avmm();
            this.W = avmmVar;
        }
        return aecm.aF(context, (mlo) this.n.io(), aigjVar, this.ab, this.ac, (Map) this.ad.orElse(null), F(), avmmVar, this.F);
    }

    private final mel E(Context context) {
        adfx adfxVarF;
        ntw ntwVarA = ntx.a(((mlo) this.n.io()).a);
        ntwVarA.c(false);
        if (J() || this.ab != null) {
            afip afipVar = this.F;
            xgn xgnVar = this.ab;
            xgnVar.getClass();
            adfxVarF = afipVar.f(xgnVar, F());
        } else {
            adfxVarF = null;
        }
        ntwVarA.i = adfxVarF;
        ntwVarA.g = agke.q(aawb.ad(this.ac, null, (Map) this.ad.orElse(null)));
        return new mel(context, ntwVarA.a());
    }

    private final akrn F() {
        if (!J()) {
            return this.ae;
        }
        aczu aczuVar = this.af;
        aczuVar.getClass();
        return aczuVar.f;
    }

    private final void G(acxd acxdVar, Activity activity) {
        RecyclerView recyclerView;
        H(this.Y);
        this.Y = null;
        H(this.Z);
        this.Z = null;
        I();
        aebp aebpVar = this.k;
        if (aebpVar != null && (recyclerView = this.v) != null) {
            aebpVar.b(recyclerView);
            if (this.A.l(301, 45702412L, false) && !J()) {
                aebp aebpVar2 = this.k;
                aebpVar2.getClass();
                aebpVar2.f();
            }
            this.k = null;
        }
        if (this.X != null && this.A.l(301, 45702412L, false)) {
            mel melVar = this.X;
            melVar.getClass();
            melVar.onDetachedFromWindow();
            this.X = null;
        }
        if ((acxdVar.b & 8) != 0) {
            this.Y = D(acxdVar.g, activity);
        }
        if ((acxdVar.b & 4) != 0) {
            this.Z = D(acxdVar.e, activity);
        }
        if (!J()) {
            this.m = acxdVar.f;
            return;
        }
        aczu aczuVar = this.af;
        aczuVar.getClass();
        aczuVar.b(acxdVar.f);
    }

    private static void H(fjw fjwVar) {
        if (fjwVar != null) {
            fjwVar.H();
            fjwVar.O();
            fjwVar.K(null, true);
        }
    }

    private final void I() {
        avmm avmmVar = this.W;
        if (avmmVar != null) {
            avmmVar.dispose();
        }
        this.W = new avmm();
    }

    private final boolean J() {
        return this.B.l(94, 45696801L, false);
    }

    private static final String K() {
        StringBuilder sb = new StringBuilder();
        sb.append(Process.getStartElapsedRealtime());
        sb.append(Process.myPid());
        return sb.toString();
    }

    public static aczv r(acxd acxdVar, asmv asmvVar, Optional optional, Optional optional2, Object obj, Optional optional3, xgn xgnVar, akrn akrnVar) {
        aczv aczvVar = new aczv();
        aczvVar.T = acxdVar;
        aczvVar.U = asmvVar;
        aczvVar.V = akrnVar;
        aczvVar.ab = xgnVar;
        acrj acrjVar = new acrj(aczvVar, 7);
        if (true == optional2.isPresent()) {
            ((adyw) acrjVar.a).K = ((Integer) optional2.get()).intValue();
        }
        aczvVar.H = true;
        aczvVar.ac = obj;
        aczvVar.ad = optional3;
        acrj acrjVar2 = new acrj(aczvVar, 8);
        if (true == optional.isPresent()) {
            ((adyw) acrjVar2.a).J = (assl) optional.get();
        }
        return aczvVar;
    }

    public static void t(aczv aczvVar, Object obj, xgn xgnVar, akrn akrnVar, Optional optional) {
        aczvVar.ab = xgnVar;
        aczvVar.ae = akrnVar;
        aczvVar.ac = obj;
        aczvVar.ad = optional;
    }

    @Override // defpackage.bp
    public final void h(dd ddVar, String str) {
        super.h(ddVar, str);
        adbm adbmVar = this.C;
        if (adbmVar != null) {
            Object obj = adbmVar.a;
            ((adyw) obj).A(false);
            long j = ((acxd) adbmVar.c).d;
            acxx acxxVar = (acxx) adbmVar.b;
            acxxVar.a.a(avlb.x(j, TimeUnit.MILLISECONDS, acxxVar.b).E(new vtu(obj, 17)));
        }
    }

    @Override // defpackage.adyw
    public final Context iG() {
        if (this.t.i()) {
            return this.E.b();
        }
        return this.B.l(38, 45476947L, false) ? this.r : getContext();
    }

    @Override // defpackage.adyw
    protected final int l() {
        return 48;
    }

    @Override // defpackage.aczw
    public final xgn m() {
        return this.ab;
    }

    @Override // defpackage.adyw
    protected final Optional n() {
        xgn xgnVar;
        cf activity = getActivity();
        List list = J() ? null : this.m;
        if (activity == null) {
            return Optional.empty();
        }
        mel melVar = this.X;
        if (melVar != null) {
            return Optional.of(melVar);
        }
        if (J()) {
            aczu aczuVar = this.af;
            aczuVar.getClass();
            if (aczuVar.h.isEmpty()) {
                return Optional.empty();
            }
        } else if (list == null || list.isEmpty()) {
            return Optional.empty();
        }
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(activity).inflate(R.layout.bottom_sheet_recycler_view, (ViewGroup) null, false);
        this.v = recyclerView;
        if (recyclerView == null) {
            return Optional.of(null);
        }
        recyclerView.ag(0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        recyclerView.ah(linearLayoutManager);
        mlo mloVar = (mlo) this.n.io();
        if (J()) {
            aczu aczuVar2 = this.af;
            aczuVar2.getClass();
            agke agkeVar = aczuVar2.h;
            vxz vxzVar = this.A;
            xgn xgnVar2 = this.ab;
            xgnVar2.getClass();
            this.k = aecm.aG(agkeVar, recyclerView, mloVar, vxzVar, xgnVar2, this.p, this.F, this.q, this.u);
        } else if (!this.y.l(24, 45382015L, false) || (xgnVar = this.ab) == null) {
            List list2 = list;
            list2.getClass();
            recyclerView.ad(new acxy(mloVar, list2, this.F, this.ab, this.ac, this.ad, F()));
        } else {
            list.getClass();
            this.k = aecm.aH(list, recyclerView, mloVar, this.A, xgnVar, this.p, this.F, this.q, this.u);
        }
        recyclerView.setClipToPadding(false);
        if (this.x.l(4, 45369174L, false) && q().isPresent()) {
            ByteStore byteStore = (ByteStore) this.l.io();
            aihf aihfVarCreateBuilder = aspt.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aspt asptVar = (aspt) aihfVarCreateBuilder.instance;
            asptVar.b |= 1;
            asptVar.c = true;
            byteStore.set("bottom_sheet_scroll_position_key", ((aspt) aihfVarCreateBuilder.build()).toByteArray());
            aczt acztVar = new aczt(this);
            this.D = acztVar;
            recyclerView.aC(acztVar);
        }
        return Optional.of(recyclerView);
    }

    @Override // defpackage.adyw
    protected final Optional o() {
        return Optional.of(this.s);
    }

    @Override // defpackage.adyw, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (!J()) {
            if (!this.z.l(55, 45614661L, false) || bundle == null || bundle.getString("PROCESS_ID_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY", "").equals(K())) {
                return;
            }
            dismiss();
            return;
        }
        aczu aczuVar = (aczu) new bpn(this).a(aczu.class);
        this.af = aczuVar;
        if (aczuVar.a) {
            this.ab = aczuVar.b;
        } else {
            if (bundle != null) {
                dismiss();
                return;
            }
            xgn xgnVar = this.ab;
            xgnVar.getClass();
            aczuVar.b = xgnVar;
            acxd acxdVar = this.T;
            if (acxdVar != null) {
                aczuVar.d = acxdVar;
            }
            asmv asmvVar = this.U;
            if (asmvVar != null) {
                aczuVar.e = asmvVar;
            }
            akrn akrnVar = this.V;
            if (akrnVar != null) {
                aczuVar.f = akrnVar;
            }
            aczuVar.a = true;
        }
        this.w.i(this);
    }

    @Override // defpackage.adyw, defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cf activity = getActivity();
        activity.getClass();
        if (this.ab == null) {
            zvp.a(zvn.b, zvm.x, "Interaction logger in the bottomsheet is null inside of its fragment. This should never happen.");
        }
        if (J()) {
            aczu aczuVar = this.af;
            aczuVar.getClass();
            acxd acxdVar = aczuVar.d;
            if (acxdVar == null) {
                aczuVar.getClass();
                if (aczuVar.e == null) {
                    throw new IllegalStateException("No valid arguments provided.");
                }
            }
            aczuVar.getClass();
            if (!aczuVar.g || acxdVar == null) {
                asmv asmvVar = aczuVar.e;
                if (asmvVar != null) {
                    aczuVar.b(Collections.singletonList(asmvVar.toByteString()));
                } else if (acxdVar != null) {
                    I();
                    int i = acxdVar.b;
                    if ((i & 1) != 0) {
                        this.aa = acxdVar.c;
                    }
                    if ((i & 8) != 0) {
                        this.Y = D(acxdVar.g, activity);
                    }
                    if ((acxdVar.b & 4) != 0) {
                        fjw fjwVarD = D(acxdVar.e, activity);
                        this.Z = fjwVarD;
                        fjwVarD.setId(View.generateViewId());
                    }
                    if ((acxdVar.b & 16) != 0) {
                        aigj aigjVar = acxdVar.h;
                        if (aczuVar.c == null) {
                            aczuVar.c = new mlf();
                        }
                        mlf mlfVar = aczuVar.c;
                        mel melVarE = E(activity);
                        melVarE.a(aigjVar.G(), mlfVar);
                        this.X = melVarE;
                    }
                    aczuVar.b(acxdVar.f);
                }
            } else {
                G(acxdVar, activity);
            }
        } else {
            Bundle arguments = getArguments();
            if (arguments == null || !(arguments.containsKey("MODEL_BOTTOM_SHEET_FRAGMENT_KEY") || arguments.containsKey("ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY"))) {
                dismiss();
                return super.onCreateView(layoutInflater, viewGroup, bundle);
            }
            if (arguments.containsKey("COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY")) {
                try {
                    G((acxd) ahng.aA(arguments, "COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY", acxd.a, ExtensionRegistryLite.getGeneratedRegistry()), activity);
                } catch (aiik e) {
                    throw new IllegalStateException("Error decoding ActionSheetContent update", e);
                }
            } else if (arguments.containsKey("ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY")) {
                try {
                    this.m = Collections.singletonList(((asmv) ahng.aA(arguments, "ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY", asmv.a, ExtensionRegistryLite.getGeneratedRegistry())).toByteString());
                } catch (aiik e2) {
                    throw new IllegalStateException("Error decoding Element", e2);
                }
            } else {
                try {
                    acxd acxdVar2 = (acxd) ahng.aA(arguments, "MODEL_BOTTOM_SHEET_FRAGMENT_KEY", acxd.a, ExtensionRegistryLite.getGeneratedRegistry());
                    I();
                    int i2 = acxdVar2.b;
                    if ((i2 & 1) != 0) {
                        this.aa = acxdVar2.c;
                    }
                    if ((i2 & 8) != 0) {
                        this.Y = D(acxdVar2.g, activity);
                    }
                    if ((acxdVar2.b & 4) != 0) {
                        fjw fjwVarD2 = D(acxdVar2.e, activity);
                        this.Z = fjwVarD2;
                        fjwVarD2.setId(View.generateViewId());
                    }
                    if ((acxdVar2.b & 16) != 0) {
                        aigj aigjVar2 = acxdVar2.h;
                        mel melVarE2 = E(activity);
                        melVarE2.a(aigjVar2.G(), null);
                        this.X = melVarE2;
                    }
                    this.m = acxdVar2.f;
                } catch (aiik e3) {
                    throw new IllegalStateException("Error decoding ActionSheetContent model", e3);
                }
            }
        }
        if (!J() && bundle != null) {
            this.w.i(this);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.adyw, defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        RecyclerView recyclerView;
        if (J()) {
            acxx acxxVar = this.w;
            WeakReference weakReference = acxxVar.f;
            if (weakReference != null && weakReference.get() == this) {
                acxxVar.f = null;
            }
            if (acxxVar.f == null) {
                acxxVar.h = null;
            }
        } else if (this.ab != null) {
            this.w.h = null;
        }
        super.onDestroyView();
        H(this.Z);
        H(this.Y);
        avmm avmmVar = this.W;
        if (avmmVar != null) {
            avmmVar.dispose();
            this.W = null;
        }
        aebp aebpVar = this.k;
        if (aebpVar != null && (recyclerView = this.v) != null) {
            aebpVar.b(recyclerView);
            if (this.A.l(301, 45702412L, false) && !J()) {
                aebp aebpVar2 = this.k;
                aebpVar2.getClass();
                aebpVar2.f();
            }
            this.k = null;
        }
        if (this.X != null && this.A.l(301, 45702412L, false)) {
            mel melVar = this.X;
            melVar.getClass();
            melVar.onDetachedFromWindow();
            this.X = null;
        }
        if (this.x.l(4, 45369174L, false) && q().isPresent()) {
            ((ByteStore) this.l.io()).set("bottom_sheet_scroll_position_key", null);
        }
        RecyclerView recyclerView2 = this.v;
        if (recyclerView2 != null) {
            recyclerView2.ad(null);
        }
        this.v = null;
        this.D = null;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        acxx acxxVar = this.w;
        String strD = acxxVar.d();
        if (strD != null) {
            acxxVar.k.e(new xfh(3, 31), alai.FLOW_TYPE_ACTION_SHEET, strD);
        }
    }

    @Override // defpackage.adyw, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        if (J() || !this.z.l(55, 45614661L, false)) {
            return;
        }
        bundle.putString("PROCESS_ID_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY", K());
    }

    @Override // defpackage.adyw
    public final Optional p() {
        return Optional.ofNullable(this.Y);
    }

    @Override // defpackage.adyw
    public final Optional q() {
        return Optional.ofNullable(this.Z);
    }

    @Override // defpackage.aczw
    public final String s() {
        return this.aa;
    }

    @Override // defpackage.aczw
    public final void u(acxd acxdVar) {
        adzm adzmVar;
        if (!J()) {
            ahng.aG(getArguments(), "COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY", acxdVar);
        }
        cf activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        adzm adzmVar2 = this.R;
        if (adzmVar2 != null) {
            adzmVar2.c();
        }
        this.L = null;
        this.N = null;
        this.M = null;
        this.Q = null;
        if (J()) {
            aczu aczuVar = this.af;
            aczuVar.getClass();
            aczuVar.a();
            aczu aczuVar2 = this.af;
            aczuVar2.d = acxdVar;
            aczuVar2.g = true;
        }
        G(acxdVar, activity);
        this.N = (View) q().orElse(null);
        View view = this.N;
        if (view != null) {
            view.setId(View.generateViewId());
        }
        this.M = (View) p().orElse(null);
        this.L = (View) n().orElse(null);
        ViewGroup viewGroup2 = this.P;
        if (viewGroup2 != null && (adzmVar = this.R) != null) {
            viewGroup2.addView(adzmVar.a(activity));
        }
        adzm adzmVar3 = this.R;
        if (adzmVar3 != null) {
            adzmVar3.b(activity);
        }
        adbm adbmVar = this.C;
        if (adbmVar != null) {
            ((adyw) adbmVar.a).A(true);
        }
    }
}
