package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jbf implements SharedPreferences.OnSharedPreferenceChangeListener, CompoundButton.OnCheckedChangeListener, adma, abdz {
    public final View a;
    public final xgn b;
    public final jer c;
    public final icj d;
    public final ViewGroup e;
    public jbw f;
    public final vxz g;
    private final abvk h;
    private final jkp i;
    private final admd j;
    private final View k;
    private final ViewGroup l;
    private final SwitchCompat m;
    private final ImageView n;
    private final YouTubeTextView o;
    private final YouTubeTextView p;
    private final abea q;
    private final aunn r;
    private final jlh s;
    private hed t;
    private boolean u;
    private final joa v;
    private final jin w;
    private final jij x;

    public jbf(Context context, abvk abvkVar, jkp jkpVar, xgn xgnVar, abea abeaVar, jer jerVar, icj icjVar, jij jijVar, aunn aunnVar, jin jinVar, vxz vxzVar, jlh jlhVar, hhb hhbVar) {
        this.h = abvkVar;
        this.i = jkpVar;
        jdw jdwVar = new jdw(context);
        this.j = jdwVar;
        this.b = xgnVar;
        this.q = abeaVar;
        this.c = jerVar;
        this.d = icjVar;
        this.x = jijVar;
        this.r = aunnVar;
        this.w = jinVar;
        this.g = vxzVar;
        this.s = jlhVar;
        this.v = hhbVar.m(this.e, null);
        View viewInflate = View.inflate(context, R.layout.autoplay_toggle, null);
        this.a = viewInflate;
        this.k = viewInflate.findViewById(R.id.separator);
        this.l = (ViewGroup) viewInflate.findViewById(R.id.metadata_container);
        this.m = (SwitchCompat) viewInflate.findViewById(R.id.autoplay_switch);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.settings_button);
        this.n = imageView;
        this.o = (YouTubeTextView) viewInflate.findViewById(R.id.title);
        this.p = (YouTubeTextView) viewInflate.findViewById(R.id.byline);
        imageView.setOnClickListener(new ivp(this, 9));
        this.e = (ViewGroup) viewInflate.findViewById(R.id.sub_header_chips);
        jdwVar.c(viewInflate);
    }

    private final boolean d() {
        return this.g.l(241, 45799010L, false);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.j).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.u = true;
        kro.Z(((jdw) this.j).a, 0, 0);
        this.q.j(this);
        this.i.unregisterOnSharedPreferenceChangeListener(this);
        jbw jbwVar = this.f;
        if (jbwVar != null) {
            jbwVar.b(admhVar);
        }
        this.v.c();
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        Object obj2 = ((hed) obj).a;
        icj icjVar = this.d;
        this.t = new hed(obj2, icjVar.f(), icjVar.y);
        this.u = false;
        this.q.e(this);
        this.b.l(new xgj(xhb.b(51009)));
        boolean zD = d();
        int i = R.dimen.item_extra_small_spacing;
        if (zD) {
            this.m.setVisibility(8);
            if (this.i.getBoolean(gzj.AUTOPLAY_ENABLED, true)) {
                this.l.setVisibility(8);
                this.k.setVisibility(8);
            } else {
                View view = this.a;
                ViewGroup viewGroup = this.l;
                Context context = view.getContext();
                viewGroup.setVisibility(0);
                this.k.setVisibility(0);
                this.n.setVisibility(0);
                this.o.setText(context.getString(R.string.autoplay_off));
                this.p.setVisibility(8);
                if (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                    marginLayoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing));
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.item_medium_spacing);
                    marginLayoutParams.topMargin = dimensionPixelSize;
                    marginLayoutParams.bottomMargin = dimensionPixelSize;
                    viewGroup.setLayoutParams(marginLayoutParams);
                }
            }
        } else {
            this.n.setVisibility(8);
            SwitchCompat switchCompat = this.m;
            switchCompat.setVisibility(0);
            jkp jkpVar = this.i;
            switchCompat.setChecked(jkpVar.getBoolean(gzj.AUTOPLAY_ENABLED, true));
            agrx agrxVar = agso.a;
            switchCompat.isChecked();
            switchCompat.setOnCheckedChangeListener(this);
            this.o.setText(this.a.getContext().getString(R.string.autoplay));
            abvk abvkVar = this.h;
            anzw anzwVar = anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
            if (abvkVar.h() != null && abvkVar.h().c() != null) {
                alvw alvwVar = abvkVar.h().c().u().g;
                if (alvwVar == null) {
                    alvwVar = alvw.a;
                }
                anzw anzwVarA = anzw.a(alvwVar.p);
                if (anzwVarA != null) {
                    anzwVar = anzwVarA;
                }
            }
            boolean zC = igs.c(anzwVar);
            YouTubeTextView youTubeTextView = this.p;
            if (zC) {
                youTubeTextView.setVisibility(8);
            } else {
                youTubeTextView.setText(youTubeTextView.getContext().getResources().getString(R.string.autoplay_content_byline_text));
                youTubeTextView.setVisibility(0);
            }
            jkpVar.registerOnSharedPreferenceChangeListener(this);
            this.l.setVisibility(0);
        }
        ViewGroup viewGroup2 = this.e;
        viewGroup2.setVisibility(8);
        if (this.i.getBoolean(gzj.AUTOPLAY_ENABLED, true)) {
            ViewGroup viewGroup3 = this.l;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup3.getLayoutParams();
            if (((Optional) this.t.c).isPresent()) {
                jbw jbwVar = this.f;
                if (jbwVar != null) {
                    jbwVar.b(null);
                }
                joa joaVar = this.v;
                joaVar.c();
                joaVar.b((akrn) ((Optional) this.t.c).get(), false);
                viewGroup2.setVisibility(0);
            } else {
                this.v.c();
                Object obj3 = this.t.b;
                imc imcVar = new imc(this, 17);
                Optional optional = (Optional) obj3;
                if (true == optional.isPresent()) {
                    Object obj4 = optional.get();
                    Object obj5 = imcVar.a;
                    if (!((ajta) obj4).c.isEmpty()) {
                        jbf jbfVar = (jbf) obj5;
                        if (jbfVar.f == null) {
                            jbfVar.f = (jbw) adul.e(jbfVar.c.a, obj4, null);
                        }
                        ixi ixiVar = jbfVar.d.z;
                        ixiVar.f();
                        adly adlyVar2 = new adly();
                        adlyVar2.a(jbfVar.b);
                        adlyVar2.f("backgroundColor", Integer.valueOf(jbfVar.a.getContext().getColor(android.R.color.transparent)));
                        adlyVar2.f("chipCloudController", ixiVar);
                        jbfVar.f.hU(adlyVar2, obj4);
                        ViewGroup viewGroup4 = jbfVar.e;
                        if (viewGroup4.indexOfChild(jbfVar.f.a()) < 0) {
                            viewGroup4.addView(jbfVar.f.a());
                        }
                        viewGroup4.setVisibility(0);
                    }
                }
            }
            boolean z = ((Optional) this.t.c).isPresent() || ((Optional) this.t.b).isPresent();
            int i2 = marginLayoutParams2.leftMargin;
            int i3 = marginLayoutParams2.topMargin;
            int i4 = marginLayoutParams2.rightMargin;
            View view2 = this.a;
            if (true != z) {
                i = R.dimen.item_large_spacing;
            }
            marginLayoutParams2.setMargins(i2, i3, i4, view2.getResources().getDimensionPixelOffset(i));
            viewGroup3.setLayoutParams(marginLayoutParams2);
        }
        kro.T(((jdw) this.j).a, adlyVar);
    }

    @Override // defpackage.abdz
    public final void hn(abdy abdyVar) {
        if (!abdy.b.equals(abdyVar) || this.u || d()) {
            return;
        }
        this.b.l(new xgj(xhb.b(51009)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:21:0x00bf  */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (d()) {
            return;
        }
        jkp jkpVar = this.i;
        if (jkpVar.getBoolean(gzj.AUTOPLAY_ENABLED, true) != z) {
            this.s.c();
            agrx agrxVar = agso.a;
            jko jkoVarEdit = jkpVar.edit();
            jkoVarEdit.a(gzj.AUTOPLAY_ENABLED, z);
            jkoVarEdit.apply();
            if (!jkpVar.getBoolean(gzj.HAS_USER_CHANGED_DEFAULT_AUTOPLAY_MODE, false)) {
                if (this.t.a != ajik.AUTOMIX_MODE_UNKNOWN) {
                    jko jkoVarEdit2 = jkpVar.edit();
                    jkoVarEdit2.a(gzj.HAS_USER_CHANGED_DEFAULT_AUTOPLAY_MODE, true);
                    jkoVarEdit2.apply();
                }
                if (this.t.a == ajik.AUTOMIX_MODE_DEFAULT_ON) {
                    if (z) {
                        this.e.setVisibility(0);
                    } else {
                        aunn aunnVar = this.r;
                        iyk iykVarG = iyk.g(aunnVar != null ? (View) aunnVar.io() : a(), a().getResources().getString(R.string.autoplay_mealbar_title), a().getResources().getString(R.string.autoplay_mealbar_track_message), this.w, this.g);
                        jij jijVar = this.x;
                        aihh aihhVar = (aihh) ajnf.a.createBuilder();
                        alay alayVarD = ackj.d(this.a.getContext().getString(R.string.dialog_got_it_text));
                        aihhVar.copyOnWrite();
                        ajnf ajnfVar = (ajnf) aihhVar.instance;
                        alayVarD.getClass();
                        ajnfVar.m = alayVarD;
                        ajnfVar.b |= 64;
                        iykVarG.i(jijVar, (ajnf) aihhVar.build(), null);
                        iykVarG.f();
                        this.e.setVisibility(8);
                    }
                } else if (z) {
                    this.e.setVisibility(0);
                } else {
                    this.e.setVisibility(8);
                }
            } else if (z) {
                this.e.setVisibility(0);
            } else {
                this.e.setVisibility(8);
            }
            if (this.t != null) {
                aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                aihf aihfVarCreateBuilder2 = amcx.a.createBuilder();
                int i = true != jkpVar.getBoolean(gzj.AUTOPLAY_ENABLED, false) ? 3 : 2;
                aihfVarCreateBuilder2.copyOnWrite();
                amcx amcxVar = (amcx) aihfVarCreateBuilder2.instance;
                amcxVar.c = i - 1;
                amcxVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                amcx amcxVar2 = (amcx) aihfVarCreateBuilder2.build();
                amcxVar2.getClass();
                amddVar.l = amcxVar2;
                amddVar.b |= 32768;
                this.b.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(51009)), (amdd) aihfVarCreateBuilder.build());
                this.h.B();
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (d()) {
            return;
        }
        jkp jkpVar = this.i;
        if (TextUtils.equals(str, jkpVar.b(gzj.AUTOPLAY_ENABLED))) {
            boolean z = sharedPreferences.getBoolean(jkpVar.b(gzj.AUTOPLAY_ENABLED), true);
            agrx agrxVar = agso.a;
            this.m.setChecked(z);
        }
    }
}
