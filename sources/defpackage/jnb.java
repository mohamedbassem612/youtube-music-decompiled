package defpackage;

import android.widget.FrameLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.chipcloud.ChipCloudChipView;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jnb implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jnb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v53, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v54, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        xir xirVar;
        jni jniVar;
        Object obj2;
        boolean zC;
        anzw anzwVarA;
        aqmh aqmhVar = null;
        int i = 0;
        switch (this.$cid) {
            case 0:
                aorw aorwVar = ((wgi) obj).g;
                if (aorwVar != null && (aorwVar.c & 131072) != 0) {
                    apji apjiVar = aorwVar.i;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(ajtd.b);
                    apjiVar.c(aihlVarCheckIsLite);
                    if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                        Object obj3 = this.a;
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajtd.b);
                        apjiVar.c(aihlVarCheckIsLite2);
                        Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                        ajsy ajsyVar = (ajsy) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                        jnc jncVar = (jnc) ((jnd) obj3).a;
                        if (!Optional.of(ajsyVar).equals(jncVar.m)) {
                            jncVar.m = Optional.of(ajsyVar);
                            jncVar.e();
                        }
                    }
                    break;
                }
                break;
            case 1:
                ibh ibhVar = (ibh) obj;
                jnc jncVar2 = (jnc) ((jnd) this.a).a;
                boolean zL = hwz.l(jncVar2.l);
                boolean zL2 = hwz.l(ibhVar);
                jncVar2.l = ibhVar;
                if (zL != zL2) {
                    ChipCloudChipView chipCloudChipView = jncVar2.i;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) chipCloudChipView.getLayoutParams();
                    if (layoutParams != null) {
                        if (!zL2) {
                            layoutParams.setMargins(chipCloudChipView.getResources().getDimensionPixelSize(R.dimen.mdx_chip_cloud_chip_audio_side_margin), 0, chipCloudChipView.getResources().getDimensionPixelSize(R.dimen.mdx_chip_cloud_chip_audio_side_margin), chipCloudChipView.getResources().getDimensionPixelSize(R.dimen.mdx_chip_cloud_chip_bottom_margin));
                        } else {
                            layoutParams.setMargins(chipCloudChipView.getResources().getDimensionPixelSize(R.dimen.mdx_chip_cloud_chip_video_left_margin), 0, chipCloudChipView.getResources().getDimensionPixelSize(R.dimen.mdx_chip_cloud_chip_video_right_margin), chipCloudChipView.getResources().getDimensionPixelSize(R.dimen.mdx_chip_cloud_chip_bottom_margin));
                        }
                    }
                }
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                jnc jncVar3 = (jnc) ((jnd) this.a).a;
                if (jncVar3.j != zBooleanValue) {
                    jncVar3.j = zBooleanValue;
                    jncVar3.e();
                }
                break;
            case 3:
                boolean zB = ((hww) obj).b(hww.c);
                jnc jncVar4 = (jnc) ((jnd) this.a).a;
                if (jncVar4.k != zB) {
                    jncVar4.k = zB;
                    jncVar4.e();
                }
                break;
            case 4:
                ((jnc) ((jnd) this.a).a).e();
                break;
            case 5:
                ((jnd) this.a).handleYouTubePlayerStateEvent((aazn) obj);
                break;
            case 6:
                ((jnd) this.a).handleSequencerStageEvent((aayw) obj);
                break;
            case 7:
                ((jnd) this.a).handlePlaybackServiceException((aboe) obj);
                break;
            case 8:
                boolean zK = hwz.k((ibh) obj);
                WatchFragment watchFragment = (WatchFragment) this.a;
                hyt hytVar = watchFragment.x;
                hytVar.f = zK;
                hytVar.h.g(hytVar.e());
                hwc hwcVar = watchFragment.z;
                if (hwcVar.t != zK || !hwcVar.u) {
                    hwcVar.u = true;
                    hwcVar.t = zK;
                    if (zK) {
                        hwcVar.E.d = null;
                        hwcVar.N.b(false);
                    } else {
                        hwcVar.E.d = hwcVar.N;
                    }
                    if (hwcVar.o) {
                        hwcVar.C();
                    }
                    hwcVar.K();
                    hwcVar.j();
                }
                break;
            case 9:
                boolean zC2 = ((aazn) obj).c();
                WatchFragment watchFragment2 = (WatchFragment) ((igp) this.a).a;
                watchFragment2.ab = zC2;
                watchFragment2.i();
                watchFragment2.e();
                break;
            case 10:
                aayw aaywVar = (aayw) obj;
                abnw abnwVar = aaywVar.b;
                Object obj4 = this.a;
                if (abnwVar == abnw.a) {
                    WatchFragment watchFragment3 = (WatchFragment) ((igp) obj4).a;
                    watchFragment3.z.A("");
                    watchFragment3.z.n("");
                }
                wjf wjfVar = aaywVar.c;
                if (wjfVar != null) {
                    WatchFragment watchFragment4 = (WatchFragment) ((igp) obj4).a;
                    if (!wjfVar.equals(watchFragment4.Z)) {
                        watchFragment4.Z = wjfVar;
                        watchFragment4.i();
                    }
                }
                if (abnwVar.b(abnw.d)) {
                    if (wjfVar != null && (xirVar = ((WatchFragment) ((igp) obj4).a).K.a) != null) {
                        xirVar.n("wl");
                    }
                    WatchFragment watchFragment5 = (WatchFragment) ((igp) obj4).a;
                    watchFragment5.j(watchFragment5.aA.ah());
                }
                if (abnwVar == abnw.e) {
                    wgi wgiVar = aaywVar.d;
                    if (wgiVar != null) {
                        WatchFragment watchFragment6 = (WatchFragment) ((igp) obj4).a;
                        xir xirVar2 = watchFragment6.K.a;
                        if (xirVar2 != null) {
                            xirVar2.n("wn_l");
                        }
                        amae amaeVar = wgiVar.a;
                        amag amagVar = amaeVar.o;
                        if (amagVar == null) {
                            amagVar = amag.a;
                        }
                        if (((amagVar.b == 84469052 ? (aqgy) amagVar.c : aqgy.a).b & 16) != 0) {
                            ivo ivoVar = watchFragment6.M;
                            amag amagVar2 = amaeVar.o;
                            if (amagVar2 == null) {
                                amagVar2 = amag.a;
                            }
                            aqgx aqgxVar = (amagVar2.b == 84469052 ? (aqgy) amagVar2.c : aqgy.a).c;
                            if (aqgxVar == null) {
                                aqgxVar = aqgx.a;
                            }
                            ivoVar.a = aqgxVar;
                        }
                    }
                    WatchFragment watchFragment7 = (WatchFragment) ((igp) obj4).a;
                    watchFragment7.j(watchFragment7.aA.ah());
                }
                break;
            case 11:
                wjf wjfVar2 = ((aazj) obj).b;
                if (wjfVar2 != null) {
                    alvq[] alvqVarArrAd = wjfVar2.ad();
                    int length = alvqVarArrAd.length;
                    while (true) {
                        jniVar = (jni) this.a;
                        obj2 = ((jnj) jniVar.a).e;
                        if (i < length) {
                            alvq alvqVar = alvqVarArrAd[i];
                            if ((alvqVar.b & 1) != 0) {
                                amzh amzhVar = alvqVar.c;
                                if (amzhVar == null) {
                                    amzhVar = amzh.a;
                                }
                                zC = ((heg) obj2).c(amzhVar);
                            } else {
                                i++;
                            }
                        } else {
                            zC = ((heg) obj2).c(null);
                        }
                    }
                    if (zC) {
                        jniVar.a((heg) obj2);
                    }
                }
                break;
            case 12:
                aayw aaywVar2 = (aayw) obj;
                if (aaywVar2.b == abnw.e) {
                    Object obj5 = this.a;
                    wgi wgiVar2 = aaywVar2.d;
                    if (wgiVar2 != null) {
                        amae amaeVar2 = wgiVar2.a;
                        amab amabVar = amaeVar2.m;
                        if (amabVar == null) {
                            amabVar = amab.a;
                        }
                        if (amabVar.b == 96907215) {
                            amab amabVar2 = amaeVar2.m;
                            if (amabVar2 == null) {
                                amabVar2 = amab.a;
                            }
                            amzh amzhVar2 = amabVar2.b == 96907215 ? (amzh) amabVar2.c : amzh.a;
                            jni jniVar2 = (jni) obj5;
                            heg hegVar = (heg) ((jnj) jniVar2.a).f;
                            if (hegVar.c(amzhVar2)) {
                                jniVar2.a(hegVar);
                            }
                        }
                    }
                }
                break;
            case 13:
                this.a.invoke(obj);
                break;
            case 14:
                this.a.invoke(obj);
                break;
            case 15:
                jnw jnwVar = (jnw) this.a;
                jnwVar.a();
                jnwVar.e(ahno.Z(((aboe) obj).h));
                break;
            case 16:
                aayw aaywVar3 = (aayw) obj;
                anzw anzwVarP = gzj.P(aaywVar3.e);
                jnw jnwVar2 = (jnw) this.a;
                jnwVar2.h = anzwVarP;
                int iOrdinal = aaywVar3.b.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    jnwVar2.a();
                    jnwVar2.b(jnw.i(aaywVar3), true);
                } else if (iOrdinal == 2) {
                    jnwVar2.a();
                    jnwVar2.b(jnw.i(aaywVar3), false);
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    jnwVar2.g = true;
                    jnwVar2.c(jnw.i(aaywVar3), aaywVar3.d);
                }
                jnwVar2.f = jnw.i(aaywVar3);
                jnwVar2.i = aaywVar3.d;
                break;
            case 17:
                if (((Boolean) obj).booleanValue()) {
                    jnw jnwVar3 = (jnw) this.a;
                    wgi wgiVar3 = jnwVar3.i;
                    if (wgiVar3 == null) {
                        jnwVar3.b(jnwVar3.f, !jnwVar3.g);
                    } else {
                        jnwVar3.f(jnwVar3.f, wgiVar3);
                    }
                }
                break;
            case 18:
                ((jny) this.a).d((iwl) obj);
                break;
            case 19:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                jny jnyVar = (jny) ((jnd) this.a).a;
                jnyVar.m = zBooleanValue2;
                jnyVar.c();
                break;
            default:
                aayw aaywVar4 = (aayw) obj;
                jny jnyVar2 = (jny) ((jnd) this.a).a;
                boolean zL3 = jnyVar2.p.l(129, 45835546L, false);
                wjf wjfVar3 = aaywVar4.c;
                if (zL3) {
                    Optional optionalAh = ((axfd) jnyVar2.i.io()).ah();
                    if (true == optionalAh.isPresent()) {
                        optionalAh = Optional.ofNullable(((hyw) optionalAh.get()).e());
                    }
                    if (true == optionalAh.isPresent() && (((aqmh) optionalAh.get()).b & SemanticState.LiveRegion) == 0) {
                        optionalAh = Optional.empty();
                    }
                    if (optionalAh.isPresent()) {
                        aqmhVar = (aqmh) optionalAh.get();
                    } else if (wjfVar3 != null && (wjfVar3.u().b & 8) != 0) {
                        alvw alvwVar = wjfVar3.u().g;
                        if (alvwVar == null) {
                            alvwVar = alvw.a;
                        }
                        aqmhVar = alvwVar.m;
                        if (aqmhVar == null) {
                            aqmhVar = aqmh.a;
                        }
                    }
                    abnw abnwVar2 = aaywVar4.b;
                    if (abnwVar2.a(abnw.b)) {
                        if (aqmhVar != null && (aqmhVar.b & SemanticState.LiveRegion) != 0) {
                            jnyVar2.e(aqmhVar);
                        }
                    } else if (abnwVar2.a(abnw.e)) {
                        jnyVar2.e(aqmhVar);
                    }
                }
                abnw abnwVar3 = aaywVar4.b;
                if (abnwVar3.a(abnw.b)) {
                    ajwo ajwoVar = aaywVar4.e;
                    if (gzj.P(ajwoVar) != anzw.MUSIC_VIDEO_TYPE_UNKNOWN) {
                        jnyVar2.n = gzj.P(ajwoVar);
                        jnyVar2.c();
                    }
                }
                if (abnwVar3.b(abnw.d) && wjfVar3 != null) {
                    if ((wjfVar3.u().b & 8) != 0) {
                        alvw alvwVar2 = wjfVar3.u().g;
                        if (alvwVar2 == null) {
                            alvwVar2 = alvw.a;
                        }
                        anzwVarA = anzw.a(alvwVar2.p);
                        if (anzwVarA == null) {
                            anzwVarA = anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
                        }
                    } else {
                        anzwVarA = gzj.T(aaywVar4.e) ? anzw.MUSIC_VIDEO_TYPE_ATV : anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
                    }
                    if (anzwVarA != jnyVar2.n) {
                        jnyVar2.n = anzwVarA;
                        jnyVar2.c();
                    }
                    break;
                }
                break;
        }
    }
}
