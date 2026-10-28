package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.survey.HatsContainer;
import com.google.android.apps.youtube.music.survey.HatsHorizontalSurvey;
import com.google.android.apps.youtube.music.survey.HatsSurvey;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ivu {
    public final vxe a;
    public final xgm b;
    public FrameLayout c;
    public boolean d;
    private final Context e;
    private final Set f = new HashSet();
    private ivy g;
    private HatsContainer h;
    private final hef i;

    public ivu(Context context, vxe vxeVar, hef hefVar, xgm xgmVar) {
        this.a = vxeVar;
        this.e = context;
        this.i = hefVar;
        this.b = xgmVar;
    }

    public final Animator a() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c(), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("translationY", 0.0f, c().getHeight()));
        objectAnimatorOfPropertyValuesHolder.addListener(new ivt(this));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final Animator b() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c(), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", c().getHeight(), 0.0f));
        objectAnimatorOfPropertyValuesHolder.addListener(new ivs(this));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final HatsContainer c() {
        if (this.h == null && this.c != null) {
            HatsContainer hatsContainer = (HatsContainer) LayoutInflater.from(this.e).inflate(R.layout.hats_survey_container, (ViewGroup) this.c, false);
            this.h = hatsContainer;
            this.c.addView(hatsContainer);
        }
        HatsContainer hatsContainer2 = this.h;
        hatsContainer2.getClass();
        return hatsContainer2;
    }

    public final void d() {
        if (this.h == null || !this.d) {
            return;
        }
        a().start();
    }

    /* JADX WARN: Type inference failed for: r1v32, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v98, types: [awmd, java.lang.Object] */
    public final void e(aqgx aqgxVar, int i) {
        alay alayVar;
        ajwo ajwoVar;
        int i2;
        int i3;
        byte[] bArrG;
        int i4;
        int i5;
        ViewGroup viewGroup;
        ajnf ajnfVar;
        ajwo ajwoVar2;
        alay alayVar2;
        int i6;
        ArrayList arrayList;
        ArrayList arrayList2;
        HatsSurvey hatsSurvey;
        YouTubeTextView youTubeTextView;
        HatsHorizontalSurvey hatsHorizontalSurvey;
        Spanned spannedK;
        Spanned spannedK2;
        alay alayVar3;
        alay alayVar4;
        alay alayVar5;
        alay alayVar6;
        alay alayVar7;
        ajwo ajwoVar3;
        if (aqgxVar != null) {
            ivv ivvVar = new ivv();
            int i7 = 1;
            ivvVar.g = 1;
            ivvVar.f = (byte) (ivvVar.f | 1);
            ivvVar.h = 1;
            boolean z = false;
            ivvVar.a(0);
            int i8 = aqgxVar.b;
            int i9 = 4;
            int i10 = 2;
            byte[] bArr = null;
            if ((i8 & 1) != 0) {
                aqgt aqgtVar = aqgxVar.c;
                if (aqgtVar == null) {
                    aqgtVar = aqgt.a;
                }
                ivvVar.a = aqgtVar;
                ivvVar.b = null;
                ivvVar.g = 2;
                if ((aqgtVar.b & 2) != 0) {
                    alayVar7 = aqgtVar.e;
                    if (alayVar7 == null) {
                        alayVar7 = alay.a;
                    }
                } else {
                    alayVar7 = null;
                }
                ivvVar.c = ackj.k(null, alayVar7, null, false);
                int iAV = a.aV(aqgtVar.l);
                if (iAV == 0) {
                    iAV = 1;
                }
                ivvVar.h = iAV;
                ivvVar.a(aqgtVar.m);
                if ((aqgtVar.b & 8) != 0) {
                    ajwoVar3 = aqgtVar.f;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                } else {
                    ajwoVar3 = null;
                }
                ivvVar.e = ajwoVar3;
            } else if ((i8 & 2) != 0) {
                aqgk aqgkVar = aqgxVar.d;
                if (aqgkVar == null) {
                    aqgkVar = aqgk.a;
                }
                ivvVar.b = aqgkVar;
                ivvVar.a = null;
                ivvVar.g = 3;
                if ((aqgkVar.b & 1) != 0) {
                    alayVar = aqgkVar.d;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                ivvVar.c = ackj.k(null, alayVar, null, false);
                int iAV2 = a.aV(aqgkVar.h);
                if (iAV2 == 0) {
                    iAV2 = 1;
                }
                ivvVar.h = iAV2;
                ivvVar.a(0);
                if ((aqgkVar.b & 4) != 0) {
                    ajwoVar = aqgkVar.e;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                } else {
                    ajwoVar = null;
                }
                ivvVar.e = ajwoVar;
            }
            ivvVar.i = new qcb(this, bArr);
            if (ivvVar.f != 3 || (i2 = ivvVar.g) == 0 || (i3 = ivvVar.h) == 0) {
                StringBuilder sb = new StringBuilder();
                if ((ivvVar.f & 1) == 0) {
                    sb.append(" counterfactual");
                }
                if (ivvVar.g == 0) {
                    sb.append(" surveyType");
                }
                if (ivvVar.h == 0) {
                    sb.append(" displayTime");
                }
                if ((ivvVar.f & 2) == 0) {
                    sb.append(" displayDelaySec");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            ivw ivwVar = new ivw(i2, ivvVar.a, ivvVar.b, ivvVar.i, ivvVar.c, i3, ivvVar.d, ivvVar.e);
            aqge aqgeVar = i + (-1) != 1 ? aqge.SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED : aqge.SURVEY_DISPLAY_TRIGGER_UI_EVENT_APP_FOREGROUNDED;
            List list = agpi.a;
            int i11 = aqgxVar.b;
            int i12 = 20;
            int i13 = 19;
            if ((i11 & 1) != 0) {
                aqgt aqgtVar2 = aqgxVar.c;
                if (aqgtVar2 == null) {
                    aqgtVar2 = aqgt.a;
                }
                if (aqgtVar2.k.size() > 0) {
                    aqgt aqgtVar3 = aqgxVar.c;
                    if (aqgtVar3 == null) {
                        aqgtVar3 = aqgt.a;
                    }
                    list = (List) Collection.EL.stream(aqgtVar3.k).map(new itm(i13)).collect(Collectors.toList());
                } else {
                    aqgt aqgtVar4 = aqgxVar.c;
                    if (aqgtVar4 == null) {
                        aqgtVar4 = aqgt.a;
                    }
                    if (aqgtVar4.j.size() > 0) {
                        aqgt aqgtVar5 = aqgxVar.c;
                        if (aqgtVar5 == null) {
                            aqgtVar5 = aqgt.a;
                        }
                        list = (List) Collection.EL.stream(aqgtVar5.j).map(new itm(i12)).collect(Collectors.toList());
                    }
                }
            } else if ((i11 & 2) != 0) {
                aqgk aqgkVar2 = aqgxVar.d;
                if (aqgkVar2 == null) {
                    aqgkVar2 = aqgk.a;
                }
                if (aqgkVar2.l.size() > 0) {
                    aqgk aqgkVar3 = aqgxVar.d;
                    if (aqgkVar3 == null) {
                        aqgkVar3 = aqgk.a;
                    }
                    list = (List) Collection.EL.stream(aqgkVar3.l).map(new itm(i13)).collect(Collectors.toList());
                } else {
                    aqgk aqgkVar4 = aqgxVar.d;
                    if (aqgkVar4 == null) {
                        aqgkVar4 = aqgk.a;
                    }
                    if (aqgkVar4.k.size() > 0) {
                        aqgk aqgkVar5 = aqgxVar.d;
                        if (aqgkVar5 == null) {
                            aqgkVar5 = aqgk.a;
                        }
                        list = (List) Collection.EL.stream(aqgkVar5.k).map(new itm(i12)).collect(Collectors.toList());
                    }
                }
            }
            if (list.isEmpty() || ((List) Collection.EL.stream(list).filter(new iui(i9)).collect(Collectors.toList())).contains(aqgeVar)) {
                if (ivwVar.a().isPresent() && this.f.contains(Long.valueOf(ivwVar.a().getAsLong()))) {
                    return;
                }
                int i14 = aqgxVar.b;
                if ((i14 & 1) != 0) {
                    aqgt aqgtVar6 = aqgxVar.c;
                    if (aqgtVar6 == null) {
                        aqgtVar6 = aqgt.a;
                    }
                    bArrG = aqgtVar6.h.G();
                } else if ((i14 & 2) != 0) {
                    aqgk aqgkVar6 = aqgxVar.d;
                    if (aqgkVar6 == null) {
                        aqgkVar6 = aqgk.a;
                    }
                    bArrG = aqgkVar6.j.G();
                } else {
                    bArrG = null;
                }
                if (bArrG != null) {
                    this.b.hB().w(new xgj(bArrG), null);
                }
                if (this.d) {
                    d();
                }
                ivy ivyVar = this.g;
                if (ivyVar == null) {
                    hef hefVar = this.i;
                    HatsContainer hatsContainerC = c();
                    aduv aduvVar = (aduv) hefVar.a.io();
                    aduvVar.getClass();
                    vxe vxeVar = (vxe) hefVar.b.io();
                    vxeVar.getClass();
                    ivy ivyVar2 = new ivy(aduvVar, vxeVar, hatsContainerC);
                    this.g = ivyVar2;
                    ivyVar = ivyVar2;
                }
                ivyVar.h = new qcb(this, bArr);
                if (ivy.a(ivwVar)) {
                    YouTubeTextView youTubeTextView2 = ivyVar.d;
                    if (youTubeTextView2 != null) {
                        tuk.u(youTubeTextView2, ivwVar.c);
                    }
                    HatsSurvey hatsSurvey2 = ivyVar.e;
                    if (hatsSurvey2 != null) {
                        hatsSurvey2.b(ivwVar.c);
                    }
                } else {
                    HatsHorizontalSurvey hatsHorizontalSurvey2 = ivyVar.f;
                    if (hatsHorizontalSurvey2 != null) {
                        hatsHorizontalSurvey2.b(ivwVar.c);
                    }
                }
                int i15 = ivwVar.e;
                if (i15 == 2) {
                    aqgt aqgtVar7 = ivwVar.a;
                    aqgtVar7.getClass();
                    boolean zA = ivy.a(ivwVar);
                    if (zA) {
                        hatsSurvey = ivyVar.e;
                        youTubeTextView = ivyVar.d;
                    } else {
                        hatsSurvey = ivyVar.f;
                        youTubeTextView = null;
                    }
                    hatsSurvey.getClass();
                    hatsSurvey.d.getClass();
                    hatsSurvey.d(null, null);
                    aiie aiieVar = aqgtVar7.g;
                    ViewGroup viewGroup2 = hatsSurvey.d;
                    ArrayList arrayList3 = new ArrayList(aiieVar.size());
                    Iterator it = aiieVar.iterator();
                    while (true) {
                        int i16 = i7;
                        if (!it.hasNext()) {
                            break;
                        }
                        aqgu aqguVar = (aqgu) it.next();
                        if (aqguVar.b == 84469192) {
                            aqgs aqgsVar = (aqgs) aqguVar.c;
                            View viewInflate = LayoutInflater.from(viewGroup2.getContext()).inflate(zA ? R.layout.hats_vertical_survey_option : R.layout.hats_horizontal_survey_option, viewGroup2, z);
                            aduv aduvVar2 = ivyVar.a;
                            ivx ivxVar = new ivx(ivyVar, ivwVar, aqgsVar, i10);
                            int i17 = i10;
                            View viewFindViewById = viewInflate.findViewById(R.id.hats_response_text);
                            int i18 = i15;
                            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.hats_response_icon);
                            if (imageView == null) {
                                zA = zA;
                                it = it;
                                viewGroup2 = viewGroup2;
                            } else {
                                if (viewFindViewById != null) {
                                    TextView textView = (TextView) viewFindViewById;
                                    if ((aqgsVar.b & 2) != 0) {
                                        alayVar6 = aqgsVar.d;
                                        if (alayVar6 == null) {
                                            alayVar6 = alay.a;
                                        }
                                    } else {
                                        alayVar6 = null;
                                    }
                                    textView.setText(ackj.k(null, alayVar6, null, false));
                                } else {
                                    it = it;
                                    viewGroup2 = viewGroup2;
                                    if ((aqgsVar.b & 2) != 0) {
                                        alayVar5 = aqgsVar.d;
                                        if (alayVar5 == null) {
                                            alayVar5 = alay.a;
                                        }
                                    } else {
                                        alayVar5 = null;
                                    }
                                    imageView.setContentDescription(ackj.k(null, alayVar5, null, false));
                                }
                                if ((aqgsVar.b & 1) != 0) {
                                    alja aljaVar = aqgsVar.c;
                                    if (aljaVar == null) {
                                        aljaVar = alja.a;
                                    }
                                    aliz alizVarA = aliz.a(aljaVar.c);
                                    if (alizVarA == null) {
                                        alizVarA = aliz.UNKNOWN;
                                    }
                                    imageView.setImageResource(aduvVar2.a(alizVarA));
                                }
                                tuk.l(imageView, i16 == (aqgsVar.b & 1));
                                viewInflate.setOnClickListener(ivxVar);
                            }
                            arrayList3.add(viewInflate);
                            i15 = i18;
                            zA = zA;
                            i10 = i17;
                            it = it;
                            viewGroup2 = viewGroup2;
                            i7 = 1;
                            z = false;
                        } else {
                            i7 = 1;
                        }
                    }
                    i4 = i15;
                    boolean z2 = zA;
                    i5 = i10;
                    hatsSurvey.c(arrayList3);
                    if (!z2 && (hatsHorizontalSurvey = ivyVar.f) != null) {
                        Iterator it2 = aqgtVar7.g.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                spannedK = null;
                                break;
                            }
                            aqgu aqguVar2 = (aqgu) it2.next();
                            if (aqguVar2.b == 84469192) {
                                aqgs aqgsVar2 = (aqgs) aqguVar2.c;
                                if ((aqgsVar2.b & 2) != 0) {
                                    alayVar4 = aqgsVar2.d;
                                    if (alayVar4 == null) {
                                        alayVar4 = alay.a;
                                    }
                                } else {
                                    alayVar4 = null;
                                }
                                spannedK = ackj.k(null, alayVar4, null, false);
                                if (!TextUtils.isEmpty(spannedK)) {
                                    break;
                                }
                            }
                        }
                        TextView textView2 = hatsHorizontalSurvey.a;
                        textView2.getClass();
                        textView2.setText(spannedK);
                        tuk.l(hatsHorizontalSurvey.a, !TextUtils.isEmpty(spannedK));
                        aiie aiieVar2 = aqgtVar7.g;
                        int size = aiieVar2.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                spannedK2 = null;
                                break;
                            }
                            if (((aqgu) aiieVar2.get(size)).b == 84469192) {
                                aqgu aqguVar3 = (aqgu) aiieVar2.get(size);
                                aqgs aqgsVar3 = aqguVar3.b == 84469192 ? (aqgs) aqguVar3.c : aqgs.a;
                                if ((aqgsVar3.b & 2) != 0) {
                                    alayVar3 = aqgsVar3.d;
                                    if (alayVar3 == null) {
                                        alayVar3 = alay.a;
                                    }
                                } else {
                                    alayVar3 = null;
                                }
                                spannedK2 = ackj.k(null, alayVar3, null, false);
                                if (!TextUtils.isEmpty(spannedK2)) {
                                    break;
                                }
                            }
                        }
                        TextView textView3 = hatsHorizontalSurvey.b;
                        textView3.getClass();
                        textView3.setText(spannedK2);
                        tuk.l(hatsHorizontalSurvey.b, !TextUtils.isEmpty(spannedK2));
                    }
                    HatsContainer hatsContainer = ivyVar.c;
                    hatsContainer.d(hatsSurvey);
                    hatsContainer.c(youTubeTextView);
                } else {
                    i4 = i15;
                    i5 = 2;
                    aqgk aqgkVar7 = ivwVar.b;
                    aqgkVar7.getClass();
                    HatsSurvey hatsSurvey3 = ivyVar.e;
                    if (hatsSurvey3 != null && (viewGroup = hatsSurvey3.d) != null) {
                        aiie<aqgl> aiieVar3 = aqgkVar7.f;
                        Map map = ivyVar.g;
                        map.clear();
                        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                        ArrayList arrayList4 = new ArrayList(aiieVar3.size());
                        for (aqgl aqglVar : aiieVar3) {
                            if ((aqglVar.b & 1) != 0) {
                                aqgj aqgjVar = aqglVar.c;
                                if (aqgjVar == null) {
                                    aqgjVar = aqgj.a;
                                }
                                if ((aqgjVar.b & 2) != 0) {
                                    ajwoVar2 = aqgjVar.d;
                                    if (ajwoVar2 == null) {
                                        ajwoVar2 = ajwo.a;
                                    }
                                } else {
                                    ajwoVar2 = null;
                                }
                                auzk auzkVar = new auzk(ajwoVar2, aqgjVar.e);
                                CheckBox checkBox = (CheckBox) layoutInflaterFrom.inflate(R.layout.hats_checkbox_survey_option, viewGroup, false);
                                if ((aqgjVar.b & 1) != 0) {
                                    alayVar2 = aqgjVar.c;
                                    if (alayVar2 == null) {
                                        alayVar2 = alay.a;
                                    }
                                } else {
                                    alayVar2 = null;
                                }
                                checkBox.setText(ackj.k(null, alayVar2, null, false));
                                checkBox.setOnClickListener(new gdp(ivyVar, auzkVar, 14, null));
                                arrayList4.add(checkBox);
                                map.put(auzkVar, checkBox);
                            }
                        }
                        hatsSurvey3.c(arrayList4);
                        ajng ajngVar = aqgkVar7.i;
                        if (ajngVar == null) {
                            ajngVar = ajng.a;
                        }
                        if ((ajngVar.b & 1) != 0) {
                            ajng ajngVar2 = aqgkVar7.i;
                            if (ajngVar2 == null) {
                                ajngVar2 = ajng.a;
                            }
                            ajnfVar = ajngVar2.c;
                            if (ajnfVar == null) {
                                ajnfVar = ajnf.a;
                            }
                        } else {
                            ajnfVar = null;
                        }
                        hatsSurvey3.d(ajnfVar, new ivx(ivyVar, ivwVar, ajnfVar, 0));
                        HatsContainer hatsContainer2 = ivyVar.c;
                        hatsContainer2.d(hatsSurvey3);
                        hatsContainer2.c(ivyVar.d);
                    }
                }
                HatsContainer hatsContainer3 = ivyVar.c;
                hatsContainer3.g = true;
                hatsContainer3.h = 1;
                hatsContainer3.b();
                gdp gdpVar = new gdp(ivyVar, ivwVar, 13, null);
                View view = hatsContainer3.a;
                if (view != null) {
                    view.setOnClickListener(gdpVar);
                }
                HatsContainer hatsContainerC2 = c();
                if (this.c == null) {
                    i6 = 1;
                } else if (hatsContainerC2.getHeight() == 0) {
                    i6 = 1;
                    hatsContainerC2.addOnLayoutChangeListener(new mrt(this, hatsContainerC2, 1));
                    tuk.l(this.c, true);
                    tuk.l(hatsContainerC2, true);
                } else {
                    i6 = 1;
                    b().start();
                }
                vxe vxeVar2 = this.a;
                int i19 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i19 != i6) {
                    if (i19 == i5) {
                        arrayList = new ArrayList();
                        aqgk aqgkVar8 = ivwVar.b;
                        aqgkVar8.getClass();
                        if (aqgkVar8.c.size() != 0) {
                            for (aqgi aqgiVar : aqgkVar8.c) {
                                if ((aqgiVar.b & 1) != 0) {
                                    aqgh aqghVar = aqgiVar.c;
                                    if (aqghVar == null) {
                                        aqghVar = aqgh.a;
                                    }
                                    arrayList.addAll(aqghVar.b);
                                }
                            }
                            arrayList2 = arrayList;
                        }
                    }
                    arrayList2 = null;
                } else {
                    arrayList = new ArrayList();
                    aqgt aqgtVar8 = ivwVar.a;
                    aqgtVar8.getClass();
                    if (aqgtVar8.d.size() == 0) {
                        arrayList2 = null;
                    } else {
                        for (aqgr aqgrVar : aqgtVar8.d) {
                            if ((aqgrVar.b & 1) != 0) {
                                aqgq aqgqVar = aqgrVar.c;
                                if (aqgqVar == null) {
                                    aqgqVar = aqgq.a;
                                }
                                arrayList.addAll(aqgqVar.b);
                            }
                        }
                        arrayList2 = arrayList;
                    }
                }
                yno.ez(vxeVar2, arrayList2, ivwVar);
                if (ivwVar.a().isPresent()) {
                    this.f.add(Long.valueOf(ivwVar.a().getAsLong()));
                }
            }
        }
    }
}
