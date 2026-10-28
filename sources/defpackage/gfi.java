package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gfi implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gfi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r4v40, types: [android.view.Menu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, wer] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                String str = gfk.a;
                this.a.j(wfs.g(295, "video_".concat(String.valueOf((String) obj))));
                break;
            case 1:
                String str2 = gfk.a;
                aihf aihfVarCreateBuilder = anty.a.createBuilder();
                float fFloatValue = ((Float) obj).floatValue();
                aihfVarCreateBuilder.copyOnWrite();
                anty antyVar = (anty) aihfVarCreateBuilder.instance;
                antyVar.b |= 8;
                antyVar.f = fFloatValue;
                ((antu) this.a).an(aihfVarCreateBuilder);
                break;
            case 2:
                String str3 = gfk.a;
                this.a.j(wfs.g(295, "playlist_".concat(String.valueOf((String) obj))));
                break;
            case 3:
                String str4 = gfk.a;
                this.a.j(wfs.g(295, "playlist_set_".concat(String.valueOf((String) obj))));
                break;
            case 4:
                float fFloatValue2 = ((Float) obj).floatValue();
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                anty antyVar2 = (anty) aihfVar.instance;
                anty antyVar3 = anty.a;
                antyVar2.b |= 8;
                antyVar2.f = fFloatValue2;
                break;
            case 5:
                AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) obj;
                gms gmsVar = (gms) this.a;
                if (gmsVar.G != null && behavior.getTopAndBottomOffset() == 0) {
                    gmsVar.G.setVisibility(8);
                    gmsVar.J = false;
                    break;
                }
                break;
            case 6:
                ((AppBarLayout.Behavior) obj).setTopAndBottomOffset(((gms) this.a).I);
                break;
            case 7:
                ((gms) this.a).I = ((AppBarLayout.Behavior) obj).getTopAndBottomOffset();
                break;
            case 8:
                ((AppBarLayout.Behavior) obj).setTopAndBottomOffset(((gnf) this.a).x);
                break;
            case 9:
                heh hehVar = ((gnf) this.a).s;
                heg hegVar = new heg(hehVar.c);
                hegVar.e((xir) obj);
                hehVar.c(hegVar.d());
                break;
            case 10:
                ((gnf) this.a).x = ((AppBarLayout.Behavior) obj).getTopAndBottomOffset();
                break;
            case 11:
                ((gnv) this.a).c.a((ajwo) obj);
                break;
            case 12:
                ((AppBarLayout.Behavior) obj).setTopAndBottomOffset(((goc) this.a).x);
                break;
            case 13:
                int i = gox.aq;
                this.a.put("sectionListController", (jav) obj);
                break;
            case 14:
                agrf agrfVar = gpl.U;
                ((gpv) obj).f(this.a);
                break;
            case 15:
                ((gpv) obj).c((gpl) this.a);
                break;
            case 16:
                ((gpv) obj).c((gpl) this.a);
                break;
            case 17:
                ajsy ajsyVar = (ajsy) obj;
                if ((ajsyVar.b & 8) != 0) {
                    Object obj2 = this.a;
                    vxe vxeVar = ((gpl) obj2).c;
                    ajwo ajwoVar = ajsyVar.h;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar.c(ajwoVar, ((gnf) obj2).i());
                }
                break;
            case 18:
                agrf agrfVar2 = gpl.U;
                ((gpv) obj).b(this.a);
                break;
            case 19:
                aihf aihfVarCreateBuilder2 = amiu.a.createBuilder();
                boolean zIsPresent = ((Optional) this.a).isPresent();
                aihfVarCreateBuilder2.copyOnWrite();
                amiu amiuVar = (amiu) aihfVarCreateBuilder2.instance;
                amiuVar.c |= SemanticState.Focused;
                amiuVar.C = zIsPresent;
                ((xir) obj).h((amiu) aihfVarCreateBuilder2.build());
                break;
            default:
                ((ahgb) obj).ai((Throwable) this.a);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
