package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.mealbar.MusicMealbar$MealbarLayout;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcn implements adma, xgm {
    public final vxe a;
    public iyk b;
    public amzh c;
    private final Context d;
    private final aunn e;
    private final adhv f;
    private final xgn g;
    private final aduv h;
    private final aeba i;
    private final adrv j;
    private MusicMealbar$MealbarLayout k;
    private final jin l;
    private final vxz m;
    private final jij n;

    public jcn(Context context, aunn aunnVar, adhv adhvVar, vxe vxeVar, xgn xgnVar, aduv aduvVar, aeba aebaVar, adrv adrvVar, jij jijVar, jin jinVar, vxz vxzVar) {
        this.d = context;
        this.e = aunnVar;
        this.f = adhvVar;
        this.a = new hdv(vxeVar, this);
        this.g = xgnVar;
        this.h = aduvVar;
        this.i = aebaVar;
        this.j = adrvVar;
        this.n = jijVar;
        this.l = jinVar;
        this.m = vxzVar;
    }

    private final void e(amzh amzhVar) {
        if (amzhVar.l.size() != 0) {
            Iterator it = amzhVar.l.iterator();
            while (it.hasNext()) {
                this.a.c((ajwo) it.next(), null);
            }
        }
    }

    @Override // defpackage.adma
    public final View a() {
        iyk iykVar = this.b;
        if (iykVar != null) {
            return iykVar.d;
        }
        MusicMealbar$MealbarLayout musicMealbar$MealbarLayout = this.k;
        if (musicMealbar$MealbarLayout != null) {
            return musicMealbar$MealbarLayout;
        }
        MusicMealbar$MealbarLayout musicMealbar$MealbarLayout2 = new MusicMealbar$MealbarLayout(this.d);
        this.k = musicMealbar$MealbarLayout2;
        return musicMealbar$MealbarLayout2;
    }

    public final void d(amzh amzhVar) {
        alay alayVar;
        aqmh aqmhVar;
        ajnf ajnfVar;
        ajnf ajnfVar2;
        ajnf ajnfVar3;
        ajnf ajnfVar4;
        aunn aunnVar = this.e;
        if (aunnVar == null || aunnVar.io() == null) {
            return;
        }
        aeba aebaVar = this.i;
        if (aebaVar.c(amzhVar.n)) {
            if (aunnVar.io() != null) {
                this.g.w(new xgj(amzhVar.k, (amud) null), null);
                this.c = amzhVar;
                if ((amzhVar.b & 262144) == 0 || amzhVar.m) {
                    View view = (View) aunnVar.io();
                    if ((amzhVar.b & SemanticState.Hidden) != 0) {
                        alayVar = amzhVar.f;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                    } else {
                        alayVar = null;
                    }
                    Spanned spannedK = ackj.k(null, alayVar, null, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    for (int i = 0; i < amzhVar.g.size(); i++) {
                        if (i > 0) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        spannableStringBuilder.append((CharSequence) ackj.k(null, (alay) amzhVar.g.get(i), this.j, false));
                    }
                    this.b = iyk.g(view, spannedK, spannableStringBuilder, this.l, this.m);
                    if ((amzhVar.b & 4) != 0) {
                        aqmhVar = amzhVar.d;
                        if (aqmhVar == null) {
                            aqmhVar = aqmh.a;
                        }
                    } else {
                        aqmhVar = null;
                    }
                    iyk iykVar = this.b;
                    if (aqmhVar != null) {
                        iykVar.d();
                        ImageView imageView = this.b.d.f;
                        imageView.setVisibility(0);
                        new adia(this.f, imageView, true).f(aqmhVar, null);
                        aiqe aiqeVar = aqmhVar.e;
                        if (aiqeVar == null) {
                            aiqeVar = aiqe.a;
                        }
                        kro.aa(imageView, aiqeVar);
                    } else {
                        iykVar.d.f.setVisibility(8);
                        int i2 = amzhVar.b;
                        if ((i2 & 1) != 0) {
                            ImageView imageViewA = this.b.a();
                            adia adiaVar = new adia(this.f, imageViewA, true);
                            aqmh aqmhVar2 = amzhVar.c;
                            if (aqmhVar2 == null) {
                                aqmhVar2 = aqmh.a;
                            }
                            adiaVar.f(aqmhVar2, null);
                            aqmh aqmhVar3 = amzhVar.c;
                            if (aqmhVar3 == null) {
                                aqmhVar3 = aqmh.a;
                            }
                            aiqe aiqeVar2 = aqmhVar3.e;
                            if (aiqeVar2 == null) {
                                aiqeVar2 = aiqe.a;
                            }
                            kro.aa(imageViewA, aiqeVar2);
                        } else {
                            int i3 = i2 & 16;
                            iyk iykVar2 = this.b;
                            if (i3 != 0) {
                                ImageView imageViewA2 = iykVar2.a();
                                aduv aduvVar = this.h;
                                alja aljaVar = amzhVar.e;
                                if (aljaVar == null) {
                                    aljaVar = alja.a;
                                }
                                aliz alizVarA = aliz.a(aljaVar.c);
                                if (alizVarA == null) {
                                    alizVarA = aliz.UNKNOWN;
                                }
                                imageViewA2.setImageResource(aduvVar.a(alizVarA));
                            } else {
                                iykVar2.d();
                            }
                        }
                    }
                    amzg amzgVar = amzhVar.h;
                    if (amzgVar == null) {
                        amzgVar = amzg.a;
                    }
                    if ((amzgVar.b & 1) != 0) {
                        amzg amzgVar2 = amzhVar.h;
                        if (amzgVar2 == null) {
                            amzgVar2 = amzg.a;
                        }
                        ajnf ajnfVar5 = amzgVar2.c;
                        if (ajnfVar5 == null) {
                            ajnfVar5 = ajnf.a;
                        }
                        aihh aihhVar = (aihh) ajnfVar5.toBuilder();
                        aihhVar.copyOnWrite();
                        ajnf ajnfVar6 = (ajnf) aihhVar.instance;
                        ajnfVar6.d = 26;
                        ajnfVar6.c = 1;
                        ajnfVar = (ajnf) aihhVar.build();
                    } else {
                        ajnfVar = null;
                    }
                    if (ajnfVar != null) {
                        aihh aihhVar2 = (aihh) ajnfVar.toBuilder();
                        aihhVar2.copyOnWrite();
                        ajnf ajnfVar7 = (ajnf) aihhVar2.instance;
                        ajnfVar7.s = null;
                        ajnfVar7.b &= -8193;
                        aihhVar2.copyOnWrite();
                        ajnf ajnfVar8 = (ajnf) aihhVar2.instance;
                        ajnfVar8.q = null;
                        ajnfVar8.b &= -2049;
                        ajnfVar2 = (ajnf) aihhVar2.build();
                    } else {
                        ajnfVar2 = null;
                    }
                    iyk iykVar3 = this.b;
                    jij jijVar = this.n;
                    iykVar3.i(jijVar, ajnfVar2, ajnfVar != null ? new gdp(this, ajnfVar, 17) : null);
                    amzg amzgVar3 = amzhVar.i;
                    if (((amzgVar3 == null ? amzg.a : amzgVar3).b & 1) != 0) {
                        if (amzgVar3 == null) {
                            amzgVar3 = amzg.a;
                        }
                        ajnf ajnfVar9 = amzgVar3.c;
                        if (ajnfVar9 == null) {
                            ajnfVar9 = ajnf.a;
                        }
                        aihh aihhVar3 = (aihh) ajnfVar9.toBuilder();
                        aihhVar3.copyOnWrite();
                        ajnf ajnfVar10 = (ajnf) aihhVar3.instance;
                        ajnfVar10.d = 40;
                        ajnfVar10.c = 1;
                        ajnfVar3 = (ajnf) aihhVar3.build();
                    } else {
                        ajnfVar3 = null;
                    }
                    if (ajnfVar3 != null) {
                        aihh aihhVar4 = (aihh) ajnfVar3.toBuilder();
                        aihhVar4.copyOnWrite();
                        ajnf ajnfVar11 = (ajnf) aihhVar4.instance;
                        ajnfVar11.s = null;
                        ajnfVar11.b &= -8193;
                        aihhVar4.copyOnWrite();
                        ajnf ajnfVar12 = (ajnf) aihhVar4.instance;
                        ajnfVar12.q = null;
                        ajnfVar12.b &= -2049;
                        ajnfVar4 = (ajnf) aihhVar4.build();
                    } else {
                        ajnfVar4 = null;
                    }
                    iyk iykVar4 = this.b;
                    iykVar4.h(iykVar4.d.d, jijVar, 16, ajnfVar4, ajnfVar3 != null ? new gdp(this, ajnfVar3, 17) : null);
                    this.b.e = new jcm(this, amzhVar);
                    e(amzhVar);
                    iyk iykVar5 = this.b;
                    MusicMealbar$MealbarLayout musicMealbar$MealbarLayout = iykVar5.d;
                    int i4 = bac.a;
                    musicMealbar$MealbarLayout.setAccessibilityLiveRegion(1);
                    musicMealbar$MealbarLayout.a.setAccessibilityLiveRegion(1);
                    musicMealbar$MealbarLayout.b.setAccessibilityLiveRegion(1);
                    musicMealbar$MealbarLayout.c.setAccessibilityLiveRegion(1);
                    musicMealbar$MealbarLayout.d.setAccessibilityLiveRegion(1);
                    ImageView imageView2 = musicMealbar$MealbarLayout.e;
                    imageView2.setAccessibilityLiveRegion(!TextUtils.isEmpty(imageView2.getContentDescription()) ? 1 : 0);
                    ImageView imageView3 = musicMealbar$MealbarLayout.f;
                    imageView3.setAccessibilityLiveRegion(!TextUtils.isEmpty(imageView3.getContentDescription()) ? 1 : 0);
                    musicMealbar$MealbarLayout.setAccessibilityTraversalAfter(R.id.avatar_menu_button);
                    iykVar5.f();
                } else {
                    e(amzhVar);
                }
            }
            aebaVar.a(amzhVar.n);
        }
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.g;
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        d((amzh) obj);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
