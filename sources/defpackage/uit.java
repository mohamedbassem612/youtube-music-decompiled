package defpackage;

import android.net.Uri;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.editor.image.mediagen.MediaGenInputView;
import com.google.android.libraries.youtube.creation.geo.LocationSearchView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uit implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ uit(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0158  */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, vxe] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Optional optionalOf;
        Optional optionalEmpty;
        uhe uheVar;
        switch (this.$cid) {
            case 0:
                uiv uivVar = (uiv) this.a;
                uivVar.u.k(uiv.a).d();
                uivVar.p();
                break;
            case 1:
                ((uiv) this.a).p();
                break;
            case 2:
                ((unn) this.a).f();
                break;
            case 3:
                ((unn) this.a).e();
                break;
            case 4:
                MediaGenInputView mediaGenInputView = (MediaGenInputView) ((uoa) this.a).a.requireView().findViewById(R.id.media_gen_image_editor);
                if (mediaGenInputView != null) {
                    mediaGenInputView.setVisibility(0);
                    mediaGenInputView.peer().f(true);
                }
                break;
            case 5:
                uoo uooVar = (uoo) this.a;
                uop uopVar = uooVar.c;
                uop uopVar2 = uop.b;
                if (uopVar == uopVar2) {
                    uopVar2 = uop.a;
                }
                uooVar.c = uopVar2;
                uooVar.a();
                uooVar.c();
                uooVar.b();
                break;
            case 6:
                uoo uooVar2 = (uoo) this.a;
                uop uopVar3 = uooVar2.c;
                uop uopVar4 = uop.c;
                if (uopVar3 == uopVar4) {
                    uopVar4 = uop.a;
                }
                uooVar2.c = uopVar4;
                uooVar2.a();
                uooVar2.c();
                uooVar2.b();
                break;
            case 7:
                Object obj = this.a;
                upg upgVar = (upg) obj;
                upgVar.g();
                uon uonVar = upgVar.d;
                int i = uonVar.c;
                if (i <= 0) {
                    int i2 = uonVar.b - 1;
                    uonVar.b = i2;
                    if (i2 < 0) {
                        uonVar.b = -1;
                        uonVar.c = 0;
                        optionalOf = Optional.empty();
                    } else {
                        aami aamiVarE = uonVar.e();
                        uonVar.c = aamiVarE != null ? ((ArrayList) aamiVarE.b).size() - 1 : 0;
                    }
                    optionalOf.ifPresentOrElse(new tsd(obj, 14), new ull(obj, 3));
                } else {
                    uonVar.c = i - 1;
                }
                optionalOf = Optional.of((uom) ((ArrayList) ((aami) uonVar.a.get(uonVar.b)).b).get(uonVar.c));
                optionalOf.ifPresentOrElse(new tsd(obj, 14), new ull(obj, 3));
                break;
            case 8:
                Object obj2 = this.a;
                upg upgVar2 = (upg) obj2;
                upgVar2.g();
                uon uonVar2 = upgVar2.d;
                aami aamiVarE2 = uonVar2.e();
                if (aamiVarE2 == null || uonVar2.c >= ((ArrayList) aamiVarE2.b).size() - 1) {
                    if (uonVar2.b >= uonVar2.a.size() - 1) {
                        optionalEmpty = Optional.empty();
                    } else {
                        uonVar2.b++;
                        uonVar2.c = 0;
                    }
                    uheVar = new uhe(obj2, 15);
                    if (true == optionalEmpty.isPresent()) {
                        Object obj3 = optionalEmpty.get();
                        Object obj4 = uheVar.a;
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        uom uomVar = (uom) obj3;
                        uoj uojVar = uomVar.d;
                        upg upgVar3 = (upg) obj4;
                        upgVar3.j = new upd(atomicBoolean, ahng.n(uojVar));
                        uoi uoiVar = uomVar.a;
                        upd updVar = upgVar3.j;
                        updVar.getClass();
                        upgVar3.o(uoiVar, uojVar, updVar, Optional.of(uomVar.b), false);
                    }
                } else {
                    uonVar2.c++;
                }
                optionalEmpty = Optional.of((uom) ((ArrayList) ((aami) uonVar2.a.get(uonVar2.b)).b).get(uonVar2.c));
                uheVar = new uhe(obj2, 15);
                if (true == optionalEmpty.isPresent()) {
                    Object obj5 = optionalEmpty.get();
                    Object obj6 = uheVar.a;
                    AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                    uom uomVar2 = (uom) obj5;
                    uoj uojVar2 = uomVar2.d;
                    upg upgVar4 = (upg) obj6;
                    upgVar4.j = new upd(atomicBoolean2, ahng.n(uojVar2));
                    uoi uoiVar2 = uomVar2.a;
                    upd updVar2 = upgVar4.j;
                    updVar2.getClass();
                    upgVar4.o(uoiVar2, uojVar2, updVar2, Optional.of(uomVar2.b), false);
                }
                break;
            case 9:
                ((upg) this.a).j();
                break;
            case 10:
                upg upgVar5 = (upg) this.a;
                upv upvVar = upgVar5.b;
                if ((upvVar.b & SemanticState.Focused) != 0) {
                    upu upuVar = upvVar.j;
                    if (upuVar == null) {
                        upuVar = upu.a;
                    }
                    if ((upuVar.b & 2) != 0) {
                        upgVar5.l(upuVar.d);
                    }
                    uom uomVarA = upgVar5.d.a();
                    uoi uoiVar3 = uomVarA != null ? uomVarA.a : upgVar5.n;
                    if (uoiVar3 != null) {
                        upgVar5.i(uoiVar3, true);
                    }
                }
                break;
            case 11:
                ((upo) this.a).a();
                break;
            case 12:
                ((upo) this.a).m(Optional.empty());
                break;
            case 13:
                vhc vhcVar = new vhc();
                uvx uvxVar = (uvx) this.a;
                vhcVar.I = uvxVar.e;
                Optional.of(vhcVar);
                av avVar = new av(uvxVar.b.getChildFragmentManager());
                avVar.g(0, vhcVar, "multi_page_sticker_catalog", 1);
                avVar.e();
                break;
            case 14:
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihhVar.e(apwz.b, apwz.a);
                ((xte) this.a).b.a((ajwo) aihhVar.build());
                break;
            case 15:
                LocationSearchView locationSearchView = (LocationSearchView) this.a;
                locationSearchView.a(true);
                vce vceVar = locationSearchView.e;
                if (vceVar != null) {
                    ((vgw) vceVar.c).k.setVisibility(8);
                }
                break;
            case 16:
                ((LocationSearchView) this.a).a.setText("");
                break;
            case 17:
                roq roqVar = ((vda) this.a).n;
                if (roqVar != null) {
                    roqVar.k(xhb.b(127081)).d();
                }
                break;
            case 18:
                vea veaVar = (vea) this.a;
                String str = veaVar.i.e;
                Uri uri = veaVar.h;
                uri.getClass();
                veaVar.m.h(str, uri);
                break;
            case 19:
                ((vgn) this.a).k(false, null);
                break;
            default:
                ((vgu) this.a).c.setText("");
                break;
        }
    }

    public uit(upg upgVar, int i, short[] sArr) {
        this.$cid = i;
        this.a = upgVar;
    }
}
