package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.util.Objects;
import j$.util.Optional;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zpk {
    public static final /* synthetic */ int a = 0;
    private static final BreakIterator b = BreakIterator.getCharacterInstance();

    private zpk() {
    }

    public static boolean a(assy assyVar) {
        if (assyVar.w.size() > 0) {
            return true;
        }
        askp askpVar = assyVar.e;
        if (askpVar == null) {
            askpVar = askp.a;
        }
        for (asku askuVar : askpVar.h) {
            if ((askuVar.b & SemanticState.Modal) != 0) {
                askv askvVar = askuVar.l;
                if (askvVar == null) {
                    askvVar = askv.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aqeb.b);
                askvVar.c(aihlVarCheckIsLite);
                if (askvVar.j.n(aihlVarCheckIsLite.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(assy assyVar, assy assyVar2) {
        if (assyVar == null || assyVar2 == null || (assyVar.c & 1) == 0 || (assyVar2.c & 1) == 0) {
            return false;
        }
        askp askpVar = assyVar.e;
        if (askpVar == null) {
            askpVar = askp.a;
        }
        String str = askpVar.c;
        askp askpVar2 = assyVar.e;
        if (askpVar2 == null) {
            askpVar2 = askp.a;
        }
        List listE = e(askpVar2.h);
        askp askpVar3 = assyVar2.e;
        String str2 = (askpVar3 == null ? askp.a : askpVar3).c;
        if (askpVar3 == null) {
            askpVar3 = askp.a;
        }
        List listE2 = e(askpVar3.h);
        return (Objects.equals(str, str2) && !Objects.equals(listE, listE2)) || (str.length() > str2.length() && listE.size() != listE2.size());
    }

    public static boolean c(askp askpVar, asku askuVar) {
        return askuVar.e == 0 && (askpVar.c.isEmpty() ? 0L : (long) askpVar.c.length()) <= ((long) askuVar.f);
    }

    public static nrv d(zoz zozVar) {
        nrt nrtVarD = nrv.d();
        nrtVarD.d(zozVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zozVar.getText());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(zozVar.getText());
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
        String string = zozVar.getText().toString();
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
        BreakIterator breakIterator = b;
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

    private static List e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            asku askuVar = (asku) it.next();
            if (askuVar.k || (askuVar.b & SemanticState.Multiline) != 0 || askuVar.c == 8) {
                arrayList.add(askuVar);
            }
        }
        return arrayList;
    }
}
