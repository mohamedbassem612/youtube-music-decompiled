package defpackage;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.account.image.CropActivity;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rnf extends rna {
    private static final ExtensionRegistryLite v;
    private boolean A;
    private boolean B;
    public rng b;
    public ScheduledExecutorService c;
    public Executor d;
    public woz e;
    public vxe f;
    public ttm g;
    public SharedPreferences h;
    public zwb i;
    public tqj j;
    public wbz k;
    public rg l;
    public Uri m;
    public Uri n;
    public String o;
    public String p;
    public rmy q;
    public vxz r;
    public vxz s;
    public ijt t;
    private rc w;
    private aldv x;
    private arar y;
    private boolean z;
    private static final Intent u = new Intent();
    public static final String a = wfs.g(ajpx.b.a(), "channel_creation_form_status");

    static {
        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
        extensionRegistryLite.b(arar.b);
        extensionRegistryLite.b(akpe.b);
        extensionRegistryLite.b(akpf.b);
        v = extensionRegistryLite;
    }

    private final wek k() {
        return this.k.e(this.i.e());
    }

    private static File l(Context context, boolean z) throws rne {
        try {
            File file = new File(context.getCacheDir(), "photos");
            if (!file.exists()) {
                file.mkdir();
            }
            return File.createTempFile("image", z ? ".png" : ".jpeg", file);
        } catch (IOException e) {
            throw new rne("Failed to create temp image file.", e);
        }
    }

    private final void m() {
        alay alayVar;
        aldv aldvVar = this.x;
        if ((aldvVar.c & 4) == 0) {
            this.n = this.m;
            o();
            return;
        }
        try {
            aldu alduVar = aldvVar.f;
            if (alduVar == null) {
                alduVar = aldu.a;
            }
            Intent intent = new Intent(getActivity(), (Class<?>) CropActivity.class);
            intent.setData(this.m);
            boolean z = this.x.i && rnh.a(getContext().getContentResolver(), this.m).equals("image/png");
            Uri uriFromFile = Uri.fromFile(l(getContext(), z));
            this.n = uriFromFile;
            intent.putExtra("output", uriFromFile);
            if ((alduVar.b & SemanticState.Focused) != 0) {
                alay alayVar2 = alduVar.j;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
                intent.putExtra("cropLabel", vxl.a(null, alayVar2, this.q.a, false));
            }
            intent.putExtra("widthRatio", alduVar.c);
            intent.putExtra("heightRatio", alduVar.d);
            int i = alduVar.e;
            if (i > 0) {
                intent.putExtra("minWidth", i);
            }
            int i2 = alduVar.f;
            if (i2 > 0) {
                intent.putExtra("minHeight", i2);
            }
            int i3 = alduVar.h;
            if (i3 > 0) {
                intent.putExtra("minOutputWidth", i3);
            }
            int i4 = alduVar.i;
            if (i4 > 0) {
                intent.putExtra("minOutputHeight", i4);
            }
            if ((alduVar.b & SemanticState.ReadOnly) != 0) {
                alay alayVar3 = alduVar.m;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                intent.putExtra("visualCropLabel", vxl.a(null, alayVar3, this.q.a, false));
            }
            int i5 = alduVar.k;
            if (i5 > 0) {
                intent.putExtra("visualWidthRatio", i5);
            }
            int i6 = alduVar.l;
            if (i6 > 0) {
                intent.putExtra("visualHeightRatio", i6);
            }
            if ((alduVar.b & SemanticState.Obscured) != 0) {
                alay alayVar4 = alduVar.o;
                if (alayVar4 == null) {
                    alayVar4 = alay.a;
                }
                intent.putExtra("visualDoubleCropLabel", vxl.a(null, alayVar4, this.q.a, false));
            }
            int i7 = alduVar.n;
            if (i7 > 0) {
                intent.putExtra("visualDoubleWidthRatio", i7);
            }
            intent.putExtra("compressFormat", z);
            aldv aldvVar2 = this.x;
            if ((aldvVar2.c & 8) != 0) {
                alayVar = aldvVar2.g;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            intent.putExtra("cropInfo", vxl.a(null, alayVar, this.q.a, true));
            startActivityForResult(intent, 2);
        } catch (rne e) {
            g(getResources().getString(R.string.image_upload_something_went_wrong), e);
        }
    }

    private final void n() {
        this.q.d();
    }

    private final void o() {
        if (this.n == null) {
            g(getResources().getString(R.string.image_upload_something_went_wrong), new rne());
            return;
        }
        ajng ajngVar = this.x.e;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        ajnf ajnfVar = ajngVar.c;
        if (ajnfVar == null) {
            ajnfVar = ajnf.a;
        }
        if ((ajnfVar.b & SemanticState.Multiline) == 0) {
            g(getResources().getString(R.string.image_upload_something_went_wrong), new rne("No endpoint to route after cropping an image."));
            return;
        }
        vxe vxeVar = this.f;
        ajwo ajwoVar = ajnfVar.s;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        try {
            ajwoVar = (ajwo) aihn.parseFrom(ajwo.a, ajwoVar.toByteArray(), v);
        } catch (aiik e) {
            g(getResources().getString(R.string.image_upload_something_went_wrong), new rne("Invalid protocol buffer.", e));
        }
        vxeVar.a(ajwoVar);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    private final void p(boolean z) {
        Intent intent;
        Intent intent2;
        arar ararVar = this.y;
        if (ararVar != null) {
            i(ararVar);
            return;
        }
        if (this.z) {
            if (this.A) {
                o();
                return;
            } else {
                if (z) {
                    return;
                }
                m();
                return;
            }
        }
        if (z) {
            return;
        }
        int iBc = a.bc(this.x.d);
        int i = 1;
        if (iBc == 0) {
            iBc = 1;
        }
        int i2 = iBc - 1;
        if (i2 == 1) {
            try {
                ArrayList arrayList = new ArrayList();
                String str = new String[]{"android.permission.CAMERA"}[0];
                if (avg.c(getActivity(), str) == -1) {
                    arrayList.add(str);
                }
                if (arrayList.isEmpty()) {
                    intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    Uri uriA = avh.a(getContext(), String.valueOf(getContext().getPackageName()).concat(".fileprovider"), l(getContext(), false));
                    this.m = uriA;
                    intent.putExtra("output", uriA);
                    intent.setClipData(ClipData.newUri(getContext().getContentResolver(), "images", this.m));
                    intent.setFlags(3);
                } else {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    Set<String> stringSet = this.h.getStringSet("permissions_requested", null);
                    if (stringSet != null && !stringSet.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (stringSet.contains(str2) && !shouldShowRequestPermissionRationale(str2)) {
                                arrayList2.add(str2);
                                it.remove();
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        HashSet hashSet = new HashSet(arrayList);
                        if (stringSet != null) {
                            hashSet.addAll(stringSet);
                        }
                        this.h.edit().putStringSet("permissions_requested", hashSet).commit();
                        requestPermissions((String[]) arrayList.toArray(new String[0]), 3);
                    } else if (!arrayList2.isEmpty()) {
                        ahno.F(!arrayList2.isEmpty());
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("permissions", arrayList2);
                        rnm rnmVar = new rnm();
                        rnmVar.setArguments(bundle);
                        dd childFragmentManager = getChildFragmentManager();
                        childFragmentManager.getClass();
                        av avVar = new av(childFragmentManager);
                        avVar.g(0, rnmVar, "photo_upload_permission_fragment", 1);
                        avVar.e();
                    }
                    intent = u;
                }
                intent2 = intent;
            } catch (rne e) {
                g(getResources().getString(R.string.image_upload_something_went_wrong), e);
                return;
            }
        } else {
            if (i2 == 2) {
                rc rcVar = this.w;
                if (rcVar != null) {
                    om.d();
                    rcVar.b(om.e(rl.a), null);
                    return;
                }
                return;
            }
            if (i2 != 4) {
                g(getResources().getString(R.string.image_upload_something_went_wrong), new rne("Unknown get image action."));
                return;
            }
            try {
                zwa zwaVarE = this.i.e();
                if (!(zwaVarE instanceof rlt)) {
                    throw new rne("Failed to get Account Identity information");
                }
                this.n = Uri.fromFile(l(getContext(), false));
                String str3 = ((rlt) zwaVarE).b;
                ijt ijtVar = this.t;
                Context context = getContext();
                Parcelable parcelable = this.n;
                intent2 = new Intent();
                intent2.setClassName(context, "com.google.android.libraries.user.profile.photopicker.picker.intentonly.PhotoPickerIntentActivity");
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.google.profile.photopicker.ACCOUNT", str3);
                ahng.aG(bundle2, "com.google.profile.photopicker.HOST_INFO", ijtVar.a);
                intent2.putExtras(bundle2);
                intent2.putExtra("output", parcelable);
                if (zwaVarE.e()) {
                    intent2.putExtra("skip_google_photos", true);
                }
                tqj tqjVar = this.j;
                int i3 = tqr.a;
                if (tqjVar.a(1073873790) != 0) {
                    intent2.putExtra("com.google.profile.photopicker.SET_PHENOTYPE_CONTEXT", true);
                }
                i = 4;
            } catch (rne e2) {
                g(getResources().getString(R.string.image_upload_something_went_wrong), e2);
                return;
            }
        }
        if (intent2 != u) {
            startActivityForResult(intent2, i);
        }
    }

    private final void q(aonc aoncVar, String str, Uri uri) {
        wek wekVarK = k();
        String str2 = a;
        ajpu ajpuVarF = ajpw.f(str2);
        ajpuVarF.ao(aoncVar);
        aikh aikhVar = aikh.a;
        aikg aikgVar = new aikg();
        aikgVar.c(4);
        int i = 5;
        if (str != null && uri != null) {
            ajpuVarF.am(str);
            ajpuVarF.an(uri.toString());
            aikgVar.d(6, 5);
        }
        aihf aihfVarCreateBuilder = akvd.a.createBuilder();
        affc affcVarA = aikgVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        akvd akvdVar = (akvd) aihfVarCreateBuilder.instance;
        affcVarA.getClass();
        akvdVar.d = affcVarA;
        akvdVar.b |= 2;
        wekVarK.g(str2).c(new mkc((Object) wekVarK, aihfVarCreateBuilder.build(), (Object) ajpuVarF.ap().c(), i)).D();
    }

    private final void r(Optional optional) {
        arar ararVar = this.y;
        if (ararVar == null || (ararVar.c & SemanticState.Focused) == 0) {
            return;
        }
        wek wekVarK = k();
        String str = this.y.j;
        aihf aihfVarCreateBuilder = akvd.a.createBuilder();
        aikh aikhVar = aikh.a;
        aikg aikgVar = new aikg();
        aikgVar.d(6, 7);
        affc affcVarA = aikgVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        akvd akvdVar = (akvd) aihfVarCreateBuilder.instance;
        affcVarA.getClass();
        akvdVar.d = affcVarA;
        akvdVar.b |= 2;
        akvd akvdVar2 = (akvd) aihfVarCreateBuilder.build();
        akic akicVarE = akie.e(str);
        String str2 = this.p;
        if (str2 != null) {
            aihf aihfVar = akicVarE.a;
            aihfVar.copyOnWrite();
            akif akifVar = (akif) aihfVar.instance;
            akif akifVar2 = akif.a;
            akifVar.b |= 32;
            akifVar.h = str2;
        }
        rbj rbjVar = new rbj(akicVarE, 14);
        optional.isPresent();
        Object obj = optional.get();
        aihf aihfVar2 = ((akic) rbjVar.a).a;
        aihfVar2.copyOnWrite();
        akif akifVar3 = (akif) aihfVar2.instance;
        akif akifVar4 = akif.a;
        akifVar3.i = ((aonc) obj).d;
        akifVar3.b |= 64;
        byte[] bArrC = akicVarE.am().c();
        wer werVarE = wekVarK.e();
        werVarE.k(str, akvdVar2, bArrC);
        werVarE.b().D();
    }

    public final void c() {
        if (this.m == null) {
            g(getResources().getString(R.string.image_upload_something_went_wrong), new rne("Failed to get image uri"));
            return;
        }
        if (this.r.l(33, 45478472L, false) && getContext() != null) {
            if (rnh.a.contains(rnh.a(getContext().getContentResolver(), this.m))) {
                try {
                    ContentResolver contentResolver = getContext().getContentResolver();
                    Uri uri = this.m;
                    File file = new File(getContext().getCacheDir(), "photos");
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    File fileCreateTempFile = File.createTempFile("temp", ".png", file);
                    adhx.b(contentResolver, uri, 0, 0).compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(fileCreateTempFile.getAbsolutePath()));
                    this.m = Uri.fromFile(fileCreateTempFile);
                } catch (IOException e) {
                    g(getResources().getString(R.string.image_upload_something_went_wrong), new rne("Failed to convert image to png format", e));
                }
            }
        }
        this.z = true;
        m();
    }

    public final void d(Exception exc) {
        if (exc instanceof zwo) {
            n();
            return;
        }
        if (exc instanceof zwp) {
            g(getResources().getString(R.string.reauth_failure_error_message), new rne(exc));
            return;
        }
        arar ararVar = this.y;
        String string = null;
        if (ararVar != null && (ararVar.c & 64) != 0) {
            alay alayVar = ararVar.i;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            string = ackj.k(null, alayVar, null, false).toString();
        }
        g(string, new rne(exc));
    }

    public final void e() {
        rni rniVar;
        try {
            dd childFragmentManager = getChildFragmentManager();
            if (!tuk.s(childFragmentManager) || (rniVar = (rni) childFragmentManager.g("LoadingOverlayFragment")) == null || getActivity() == null) {
                return;
            }
            rniVar.dismiss();
        } catch (IllegalStateException unused) {
        }
    }

    public final void f() {
        arar ararVar = this.y;
        String string = null;
        if (ararVar == null) {
            g(null, new rne("UploadPhotoEndpoint became null"));
            return;
        }
        ttm ttmVar = this.g;
        if ((ararVar.c & 32) != 0) {
            alay alayVar = ararVar.h;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            string = ackj.k(null, alayVar, null, false).toString();
        }
        ttmVar.d(string);
        rmy rmyVar = this.q;
        String str = this.p;
        Uri uri = this.n;
        rmyVar.b();
        Iterator it = rmyVar.b.iterator();
        while (it.hasNext()) {
            ((rnd) it.next()).n(2, str, uri);
        }
    }

    public final void g(String str, rne rneVar) {
        if (str != null) {
            this.g.d(str);
        }
        if (this.B) {
            q(aonc.PHOTO_UPLOAD_STATUS_FAILED, null, null);
        }
        arar ararVar = this.y;
        if (ararVar == null || (ararVar.c & SemanticState.Focused) == 0 || !this.r.l(24, 45421369L, false)) {
            this.q.e(rneVar);
        } else {
            r(Optional.of(aonc.PHOTO_UPLOAD_STATUS_FAILED));
        }
    }

    public final void h() {
        arar ararVar = this.y;
        if (ararVar == null) {
            g(null, new rne("UploadPhotoEndpoint became null"));
            return;
        }
        int i = ararVar.d;
        if (i == 3) {
            this.f.a(i == 3 ? (ajwo) ararVar.e : ajwo.a);
            return;
        }
        int i2 = ararVar.d;
        if (i2 == 2) {
            this.f.a(i2 == 2 ? (ajwo) ararVar.e : ajwo.a);
            return;
        }
        if ((ararVar.c & SemanticState.Focused) != 0 && this.r.l(24, 45421369L, false)) {
            r(Optional.of(aonc.PHOTO_UPLOAD_STATUS_UNSPECIFIED));
            return;
        }
        if (this.B) {
            q(aonc.PHOTO_UPLOAD_STATUS_UNSPECIFIED, this.p, this.n);
        }
        f();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    final void i(arar ararVar) {
        boolean z;
        int i;
        ararVar.getClass();
        this.y = ararVar;
        if (!this.s.m(86, 45849269L) || !ararVar.f.endsWith("profile") || (i = ararVar.d) == 3 || i == 2) {
            z = false;
        } else {
            int i2 = ararVar.c;
            if ((i2 & SemanticState.Focused) == 0 && (i2 & SemanticState.Hidden) == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        this.B = z;
        if (this.r.l(24, 45421369L, false)) {
            r(Optional.of(aonc.PHOTO_UPLOAD_STATUS_UPLOADING));
        }
        String string = null;
        if (this.B) {
            q(aonc.PHOTO_UPLOAD_STATUS_UPLOADING, null, null);
        }
        if (this.p != null) {
            h();
            return;
        }
        int i3 = ararVar.c;
        if ((i3 & 4) != 0) {
            String str = ararVar.f;
            this.o = (i3 & 8) != 0 ? ararVar.g : "";
            this.c.execute(new rmx(this, str, ararVar, 3));
        } else {
            if ((i3 & 64) != 0) {
                alay alayVar = ararVar.i;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                string = ackj.k(null, alayVar, null, false).toString();
            }
            g(string, new rne("UploadUrl or ExternalChannelId was not set."));
        }
    }

    public final void j(int i) {
        if (this.e == null) {
            zvp.a(zvn.b, zvm.z, "Injecting channelPageEditService failed or channelPageEditService became null.");
            return;
        }
        try {
            dd childFragmentManager = getChildFragmentManager();
            if (tuk.s(childFragmentManager) && childFragmentManager.g("LoadingOverlayFragment") == null && getActivity() != null) {
                rni rniVar = new rni();
                auom.f(rniVar);
                rniVar.h(childFragmentManager, "LoadingOverlayFragment");
            }
        } catch (IllegalStateException unused) {
        }
        woz wozVar = this.e;
        String str = this.o;
        String str2 = this.p;
        wou wouVar = new wou(wozVar.b, wozVar.c);
        ((wov) wouVar).c = str;
        wouVar.a = str2;
        wouVar.b = i;
        woz wozVar2 = this.e;
        if (wozVar2.f == null) {
            wozVar2.f = new wow(wozVar2.d, wozVar2.e());
        }
        taf.i(afxd.f(wozVar2.f.b(wouVar, MoreExecutors.directExecutor(), null)).c(toe.class, new row(wozVar2, wouVar, 13), MoreExecutors.directExecutor()), this.d, new ijj(this, 19), new ixb(this, 2), null);
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        try {
            byte[] byteArray = getArguments().getByteArray("arg_get_photo_endpoint");
            ExtensionRegistryLite extensionRegistryLite = v;
            this.x = (aldv) aihn.parseFrom(aldv.a, byteArray, extensionRegistryLite);
            boolean z = bundle == null;
            if (bundle != null) {
                this.m = (Uri) bundle.getParcelable("arg_image_uri");
                this.n = (Uri) bundle.getParcelable("arg_crop_uri");
                this.o = bundle.getString("arg_external_channel_id");
                this.p = bundle.getString("arg_encrypted_blob_id");
                this.z = bundle.getBoolean("arg_get_image_finished", this.z);
                this.A = bundle.getBoolean("arg_crop_image_finished", this.A);
                if (bundle.containsKey("arg_upload_photo_endpoint")) {
                    try {
                        this.y = (arar) aihn.parseFrom(arar.a, bundle.getByteArray("arg_upload_photo_endpoint"), extensionRegistryLite);
                    } catch (aiik e) {
                        throw new IllegalStateException(e);
                    }
                } else {
                    zvp.a(zvn.a, zvm.z, "ImageUploadFragment resurrected without uploadPhotoEndpoint");
                }
            }
            p(!z);
        } catch (aiik e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // defpackage.cc
    public final void onActivityResult(int i, int i2, Intent intent) {
        String string;
        if (i2 != -1) {
            if (i2 == 0) {
                n();
                return;
            }
            if (i != 2 || i2 != 2) {
                g(getResources().getString(R.string.image_upload_something_went_wrong), new rne("Unknown activity result code"));
                return;
            }
            aldu alduVar = this.x.f;
            if (alduVar == null) {
                alduVar = aldu.a;
            }
            int i3 = alduVar.e;
            aldu alduVar2 = this.x.f;
            int i4 = (alduVar2 == null ? aldu.a : alduVar2).f;
            if (alduVar2 == null) {
                alduVar2 = aldu.a;
            }
            if (alduVar2.g.isEmpty()) {
                string = getResources().getString(R.string.crop_image_too_small, Integer.valueOf(i3), Integer.valueOf(i4));
            } else {
                aldu alduVar3 = this.x.f;
                if (alduVar3 == null) {
                    alduVar3 = aldu.a;
                }
                string = alduVar3.g;
            }
            g(string, new rne("Selected image is too small. Must be at least " + i3 + 'x' + i4));
            return;
        }
        if (i == 1) {
            if (intent == null) {
                g(getResources().getString(R.string.image_upload_something_went_wrong), new rne("Intent data is null"));
                return;
            }
            Uri data = this.m;
            if (data == null) {
                data = intent.getData();
            }
            this.m = data;
            c();
            return;
        }
        if (i != 2 && i != 4) {
            g(getResources().getString(R.string.image_upload_something_went_wrong), new rne("Unknown activity request code"));
            return;
        }
        if (this.r.l(24, 45421369L, false) && (this.x.c & 16) != 0) {
            try {
                ablj abljVarC = ablj.c(getContext().getContentResolver(), this.n);
                Pair pairD = adhx.d(getContext().getContentResolver(), this.n);
                wek wekVarK = k();
                akic akicVarE = akie.e(this.x.h);
                long jIntValue = ((Integer) pairD.first).intValue();
                Long lValueOf = Long.valueOf(jIntValue);
                aihf aihfVar = akicVarE.a;
                lValueOf.getClass();
                aihfVar.copyOnWrite();
                akif akifVar = (akif) aihfVar.instance;
                akif akifVar2 = akif.a;
                akifVar.b |= 4;
                akifVar.e = jIntValue;
                long jIntValue2 = ((Integer) pairD.second).intValue();
                Long.valueOf(jIntValue2).getClass();
                aihfVar.copyOnWrite();
                akif akifVar3 = (akif) aihfVar.instance;
                akifVar3.b |= 8;
                akifVar3.f = jIntValue2;
                long j = abljVarC.a;
                Long.valueOf(j).getClass();
                aihfVar.copyOnWrite();
                akif akifVar4 = (akif) aihfVar.instance;
                akifVar4.b |= 2;
                akifVar4.d = j;
                String string2 = this.n.toString();
                aihfVar.copyOnWrite();
                akif akifVar5 = (akif) aihfVar.instance;
                string2.getClass();
                akifVar5.b |= 16;
                akifVar5.g = string2;
                akie akieVarAm = akicVarE.am();
                wer werVarE = wekVarK.e();
                werVarE.e(akieVarAm);
                werVarE.b().D();
            } catch (IOException e) {
                d(e);
            }
        }
        this.A = true;
        o();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.w = registerForActivityResult(new rp(), this.l, new eon(this, 6));
    }

    @Override // defpackage.cc
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 3) {
            g(getResources().getString(R.string.image_upload_something_went_wrong), new rne("Request code does not match REQUEST_CODE_GET_PERMISSION."));
            return;
        }
        for (int i2 : iArr) {
            if (i2 == -1) {
                n();
                return;
            }
        }
        p(false);
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        Uri uri = this.m;
        if (uri != null) {
            bundle.putParcelable("arg_image_uri", uri);
        }
        Uri uri2 = this.n;
        if (uri2 != null) {
            bundle.putParcelable("arg_crop_uri", uri2);
        }
        String str = this.o;
        if (str != null) {
            bundle.putString("arg_external_channel_id", str);
        }
        String str2 = this.p;
        if (str2 != null) {
            bundle.putString("arg_encrypted_blob_id", str2);
        }
        if (this.z) {
            bundle.putBoolean("arg_get_image_finished", true);
        }
        if (this.A) {
            bundle.putBoolean("arg_crop_image_finished", true);
        }
        arar ararVar = this.y;
        if (ararVar != null) {
            bundle.putByteArray("arg_upload_photo_endpoint", ararVar.toByteArray());
        }
    }
}
