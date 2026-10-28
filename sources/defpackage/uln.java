package defpackage;

import android.util.Pair;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.libraries.youtube.creation.common.ui.CreationFeatureDescriptionView;
import com.google.android.libraries.youtube.creation.common.ui.ShortsEditToolButtonView;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uln implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ uln(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ugf] */
    /* JADX WARN: Type inference failed for: r0v31, types: [avlw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        vbp vbpVar;
        Object obj2;
        boolean zC;
        int i = 6;
        int i2 = 4;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                this.a.b((Throwable) obj);
                return;
            case 1:
                Object obj3 = this.a;
                ((ulp) obj3).b.execute(afwl.i(new uqd(obj3, (Optional) obj, 1)));
                return;
            case 2:
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    ((ulp) this.a).g().b((auhs) optional.get());
                    return;
                }
                return;
            case 3:
                ((ulp) this.a).m((Throwable) obj, "Error observing composition changes");
                return;
            case 4:
                ((ulp) this.a).h((agke) obj);
                return;
            case 5:
                if (((Integer) obj).intValue() == 0) {
                    ((ulp) this.a).l(Optional.ofNullable(null));
                    return;
                }
                return;
            case 6:
                ((ulp) this.a).m((Throwable) obj, "Error handling TTS control state update.");
                return;
            case 7:
                ((ulp) this.a).m((Throwable) obj, "Error handling loading state update.");
                return;
            case 8:
                ((ulp) this.a).m((Throwable) obj, "Error observing applied effects");
                return;
            case 9:
                ((ulp) this.a).m((Throwable) obj, "Error handling full page scrim update.");
                return;
            case 10:
                ((ulp) this.a).m((Throwable) obj, "Error handling asset effect selection status update.");
                return;
            case 11:
                Optional optionalOfNullable = (Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(agke.q((ury) optionalOfNullable.get()));
                }
                ((ulp) this.a).h((agke) optionalOfNullable.orElse(agpi.a));
                return;
            case 12:
                ((ulp) this.a).m((Throwable) obj, "Error observing applied effects");
                return;
            case 13:
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 16;
                zvjVarA.d("[ShortsCreation][Android][Edit] Error while observing on player playing status");
                zvjVarA.f((Throwable) obj);
                ((ulp) this.a).x.a(zvjVarA.a());
                return;
            case 14:
                this.a.kk((Boolean) obj);
                return;
            case 15:
                agke agkeVar = (agke) obj;
                int size = agkeVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    apxf apxfVar = (apxf) agkeVar.get(i3);
                    arft arftVarA = arft.a(apxfVar.c);
                    if (arftVarA == null) {
                        arftVarA = arft.TOOLBELT_BUTTON_TYPE_UNSPECIFIED;
                    }
                    Object obj4 = this.a;
                    if (arftVarA == arft.TOOLBELT_BUTTON_TYPE_FILTER_PICKER || arftVarA == arft.TOOLBELT_BUTTON_TYPE_PROMPT_STICKER || arftVarA == arft.TOOLBELT_BUTTON_TYPE_STICKER_PICKER || arftVarA == arft.TOOLBELT_BUTTON_TYPE_GENERATED_ASSET_REPORT || arftVarA == arft.TOOLBELT_BUTTON_TYPE_VIBE_EDIT || (arftVarA == arft.TOOLBELT_BUTTON_TYPE_EFFECT_PICKER && ((ums) obj4).d.O())) {
                        ((ums) obj4).c.L(arftVarA).kk(Optional.of(apxfVar));
                    } else {
                        int i4 = arftVarA.o;
                        zvp.a(zvn.b, zvm.M, "[Creation][Android][VideoEditor]ShortsToolbeltButtonRenderer type not supported in Edit, ToolbeltButtonType = " + i4);
                    }
                }
                return;
            case 16:
                agkz agkzVar = (agkz) obj;
                umu umuVar = (umu) this.a;
                View view = umuVar.g;
                View viewFindViewById = view.findViewById(R.id.shorts_edit_preset_button);
                CreationFeatureDescriptionView creationFeatureDescriptionView = (CreationFeatureDescriptionView) view.findViewById(R.id.creation_feature_description_view);
                ShortsPlayerView shortsPlayerView = (ShortsPlayerView) view.findViewById(R.id.shorts_edit_player_view);
                umt umtVar = umuVar.j;
                boolean z = umtVar.a;
                View[] viewArr = (z && (viewFindViewById instanceof CreationButtonView)) ? new View[]{view.findViewById(R.id.shorts_edit_top_bar_container), view.findViewById(R.id.shorts_edit_toolbar), view.findViewById(R.id.edit_expandy_toolbar), view.findViewById(R.id.shorts_edit_bottom_bar)} : new View[]{view.findViewById(R.id.shorts_edit_top_bar_container), view.findViewById(R.id.shorts_edit_toolbar)};
                if (!agkzVar.contains(uxc.GET_ASSET_FILTER_PICKER_EDITOR) || !umtVar.b) {
                    viewFindViewById.setVisibility(8);
                    return;
                }
                if (z) {
                    vbpVar = (vbp) umuVar.c.io();
                    obj2 = (CreationButtonView) viewFindViewById;
                } else {
                    vbpVar = (vbp) umuVar.b.io();
                    obj2 = (ShortsEditToolButtonView) viewFindViewById;
                }
                vbpVar.l(true);
                zf zfVar = new zf((Object) creationFeatureDescriptionView);
                int i5 = 5;
                avlr avlrVarK = umuVar.e.c.L(arft.TOOLBELT_BUTTON_TYPE_FILTER_PICKER).B(new sqj(i5)).K(new rtq(19));
                awly awlyVar = umuVar.f.h.f;
                xhc xhcVarB = xhb.b(122896);
                vbpVar.t = zfVar;
                vbpVar.p = shortsPlayerView;
                vbpVar.o = xhcVarB;
                avmm avmmVar = vbpVar.f;
                avmb avmbVar = vbpVar.c;
                avmmVar.c(avlrVarK.O(avmbVar).af(new mnt(vbpVar, obj2, i5, bArr)));
                avmmVar.c(awlyVar.O(avmbVar).an(apji.a).C(new var(vbpVar, i)));
                avmmVar.c(((avlh) vbpVar.r.a).p().L(avmbVar).ak(new var(vbpVar, 7)));
                umuVar.k = vbpVar;
                umuVar.k.n = true;
                uyg uygVar = umuVar.h;
                cc ccVar = umuVar.d;
                boc lifecycle = ccVar.getLifecycle();
                uygVar.c = 1;
                uygVar.a = viewArr;
                uygVar.b = new View[uygVar.a.length];
                uygVar.d.L().d(uygVar);
                lifecycle.b(new uyf(uygVar, 0));
                vqv vqvVar = umuVar.i;
                vqvVar.e(ccVar.getLifecycle(), shortsPlayerView);
                vqvVar.d = ccVar.getResources().getDimensionPixelSize(R.dimen.shorts_editor_shrunk_view_bottom_padding);
                return;
            case 17:
                this.a.invoke(obj);
                return;
            case 18:
                ((ukd) this.a).d(((Boolean) obj).booleanValue());
                return;
            case 19:
                Pair pair = (Pair) obj;
                uoa uoaVar = ((unn) this.a).o;
                if (uoaVar != null) {
                    ugb ugbVar = (ugb) pair.second;
                    if (!uoaVar.E.l(72, 45791091L, false)) {
                        if (uoaVar.h()) {
                            Optional optional2 = uoaVar.x;
                            sda sdaVar = new sda(uoaVar, ugbVar, i, bArr);
                            if (true == optional2.isPresent()) {
                                ((uoa) sdaVar.b).e(((unr) optional2.get()).b((ugb) sdaVar.a));
                            }
                        }
                        if (uoaVar.i()) {
                            uoaVar.r.isPresent();
                            return;
                        }
                        return;
                    }
                    if (uoaVar.h()) {
                        Optional optional3 = uoaVar.x;
                        uhe uheVar = new uhe(ugbVar, 13);
                        if (true == optional3.isPresent()) {
                            ((unr) optional3.get()).b((ugb) uheVar.a);
                        }
                    }
                    int iOrdinal = ugbVar.ordinal();
                    if (iOrdinal == 0) {
                        uoaVar.c(false);
                        return;
                    } else {
                        if (iOrdinal == 1) {
                            uoaVar.c(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                Optional optional4 = (Optional) obj;
                uoa uoaVar2 = ((unn) this.a).o;
                if (uoaVar2 == null || !uoaVar2.h()) {
                    return;
                }
                Optional optional5 = uoaVar2.x;
                sda sdaVar2 = new sda(uoaVar2, optional4, i2);
                if (true == optional5.isPresent()) {
                    Object obj5 = optional5.get();
                    Object obj6 = sdaVar2.a;
                    Object obj7 = sdaVar2.b;
                    synchronized (((unr) obj5).e) {
                        if (((Optional) obj7).isEmpty()) {
                            ((unr) obj5).b = false;
                        } else {
                            ((unr) obj5).b = ((auhs) ((Optional) obj7).get()).d.size() > 1 || ((auhs) ((Optional) obj7).get()).g.size() > 0;
                        }
                        zC = ((unr) obj5).c();
                        break;
                    }
                    ((uoa) obj6).e(zC);
                    return;
                }
                return;
        }
    }
}
