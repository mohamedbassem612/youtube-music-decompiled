package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swx extends admr {
    public final Context a;
    public final LinearLayout b;
    public final ImageView c;
    public arpl d;
    private final vxe e;
    private final LinearLayout f;
    private final LinearLayout g;
    private final LinearLayout h;
    private final TextView i;
    private final View j;
    private final View k;
    private final sww l;
    private final LinearLayout m;
    private final LinearLayout n;
    private final TextView o;
    private int p;
    private List q;
    private adly s;

    public swx(Context context, vxe vxeVar, advb advbVar) {
        context.getClass();
        this.a = context;
        vxeVar.getClass();
        this.e = vxeVar;
        this.p = 0;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.ypc_offers_list_layout, (ViewGroup) null);
        this.f = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.collapsed_offers);
        this.m = linearLayout2;
        this.n = (LinearLayout) linearLayout.findViewById(R.id.expanded_offers);
        this.i = (TextView) linearLayout.findViewById(R.id.offer_info_header);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.expand_button);
        this.c = imageView;
        this.j = linearLayout.findViewById(R.id.separator);
        this.k = linearLayout.findViewById(R.id.expanded_separator);
        this.h = (LinearLayout) linearLayout.findViewById(R.id.visible_additional_info_list_container);
        this.b = (LinearLayout) linearLayout.findViewById(R.id.additional_offer_info_list_container);
        linearLayout2.setOnClickListener(new rnx(this, 15));
        imageView.setOnClickListener(new jip(this, vxeVar, 14));
        this.g = (LinearLayout) linearLayout.findViewById(R.id.single_ypc_offers);
        this.l = new sww(context, (admh) advbVar.io());
        this.o = (TextView) linearLayout2.findViewById(R.id.more_offer_info_header);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.f;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.p = 0;
        this.l.c(this.g);
        this.n.removeAllViews();
        List list = this.q;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        agke agkeVarN;
        ArrayList arrayList;
        alay alayVar;
        this.d = (arpl) obj;
        this.s = adlyVar;
        LinearLayout linearLayout = this.g;
        linearLayout.removeAllViews();
        arpl arplVar = this.d;
        if (arplVar == null) {
            agkeVarN = agpi.a;
        } else {
            arpm arpmVar = arplVar.b;
            if (arpmVar == null) {
                arpmVar = arpm.a;
            }
            if ((arpmVar.b & 2) == 0) {
                agkeVarN = agpi.a;
            } else {
                arpm arpmVar2 = arplVar.b;
                if (arpmVar2 == null) {
                    arpmVar2 = arpm.a;
                }
                arpg arpgVar = arpmVar2.c;
                if (arpgVar == null) {
                    arpgVar = arpg.a;
                }
                if (arpgVar.c.size() != 0) {
                    ArrayList arrayList2 = new ArrayList(arpgVar.c.size());
                    for (arph arphVar : arpgVar.c) {
                        if ((arphVar.b & 1) != 0) {
                            arpi arpiVar = arphVar.c;
                            if (arpiVar == null) {
                                arpiVar = arpi.a;
                            }
                            arrayList2.add(arpiVar);
                        }
                    }
                    agkeVarN = agke.n(arrayList2);
                } else {
                    agkeVarN = agpi.a;
                }
            }
        }
        for (int i = 0; i < agkeVarN.size(); i++) {
            arpi arpiVar2 = (arpi) agkeVarN.get(i);
            if (arpiVar2 != null) {
                sww swwVar = this.l;
                linearLayout.addView(swwVar.d(swwVar.b(this.s), arpiVar2, null));
            }
        }
        tuk.l(linearLayout, linearLayout.getChildCount() > 0);
        arpe arpeVarG = nsg.g(this.d);
        arpe arpeVarG2 = nsg.g(this.d);
        if (arpeVarG2 == null || arpeVarG2.e.size() == 0) {
            arrayList = null;
        } else {
            aiie<arph> aiieVar = arpeVarG2.e;
            arrayList = new ArrayList(aiieVar.size());
            for (arph arphVar2 : aiieVar) {
                if ((arphVar2.b & 1) != 0) {
                    arpi arpiVar3 = arphVar2.c;
                    if (arpiVar3 == null) {
                        arpiVar3 = arpi.a;
                    }
                    arrayList.add(arpiVar3);
                }
            }
        }
        this.q = arrayList;
        if (arpeVarG == null || arrayList == null) {
            tuk.l(this.o, false);
            tuk.l(this.n, false);
            tuk.l(this.m, false);
            tuk.l(this.k, false);
        } else {
            if (this.p == 0) {
                this.p = true != arpeVarG.c ? 2 : 1;
            }
            TextView textView = this.o;
            if ((arpeVarG.b & 2) != 0) {
                alayVar = arpeVarG.d;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            tuk.u(textView, vxl.a(null, alayVar, new xaf(this, 1), false));
            int i2 = this.p;
            if (i2 == 2) {
                h();
                i();
            } else if (i2 == 1) {
                tuk.l(this.m, true);
                tuk.l(textView, true);
                tuk.l(this.n, false);
                tuk.l(this.k, true);
                this.p = 1;
            }
        }
        aiie aiieVar2 = this.d.c;
        vxe vxeVar = this.e;
        g(nsg.h(aiieVar2, vxeVar), R.layout.ypc_visible_additional_info_text, this.h);
        alay alayVar2 = this.d.d;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        Spanned spannedK = ackj.k(null, alayVar2, null, false);
        boolean zIsEmpty = TextUtils.isEmpty(spannedK);
        TextView textView2 = this.i;
        if (zIsEmpty) {
            tuk.l(textView2, false);
            tuk.l(this.c, false);
            tuk.l(this.b, false);
            tuk.l(this.j, false);
            return;
        }
        tuk.u(textView2, spannedK);
        CharSequence[] charSequenceArrH = nsg.h(this.d.e, vxeVar);
        if (charSequenceArrH == null || charSequenceArrH.length == 0) {
            tuk.l(this.c, false);
            tuk.l(this.b, false);
            return;
        }
        ImageView imageView = this.c;
        tuk.l(imageView, true);
        LinearLayout linearLayout2 = this.b;
        tuk.l(linearLayout2, true);
        if (imageView.isSelected()) {
            g(nsg.h(this.d.e, vxeVar), R.layout.ypc_offers_list_additional_offer_info_text, linearLayout2);
        } else {
            j();
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arpl) obj).f.G();
    }

    public final void g(CharSequence[] charSequenceArr, int i, LinearLayout linearLayout) {
        if (charSequenceArr == null || charSequenceArr.length <= 0) {
            tuk.l(linearLayout, false);
            return;
        }
        tuk.l(linearLayout, true);
        int i2 = 0;
        while (i2 < charSequenceArr.length) {
            if (i2 >= linearLayout.getChildCount()) {
                View.inflate(this.a, i, linearLayout);
            }
            tuk.u((TextView) linearLayout.getChildAt(i2), charSequenceArr[i2]);
            i2++;
        }
        while (i2 < linearLayout.getChildCount()) {
            tuk.l(linearLayout.getChildAt(i2), false);
            i2++;
        }
    }

    public final void h() {
        LinearLayout linearLayout = this.n;
        linearLayout.removeAllViews();
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                arpi arpiVar = (arpi) this.q.get(i);
                if (arpiVar != null) {
                    sww swwVar = this.l;
                    linearLayout.addView(swwVar.d(swwVar.b(this.s), arpiVar, null));
                }
            }
        }
    }

    public final void i() {
        tuk.l(this.m, false);
        tuk.l(this.o, false);
        tuk.l(this.n, true);
        tuk.l(this.k, false);
        this.p = 2;
    }

    public final void j() {
        tuk.l(this.b, false);
    }
}
