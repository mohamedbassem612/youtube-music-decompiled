package defpackage;

import android.app.Dialog;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class addb implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ addb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                ((ntg) this.a).j((mpt) obj);
                break;
            case 1:
                ((ntg) this.a).l((mpt) obj);
                break;
            case 2:
                ((xje) obj).b(((adeo) this.a).a, "img_lerr");
                break;
            case 3:
                ((xje) obj).b((String) this.a, "img_lf");
                break;
            case 4:
                ((xje) obj).b((String) this.a, "img_lf");
                break;
            case 5:
                ((xje) obj).b((String) this.a, "img_lerr");
                break;
            case 6:
                ((xje) obj).b(((adeo) this.a).a, "img_lerr");
                break;
            case 7:
                ((xje) obj).b(((adem) this.a).a, "img_lerr");
                break;
            case 8:
                ((xje) obj).b((String) this.a, "img_ls");
                break;
            case 9:
                ((xje) obj).b(((Uri) this.a).toString(), "img_vv");
                break;
            case 10:
                ((xje) obj).b((String) this.a, "img_lc");
                break;
            case 11:
                ((xje) obj).a((String) this.a);
                break;
            case 12:
                ((xje) obj).b((String) this.a, "img_lf");
                break;
            case 13:
                ((xje) obj).b((String) this.a, "img_lerr");
                break;
            case 14:
                ((xje) obj).b((String) this.a, "img_lc");
                break;
            case 15:
                ((xje) obj).b((String) this.a, "img_ls");
                break;
            case 16:
                mfx mfxVar = (mfx) this.a;
                acwq acwqVar = (acwq) obj;
                boolean z = !Objects.equals(mfxVar.l, Boolean.FALSE);
                acwf acwfVarT = acww.t();
                acwfVarT.b(z);
                String str = mfxVar.a;
                if (str != null) {
                    acwfVarT.a = str;
                }
                String str2 = mfxVar.b;
                if (str2 != null) {
                    acwfVarT.b = ackj.c(str2);
                }
                aihh aihhVarH = acfz.H(mfxVar.c, mfxVar.e);
                if (aihhVarH != null) {
                    acwfVarT.c = acfz.G(aihhVarH);
                }
                aihh aihhVarH2 = acfz.H(mfxVar.d, mfxVar.f);
                if (aihhVarH2 != null) {
                    acwfVarT.d = acfz.F(aihhVarH2);
                }
                ajwo ajwoVarD = aecm.D(mfxVar);
                if (ajwoVarD != null) {
                    acwfVarT.e = ajwoVarD;
                }
                acwqVar.f(acwfVarT.a());
                break;
            case 17:
                ((acwq) obj).e((mfx) this.a);
                break;
            case 18:
                Dialog dialog = ((adfj) obj).peer().a.f;
                if (dialog != null) {
                    ((mel) dialog.findViewById(R.id.elements_dialog_fragment_elements_view)).a((byte[]) this.a, null);
                }
                break;
            case 19:
                ((wqa) this.a).e = (alab) obj;
                break;
            default:
                ((wqa) this.a).c = (String) obj;
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
