package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rxn implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rxn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v31, types: [java.lang.Object, sqc] */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.lang.Object, sqc] */
    /* JADX WARN: Type inference failed for: r14v50, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r14v51, types: [java.lang.Object, mdm] */
    /* JADX WARN: Type inference failed for: r14v52, types: [java.lang.Object, mdm] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 4;
        switch (this.$cid) {
            case 0:
                ((acjb) this.a).e(false, acjc.TIMELINE_UPDATE);
                return;
            case 1:
                Object obj = this.a;
                rxo rxoVar = (rxo) obj;
                if (!rxoVar.g) {
                    snh snhVar = (snh) rxoVar.b.getAndSet(null);
                    if (snhVar != null) {
                        rxoVar.v(snhVar);
                        return;
                    }
                    return;
                }
                if (rxoVar.h) {
                    return;
                }
                rsr rsrVar = rxoVar.a;
                smr smrVar = rxoVar.c;
                Optional optionalC = rsrVar.c(((yvs) smrVar.d(sih.class)).a);
                if (optionalC.isPresent()) {
                    acjb acjbVarD = ((acfw) smrVar.d(sjy.class)).d();
                    if (acjbVarD == null) {
                        rmp.n(smrVar, "Null playback timeline for DAI scheduleUpdateTimelineTask");
                        return;
                    }
                    synchronized (acjbVarD) {
                        ((rxo) obj).v(new snh(((aaxa) optionalC.get()).a.a(), ((aaxa) optionalC.get()).a.a() + ((aaxa) optionalC.get()).a.d));
                        aaxa aaxaVar = (aaxa) optionalC.get();
                        ruu ruuVar = (ruu) ((rxo) obj).f.io();
                        Locale locale = Locale.US;
                        String str = aaxaVar.b;
                        String strR = a.R((Iterable) Collection.EL.stream(((rxo) obj).d).map(new rxg(i)).collect(aghu.a));
                        yvs yvsVar = aaxaVar.a;
                        ruuVar.a("lratu", String.format(locale, "cpn.%s;adcpn.%s;cpid.%s;bstms.%d;", str, strR, yvsVar.a, Long.valueOf(yvsVar.a())));
                        break;
                    }
                    return;
                }
                return;
            case 2:
                rxq rxqVar = (rxq) this.a;
                if (rxqVar.b != -2) {
                    rxqVar.s();
                    return;
                }
                return;
            case 3:
                rxu rxuVar = (rxu) this.a;
                if (rxuVar.l != 2) {
                    rxuVar.t();
                    return;
                }
                return;
            case 4:
                rxv rxvVar = (rxv) this.a;
                if (rxvVar.a != 4) {
                    rxvVar.t();
                    return;
                }
                return;
            case 5:
                sas sasVar = new sas("AdBreakRenderer is not present in the layout server rendering content.", 3);
                ryj ryjVar = (ryj) this.a;
                ryjVar.f.u(ryjVar.d, ryjVar.e, sasVar, 16);
                return;
            case 6:
                Object obj2 = this.a;
                ((ryo) obj2).b.ab(((ryj) obj2).e, 0);
                return;
            case 7:
                ((say) this.a).t();
                return;
            case 8:
                int i2 = spv.c;
                this.a.a();
                return;
            case 9:
                int i3 = spv.c;
                this.a.a();
                return;
            case 10:
                ((sqn) this.a).a.e();
                return;
            case 11:
                ((abvk) this.a).A();
                return;
            case 12:
                ((avpr) this.a).a();
                return;
            case 13:
                ssv ssvVar = (ssv) this.a;
                EditText editText = ssvVar.f;
                if (editText != null) {
                    SpannableString spannableString = new SpannableString(ssvVar.a());
                    if (TextUtils.isEmpty(spannableString)) {
                        return;
                    }
                    Context context = ssvVar.b;
                    nsf.a(spannableString, context.getApplicationContext().getResources().getDimension(R.dimen.comment_mention_chip_corner_radius), context.getApplicationContext().getResources().getDimension(R.dimen.comment_mention_chip_horizontal_padding), editText.getMeasuredWidth() * 0.9f, tzk.n(context, R.attr.ytBadgeChipBackground).orElse(0));
                    adta[] adtaVarArr = (adta[]) spannableString.getSpans(0, spannableString.length(), adta.class);
                    if (adtaVarArr == null || adtaVarArr.length <= 0) {
                        return;
                    }
                    ssvVar.d(spannableString, ssvVar.x);
                    return;
                }
                return;
            case 14:
                ssz sszVar = (ssz) this.a;
                if (sszVar.r != null) {
                    SpannableString spannableString2 = new SpannableString(sszVar.a());
                    if (TextUtils.isEmpty(spannableString2)) {
                        return;
                    }
                    nsf.a(spannableString2, sszVar.p.getApplicationContext().getResources().getDimension(R.dimen.comment_mention_chip_corner_radius), sszVar.p.getApplicationContext().getResources().getDimension(R.dimen.comment_mention_chip_horizontal_padding), sszVar.r.getMeasuredWidth() * 0.9f, tzk.n(sszVar.p, R.attr.ytBadgeChipBackground).orElse(0));
                    adta[] adtaVarArr2 = (adta[]) spannableString2.getSpans(0, spannableString2.length(), adta.class);
                    if (adtaVarArr2 == null || adtaVarArr2.length <= 0) {
                        return;
                    }
                    sszVar.n(spannableString2, sszVar.C);
                    return;
                }
                return;
            case 15:
                ((suq) this.a).k();
                return;
            case 16:
                ((suq) this.a).l();
                return;
            case 17:
                ((swh) this.a).a();
                return;
            case 18:
                this.a.d(aigv.a);
                return;
            case 19:
                this.a.b();
                return;
            default:
                this.a.a();
                return;
        }
    }
}
