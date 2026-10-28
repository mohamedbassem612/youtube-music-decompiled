package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.playlist.comment.PlaylistCommentSpinner;
import com.google.android.apps.youtube.music.playlist.privacy.PlaylistPrivacySpinner;
import com.google.android.apps.youtube.music.playlist.voting.PlaylistVotingSpinner;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.appbar.AppBarLayout;
import com.makeramen.RoundedImageView;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jem implements aeum, jiw, ijn, adma {
    private final ViewGroup A;
    private final jfr B;
    private final ViewGroup C;
    private final TextView D;
    private final ViewGroup E;
    private final ViewGroup F;
    private final ggd G;
    private final ggd H;
    private final awli I = new awli(Boolean.FALSE);
    private avmn J;
    private avmn K;
    private final wek L;
    private final avmb M;
    private final jij N;
    public final Context a;
    public final izf b;
    protected xgn c;
    protected final View d;
    protected final View e;
    public final FrameLayout f;
    public final EditText g;
    public final EditText h;
    public final PlaylistVotingSpinner i;
    public final Toolbar j;
    public final TextView k;
    public final float l;
    public final vxz m;
    protected final hfn n;
    private final vxe o;
    private final jer p;
    private final ggd q;
    private adma r;
    private adly s;
    private final ViewGroup t;
    private final RoundedImageView u;
    private final ImageView v;
    private final ViewGroup w;
    private final ViewGroup x;
    private final PlaylistPrivacySpinner y;
    private final PlaylistCommentSpinner z;

    public jem(Context context, vxe vxeVar, izf izfVar, jij jijVar, adhv adhvVar, abxv abxvVar, jer jerVar, hfn hfnVar, vxz vxzVar, wbz wbzVar, zwb zwbVar, avmb avmbVar, View view) {
        this.a = context;
        this.d = view;
        this.o = vxeVar;
        this.b = izfVar;
        this.p = jerVar;
        this.N = jijVar;
        this.n = hfnVar;
        this.m = vxzVar;
        this.L = wbzVar.b(zwbVar.e());
        this.M = avmbVar;
        this.e = view.findViewById(R.id.edit_header_container);
        this.j = (Toolbar) view.findViewById(R.id.detail_page_toolbar);
        this.q = new ggd(view.findViewById(R.id.toolbar_divider));
        TextView textView = (TextView) view.findViewById(R.id.title_place_holder);
        this.k = textView;
        this.G = new ggd(textView);
        this.t = (ViewGroup) view.findViewById(R.id.thumbnail_container);
        RoundedImageView roundedImageView = (RoundedImageView) view.findViewById(R.id.edit_header_thumbnail);
        this.u = roundedImageView;
        this.f = (FrameLayout) view.findViewById(R.id.edit_header_thumbnail_button_container);
        this.v = (ImageView) view.findViewById(R.id.edit_header_thumbnail_icon);
        this.w = (ViewGroup) view.findViewById(R.id.name_container);
        this.x = (ViewGroup) view.findViewById(R.id.description_container);
        EditText editText = (EditText) view.findViewById(R.id.name);
        this.g = editText;
        this.h = (EditText) view.findViewById(R.id.description);
        this.y = (PlaylistPrivacySpinner) view.findViewById(R.id.privacy_status);
        this.i = (PlaylistVotingSpinner) view.findViewById(R.id.voting_status);
        this.z = (PlaylistCommentSpinner) view.findViewById(R.id.comment_status);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.collaborate_container);
        this.A = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.hashtag_suggestions_container);
        this.C = viewGroup2;
        this.D = (TextView) view.findViewById(R.id.hashtag_suggestions_title);
        this.H = new ggd(viewGroup2);
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.voting_container);
        this.E = viewGroup3;
        this.F = (ViewGroup) view.findViewById(R.id.comment_container);
        if (vxzVar.l(56, 45631656L, false)) {
            int iC = twm.c(context.getResources().getDisplayMetrics(), 16);
            ((LinearLayout) view.findViewById(R.id.list_items_container)).setOrientation(1);
            ((YouTubeTextView) view.findViewById(R.id.privacy_label)).setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.privacy_container);
            linearLayout.setPadding(0, iC, 0, 0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            viewGroup.setPadding(0, iC, 0, 0);
            viewGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            viewGroup3.setVisibility(0);
            viewGroup3.setPadding(0, iC, 0, 0);
        }
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        this.l = typedValue.getFloat();
        this.B = new jfr(context, adhvVar, abxvVar, roundedImageView);
        editText.addTextChangedListener(new gxv(this, 5));
    }

    public static final String j(String str, EditText editText) {
        return (editText.getSelectionStart() <= 0 || editText.getText().charAt(editText.getSelectionStart() + (-1)) == ' ') ? str : " ".concat(str);
    }

    private final void o(boolean z) {
        View view = this.d;
        tuk.l(view.findViewById(R.id.description_container), z);
        tuk.l(view.findViewById(R.id.privacy_container), z);
    }

    @Override // defpackage.ijn
    public final void R() {
        ViewGroup viewGroup = this.C;
        viewGroup.setVisibility(8);
        this.D.setVisibility(8);
        if (viewGroup.getChildCount() == 2) {
            viewGroup.removeViewAt(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    @Override // defpackage.ijn
    public final void X(alxg alxgVar) {
        Optional optionalEmpty;
        if (alxgVar.d.size() > 0) {
            alxl alxlVar = (alxl) alxgVar.d.get(0);
            apoq apoqVar = alxlVar.b == 49399797 ? (apoq) alxlVar.c : apoq.a;
            if (apoqVar.f.size() <= 0 || (((apox) apoqVar.f.get(0)).d & 16384) == 0) {
                optionalEmpty = Optional.empty();
            } else {
                ajta ajtaVar = ((apox) apoqVar.f.get(0)).aH;
                if (ajtaVar == null) {
                    ajtaVar = ajta.a;
                }
                optionalEmpty = Optional.of(ajtaVar);
            }
        } else {
            optionalEmpty = Optional.empty();
        }
        if (optionalEmpty.isEmpty() || ((ajta) optionalEmpty.get()).c.size() == 0) {
            return;
        }
        ViewGroup viewGroup = this.C;
        if (viewGroup.getChildCount() <= 1) {
            TextView textView = this.D;
            textView.setCompoundDrawablesWithIntrinsicBounds(jkl.c(dl.d(textView.getContext(), R.drawable.yt_outline_sparkle_vd_theme_24), textView.getResources().getColor(R.color.quantum_grey500, null)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelOffset(R.dimen.item_extra_small_spacing));
            adly adlyVar = this.s;
            if (adlyVar == null) {
                adlyVar = new adly();
            }
            adlyVar.f("chipCloudPagePadding", Integer.valueOf(viewGroup.getResources().getDimensionPixelOffset(R.dimen.item_extra_extra_large_spacing)));
            adlyVar.a(this.c);
            adma admaVarE = adul.e(this.p.a, optionalEmpty.get(), null);
            this.r = admaVarE;
            if (admaVarE != null) {
                admaVarE.hU(adlyVar, optionalEmpty.get());
                viewGroup.setVisibility(4);
                textView.setVisibility(0);
                viewGroup.addView(this.r.a());
                this.H.b();
            }
        }
    }

    @Override // defpackage.adma
    public final View a() {
        return this.d;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        kro.Z(this.e, 0, 0);
        o(true);
        this.u.setOnClickListener(null);
        this.t.setVisibility(8);
        this.f.setVisibility(8);
        ViewGroup viewGroup = this.C;
        viewGroup.setVisibility(8);
        this.D.setVisibility(8);
        if (viewGroup.getChildCount() == 2) {
            viewGroup.removeViewAt(1);
        }
        Object obj = this.K;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        avnr.b((AtomicReference) this.J);
    }

    final String d() {
        return this.h.getText().toString().trim();
    }

    final String e() {
        return this.g.getText().toString().trim();
    }

    public final void f() {
        adma admaVar = this.r;
        if (admaVar != null) {
            View viewFindViewById = admaVar.a().findViewById(R.id.chip_cloud);
            if (!(viewFindViewById instanceof RecyclerView) || ((RecyclerView) viewFindViewById).getChildCount() > 1) {
                return;
            }
            R();
        }
    }

    public final void g(boolean z) {
        this.I.kk(Boolean.valueOf(z));
    }

    public final boolean h(adly adlyVar, anny annyVar) {
        int i = annyVar.b;
        boolean z = false;
        if ((i & SemanticState.Obscured) == 0 && (i & SemanticState.Modal) == 0) {
            this.A.setVisibility(8);
        } else {
            ViewGroup viewGroup = this.A;
            viewGroup.setVisibility(0);
            z = true;
            viewGroup.setAlpha((annyVar.k || n() == 1) ? this.l : 1.0f);
            adlw adlwVar = new adlw(this.o, viewGroup);
            if (n() != 1) {
                xgn xgnVar = adlyVar.b;
                ajwo ajwoVar = annyVar.l;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                adlwVar.a(xgnVar, ajwoVar, adlyVar.e(), null);
            } else {
                adlwVar.b();
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0128  */
    /* JADX WARN: Code duplicated, block: B:71:0x012d  */
    /* JADX WARN: Code duplicated, block: B:76:0x013c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146  */
    /* JADX WARN: Code duplicated, block: B:81:0x014e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v39, types: [ackf, android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v41 */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        int i;
        ViewGroup viewGroup;
        int i2;
        int i3;
        aliz alizVarA;
        String upperCase;
        int iHashCode;
        final anny annyVar = (anny) obj;
        this.s = adlyVar;
        ?? r6 = 0;
        this.J = this.I.af(new gkr(annyVar.j.G(), adlyVar, 19, 0 == true ? 1 : 0));
        xgn xgnVar = adlyVar.b;
        if (xgnVar != xgn.l) {
            this.c = xgnVar;
        }
        if (adlyVar.b("pagePadding", -1) > 0) {
            Context context = this.a;
            adlyVar.f("pagePadding", Integer.valueOf(jnj.w(context) - context.getResources().getDimensionPixelSize(R.dimen.item_extra_extra_large_spacing)));
            kro.T(this.e, adlyVar);
        }
        boolean zJ = adlyVar.j("isSideloadedContext");
        boolean z = false;
        if (zJ) {
            o(false);
            tuk.l(this.E, false);
        }
        EditText editText = this.g;
        alay alayVar = annyVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        editText.setText(ackj.k(null, alayVar, null, false));
        EditText editText2 = this.h;
        alay alayVar2 = annyVar.e;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        editText2.setText(ackj.k(null, alayVar2, null, false));
        akoc akocVar = annyVar.g;
        if (akocVar == null) {
            akocVar = akoc.a;
        }
        akob akobVar = akocVar.b;
        if (akobVar == null) {
            akobVar = akob.a;
        }
        int size = akobVar.c.size();
        if (size > 0) {
            ikj[] ikjVarArr = new ikj[size];
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                akoc akocVar2 = annyVar.g;
                if (akocVar2 == null) {
                    akocVar2 = akoc.a;
                }
                akob akobVar2 = akocVar2.b;
                if (akobVar2 == null) {
                    akobVar2 = akob.a;
                }
                akny aknyVar = (akny) akobVar2.c.get(i4);
                if ((aknyVar.b & 8) != 0) {
                    akoa akoaVar = aknyVar.c;
                    if (akoaVar == null) {
                        akoaVar = akoa.a;
                    }
                    akoaVar.getClass();
                    if ((akoaVar.b & SemanticState.Obscured) != 0) {
                        alja aljaVar = akoaVar.j;
                        if (aljaVar == null) {
                            aljaVar = alja.a;
                        }
                        alizVarA = aliz.a(aljaVar.c);
                        if (alizVarA == null) {
                            alizVarA = aliz.UNKNOWN;
                        }
                    } else {
                        alizVarA = aliz.LOCK;
                    }
                    alay alayVar3 = akoaVar.e;
                    if (alayVar3 == null) {
                        alayVar3 = alay.a;
                    }
                    Spanned spannedK = ackj.k(r6, alayVar3, r6, z);
                    alay alayVar4 = akoaVar.f;
                    if (alayVar4 == null) {
                        alayVar4 = alay.a;
                    }
                    Spanned spannedK2 = ackj.k(r6, alayVar4, r6, z);
                    int i6 = akoaVar.c;
                    int iAS = i6 == 6 ? a.aS(i6 == 6 ? ((Integer) akoaVar.d).intValue() : 0) : 0;
                    if (iAS == 0) {
                        int i7 = akoaVar.c;
                        if (i7 == 7) {
                            String str = "";
                            if (i7 != 7) {
                                upperCase = str.toUpperCase(Locale.getDefault());
                                iHashCode = upperCase.hashCode();
                                if (iHashCode != -1924094359) {
                                    if (upperCase.equals("PUBLIC")) {
                                        iAS = 2;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                if (iHashCode == 403485027) {
                                    if (iHashCode == 566621590) {
                                        iAS = 3;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                if (upperCase.equals("PRIVATE")) {
                                    iAS = 1;
                                }
                                throw new IllegalArgumentException();
                            }
                            try {
                                str = (String) akoaVar.d;
                                upperCase = str.toUpperCase(Locale.getDefault());
                                iHashCode = upperCase.hashCode();
                                if (iHashCode != -1924094359) {
                                    if (upperCase.equals("PUBLIC")) {
                                        iAS = 2;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                if (iHashCode == 403485027) {
                                    if (upperCase.equals("PRIVATE")) {
                                        iAS = 1;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                if (iHashCode == 566621590 && upperCase.equals("UNLISTED")) {
                                    iAS = 3;
                                }
                                throw new IllegalArgumentException();
                            } catch (IllegalArgumentException e) {
                                ((agrc) ((agrc) ((agrc) iki.a.b().i(agso.a, "PlaylistPrivacyDropdown")).j(e)).k("com/google/android/apps/youtube/music/playlist/privacy/PlaylistPrivacyDropdownItem", "parsePrivacyStatus", 'D', "PlaylistPrivacyDropdownItem.java")).t("Wrong Playlist PrivacyStatus string value from server");
                                iAS = 0;
                            }
                        } else {
                            iAS = 0;
                        }
                    }
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    ikjVarArr[i4] = new iki(spannedK, alizVarA, spannedK2, iAS);
                    akoa akoaVar2 = aknyVar.c;
                    if (akoaVar2 == null) {
                        akoaVar2 = akoa.a;
                    }
                    if (akoaVar2.g) {
                        i5 = i4;
                    }
                }
                i4++;
                r6 = 0;
                z = false;
            }
            i = 2;
            PlaylistPrivacySpinner playlistPrivacySpinner = this.y;
            playlistPrivacySpinner.setAdapter((SpinnerAdapter) new ikk(playlistPrivacySpinner.getContext(), playlistPrivacySpinner.a, ikjVarArr, this.b));
            playlistPrivacySpinner.setSelection(i5);
        } else {
            i = 2;
            PlaylistPrivacySpinner playlistPrivacySpinner2 = this.y;
            playlistPrivacySpinner2.c(this.b);
            int iAS2 = a.aS(annyVar.f);
            if (iAS2 == 0) {
                iAS2 = 1;
            }
            playlistPrivacySpinner2.setSelection(ikh.d(iAS2).ordinal());
        }
        PlaylistPrivacySpinner playlistPrivacySpinner3 = this.y;
        playlistPrivacySpinner3.setOnItemSelectedListener(new jel(this, adlyVar, annyVar));
        if (this.m.l(56, 45631656L, false)) {
            akoc akocVar3 = annyVar.h;
            if (akocVar3 == null) {
                akocVar3 = akoc.a;
            }
            akob akobVar3 = akocVar3.b;
            if (akobVar3 == null) {
                akobVar3 = akob.a;
            }
            int size2 = akobVar3.c.size();
            if (size2 > 0) {
                ikr[] ikrVarArr = new ikr[size2];
                int i8 = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    akoc akocVar4 = annyVar.h;
                    if (akocVar4 == null) {
                        akocVar4 = akoc.a;
                    }
                    akob akobVar4 = akocVar4.b;
                    if (akobVar4 == null) {
                        akobVar4 = akob.a;
                    }
                    akny aknyVar2 = (akny) akobVar4.c.get(i9);
                    if ((aknyVar2.b & 8) != 0) {
                        akoa akoaVar3 = aknyVar2.c;
                        if (akoaVar3 == null) {
                            akoaVar3 = akoa.a;
                        }
                        ikrVarArr[i9] = ikq.d(akoaVar3);
                        akoa akoaVar4 = aknyVar2.c;
                        if (akoaVar4 == null) {
                            akoaVar4 = akoa.a;
                        }
                        if (akoaVar4.g) {
                            i8 = i9;
                        }
                    }
                }
                this.i.c(ikrVarArr, i8, this.b);
            } else {
                PlaylistVotingSpinner playlistVotingSpinner = this.i;
                playlistVotingSpinner.setAdapter((SpinnerAdapter) new ikt(playlistVotingSpinner.getContext(), playlistVotingSpinner.a, ikp.values(), this.b));
                playlistVotingSpinner.setSelection(ikp.d(i).ordinal());
                playlistVotingSpinner.setSelection(ikp.d(4).ordinal());
            }
            akoc akocVar5 = annyVar.h;
            if (akocVar5 == null) {
                akocVar5 = akoc.a;
            }
            akob akobVar5 = akocVar5.b;
            if (akobVar5 == null) {
                akobVar5 = akob.a;
            }
            boolean z2 = akobVar5.e;
            PlaylistVotingSpinner playlistVotingSpinner2 = this.i;
            playlistVotingSpinner2.setEnabled(!z2);
            this.d.findViewById(R.id.voting_container).setAlpha(!z2 ? 1.0f : this.l);
            final int i10 = 0;
            while (true) {
                if (i10 >= playlistVotingSpinner2.getAdapter().getCount()) {
                    i10 = -1;
                    break;
                } else if (((ikr) playlistVotingSpinner2.getAdapter().getItem(i10)).e() == 3) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            } else {
                this.K = this.L.j(annyVar.r, true).O(this.M).af(new avni() { // from class: jek
                    @Override // defpackage.avni
                    public final void a(Object obj2) {
                        weh wehVar = ((weo) obj2).c;
                        if (wehVar == null || !(wehVar instanceof aosy)) {
                            return;
                        }
                        int i11 = i10;
                        aosy aosyVar = (aosy) wehVar;
                        if (i11 != -1) {
                            akoc akocVar6 = annyVar.h;
                            if (akocVar6 == null) {
                                akocVar6 = akoc.a;
                            }
                            akob akobVar6 = akocVar6.b;
                            if (akobVar6 == null) {
                                akobVar6 = akob.a;
                            }
                            akny aknyVar3 = (akny) akobVar6.c.get(i11);
                            if ((aknyVar3.b & 8) != 0) {
                                akoa akoaVar5 = aknyVar3.c;
                                if (akoaVar5 == null) {
                                    akoaVar5 = akoa.a;
                                }
                                jem jemVar = this.a;
                                aihf builder = akoaVar5.toBuilder();
                                boolean z3 = !aosyVar.getIsCollaborative().booleanValue();
                                builder.copyOnWrite();
                                akoa akoaVar6 = (akoa) builder.instance;
                                akoaVar6.b |= SemanticState.ReadOnly;
                                akoaVar6.i = z3;
                                ikq ikqVarD = ikq.d((akoa) builder.build());
                                PlaylistVotingSpinner playlistVotingSpinner3 = jemVar.i;
                                ikr[] ikrVarArr2 = new ikr[playlistVotingSpinner3.getAdapter().getCount()];
                                for (int i12 = 0; i12 < playlistVotingSpinner3.getAdapter().getCount(); i12++) {
                                    ikrVarArr2[i12] = (ikr) playlistVotingSpinner3.getAdapter().getItem(i12);
                                }
                                izf izfVar = jemVar.b;
                                ikrVarArr2[i11] = ikqVarD;
                                playlistVotingSpinner3.c(ikrVarArr2, playlistVotingSpinner3.getSelectedItemPosition(), izfVar);
                            }
                        }
                    }
                });
            }
        }
        if ((annyVar.b & SemanticState.Focused) != 0) {
            int iC = twm.c(this.a.getResources().getDisplayMetrics(), 16);
            ViewGroup viewGroup2 = this.F;
            viewGroup2.setVisibility(0);
            viewGroup2.setPadding(0, iC, 0, 0);
        }
        apji apjiVar = annyVar.i;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVar = akog.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        int size3 = ((akob) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c.size();
        if (size3 > 0) {
            iju[] ijuVarArr = new iju[size3];
            int i11 = 0;
            int i12 = 0;
            while (i11 < size3) {
                apji apjiVar2 = annyVar.i;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                akny aknyVar3 = (akny) ((akob) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).c.get(i11);
                if ((aknyVar3.b & 8) != 0) {
                    akoa akoaVar5 = aknyVar3.c;
                    if (akoaVar5 == null) {
                        akoaVar5 = akoa.a;
                    }
                    akoaVar5.getClass();
                    alay alayVar5 = akoaVar5.e;
                    if (alayVar5 == null) {
                        alayVar5 = alay.a;
                    }
                    Spanned spannedK3 = ackj.k(null, alayVar5, null, false);
                    alay alayVar6 = akoaVar5.f;
                    if (alayVar6 == null) {
                        alayVar6 = alay.a;
                    }
                    i3 = size3;
                    ijuVarArr[i11] = new iju(spannedK3, ackj.k(null, alayVar6, null, false), iju.a(akoaVar5));
                    akoa akoaVar6 = aknyVar3.c;
                    if (akoaVar6 == null) {
                        akoaVar6 = akoa.a;
                    }
                    if (akoaVar6.g) {
                        i12 = i11;
                    }
                } else {
                    i3 = size3;
                }
                i11++;
                size3 = i3;
            }
            PlaylistCommentSpinner playlistCommentSpinner = this.z;
            playlistCommentSpinner.setAdapter((SpinnerAdapter) new ijv(playlistCommentSpinner.getContext(), playlistCommentSpinner.a, ijuVarArr, this.b));
            playlistCommentSpinner.setSelection(i12);
        }
        boolean zH = h(adlyVar, annyVar);
        EditText editText3 = this.g;
        if (zJ) {
            editText3.setAccessibilityTraversalBefore(R.id.done_editing);
        } else {
            editText3.setAccessibilityTraversalBefore(R.id.description);
            this.h.setAccessibilityTraversalBefore(R.id.privacy_status);
            if (this.E.getVisibility() == 0) {
                playlistPrivacySpinner3.setAccessibilityTraversalBefore(R.id.voting_status);
                viewGroup = this.i;
            } else {
                viewGroup = playlistPrivacySpinner3;
            }
            if (this.F.getVisibility() == 0) {
                viewGroup.setAccessibilityTraversalBefore(R.id.comment_status);
                viewGroup = this.z;
            }
            if (zH) {
                viewGroup.setAccessibilityTraversalBefore(R.id.collaborate_container);
                viewGroup = this.A;
            }
            viewGroup.setAccessibilityTraversalBefore(R.id.done_editing);
        }
        jij jijVar = this.N;
        apji apjiVar3 = annyVar.o;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anyj.a);
        apjiVar3.c(aihlVarCheckIsLite3);
        if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
            jfr jfrVar = this.B;
            apji apjiVar4 = annyVar.o;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anyj.a);
            apjiVar4.c(aihlVarCheckIsLite4);
            Object objK3 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
            jfrVar.hU(adlyVar, (anyi) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3)));
            apji apjiVar5 = annyVar.p;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajnp.a);
            apjiVar5.c(aihlVarCheckIsLite5);
            if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
                View view = this.v;
                FrameLayout frameLayout = this.f;
                jbm jbmVarA = jijVar.a(view, frameLayout, null, null, false);
                apji apjiVar6 = annyVar.p;
                if (apjiVar6 == null) {
                    apjiVar6 = apji.a;
                }
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ajnp.a);
                apjiVar6.c(aihlVarCheckIsLite6);
                Object objK4 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
                jbmVarA.hU(adlyVar, (ajnf) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4)));
                this.u.setOnClickListener(new ivp(this, 17));
                i2 = 0;
                frameLayout.setVisibility(0);
            } else {
                i2 = 0;
            }
            this.t.setVisibility(i2);
        }
        boolean z3 = annyVar.m;
        boolean z4 = !z3;
        boolean z5 = annyVar.n;
        boolean z6 = !z5;
        this.g.setEnabled(z4);
        this.w.setAlpha(!z3 ? 1.0f : this.l);
        this.h.setEnabled(z4);
        this.x.setAlpha(!z3 ? 1.0f : this.l);
        playlistPrivacySpinner3.setEnabled(z6);
        View view2 = this.d;
        view2.findViewById(R.id.privacy_container).setAlpha(!z5 ? 1.0f : this.l);
        view2.findViewById(R.id.privacy_label).setAlpha(!z5 ? 1.0f : this.l);
    }

    @Override // defpackage.jiw
    public final void i(int i) {
        View view = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, this.j.getHeight() + i, 0, 0);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    final int k() {
        return ((iju) this.z.getSelectedItem()).c;
    }

    final int l() {
        return ((ikr) this.i.getSelectedItem()).e();
    }

    @Override // defpackage.aeum, defpackage.aeui
    public final void m(AppBarLayout appBarLayout, int i) {
        Toolbar toolbar = this.j;
        int height = toolbar.getHeight();
        Rect rect = new Rect();
        ((Activity) this.a).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = height + rect.top;
        View view = this.e;
        int height2 = view.getHeight();
        float fMax = Math.max((Math.max(view.getHeight() + i, 0) - this.n.K()) / height2, 0.0f);
        if (height2 > 0 && view != null) {
            view.setAlpha(fMax);
        }
        toolbar.getBackground().setAlpha(fMax == 0.0f ? 255 : 0);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int height3 = (iArr[1] + view.getHeight()) - toolbar.getHeight();
        ggd ggdVar = this.G;
        if (height3 < i2) {
            ggdVar.b();
        } else {
            ggdVar.a();
        }
        int iF = i + appBarLayout.f();
        ggd ggdVar2 = this.q;
        if (iF <= 0) {
            ggdVar2.b();
        } else {
            ggdVar2.a();
        }
    }

    final int n() {
        return this.y.d();
    }
}
