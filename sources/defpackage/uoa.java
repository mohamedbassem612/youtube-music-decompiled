package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.editor.image.mediagen.MediaGenInputView;
import com.google.android.libraries.youtube.creation.mediapicker.greenscreen.GreenScreenMediaPickerView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uoa {
    public unz A;
    public vda B;
    public Uri C;
    public final vxz E;
    public final xsc F;
    public final roq G;
    public final zf H;
    public final qcb I;
    public final qcb J;
    public final uns a;
    public final affd b;
    public final Context c;
    public final Executor d;
    public final und e;
    public final ahey f;
    public final zvl g;
    public final upz h;
    public final unf i;
    public final vfq j;
    public final wbz k;
    public final zwh l;
    public final adxj m;
    public final boolean n;
    public final boolean o;
    public final adhv p;
    final unc q;
    public final Optional r;
    public final aeez s;
    public qr y;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;
    public agkj w = agpn.b;
    public Optional x = Optional.empty();
    public final Map z = new HashMap();
    public int D = -1;

    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.Collection] */
    public uoa(Context context, Executor executor, qcb qcbVar, xsc xscVar, uns unsVar, affd affdVar, und undVar, qcb qcbVar2, ahey aheyVar, zvl zvlVar, roq roqVar, upz upzVar, xsc xscVar2, zf zfVar, unc uncVar, wbz wbzVar, zwh zwhVar, vfq vfqVar, vxz vxzVar, aaok aaokVar, adxj adxjVar, adhv adhvVar, Optional optional, aeez aeezVar) {
        ufs ufsVar;
        this.a = unsVar;
        this.F = xscVar;
        this.J = qcbVar;
        this.c = context;
        this.d = executor;
        this.b = affdVar;
        this.I = qcbVar2;
        this.f = aheyVar;
        this.g = zvlVar;
        this.G = roqVar;
        this.e = undVar;
        this.h = upzVar;
        une uneVar = new une();
        uneVar.d(false);
        uneVar.h(false);
        uneVar.e(1.0f);
        uneVar.f(false);
        uneVar.a(false);
        uneVar.g(true);
        uneVar.b(false);
        uneVar.c(false);
        ufs ufsVar2 = ufs.CREATION_FLOW_UNKNOWN;
        uneVar.h = ufsVar2;
        if ((upzVar.b & 64) != 0) {
            uneVar.d(upzVar.i);
        }
        if ((upzVar.b & SemanticState.Focused) != 0) {
            uneVar.e(upzVar.j);
        }
        if ((upzVar.b & SemanticState.Hidden) != 0) {
            uneVar.f(upzVar.k);
        }
        if ((upzVar.b & SemanticState.LiveRegion) != 0) {
            uneVar.a(upzVar.l);
        }
        if ((upzVar.b & SemanticState.ReadOnly) != 0) {
            uneVar.g(upzVar.m);
        }
        if ((upzVar.b & SemanticState.Obscured) != 0) {
            uneVar.h(upzVar.n);
        }
        if ((upzVar.b & 16) != 0) {
            uneVar.b(true);
        }
        int i = upzVar.b;
        if ((i & SemanticState.Multiline) != 0) {
            switch (upzVar.o) {
                case 0:
                    break;
                case 1:
                    ufsVar2 = ufs.CREATION_FLOW_SHORTS;
                    break;
                case 2:
                default:
                    ufsVar2 = null;
                    break;
                case 3:
                    ufsVar2 = ufs.CREATION_FLOW_IMAGE_POSTS;
                    break;
                case 4:
                    ufsVar2 = ufs.CREATION_FLOW_VIDEO_THUMBNAIL;
                    break;
                case 5:
                    ufsVar2 = ufs.CREATION_FLOW_IMMERSIVE_LIVE;
                    break;
                case 6:
                    ufsVar2 = ufs.CREATION_FLOW_PRODUCT_STICKER;
                    break;
                case 7:
                    ufsVar2 = ufs.CREATION_FLOW_CUSTOM_PLAYLIST_THUMBNAIL;
                    break;
                case 8:
                    ufsVar2 = ufs.CREATION_FLOW_COMMON;
                    break;
                case 9:
                    ufsVar2 = ufs.CREATION_FLOW_RECOMPOSITION;
                    break;
            }
            uneVar.h = ufsVar2 == null ? ufs.UNRECOGNIZED : ufsVar2;
        }
        if ((i & 16384) != 0) {
            uneVar.c(upzVar.p);
        }
        if ((upzVar.b & 32768) != 0) {
            uqc uqcVar = upzVar.q;
            uneVar.j = uqcVar == null ? uqc.a : uqcVar;
        }
        if (uneVar.k == -1 && (ufsVar = uneVar.h) != null) {
            this.i = new unb(uneVar.a, uneVar.b, uneVar.c, uneVar.d, uneVar.e, uneVar.f, uneVar.g, ufsVar, null, uneVar.i, uneVar.j);
            this.H = zfVar;
            this.q = uncVar;
            this.k = wbzVar;
            this.l = zwhVar;
            this.j = vfqVar;
            this.E = vxzVar;
            this.m = adxjVar;
            this.n = ((vxz) aaokVar.b).l(440, 45732837L, false);
            this.o = ((vxz) aaokVar.b).l(598, 45838201L, false);
            this.p = adhvVar;
            this.r = optional;
            this.s = aeezVar;
            Collection.EL.stream(xscVar2.c).map(new rhk(xscVar2, 19)).forEach(new rew(xscVar2, new unt(upzVar), 9));
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((uneVar.k & 1) == 0) {
            sb.append(" isProductAvailable");
        }
        if ((uneVar.k & 2) == 0) {
            sb.append(" previewAspectRatio");
        }
        if ((uneVar.k & 4) == 0) {
            sb.append(" shouldCropImage");
        }
        if ((uneVar.k & 8) == 0) {
            sb.append(" allowEditingAnimatedImageAsStaticImage");
        }
        if ((uneVar.k & 16) == 0) {
            sb.append(" showThumbnailList");
        }
        if ((uneVar.k & 32) == 0) {
            sb.append(" useIconForDoneButton");
        }
        if ((uneVar.k & 64) == 0) {
            sb.append(" isAiEditingEnabled");
        }
        if (uneVar.h == null) {
            sb.append(" creationFlow");
        }
        if ((uneVar.k & 128) == 0) {
            sb.append(" isFullscreenImage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    private final ListenableFuture k() {
        unj unjVarB = b();
        if (unjVarB == null) {
            return ahng.m(new IllegalStateException("getCurrentImageEditorFragment() is null"));
        }
        return taf.a(this.a, ahno.as(ape.f(new sdf(unjVarB, 6)), new qmu(unjVarB, 18), this.d), new sdp(5));
    }

    public final Uri a(Uri uri) {
        vfb vfbVarA = this.e.a(uri);
        File fileL = vfbVarA != null ? vfbVarA.l() : null;
        if (fileL == null) {
            return (!this.w.containsKey(uri) || ((uqa) this.w.get(uri)).c.isEmpty()) ? uri : Uri.parse(((uqa) this.w.get(uri)).c);
        }
        uns unsVar = this.a;
        return avh.a(unsVar.requireActivity(), nsj.n(unsVar.requireActivity()), fileL);
    }

    public final unj b() {
        if (this.E.m(76, 45834183L)) {
            uns unsVar = this.a;
            if (!unsVar.isAdded() || unsVar.isDetached()) {
                return null;
            }
        }
        return (unj) this.a.getChildFragmentManager().g("single_image_editor_fragment");
    }

    public final void c(boolean z) {
        Optional optional = this.x;
        ica icaVar = new ica(this, z, 2);
        if (true == optional.isPresent()) {
            ((uoa) icaVar.b).e(icaVar.a && ((unr) optional.get()).c());
        }
        if (i()) {
            this.r.isPresent();
        }
        GreenScreenMediaPickerView greenScreenMediaPickerView = (GreenScreenMediaPickerView) this.a.requireView().findViewById(R.id.green_screen_media_picker_view);
        if (greenScreenMediaPickerView != null) {
            greenScreenMediaPickerView.setVisibility((z && this.i.e) ? 0 : 8);
        }
    }

    public final void d(vfb vfbVar) {
        ListenableFuture listenableFutureR;
        qtt qttVar = vfbVar.c;
        if (qttVar == null) {
            listenableFutureR = ahng.n(Boolean.FALSE);
        } else {
            qtu qtuVar = qttVar.a;
            Parcel parcelObtain = Parcel.obtain();
            qtuVar.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            qtt qttVar2 = new qtt((qtu) qtu.CREATOR.createFromParcel(parcelObtain), qttVar.b);
            auij auijVar = vfbVar.b;
            vex vexVar = vfbVar.d;
            vey veyVar = vfbVar.e;
            vfbVar.m = new vez(qttVar2, auijVar, vexVar);
            if (vfbVar.f) {
                listenableFutureR = ahng.n(Boolean.FALSE);
            } else {
                listenableFutureR = ahng.r(afwl.j(new tsp(vfbVar, 10)), this.f);
            }
        }
        taf.k(this.a, listenableFutureR, new tvj(this, 18), new jco(12));
    }

    public final void e(boolean z) {
        unj unjVarB;
        View view;
        View viewFindViewById;
        View view2 = this.a.getView();
        if (view2 != null) {
            vxz vxzVar = this.E;
            int i = 1;
            if (vxzVar.l(66, 45751991L, false) && (unjVarB = b()) != null && (view = unjVarB.getView()) != null && (viewFindViewById = view.findViewById(R.id.ai_image_editor_button)) != null) {
                viewFindViewById.setOnClickListener(new uit(this, 4));
                viewFindViewById.setVisibility(true != z ? 8 : 0);
            }
            MediaGenInputView mediaGenInputView = (MediaGenInputView) view2.findViewById(R.id.media_gen_image_editor);
            if (mediaGenInputView == null) {
                if (!z) {
                    return;
                } else {
                    z = true;
                }
            }
            if (mediaGenInputView == null && (mediaGenInputView = (MediaGenInputView) ((ViewStub) view2.findViewById(R.id.media_gen_image_editor_entry_stub)).inflate()) != null) {
                unj unjVarB2 = b();
                if (unjVarB2 != null) {
                    mediaGenInputView.peer().t(unjVarB2.peer().t);
                }
                mediaGenInputView.peer().n = new tsd(this, 13);
                mediaGenInputView.peer().j(new uow(this, i));
                upo upoVarPeer = mediaGenInputView.peer();
                upz upzVar = this.h;
                apgr apgrVar = upzVar.h;
                if (apgrVar == null) {
                    apgrVar = apgr.a;
                }
                alay alayVar = apgrVar.d;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                upoVarPeer.g(alayVar);
                upo upoVarPeer2 = mediaGenInputView.peer();
                apgr apgrVar2 = upzVar.h;
                if (apgrVar2 == null) {
                    apgrVar2 = apgr.a;
                }
                apgz apgzVar = apgrVar2.f;
                if (apgzVar == null) {
                    apgzVar = apgz.a;
                }
                upoVarPeer2.k(apgzVar);
            }
            mediaGenInputView.setVisibility((!z || vxzVar.l(66, 45751991L, false)) ? 8 : 0);
            if (this.i.j) {
                upo upoVarPeer3 = mediaGenInputView.peer();
                upoVarPeer3.k = true;
                upoVarPeer3.l(true);
            }
        }
    }

    public final void f() {
        if (this.E.l(56, 45726969L, false)) {
            unj unjVarB = b();
            unjVarB.getClass();
            unjVarB.peer().t.k(xhb.b(22156)).d();
        }
        if (this.u) {
            return;
        }
        this.u = true;
        tvj tvjVar = new tvj(this, 19);
        unj unjVarB2 = b();
        unjVarB2.getClass();
        unjVarB2.peer().j(new svm(this, tvjVar, 11));
    }

    public final void g(final Uri uri) {
        Uri uriA;
        if (this.t) {
            return;
        }
        Uri uri2 = this.C;
        if (uri2 == null || !uri2.equals(uri)) {
            final uqa uqaVar = (uqa) this.w.get(uri);
            if (uqaVar == null) {
                zvl zvlVar = this.g;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 70;
                zvjVarA.i = 278;
                zvjVarA.d("Error: Image URI not found in input map: ".concat(String.valueOf(String.valueOf(uri))));
                zvlVar.a(zvjVarA.a());
                return;
            }
            int i = 1;
            this.t = true;
            Uri uri3 = this.C;
            final boolean z = uri3 == null;
            if (z) {
                uriA = null;
            } else {
                uri3.getClass();
                uriA = a(uri3);
            }
            final Uri uri4 = uriA;
            taf.k(this.a, b() != null ? k() : ahng.n(Boolean.TRUE), new uny(this, i), new twi() { // from class: unv
                /* JADX WARN: Code duplicated, block: B:23:0x0064  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.twi
                public final void a(Object obj) {
                    Duration durationAw;
                    Uri uriA2;
                    aljj aljjVarA;
                    aljj aljjVar;
                    uji ujiVar;
                    boolean zC;
                    MediaGenInputView mediaGenInputView;
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    boolean zBooleanValue = bool.booleanValue();
                    uoa uoaVar = this.a;
                    if (!zBooleanValue) {
                        zvl zvlVar2 = uoaVar.g;
                        zvj zvjVarA2 = zvk.a();
                        zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
                        zvjVarA2.j = 70;
                        zvjVarA2.i = 278;
                        zvjVarA2.d("Error saving edits");
                        zvlVar2.a(zvjVarA2.a());
                        uoaVar.t = false;
                        return;
                    }
                    uns unsVar = uoaVar.a;
                    if (unsVar.getView() != null && (mediaGenInputView = (MediaGenInputView) unsVar.requireView().findViewById(R.id.media_gen_image_editor)) != null) {
                        mediaGenInputView.peer().h("", false);
                    }
                    uqa uqaVar2 = uqaVar;
                    wbz wbzVar = uoaVar.k;
                    zwh zwhVar = uoaVar.l;
                    boolean z2 = uqaVar2.d;
                    wbzVar.b(zwhVar.hw());
                    byte[] bArr = null;
                    Object[] objArr = 0;
                    if (uoaVar.i()) {
                        upz upzVar = uoaVar.h;
                        anmy anmyVar = upzVar.f;
                        if (anmyVar == null) {
                            anmyVar = anmy.a;
                        }
                        if ((anmyVar.b & 2) != 0) {
                            anmy anmyVar2 = upzVar.f;
                            if (anmyVar2 == null) {
                                anmyVar2 = anmy.a;
                            }
                            aigu aiguVar = anmyVar2.c;
                            if (aiguVar == null) {
                                aiguVar = aigu.a;
                            }
                            durationAw = ahng.aw(aiguVar);
                        } else {
                            durationAw = null;
                        }
                    } else {
                        durationAw = null;
                    }
                    Uri uri5 = uri;
                    und undVar = uoaVar.e;
                    unf unfVar = uoaVar.i;
                    vfb vfbVarB = undVar.b(uri5, unfVar.b, unfVar.j, z2, durationAw);
                    uoaVar.j.c(vfbVarB);
                    if (!vfbVarB.v()) {
                        uoaVar.d(vfbVarB);
                    }
                    dd childFragmentManager = unsVar.getChildFragmentManager();
                    affd affdVar = uoaVar.b;
                    boolean z3 = !uqaVar2.e;
                    ajwo ajwoVar = uoaVar.h.e;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    unj unjVar = new unj();
                    auom.f(unjVar);
                    afpu.e(unjVar, affdVar);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("input_image_uri", uri5);
                    bundle.putBoolean("input_image_uri_is_external", z2);
                    bundle.putBoolean("is_editing_enabled", z3);
                    if (ajwoVar != null) {
                        bundle.putParcelable("navigation_endpoint", new ProtoParsers$InternalDontUse(null, ajwoVar));
                    }
                    bundle.putParcelable("image_editor_config", unfVar);
                    unjVar.setArguments(bundle);
                    afpu.e(unjVar, affdVar);
                    av avVar = new av(childFragmentManager);
                    avVar.q(R.id.single_image_editor, unjVar, "single_image_editor_fragment");
                    avVar.e();
                    Optional optional = uoaVar.x;
                    sda sdaVar = new sda(uoaVar, uri5, 5, bArr);
                    if (true == optional.isPresent()) {
                        Object obj2 = optional.get();
                        Object obj3 = sdaVar.b;
                        Object obj4 = sdaVar.a;
                        Object obj5 = ((unr) obj2).e;
                        uoa uoaVar2 = (uoa) obj3;
                        Context context = uoaVar2.a.getContext();
                        synchronized (obj5) {
                            ((unr) obj2).a = !nuo.m(context, (Uri) obj4) && ("image/png".equals(nuo.k(context, (Uri) obj4)) || "image/jpeg".equals(nuo.k(context, (Uri) obj4)));
                            ((unr) obj2).b = true;
                            ((unr) obj2).c = false;
                            ((unr) obj2).d = true;
                            zC = ((unr) obj2).c();
                        }
                        uoaVar2.e(zC);
                    }
                    boolean z4 = z;
                    unjVar.peer().o = uoaVar;
                    if (z4) {
                        uriA2 = null;
                    } else {
                        Uri uri6 = uoaVar.C;
                        uri6.getClass();
                        uriA2 = uoaVar.a(uri6);
                    }
                    if (z4) {
                        aljjVar = null;
                    } else {
                        Uri uri7 = uoaVar.C;
                        uri7.getClass();
                        if (uoaVar.i.j) {
                            uqa uqaVar3 = (uqa) uoaVar.w.get(uri7);
                            uqaVar3.getClass();
                            aljjVar = uqaVar3.f;
                            if (aljjVar == null) {
                                aljjVar = aljj.a;
                            }
                        } else {
                            vfb vfbVarA = uoaVar.e.a(uri7);
                            if (vfbVarA == null || vfbVarA.c() == null) {
                                aljjVarA = null;
                            } else {
                                ukh ukhVarC = vfbVarA.c();
                                ukhVarC.getClass();
                                aljjVarA = ulr.a(ukhVarC);
                            }
                            if (aljjVarA == null) {
                                uqa uqaVar4 = (uqa) uoaVar.w.get(uri7);
                                uqaVar4.getClass();
                                aljjVar = uqaVar4.f;
                                if (aljjVar == null) {
                                    aljjVar = aljj.a;
                                }
                            } else {
                                aljjVar = aljjVarA;
                            }
                        }
                    }
                    if (uoaVar.B != null) {
                        Uri uri8 = uri4;
                        Uri uriA3 = uoaVar.a(uri5);
                        vda vdaVar = uoaVar.B;
                        vdaVar.getClass();
                        if (uri8 != null) {
                            uriA2.getClass();
                            int i2 = 0;
                            while (true) {
                                ArrayList arrayList = vdaVar.g;
                                arrayList.getClass();
                                if (i2 >= arrayList.size()) {
                                    ujiVar = null;
                                    i2 = -1;
                                    break;
                                } else {
                                    ujiVar = (uji) vdaVar.g.get(i2);
                                    if (ujiVar.b.equals(uri8)) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            if (i2 == -1 || ujiVar == null) {
                                throw new IllegalArgumentException("Failed to find media with uri: ".concat(uri8.toString()));
                            }
                            ujh ujhVar = new ujh(ujiVar);
                            ujhVar.j(uriA2);
                            if (aljjVar != null) {
                                ujhVar.b = aljjVar;
                            }
                            uji ujiVarA = ujhVar.a();
                            HashMap map = vdaVar.e;
                            xsc xscVar = (xsc) map.remove(ujiVar);
                            xscVar.getClass();
                            map.put(ujiVarA, xscVar);
                            HashMap map2 = vdaVar.f;
                            map2.remove(ujiVar.b);
                            map2.put(ujiVarA.b, ujiVarA);
                            ArrayList arrayList2 = vdaVar.g;
                            arrayList2.getClass();
                            arrayList2.set(i2, ujiVarA);
                            jip jipVar = new jip((Object) vdaVar, (Object) ujiVarA, 18, (char[]) (objArr == true ? 1 : 0));
                            View view = (View) xscVar.a;
                            view.setOnClickListener(jipVar);
                            vdaVar.d(ujiVarA, view);
                            Map map3 = uoaVar.z;
                            Uri uri9 = (Uri) map3.remove(uri8);
                            uri9.getClass();
                            map3.put(uriA2, uri9);
                        }
                        vda vdaVar2 = uoaVar.B;
                        uji ujiVar2 = (uji) vdaVar2.f.get(uriA3);
                        xsc xscVar2 = vdaVar2.o;
                        if (xscVar2 != null) {
                            xscVar2.r();
                        }
                        HashMap map4 = vdaVar2.e;
                        Iterator it = map4.values().iterator();
                        while (it.hasNext()) {
                            ((xsc) it.next()).r();
                        }
                        Iterator it2 = map4.values().iterator();
                        while (it2.hasNext()) {
                            ((uhy) ((xsc) it2.next()).c).a();
                        }
                        xsc xscVar3 = ujiVar2 == null ? vdaVar2.o : (xsc) map4.get(ujiVar2);
                        if (xscVar3 == null && ujiVar2 != null) {
                            View viewE = vdaVar2.e(ujiVar2);
                            if (viewE != null) {
                                ViewGroup viewGroup = vdaVar2.c;
                                viewGroup.addView(viewE, viewGroup.getChildCount() - vdaVar2.i.size());
                            }
                            xscVar3 = (xsc) map4.get(ujiVar2);
                        }
                        if (xscVar3 != null) {
                            Object obj6 = xscVar3.b;
                            if (obj6 != null) {
                                ((View) obj6).setVisibility(0);
                            }
                            if (xscVar3 != vdaVar2.o) {
                                View view2 = (View) xscVar3.a;
                                view2.getViewTreeObserver().addOnGlobalLayoutListener(new vcx(vdaVar2, vdaVar2.getClass().getSimpleName(), view2));
                            }
                        }
                    }
                    uoaVar.C = uri5;
                    uoaVar.t = false;
                }
            });
        }
    }

    public final boolean h() {
        return (this.h.b & 16) != 0;
    }

    public final boolean i() {
        return (this.h.b & 2) != 0;
    }

    public final void j() {
        if (this.v) {
            return;
        }
        this.v = true;
        taf.k(this.a, k(), new tvj(this, 17), new twi() { // from class: unu
            @Override // defpackage.twi
            public final void a(Object obj) {
                qtt qttVar;
                Uri uriA;
                uoa uoaVar = this.a;
                Boolean bool = (Boolean) obj;
                int i = 278;
                int i2 = 70;
                boolean z = false;
                if (bool == null || !bool.booleanValue()) {
                    zvl zvlVar = uoaVar.g;
                    zvj zvjVarA = zvk.a();
                    zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                    zvjVarA.j = 70;
                    zvjVarA.i = 278;
                    zvjVarA.d("Error saving edits");
                    zvlVar.a(zvjVarA.a());
                } else {
                    char c = 4;
                    agjz agjzVar = new agjz(4);
                    Iterator it = uoaVar.h.c.iterator();
                    while (it.hasNext()) {
                        uqa uqaVar = (uqa) it.next();
                        Uri uri = Uri.parse(uqaVar.b);
                        aihf aihfVarCreateBuilder = uqb.a.createBuilder();
                        String string = uri.toString();
                        aihfVarCreateBuilder.copyOnWrite();
                        uqb uqbVar = (uqb) aihfVarCreateBuilder.instance;
                        string.getClass();
                        uqbVar.c = string;
                        vfb vfbVarA = uoaVar.e.a(uri);
                        if (vfbVarA != null) {
                            if (vfbVarA.l() != null) {
                                cf cfVarRequireActivity = uoaVar.a.requireActivity();
                                if (vfbVarA.n == null) {
                                    vfbVarA.p(ajtv.ERROR_LEVEL_ERROR, "ImageProjectState: commitFinalOutputs called without staging state", null);
                                } else if (vfbVarA.m().renameTo(vfbVarA.i())) {
                                    vxz vxzVar = vfbVarA.o;
                                    boolean z2 = (vxzVar.l(63, 45750808L, z) && vfbVarA.t()) ? true : z;
                                    if (vxzVar.l(60, 45735895L, z) && vfbVarA.u() && !z2 && (qttVar = vfbVarA.c) != null) {
                                        vfbVarA.l = z;
                                        try {
                                            if (vxzVar.l(63, 45750808L, z)) {
                                                vex vexVar = vfbVarA.d;
                                                vexVar.getClass();
                                                uriA = vexVar.a;
                                            } else {
                                                uriA = tyu.a(vfbVarA.i().getAbsolutePath());
                                            }
                                            vfbVarA.c = new qtt(qttVar.a, vfbVarA.b(cfVarRequireActivity, uriA, z));
                                        } catch (Exception e) {
                                            vfbVarA.p(ajtv.ERROR_LEVEL_ERROR, "ImageProjectState: commitFinalOutputs failed to get metadata of image", e);
                                        }
                                    }
                                    vfa vfaVar = vfbVarA.n;
                                    vfaVar.getClass();
                                    vfbVarA.k = Optional.ofNullable(vfaVar.a);
                                    qtt qttVar2 = vfbVarA.c;
                                    if (qttVar2 != null) {
                                        vfa vfaVar2 = vfbVarA.n;
                                        vfaVar2.getClass();
                                        ukh ukhVar = vfaVar2.b;
                                        if (ukhVar != null) {
                                            qttVar2.f(ukhVar.b, ukhVar.d);
                                            vfbVarA.c.e(ukhVar.a, ukhVar.c);
                                        }
                                    }
                                    vfbVarA.n = null;
                                    uns unsVar = uoaVar.a;
                                    String string2 = avh.a(unsVar.requireActivity(), nsj.n(unsVar.requireActivity()), vfbVarA.i()).toString();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    uqb uqbVar2 = (uqb) aihfVarCreateBuilder.instance;
                                    string2.getClass();
                                    uqbVar2.d = string2;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    ((uqb) aihfVarCreateBuilder.instance).g = true;
                                    uoaVar.d(vfbVarA);
                                } else {
                                    vfbVarA.p(ajtv.ERROR_LEVEL_ERROR, "ImageProjectState: commitFinalOutputs failed to rename staging file", null);
                                }
                                zvl zvlVar2 = uoaVar.g;
                                zvj zvjVarA2 = zvk.a();
                                zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
                                zvjVarA2.j = i2;
                                zvjVarA2.i = i;
                                zvjVarA2.d("Error committing final outputs");
                                zvlVar2.a(zvjVarA2.a());
                            }
                            if (vfbVarA.k.isPresent()) {
                                akqy akqyVar = (akqy) vfbVarA.k.get();
                                aihfVarCreateBuilder.copyOnWrite();
                                uqb uqbVar3 = (uqb) aihfVarCreateBuilder.instance;
                                uqbVar3.f = akqyVar;
                                uqbVar3.b |= 2;
                            }
                            qtt qttVar3 = vfbVarA.c;
                            if (qttVar3 != null && !uoaVar.i.j) {
                                int i3 = ulr.a;
                                ukg ukgVar = new ukg();
                                ukgVar.c((float) qttVar3.b());
                                ukgVar.e((float) qttVar3.d());
                                ukgVar.d((float) qttVar3.c());
                                ukgVar.b((float) qttVar3.a());
                                aljj aljjVarA = ulr.a(ukgVar.a());
                                aihfVarCreateBuilder.copyOnWrite();
                                uqb uqbVar4 = (uqb) aihfVarCreateBuilder.instance;
                                aljjVarA.getClass();
                                uqbVar4.e = aljjVarA;
                                uqbVar4.b |= 1;
                            }
                            if (vfbVarA.f() != null) {
                                aigj aigjVarF = vfbVarA.f();
                                aigjVarF.getClass();
                                aihfVarCreateBuilder.copyOnWrite();
                                uqb uqbVar5 = (uqb) aihfVarCreateBuilder.instance;
                                uqbVar5.b |= 4;
                                uqbVar5.h = aigjVarF;
                            }
                        } else {
                            c = c;
                            it = it;
                            uqaVar = uqaVar;
                        }
                        if (yno.D(((uqb) aihfVarCreateBuilder.instance).d)) {
                            uqa uqaVar2 = uqaVar;
                            String string3 = yno.D(uqaVar2.c) ? uri.toString() : uqaVar2.c;
                            aihfVarCreateBuilder.copyOnWrite();
                            uqb uqbVar6 = (uqb) aihfVarCreateBuilder.instance;
                            string3.getClass();
                            uqbVar6.d = string3;
                        }
                        agjzVar.h((uqb) aihfVarCreateBuilder.build());
                        i = 278;
                        i2 = 70;
                        c = c;
                        it = it;
                        z = false;
                    }
                    if (uoaVar.i() && uoaVar.E.h(1, 45851797L).b.size() > 0) {
                        uoaVar.r.isPresent();
                    }
                    unz unzVar = uoaVar.A;
                    if (unzVar != null) {
                        agke agkeVarG = agjzVar.g();
                        vea veaVar = (vea) unzVar;
                        if (!veaVar.l) {
                            veaVar.l = true;
                            veaVar.g(true);
                            veaVar.h = Uri.parse(((uqb) agkeVarG.get(0)).d);
                            xte xteVar = veaVar.m;
                            String str = veaVar.i.e;
                            Uri uri2 = veaVar.h;
                            uri2.getClass();
                            xteVar.h(str, uri2);
                            ((HashMap) veaVar.d.a).remove(Uri.parse(((uqb) agkeVarG.get(0)).c));
                        }
                    }
                }
                uoaVar.v = false;
            }
        });
    }
}
