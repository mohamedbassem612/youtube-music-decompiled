package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zpb implements TextWatcher, zpm {
    private static final agrf n = agrf.h("com/google/android/libraries/youtube/metadataeditor/elements/SuggestEditWatcher");
    private static final agkz o = agkz.n(new HashSet(agke.q("#")));
    private boolean A;
    private final vxz B;
    private final aesp C;
    adta[] a;
    ImageSpan[] b;
    boolean c;
    public final zoz d;
    public boolean e;
    public final ArrayList f;
    Map g;
    public final boolean h;
    public List i;
    public List j;
    final boolean k;
    boolean l;
    public zpr m;
    private final Executor p;
    private final Context q;
    private final nxl r;
    private final nuc s;
    private final nsl t;
    private final xgn u;
    private final CommandOuterClass$Command v;
    private final nry w;
    private ArrayList x;
    private CoordinatorLayout y;
    private final boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zpb] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [zpb] */
    /* JADX WARN: Type inference failed for: r3v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    public zpb(Context context, vxz vxzVar, Executor executor, zoz zozVar, nxl nxlVar, nuc nucVar, nsl nslVar, xgn xgnVar, CommandOuterClass$Command commandOuterClass$Command, nry nryVar, boolean z, boolean z2, aesp aespVar, zpw zpwVar, aeod aeodVar, List list, List list2, boolean z3, boolean z4, boolean z5) {
        zpw zpwVar2 = zpwVar;
        aeod aeodVar2 = aeodVar;
        ?? obj = new Object();
        obj.q = context;
        obj.B = vxzVar;
        obj.p = executor;
        obj.d = zozVar;
        obj.r = nxlVar;
        obj.s = nucVar;
        obj.t = nslVar;
        obj.u = xgnVar;
        obj.v = commandOuterClass$Command;
        obj.w = nryVar;
        obj.e = z;
        obj.C = aespVar;
        obj.i = list;
        obj.j = list2;
        HashMap map = new HashMap();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            assz asszVar = (assz) it.next();
            boolean zEquals = asszVar.c.equals("@");
            if (!zEquals || (asszVar.c.equals("@") && (asszVar.b & 2) != 0)) {
                ahub ahubVar = new ahub(null, null, null);
                agke agkeVarQ = agke.q(ahubVar);
                aend aendVar = (aend) aeodVar2.b.io();
                aendVar.getClass();
                Executor executor2 = (Executor) aeodVar2.a.io();
                executor2.getClass();
                mbc mbcVar = (mbc) aeodVar2.c.io();
                mbcVar.getClass();
                aepd aepdVar = new aepd(aendVar, executor2, mbcVar, agkeVarQ);
                aepdVar.d = asszVar.d;
                String str = asszVar.c;
                ahek ahekVar = (ahek) zpwVar2.a.io();
                ahekVar.getClass();
                advb advbVar = (advb) zpwVar2.b.io();
                advbVar.getClass();
                advn advnVar = (advn) zpwVar2.c.io();
                advnVar.getClass();
                tbt tbtVar = (tbt) zpwVar2.d.io();
                tbtVar.getClass();
                jaz jazVar = (jaz) zpwVar2.e.io();
                jazVar.getClass();
                xgm xgmVar = (xgm) zpwVar2.f.io();
                xgmVar.getClass();
                ttm ttmVar = (ttm) zpwVar2.g.io();
                ttmVar.getClass();
                vyo vyoVar = (vyo) zpwVar2.h.io();
                vyoVar.getClass();
                avlh avlhVar = (avlh) zpwVar2.i.io();
                avlhVar.getClass();
                ahtv ahtvVar = (ahtv) zpwVar2.o.io();
                ahtvVar.getClass();
                xeu xeuVar = (xeu) zpwVar2.j.io();
                xeuVar.getClass();
                abte abteVar = (abte) zpwVar2.k.io();
                abteVar.getClass();
                dov dovVar = (dov) zpwVar2.l.io();
                dovVar.getClass();
                vxz vxzVar2 = (vxz) zpwVar2.m.io();
                vxzVar2.getClass();
                vxz vxzVar3 = (vxz) zpwVar2.n.io();
                vxzVar3.getClass();
                context.getClass();
                str.getClass();
                HashMap map2 = map;
                zpv zpvVar = new zpv(ahekVar, advbVar, advnVar, tbtVar, jazVar, xgmVar, ttmVar, vyoVar, avlhVar, ahtvVar, xeuVar, abteVar, dovVar, vxzVar2, vxzVar3, context, ahubVar, aepdVar, str);
                ((avlh) zpvVar.a.a).E().ag().ag(new zgd(zpvVar, 7), new xuk(3));
                if (asszVar.e || (zEquals && vxzVar.m(5, 45617552L))) {
                    taf.j(((aepd) zpvVar.a.e).b("", true), new abwu(19));
                }
                map2.put(asszVar.c, new elr(zpvVar, (byte[]) null));
                obj = this;
                zpwVar2 = zpwVar;
                map = map2;
                aeodVar2 = aeodVar;
            }
        }
        ?? r2 = obj;
        r2.g = map;
        r2.z = z2;
        r2.k = z3;
        r2.l = z4;
        r2.f = new ArrayList();
        r2.h = z5;
        r2.a = null;
        r2.b = null;
        r2.x = null;
        r2.A = false;
    }

    private static ListenableFuture j(Editable editable, Object obj) {
        int spanStart = editable.getSpanStart(obj);
        int spanEnd = editable.getSpanEnd(obj);
        if (spanStart != -1 && spanEnd != -1 && spanStart < spanEnd) {
            editable.removeSpan(obj);
            editable.delete(spanStart, spanEnd);
        }
        return aher.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, androidx.coordinatorlayout.widget.CoordinatorLayout, zpa] */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0, types: [zpu] */
    /* JADX WARN: Type inference failed for: r1v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r2v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.view.View, android.view.ViewGroup, zpl] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    private final void k(assz asszVar) {
        ViewGroup viewGroup;
        ?? r2;
        ?? zplVar;
        ViewGroup viewGroup2;
        if (this.k) {
            zoz zozVar = this.d;
            Activity activityK = tym.K(zozVar.b.a);
            if (this.l) {
                View view = zozVar;
                while (view != null && view.getId() != R.id.interstitials_container) {
                    view = view.getParent() instanceof View ? (View) view.getParent() : null;
                }
                if (view instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) view;
                } else {
                    r2 = 0;
                }
            } else {
                viewGroup = (ViewGroup) activityK.getWindow().findViewById(R.id.interstitials_container);
            }
            if (r2 == 0) {
                r2 = viewGroup;
                r2 = viewGroup2;
                return;
            }
            r2 = viewGroup;
            zpt zptVar = new zpt(zozVar);
            boolean z = this.h;
            zptVar.d = z;
            ahhp ahhpVar = new ahhp(this, zptVar);
            r2.setVisibility(0);
            r2.bringToFront();
            ?? zpaVar = new zpa(zozVar.b.a);
            zpaVar.setId(R.id.suggest_coordinator_layout);
            zpaVar.setLayoutParams(new asv(r2.getLayoutParams()));
            r2.addView(zpaVar);
            if (i()) {
                zplVar = new zpl(activityK);
                zplVar.setId(R.id.social_suggestions_container);
                zplVar.addView(zplVar.a);
                zplVar.addView(zplVar.b);
                zplVar.setVisibility(8);
                if (this.l) {
                    r2 = viewGroup2;
                    zplVar.setLayoutParams(r2.getLayoutParams());
                }
                r2 = viewGroup2;
                zpaVar.addView(zplVar);
                zpaVar.j = zplVar;
                View viewFindViewById = activityK.getWindow().findViewById(R.id.upload_bottom_button_container);
                View viewC = ahhpVar.c();
                if (viewC != null && viewFindViewById != null) {
                    zpaVar.n(viewC, viewFindViewById);
                } else if (viewFindViewById != null && this.B.m(14, 45751136L)) {
                    zpaVar.n(zozVar, viewFindViewById);
                }
            } else {
                r2 = viewGroup2;
                activityK.getLayoutInflater().inflate(R.layout.social_suggestions_bottom_sheet, zpaVar);
                zplVar = (ViewGroup) zpaVar.findViewById(R.id.social_suggestions_container);
            }
            ?? r15 = zplVar;
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aihhVar.e(arbi.b, arbi.a);
            ajwo ajwoVar = (ajwo) aihhVar.build();
            ?? r17 = this.g.containsKey(asszVar.c) ? ((elr) this.g.get(asszVar.c)).a : null;
            aesp aespVar = this.C;
            xgn xgnVar = this.u;
            boolean z2 = this.z;
            Context context = (Context) aespVar.e.io();
            context.getClass();
            aeiy aeiyVar = (aeiy) aespVar.h.io();
            aeiyVar.getClass();
            isi isiVar = (isi) aespVar.c.io();
            isiVar.getClass();
            abuz abuzVar = (abuz) aespVar.a.io();
            abuzVar.getClass();
            Executor executor = (Executor) aespVar.f.io();
            executor.getClass();
            avmb avmbVar = (avmb) aespVar.b.io();
            avmbVar.getClass();
            aeda aedaVar = (aeda) aespVar.g.io();
            aedaVar.getClass();
            elr elrVar = (elr) aespVar.i.io();
            elrVar.getClass();
            vxz vxzVar = (vxz) aespVar.d.io();
            vxzVar.getClass();
            zozVar.getClass();
            r15.getClass();
            ajwoVar.getClass();
            xgnVar.getClass();
            zpr zprVar = new zpr(context, aeiyVar, isiVar, abuzVar, executor, avmbVar, aedaVar, elrVar, vxzVar, zpaVar, zozVar, zptVar, asszVar, r15, xgnVar, r17, z2, ahhpVar, z);
            this.m = zprVar;
            zpaVar.k = zprVar;
            this.y = zpaVar;
            this.m.i = this;
            taf.h((ListenableFuture) new vnn(this, 15).get(), this.p, new xwk(20));
        }
    }

    final assz a(Editable editable, int i) {
        if (editable == null) {
            return null;
        }
        List list = this.j;
        if (list != null && !list.isEmpty()) {
            for (assz asszVar : this.j) {
                String str = asszVar.c;
                if (i >= str.length() && str.contentEquals(editable.subSequence(i - str.length(), i))) {
                    return asszVar;
                }
            }
            return null;
        }
        List<String> list2 = this.i;
        if (list2 == null) {
            return null;
        }
        for (String str2 : list2) {
            if (i >= str2.length() && str2.contentEquals(editable.subSequence(i - str2.length(), i))) {
                aihf aihfVarCreateBuilder = assz.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                assz asszVar2 = (assz) aihfVarCreateBuilder.instance;
                str2.getClass();
                asszVar2.b |= 1;
                asszVar2.c = str2;
                return (assz) aihfVarCreateBuilder.build();
            }
        }
        return null;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        Editable editable2 = editable;
        if (this.A) {
            return;
        }
        if (editable2 == null || editable2.length() == 0) {
            this.a = null;
            this.b = null;
            this.c = false;
            if (Build.VERSION.SDK_INT >= 29) {
                zoz zozVar = this.d;
                taf.h(zozVar.f(zow.a(zozVar), zozVar.getLineHeight()), this.p, new xwk(16));
                return;
            }
            return;
        }
        adta[] adtaVarArr = this.a;
        if (adtaVarArr != null) {
            if (this.c) {
                for (adta adtaVar : adtaVarArr) {
                    taf.h(j(editable2, adtaVar), this.p, new xwk(17));
                }
            } else {
                for (adta adtaVar2 : adtaVarArr) {
                    editable2.removeSpan(adtaVar2);
                }
            }
        }
        ImageSpan[] imageSpanArr = this.b;
        if (imageSpanArr != null) {
            for (ImageSpan imageSpan : imageSpanArr) {
                taf.h(j(editable2, imageSpan), this.p, new xwk(18));
            }
        }
        if (this.e) {
            b(editable);
        }
        if (editable2 instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) editable2;
            ArrayList arrayList = this.x;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    spannableStringBuilder.removeSpan(arrayList.get(i2));
                }
            }
            this.x = new ArrayList();
            ArrayList arrayList2 = this.f;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                assw asswVar = (assw) arrayList2.get(i3);
                Pattern patternCompile = Pattern.compile(asswVar.b);
                String string = spannableStringBuilder.toString();
                Matcher matcher = patternCompile.matcher(editable2);
                int length = 0;
                while (true) {
                    i = i3 + 1;
                    if (matcher.find()) {
                        String strGroup = matcher.group();
                        int iIndexOf = string.indexOf(strGroup, length);
                        aihf aihfVarCreateBuilder = askp.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        askp askpVar = (askp) aihfVarCreateBuilder.instance;
                        askpVar.b |= 1;
                        askpVar.c = "a";
                        asku askuVar = asswVar.c;
                        if (askuVar == null) {
                            askuVar = asku.a;
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        askp askpVar2 = (askp) aihfVarCreateBuilder.instance;
                        askuVar.getClass();
                        askpVar2.b();
                        askpVar2.h.add(askuVar);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(zoy.c(this.t, this.q, (askp) aihfVarCreateBuilder.build(), this.w, this.r, this.s));
                        for (Object obj : spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), Object.class)) {
                            this.x.add(obj);
                            spannableStringBuilder.setSpan(obj, iIndexOf, strGroup.length() + iIndexOf, 33);
                        }
                        length = iIndexOf + strGroup.length();
                    }
                }
                editable2 = editable;
                i3 = i;
            }
        }
        if (this.d.b != null) {
            taf.h((ListenableFuture) new vnn(this, 14).get(), this.p, new xwk(19));
        }
        this.a = null;
        this.c = false;
    }

    final synchronized void b(Editable editable) {
        this.A = true;
        int length = editable.length();
        while (true) {
            length--;
            if (length < 0) {
                this.A = false;
            } else if (editable.charAt(length) == '\n') {
                editable.delete(length, length + 1);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence.length() == 0 || !(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        if (i2 > 0) {
            int i4 = i2 + i;
            this.a = (adta[]) spanned.getSpans(i, i4, adta.class);
            this.b = (ImageSpan[]) spanned.getSpans(i, i4, ImageSpan.class);
            this.c = true;
            return;
        }
        if (i3 <= 0 || i <= 0 || i >= spanned.length()) {
            return;
        }
        adta[] adtaVarArr = (adta[]) spanned.getSpans(i - 1, i, adta.class);
        adta[] adtaVarArr2 = (adta[]) spanned.getSpans(i, i + 1, adta.class);
        if (adtaVarArr == null || adtaVarArr.length == 0 || adtaVarArr2 == null || adtaVarArr2.length == 0 || !adtaVarArr[0].b.contentEquals(adtaVarArr2[0].b)) {
            return;
        }
        this.a = adtaVarArr2;
        this.c = false;
    }

    public final void h() {
        CoordinatorLayout coordinatorLayout;
        avmn avmnVar;
        ViewGroup viewGroup = (ViewGroup) tym.K(this.d.b.a).getWindow().findViewById(R.id.interstitials_container);
        if (viewGroup == null || (coordinatorLayout = this.y) == null) {
            return;
        }
        viewGroup.removeView(coordinatorLayout);
        this.y.removeAllViews();
        zpr zprVar = this.m;
        if (zprVar != null && (avmnVar = zprVar.m) != null && !avmnVar.f()) {
            avnr.b((AtomicReference) zprVar.m);
        }
        this.m = null;
        this.y = null;
        viewGroup.setVisibility(8);
    }

    public final boolean i() {
        if (this.l) {
            return true;
        }
        int i = this.q.getResources().getConfiguration().orientation;
        return false;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        assz asszVarA;
        CommandOuterClass$Command commandOuterClass$Command = this.v;
        if (commandOuterClass$Command != null) {
            this.w.a(commandOuterClass$Command, zoz.d(this.d)).D();
        }
        zpr zprVar = this.m;
        if (zprVar == null) {
            if (this.C != null) {
                zoz zozVar = this.d;
                int selectionStart = zozVar.getSelectionStart();
                if ((selectionStart != zozVar.getSelectionEnd() || selectionStart > 0) && (asszVarA = a(zozVar.getText(), selectionStart)) != null) {
                    k(asszVarA);
                    return;
                }
                return;
            }
            return;
        }
        zoz zozVar2 = this.d;
        assz asszVarA2 = a(zozVar2.getText(), zozVar2.getSelectionStart());
        if (asszVarA2 != null) {
            assz asszVar = zprVar.l;
            if (asszVarA2.equals(asszVar) && o.contains(asszVarA2.c)) {
                if (zprVar.h != null) {
                    zprVar.c.getText().removeSpan(zprVar.h);
                }
                EditText editText = zprVar.c;
                int selectionStart2 = editText.getSelectionStart();
                zprVar.h = new zpq();
                editText.getText().setSpan(zprVar.h, selectionStart2 - asszVar.c.length(), selectionStart2, 34);
            } else if (asszVarA2.c.equals("@") && asszVar.c.equals("#")) {
                zprVar.c();
                k(asszVarA2);
            }
        }
        zprVar.e();
    }
}
