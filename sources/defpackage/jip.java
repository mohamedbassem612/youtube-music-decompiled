package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jip implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jip(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v53, types: [java.lang.Object, uxi] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, stb] */
    /* JADX WARN: Type inference failed for: r9v28, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Object, rpr] */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.Object, rpq] */
    /* JADX WARN: Type inference failed for: r9v47, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r9v55, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajwo ajwoVar;
        ajwo ajwoVar2 = null;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                ajnf ajnfVar = (ajnf) obj;
                int i = ajnfVar.b & SemanticState.Multiline;
                Object obj2 = this.a;
                if (i != 0) {
                    ?? r1 = ((kyr) obj2).a;
                    ajwo ajwoVar3 = ajnfVar.s;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    r1.c(ajwoVar3, xhd.h(obj, true));
                }
                if ((ajnfVar.b & SemanticState.Obscured) != 0) {
                    ?? r2 = ((kyr) obj2).a;
                    ajwo ajwoVar4 = ajnfVar.r;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    r2.c(ajwoVar4, xhd.h(obj, true));
                }
                if ((ajnfVar.b & SemanticState.Modal) != 0) {
                    ?? r9 = ((kyr) obj2).a;
                    ajwo ajwoVar5 = ajnfVar.q;
                    if (ajwoVar5 == null) {
                        ajwoVar5 = ajwo.a;
                    }
                    r9.a(ajwoVar5);
                }
                break;
            case 1:
                ((lqa) this.a).N(((Integer) this.b).intValue());
                break;
            case 2:
                ajwo ajwoVar6 = ((ajnf) this.b).r;
                if (ajwoVar6 == null) {
                    ajwoVar6 = ajwo.a;
                }
                ((jjd) this.a).b.a(ajwoVar6);
                break;
            case 3:
                jjv jjvVar = (jjv) this.a;
                jjvVar.b = !jjvVar.b;
                if (!jjvVar.c) {
                    jjvVar.c = true;
                    jjp jjpVar = jjvVar.f;
                    if (jjpVar != null) {
                        Object obj3 = this.b;
                        Map map = jjpVar.b;
                        if (map.get(obj3) != null) {
                            ?? r3 = ((adhg) map.get(obj3)).b;
                            List list = jjpVar.a;
                            int iIndexOf = list.indexOf(obj3);
                            List list2 = (List) Collection.EL.stream(r3).filter(new ibz(jjpVar, 16)).collect(Collectors.toCollection(new ieu(4)));
                            if (list2.size() >= 3) {
                                for (int i2 = 0; i2 < 3; i2++) {
                                    jjv jjvVar2 = (jjv) list2.get(i2);
                                    int iB = jjpVar.b(jjvVar2);
                                    if (iB >= 0) {
                                        list.remove(iB);
                                        jjpVar.B(iB);
                                    }
                                    int i3 = (((iIndexOf / 3) + 1) * 3) + i2;
                                    list.add(i3, jjvVar2);
                                    jjpVar.x(i3);
                                    jjpVar.g(jjvVar2);
                                }
                            }
                        }
                    }
                }
                jju jjuVar = jjvVar.e;
                if (jjuVar != null) {
                    jjuVar.hW((jjv) this.b);
                }
                break;
            case 4:
                jnc jncVar = (jnc) this.b;
                jncVar.c((dii) this.a, jncVar.o);
                ((ydu) jncVar.d.io()).h(3);
                jncVar.b();
                jncVar.d();
                break;
            case 5:
                joz jozVar = (joz) this.b;
                jozVar.m((dii) this.a, jozVar.V);
                jozVar.y.setVisibility(8);
                break;
            case 6:
                Object obj4 = this.b;
                Object obj5 = this.a;
                if (obj4 == aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP_STACK) {
                    ((vor) ((WatchWhileLayout) obj5).l.io()).M(false);
                } else {
                    ((vor) ((WatchWhileLayout) obj5).l.io()).t();
                }
                break;
            case 7:
                LicenseMenuActivity licenseMenuActivity = ((qor) this.b).e;
                if (licenseMenuActivity != null) {
                    ?? r10 = this.a;
                    Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
                    intent.putExtra("license", (Parcelable) r10);
                    licenseMenuActivity.startActivity(intent);
                }
                break;
            case 8:
                rll rllVar = (rll) this.a;
                xgx xgxVar = rllVar.d;
                if (xgxVar != null) {
                    rllVar.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgxVar, null);
                }
                rllVar.a.i((wnq) this.b);
                break;
            case 9:
                ((rom) this.b).e.c(((eob) this.a).g());
                break;
            case 10:
                wnr wnrVar = ((rpe) this.a).b;
                if (wnrVar != null) {
                    this.b.j(wnrVar);
                }
                break;
            case 11:
                wnq wnqVar = ((rpg) this.a).b;
                if (wnqVar != null) {
                    this.b.i(wnqVar);
                }
                break;
            case 12:
                ssv ssvVar = (ssv) this.b;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ssvVar.a());
                afxw.g(spannableStringBuilder);
                if (ssvVar.m() || !(ssvVar.y || ssvVar.l())) {
                    ssvVar.dismiss();
                } else {
                    Object obj6 = this.a;
                    Dialog dialog = ssvVar.a;
                    dialog.setCancelable(false);
                    dialog.setCanceledOnTouchOutside(false);
                    ssvVar.c(ssvVar.x);
                    ssvVar.f(false);
                    ((View) obj6).setVisibility(0);
                    ssvVar.f.setEnabled(false);
                    srb srbVar = ssvVar.z;
                    if (srbVar != null) {
                        String string = spannableStringBuilder.toString();
                        srd srdVar = srbVar.a;
                        Long l = srbVar.d;
                        sre sreVar = srbVar.c;
                        ?? r5 = srbVar.f;
                        if (!srdVar.h.h()) {
                            boolean z = srbVar.e;
                            int i4 = srbVar.b;
                            ((ssv) r5).dismiss();
                            srdVar.i(srdVar.b.getText(R.string.common_error_connection), agdf.a, i4, sreVar, r5, l, z, false);
                        } else if (sreVar.n - 1 != 0) {
                            srdVar.l(string, sreVar, r5);
                        } else {
                            srdVar.k(string, sreVar, r5, l);
                        }
                    }
                }
                break;
            case 13:
                anfy anfyVar = ((swn) this.a).g;
                if (anfyVar != null) {
                    Object obj7 = this.b;
                    adyp adypVar = new adyp();
                    adypVar.c(anfyVar);
                    adypVar.d(true);
                    ((adyr) obj7).a(adypVar.a());
                }
                break;
            case 14:
                swx swxVar = (swx) this.a;
                ImageView imageView = swxVar.c;
                if (imageView.isSelected()) {
                    swxVar.j();
                    imageView.setSelected(false);
                } else {
                    swxVar.g(nsg.h(swxVar.d.e, this.b), R.layout.ypc_offers_list_additional_offer_info_text, swxVar.b);
                    imageView.setSelected(true);
                }
                imageView.setContentDescription(imageView.isSelected() ? swxVar.a.getString(R.string.load_less_label) : swxVar.a.getString(R.string.load_more_label));
                break;
            case 15:
                CreationButtonView creationButtonView = (CreationButtonView) this.b;
                creationButtonView.f.c(creationButtonView);
                ?? r11 = this.a;
                if (r11 != 0) {
                    r11.onClick(view);
                }
                break;
            case 16:
                Object obj8 = this.b;
                uof uofVar = (uof) this.a;
                awro.t(uofVar.a, null, 0, new qbj(uofVar, (vfb) obj8, (awoq) null, 8), 3);
                break;
            case 17:
                ((ahgb) this.a).A(this.b);
                break;
            case 18:
                ((vda) this.b).c((uji) this.a);
                break;
            case 19:
                ((vda) this.b).c((uji) this.a);
                break;
            default:
                ajnf ajnfVar2 = (ajnf) this.b;
                if ((ajnfVar2.b & SemanticState.Obscured) != 0) {
                    ajwoVar = ajnfVar2.r;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                } else {
                    ajwoVar = null;
                }
                if (ajwoVar == null) {
                    if ((ajnfVar2.b & SemanticState.Modal) != 0) {
                        ajwoVar = ajnfVar2.q;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                    } else {
                        ajwoVar = null;
                    }
                }
                if (ajwoVar != null) {
                    ajwoVar2 = ajwoVar;
                } else if ((ajnfVar2.b & SemanticState.Multiline) != 0 && (ajwoVar2 = ajnfVar2.s) == null) {
                    ajwoVar2 = ajwo.a;
                }
                if (ajwoVar2 != null) {
                    ((vpk) this.a).a.a(ajwoVar2);
                }
                break;
        }
    }

    public jip(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ jip(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
