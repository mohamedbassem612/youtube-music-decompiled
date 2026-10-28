package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.logging.sampling.LogSamplerImpl;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xbo implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xbo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v18, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        int i;
        int i2;
        List list;
        int i3;
        int i4 = 0;
        switch (this.$cid) {
            case 0:
                int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault());
                Rect rectB = tuk.b(((tuy) obj).a);
                if (layoutDirectionFromLocale == 1) {
                    i = rectB.right;
                    i2 = rectB.left;
                } else {
                    i = rectB.left;
                    i2 = rectB.right;
                }
                tym.h((View) this.a, new tyk(i, 0, i2, 0), ViewGroup.MarginLayoutParams.class);
                return;
            case 1:
                weo weoVar = (weo) obj;
                amky amkyVar = (amky) weoVar.c;
                amky amkyVar2 = (amky) weoVar.b;
                xay xayVar = (xay) this.a;
                akuv akuvVarT = xayVar.t();
                xayVar.w(akuvVarT, amkyVar, akuvVarT, amkyVar2);
                return;
            case 2:
                tym.h((View) this.a, new tyk(0, 0, 0, 0), ViewGroup.MarginLayoutParams.class);
                return;
            case 3:
                ampz ampzVar = (ampz) obj;
                int i5 = ampzVar.c.b & 2;
                Object obj2 = this.a;
                if (i5 != 0) {
                    TextView textView = ((xbw) obj2).k;
                    textView.setText(ackj.k(null, ampzVar.getMetadataText(), null, false));
                    textView.setVisibility(0);
                }
                xbw xbwVar = (xbw) obj2;
                if (!xbwVar.t) {
                    return;
                }
                Map pollChoiceStatesMap = ampzVar.getPollChoiceStatesMap();
                while (true) {
                    List list2 = xbwVar.g;
                    if (i4 >= list2.size()) {
                        return;
                    }
                    xcp xcpVar = (xcp) list2.get(i4);
                    amqa amqaVar = ((ampv) pollChoiceStatesMap.get(Integer.valueOf(i4))).a;
                    if ((amqaVar.b & 1) != 0) {
                        ClipDrawable clipDrawable = xcpVar.c;
                        ObjectAnimator.ofInt(clipDrawable, "level", clipDrawable.getLevel(), (int) (amqaVar.c * 10000.0d)).setDuration(500L).start();
                    }
                    if ((amqaVar.b & 2) != 0) {
                        alay alayVar = amqaVar.d;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                        xcpVar.b(alayVar);
                    } else {
                        xcpVar.b.setVisibility(8);
                    }
                    i4++;
                }
                break;
            case 4:
                boolean zA = ((wyd) obj).a();
                Object obj3 = this.a;
                if (zA) {
                    xdh xdhVar = ((xdb) obj3).g;
                    if (xdhVar != null) {
                        xdhVar.d(true);
                        return;
                    }
                    return;
                }
                xdh xdhVar2 = ((xdb) obj3).g;
                if (xdhVar2 != null) {
                    xdhVar2.g(true);
                    return;
                }
                return;
            case 5:
                ((abzo) this.a).d();
                return;
            case 6:
                ((xdy) this.a).c((ajtl) obj);
                return;
            case 7:
                this.a.invoke(obj);
                return;
            case 8:
                this.a.invoke(obj);
                return;
            case 9:
                amuc amucVar = ((ajvu) obj).p;
                if (amucVar == null) {
                    amucVar = amuc.a;
                }
                aply aplyVar = amucVar.e;
                if (aplyVar == null) {
                    aplyVar = aply.a;
                }
                Object obj4 = this.a;
                LogSamplerImpl.configureLogSampler(aplyVar.toByteArray());
                ((LogSamplerImpl) obj4).a = true;
                return;
            case 10:
                int i6 = xll.p;
                this.a.invoke(obj);
                return;
            case 11:
                ((avpr) this.a).a();
                return;
            case 12:
                ((avpr) this.a).d((Throwable) obj);
                return;
            case 13:
                if (((aazj) obj).a.a(abob.g, abob.a)) {
                    xql xqlVar = (xql) this.a;
                    xqlVar.i.kk(xqlVar.d);
                    return;
                }
                return;
            case 14:
                aazn aaznVar = (aazn) obj;
                if (aaznVar.c() || aaznVar.b()) {
                    xql xqlVar2 = (xql) this.a;
                    xqlVar2.i.kk(xqlVar2.d);
                    return;
                }
                return;
            case 15:
                xrn xrnVar = (xrn) this.a;
                xrnVar.p = (xuo) obj;
                Iterator it = xrnVar.f.iterator();
                if (it.hasNext()) {
                    throw null;
                }
                return;
            case 16:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                xrn xrnVar2 = (xrn) this.a;
                xrnVar2.q = zBooleanValue;
                xgn xgnVarA = xrnVar2.a();
                xhc xhcVarB = xhb.b(11208);
                xgt xgtVarA = xgnVarA.a();
                xhc xhcVarA = (xgtVarA == null || (i3 = xgtVarA.f) == 0) ? null : xhb.a(i3);
                Map map = xrnVar2.o;
                if (!map.containsKey(xhcVarB) || (list = xrnVar2.k) == null) {
                    return;
                }
                if (list.contains(xhcVarA) || xhcVarA == null) {
                    if (!bool.booleanValue()) {
                        map.put(xhcVarB, Boolean.FALSE);
                        xgnVarA.p(new xgj(xhcVarB), null);
                        return;
                    } else {
                        if (((Boolean) map.get(xhcVarB)).booleanValue()) {
                            return;
                        }
                        map.put(xhcVarB, Boolean.TRUE);
                        xgnVarA.w(new xgj(xhcVarB), null);
                        return;
                    }
                }
                return;
            case 17:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                xrn xrnVar3 = (xrn) this.a;
                xrnVar3.l = zBooleanValue2;
                xrnVar3.c();
                return;
            case 18:
                boolean z = ((aazq) obj).b.a() == 1;
                xte xteVar = (xte) this.a;
                xtf xtfVar = (xtf) xteVar.a;
                if (z != xtfVar.h) {
                    xtfVar.h = z;
                    xteVar.a();
                    ((xsh) xteVar.c).d();
                    return;
                }
                return;
            case 19:
                wjf wjfVar = ((aayp) obj).a;
                Object obj5 = this.a;
                if (wjfVar == null) {
                    xte xteVar2 = (xte) obj5;
                    ((xtf) xteVar2.a).f();
                    xteVar2.a();
                    ((xsh) xteVar2.c).d();
                    return;
                }
                if (!TextUtils.isEmpty(wjfVar.F())) {
                    ((xtf) ((xte) obj5).a).d = wjfVar.F();
                }
                if (!TextUtils.isEmpty(wjfVar.B())) {
                    ((xtf) ((xte) obj5).a).e = wjfVar.B();
                }
                wjfVar.af();
                xte xteVar3 = (xte) obj5;
                ((xtf) xteVar3.a).i = wjfVar.af();
                xteVar3.a();
                ((xsh) xteVar3.c).d();
                return;
            default:
                xte xteVar4 = (xte) this.a;
                ((xtf) xteVar4.a).f();
                xteVar4.a();
                ((xsh) xteVar4.c).d();
                return;
        }
    }
}
