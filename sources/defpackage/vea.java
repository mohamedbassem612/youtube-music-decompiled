package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vea implements uqe, unz {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer");
    private static final Intent n = new Intent();
    public final cf b;
    public final vdy c;
    public final und d;
    public final xgn e;
    public rc f;
    public rc g;
    public Uri h;
    public final aras i;
    public final awmd j;
    public int k;
    public boolean l;
    public final xte m;
    private final ByteStore o;
    private final affd p;
    private final wsl q;
    private final awmd r;
    private final rc s;
    private final abfv t;

    public vea(cf cfVar, ByteStore byteStore, vdy vdyVar, affd affdVar, und undVar, xte xteVar, xgn xgnVar, abfv abfvVar, wsl wslVar, aras arasVar, awmd awmdVar, awmd awmdVar2, rg rgVar) {
        this.b = cfVar;
        this.o = byteStore;
        this.c = vdyVar;
        this.p = affdVar;
        this.d = undVar;
        this.m = xteVar;
        this.e = xgnVar;
        this.t = abfvVar;
        this.q = wslVar;
        this.i = arasVar;
        this.j = awmdVar;
        this.r = awmdVar2;
        this.s = vdyVar.registerForActivityResult(new rp(), rgVar, new eon(this, 7));
    }

    public static vdy d(affd affdVar, aras arasVar) {
        vdy vdyVar = new vdy();
        auom.f(vdyVar);
        afpu.e(vdyVar, affdVar);
        afpl.b(vdyVar, arasVar);
        afpu.e(vdyVar, affdVar);
        return vdyVar;
    }

    private final cc j(String str) {
        return this.c.getChildFragmentManager().g(str);
    }

    private final void k(cc ccVar, String str) {
        av avVar = new av(this.c.getChildFragmentManager());
        avVar.q(R.id.custom_thumbnail_creation_container, ccVar, str);
        avVar.e();
    }

    private final void l(Context context, String[] strArr, Runnable runnable, int i, int i2) {
        if (j("fragment_tag_gallery_missing_permissions") == null) {
            String string = context.getResources().getString(i);
            String string2 = context.getResources().getString(i2);
            boolean z = false;
            if (strArr != null && strArr.length > 0) {
                z = true;
            }
            ahno.F(z);
            string.getClass();
            string2.getClass();
            aebv aebvVar = new aebv();
            Bundle bundle = new Bundle();
            bundle.putStringArray("missing_permissions", strArr);
            bundle.putCharSequence("allow_access_description", string);
            bundle.putCharSequence("open_settings_description", string2);
            aebvVar.setArguments(bundle);
            aebvVar.d = new qcb(runnable);
            k(aebvVar, "fragment_tag_gallery_missing_permissions");
        }
    }

    @Override // defpackage.uqe
    public final void a(String str) {
        aras arasVar = this.i;
        if (!arasVar.h) {
            try {
                aihf aihfVarCreateBuilder = aovs.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aovs aovsVar = (aovs) aihfVarCreateBuilder.instance;
                str.getClass();
                aovsVar.c = 2;
                aovsVar.d = str;
                String str2 = arasVar.g;
                aihfVarCreateBuilder.copyOnWrite();
                aovs aovsVar2 = (aovs) aihfVarCreateBuilder.instance;
                str2.getClass();
                aovsVar2.b |= 2;
                aovsVar2.f = str2;
                Uri uri = this.h;
                uri.getClass();
                String string = uri.toString();
                aihfVarCreateBuilder.copyOnWrite();
                aovs aovsVar3 = (aovs) aihfVarCreateBuilder.instance;
                string.getClass();
                aovsVar3.b |= 4;
                aovsVar3.g = string;
                this.o.set(arasVar.f, ((aovs) aihfVarCreateBuilder.build()).toByteArray());
            } catch (RuntimeException e) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer", "saveThumbnailToEntityStore", (char) 568, "CustomThumbnailCreationFragmentPeer.java")).t("CustomThumbnailCreationFragmentPeer: Failed to update ByteStore with uploaded blobID");
            }
            f();
            return;
        }
        wsl wslVar = this.q;
        wsi wsiVarA = wslVar.a();
        aihf aihfVarCreateBuilder2 = aotx.a.createBuilder();
        aihf aihfVarCreateBuilder3 = aoty.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        aoty aotyVar = (aoty) aihfVarCreateBuilder3.instance;
        aotyVar.c = 1;
        aotyVar.b |= 1;
        aras arasVar2 = this.i;
        String str3 = arasVar2.g;
        aihfVarCreateBuilder3.copyOnWrite();
        aoty aotyVar2 = (aoty) aihfVarCreateBuilder3.instance;
        str3.getClass();
        aotyVar2.b |= 2;
        aotyVar2.d = str3;
        aoty aotyVar3 = (aoty) aihfVarCreateBuilder3.build();
        aihfVarCreateBuilder2.copyOnWrite();
        aotx aotxVar = (aotx) aihfVarCreateBuilder2.instance;
        aotyVar3.getClass();
        aotxVar.e = aotyVar3;
        aotxVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        aotx aotxVar2 = (aotx) aihfVarCreateBuilder2.instance;
        str.getClass();
        aotxVar2.c = 4;
        aotxVar2.d = str;
        aotx aotxVar3 = (aotx) aihfVarCreateBuilder2.build();
        wsiVarA.a = arasVar2.i;
        aihf aihfVarCreateBuilder4 = aote.a.createBuilder();
        aotd aotdVar = aotd.ACTION_SET_CUSTOM_THUMBNAIL;
        aihfVarCreateBuilder4.copyOnWrite();
        aote aoteVar = (aote) aihfVarCreateBuilder4.instance;
        aoteVar.d = aotdVar.an;
        aoteVar.b |= 1;
        aihfVarCreateBuilder4.copyOnWrite();
        aote aoteVar2 = (aote) aihfVarCreateBuilder4.instance;
        aotxVar3.getClass();
        aoteVar2.o = aotxVar3;
        aoteVar2.c |= 64;
        aote aoteVar3 = (aote) aihfVarCreateBuilder4.build();
        ArrayList arrayList = new ArrayList();
        arrayList.add(aoteVar3);
        wsiVarA.e(arrayList);
        wsiVarA.m();
        taf.k(this.c.getViewLifecycleOwner(), wslVar.b(wsiVarA, MoreExecutors.directExecutor()), new uny(this, 10), new uny(this, 11));
    }

    @Override // defpackage.uqe
    public final void b() {
        this.l = false;
        g(false);
        h();
    }

    public final void e() {
        Intent intent;
        rc rcVar;
        byte[] bArr = null;
        if (((vxz) this.j.io()).l(33, 45770161L, false)) {
            cf cfVar = this.b;
            Rect rectA = dxa.a().a(cfVar).a();
            if (rectA.width() > rectA.height()) {
                acwr acwrVarF = this.t.f(cfVar);
                acwrVarF.i(R.string.playlist_portrait_mode_required_title);
                acwrVarF.d(R.string.playlist_portrait_mode_required_message);
                acwrVarF.setPositiveButton(R.string.playlist_got_it_button, new dkh(this, 15, bArr));
                acwrVarF.g(new gxt(this, 11));
                acwrVarF.j();
                return;
            }
        }
        int iAV = a.aV(this.i.c);
        if (iAV == 0) {
            iAV = 1;
        }
        int i = iAV - 1;
        try {
            if (i == 1) {
                cf cfVar2 = this.b;
                String[] strArrC = aebv.c(cfVar2, aebx.d(cfVar2, 1));
                if (strArrC.length != 0) {
                    if (((vxz) this.r.io()).l(215, 45748446L, false)) {
                        l(cfVar2, strArrC, new ull(this, 16), R.string.camera_permission_allow_access_description, R.string.camera_permission_open_settings_description);
                    } else {
                        l(cfVar2, strArrC, new ull(this, 16), R.string.image_gallery_permission_allow_access_description, R.string.image_gallery_permission_open_settings_description);
                    }
                    intent = n;
                } else {
                    Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                    String strConcat = String.valueOf(cfVar2.getPackageName()).concat(".fileprovider");
                    File file = new File(cfVar2.getCacheDir(), "photos");
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    File fileCreateTempFile = File.createTempFile("image", ".jpeg", file);
                    fileCreateTempFile.deleteOnExit();
                    Uri uriA = avh.a(cfVar2, strConcat, fileCreateTempFile);
                    this.h = uriA;
                    intent2.putExtra("output", uriA);
                    intent2.setFlags(3);
                    intent = intent2;
                }
                rcVar = this.g;
            } else if (i == 2) {
                rc rcVar2 = this.s;
                if (rcVar2 != null) {
                    om.d();
                    rcVar2.b(om.e(rl.a), null);
                    return;
                } else {
                    intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("image/*");
                    intent.addCategory("android.intent.category.OPENABLE");
                    rcVar = this.f;
                }
            } else if (i != 3) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer", "checkPermissionsAndGetImage", SemanticState.Hidden, "CustomThumbnailCreationFragmentPeer.java")).t("CustomThumbnailCreationFragmentPeer: invalid image source: UNSPECIFIED");
                return;
            } else {
                rcVar = null;
                intent = null;
            }
            intent.getClass();
            if (intent != n) {
                rcVar.getClass();
                rcVar.b(intent, null);
            }
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer", "checkPermissionsAndGetImage", (char) 262, "CustomThumbnailCreationFragmentPeer.java")).t("CustomThumbnailCreationFragmentPeer: Failed to create intent to get image");
        }
    }

    public final void f() {
        boolean zL = ((vxz) this.j.io()).l(16, 45680787L, false);
        cf cfVar = this.b;
        if (!zL) {
            cfVar.finish();
            return;
        }
        dd supportFragmentManager = cfVar.getSupportFragmentManager();
        cc ccVarG = supportFragmentManager.g("custom_thumbnail_creation_fragment");
        if (ccVarG != null) {
            av avVar = new av(supportFragmentManager);
            avVar.l(ccVarG);
            avVar.e();
        }
    }

    public final void g(boolean z) {
        View view = this.c.getView();
        tuk.l(view == null ? null : view.findViewById(R.id.progress_bar_container), z);
    }

    public final void h() {
        vdy vdyVar = this.c;
        View viewFindViewById = vdyVar.requireView().findViewById(R.id.custom_thumbnail_creation_container);
        int i = afcv.a;
        afcv afcvVarP = afcv.p(viewFindViewById, viewFindViewById.getResources().getText(R.string.playlist_cover_upload_failure_dialog_title), -1);
        afcvVarP.o().setTextColor(tzk.i(vdyVar.getContext(), R.attr.ytTextPrimary));
        afcvVarP.n().setTextColor(tzk.i(vdyVar.getContext(), R.attr.ytThemedBlue));
        afcvVarP.q(afcvVarP.j.getText(R.string.playlist_cover_upload_failure_dialog_button_retry), new uit(this, 18));
        afcq afcqVar = afcvVarP.k;
        afcqVar.setBackground(vdyVar.getContext().getDrawable(R.drawable.custom_thumbnail_snackbar_background));
        ((TextView) afcqVar.findViewById(R.id.snackbar_action)).setAllCaps(false);
        afcvVarP.h();
    }

    public final void i(int i) {
        Uri uri = this.h;
        if (uri == null) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer", "handleGetImageResult", 344, "CustomThumbnailCreationFragmentPeer.java")).t("CustomThumbnailCreationFragmentPeer: Failed to get image Uri");
            return;
        }
        byte[] bArr = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(this.b.getContentResolver().openInputStream(uri), null, options);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            aras arasVar = this.i;
            akiu akiuVar = arasVar.d;
            if (akiuVar == null) {
                akiuVar = akiu.a;
            }
            if (i2 >= akiuVar.d) {
                akiu akiuVar2 = arasVar.d;
                if (akiuVar2 == null) {
                    akiuVar2 = akiu.a;
                }
                if (i3 >= akiuVar2.e) {
                    uns unsVar = (uns) j("fragment_image_editor");
                    if (unsVar != null) {
                        av avVar = new av(this.c.getChildFragmentManager());
                        avVar.l(unsVar);
                        avVar.e();
                    }
                    aihf aihfVarCreateBuilder = upz.a.createBuilder();
                    aihf aihfVarCreateBuilder2 = uqa.a.createBuilder();
                    String string = uri.toString();
                    aihfVarCreateBuilder2.copyOnWrite();
                    uqa uqaVar = (uqa) aihfVarCreateBuilder2.instance;
                    string.getClass();
                    uqaVar.b = string;
                    boolean z = i == 3;
                    aihfVarCreateBuilder2.copyOnWrite();
                    ((uqa) aihfVarCreateBuilder2.instance).d = z;
                    uqa uqaVar2 = (uqa) aihfVarCreateBuilder2.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    upz upzVar = (upz) aihfVarCreateBuilder.instance;
                    uqaVar2.getClass();
                    aiie aiieVar = upzVar.c;
                    if (!aiieVar.c()) {
                        upzVar.c = aihn.mutableCopy(aiieVar);
                    }
                    upzVar.c.add(uqaVar2);
                    aihfVarCreateBuilder.copyOnWrite();
                    ((upz) aihfVarCreateBuilder.instance).d = 0;
                    aihfVarCreateBuilder.copyOnWrite();
                    upz upzVar2 = (upz) aihfVarCreateBuilder.instance;
                    upzVar2.b |= SemanticState.ReadOnly;
                    upzVar2.m = false;
                    aihfVarCreateBuilder.copyOnWrite();
                    upz upzVar3 = (upz) aihfVarCreateBuilder.instance;
                    upzVar3.b |= SemanticState.Hidden;
                    upzVar3.k = true;
                    aihfVarCreateBuilder.copyOnWrite();
                    upz upzVar4 = (upz) aihfVarCreateBuilder.instance;
                    upzVar4.b |= SemanticState.LiveRegion;
                    upzVar4.l = true;
                    ufs ufsVar = ufs.CREATION_FLOW_CUSTOM_PLAYLIST_THUMBNAIL;
                    aihfVarCreateBuilder.copyOnWrite();
                    upz upzVar5 = (upz) aihfVarCreateBuilder.instance;
                    upzVar5.o = ufsVar.getNumber();
                    upzVar5.b |= SemanticState.Multiline;
                    akiu akiuVar3 = this.i.d;
                    if ((akiuVar3 == null ? akiu.a : akiuVar3).c > 0) {
                        float f = (akiuVar3 == null ? akiu.a : akiuVar3).b;
                        if (akiuVar3 == null) {
                            akiuVar3 = akiu.a;
                        }
                        float f2 = f / akiuVar3.c;
                        aihfVarCreateBuilder.copyOnWrite();
                        upz upzVar6 = (upz) aihfVarCreateBuilder.instance;
                        upzVar6.b |= SemanticState.Focused;
                        upzVar6.j = f2;
                    }
                    affd affdVar = this.p;
                    upz upzVar7 = (upz) aihfVarCreateBuilder.build();
                    uns unsVar2 = new uns();
                    auom.f(unsVar2);
                    afpu.e(unsVar2, affdVar);
                    afpl.b(unsVar2, upzVar7);
                    k(unsVar2, "fragment_image_editor");
                    unsVar2.peer().A = this;
                    return;
                }
            }
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer", "isInputImageDimensionValid", (char) 435, "CustomThumbnailCreationFragmentPeer.java")).t("CustomThumbnailCreationFragmentPeer: Failed to verify input image resolution");
        }
        abfv abfvVar = this.t;
        cf cfVar = this.b;
        acwr acwrVarF = abfvVar.f(cfVar);
        acwrVarF.i(R.string.playlist_cover_upload_failure_dialog_title);
        aras arasVar2 = this.i;
        akiu akiuVar4 = arasVar2.d;
        if (akiuVar4 == null) {
            akiuVar4 = akiu.a;
        }
        Integer numValueOf = Integer.valueOf(akiuVar4.d);
        akiu akiuVar5 = arasVar2.d;
        if (akiuVar5 == null) {
            akiuVar5 = akiu.a;
        }
        acwrVarF.e(cfVar.getString(R.string.playlist_cover_upload_failure_dialog_message, new Object[]{numValueOf, Integer.valueOf(akiuVar5.e)}));
        acwrVarF.setPositiveButton(R.string.playlist_cover_upload_failure_dialog_button_retry, new dkh(this, 13, bArr));
        acwrVarF.setNegativeButton(R.string.playlist_cover_upload_failure_dialog_button_close, new dkh(this, 14, bArr));
        acwrVarF.g(new gxt(this, 12));
        acwrVarF.j();
        this.e.l(new xgj(xhb.b(232707)));
    }

    @Override // defpackage.uqe
    public final void c() {
    }
}
