package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hdd extends hdk {
    public ajwo k;
    public Runnable l;
    public vxe m;
    public int n;
    public jij o;
    private YouTubeTextView p;
    private YouTubeTextView q;

    private final Optional m(String str, String str2, String str3) {
        String strConcat;
        List listH = agfm.c("%s").h(str);
        if (listH.isEmpty() || listH.size() > 2) {
            return Optional.empty();
        }
        if (listH.size() == 2) {
            strConcat = ((String) listH.get(0)) + str2 + ((String) listH.get(1));
        } else {
            strConcat = String.valueOf((String) listH.get(0)).concat(String.valueOf(str2));
        }
        SpannableString spannableString = new SpannableString(strConcat);
        spannableString.setSpan(new hdc(this, str3), ((String) listH.get(0)).length(), ((String) listH.get(0)).length() + str2.length(), 33);
        return Optional.of(spannableString);
    }

    public final void i() {
        dismiss();
        Runnable runnable = this.l;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.aevy, defpackage.gs, defpackage.bp
    public final Dialog iH(Bundle bundle) {
        aevw aevwVar = new aevw(requireContext());
        aevwVar.b();
        aevwVar.setOnShowListener(new hcz());
        aevwVar.a().D = true;
        return aevwVar;
    }

    public final void j() {
        dismiss();
        ajwo ajwoVar = this.k;
        if (ajwoVar != null) {
            this.m.a(ajwoVar);
        }
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.generated_thumbnails_disclaimer, viewGroup, false);
        this.p = (YouTubeTextView) viewInflate.findViewById(R.id.disclaimer_back_button);
        this.q = (YouTubeTextView) viewInflate.findViewById(R.id.disclaimer_accept_button);
        YouTubeTextView youTubeTextView = (YouTubeTextView) viewInflate.findViewById(R.id.discretion_message_details);
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) viewInflate.findViewById(R.id.prohibited_message_details);
        YouTubeTextView youTubeTextView3 = (YouTubeTextView) viewInflate.findViewById(R.id.disclaimer_title);
        YouTubeTextView youTubeTextView4 = (YouTubeTextView) viewInflate.findViewById(R.id.prohibited_uses_heading);
        if (this.n == 3) {
            youTubeTextView3.setText(R.string.ask_music_disclaimer_title);
            youTubeTextView4.setText(R.string.ask_music_disclaimer_prohibited_uses_heading);
        }
        int i = this.n;
        Objects.checkIndex(0, 2);
        if (i == 0 || !fhz.ak(i, hdb.b, hdb.a)) {
            jbm jbmVarA = this.o.a(this.p, null, new jn(this, 15, null), null, false);
            jbm jbmVarA2 = this.o.a(this.q, null, new jn(this, 16, null), null, false);
            adly adlyVar = new adly();
            ajnf ajnfVar = ajnf.a;
            aihh aihhVar = (aihh) ajnfVar.createBuilder();
            alay alayVarC = ackj.c(getContext().getString(R.string.navigate_back));
            aihhVar.copyOnWrite();
            ajnf ajnfVar2 = (ajnf) aihhVar.instance;
            alayVarC.getClass();
            ajnfVar2.m = alayVarC;
            ajnfVar2.b |= 64;
            aihhVar.copyOnWrite();
            ajnf ajnfVar3 = (ajnf) aihhVar.instance;
            ajnfVar3.d = 26;
            ajnfVar3.c = 1;
            aihhVar.copyOnWrite();
            ajnf ajnfVar4 = (ajnf) aihhVar.instance;
            ajnfVar4.i = 3;
            ajnfVar4.b |= 1;
            jbmVarA.hU(adlyVar, (ajnf) aihhVar.build());
            adly adlyVar2 = new adly();
            aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
            alay alayVarC2 = ackj.c(getContext().getString(R.string.generated_thumbnails_disclaimer_accept_text));
            aihhVar2.copyOnWrite();
            ajnf ajnfVar5 = (ajnf) aihhVar2.instance;
            alayVarC2.getClass();
            ajnfVar5.m = alayVarC2;
            ajnfVar5.b |= 64;
            aihhVar2.copyOnWrite();
            ajnf ajnfVar6 = (ajnf) aihhVar2.instance;
            ajnfVar6.d = 26;
            ajnfVar6.c = 1;
            aihhVar2.copyOnWrite();
            ajnf ajnfVar7 = (ajnf) aihhVar2.instance;
            ajnfVar7.i = 3;
            ajnfVar7.b |= 1;
            jbmVarA2.hU(adlyVar2, (ajnf) aihhVar2.build());
        } else {
            this.p.setVisibility(8);
            jbm jbmVarA3 = this.o.a(this.q, null, new jn(this, 17, null), null, false);
            adly adlyVar3 = new adly();
            aihh aihhVar3 = (aihh) ajnf.a.createBuilder();
            alay alayVarC3 = ackj.c(getContext().getString(R.string.ai_disclaimer_acknowledgement_button_text));
            aihhVar3.copyOnWrite();
            ajnf ajnfVar8 = (ajnf) aihhVar3.instance;
            alayVarC3.getClass();
            ajnfVar8.m = alayVarC3;
            ajnfVar8.b |= 64;
            aihhVar3.copyOnWrite();
            ajnf ajnfVar9 = (ajnf) aihhVar3.instance;
            ajnfVar9.d = 26;
            ajnfVar9.c = 1;
            aihhVar3.copyOnWrite();
            ajnf ajnfVar10 = (ajnf) aihhVar3.instance;
            ajnfVar10.i = 3;
            ajnfVar10.b |= 1;
            jbmVarA3.hU(adlyVar3, (ajnf) aihhVar3.build());
        }
        int i2 = this.n;
        Objects.checkIndex(0, 2);
        if (i2 != 0 && fhz.ak(i2, hda.b, hda.a)) {
            Optional optionalM = m(getContext().getString(R.string.ask_music_disclaimer_discretion_details), getContext().getString(R.string.ask_music_discretion_your_activity_text), "https://myactivity.google.com/product/youtube/");
            if (optionalM.isPresent()) {
                youTubeTextView.setText((CharSequence) optionalM.get());
                youTubeTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        Optional optionalM2 = m(getContext().getString(R.string.generated_thumbnails_disclaimer_prohibited_uses_details), getContext().getString(R.string.generated_thumbnails_prohibited_use_policy_text), "https://support.google.com/youtube/answer/9288567");
        if (optionalM2.isPresent()) {
            youTubeTextView2.setText((CharSequence) optionalM2.get());
            youTubeTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return viewInflate;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f;
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        Window window = dialog.getWindow();
        window.setGravity(80);
        window.setWindowAnimations(R.style.SlideUpDownAnimation);
        azz.c(window, false);
    }
}
