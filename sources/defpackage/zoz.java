package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.util.Optional;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zoz extends AppCompatEditText {
    public static final /* synthetic */ int m = 0;
    private static final BreakIterator n = BreakIterator.getCharacterInstance();
    public ArrayList a;
    public fhd b;
    public boolean c;
    public wek d;
    public String e;
    public avmn f;
    public boolean g;
    public Context h;
    public CommandOuterClass$Command i;
    public nry j;
    public boolean k;
    public orx l;
    private adry o;
    private Map p;

    public zoz(Context context) {
        super(context);
        this.h = context;
    }

    public static nrv d(zoz zozVar) {
        nrt nrtVarD = nrv.d();
        nrtVarD.d(zozVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zozVar.getText() != null ? zozVar.getText() : "");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(zozVar.getText() != null ? zozVar.getText() : "");
        int i = zoy.a;
        afxw.g(spannableStringBuilder);
        aihf aihfVarCreateBuilder = askp.a.createBuilder();
        String strTrim = spannableStringBuilder.toString().trim();
        aihfVarCreateBuilder.copyOnWrite();
        askp askpVar = (askp) aihfVarCreateBuilder.instance;
        strTrim.getClass();
        askpVar.b |= 1;
        askpVar.c = strTrim;
        askp askpVar2 = (askp) aihfVarCreateBuilder.build();
        String string = zozVar.getText() != null ? zozVar.getText().toString() : "";
        aihf aihfVarCreateBuilder2 = assx.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        assx assxVar = (assx) aihfVarCreateBuilder2.instance;
        askpVar2.getClass();
        assxVar.d = askpVar2;
        assxVar.c |= 1;
        boolean zIsFocused = zozVar.isFocused();
        aihfVarCreateBuilder2.copyOnWrite();
        assx assxVar2 = (assx) aihfVarCreateBuilder2.instance;
        assxVar2.c |= 16;
        assxVar2.h = zIsFocused;
        aihfVarCreateBuilder2.copyOnWrite();
        assx assxVar3 = (assx) aihfVarCreateBuilder2.instance;
        assxVar3.c |= SemanticState.Hidden;
        assxVar3.l = false;
        int selectionStart = zozVar.getSelectionStart();
        aihfVarCreateBuilder2.copyOnWrite();
        assx assxVar4 = (assx) aihfVarCreateBuilder2.instance;
        assxVar4.c |= SemanticState.LiveRegion;
        assxVar4.m = selectionStart;
        int selectionEnd = zozVar.getSelectionEnd();
        aihfVarCreateBuilder2.copyOnWrite();
        assx assxVar5 = (assx) aihfVarCreateBuilder2.instance;
        assxVar5.c |= SemanticState.ReadOnly;
        assxVar5.n = selectionEnd;
        aihfVarCreateBuilder2.copyOnWrite();
        assx assxVar6 = (assx) aihfVarCreateBuilder2.instance;
        string.getClass();
        assxVar6.c |= 8;
        assxVar6.g = string;
        BreakIterator breakIterator = n;
        breakIterator.setText(string);
        breakIterator.first();
        int i2 = 0;
        while (breakIterator.next() != -1) {
            i2++;
        }
        aihfVarCreateBuilder2.copyOnWrite();
        assx assxVar7 = (assx) aihfVarCreateBuilder2.instance;
        assxVar7.c |= SemanticState.Modal;
        assxVar7.o = i2;
        String strTrim2 = askpVar2.c.trim();
        aihfVarCreateBuilder2.copyOnWrite();
        assx assxVar8 = (assx) aihfVarCreateBuilder2.instance;
        strTrim2.getClass();
        assxVar8.c |= 4;
        assxVar8.f = strTrim2;
        askp askpVarB = zoy.b(zozVar.getContext(), zozVar.getText());
        if (askpVarB != null) {
            aihfVarCreateBuilder2.copyOnWrite();
            assx assxVar9 = (assx) aihfVarCreateBuilder2.instance;
            assxVar9.e = askpVarB;
            assxVar9.c |= 2;
        }
        Layout layout = zozVar.getLayout();
        if (layout != null) {
            float fA = zoy.a(layout, zozVar);
            aihfVarCreateBuilder2.copyOnWrite();
            assx assxVar10 = (assx) aihfVarCreateBuilder2.instance;
            assxVar10.c |= 32;
            assxVar10.i = fA;
            float lineCount = zozVar.getLineCount();
            aihfVarCreateBuilder2.copyOnWrite();
            assx assxVar11 = (assx) aihfVarCreateBuilder2.instance;
            assxVar11.c |= SemanticState.Obscured;
            assxVar11.p = lineCount;
            float fM = twm.m(zozVar.e(), zozVar.getLineHeight());
            aihfVarCreateBuilder2.copyOnWrite();
            assx assxVar12 = (assx) aihfVarCreateBuilder2.instance;
            assxVar12.c |= SemanticState.Multiline;
            assxVar12.q = fM;
            float fB = twm.b(zozVar.e(), layout.getLineWidth(0));
            aihfVarCreateBuilder2.copyOnWrite();
            assx assxVar13 = (assx) aihfVarCreateBuilder2.instance;
            assxVar13.c |= 16384;
            assxVar13.r = fB;
            String strSubstring = string.substring(0, layout.getLineVisibleEnd(0));
            if (zozVar.getLineCount() >= 2) {
                strSubstring = String.valueOf(strSubstring).concat("...");
            }
            aihfVarCreateBuilder2.copyOnWrite();
            assx assxVar14 = (assx) aihfVarCreateBuilder2.instance;
            strSubstring.getClass();
            assxVar14.c |= 32768;
            assxVar14.s = strSubstring;
        }
        for (adta adtaVar : (adta[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), adta.class)) {
            int spanStart = spannableStringBuilder2.getSpanStart(adtaVar);
            int spanEnd = spannableStringBuilder2.getSpanEnd(adtaVar);
            aihf aihfVarCreateBuilder3 = asso.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            asso assoVar = (asso) aihfVarCreateBuilder3.instance;
            assoVar.b |= 2;
            assoVar.d = spanEnd - spanStart;
            aihfVarCreateBuilder3.copyOnWrite();
            asso assoVar2 = (asso) aihfVarCreateBuilder3.instance;
            assoVar2.b |= 1;
            assoVar2.c = spanStart;
            String str = adtaVar.a;
            aihfVarCreateBuilder3.copyOnWrite();
            asso assoVar3 = (asso) aihfVarCreateBuilder3.instance;
            str.getClass();
            assoVar3.b |= 4;
            assoVar3.e = str;
            aihfVarCreateBuilder2.cH((asso) aihfVarCreateBuilder3.build());
        }
        if (zozVar.g) {
            for (ImageSpan imageSpan : (ImageSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ImageSpan.class)) {
                int spanStart2 = spannableStringBuilder2.getSpanStart(imageSpan);
                int spanEnd2 = spannableStringBuilder2.getSpanEnd(imageSpan);
                Optional optionalG = zozVar.g(spannableStringBuilder2.toString().substring(spanStart2, spanEnd2));
                if (optionalG.isPresent()) {
                    aihf aihfVarCreateBuilder4 = aktq.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    aktq aktqVar = (aktq) aihfVarCreateBuilder4.instance;
                    aktqVar.b |= 2;
                    aktqVar.d = spanEnd2 - spanStart2;
                    aihfVarCreateBuilder4.copyOnWrite();
                    aktq aktqVar2 = (aktq) aihfVarCreateBuilder4.instance;
                    aktqVar2.b |= 1;
                    aktqVar2.c = spanStart2;
                    Object obj = optionalG.get();
                    aihfVarCreateBuilder4.copyOnWrite();
                    aktq aktqVar3 = (aktq) aihfVarCreateBuilder4.instance;
                    aktqVar3.e = (aktj) obj;
                    aktqVar3.b |= 4;
                    aihfVarCreateBuilder2.cG((aktq) aihfVarCreateBuilder4.build());
                }
            }
        }
        aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
        aihhVar.e(assx.b, (assx) aihfVarCreateBuilder2.build());
        nrtVarD.e = (SenderStateOuterClass$SenderState) aihhVar.build();
        return nrtVarD.a();
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        h().add(textWatcher);
        super.addTextChangedListener(textWatcher);
    }

    public final DisplayMetrics e() {
        return this.h.getResources().getDisplayMetrics();
    }

    public final ListenableFuture f(int i, int i2) {
        fhd fhdVar = this.b;
        int i3 = zpg.H;
        if (fhdVar.c != null) {
            fhdVar.x(new aero(0, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), "updateState:SuggestEditableText.remeasureForUpdatedText");
        }
        return aher.a;
    }

    public final Optional g(String str) {
        Map map = this.p;
        return (map == null || map.get(str) == null) ? Optional.empty() : Optional.of((aktj) this.p.get(str));
    }

    public final ArrayList h() {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        this.a = arrayList2;
        return arrayList2;
    }

    public final void i() {
        avmn avmnVar = this.f;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.f);
        }
        this.f = null;
    }

    public final void j() {
        ArrayList arrayListH = h();
        int size = arrayListH.size();
        for (int i = 0; i < size; i++) {
            TextWatcher textWatcher = (TextWatcher) arrayListH.get(i);
            if (textWatcher instanceof zpb) {
                ((zpb) textWatcher).h();
            }
            super.removeTextChangedListener(textWatcher);
        }
        arrayListH.clear();
    }

    public final void k(aktj aktjVar) {
        if (aktjVar.e.size() > 0) {
            String str = (String) aktjVar.e.get(0);
            this.p.put(str, aktjVar);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            adry adryVar = this.o;
            aqmh aqmhVar = aktjVar.f;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            adryVar.a(str, aqmhVar, this.h.getResources().getDimension(R.dimen.emoji_height), aktjVar.d, getId(), spannableStringBuilder, null);
        }
    }

    public final void l(Context context, aduv aduvVar, adsa adsaVar, assy assyVar) {
        this.g = true;
        this.h = context;
        this.p = new HashMap();
        this.o = new adry(context, aduvVar, adsaVar, true, new aeah(this, 1), true);
        if (assyVar.B.size() > 0) {
            for (int i = 0; i < assyVar.B.size(); i++) {
                aktj aktjVar = ((aktq) assyVar.B.get(i)).e;
                if (aktjVar == null) {
                    aktjVar = aktj.a;
                }
                k(aktjVar);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.c && i == 66) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.widget.TextView
    protected final void onSelectionChanged(int i, int i2) {
        if (this.d != null) {
            aihf aihfVarCreateBuilder = aqfl.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aqfl aqflVar = (aqfl) aihfVarCreateBuilder.instance;
            aqflVar.b |= 1;
            aqflVar.c = "suggest-editable-text-selection-state-entity-key";
            aqfi aqfiVar = new aqfi(aihfVarCreateBuilder);
            Integer numValueOf = Integer.valueOf(i);
            aihf aihfVar = aqfiVar.a;
            numValueOf.getClass();
            aihfVar.copyOnWrite();
            aqfl aqflVar2 = (aqfl) aihfVar.instance;
            aqflVar2.b |= 2;
            aqflVar2.d = i;
            Integer.valueOf(i2).getClass();
            aihfVar.copyOnWrite();
            aqfl aqflVar3 = (aqfl) aihfVar.instance;
            aqflVar3.b |= 4;
            aqflVar3.e = i2;
            aqfk aqfkVarAm = aqfiVar.am();
            wer werVarE = this.d.e();
            werVarE.e(aqfkVarAm);
            werVarE.c(wem.LEGACY_API_ALLOWLIST_TOKEN);
        }
        super.onSelectionChanged(i, i2);
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        h().remove(textWatcher);
        super.removeTextChangedListener(textWatcher);
    }
}
