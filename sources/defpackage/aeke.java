package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeke extends aeka {
    private static final agrf w = agrf.h("com/google/android/libraries/youtube/search/voice/VoiceLanguageSelectorFragment");
    public vxe k;
    public zwh l;
    public xeu m;
    public xgn n;
    public aprb o;
    public String p;
    public RadioGroup q;
    public RadioGroup r;
    public ScrollView s;
    public jmg t;
    public afip u;
    public lqa v;

    private static final String o() {
        String strN = aedi.n();
        boolean zIsEmpty = strN.isEmpty();
        String strO = aedi.o();
        return (zIsEmpty || strO.isEmpty()) ? "" : a.cl(strO, (byte) 45, strN);
    }

    public final void k(RadioGroup radioGroup) {
        radioGroup.setOnCheckedChangeListener(null);
        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(new aekc(this, 0));
    }

    public final void l(LayoutInflater layoutInflater, RadioGroup radioGroup, apri apriVar) {
        TextView textView = (TextView) layoutInflater.inflate(R.layout.voice_language_selector_section_title, (ViewGroup) radioGroup, false);
        alay alayVar = apriVar.b;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        byte[] bArr = null;
        textView.setText(ackj.k(null, alayVar, null, false));
        radioGroup.addView(textView);
        for (apra apraVar : apriVar.c) {
            RadioButton radioButton = (RadioButton) layoutInflater.inflate(R.layout.voice_language_selector_item, (ViewGroup) radioGroup, false);
            radioButton.setId(View.generateViewId());
            radioButton.setText((apraVar.b == 64166933 ? (apqz) apraVar.c : apqz.a).c);
            radioGroup.addView(radioButton);
            if (ahno.ag((apraVar.b == 64166933 ? (apqz) apraVar.c : apqz.a).d, this.p)) {
                radioButton.setChecked(true);
                this.s.post(new aead(this, radioButton, 12, bArr));
            }
        }
    }

    public final /* synthetic */ void m() {
        this.n.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(95980)), null);
        super.iQ(false, false, false);
    }

    public final /* synthetic */ void n() {
        apqz apqzVar;
        String str = this.p;
        Iterator it = this.o.c.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                apqzVar = null;
                break;
            }
            for (apra apraVar : ((apri) it.next()).c) {
                apqzVar = apraVar.b == 64166933 ? (apqz) apraVar.c : apqz.a;
                if (apqzVar.c.equals(str)) {
                    break loop0;
                }
            }
        }
        if (apqzVar != null) {
            if (!this.l.hw().h()) {
                vxe vxeVar = this.k;
                ajwo ajwoVar = apqzVar.f;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.a(ajwoVar);
            }
            ((qrx) this.v.a).a(new acpb(apqzVar.d, 18), MoreExecutors.directExecutor()).addListener(new aeia(4), MoreExecutors.directExecutor());
            aihf aihfVarCreateBuilder = argt.a.createBuilder();
            String strO = o();
            aihfVarCreateBuilder.copyOnWrite();
            ((argt) aihfVarCreateBuilder.instance).b = strO;
            String str2 = apqzVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            argt argtVar = (argt) aihfVarCreateBuilder.instance;
            str2.getClass();
            argtVar.c = str2;
            xeu xeuVar = this.m;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.VOICE_LANGUAGE_CHANGED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                argt argtVar2 = (argt) aihfVarCreateBuilder.build();
                argtVar2.getClass();
                alouVar.d = argtVar2;
                alouVar.c = 322;
                xeuVar.b((alou) alosVar.build());
            }
            jmg jmgVar = this.t;
            if (jmgVar != null) {
                String displayName = apqzVar.c;
                String strO2 = apqzVar.d;
                if (strO2.isEmpty()) {
                    strO2 = o();
                    Iterator it2 = this.o.c.iterator();
                    loop2: while (true) {
                        if (!it2.hasNext()) {
                            List listH = agfm.b('-').h(strO2);
                            displayName = new Locale((String) listH.get(0), ahno.af((String) listH.get(1))).getDisplayName();
                            break;
                        }
                        for (apra apraVar2 : ((apri) it2.next()).c) {
                            apqz apqzVar2 = apraVar2.b == 64166933 ? (apqz) apraVar2.c : apqz.a;
                            if (ahno.ag(apqzVar2.d, strO2)) {
                                displayName = apqzVar2.c;
                                break loop2;
                            }
                        }
                    }
                }
                aejo aejoVar = jmgVar.J;
                if (aejoVar != null) {
                    aejoVar.c();
                    jmgVar.J = null;
                }
                jmgVar.O(displayName);
                jmgVar.N();
                jmgVar.v(strO2);
                TextView textView = jmgVar.X;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                jmgVar.M();
            }
        }
        this.n.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(95981)), null);
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        MessageLite messageLiteAC;
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        try {
            messageLiteAC = ahng.aC(getArguments(), "renderer", aprb.a, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (RuntimeException e) {
            ((agrc) ((agrc) ((agrc) w.b()).j(e)).k("com/google/android/libraries/youtube/search/voice/VoiceLanguageSelectorFragment", "retrieveProtoFromBundle", (char) 460, "VoiceLanguageSelectorFragment.java")).w("Failed to merge proto for %s", "renderer");
            messageLiteAC = null;
        }
        this.o = (aprb) messageLiteAC;
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.voice_language_selector_fragment, viewGroup, false);
        this.s = (ScrollView) viewInflate.findViewById(R.id.scroll_view);
        ((TextView) viewInflate.findViewById(R.id.title)).setText(R.string.select_voice_language);
        this.q = (RadioGroup) viewInflate.findViewById(R.id.suggested_language_group);
        this.r = (RadioGroup) viewInflate.findViewById(R.id.all_language_group);
        taf.g(this.v.C(), new xwl(this, layoutInflater, 19));
        TextView textView = (TextView) viewInflate.findViewById(R.id.cancel_button);
        aeaa aeaaVarD = this.u.d(textView);
        ajnf ajnfVar = ajnf.a;
        aihh aihhVar = (aihh) ajnfVar.createBuilder();
        alay alayVarC = ackj.c(getResources().getString(android.R.string.cancel));
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        alayVarC.getClass();
        ajnfVar2.m = alayVarC;
        ajnfVar2.b |= 64;
        aihhVar.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
        ajnfVar3.d = 13;
        ajnfVar3.c = 1;
        aeaaVarD.a((ajnf) aihhVar.build(), null, null);
        textView.setOnClickListener(new aefn(this, 4));
        this.n.l(new xgj(xhb.b(95980)));
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.apply_button);
        aeaa aeaaVarD2 = this.u.d(textView2);
        aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
        alay alayVarC2 = ackj.c(getResources().getString(R.string.ok_button));
        aihhVar2.copyOnWrite();
        ajnf ajnfVar4 = (ajnf) aihhVar2.instance;
        alayVarC2.getClass();
        ajnfVar4.m = alayVarC2;
        ajnfVar4.b |= 64;
        aihhVar2.copyOnWrite();
        ajnf ajnfVar5 = (ajnf) aihhVar2.instance;
        ajnfVar5.d = 13;
        ajnfVar5.c = 1;
        aeaaVarD2.a((ajnf) aihhVar2.build(), null, null);
        textView2.setOnClickListener(new aefn(this, 5));
        this.n.l(new xgj(xhb.b(95981)));
        this.q.setOnCheckedChangeListener(new aekc(this, 0));
        this.r.setOnCheckedChangeListener(new aekc(this, 0));
        textView2.setAllCaps(false);
        textView.setAllCaps(false);
        return viewInflate;
    }
}
